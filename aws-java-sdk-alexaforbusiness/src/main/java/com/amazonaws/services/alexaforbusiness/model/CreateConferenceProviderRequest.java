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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateConferenceProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConferenceProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     */
    private String conferenceProviderName;
    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     */
    private String conferenceProviderType;
    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     */
    private IPDialIn iPDialIn;
    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     */
    private PSTNDialIn pSTNDialIn;
    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     */
    private MeetingSetting meetingSetting;
    /**
     * <p>
     * The request token of the client.
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
     * The name of the conference provider.
     * </p>
     * 
     * @param conferenceProviderName
     *        The name of the conference provider.
     */

    public void setConferenceProviderName(String conferenceProviderName) {
        this.conferenceProviderName = conferenceProviderName;
    }

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * 
     * @return The name of the conference provider.
     */

    public String getConferenceProviderName() {
        return this.conferenceProviderName;
    }

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * 
     * @param conferenceProviderName
     *        The name of the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConferenceProviderRequest withConferenceProviderName(String conferenceProviderName) {
        setConferenceProviderName(conferenceProviderName);
        return this;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * 
     * @param conferenceProviderType
     *        Represents a type within a list of predefined types.
     * @see ConferenceProviderType
     */

    public void setConferenceProviderType(String conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * 
     * @return Represents a type within a list of predefined types.
     * @see ConferenceProviderType
     */

    public String getConferenceProviderType() {
        return this.conferenceProviderType;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * 
     * @param conferenceProviderType
     *        Represents a type within a list of predefined types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConferenceProviderType
     */

    public CreateConferenceProviderRequest withConferenceProviderType(String conferenceProviderType) {
        setConferenceProviderType(conferenceProviderType);
        return this;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * 
     * @param conferenceProviderType
     *        Represents a type within a list of predefined types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConferenceProviderType
     */

    public CreateConferenceProviderRequest withConferenceProviderType(ConferenceProviderType conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     * 
     * @param iPDialIn
     *        The IP endpoint and protocol for calling.
     */

    public void setIPDialIn(IPDialIn iPDialIn) {
        this.iPDialIn = iPDialIn;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     * 
     * @return The IP endpoint and protocol for calling.
     */

    public IPDialIn getIPDialIn() {
        return this.iPDialIn;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     * 
     * @param iPDialIn
     *        The IP endpoint and protocol for calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConferenceProviderRequest withIPDialIn(IPDialIn iPDialIn) {
        setIPDialIn(iPDialIn);
        return this;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     * 
     * @param pSTNDialIn
     *        The information for PSTN conferencing.
     */

    public void setPSTNDialIn(PSTNDialIn pSTNDialIn) {
        this.pSTNDialIn = pSTNDialIn;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     * 
     * @return The information for PSTN conferencing.
     */

    public PSTNDialIn getPSTNDialIn() {
        return this.pSTNDialIn;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     * 
     * @param pSTNDialIn
     *        The information for PSTN conferencing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConferenceProviderRequest withPSTNDialIn(PSTNDialIn pSTNDialIn) {
        setPSTNDialIn(pSTNDialIn);
        return this;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     * 
     * @param meetingSetting
     *        The meeting settings for the conference provider.
     */

    public void setMeetingSetting(MeetingSetting meetingSetting) {
        this.meetingSetting = meetingSetting;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     * 
     * @return The meeting settings for the conference provider.
     */

    public MeetingSetting getMeetingSetting() {
        return this.meetingSetting;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     * 
     * @param meetingSetting
     *        The meeting settings for the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConferenceProviderRequest withMeetingSetting(MeetingSetting meetingSetting) {
        setMeetingSetting(meetingSetting);
        return this;
    }

    /**
     * <p>
     * The request token of the client.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token of the client.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The request token of the client.
     * </p>
     * 
     * @return The request token of the client.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The request token of the client.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConferenceProviderRequest withClientRequestToken(String clientRequestToken) {
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

    public CreateConferenceProviderRequest withTags(Tag... tags) {
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

    public CreateConferenceProviderRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getConferenceProviderName() != null)
            sb.append("ConferenceProviderName: ").append(getConferenceProviderName()).append(",");
        if (getConferenceProviderType() != null)
            sb.append("ConferenceProviderType: ").append(getConferenceProviderType()).append(",");
        if (getIPDialIn() != null)
            sb.append("IPDialIn: ").append(getIPDialIn()).append(",");
        if (getPSTNDialIn() != null)
            sb.append("PSTNDialIn: ").append(getPSTNDialIn()).append(",");
        if (getMeetingSetting() != null)
            sb.append("MeetingSetting: ").append(getMeetingSetting()).append(",");
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

        if (obj instanceof CreateConferenceProviderRequest == false)
            return false;
        CreateConferenceProviderRequest other = (CreateConferenceProviderRequest) obj;
        if (other.getConferenceProviderName() == null ^ this.getConferenceProviderName() == null)
            return false;
        if (other.getConferenceProviderName() != null && other.getConferenceProviderName().equals(this.getConferenceProviderName()) == false)
            return false;
        if (other.getConferenceProviderType() == null ^ this.getConferenceProviderType() == null)
            return false;
        if (other.getConferenceProviderType() != null && other.getConferenceProviderType().equals(this.getConferenceProviderType()) == false)
            return false;
        if (other.getIPDialIn() == null ^ this.getIPDialIn() == null)
            return false;
        if (other.getIPDialIn() != null && other.getIPDialIn().equals(this.getIPDialIn()) == false)
            return false;
        if (other.getPSTNDialIn() == null ^ this.getPSTNDialIn() == null)
            return false;
        if (other.getPSTNDialIn() != null && other.getPSTNDialIn().equals(this.getPSTNDialIn()) == false)
            return false;
        if (other.getMeetingSetting() == null ^ this.getMeetingSetting() == null)
            return false;
        if (other.getMeetingSetting() != null && other.getMeetingSetting().equals(this.getMeetingSetting()) == false)
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

        hashCode = prime * hashCode + ((getConferenceProviderName() == null) ? 0 : getConferenceProviderName().hashCode());
        hashCode = prime * hashCode + ((getConferenceProviderType() == null) ? 0 : getConferenceProviderType().hashCode());
        hashCode = prime * hashCode + ((getIPDialIn() == null) ? 0 : getIPDialIn().hashCode());
        hashCode = prime * hashCode + ((getPSTNDialIn() == null) ? 0 : getPSTNDialIn().hashCode());
        hashCode = prime * hashCode + ((getMeetingSetting() == null) ? 0 : getMeetingSetting().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConferenceProviderRequest clone() {
        return (CreateConferenceProviderRequest) super.clone();
    }

}
