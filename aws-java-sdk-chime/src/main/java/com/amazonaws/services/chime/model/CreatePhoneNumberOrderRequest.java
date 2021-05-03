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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreatePhoneNumberOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePhoneNumberOrderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The phone number product type.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     */
    private java.util.List<String> e164PhoneNumbers;

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @param productType
     *        The phone number product type.
     * @see PhoneNumberProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @return The phone number product type.
     * @see PhoneNumberProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @param productType
     *        The phone number product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public CreatePhoneNumberOrderRequest withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @param productType
     *        The phone number product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public CreatePhoneNumberOrderRequest withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     * 
     * @return List of phone numbers, in E.164 format.
     */

    public java.util.List<String> getE164PhoneNumbers() {
        return e164PhoneNumbers;
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     * 
     * @param e164PhoneNumbers
     *        List of phone numbers, in E.164 format.
     */

    public void setE164PhoneNumbers(java.util.Collection<String> e164PhoneNumbers) {
        if (e164PhoneNumbers == null) {
            this.e164PhoneNumbers = null;
            return;
        }

        this.e164PhoneNumbers = new java.util.ArrayList<String>(e164PhoneNumbers);
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setE164PhoneNumbers(java.util.Collection)} or {@link #withE164PhoneNumbers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param e164PhoneNumbers
     *        List of phone numbers, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePhoneNumberOrderRequest withE164PhoneNumbers(String... e164PhoneNumbers) {
        if (this.e164PhoneNumbers == null) {
            setE164PhoneNumbers(new java.util.ArrayList<String>(e164PhoneNumbers.length));
        }
        for (String ele : e164PhoneNumbers) {
            this.e164PhoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     * 
     * @param e164PhoneNumbers
     *        List of phone numbers, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePhoneNumberOrderRequest withE164PhoneNumbers(java.util.Collection<String> e164PhoneNumbers) {
        setE164PhoneNumbers(e164PhoneNumbers);
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
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
        if (getE164PhoneNumbers() != null)
            sb.append("E164PhoneNumbers: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePhoneNumberOrderRequest == false)
            return false;
        CreatePhoneNumberOrderRequest other = (CreatePhoneNumberOrderRequest) obj;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getE164PhoneNumbers() == null ^ this.getE164PhoneNumbers() == null)
            return false;
        if (other.getE164PhoneNumbers() != null && other.getE164PhoneNumbers().equals(this.getE164PhoneNumbers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getE164PhoneNumbers() == null) ? 0 : getE164PhoneNumbers().hashCode());
        return hashCode;
    }

    @Override
    public CreatePhoneNumberOrderRequest clone() {
        return (CreatePhoneNumberOrderRequest) super.clone();
    }

}
