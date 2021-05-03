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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a task submitted to a resource .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TaskSubmittedEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSubmittedEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The response from a resource when a task has started. Length constraints apply to the payload size, and are
     * expressed as bytes in UTF-8 encoding.
     * </p>
     */
    private String output;
    /**
     * <p>
     * Contains details about the output of an execution history event.
     * </p>
     */
    private HistoryEventExecutionDataDetails outputDetails;

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     * 
     * @param resourceType
     *        The action of the resource called by a task state.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     * 
     * @return The action of the resource called by a task state.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     * 
     * @param resourceType
     *        The action of the resource called by a task state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSubmittedEventDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     * 
     * @param resource
     *        The service name of the resource in a task state.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     * 
     * @return The service name of the resource in a task state.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     * 
     * @param resource
     *        The service name of the resource in a task state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSubmittedEventDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The response from a resource when a task has started. Length constraints apply to the payload size, and are
     * expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param output
     *        The response from a resource when a task has started. Length constraints apply to the payload size, and
     *        are expressed as bytes in UTF-8 encoding.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The response from a resource when a task has started. Length constraints apply to the payload size, and are
     * expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @return The response from a resource when a task has started. Length constraints apply to the payload size, and
     *         are expressed as bytes in UTF-8 encoding.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The response from a resource when a task has started. Length constraints apply to the payload size, and are
     * expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param output
     *        The response from a resource when a task has started. Length constraints apply to the payload size, and
     *        are expressed as bytes in UTF-8 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSubmittedEventDetails withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * Contains details about the output of an execution history event.
     * </p>
     * 
     * @param outputDetails
     *        Contains details about the output of an execution history event.
     */

    public void setOutputDetails(HistoryEventExecutionDataDetails outputDetails) {
        this.outputDetails = outputDetails;
    }

    /**
     * <p>
     * Contains details about the output of an execution history event.
     * </p>
     * 
     * @return Contains details about the output of an execution history event.
     */

    public HistoryEventExecutionDataDetails getOutputDetails() {
        return this.outputDetails;
    }

    /**
     * <p>
     * Contains details about the output of an execution history event.
     * </p>
     * 
     * @param outputDetails
     *        Contains details about the output of an execution history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSubmittedEventDetails withOutputDetails(HistoryEventExecutionDataDetails outputDetails) {
        setOutputDetails(outputDetails);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputDetails() != null)
            sb.append("OutputDetails: ").append(getOutputDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskSubmittedEventDetails == false)
            return false;
        TaskSubmittedEventDetails other = (TaskSubmittedEventDetails) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getOutputDetails() == null ^ this.getOutputDetails() == null)
            return false;
        if (other.getOutputDetails() != null && other.getOutputDetails().equals(this.getOutputDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputDetails() == null) ? 0 : getOutputDetails().hashCode());
        return hashCode;
    }

    @Override
    public TaskSubmittedEventDetails clone() {
        try {
            return (TaskSubmittedEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.TaskSubmittedEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
