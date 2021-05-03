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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDistributionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that describe your distributions.
     * </p>
     */
    private java.util.List<LightsailDistribution> distributions;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetDistributions</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects that describe your distributions.
     * </p>
     * 
     * @return An array of objects that describe your distributions.
     */

    public java.util.List<LightsailDistribution> getDistributions() {
        return distributions;
    }

    /**
     * <p>
     * An array of objects that describe your distributions.
     * </p>
     * 
     * @param distributions
     *        An array of objects that describe your distributions.
     */

    public void setDistributions(java.util.Collection<LightsailDistribution> distributions) {
        if (distributions == null) {
            this.distributions = null;
            return;
        }

        this.distributions = new java.util.ArrayList<LightsailDistribution>(distributions);
    }

    /**
     * <p>
     * An array of objects that describe your distributions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDistributions(java.util.Collection)} or {@link #withDistributions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param distributions
     *        An array of objects that describe your distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionsResult withDistributions(LightsailDistribution... distributions) {
        if (this.distributions == null) {
            setDistributions(new java.util.ArrayList<LightsailDistribution>(distributions.length));
        }
        for (LightsailDistribution ele : distributions) {
            this.distributions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe your distributions.
     * </p>
     * 
     * @param distributions
     *        An array of objects that describe your distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionsResult withDistributions(java.util.Collection<LightsailDistribution> distributions) {
        setDistributions(distributions);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetDistributions</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetDistributions</code> request and specify the
     *        next page token using the <code>pageToken</code> parameter.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetDistributions</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         A next page token is not returned if there are no more results to display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another <code>GetDistributions</code> request and specify the
     *         next page token using the <code>pageToken</code> parameter.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetDistributions</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetDistributions</code> request and specify the
     *        next page token using the <code>pageToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getDistributions() != null)
            sb.append("Distributions: ").append(getDistributions()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDistributionsResult == false)
            return false;
        GetDistributionsResult other = (GetDistributionsResult) obj;
        if (other.getDistributions() == null ^ this.getDistributions() == null)
            return false;
        if (other.getDistributions() != null && other.getDistributions().equals(this.getDistributions()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributions() == null) ? 0 : getDistributions().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDistributionsResult clone() {
        try {
            return (GetDistributionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
