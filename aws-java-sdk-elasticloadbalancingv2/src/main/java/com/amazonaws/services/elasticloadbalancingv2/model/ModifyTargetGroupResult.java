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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTargetGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTargetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the modified target group.
     * </p>
     */
    private java.util.List<TargetGroup> targetGroups;

    /**
     * <p>
     * Information about the modified target group.
     * </p>
     * 
     * @return Information about the modified target group.
     */

    public java.util.List<TargetGroup> getTargetGroups() {
        return targetGroups;
    }

    /**
     * <p>
     * Information about the modified target group.
     * </p>
     * 
     * @param targetGroups
     *        Information about the modified target group.
     */

    public void setTargetGroups(java.util.Collection<TargetGroup> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new java.util.ArrayList<TargetGroup>(targetGroups);
    }

    /**
     * <p>
     * Information about the modified target group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroups(java.util.Collection)} or {@link #withTargetGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetGroups
     *        Information about the modified target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTargetGroupResult withTargetGroups(TargetGroup... targetGroups) {
        if (this.targetGroups == null) {
            setTargetGroups(new java.util.ArrayList<TargetGroup>(targetGroups.length));
        }
        for (TargetGroup ele : targetGroups) {
            this.targetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the modified target group.
     * </p>
     * 
     * @param targetGroups
     *        Information about the modified target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTargetGroupResult withTargetGroups(java.util.Collection<TargetGroup> targetGroups) {
        setTargetGroups(targetGroups);
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
        if (getTargetGroups() != null)
            sb.append("TargetGroups: ").append(getTargetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTargetGroupResult == false)
            return false;
        ModifyTargetGroupResult other = (ModifyTargetGroupResult) obj;
        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null && other.getTargetGroups().equals(this.getTargetGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTargetGroupResult clone() {
        try {
            return (ModifyTargetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
