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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateInstanceStorageConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateInstanceStorageConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A valid resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A valid storage type.
     * </p>
     */
    private InstanceStorageConfig storageConfig;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateInstanceStorageConfigRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @see InstanceStorageResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @return A valid resource type.
     * @see InstanceStorageResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStorageResourceType
     */

    public AssociateInstanceStorageConfigRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStorageResourceType
     */

    public AssociateInstanceStorageConfigRequest withResourceType(InstanceStorageResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @param storageConfig
     *        A valid storage type.
     */

    public void setStorageConfig(InstanceStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @return A valid storage type.
     */

    public InstanceStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @param storageConfig
     *        A valid storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateInstanceStorageConfigRequest withStorageConfig(InstanceStorageConfig storageConfig) {
        setStorageConfig(storageConfig);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getStorageConfig() != null)
            sb.append("StorageConfig: ").append(getStorageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateInstanceStorageConfigRequest == false)
            return false;
        AssociateInstanceStorageConfigRequest other = (AssociateInstanceStorageConfigRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStorageConfig() == null ^ this.getStorageConfig() == null)
            return false;
        if (other.getStorageConfig() != null && other.getStorageConfig().equals(this.getStorageConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStorageConfig() == null) ? 0 : getStorageConfig().hashCode());
        return hashCode;
    }

    @Override
    public AssociateInstanceStorageConfigRequest clone() {
        return (AssociateInstanceStorageConfigRequest) super.clone();
    }

}
