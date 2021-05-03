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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon S3 manifest file location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ManifestFileLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManifestFileLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Amazon S3 key that identifies an object.
     * </p>
     */
    private String key;

    /**
     * <p>
     * Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Amazon S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket.
     * </p>
     * 
     * @return Amazon S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestFileLocation withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Amazon S3 key that identifies an object.
     * </p>
     * 
     * @param key
     *        Amazon S3 key that identifies an object.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Amazon S3 key that identifies an object.
     * </p>
     * 
     * @return Amazon S3 key that identifies an object.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Amazon S3 key that identifies an object.
     * </p>
     * 
     * @param key
     *        Amazon S3 key that identifies an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestFileLocation withKey(String key) {
        setKey(key);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManifestFileLocation == false)
            return false;
        ManifestFileLocation other = (ManifestFileLocation) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public ManifestFileLocation clone() {
        try {
            return (ManifestFileLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ManifestFileLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
