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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreatePublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublicKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The public key.
     * </p>
     */
    private PublicKey publicKey;
    /**
     * <p>
     * The URL of the public key.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The identifier for this version of the public key.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The public key.
     * </p>
     * 
     * @param publicKey
     *        The public key.
     */

    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key.
     * </p>
     * 
     * @return The public key.
     */

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key.
     * </p>
     * 
     * @param publicKey
     *        The public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicKeyResult withPublicKey(PublicKey publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The URL of the public key.
     * </p>
     * 
     * @param location
     *        The URL of the public key.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The URL of the public key.
     * </p>
     * 
     * @return The URL of the public key.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The URL of the public key.
     * </p>
     * 
     * @param location
     *        The URL of the public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicKeyResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The identifier for this version of the public key.
     * </p>
     * 
     * @param eTag
     *        The identifier for this version of the public key.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The identifier for this version of the public key.
     * </p>
     * 
     * @return The identifier for this version of the public key.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The identifier for this version of the public key.
     * </p>
     * 
     * @param eTag
     *        The identifier for this version of the public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicKeyResult withETag(String eTag) {
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
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
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

        if (obj instanceof CreatePublicKeyResult == false)
            return false;
        CreatePublicKeyResult other = (CreatePublicKeyResult) obj;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
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

        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public CreatePublicKeyResult clone() {
        try {
            return (CreatePublicKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
