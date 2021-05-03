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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFieldLevelEncryptionConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have been created in CloudFront for this
     * account.
     * </p>
     */
    private FieldLevelEncryptionList fieldLevelEncryptionList;

    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have been created in CloudFront for this
     * account.
     * </p>
     * 
     * @param fieldLevelEncryptionList
     *        Returns a list of all field-level encryption configurations that have been created in CloudFront for this
     *        account.
     */

    public void setFieldLevelEncryptionList(FieldLevelEncryptionList fieldLevelEncryptionList) {
        this.fieldLevelEncryptionList = fieldLevelEncryptionList;
    }

    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have been created in CloudFront for this
     * account.
     * </p>
     * 
     * @return Returns a list of all field-level encryption configurations that have been created in CloudFront for this
     *         account.
     */

    public FieldLevelEncryptionList getFieldLevelEncryptionList() {
        return this.fieldLevelEncryptionList;
    }

    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have been created in CloudFront for this
     * account.
     * </p>
     * 
     * @param fieldLevelEncryptionList
     *        Returns a list of all field-level encryption configurations that have been created in CloudFront for this
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldLevelEncryptionConfigsResult withFieldLevelEncryptionList(FieldLevelEncryptionList fieldLevelEncryptionList) {
        setFieldLevelEncryptionList(fieldLevelEncryptionList);
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
        if (getFieldLevelEncryptionList() != null)
            sb.append("FieldLevelEncryptionList: ").append(getFieldLevelEncryptionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFieldLevelEncryptionConfigsResult == false)
            return false;
        ListFieldLevelEncryptionConfigsResult other = (ListFieldLevelEncryptionConfigsResult) obj;
        if (other.getFieldLevelEncryptionList() == null ^ this.getFieldLevelEncryptionList() == null)
            return false;
        if (other.getFieldLevelEncryptionList() != null && other.getFieldLevelEncryptionList().equals(this.getFieldLevelEncryptionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLevelEncryptionList() == null) ? 0 : getFieldLevelEncryptionList().hashCode());
        return hashCode;
    }

    @Override
    public ListFieldLevelEncryptionConfigsResult clone() {
        try {
            return (ListFieldLevelEncryptionConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
