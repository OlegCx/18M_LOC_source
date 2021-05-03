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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The key of a tag.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/TagKeyOnly" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagKeyOnly implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the key.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The name of the key.
     * </p>
     * 
     * @param key
     *        The name of the key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the key.
     * </p>
     * 
     * @return The name of the key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the key.
     * </p>
     * 
     * @param key
     *        The name of the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagKeyOnly withKey(String key) {
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

        if (obj instanceof TagKeyOnly == false)
            return false;
        TagKeyOnly other = (TagKeyOnly) obj;
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public TagKeyOnly clone() {
        try {
            return (TagKeyOnly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
