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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <code>UpdateJobQueue</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateJobQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the job queue.
     * </p>
     */
    private String jobQueue;
    /**
     * <p>
     * Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can accept
     * jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     * the queue can finish.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one
     * of the parameters used by the job scheduler to determine which compute environment should run a given job.
     * Compute environments must be in the <code>VALID</code> state before you can associate them with a job queue. All
     * of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     */
    private java.util.List<ComputeEnvironmentOrder> computeEnvironmentOrder;

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @param jobQueue
     *        The name or the Amazon Resource Name (ARN) of the job queue.
     */

    public void setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @return The name or the Amazon Resource Name (ARN) of the job queue.
     */

    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @param jobQueue
     *        The name or the Amazon Resource Name (ARN) of the job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobQueueRequest withJobQueue(String jobQueue) {
        setJobQueue(jobQueue);
        return this;
    }

    /**
     * <p>
     * Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can accept
     * jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     * the queue can finish.
     * </p>
     * 
     * @param state
     *        Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can
     *        accept jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but
     *        jobs already in the queue can finish.
     * @see JQState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can accept
     * jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     * the queue can finish.
     * </p>
     * 
     * @return Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can
     *         accept jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but
     *         jobs already in the queue can finish.
     * @see JQState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can accept
     * jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     * the queue can finish.
     * </p>
     * 
     * @param state
     *        Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can
     *        accept jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but
     *        jobs already in the queue can finish.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQState
     */

    public UpdateJobQueueRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can accept
     * jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     * the queue can finish.
     * </p>
     * 
     * @param state
     *        Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can
     *        accept jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but
     *        jobs already in the queue can finish.
     * @see JQState
     */

    public void setState(JQState state) {
        withState(state);
    }

    /**
     * <p>
     * Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can accept
     * jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     * the queue can finish.
     * </p>
     * 
     * @param state
     *        Describes the queue's ability to accept new jobs. If the job queue state is <code>ENABLED</code>, it can
     *        accept jobs. If the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but
     *        jobs already in the queue can finish.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQState
     */

    public UpdateJobQueueRequest withState(JQState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *        <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *        Priority is determined in descending order, for example, a job queue with a priority value of
     *        <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     *        All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     *        <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * 
     * @return The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *         <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *         Priority is determined in descending order, for example, a job queue with a priority value of
     *         <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     *         All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     *         <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *        <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *        Priority is determined in descending order, for example, a job queue with a priority value of
     *        <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     *        All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     *        <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobQueueRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one
     * of the parameters used by the job scheduler to determine which compute environment should run a given job.
     * Compute environments must be in the <code>VALID</code> state before you can associate them with a job queue. All
     * of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * 
     * @return Details the set of compute environments mapped to a job queue and their order relative to each other.
     *         This is one of the parameters used by the job scheduler to determine which compute environment should run
     *         a given job. Compute environments must be in the <code>VALID</code> state before you can associate them
     *         with a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or
     *         <code>SPOT</code>) or Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate
     *         compute environments can't be mixed.</p> <note>
     *         <p>
     *         All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *         doesn't support mixing compute environment architecture types in a single job queue.
     *         </p>
     */

    public java.util.List<ComputeEnvironmentOrder> getComputeEnvironmentOrder() {
        return computeEnvironmentOrder;
    }

    /**
     * <p>
     * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one
     * of the parameters used by the job scheduler to determine which compute environment should run a given job.
     * Compute environments must be in the <code>VALID</code> state before you can associate them with a job queue. All
     * of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * 
     * @param computeEnvironmentOrder
     *        Details the set of compute environments mapped to a job queue and their order relative to each other. This
     *        is one of the parameters used by the job scheduler to determine which compute environment should run a
     *        given job. Compute environments must be in the <code>VALID</code> state before you can associate them with
     *        a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or
     *        Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be
     *        mixed.</p> <note>
     *        <p>
     *        All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *        doesn't support mixing compute environment architecture types in a single job queue.
     *        </p>
     */

    public void setComputeEnvironmentOrder(java.util.Collection<ComputeEnvironmentOrder> computeEnvironmentOrder) {
        if (computeEnvironmentOrder == null) {
            this.computeEnvironmentOrder = null;
            return;
        }

        this.computeEnvironmentOrder = new java.util.ArrayList<ComputeEnvironmentOrder>(computeEnvironmentOrder);
    }

    /**
     * <p>
     * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one
     * of the parameters used by the job scheduler to determine which compute environment should run a given job.
     * Compute environments must be in the <code>VALID</code> state before you can associate them with a job queue. All
     * of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeEnvironmentOrder(java.util.Collection)} or
     * {@link #withComputeEnvironmentOrder(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        Details the set of compute environments mapped to a job queue and their order relative to each other. This
     *        is one of the parameters used by the job scheduler to determine which compute environment should run a
     *        given job. Compute environments must be in the <code>VALID</code> state before you can associate them with
     *        a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or
     *        Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be
     *        mixed.</p> <note>
     *        <p>
     *        All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *        doesn't support mixing compute environment architecture types in a single job queue.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobQueueRequest withComputeEnvironmentOrder(ComputeEnvironmentOrder... computeEnvironmentOrder) {
        if (this.computeEnvironmentOrder == null) {
            setComputeEnvironmentOrder(new java.util.ArrayList<ComputeEnvironmentOrder>(computeEnvironmentOrder.length));
        }
        for (ComputeEnvironmentOrder ele : computeEnvironmentOrder) {
            this.computeEnvironmentOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one
     * of the parameters used by the job scheduler to determine which compute environment should run a given job.
     * Compute environments must be in the <code>VALID</code> state before you can associate them with a job queue. All
     * of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * 
     * @param computeEnvironmentOrder
     *        Details the set of compute environments mapped to a job queue and their order relative to each other. This
     *        is one of the parameters used by the job scheduler to determine which compute environment should run a
     *        given job. Compute environments must be in the <code>VALID</code> state before you can associate them with
     *        a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or
     *        Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>). EC2 and Fargate compute environments can't be
     *        mixed.</p> <note>
     *        <p>
     *        All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *        doesn't support mixing compute environment architecture types in a single job queue.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobQueueRequest withComputeEnvironmentOrder(java.util.Collection<ComputeEnvironmentOrder> computeEnvironmentOrder) {
        setComputeEnvironmentOrder(computeEnvironmentOrder);
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
        if (getJobQueue() != null)
            sb.append("JobQueue: ").append(getJobQueue()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getComputeEnvironmentOrder() != null)
            sb.append("ComputeEnvironmentOrder: ").append(getComputeEnvironmentOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobQueueRequest == false)
            return false;
        UpdateJobQueueRequest other = (UpdateJobQueueRequest) obj;
        if (other.getJobQueue() == null ^ this.getJobQueue() == null)
            return false;
        if (other.getJobQueue() != null && other.getJobQueue().equals(this.getJobQueue()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getComputeEnvironmentOrder() == null ^ this.getComputeEnvironmentOrder() == null)
            return false;
        if (other.getComputeEnvironmentOrder() != null && other.getComputeEnvironmentOrder().equals(this.getComputeEnvironmentOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobQueue() == null) ? 0 : getJobQueue().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getComputeEnvironmentOrder() == null) ? 0 : getComputeEnvironmentOrder().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobQueueRequest clone() {
        return (UpdateJobQueueRequest) super.clone();
    }

}
