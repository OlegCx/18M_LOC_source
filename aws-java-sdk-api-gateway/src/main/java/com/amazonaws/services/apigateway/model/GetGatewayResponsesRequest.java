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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added any
 * definitions for gateway responses, the result will be the API Gateway-generated default <a>GatewayResponses</a>
 * collection for the supported response types.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGatewayResponsesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The current pagination position in the paged result set. The <a>GatewayResponse</a> collection does not support
     * pagination and the position does not apply here.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The
     * <a>GatewayResponses</a> collection does not support pagination and the limit does not apply here.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGatewayResponsesRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The current pagination position in the paged result set. The <a>GatewayResponse</a> collection does not support
     * pagination and the position does not apply here.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set. The <a>GatewayResponse</a> collection does not
     *        support pagination and the position does not apply here.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set. The <a>GatewayResponse</a> collection does not support
     * pagination and the position does not apply here.
     * </p>
     * 
     * @return The current pagination position in the paged result set. The <a>GatewayResponse</a> collection does not
     *         support pagination and the position does not apply here.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set. The <a>GatewayResponse</a> collection does not support
     * pagination and the position does not apply here.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set. The <a>GatewayResponse</a> collection does not
     *        support pagination and the position does not apply here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGatewayResponsesRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The
     * <a>GatewayResponses</a> collection does not support pagination and the limit does not apply here.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The
     *        <a>GatewayResponses</a> collection does not support pagination and the limit does not apply here.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The
     * <a>GatewayResponses</a> collection does not support pagination and the limit does not apply here.
     * </p>
     * 
     * @return The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     *         The <a>GatewayResponses</a> collection does not support pagination and the limit does not apply here.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The
     * <a>GatewayResponses</a> collection does not support pagination and the limit does not apply here.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The
     *        <a>GatewayResponses</a> collection does not support pagination and the limit does not apply here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGatewayResponsesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGatewayResponsesRequest == false)
            return false;
        GetGatewayResponsesRequest other = (GetGatewayResponsesRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetGatewayResponsesRequest clone() {
        return (GetGatewayResponsesRequest) super.clone();
    }

}
