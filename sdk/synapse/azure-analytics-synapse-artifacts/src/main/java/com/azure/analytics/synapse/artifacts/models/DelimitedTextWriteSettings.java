// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Delimited text write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedTextWriteSettings")
@Fluent
public final class DelimitedTextWriteSettings extends FormatWriteSettings {
    /*
     * Indicates whether string values should always be enclosed with quotes.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "quoteAllText")
    private Object quoteAllText;

    /*
     * The file extension used to create the files. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "fileExtension", required = true)
    private Object fileExtension;

    /*
     * Limit the written file's row count to be smaller than or equal to the
     * specified count. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxRowsPerFile")
    private Object maxRowsPerFile;

    /*
     * Specifies the file name pattern
     * <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file
     * based store without partitionOptions. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "fileNamePrefix")
    private Object fileNamePrefix;

    /**
     * Get the quoteAllText property: Indicates whether string values should always be enclosed with quotes. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the quoteAllText value.
     */
    public Object getQuoteAllText() {
        return this.quoteAllText;
    }

    /**
     * Set the quoteAllText property: Indicates whether string values should always be enclosed with quotes. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param quoteAllText the quoteAllText value to set.
     * @return the DelimitedTextWriteSettings object itself.
     */
    public DelimitedTextWriteSettings setQuoteAllText(Object quoteAllText) {
        this.quoteAllText = quoteAllText;
        return this;
    }

    /**
     * Get the fileExtension property: The file extension used to create the files. Type: string (or Expression with
     * resultType string).
     *
     * @return the fileExtension value.
     */
    public Object getFileExtension() {
        return this.fileExtension;
    }

    /**
     * Set the fileExtension property: The file extension used to create the files. Type: string (or Expression with
     * resultType string).
     *
     * @param fileExtension the fileExtension value to set.
     * @return the DelimitedTextWriteSettings object itself.
     */
    public DelimitedTextWriteSettings setFileExtension(Object fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }

    /**
     * Get the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     *
     * @return the maxRowsPerFile value.
     */
    public Object getMaxRowsPerFile() {
        return this.maxRowsPerFile;
    }

    /**
     * Set the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     *
     * @param maxRowsPerFile the maxRowsPerFile value to set.
     * @return the DelimitedTextWriteSettings object itself.
     */
    public DelimitedTextWriteSettings setMaxRowsPerFile(Object maxRowsPerFile) {
        this.maxRowsPerFile = maxRowsPerFile;
        return this;
    }

    /**
     * Get the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     *
     * @return the fileNamePrefix value.
     */
    public Object getFileNamePrefix() {
        return this.fileNamePrefix;
    }

    /**
     * Set the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     *
     * @param fileNamePrefix the fileNamePrefix value to set.
     * @return the DelimitedTextWriteSettings object itself.
     */
    public DelimitedTextWriteSettings setFileNamePrefix(Object fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
        return this;
    }
}