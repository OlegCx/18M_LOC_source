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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveAllBackends" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveAllBackendsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The ID for the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the operation.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The current status of the request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAllBackendsResult withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     * 
     * @param error
     *        If the request failed, this is the returned error.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     * 
     * @return If the request failed, this is the returned error.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     * 
     * @param error
     *        If the request failed, this is the returned error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAllBackendsResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @return The ID for the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAllBackendsResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @param operation
     *        The name of the operation.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @return The name of the operation.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @param operation
     *        The name of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAllBackendsResult withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @return The current status of the request.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAllBackendsResult withStatus(String status) {
        setStatus(status);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAllBackendsResult == false)
            return false;
        RemoveAllBackendsResult other = (RemoveAllBackendsResult) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RemoveAllBackendsResult clone() {
        try {
            return (RemoveAllBackendsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
