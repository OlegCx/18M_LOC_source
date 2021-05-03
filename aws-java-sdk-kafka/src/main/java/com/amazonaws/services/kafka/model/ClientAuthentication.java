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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Includes all client authentication information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClientAuthentication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     */
    private Sasl sasl;
    /**
     * <p>
     * Details for ClientAuthentication using TLS.
     * </p>
     */
    private Tls tls;

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     * 
     * @param sasl
     *        <p>
     *        Details for ClientAuthentication using SASL.
     *        </p>
     */

    public void setSasl(Sasl sasl) {
        this.sasl = sasl;
    }

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     * 
     * @return <p>
     *         Details for ClientAuthentication using SASL.
     *         </p>
     */

    public Sasl getSasl() {
        return this.sasl;
    }

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     * 
     * @param sasl
     *        <p>
     *        Details for ClientAuthentication using SASL.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientAuthentication withSasl(Sasl sasl) {
        setSasl(sasl);
        return this;
    }

    /**
     * <p>
     * Details for ClientAuthentication using TLS.
     * </p>
     * 
     * @param tls
     *        <p>
     *        Details for ClientAuthentication using TLS.
     *        </p>
     */

    public void setTls(Tls tls) {
        this.tls = tls;
    }

    /**
     * <p>
     * Details for ClientAuthentication using TLS.
     * </p>
     * 
     * @return <p>
     *         Details for ClientAuthentication using TLS.
     *         </p>
     */

    public Tls getTls() {
        return this.tls;
    }

    /**
     * <p>
     * Details for ClientAuthentication using TLS.
     * </p>
     * 
     * @param tls
     *        <p>
     *        Details for ClientAuthentication using TLS.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientAuthentication withTls(Tls tls) {
        setTls(tls);
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
        if (getSasl() != null)
            sb.append("Sasl: ").append(getSasl()).append(",");
        if (getTls() != null)
            sb.append("Tls: ").append(getTls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientAuthentication == false)
            return false;
        ClientAuthentication other = (ClientAuthentication) obj;
        if (other.getSasl() == null ^ this.getSasl() == null)
            return false;
        if (other.getSasl() != null && other.getSasl().equals(this.getSasl()) == false)
            return false;
        if (other.getTls() == null ^ this.getTls() == null)
            return false;
        if (other.getTls() != null && other.getTls().equals(this.getTls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSasl() == null) ? 0 : getSasl().hashCode());
        hashCode = prime * hashCode + ((getTls() == null) ? 0 : getTls().hashCode());
        return hashCode;
    }

    @Override
    public ClientAuthentication clone() {
        try {
            return (ClientAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClientAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
