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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVoiceConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean requireEncryption;

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVoiceConnectorRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * 
     * @return The name of the Amazon Chime Voice Connector.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVoiceConnectorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param requireEncryption
     *        When enabled, requires encryption for the Amazon Chime Voice Connector.
     */

    public void setRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @return When enabled, requires encryption for the Amazon Chime Voice Connector.
     */

    public Boolean getRequireEncryption() {
        return this.requireEncryption;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param requireEncryption
     *        When enabled, requires encryption for the Amazon Chime Voice Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVoiceConnectorRequest withRequireEncryption(Boolean requireEncryption) {
        setRequireEncryption(requireEncryption);
        return this;
    }

    /**
     * <p>
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @return When enabled, requires encryption for the Amazon Chime Voice Connector.
     */

    public Boolean isRequireEncryption() {
        return this.requireEncryption;
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequireEncryption() != null)
            sb.append("RequireEncryption: ").append(getRequireEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVoiceConnectorRequest == false)
            return false;
        UpdateVoiceConnectorRequest other = (UpdateVoiceConnectorRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequireEncryption() == null ^ this.getRequireEncryption() == null)
            return false;
        if (other.getRequireEncryption() != null && other.getRequireEncryption().equals(this.getRequireEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequireEncryption() == null) ? 0 : getRequireEncryption().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVoiceConnectorRequest clone() {
        return (UpdateVoiceConnectorRequest) super.clone();
    }

}
