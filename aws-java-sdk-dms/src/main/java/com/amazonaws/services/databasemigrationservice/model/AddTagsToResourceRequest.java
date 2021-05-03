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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates a set of tags with an AWS DMS resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/AddTagsToResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsToResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon Resource
     * Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * One or more tags to be assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon Resource
     * Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
     * </p>
     * 
     * @param resourceArn
     *        Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon
     *        Resource Name (ARN).</p>
     *        <p>
     *        For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon Resource
     * Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
     * </p>
     * 
     * @return Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon
     *         Resource Name (ARN).</p>
     *         <p>
     *         For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon Resource
     * Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
     * </p>
     * 
     * @param resourceArn
     *        Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon
     *        Resource Name (ARN).</p>
     *        <p>
     *        For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the resource.
     * </p>
     * 
     * @return One or more tags to be assigned to the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the resource.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the resource.
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
     * One or more tags to be assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withTags(Tag... tags) {
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
     * One or more tags to be assigned to the resource.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof AddTagsToResourceRequest == false)
            return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsToResourceRequest clone() {
        return (AddTagsToResourceRequest) super.clone();
    }

}
