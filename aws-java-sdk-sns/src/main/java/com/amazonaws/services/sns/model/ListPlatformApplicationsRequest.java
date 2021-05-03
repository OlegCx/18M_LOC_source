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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for ListPlatformApplications action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPlatformApplications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are
     * available after the first page results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are
     * available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is used when calling ListPlatformApplications action to retrieve additional records that
     *        are available after the first page results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are
     * available after the first page results.
     * </p>
     * 
     * @return NextToken string is used when calling ListPlatformApplications action to retrieve additional records that
     *         are available after the first page results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are
     * available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is used when calling ListPlatformApplications action to retrieve additional records that
     *        are available after the first page results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformApplicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlatformApplicationsRequest == false)
            return false;
        ListPlatformApplicationsRequest other = (ListPlatformApplicationsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlatformApplicationsRequest clone() {
        return (ListPlatformApplicationsRequest) super.clone();
    }

}
