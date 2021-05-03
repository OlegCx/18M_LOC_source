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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies one of the label or labels that categorize the personally identifiable information (PII) entity being
 * analyzed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityLabel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityLabel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the label.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The name of the label.
     * </p>
     * 
     * @param name
     *        The name of the label.
     * @see PiiEntityType
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * 
     * @return The name of the label.
     * @see PiiEntityType
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * 
     * @param name
     *        The name of the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public EntityLabel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * 
     * @param name
     *        The name of the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public EntityLabel withName(PiiEntityType name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityLabel withScore(Float score) {
        setScore(score);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityLabel == false)
            return false;
        EntityLabel other = (EntityLabel) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public EntityLabel clone() {
        try {
            return (EntityLabel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityLabelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
