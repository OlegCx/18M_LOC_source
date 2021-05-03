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
 * Includes encryption-related information, such as the AWS KMS key used for encrypting data at rest and whether you
 * want MSK to encrypt your data in transit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/EncryptionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data-volume encryption details.
     * </p>
     */
    private EncryptionAtRest encryptionAtRest;
    /**
     * <p>
     * The details for encryption in transit.
     * </p>
     */
    private EncryptionInTransit encryptionInTransit;

    /**
     * <p>
     * The data-volume encryption details.
     * </p>
     * 
     * @param encryptionAtRest
     *        <p>
     *        The data-volume encryption details.
     *        </p>
     */

    public void setEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
    }

    /**
     * <p>
     * The data-volume encryption details.
     * </p>
     * 
     * @return <p>
     *         The data-volume encryption details.
     *         </p>
     */

    public EncryptionAtRest getEncryptionAtRest() {
        return this.encryptionAtRest;
    }

    /**
     * <p>
     * The data-volume encryption details.
     * </p>
     * 
     * @param encryptionAtRest
     *        <p>
     *        The data-volume encryption details.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionInfo withEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        setEncryptionAtRest(encryptionAtRest);
        return this;
    }

    /**
     * <p>
     * The details for encryption in transit.
     * </p>
     * 
     * @param encryptionInTransit
     *        <p>
     *        The details for encryption in transit.
     *        </p>
     */

    public void setEncryptionInTransit(EncryptionInTransit encryptionInTransit) {
        this.encryptionInTransit = encryptionInTransit;
    }

    /**
     * <p>
     * The details for encryption in transit.
     * </p>
     * 
     * @return <p>
     *         The details for encryption in transit.
     *         </p>
     */

    public EncryptionInTransit getEncryptionInTransit() {
        return this.encryptionInTransit;
    }

    /**
     * <p>
     * The details for encryption in transit.
     * </p>
     * 
     * @param encryptionInTransit
     *        <p>
     *        The details for encryption in transit.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionInfo withEncryptionInTransit(EncryptionInTransit encryptionInTransit) {
        setEncryptionInTransit(encryptionInTransit);
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
        if (getEncryptionAtRest() != null)
            sb.append("EncryptionAtRest: ").append(getEncryptionAtRest()).append(",");
        if (getEncryptionInTransit() != null)
            sb.append("EncryptionInTransit: ").append(getEncryptionInTransit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionInfo == false)
            return false;
        EncryptionInfo other = (EncryptionInfo) obj;
        if (other.getEncryptionAtRest() == null ^ this.getEncryptionAtRest() == null)
            return false;
        if (other.getEncryptionAtRest() != null && other.getEncryptionAtRest().equals(this.getEncryptionAtRest()) == false)
            return false;
        if (other.getEncryptionInTransit() == null ^ this.getEncryptionInTransit() == null)
            return false;
        if (other.getEncryptionInTransit() != null && other.getEncryptionInTransit().equals(this.getEncryptionInTransit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionAtRest() == null) ? 0 : getEncryptionAtRest().hashCode());
        hashCode = prime * hashCode + ((getEncryptionInTransit() == null) ? 0 : getEncryptionInTransit().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionInfo clone() {
        try {
            return (EncryptionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.EncryptionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
