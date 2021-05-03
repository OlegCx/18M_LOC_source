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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to associate a configuration set with a dedicated IP pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetDeliveryOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationSetDeliveryOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that you want to associate with a dedicated IP pool.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     */
    private String tlsPolicy;
    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     */
    private String sendingPoolName;

    /**
     * <p>
     * The name of the configuration set that you want to associate with a dedicated IP pool.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to associate with a dedicated IP pool.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to associate with a dedicated IP pool.
     * </p>
     * 
     * @return The name of the configuration set that you want to associate with a dedicated IP pool.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to associate with a dedicated IP pool.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to associate with a dedicated IP pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetDeliveryOptionsRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *        established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *        connection can't be established.
     * @see TlsPolicy
     */

    public void setTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @return Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *         (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *         established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *         connection can't be established.
     * @see TlsPolicy
     */

    public String getTlsPolicy() {
        return this.tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *        established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *        connection can't be established.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsPolicy
     */

    public PutConfigurationSetDeliveryOptionsRequest withTlsPolicy(String tlsPolicy) {
        setTlsPolicy(tlsPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *        established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *        connection can't be established.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsPolicy
     */

    public PutConfigurationSetDeliveryOptionsRequest withTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     * 
     * @param sendingPoolName
     *        The name of the dedicated IP pool that you want to associate with the configuration set.
     */

    public void setSendingPoolName(String sendingPoolName) {
        this.sendingPoolName = sendingPoolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     * 
     * @return The name of the dedicated IP pool that you want to associate with the configuration set.
     */

    public String getSendingPoolName() {
        return this.sendingPoolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     * 
     * @param sendingPoolName
     *        The name of the dedicated IP pool that you want to associate with the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetDeliveryOptionsRequest withSendingPoolName(String sendingPoolName) {
        setSendingPoolName(sendingPoolName);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getTlsPolicy() != null)
            sb.append("TlsPolicy: ").append(getTlsPolicy()).append(",");
        if (getSendingPoolName() != null)
            sb.append("SendingPoolName: ").append(getSendingPoolName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationSetDeliveryOptionsRequest == false)
            return false;
        PutConfigurationSetDeliveryOptionsRequest other = (PutConfigurationSetDeliveryOptionsRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getTlsPolicy() == null ^ this.getTlsPolicy() == null)
            return false;
        if (other.getTlsPolicy() != null && other.getTlsPolicy().equals(this.getTlsPolicy()) == false)
            return false;
        if (other.getSendingPoolName() == null ^ this.getSendingPoolName() == null)
            return false;
        if (other.getSendingPoolName() != null && other.getSendingPoolName().equals(this.getSendingPoolName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getTlsPolicy() == null) ? 0 : getTlsPolicy().hashCode());
        hashCode = prime * hashCode + ((getSendingPoolName() == null) ? 0 : getSendingPoolName().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationSetDeliveryOptionsRequest clone() {
        return (PutConfigurationSetDeliveryOptionsRequest) super.clone();
    }

}
