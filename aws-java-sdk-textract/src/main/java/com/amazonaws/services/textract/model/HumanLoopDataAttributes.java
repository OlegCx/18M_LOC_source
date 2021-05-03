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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows you to set attributes of the image. Currently, you can declare an image as free of personally identifiable
 * information and adult content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/HumanLoopDataAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopDataAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets whether the input image is free of personally identifiable information or adult content.
     * </p>
     */
    private java.util.List<String> contentClassifiers;

    /**
     * <p>
     * Sets whether the input image is free of personally identifiable information or adult content.
     * </p>
     * 
     * @return Sets whether the input image is free of personally identifiable information or adult content.
     * @see ContentClassifier
     */

    public java.util.List<String> getContentClassifiers() {
        return contentClassifiers;
    }

    /**
     * <p>
     * Sets whether the input image is free of personally identifiable information or adult content.
     * </p>
     * 
     * @param contentClassifiers
     *        Sets whether the input image is free of personally identifiable information or adult content.
     * @see ContentClassifier
     */

    public void setContentClassifiers(java.util.Collection<String> contentClassifiers) {
        if (contentClassifiers == null) {
            this.contentClassifiers = null;
            return;
        }

        this.contentClassifiers = new java.util.ArrayList<String>(contentClassifiers);
    }

    /**
     * <p>
     * Sets whether the input image is free of personally identifiable information or adult content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentClassifiers(java.util.Collection)} or {@link #withContentClassifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param contentClassifiers
     *        Sets whether the input image is free of personally identifiable information or adult content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentClassifier
     */

    public HumanLoopDataAttributes withContentClassifiers(String... contentClassifiers) {
        if (this.contentClassifiers == null) {
            setContentClassifiers(new java.util.ArrayList<String>(contentClassifiers.length));
        }
        for (String ele : contentClassifiers) {
            this.contentClassifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Sets whether the input image is free of personally identifiable information or adult content.
     * </p>
     * 
     * @param contentClassifiers
     *        Sets whether the input image is free of personally identifiable information or adult content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentClassifier
     */

    public HumanLoopDataAttributes withContentClassifiers(java.util.Collection<String> contentClassifiers) {
        setContentClassifiers(contentClassifiers);
        return this;
    }

    /**
     * <p>
     * Sets whether the input image is free of personally identifiable information or adult content.
     * </p>
     * 
     * @param contentClassifiers
     *        Sets whether the input image is free of personally identifiable information or adult content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentClassifier
     */

    public HumanLoopDataAttributes withContentClassifiers(ContentClassifier... contentClassifiers) {
        java.util.ArrayList<String> contentClassifiersCopy = new java.util.ArrayList<String>(contentClassifiers.length);
        for (ContentClassifier value : contentClassifiers) {
            contentClassifiersCopy.add(value.toString());
        }
        if (getContentClassifiers() == null) {
            setContentClassifiers(contentClassifiersCopy);
        } else {
            getContentClassifiers().addAll(contentClassifiersCopy);
        }
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
        if (getContentClassifiers() != null)
            sb.append("ContentClassifiers: ").append(getContentClassifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopDataAttributes == false)
            return false;
        HumanLoopDataAttributes other = (HumanLoopDataAttributes) obj;
        if (other.getContentClassifiers() == null ^ this.getContentClassifiers() == null)
            return false;
        if (other.getContentClassifiers() != null && other.getContentClassifiers().equals(this.getContentClassifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentClassifiers() == null) ? 0 : getContentClassifiers().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopDataAttributes clone() {
        try {
            return (HumanLoopDataAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.HumanLoopDataAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
