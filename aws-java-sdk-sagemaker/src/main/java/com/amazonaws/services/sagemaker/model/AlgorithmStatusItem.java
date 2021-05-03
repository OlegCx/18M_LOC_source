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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the overall status of an algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AlgorithmStatusItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmStatusItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     * 
     * @param name
     *        The name of the algorithm for which the overall status is being reported.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     * 
     * @return The name of the algorithm for which the overall status is being reported.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     * 
     * @param name
     *        The name of the algorithm for which the overall status is being reported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmStatusItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @param status
     *        The current status.
     * @see DetailedAlgorithmStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @return The current status.
     * @see DetailedAlgorithmStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @param status
     *        The current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailedAlgorithmStatus
     */

    public AlgorithmStatusItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @param status
     *        The current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailedAlgorithmStatus
     */

    public AlgorithmStatusItem withStatus(DetailedAlgorithmStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        if the overall status is <code>Failed</code>, the reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     * 
     * @return if the overall status is <code>Failed</code>, the reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        if the overall status is <code>Failed</code>, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmStatusItem withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmStatusItem == false)
            return false;
        AlgorithmStatusItem other = (AlgorithmStatusItem) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public AlgorithmStatusItem clone() {
        try {
            return (AlgorithmStatusItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AlgorithmStatusItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
