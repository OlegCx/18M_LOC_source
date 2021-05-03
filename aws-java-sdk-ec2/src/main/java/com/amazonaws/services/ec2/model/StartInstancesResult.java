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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the started instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceStateChange> startingInstances;

    /**
     * <p>
     * Information about the started instances.
     * </p>
     * 
     * @return Information about the started instances.
     */

    public java.util.List<InstanceStateChange> getStartingInstances() {
        if (startingInstances == null) {
            startingInstances = new com.amazonaws.internal.SdkInternalList<InstanceStateChange>();
        }
        return startingInstances;
    }

    /**
     * <p>
     * Information about the started instances.
     * </p>
     * 
     * @param startingInstances
     *        Information about the started instances.
     */

    public void setStartingInstances(java.util.Collection<InstanceStateChange> startingInstances) {
        if (startingInstances == null) {
            this.startingInstances = null;
            return;
        }

        this.startingInstances = new com.amazonaws.internal.SdkInternalList<InstanceStateChange>(startingInstances);
    }

    /**
     * <p>
     * Information about the started instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartingInstances(java.util.Collection)} or {@link #withStartingInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param startingInstances
     *        Information about the started instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInstancesResult withStartingInstances(InstanceStateChange... startingInstances) {
        if (this.startingInstances == null) {
            setStartingInstances(new com.amazonaws.internal.SdkInternalList<InstanceStateChange>(startingInstances.length));
        }
        for (InstanceStateChange ele : startingInstances) {
            this.startingInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the started instances.
     * </p>
     * 
     * @param startingInstances
     *        Information about the started instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInstancesResult withStartingInstances(java.util.Collection<InstanceStateChange> startingInstances) {
        setStartingInstances(startingInstances);
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
        if (getStartingInstances() != null)
            sb.append("StartingInstances: ").append(getStartingInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInstancesResult == false)
            return false;
        StartInstancesResult other = (StartInstancesResult) obj;
        if (other.getStartingInstances() == null ^ this.getStartingInstances() == null)
            return false;
        if (other.getStartingInstances() != null && other.getStartingInstances().equals(this.getStartingInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartingInstances() == null) ? 0 : getStartingInstances().hashCode());
        return hashCode;
    }

    @Override
    public StartInstancesResult clone() {
        try {
            return (StartInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
