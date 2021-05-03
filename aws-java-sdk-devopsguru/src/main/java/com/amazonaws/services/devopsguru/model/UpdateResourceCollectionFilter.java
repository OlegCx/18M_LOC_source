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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information used to update a collection of AWS resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollectionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceCollectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An collection of AWS CloudFormation stacks.
     * </p>
     */
    private UpdateCloudFormationCollectionFilter cloudFormation;

    /**
     * <p>
     * An collection of AWS CloudFormation stacks.
     * </p>
     * 
     * @param cloudFormation
     *        An collection of AWS CloudFormation stacks.
     */

    public void setCloudFormation(UpdateCloudFormationCollectionFilter cloudFormation) {
        this.cloudFormation = cloudFormation;
    }

    /**
     * <p>
     * An collection of AWS CloudFormation stacks.
     * </p>
     * 
     * @return An collection of AWS CloudFormation stacks.
     */

    public UpdateCloudFormationCollectionFilter getCloudFormation() {
        return this.cloudFormation;
    }

    /**
     * <p>
     * An collection of AWS CloudFormation stacks.
     * </p>
     * 
     * @param cloudFormation
     *        An collection of AWS CloudFormation stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceCollectionFilter withCloudFormation(UpdateCloudFormationCollectionFilter cloudFormation) {
        setCloudFormation(cloudFormation);
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
        if (getCloudFormation() != null)
            sb.append("CloudFormation: ").append(getCloudFormation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceCollectionFilter == false)
            return false;
        UpdateResourceCollectionFilter other = (UpdateResourceCollectionFilter) obj;
        if (other.getCloudFormation() == null ^ this.getCloudFormation() == null)
            return false;
        if (other.getCloudFormation() != null && other.getCloudFormation().equals(this.getCloudFormation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFormation() == null) ? 0 : getCloudFormation().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceCollectionFilter clone() {
        try {
            return (UpdateResourceCollectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.UpdateResourceCollectionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
