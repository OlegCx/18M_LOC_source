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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateTaskSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTaskSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code> deployment. A
     * task set includes details such as the desired number of tasks, how many tasks are running, and whether the task
     * set serves production traffic.
     * </p>
     */
    private TaskSet taskSet;

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code> deployment. A
     * task set includes details such as the desired number of tasks, how many tasks are running, and whether the task
     * set serves production traffic.
     * </p>
     * 
     * @param taskSet
     *        Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code>
     *        deployment. A task set includes details such as the desired number of tasks, how many tasks are running,
     *        and whether the task set serves production traffic.
     */

    public void setTaskSet(TaskSet taskSet) {
        this.taskSet = taskSet;
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code> deployment. A
     * task set includes details such as the desired number of tasks, how many tasks are running, and whether the task
     * set serves production traffic.
     * </p>
     * 
     * @return Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code>
     *         deployment. A task set includes details such as the desired number of tasks, how many tasks are running,
     *         and whether the task set serves production traffic.
     */

    public TaskSet getTaskSet() {
        return this.taskSet;
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code> deployment. A
     * task set includes details such as the desired number of tasks, how many tasks are running, and whether the task
     * set serves production traffic.
     * </p>
     * 
     * @param taskSet
     *        Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code>
     *        deployment. A task set includes details such as the desired number of tasks, how many tasks are running,
     *        and whether the task set serves production traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetResult withTaskSet(TaskSet taskSet) {
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

        if (obj instanceof CreateTaskSetResult == false)
            return false;
        CreateTaskSetResult other = (CreateTaskSetResult) obj;
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
    public CreateTaskSetResult clone() {
        try {
            return (CreateTaskSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
