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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTagValuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * Specifies the tag key for which you want to list all existing values that are currently used in the specified AWS
     * Region for the calling AWS account.
     * </p>
     */
    private String key;

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     * 
     * @param paginationToken
     *        Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want
     *        the next page of results. Leave this parameter empty in your initial request.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     * 
     * @return Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want
     *         the next page of results. Leave this parameter empty in your initial request.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     * 
     * @param paginationToken
     *        Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want
     *        the next page of results. Leave this parameter empty in your initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagValuesRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * Specifies the tag key for which you want to list all existing values that are currently used in the specified AWS
     * Region for the calling AWS account.
     * </p>
     * 
     * @param key
     *        Specifies the tag key for which you want to list all existing values that are currently used in the
     *        specified AWS Region for the calling AWS account.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Specifies the tag key for which you want to list all existing values that are currently used in the specified AWS
     * Region for the calling AWS account.
     * </p>
     * 
     * @return Specifies the tag key for which you want to list all existing values that are currently used in the
     *         specified AWS Region for the calling AWS account.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Specifies the tag key for which you want to list all existing values that are currently used in the specified AWS
     * Region for the calling AWS account.
     * </p>
     * 
     * @param key
     *        Specifies the tag key for which you want to list all existing values that are currently used in the
     *        specified AWS Region for the calling AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagValuesRequest withKey(String key) {
        setKey(key);
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTagValuesRequest == false)
            return false;
        GetTagValuesRequest other = (GetTagValuesRequest) obj;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public GetTagValuesRequest clone() {
        return (GetTagValuesRequest) super.clone();
    }

}
