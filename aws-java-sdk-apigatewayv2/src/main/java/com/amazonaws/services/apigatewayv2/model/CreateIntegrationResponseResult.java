/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationResponseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     */
    private String contentHandlingStrategy;
    /**
     * <p>
     * The integration response ID.
     * </p>
     */
    private String integrationResponseId;
    /**
     * <p>
     * The integration response key.
     * </p>
     */
    private String integrationResponseKey;
    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the backend. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header
     * name. The mapped non-static value must match the pattern of integration.response.header.{name} or
     * integration.response.body.{JSON-expression}, where name is a valid and unique response header name and
     * JSON-expression is a valid JSON expression without the $ prefix.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;
    /**
     * <p>
     * The collection of response templates for the integration response as a string-to-string map of key-value pairs.
     * Response templates are represented as a key/value map, with a content-type as the key and a template as the
     * value.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;
    /**
     * <p>
     * The template selection expressions for the integration response.
     * </p>
     */
    private String templateSelectionExpression;

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *        Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @see ContentHandlingStrategy
     */

    public void setContentHandlingStrategy(String contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @return Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *         Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *         <p>
     *         CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *         blob.
     *         </p>
     *         <p>
     *         CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *         </p>
     *         <p>
     *         If this property is not defined, the response payload will be passed through from the integration
     *         response to the route response or method response without modification.
     * @see ContentHandlingStrategy
     */

    public String getContentHandlingStrategy() {
        return this.contentHandlingStrategy;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *        Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public CreateIntegrationResponseResult withContentHandlingStrategy(String contentHandlingStrategy) {
        setContentHandlingStrategy(contentHandlingStrategy);
        return this;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *        Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public CreateIntegrationResponseResult withContentHandlingStrategy(ContentHandlingStrategy contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     * 
     * @param integrationResponseId
     *        The integration response ID.
     */

    public void setIntegrationResponseId(String integrationResponseId) {
        this.integrationResponseId = integrationResponseId;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     * 
     * @return The integration response ID.
     */

    public String getIntegrationResponseId() {
        return this.integrationResponseId;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     * 
     * @param integrationResponseId
     *        The integration response ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult withIntegrationResponseId(String integrationResponseId) {
        setIntegrationResponseId(integrationResponseId);
        return this;
    }

    /**
     * <p>
     * The integration response key.
     * </p>
     * 
     * @param integrationResponseKey
     *        The integration response key.
     */

    public void setIntegrationResponseKey(String integrationResponseKey) {
        this.integrationResponseKey = integrationResponseKey;
    }

    /**
     * <p>
     * The integration response key.
     * </p>
     * 
     * @return The integration response key.
     */

    public String getIntegrationResponseKey() {
        return this.integrationResponseKey;
    }

    /**
     * <p>
     * The integration response key.
     * </p>
     * 
     * @param integrationResponseKey
     *        The integration response key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult withIntegrationResponseKey(String integrationResponseKey) {
        setIntegrationResponseKey(integrationResponseKey);
        return this;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the backend. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header
     * name. The mapped non-static value must match the pattern of integration.response.header.{name} or
     * integration.response.body.{JSON-expression}, where name is a valid and unique response header name and
     * JSON-expression is a valid JSON expression without the $ prefix.
     * </p>
     * 
     * @return A key-value map specifying response parameters that are passed to the method response from the backend.
     *         The key is a method response header parameter name and the mapped value is an integration response header
     *         value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *         response body. The mapping key must match the pattern of method.response.header.{name}, where name is a
     *         valid and unique header name. The mapped non-static value must match the pattern of
     *         integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid
     *         and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
     */

    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the backend. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header
     * name. The mapped non-static value must match the pattern of integration.response.header.{name} or
     * integration.response.body.{JSON-expression}, where name is a valid and unique response header name and
     * JSON-expression is a valid JSON expression without the $ prefix.
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying response parameters that are passed to the method response from the backend.
     *        The key is a method response header parameter name and the mapped value is an integration response header
     *        value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *        response body. The mapping key must match the pattern of method.response.header.{name}, where name is a
     *        valid and unique header name. The mapped non-static value must match the pattern of
     *        integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid
     *        and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
     */

    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the backend. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header
     * name. The mapped non-static value must match the pattern of integration.response.header.{name} or
     * integration.response.body.{JSON-expression}, where name is a valid and unique response header name and
     * JSON-expression is a valid JSON expression without the $ prefix.
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying response parameters that are passed to the method response from the backend.
     *        The key is a method response header parameter name and the mapped value is an integration response header
     *        value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *        response body. The mapping key must match the pattern of method.response.header.{name}, where name is a
     *        valid and unique header name. The mapped non-static value must match the pattern of
     *        integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid
     *        and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult withResponseParameters(java.util.Map<String, String> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    /**
     * Add a single ResponseParameters entry
     *
     * @see CreateIntegrationResponseResult#withResponseParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult addResponseParametersEntry(String key, String value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, String>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * The collection of response templates for the integration response as a string-to-string map of key-value pairs.
     * Response templates are represented as a key/value map, with a content-type as the key and a template as the
     * value.
     * </p>
     * 
     * @return The collection of response templates for the integration response as a string-to-string map of key-value
     *         pairs. Response templates are represented as a key/value map, with a content-type as the key and a
     *         template as the value.
     */

    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * The collection of response templates for the integration response as a string-to-string map of key-value pairs.
     * Response templates are represented as a key/value map, with a content-type as the key and a template as the
     * value.
     * </p>
     * 
     * @param responseTemplates
     *        The collection of response templates for the integration response as a string-to-string map of key-value
     *        pairs. Response templates are represented as a key/value map, with a content-type as the key and a
     *        template as the value.
     */

    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * The collection of response templates for the integration response as a string-to-string map of key-value pairs.
     * Response templates are represented as a key/value map, with a content-type as the key and a template as the
     * value.
     * </p>
     * 
     * @param responseTemplates
     *        The collection of response templates for the integration response as a string-to-string map of key-value
     *        pairs. Response templates are represented as a key/value map, with a content-type as the key and a
     *        template as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult withResponseTemplates(java.util.Map<String, String> responseTemplates) {
        setResponseTemplates(responseTemplates);
        return this;
    }

    /**
     * Add a single ResponseTemplates entry
     *
     * @see CreateIntegrationResponseResult#withResponseTemplates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult addResponseTemplatesEntry(String key, String value) {
        if (null == this.responseTemplates) {
            this.responseTemplates = new java.util.HashMap<String, String>();
        }
        if (this.responseTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseTemplates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult clearResponseTemplatesEntries() {
        this.responseTemplates = null;
        return this;
    }

    /**
     * <p>
     * The template selection expressions for the integration response.
     * </p>
     * 
     * @param templateSelectionExpression
     *        The template selection expressions for the integration response.
     */

    public void setTemplateSelectionExpression(String templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expressions for the integration response.
     * </p>
     * 
     * @return The template selection expressions for the integration response.
     */

    public String getTemplateSelectionExpression() {
        return this.templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expressions for the integration response.
     * </p>
     * 
     * @param templateSelectionExpression
     *        The template selection expressions for the integration response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResponseResult withTemplateSelectionExpression(String templateSelectionExpression) {
        setTemplateSelectionExpression(templateSelectionExpression);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContentHandlingStrategy() != null)
            sb.append("ContentHandlingStrategy: ").append(getContentHandlingStrategy()).append(",");
        if (getIntegrationResponseId() != null)
            sb.append("IntegrationResponseId: ").append(getIntegrationResponseId()).append(",");
        if (getIntegrationResponseKey() != null)
            sb.append("IntegrationResponseKey: ").append(getIntegrationResponseKey()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getResponseTemplates() != null)
            sb.append("ResponseTemplates: ").append(getResponseTemplates()).append(",");
        if (getTemplateSelectionExpression() != null)
            sb.append("TemplateSelectionExpression: ").append(getTemplateSelectionExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationResponseResult == false)
            return false;
        CreateIntegrationResponseResult other = (CreateIntegrationResponseResult) obj;
        if (other.getContentHandlingStrategy() == null ^ this.getContentHandlingStrategy() == null)
            return false;
        if (other.getContentHandlingStrategy() != null && other.getContentHandlingStrategy().equals(this.getContentHandlingStrategy()) == false)
            return false;
        if (other.getIntegrationResponseId() == null ^ this.getIntegrationResponseId() == null)
            return false;
        if (other.getIntegrationResponseId() != null && other.getIntegrationResponseId().equals(this.getIntegrationResponseId()) == false)
            return false;
        if (other.getIntegrationResponseKey() == null ^ this.getIntegrationResponseKey() == null)
            return false;
        if (other.getIntegrationResponseKey() != null && other.getIntegrationResponseKey().equals(this.getIntegrationResponseKey()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseTemplates() == null ^ this.getResponseTemplates() == null)
            return false;
        if (other.getResponseTemplates() != null && other.getResponseTemplates().equals(this.getResponseTemplates()) == false)
            return false;
        if (other.getTemplateSelectionExpression() == null ^ this.getTemplateSelectionExpression() == null)
            return false;
        if (other.getTemplateSelectionExpression() != null && other.getTemplateSelectionExpression().equals(this.getTemplateSelectionExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentHandlingStrategy() == null) ? 0 : getContentHandlingStrategy().hashCode());
        hashCode = prime * hashCode + ((getIntegrationResponseId() == null) ? 0 : getIntegrationResponseId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationResponseKey() == null) ? 0 : getIntegrationResponseKey().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        hashCode = prime * hashCode + ((getTemplateSelectionExpression() == null) ? 0 : getTemplateSelectionExpression().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntegrationResponseResult clone() {
        try {
            return (CreateIntegrationResponseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
