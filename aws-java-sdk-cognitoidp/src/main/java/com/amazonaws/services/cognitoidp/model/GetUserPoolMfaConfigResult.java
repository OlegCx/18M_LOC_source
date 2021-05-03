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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserPoolMfaConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserPoolMfaConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     */
    private SmsMfaConfigType smsMfaConfiguration;
    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     */
    private SoftwareTokenMfaConfigType softwareTokenMfaConfiguration;
    /**
     * <p>
     * The multi-factor (MFA) configuration. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA will not be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     * </p>
     * </li>
     * </ul>
     */
    private String mfaConfiguration;

    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     * 
     * @param smsMfaConfiguration
     *        The SMS text message multi-factor (MFA) configuration.
     */

    public void setSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        this.smsMfaConfiguration = smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     * 
     * @return The SMS text message multi-factor (MFA) configuration.
     */

    public SmsMfaConfigType getSmsMfaConfiguration() {
        return this.smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message multi-factor (MFA) configuration.
     * </p>
     * 
     * @param smsMfaConfiguration
     *        The SMS text message multi-factor (MFA) configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserPoolMfaConfigResult withSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        setSmsMfaConfiguration(smsMfaConfiguration);
        return this;
    }

    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     * 
     * @param softwareTokenMfaConfiguration
     *        The software token multi-factor (MFA) configuration.
     */

    public void setSoftwareTokenMfaConfiguration(SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     * 
     * @return The software token multi-factor (MFA) configuration.
     */

    public SoftwareTokenMfaConfigType getSoftwareTokenMfaConfiguration() {
        return this.softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token multi-factor (MFA) configuration.
     * </p>
     * 
     * @param softwareTokenMfaConfiguration
     *        The software token multi-factor (MFA) configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserPoolMfaConfigResult withSoftwareTokenMfaConfiguration(SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        setSoftwareTokenMfaConfiguration(softwareTokenMfaConfiguration);
        return this;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA will not be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        The multi-factor (MFA) configuration. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> MFA will not be used for any users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> MFA is required for all users to sign in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     *        </p>
     *        </li>
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA will not be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The multi-factor (MFA) configuration. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OFF</code> MFA will not be used for any users.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON</code> MFA is required for all users to sign in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     *         </p>
     *         </li>
     * @see UserPoolMfaType
     */

    public String getMfaConfiguration() {
        return this.mfaConfiguration;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA will not be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        The multi-factor (MFA) configuration. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> MFA will not be used for any users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> MFA is required for all users to sign in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public GetUserPoolMfaConfigResult withMfaConfiguration(String mfaConfiguration) {
        setMfaConfiguration(mfaConfiguration);
        return this;
    }

    /**
     * <p>
     * The multi-factor (MFA) configuration. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> MFA will not be used for any users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> MFA is required for all users to sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        The multi-factor (MFA) configuration. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> MFA will not be used for any users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> MFA is required for all users to sign in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> MFA will be required only for individual users who have an MFA factor enabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public GetUserPoolMfaConfigResult withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
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
        if (getSmsMfaConfiguration() != null)
            sb.append("SmsMfaConfiguration: ").append(getSmsMfaConfiguration()).append(",");
        if (getSoftwareTokenMfaConfiguration() != null)
            sb.append("SoftwareTokenMfaConfiguration: ").append(getSoftwareTokenMfaConfiguration()).append(",");
        if (getMfaConfiguration() != null)
            sb.append("MfaConfiguration: ").append(getMfaConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserPoolMfaConfigResult == false)
            return false;
        GetUserPoolMfaConfigResult other = (GetUserPoolMfaConfigResult) obj;
        if (other.getSmsMfaConfiguration() == null ^ this.getSmsMfaConfiguration() == null)
            return false;
        if (other.getSmsMfaConfiguration() != null && other.getSmsMfaConfiguration().equals(this.getSmsMfaConfiguration()) == false)
            return false;
        if (other.getSoftwareTokenMfaConfiguration() == null ^ this.getSoftwareTokenMfaConfiguration() == null)
            return false;
        if (other.getSoftwareTokenMfaConfiguration() != null
                && other.getSoftwareTokenMfaConfiguration().equals(this.getSoftwareTokenMfaConfiguration()) == false)
            return false;
        if (other.getMfaConfiguration() == null ^ this.getMfaConfiguration() == null)
            return false;
        if (other.getMfaConfiguration() != null && other.getMfaConfiguration().equals(this.getMfaConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSmsMfaConfiguration() == null) ? 0 : getSmsMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSoftwareTokenMfaConfiguration() == null) ? 0 : getSoftwareTokenMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetUserPoolMfaConfigResult clone() {
        try {
            return (GetUserPoolMfaConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
