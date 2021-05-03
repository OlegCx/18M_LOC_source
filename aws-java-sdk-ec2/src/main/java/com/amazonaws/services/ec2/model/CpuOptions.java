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

/**
 * <p>
 * The CPU options for the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CpuOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CpuOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     */
    private Integer coreCount;
    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     */
    private Integer threadsPerCore;

    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     * 
     * @param coreCount
     *        The number of CPU cores for the instance.
     */

    public void setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
    }

    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     * 
     * @return The number of CPU cores for the instance.
     */

    public Integer getCoreCount() {
        return this.coreCount;
    }

    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     * 
     * @param coreCount
     *        The number of CPU cores for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CpuOptions withCoreCount(Integer coreCount) {
        setCoreCount(coreCount);
        return this;
    }

    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     * 
     * @param threadsPerCore
     *        The number of threads per CPU core.
     */

    public void setThreadsPerCore(Integer threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
    }

    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     * 
     * @return The number of threads per CPU core.
     */

    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }

    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     * 
     * @param threadsPerCore
     *        The number of threads per CPU core.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CpuOptions withThreadsPerCore(Integer threadsPerCore) {
        setThreadsPerCore(threadsPerCore);
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
        if (getCoreCount() != null)
            sb.append("CoreCount: ").append(getCoreCount()).append(",");
        if (getThreadsPerCore() != null)
            sb.append("ThreadsPerCore: ").append(getThreadsPerCore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CpuOptions == false)
            return false;
        CpuOptions other = (CpuOptions) obj;
        if (other.getCoreCount() == null ^ this.getCoreCount() == null)
            return false;
        if (other.getCoreCount() != null && other.getCoreCount().equals(this.getCoreCount()) == false)
            return false;
        if (other.getThreadsPerCore() == null ^ this.getThreadsPerCore() == null)
            return false;
        if (other.getThreadsPerCore() != null && other.getThreadsPerCore().equals(this.getThreadsPerCore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreCount() == null) ? 0 : getCoreCount().hashCode());
        hashCode = prime * hashCode + ((getThreadsPerCore() == null) ? 0 : getThreadsPerCore().hashCode());
        return hashCode;
    }

    @Override
    public CpuOptions clone() {
        try {
            return (CpuOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
