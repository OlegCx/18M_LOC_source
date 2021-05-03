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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListReservations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReservationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListReservations
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListReservations request a second time and specify the
     * NextToken value.
     */
    private String nextToken;
    /** A list of all reservations that have been purchased by this account in the current AWS Region. */
    private java.util.List<Reservation> reservations;

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListReservations
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListReservations request a second time and specify the
     * NextToken value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListReservations request with MaxResults set at 5. The service returns the first batch of results (up to
     *        5) and a NextToken value. To see the next batch of results, you can submit the ListReservations request a
     *        second time and specify the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListReservations
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListReservations request a second time and specify the
     * NextToken value.
     * 
     * @return The token that identifies which batch of results that you want to see. For example, you submit a
     *         ListReservations request with MaxResults set at 5. The service returns the first batch of results (up to
     *         5) and a NextToken value. To see the next batch of results, you can submit the ListReservations request a
     *         second time and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListReservations
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListReservations request a second time and specify the
     * NextToken value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListReservations request with MaxResults set at 5. The service returns the first batch of results (up to
     *        5) and a NextToken value. To see the next batch of results, you can submit the ListReservations request a
     *        second time and specify the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A list of all reservations that have been purchased by this account in the current AWS Region.
     * 
     * @return A list of all reservations that have been purchased by this account in the current AWS Region.
     */

    public java.util.List<Reservation> getReservations() {
        return reservations;
    }

    /**
     * A list of all reservations that have been purchased by this account in the current AWS Region.
     * 
     * @param reservations
     *        A list of all reservations that have been purchased by this account in the current AWS Region.
     */

    public void setReservations(java.util.Collection<Reservation> reservations) {
        if (reservations == null) {
            this.reservations = null;
            return;
        }

        this.reservations = new java.util.ArrayList<Reservation>(reservations);
    }

    /**
     * A list of all reservations that have been purchased by this account in the current AWS Region.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservations(java.util.Collection)} or {@link #withReservations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reservations
     *        A list of all reservations that have been purchased by this account in the current AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsResult withReservations(Reservation... reservations) {
        if (this.reservations == null) {
            setReservations(new java.util.ArrayList<Reservation>(reservations.length));
        }
        for (Reservation ele : reservations) {
            this.reservations.add(ele);
        }
        return this;
    }

    /**
     * A list of all reservations that have been purchased by this account in the current AWS Region.
     * 
     * @param reservations
     *        A list of all reservations that have been purchased by this account in the current AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsResult withReservations(java.util.Collection<Reservation> reservations) {
        setReservations(reservations);
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
        if (getReservations() != null)
            sb.append("Reservations: ").append(getReservations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReservationsResult == false)
            return false;
        ListReservationsResult other = (ListReservationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservations() == null ^ this.getReservations() == null)
            return false;
        if (other.getReservations() != null && other.getReservations().equals(this.getReservations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReservations() == null) ? 0 : getReservations().hashCode());
        return hashCode;
    }

    @Override
    public ListReservationsResult clone() {
        try {
            return (ListReservationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
