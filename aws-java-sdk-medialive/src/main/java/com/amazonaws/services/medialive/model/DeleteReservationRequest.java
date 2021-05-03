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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for DeleteReservationRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteReservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReservationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Unique reservation ID, e.g. '1234567' */
    private String reservationId;

    /**
     * Unique reservation ID, e.g. '1234567'
     * 
     * @param reservationId
     *        Unique reservation ID, e.g. '1234567'
     */

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * Unique reservation ID, e.g. '1234567'
     * 
     * @return Unique reservation ID, e.g. '1234567'
     */

    public String getReservationId() {
        return this.reservationId;
    }

    /**
     * Unique reservation ID, e.g. '1234567'
     * 
     * @param reservationId
     *        Unique reservation ID, e.g. '1234567'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReservationRequest withReservationId(String reservationId) {
        setReservationId(reservationId);
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
        if (getReservationId() != null)
            sb.append("ReservationId: ").append(getReservationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReservationRequest == false)
            return false;
        DeleteReservationRequest other = (DeleteReservationRequest) obj;
        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReservationRequest clone() {
        return (DeleteReservationRequest) super.clone();
    }

}
