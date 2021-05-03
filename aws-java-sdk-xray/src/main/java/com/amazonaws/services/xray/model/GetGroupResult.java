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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The group that was requested. Contains the name of the group, the ARN of the group, the filter expression, and
     * the insight configuration assigned to the group.
     * </p>
     */
    private Group group;

    /**
     * <p>
     * The group that was requested. Contains the name of the group, the ARN of the group, the filter expression, and
     * the insight configuration assigned to the group.
     * </p>
     * 
     * @param group
     *        The group that was requested. Contains the name of the group, the ARN of the group, the filter expression,
     *        and the insight configuration assigned to the group.
     */

    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * <p>
     * The group that was requested. Contains the name of the group, the ARN of the group, the filter expression, and
     * the insight configuration assigned to the group.
     * </p>
     * 
     * @return The group that was requested. Contains the name of the group, the ARN of the group, the filter
     *         expression, and the insight configuration assigned to the group.
     */

    public Group getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The group that was requested. Contains the name of the group, the ARN of the group, the filter expression, and
     * the insight configuration assigned to the group.
     * </p>
     * 
     * @param group
     *        The group that was requested. Contains the name of the group, the ARN of the group, the filter expression,
     *        and the insight configuration assigned to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupResult withGroup(Group group) {
        setGroup(group);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupResult == false)
            return false;
        GetGroupResult other = (GetGroupResult) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupResult clone() {
        try {
            return (GetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
