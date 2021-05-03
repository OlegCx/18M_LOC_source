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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogTargetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A log target
     * </p>
     */
    private LogTarget logTarget;
    /**
     * <p>
     * The logging level.
     * </p>
     */
    private String logLevel;

    /**
     * <p>
     * A log target
     * </p>
     * 
     * @param logTarget
     *        A log target
     */

    public void setLogTarget(LogTarget logTarget) {
        this.logTarget = logTarget;
    }

    /**
     * <p>
     * A log target
     * </p>
     * 
     * @return A log target
     */

    public LogTarget getLogTarget() {
        return this.logTarget;
    }

    /**
     * <p>
     * A log target
     * </p>
     * 
     * @param logTarget
     *        A log target
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogTargetConfiguration withLogTarget(LogTarget logTarget) {
        setLogTarget(logTarget);
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @param logLevel
     *        The logging level.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @return The logging level.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @param logLevel
     *        The logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public LogTargetConfiguration withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * 
     * @param logLevel
     *        The logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public LogTargetConfiguration withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
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
        if (getLogTarget() != null)
            sb.append("LogTarget: ").append(getLogTarget()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogTargetConfiguration == false)
            return false;
        LogTargetConfiguration other = (LogTargetConfiguration) obj;
        if (other.getLogTarget() == null ^ this.getLogTarget() == null)
            return false;
        if (other.getLogTarget() != null && other.getLogTarget().equals(this.getLogTarget()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogTarget() == null) ? 0 : getLogTarget().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public LogTargetConfiguration clone() {
        try {
            return (LogTargetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.LogTargetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
