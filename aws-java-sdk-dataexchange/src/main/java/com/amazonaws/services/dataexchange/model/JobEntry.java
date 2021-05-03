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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * AWS Data Exchange Jobs are asynchronous import or export operations used to create or copy assets. A data set owner
 * can both import and export as they see fit. Someone with an entitlement to a data set can only export. Jobs are
 * deleted 90 days after they are created.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/JobEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for the job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Details of the operation to be performed by the job, such as export destination details or import source details.
     * </p>
     */
    private ResponseDetails details;
    /**
     * <p>
     * Errors for jobs.
     * </p>
     */
    private java.util.List<JobError> errors;
    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The state of the job.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The job type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the job.
     * </p>
     * 
     * @param arn
     *        The ARN for the job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the job.
     * </p>
     * 
     * @return The ARN for the job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the job.
     * </p>
     * 
     * @param arn
     *        The ARN for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntry withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the job was created, in ISO 8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the job was created, in ISO 8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the job was created, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntry withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Details of the operation to be performed by the job, such as export destination details or import source details.
     * </p>
     * 
     * @param details
     *        Details of the operation to be performed by the job, such as export destination details or import source
     *        details.
     */

    public void setDetails(ResponseDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * Details of the operation to be performed by the job, such as export destination details or import source details.
     * </p>
     * 
     * @return Details of the operation to be performed by the job, such as export destination details or import source
     *         details.
     */

    public ResponseDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Details of the operation to be performed by the job, such as export destination details or import source details.
     * </p>
     * 
     * @param details
     *        Details of the operation to be performed by the job, such as export destination details or import source
     *        details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntry withDetails(ResponseDetails details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     * 
     * @return Errors for jobs.
     */

    public java.util.List<JobError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     * 
     * @param errors
     *        Errors for jobs.
     */

    public void setErrors(java.util.Collection<JobError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<JobError>(errors);
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors for jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntry withErrors(JobError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<JobError>(errors.length));
        }
        for (JobError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     * 
     * @param errors
     *        Errors for jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntry withErrors(java.util.Collection<JobError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * 
     * @param id
     *        The unique identifier for the job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * 
     * @return The unique identifier for the job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * 
     * @param id
     *        The unique identifier for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * 
     * @param state
     *        The state of the job.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * 
     * @return The state of the job.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * 
     * @param state
     *        The state of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public JobEntry withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * 
     * @param state
     *        The state of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public JobEntry withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * 
     * @param type
     *        The job type.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * 
     * @return The job type.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * 
     * @param type
     *        The job type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public JobEntry withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * 
     * @param type
     *        The job type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public JobEntry withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the job was last updated, in ISO 8601 format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the job was last updated, in ISO 8601 format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the job was last updated, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntry withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobEntry == false)
            return false;
        JobEntry other = (JobEntry) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public JobEntry clone() {
        try {
            return (JobEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.JobEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
