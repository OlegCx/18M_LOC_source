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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Permission for the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ResourcePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePermission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or
     * theme. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to share
     * resources (templates) across AWS accounts. (This is less common.)
     * </p>
     * </li>
     * </ul>
     */
    private String principal;
    /**
     * <p>
     * The IAM action to grant or revoke permissions on.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or
     * theme. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to share
     * resources (templates) across AWS accounts. (This is less common.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param principal
     *        The Amazon Resource Name (ARN) of the principal. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard,
     *        template, or theme. (This is common.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to
     *        share resources (templates) across AWS accounts. (This is less common.)
     *        </p>
     *        </li>
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or
     * theme. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to share
     * resources (templates) across AWS accounts. (This is less common.)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the principal. This can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard,
     *         template, or theme. (This is common.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to
     *         share resources (templates) across AWS accounts. (This is less common.)
     *         </p>
     *         </li>
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or
     * theme. (This is common.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to share
     * resources (templates) across AWS accounts. (This is less common.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param principal
     *        The Amazon Resource Name (ARN) of the principal. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard,
     *        template, or theme. (This is common.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to
     *        share resources (templates) across AWS accounts. (This is less common.)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePermission withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The IAM action to grant or revoke permissions on.
     * </p>
     * 
     * @return The IAM action to grant or revoke permissions on.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The IAM action to grant or revoke permissions on.
     * </p>
     * 
     * @param actions
     *        The IAM action to grant or revoke permissions on.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The IAM action to grant or revoke permissions on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The IAM action to grant or revoke permissions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePermission withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IAM action to grant or revoke permissions on.
     * </p>
     * 
     * @param actions
     *        The IAM action to grant or revoke permissions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePermission withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePermission == false)
            return false;
        ResourcePermission other = (ResourcePermission) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePermission clone() {
        try {
            return (ResourcePermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ResourcePermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
