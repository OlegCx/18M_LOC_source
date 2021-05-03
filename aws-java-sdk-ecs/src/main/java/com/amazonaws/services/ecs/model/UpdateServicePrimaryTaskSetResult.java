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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateServicePrimaryTaskSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServicePrimaryTaskSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the task set.
     * </p>
     */
    private TaskSet taskSet;

    /**
     * <p>
     * Details about the task set.
     * </p>
     * 
     * @param taskSet
     *        Details about the task set.
     */

    public void setTaskSet(TaskSet taskSet) {
        this.taskSet = taskSet;
    }

    /**
     * <p>
     * Details about the task set.
     * </p>
     * 
     * @return Details about the task set.
     */

    public TaskSet getTaskSet() {
        return this.taskSet;
    }

    /**
     * <p>
     * Details about the task set.
     * </p>
     * 
     * @param taskSet
     *        Details about the task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePrimaryTaskSetResult withTaskSet(TaskSet taskSet) {
        setTaskSet(taskSet);
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
        if (getTaskSet() != null)
            sb.append("TaskSet: ").append(getTaskSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServicePrimaryTaskSetResult == false)
            return false;
        UpdateServicePrimaryTaskSetResult other = (UpdateServicePrimaryTaskSetResult) obj;
        if (other.getTaskSet() == null ^ this.getTaskSet() == null)
            return false;
        if (other.getTaskSet() != null && other.getTaskSet().equals(this.getTaskSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskSet() == null) ? 0 : getTaskSet().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServicePrimaryTaskSetResult clone() {
        try {
            return (UpdateServicePrimaryTaskSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
