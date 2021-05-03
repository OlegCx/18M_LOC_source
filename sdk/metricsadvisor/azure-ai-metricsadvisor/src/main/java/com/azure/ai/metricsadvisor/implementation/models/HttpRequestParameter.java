// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HttpRequestParameter model. */
@Fluent
public final class HttpRequestParameter {
    /*
     * HTTP URL
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * HTTP header
     */
    @JsonProperty(value = "httpHeader", required = true)
    private String httpHeader;

    /*
     * HTTP method
     */
    @JsonProperty(value = "httpMethod", required = true)
    private String httpMethod;

    /*
     * HTTP request body
     */
    @JsonProperty(value = "payload", required = true)
    private String payload;

    /**
     * Get the url property: HTTP URL.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: HTTP URL.
     *
     * @param url the url value to set.
     * @return the HttpRequestParameter object itself.
     */
    public HttpRequestParameter setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the httpHeader property: HTTP header.
     *
     * @return the httpHeader value.
     */
    public String getHttpHeader() {
        return this.httpHeader;
    }

    /**
     * Set the httpHeader property: HTTP header.
     *
     * @param httpHeader the httpHeader value to set.
     * @return the HttpRequestParameter object itself.
     */
    public HttpRequestParameter setHttpHeader(String httpHeader) {
        this.httpHeader = httpHeader;
        return this;
    }

    /**
     * Get the httpMethod property: HTTP method.
     *
     * @return the httpMethod value.
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * Set the httpMethod property: HTTP method.
     *
     * @param httpMethod the httpMethod value to set.
     * @return the HttpRequestParameter object itself.
     */
    public HttpRequestParameter setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * Get the payload property: HTTP request body.
     *
     * @return the payload value.
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * Set the payload property: HTTP request body.
     *
     * @param payload the payload value to set.
     * @return the HttpRequestParameter object itself.
     */
    public HttpRequestParameter setPayload(String payload) {
        this.payload = payload;
        return this;
    }
}