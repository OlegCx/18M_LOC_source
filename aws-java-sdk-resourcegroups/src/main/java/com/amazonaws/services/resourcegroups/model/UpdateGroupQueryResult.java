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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroupQuery" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGroupQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated resource query associated with the resource group after the update.
     * </p>
     */
    private GroupQuery groupQuery;

    /**
     * <p>
     * The updated resource query associated with the resource group after the update.
     * </p>
     * 
     * @param groupQuery
     *        The updated resource query associated with the resource group after the update.
     */

    public void setGroupQuery(GroupQuery groupQuery) {
        this.groupQuery = groupQuery;
    }

    /**
     * <p>
     * The updated resource query associated with the resource group after the update.
     * </p>
     * 
     * @return The updated resource query associated with the resource group after the update.
     */

    public GroupQuery getGroupQuery() {
        return this.groupQuery;
    }

    /**
     * <p>
     * The updated resource query associated with the resource group after the update.
     * </p>
     * 
     * @param groupQuery
     *        The updated resource query associated with the resource group after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupQueryResult withGroupQuery(GroupQuery groupQuery) {
        setGroupQuery(groupQuery);
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
        if (getGroupQuery() != null)
            sb.append("GroupQuery: ").append(getGroupQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGroupQueryResult == false)
            return false;
        UpdateGroupQueryResult other = (UpdateGroupQueryResult) obj;
        if (other.getGroupQuery() == null ^ this.getGroupQuery() == null)
            return false;
        if (other.getGroupQuery() != null && other.getGroupQuery().equals(this.getGroupQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupQuery() == null) ? 0 : getGroupQuery().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGroupQueryResult clone() {
        try {
            return (UpdateGroupQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
