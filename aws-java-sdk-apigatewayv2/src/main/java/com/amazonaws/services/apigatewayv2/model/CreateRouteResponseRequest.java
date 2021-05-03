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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new RouteResponse resource to represent a route response.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The model selection expression for the route response. Supported only for WebSocket APIs.
     * </p>
     */
    private String modelSelectionExpression;
    /**
     * <p>
     * The response models for the route response.
     * </p>
     */
    private java.util.Map<String, String> responseModels;
    /**
     * <p>
     * The route response parameters.
     * </p>
     */
    private java.util.Map<String, ParameterConstraints> responseParameters;
    /**
     * <p>
     * The route ID.
     * </p>
     */
    private String routeId;
    /**
     * <p>
     * The route response key.
     * </p>
     */
    private String routeResponseKey;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The model selection expression for the route response. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param modelSelectionExpression
     *        The model selection expression for the route response. Supported only for WebSocket APIs.
     */

    public void setModelSelectionExpression(String modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
    }

    /**
     * <p>
     * The model selection expression for the route response. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return The model selection expression for the route response. Supported only for WebSocket APIs.
     */

    public String getModelSelectionExpression() {
        return this.modelSelectionExpression;
    }

    /**
     * <p>
     * The model selection expression for the route response. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param modelSelectionExpression
     *        The model selection expression for the route response. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest withModelSelectionExpression(String modelSelectionExpression) {
        setModelSelectionExpression(modelSelectionExpression);
        return this;
    }

    /**
     * <p>
     * The response models for the route response.
     * </p>
     * 
     * @return The response models for the route response.
     */

    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * The response models for the route response.
     * </p>
     * 
     * @param responseModels
     *        The response models for the route response.
     */

    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * The response models for the route response.
     * </p>
     * 
     * @param responseModels
     *        The response models for the route response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest withResponseModels(java.util.Map<String, String> responseModels) {
        setResponseModels(responseModels);
        return this;
    }

    /**
     * Add a single ResponseModels entry
     *
     * @see CreateRouteResponseRequest#withResponseModels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest addResponseModelsEntry(String key, String value) {
        if (null == this.responseModels) {
            this.responseModels = new java.util.HashMap<String, String>();
        }
        if (this.responseModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest clearResponseModelsEntries() {
        this.responseModels = null;
        return this;
    }

    /**
     * <p>
     * The route response parameters.
     * </p>
     * 
     * @return The route response parameters.
     */

    public java.util.Map<String, ParameterConstraints> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * The route response parameters.
     * </p>
     * 
     * @param responseParameters
     *        The route response parameters.
     */

    public void setResponseParameters(java.util.Map<String, ParameterConstraints> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * The route response parameters.
     * </p>
     * 
     * @param responseParameters
     *        The route response parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest withResponseParameters(java.util.Map<String, ParameterConstraints> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    /**
     * Add a single ResponseParameters entry
     *
     * @see CreateRouteResponseRequest#withResponseParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest addResponseParametersEntry(String key, ParameterConstraints value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, ParameterConstraints>();
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

    public CreateRouteResponseRequest clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     */

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @return The route ID.
     */

    public String getRouteId() {
        return this.routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest withRouteId(String routeId) {
        setRouteId(routeId);
        return this;
    }

    /**
     * <p>
     * The route response key.
     * </p>
     * 
     * @param routeResponseKey
     *        The route response key.
     */

    public void setRouteResponseKey(String routeResponseKey) {
        this.routeResponseKey = routeResponseKey;
    }

    /**
     * <p>
     * The route response key.
     * </p>
     * 
     * @return The route response key.
     */

    public String getRouteResponseKey() {
        return this.routeResponseKey;
    }

    /**
     * <p>
     * The route response key.
     * </p>
     * 
     * @param routeResponseKey
     *        The route response key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseRequest withRouteResponseKey(String routeResponseKey) {
        setRouteResponseKey(routeResponseKey);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getModelSelectionExpression() != null)
            sb.append("ModelSelectionExpression: ").append(getModelSelectionExpression()).append(",");
        if (getResponseModels() != null)
            sb.append("ResponseModels: ").append(getResponseModels()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getRouteId() != null)
            sb.append("RouteId: ").append(getRouteId()).append(",");
        if (getRouteResponseKey() != null)
            sb.append("RouteResponseKey: ").append(getRouteResponseKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteResponseRequest == false)
            return false;
        CreateRouteResponseRequest other = (CreateRouteResponseRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getModelSelectionExpression() == null ^ this.getModelSelectionExpression() == null)
            return false;
        if (other.getModelSelectionExpression() != null && other.getModelSelectionExpression().equals(this.getModelSelectionExpression()) == false)
            return false;
        if (other.getResponseModels() == null ^ this.getResponseModels() == null)
            return false;
        if (other.getResponseModels() != null && other.getResponseModels().equals(this.getResponseModels()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        if (other.getRouteResponseKey() == null ^ this.getRouteResponseKey() == null)
            return false;
        if (other.getRouteResponseKey() != null && other.getRouteResponseKey().equals(this.getRouteResponseKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getModelSelectionExpression() == null) ? 0 : getModelSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        hashCode = prime * hashCode + ((getRouteResponseKey() == null) ? 0 : getRouteResponseKey().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteResponseRequest clone() {
        return (CreateRouteResponseRequest) super.clone();
    }

}
