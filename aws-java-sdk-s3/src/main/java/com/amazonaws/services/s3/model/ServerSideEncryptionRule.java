/*
 * Copyright 2012-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * SSE configuration rule.
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/ServerSideEncryptionRule" target="_top">AWS API
 * Documentation</a>
 */
public class ServerSideEncryptionRule implements Serializable, Cloneable {

    private ServerSideEncryptionByDefault applyServerSideEncryptionByDefault;
    private Boolean bucketKeyEnabled;

    /**
     * Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify
     * any server-side encryption, this default encryption will be applied.
     *
     * @return The current {@link ServerSideEncryptionByDefault}
     */
    public ServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return applyServerSideEncryptionByDefault;
    }

    /**
     * Sets the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify
     * any server-side encryption, this default encryption will be applied.
     *
     * @param applyServerSideEncryptionByDefault New default SSE configuration.
     */
    public void setApplyServerSideEncryptionByDefault(ServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
    }

    /**
     * Sets the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify
     * any server-side encryption, this default encryption will be applied.
     *
     * @param applyServerSideEncryptionByDefault New default SSE configuration.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionRule withApplyServerSideEncryptionByDefault(ServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
        setApplyServerSideEncryptionByDefault(applyServerSideEncryptionByDefault);
        return this;
    }

    /**
     * Returns whether or not the bucket key is enabled. If Put Object request does not specify
     * whether bucket key should be used, this default setting will be applied.
     *
     * @return Whether bucket key is enabled or not
     */
    public Boolean getBucketKeyEnabled() {
        return bucketKeyEnabled;
    }

    /**
     * Sets the default setting for whether bucket key is used for new objects in the bucket.
     * If Put Object request does not specify whether bucket key should be used, this default setting will be applied.
     *
     * @param bucketKeyEnabled Whether bucket key is enabled or not
     */
    public void setBucketKeyEnabled(Boolean bucketKeyEnabled) {
        this.bucketKeyEnabled = bucketKeyEnabled;
    }

    /**
     * Sets the default setting for whether bucket key is used for new objects in the bucket.
     * If Put Object request does not specify whether bucket key should be used, this default setting will be applied.
     *
     * @param bucketKeyEnabled Whether bucket key is enabled or not
     * @return This object for method chaining.
     */
    public ServerSideEncryptionRule withBucketKeyEnabled(Boolean bucketKeyEnabled) {
        setBucketKeyEnabled(bucketKeyEnabled);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplyServerSideEncryptionByDefault() != null) {
            sb.append("ApplyServerSideEncryptionByDefault: ").append(getApplyServerSideEncryptionByDefault()).append(",");
            sb.append("BucketKeyEnabled: ").append(getBucketKeyEnabled()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof ServerSideEncryptionRule == false) {
            return false;
        }
        ServerSideEncryptionRule other = (ServerSideEncryptionRule) obj;
        if (other.getApplyServerSideEncryptionByDefault() == null ^ this.getApplyServerSideEncryptionByDefault() == null) {
            return false;
        }
        if (other.getApplyServerSideEncryptionByDefault() != null
                && other.getApplyServerSideEncryptionByDefault().equals(this.getApplyServerSideEncryptionByDefault()) == false) {
            return false;
        }
        if (other.getBucketKeyEnabled() == null ^ this.getBucketKeyEnabled() == null) {
            return false;
        }
        if (other.getBucketKeyEnabled() != null &&
                other.getBucketKeyEnabled().booleanValue() != this.getBucketKeyEnabled().booleanValue()) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyServerSideEncryptionByDefault() == null) ? 0 :
                getApplyServerSideEncryptionByDefault().hashCode());
        hashCode = prime * hashCode + ((getBucketKeyEnabled() == null) ? 0 : getBucketKeyEnabled() ? 1 : 2);
        return hashCode;
    }

    @Override
    public ServerSideEncryptionRule clone() {
        try {
            return (ServerSideEncryptionRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
