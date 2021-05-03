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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateDatabase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream
     * managed KMS key located in your account. Refer to <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     * keys</a> for more info.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @return The name of the Timestream database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatabaseRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream
     * managed KMS key located in your account. Refer to <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     * keys</a> for more info.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a
     *        Timestream managed KMS key located in your account. Refer to <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     *        keys</a> for more info.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream
     * managed KMS key located in your account. Refer to <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     * keys</a> for more info.
     * </p>
     * 
     * @return The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a
     *         Timestream managed KMS key located in your account. Refer to <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed
     *         KMS keys</a> for more info.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream
     * managed KMS key located in your account. Refer to <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     * keys</a> for more info.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a
     *        Timestream managed KMS key located in your account. Refer to <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     *        keys</a> for more info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatabaseRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     * 
     * @return A list of key-value pairs to label the table.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the table.
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
     * A list of key-value pairs to label the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatabaseRequest withTags(Tag... tags) {
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
     * A list of key-value pairs to label the table.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatabaseRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
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

        if (obj instanceof CreateDatabaseRequest == false)
            return false;
        CreateDatabaseRequest other = (CreateDatabaseRequest) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatabaseRequest clone() {
        return (CreateDatabaseRequest) super.clone();
    }

}
