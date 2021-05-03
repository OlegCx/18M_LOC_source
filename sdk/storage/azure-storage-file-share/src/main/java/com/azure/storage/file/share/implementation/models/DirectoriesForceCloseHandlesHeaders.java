// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The DirectoriesForceCloseHandlesHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class DirectoriesForceCloseHandlesHeaders {
    /*
     * The x-ms-marker property.
     */
    @JsonProperty(value = "x-ms-marker")
    private String xMsMarker;

    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-number-of-handles-closed property.
     */
    @JsonProperty(value = "x-ms-number-of-handles-closed")
    private Integer xMsNumberOfHandlesClosed;

    /*
     * The x-ms-number-of-handles-failed property.
     */
    @JsonProperty(value = "x-ms-number-of-handles-failed")
    private Integer xMsNumberOfHandlesFailed;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the xMsMarker property: The x-ms-marker property.
     *
     * @return the xMsMarker value.
     */
    public String getXMsMarker() {
        return this.xMsMarker;
    }

    /**
     * Set the xMsMarker property: The x-ms-marker property.
     *
     * @param xMsMarker the xMsMarker value to set.
     * @return the DirectoriesForceCloseHandlesHeaders object itself.
     */
    public DirectoriesForceCloseHandlesHeaders setXMsMarker(String xMsMarker) {
        this.xMsMarker = xMsMarker;
        return this;
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the DirectoriesForceCloseHandlesHeaders object itself.
     */
    public DirectoriesForceCloseHandlesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsNumberOfHandlesClosed property: The x-ms-number-of-handles-closed property.
     *
     * @return the xMsNumberOfHandlesClosed value.
     */
    public Integer getXMsNumberOfHandlesClosed() {
        return this.xMsNumberOfHandlesClosed;
    }

    /**
     * Set the xMsNumberOfHandlesClosed property: The x-ms-number-of-handles-closed property.
     *
     * @param xMsNumberOfHandlesClosed the xMsNumberOfHandlesClosed value to set.
     * @return the DirectoriesForceCloseHandlesHeaders object itself.
     */
    public DirectoriesForceCloseHandlesHeaders setXMsNumberOfHandlesClosed(Integer xMsNumberOfHandlesClosed) {
        this.xMsNumberOfHandlesClosed = xMsNumberOfHandlesClosed;
        return this;
    }

    /**
     * Get the xMsNumberOfHandlesFailed property: The x-ms-number-of-handles-failed property.
     *
     * @return the xMsNumberOfHandlesFailed value.
     */
    public Integer getXMsNumberOfHandlesFailed() {
        return this.xMsNumberOfHandlesFailed;
    }

    /**
     * Set the xMsNumberOfHandlesFailed property: The x-ms-number-of-handles-failed property.
     *
     * @param xMsNumberOfHandlesFailed the xMsNumberOfHandlesFailed value to set.
     * @return the DirectoriesForceCloseHandlesHeaders object itself.
     */
    public DirectoriesForceCloseHandlesHeaders setXMsNumberOfHandlesFailed(Integer xMsNumberOfHandlesFailed) {
        this.xMsNumberOfHandlesFailed = xMsNumberOfHandlesFailed;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the DirectoriesForceCloseHandlesHeaders object itself.
     */
    public DirectoriesForceCloseHandlesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the DirectoriesForceCloseHandlesHeaders object itself.
     */
    public DirectoriesForceCloseHandlesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}