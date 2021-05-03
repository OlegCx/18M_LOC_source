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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Output returned from the <code>GetDashboardEmbedUrl</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetDashboardEmbedUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDashboardEmbedUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5
     * minutes. The API operation provides the URL with an <code>auth_code</code> value that enables one (and only one)
     * sign-on to a user session that is valid for 10 hours.
     * </p>
     */
    private String embedUrl;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5
     * minutes. The API operation provides the URL with an <code>auth_code</code> value that enables one (and only one)
     * sign-on to a user session that is valid for 10 hours.
     * </p>
     * 
     * @param embedUrl
     *        A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid
     *        for 5 minutes. The API operation provides the URL with an <code>auth_code</code> value that enables one
     *        (and only one) sign-on to a user session that is valid for 10 hours.
     */

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    /**
     * <p>
     * A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5
     * minutes. The API operation provides the URL with an <code>auth_code</code> value that enables one (and only one)
     * sign-on to a user session that is valid for 10 hours.
     * </p>
     * 
     * @return A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is
     *         valid for 5 minutes. The API operation provides the URL with an <code>auth_code</code> value that enables
     *         one (and only one) sign-on to a user session that is valid for 10 hours.
     */

    public String getEmbedUrl() {
        return this.embedUrl;
    }

    /**
     * <p>
     * A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5
     * minutes. The API operation provides the URL with an <code>auth_code</code> value that enables one (and only one)
     * sign-on to a user session that is valid for 10 hours.
     * </p>
     * 
     * @param embedUrl
     *        A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid
     *        for 5 minutes. The API operation provides the URL with an <code>auth_code</code> value that enables one
     *        (and only one) sign-on to a user session that is valid for 10 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlResult withEmbedUrl(String embedUrl) {
        setEmbedUrl(embedUrl);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getEmbedUrl() != null)
            sb.append("EmbedUrl: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDashboardEmbedUrlResult == false)
            return false;
        GetDashboardEmbedUrlResult other = (GetDashboardEmbedUrlResult) obj;
        if (other.getEmbedUrl() == null ^ this.getEmbedUrl() == null)
            return false;
        if (other.getEmbedUrl() != null && other.getEmbedUrl().equals(this.getEmbedUrl()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmbedUrl() == null) ? 0 : getEmbedUrl().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public GetDashboardEmbedUrlResult clone() {
        try {
            return (GetDashboardEmbedUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
