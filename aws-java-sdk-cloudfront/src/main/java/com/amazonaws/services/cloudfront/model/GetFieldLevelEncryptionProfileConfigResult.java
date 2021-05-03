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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfileConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFieldLevelEncryptionProfileConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     */
    private FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig;
    /**
     * <p>
     * The current version of the field-level encryption profile configuration result. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        Return the field-level encryption profile configuration information.
     */

    public void setFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     * 
     * @return Return the field-level encryption profile configuration information.
     */

    public FieldLevelEncryptionProfileConfig getFieldLevelEncryptionProfileConfig() {
        return this.fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        Return the field-level encryption profile configuration information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldLevelEncryptionProfileConfigResult withFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        setFieldLevelEncryptionProfileConfig(fieldLevelEncryptionProfileConfig);
        return this;
    }

    /**
     * <p>
     * The current version of the field-level encryption profile configuration result. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The current version of the field-level encryption profile configuration result. For example:
     *        <code>E2QWRUHAPOMQZL</code>.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the field-level encryption profile configuration result. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The current version of the field-level encryption profile configuration result. For example:
     *         <code>E2QWRUHAPOMQZL</code>.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the field-level encryption profile configuration result. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The current version of the field-level encryption profile configuration result. For example:
     *        <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldLevelEncryptionProfileConfigResult withETag(String eTag) {
        setETag(eTag);
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
        if (getFieldLevelEncryptionProfileConfig() != null)
            sb.append("FieldLevelEncryptionProfileConfig: ").append(getFieldLevelEncryptionProfileConfig()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFieldLevelEncryptionProfileConfigResult == false)
            return false;
        GetFieldLevelEncryptionProfileConfigResult other = (GetFieldLevelEncryptionProfileConfigResult) obj;
        if (other.getFieldLevelEncryptionProfileConfig() == null ^ this.getFieldLevelEncryptionProfileConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionProfileConfig() != null
                && other.getFieldLevelEncryptionProfileConfig().equals(this.getFieldLevelEncryptionProfileConfig()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLevelEncryptionProfileConfig() == null) ? 0 : getFieldLevelEncryptionProfileConfig().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetFieldLevelEncryptionProfileConfigResult clone() {
        try {
            return (GetFieldLevelEncryptionProfileConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
