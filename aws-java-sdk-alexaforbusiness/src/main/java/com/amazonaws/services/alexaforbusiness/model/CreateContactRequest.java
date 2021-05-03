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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify
     * PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type
     * and multiple numbers.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     */
    private java.util.List<PhoneNumber> phoneNumbers;
    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     */
    private java.util.List<SipAddress> sipAddresses;
    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @param displayName
     *        The name of the contact to display on the console.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @return The name of the contact to display on the console.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @param displayName
     *        The name of the contact to display on the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param firstName
     *        The first name of the contact that is used to call the contact on the device.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @return The first name of the contact that is used to call the contact on the device.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param firstName
     *        The first name of the contact that is used to call the contact on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param lastName
     *        The last name of the contact that is used to call the contact on the device.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @return The last name of the contact that is used to call the contact on the device.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param lastName
     *        The last name of the contact that is used to call the contact on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify
     * PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type
     * and multiple numbers.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify
     *        PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone
     *        number type and multiple numbers.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify
     * PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type
     * and multiple numbers.
     * </p>
     * 
     * @return The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify
     *         PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone
     *         number type and multiple numbers.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify
     * PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type
     * and multiple numbers.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact in E.164 format. The phone number type defaults to WORK. You can specify
     *        PhoneNumber or PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone
     *        number type and multiple numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * 
     * @return The list of phone numbers for the contact.
     */

    public java.util.List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * 
     * @param phoneNumbers
     *        The list of phone numbers for the contact.
     */

    public void setPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new java.util.ArrayList<PhoneNumber>(phoneNumbers);
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumbers(java.util.Collection)} or {@link #withPhoneNumbers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param phoneNumbers
     *        The list of phone numbers for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withPhoneNumbers(PhoneNumber... phoneNumbers) {
        if (this.phoneNumbers == null) {
            setPhoneNumbers(new java.util.ArrayList<PhoneNumber>(phoneNumbers.length));
        }
        for (PhoneNumber ele : phoneNumbers) {
            this.phoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * 
     * @param phoneNumbers
     *        The list of phone numbers for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * 
     * @return The list of SIP addresses for the contact.
     */

    public java.util.List<SipAddress> getSipAddresses() {
        return sipAddresses;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * 
     * @param sipAddresses
     *        The list of SIP addresses for the contact.
     */

    public void setSipAddresses(java.util.Collection<SipAddress> sipAddresses) {
        if (sipAddresses == null) {
            this.sipAddresses = null;
            return;
        }

        this.sipAddresses = new java.util.ArrayList<SipAddress>(sipAddresses);
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSipAddresses(java.util.Collection)} or {@link #withSipAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sipAddresses
     *        The list of SIP addresses for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withSipAddresses(SipAddress... sipAddresses) {
        if (this.sipAddresses == null) {
            setSipAddresses(new java.util.ArrayList<SipAddress>(sipAddresses.length));
        }
        for (SipAddress ele : sipAddresses) {
            this.sipAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * 
     * @param sipAddresses
     *        The list of SIP addresses for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withSipAddresses(java.util.Collection<SipAddress> sipAddresses) {
        setSipAddresses(sipAddresses);
        return this;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @return A unique, user-specified identifier for this request that ensures idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * 
     * @return The tags to be added to the specified resource. Do not provide system tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * 
     * @param tags
     *        The tags to be added to the specified resource. Do not provide system tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be added to the specified resource. Do not provide system tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * 
     * @param tags
     *        The tags to be added to the specified resource. Do not provide system tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhoneNumbers() != null)
            sb.append("PhoneNumbers: ").append(getPhoneNumbers()).append(",");
        if (getSipAddresses() != null)
            sb.append("SipAddresses: ").append(getSipAddresses()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactRequest == false)
            return false;
        CreateContactRequest other = (CreateContactRequest) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPhoneNumbers() == null ^ this.getPhoneNumbers() == null)
            return false;
        if (other.getPhoneNumbers() != null && other.getPhoneNumbers().equals(this.getPhoneNumbers()) == false)
            return false;
        if (other.getSipAddresses() == null ^ this.getSipAddresses() == null)
            return false;
        if (other.getSipAddresses() != null && other.getSipAddresses().equals(this.getSipAddresses()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumbers() == null) ? 0 : getPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getSipAddresses() == null) ? 0 : getSipAddresses().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateContactRequest clone() {
        return (CreateContactRequest) super.clone();
    }

}
