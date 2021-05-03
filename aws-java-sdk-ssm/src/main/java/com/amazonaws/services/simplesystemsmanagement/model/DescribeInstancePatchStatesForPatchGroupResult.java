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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStatesForPatchGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancePatchStatesForPatchGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstancePatchState> instancePatchStates;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     * 
     * @return The high-level patch state for the requested instances.
     */

    public java.util.List<InstancePatchState> getInstancePatchStates() {
        if (instancePatchStates == null) {
            instancePatchStates = new com.amazonaws.internal.SdkInternalList<InstancePatchState>();
        }
        return instancePatchStates;
    }

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     * 
     * @param instancePatchStates
     *        The high-level patch state for the requested instances.
     */

    public void setInstancePatchStates(java.util.Collection<InstancePatchState> instancePatchStates) {
        if (instancePatchStates == null) {
            this.instancePatchStates = null;
            return;
        }

        this.instancePatchStates = new com.amazonaws.internal.SdkInternalList<InstancePatchState>(instancePatchStates);
    }

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstancePatchStates(java.util.Collection)} or {@link #withInstancePatchStates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instancePatchStates
     *        The high-level patch state for the requested instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchStatesForPatchGroupResult withInstancePatchStates(InstancePatchState... instancePatchStates) {
        if (this.instancePatchStates == null) {
            setInstancePatchStates(new com.amazonaws.internal.SdkInternalList<InstancePatchState>(instancePatchStates.length));
        }
        for (InstancePatchState ele : instancePatchStates) {
            this.instancePatchStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     * 
     * @param instancePatchStates
     *        The high-level patch state for the requested instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchStatesForPatchGroupResult withInstancePatchStates(java.util.Collection<InstancePatchState> instancePatchStates) {
        setInstancePatchStates(instancePatchStates);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchStatesForPatchGroupResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getInstancePatchStates() != null)
            sb.append("InstancePatchStates: ").append(getInstancePatchStates()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancePatchStatesForPatchGroupResult == false)
            return false;
        DescribeInstancePatchStatesForPatchGroupResult other = (DescribeInstancePatchStatesForPatchGroupResult) obj;
        if (other.getInstancePatchStates() == null ^ this.getInstancePatchStates() == null)
            return false;
        if (other.getInstancePatchStates() != null && other.getInstancePatchStates().equals(this.getInstancePatchStates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstancePatchStates() == null) ? 0 : getInstancePatchStates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancePatchStatesForPatchGroupResult clone() {
        try {
            return (DescribeInstancePatchStatesForPatchGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
