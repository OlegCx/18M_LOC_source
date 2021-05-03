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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDestinations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of destinations.
     * </p>
     */
    private java.util.List<Destinations> destinationList;

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDestinationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of destinations.
     * </p>
     * 
     * @return The list of destinations.
     */

    public java.util.List<Destinations> getDestinationList() {
        return destinationList;
    }

    /**
     * <p>
     * The list of destinations.
     * </p>
     * 
     * @param destinationList
     *        The list of destinations.
     */

    public void setDestinationList(java.util.Collection<Destinations> destinationList) {
        if (destinationList == null) {
            this.destinationList = null;
            return;
        }

        this.destinationList = new java.util.ArrayList<Destinations>(destinationList);
    }

    /**
     * <p>
     * The list of destinations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationList(java.util.Collection)} or {@link #withDestinationList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param destinationList
     *        The list of destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDestinationsResult withDestinationList(Destinations... destinationList) {
        if (this.destinationList == null) {
            setDestinationList(new java.util.ArrayList<Destinations>(destinationList.length));
        }
        for (Destinations ele : destinationList) {
            this.destinationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of destinations.
     * </p>
     * 
     * @param destinationList
     *        The list of destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDestinationsResult withDestinationList(java.util.Collection<Destinations> destinationList) {
        setDestinationList(destinationList);
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDestinationList() != null)
            sb.append("DestinationList: ").append(getDestinationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDestinationsResult == false)
            return false;
        ListDestinationsResult other = (ListDestinationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDestinationList() == null ^ this.getDestinationList() == null)
            return false;
        if (other.getDestinationList() != null && other.getDestinationList().equals(this.getDestinationList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDestinationList() == null) ? 0 : getDestinationList().hashCode());
        return hashCode;
    }

    @Override
    public ListDestinationsResult clone() {
        try {
            return (ListDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
