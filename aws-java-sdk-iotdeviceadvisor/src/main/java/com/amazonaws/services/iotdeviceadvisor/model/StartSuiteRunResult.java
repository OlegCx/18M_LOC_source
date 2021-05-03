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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StartSuiteRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSuiteRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite Run Id.
     * </p>
     */
    private String suiteRunId;
    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite run arn.
     * </p>
     */
    private String suiteRunArn;
    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite create time.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite Run Id.
     * </p>
     * 
     * @param suiteRunId
     *        Starts a Device Advisor test suite run based on suite Run Id.
     */

    public void setSuiteRunId(String suiteRunId) {
        this.suiteRunId = suiteRunId;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite Run Id.
     * </p>
     * 
     * @return Starts a Device Advisor test suite run based on suite Run Id.
     */

    public String getSuiteRunId() {
        return this.suiteRunId;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite Run Id.
     * </p>
     * 
     * @param suiteRunId
     *        Starts a Device Advisor test suite run based on suite Run Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunResult withSuiteRunId(String suiteRunId) {
        setSuiteRunId(suiteRunId);
        return this;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite run arn.
     * </p>
     * 
     * @param suiteRunArn
     *        Starts a Device Advisor test suite run based on suite run arn.
     */

    public void setSuiteRunArn(String suiteRunArn) {
        this.suiteRunArn = suiteRunArn;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite run arn.
     * </p>
     * 
     * @return Starts a Device Advisor test suite run based on suite run arn.
     */

    public String getSuiteRunArn() {
        return this.suiteRunArn;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite run arn.
     * </p>
     * 
     * @param suiteRunArn
     *        Starts a Device Advisor test suite run based on suite run arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunResult withSuiteRunArn(String suiteRunArn) {
        setSuiteRunArn(suiteRunArn);
        return this;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite create time.
     * </p>
     * 
     * @param createdAt
     *        Starts a Device Advisor test suite run based on suite create time.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite create time.
     * </p>
     * 
     * @return Starts a Device Advisor test suite run based on suite create time.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Starts a Device Advisor test suite run based on suite create time.
     * </p>
     * 
     * @param createdAt
     *        Starts a Device Advisor test suite run based on suite create time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getSuiteRunId() != null)
            sb.append("SuiteRunId: ").append(getSuiteRunId()).append(",");
        if (getSuiteRunArn() != null)
            sb.append("SuiteRunArn: ").append(getSuiteRunArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSuiteRunResult == false)
            return false;
        StartSuiteRunResult other = (StartSuiteRunResult) obj;
        if (other.getSuiteRunId() == null ^ this.getSuiteRunId() == null)
            return false;
        if (other.getSuiteRunId() != null && other.getSuiteRunId().equals(this.getSuiteRunId()) == false)
            return false;
        if (other.getSuiteRunArn() == null ^ this.getSuiteRunArn() == null)
            return false;
        if (other.getSuiteRunArn() != null && other.getSuiteRunArn().equals(this.getSuiteRunArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteRunId() == null) ? 0 : getSuiteRunId().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunArn() == null) ? 0 : getSuiteRunArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public StartSuiteRunResult clone() {
        try {
            return (StartSuiteRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
