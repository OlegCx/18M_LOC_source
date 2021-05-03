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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A phone number for which an order has been placed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/OrderedPhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderedPhoneNumber implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     */
    private String e164PhoneNumber;
    /**
     * <p>
     * The phone number status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * 
     * @param e164PhoneNumber
     *        The phone number, in E.164 format.
     */

    public void setE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * 
     * @return The phone number, in E.164 format.
     */

    public String getE164PhoneNumber() {
        return this.e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * 
     * @param e164PhoneNumber
     *        The phone number, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderedPhoneNumber withE164PhoneNumber(String e164PhoneNumber) {
        setE164PhoneNumber(e164PhoneNumber);
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @param status
     *        The phone number status.
     * @see OrderedPhoneNumberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @return The phone number status.
     * @see OrderedPhoneNumberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @param status
     *        The phone number status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderedPhoneNumberStatus
     */

    public OrderedPhoneNumber withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @param status
     *        The phone number status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderedPhoneNumberStatus
     */

    public OrderedPhoneNumber withStatus(OrderedPhoneNumberStatus status) {
        this.status = status.toString();
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
        if (getE164PhoneNumber() != null)
            sb.append("E164PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderedPhoneNumber == false)
            return false;
        OrderedPhoneNumber other = (OrderedPhoneNumber) obj;
        if (other.getE164PhoneNumber() == null ^ this.getE164PhoneNumber() == null)
            return false;
        if (other.getE164PhoneNumber() != null && other.getE164PhoneNumber().equals(this.getE164PhoneNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getE164PhoneNumber() == null) ? 0 : getE164PhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public OrderedPhoneNumber clone() {
        try {
            return (OrderedPhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.OrderedPhoneNumberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
