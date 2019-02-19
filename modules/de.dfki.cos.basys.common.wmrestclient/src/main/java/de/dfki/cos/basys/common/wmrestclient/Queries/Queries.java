/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dfki.cos.basys.common.wmrestclient.Queries;

/**
 *
 * @author tosp01
 */
public class Queries {

    public static String AllRivetPositions = "prefix ldp: <http://www.w3.org/ns/ldp#>\n"
            + "prefix dct: <http://purl.org/dc/terms/>\n"
            + "prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
            + "SELECT ?rivetUri ?id ?index WHERE {\n"
            + "?rivetUri dct:hasPart ?rivetComponent ;\n"
            + "dct:identifier ?id .\n"
            + "?rivetComponent dct:identifier \"rivetposition\"^^<xsd:string> ;"
            + "dct:hasPart ?indexAttr ."
            + "?indexAttr dct:identifier 'index'^^<xsd:string>;"
            + "rdf:value ?index ."
            + "FILTER isLiteral(?index)"
            + "}";

    public static String RivetPositionById = "";

    public static String RivetPositionState = "prefix ldp: <http://www.w3.org/ns/ldp#>\n"
            + "prefix dct: <http://purl.org/dc/terms/>\n"
            + "prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
            + "SELECT DISTINCT ?state ?stateUri WHERE { "
            + "?riveturi dct:hasPart ?rivetPositionComponent ;"
            + "dct:identifier \"%s\"^^<xsd:string> ."
            + "?rivetPositionComponent dct:identifier \"rivetposition\"^^<xsd:string> ;"
            + "dct:hasPart ?statusAttribute ."
            + "?statusAttribute dct:identifier \"status\"^^<xsd:string> ;\n"
            + "rdf:value ?state ;\n"
            + "rdf:value ?stateUri ."
            + "FILTER isLiteral(?state)\n"
            + "FILTER isUri(?stateUri)\n"
            + "}";

    public static String RivetPositionParentFrame = "prefix ldp: <http://www.w3.org/ns/ldp#>\n"
            + "prefix dct: <http://purl.org/dc/terms/>\n"
            + "prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
            + "SELECT DISTINCT ?id ?index ?type WHERE { "
            + "?frameUri dct:hasPart ?frameComponent;"
            + "dct:identifier ?id ."
            + "?frameComponent dct:identifier \"frame\"^^<xsd:string> ;"
            + "dct:hasPart ?indexAttr ;"
            + "dct:hasPart ?rivetCollection ;"
            + "dct:hasPart ?frametypeAttr ."
            + "?rivetCollection dct:identifier \"rivetPositions\"^^<xsd:string>; "
            + "ldp:contains <%s>."
            + "?indexAttr dct:identifier \"index\"^^<xsd:string> ;"
            + "rdf:value ?index ."
            + "?typeAttr dct:identifier \"type\"^^<xsd:string> ;"
            + "rdf:value ?type ."
            + "FILTER isLiteral(?index)"
            + "FILTER isLiteral(?type)"
            + "}";

    public static String BySector = "prefix ldp: <http://www.w3.org/ns/ldp#>\n"
            + "prefix dct: <http://purl.org/dc/terms/>\n"
            + "prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
            + "SELECT ?rivetUri ?id ?index WHERE {\n"
            + "?rivetUri dct:hasPart ?rivetComponent ;\n"
            + "dct:identifier ?id .\n"
            + "?rivetComponent dct:identifier 'rivetposition'^^<xsd:string>;\n"
            + "dct:hasPart ?indAttr;\n"
            + "dct:hasPart ?sectorAttr .\n"
            + "?indAttr dct:identifier \"index\"^^<xsd:string> ;\n"
            + "rdf:value ?index .\n"
            + "?sectorAttr dct:identifier \"sector\"^^<xsd:string>;\n"
            + "rdf:value \"%s\"^^<xsd:attributeValue> .\n"
            + "FILTER isLiteral(?index)\n"
            + "}";
}