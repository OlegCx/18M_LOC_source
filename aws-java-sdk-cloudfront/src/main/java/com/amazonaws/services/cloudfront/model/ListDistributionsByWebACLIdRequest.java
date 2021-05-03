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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to list distributions that are associated with a specified AWS WAF web ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByWebACLId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionsByWebACLIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination of results. If you have more than
     * <code>MaxItems</code> distributions that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the value of <code>Marker</code>, specify
     * the value of <code>NextMarker</code> from the last response. (For the first request, omit <code>Marker</code>.)
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in the response body. The maximum and
     * default values are both 100.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null" for the
     * ID, the request returns a list of the distributions that aren't associated with a web ACL.
     * </p>
     */
    private String webACLId;

    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination of results. If you have more than
     * <code>MaxItems</code> distributions that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the value of <code>Marker</code>, specify
     * the value of <code>NextMarker</code> from the last response. (For the first request, omit <code>Marker</code>.)
     * </p>
     * 
     * @param marker
     *        Use <code>Marker</code> and <code>MaxItems</code> to control pagination of results. If you have more than
     *        <code>MaxItems</code> distributions that satisfy the request, the response includes a
     *        <code>NextMarker</code> element. To get the next page of results, submit another request. For the value of
     *        <code>Marker</code>, specify the value of <code>NextMarker</code> from the last response. (For the first
     *        request, omit <code>Marker</code>.)
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination of results. If you have more than
     * <code>MaxItems</code> distributions that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the value of <code>Marker</code>, specify
     * the value of <code>NextMarker</code> from the last response. (For the first request, omit <code>Marker</code>.)
     * </p>
     * 
     * @return Use <code>Marker</code> and <code>MaxItems</code> to control pagination of results. If you have more than
     *         <code>MaxItems</code> distributions that satisfy the request, the response includes a
     *         <code>NextMarker</code> element. To get the next page of results, submit another request. For the value
     *         of <code>Marker</code>, specify the value of <code>NextMarker</code> from the last response. (For the
     *         first request, omit <code>Marker</code>.)
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination of results. If you have more than
     * <code>MaxItems</code> distributions that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the value of <code>Marker</code>, specify
     * the value of <code>NextMarker</code> from the last response. (For the first request, omit <code>Marker</code>.)
     * </p>
     * 
     * @param marker
     *        Use <code>Marker</code> and <code>MaxItems</code> to control pagination of results. If you have more than
     *        <code>MaxItems</code> distributions that satisfy the request, the response includes a
     *        <code>NextMarker</code> element. To get the next page of results, submit another request. For the value of
     *        <code>Marker</code>, specify the value of <code>NextMarker</code> from the last response. (For the first
     *        request, omit <code>Marker</code>.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByWebACLIdRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in the response body. The maximum and
     * default values are both 100.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of distributions that you want CloudFront to return in the response body. The maximum
     *        and default values are both 100.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in the response body. The maximum and
     * default values are both 100.
     * </p>
     * 
     * @return The maximum number of distributions that you want CloudFront to return in the response body. The maximum
     *         and default values are both 100.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in the response body. The maximum and
     * default values are both 100.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of distributions that you want CloudFront to return in the response body. The maximum
     *        and default values are both 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByWebACLIdRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null" for the
     * ID, the request returns a list of the distributions that aren't associated with a web ACL.
     * </p>
     * 
     * @param webACLId
     *        The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null"
     *        for the ID, the request returns a list of the distributions that aren't associated with a web ACL.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null" for the
     * ID, the request returns a list of the distributions that aren't associated with a web ACL.
     * </p>
     * 
     * @return The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null"
     *         for the ID, the request returns a list of the distributions that aren't associated with a web ACL.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null" for the
     * ID, the request returns a list of the distributions that aren't associated with a web ACL.
     * </p>
     * 
     * @param webACLId
     *        The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null"
     *        for the ID, the request returns a list of the distributions that aren't associated with a web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByWebACLIdRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getWebACLId() != null)
            sb.append("WebACLId: ").append(getWebACLId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDistributionsByWebACLIdRequest == false)
            return false;
        ListDistributionsByWebACLIdRequest other = (ListDistributionsByWebACLIdRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        return hashCode;
    }

    @Override
    public ListDistributionsByWebACLIdRequest clone() {
        return (ListDistributionsByWebACLIdRequest) super.clone();
    }

}
