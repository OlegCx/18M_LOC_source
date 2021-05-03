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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>ReadPresetRequest</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadPresetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the preset for which you want to get detailed information.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The identifier of the preset for which you want to get detailed information.
     * </p>
     * 
     * @param id
     *        The identifier of the preset for which you want to get detailed information.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the preset for which you want to get detailed information.
     * </p>
     * 
     * @return The identifier of the preset for which you want to get detailed information.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the preset for which you want to get detailed information.
     * </p>
     * 
     * @param id
     *        The identifier of the preset for which you want to get detailed information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadPresetRequest withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadPresetRequest == false)
            return false;
        ReadPresetRequest other = (ReadPresetRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public ReadPresetRequest clone() {
        return (ReadPresetRequest) super.clone();
    }

}
