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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @return The identifier of the WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceSnapshotsRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspaceSnapshotsRequest == false)
            return false;
        DescribeWorkspaceSnapshotsRequest other = (DescribeWorkspaceSnapshotsRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceSnapshotsRequest clone() {
        return (DescribeWorkspaceSnapshotsRequest) super.clone();
    }

}
