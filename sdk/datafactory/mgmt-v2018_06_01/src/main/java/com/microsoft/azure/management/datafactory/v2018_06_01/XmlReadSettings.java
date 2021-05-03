/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Xml read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = XmlReadSettings.class)
@JsonTypeName("XmlReadSettings")
public class XmlReadSettings extends FormatReadSettings {
    /**
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /**
     * Indicates what validation method is used when reading the xml files.
     * Allowed values: 'none', 'xsd', or 'dtd'. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "validationMode")
    private Object validationMode;

    /**
     * Indicates whether type detection is enabled when reading the xml files.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "detectDataType")
    private Object detectDataType;

    /**
     * Indicates whether namespace is enabled when reading the xml files. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "namespaces")
    private Object namespaces;

    /**
     * Namespace uri to prefix mappings to override the prefixes in column
     * names when namespace is enabled, if no prefix is defined for a namespace
     * uri, the prefix of xml element/attribute name in the xml data file will
     * be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object
     * (or Expression with resultType object).
     */
    @JsonProperty(value = "namespacePrefixes")
    private Object namespacePrefixes;

    /**
     * Get compression settings.
     *
     * @return the compressionProperties value
     */
    public CompressionReadSettings compressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set compression settings.
     *
     * @param compressionProperties the compressionProperties value to set
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
        return this;
    }

    /**
     * Get indicates what validation method is used when reading the xml files. Allowed values: 'none', 'xsd', or 'dtd'. Type: string (or Expression with resultType string).
     *
     * @return the validationMode value
     */
    public Object validationMode() {
        return this.validationMode;
    }

    /**
     * Set indicates what validation method is used when reading the xml files. Allowed values: 'none', 'xsd', or 'dtd'. Type: string (or Expression with resultType string).
     *
     * @param validationMode the validationMode value to set
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withValidationMode(Object validationMode) {
        this.validationMode = validationMode;
        return this;
    }

    /**
     * Get indicates whether type detection is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     *
     * @return the detectDataType value
     */
    public Object detectDataType() {
        return this.detectDataType;
    }

    /**
     * Set indicates whether type detection is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     *
     * @param detectDataType the detectDataType value to set
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withDetectDataType(Object detectDataType) {
        this.detectDataType = detectDataType;
        return this;
    }

    /**
     * Get indicates whether namespace is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     *
     * @return the namespaces value
     */
    public Object namespaces() {
        return this.namespaces;
    }

    /**
     * Set indicates whether namespace is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     *
     * @param namespaces the namespaces value to set
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withNamespaces(Object namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    /**
     * Get namespace uri to prefix mappings to override the prefixes in column names when namespace is enabled, if no prefix is defined for a namespace uri, the prefix of xml element/attribute name in the xml data file will be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression with resultType object).
     *
     * @return the namespacePrefixes value
     */
    public Object namespacePrefixes() {
        return this.namespacePrefixes;
    }

    /**
     * Set namespace uri to prefix mappings to override the prefixes in column names when namespace is enabled, if no prefix is defined for a namespace uri, the prefix of xml element/attribute name in the xml data file will be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression with resultType object).
     *
     * @param namespacePrefixes the namespacePrefixes value to set
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withNamespacePrefixes(Object namespacePrefixes) {
        this.namespacePrefixes = namespacePrefixes;
        return this;
    }

}