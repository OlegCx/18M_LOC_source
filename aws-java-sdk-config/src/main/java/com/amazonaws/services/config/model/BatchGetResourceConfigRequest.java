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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetResourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetResourceConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceKey> resourceKeys;

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * 
     * @return A list of resource keys to be processed with the current request. Each element in the list consists of
     *         the resource type and resource ID.
     */

    public java.util.List<ResourceKey> getResourceKeys() {
        if (resourceKeys == null) {
            resourceKeys = new com.amazonaws.internal.SdkInternalList<ResourceKey>();
        }
        return resourceKeys;
    }

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * 
     * @param resourceKeys
     *        A list of resource keys to be processed with the current request. Each element in the list consists of the
     *        resource type and resource ID.
     */

    public void setResourceKeys(java.util.Collection<ResourceKey> resourceKeys) {
        if (resourceKeys == null) {
            this.resourceKeys = null;
            return;
        }

        this.resourceKeys = new com.amazonaws.internal.SdkInternalList<ResourceKey>(resourceKeys);
    }

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceKeys(java.util.Collection)} or {@link #withResourceKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceKeys
     *        A list of resource keys to be processed with the current request. Each element in the list consists of the
     *        resource type and resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetResourceConfigRequest withResourceKeys(ResourceKey... resourceKeys) {
        if (this.resourceKeys == null) {
            setResourceKeys(new com.amazonaws.internal.SdkInternalList<ResourceKey>(resourceKeys.length));
        }
        for (ResourceKey ele : resourceKeys) {
            this.resourceKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * 
     * @param resourceKeys
     *        A list of resource keys to be processed with the current request. Each element in the list consists of the
     *        resource type and resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetResourceConfigRequest withResourceKeys(java.util.Collection<ResourceKey> resourceKeys) {
        setResourceKeys(resourceKeys);
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
        if (getResourceKeys() != null)
            sb.append("ResourceKeys: ").append(getResourceKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetResourceConfigRequest == false)
            return false;
        BatchGetResourceConfigRequest other = (BatchGetResourceConfigRequest) obj;
        if (other.getResourceKeys() == null ^ this.getResourceKeys() == null)
            return false;
        if (other.getResourceKeys() != null && other.getResourceKeys().equals(this.getResourceKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceKeys() == null) ? 0 : getResourceKeys().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetResourceConfigRequest clone() {
        return (BatchGetResourceConfigRequest) super.clone();
    }

}
