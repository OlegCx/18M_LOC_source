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
 * Describes the client connection logging options for the Client VPN endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConnectionLogOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionLogOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether connection logging is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the CloudWatch Logs log group. Required if connection logging is enabled.
     * </p>
     */
    private String cloudwatchLogGroup;
    /**
     * <p>
     * The name of the CloudWatch Logs log stream to which the connection data is published.
     * </p>
     */
    private String cloudwatchLogStream;

    /**
     * <p>
     * Indicates whether connection logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether connection logging is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether connection logging is enabled.
     * </p>
     * 
     * @return Indicates whether connection logging is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether connection logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether connection logging is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionLogOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether connection logging is enabled.
     * </p>
     * 
     * @return Indicates whether connection logging is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log group. Required if connection logging is enabled.
     * </p>
     * 
     * @param cloudwatchLogGroup
     *        The name of the CloudWatch Logs log group. Required if connection logging is enabled.
     */

    public void setCloudwatchLogGroup(String cloudwatchLogGroup) {
        this.cloudwatchLogGroup = cloudwatchLogGroup;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log group. Required if connection logging is enabled.
     * </p>
     * 
     * @return The name of the CloudWatch Logs log group. Required if connection logging is enabled.
     */

    public String getCloudwatchLogGroup() {
        return this.cloudwatchLogGroup;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log group. Required if connection logging is enabled.
     * </p>
     * 
     * @param cloudwatchLogGroup
     *        The name of the CloudWatch Logs log group. Required if connection logging is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionLogOptions withCloudwatchLogGroup(String cloudwatchLogGroup) {
        setCloudwatchLogGroup(cloudwatchLogGroup);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log stream to which the connection data is published.
     * </p>
     * 
     * @param cloudwatchLogStream
     *        The name of the CloudWatch Logs log stream to which the connection data is published.
     */

    public void setCloudwatchLogStream(String cloudwatchLogStream) {
        this.cloudwatchLogStream = cloudwatchLogStream;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log stream to which the connection data is published.
     * </p>
     * 
     * @return The name of the CloudWatch Logs log stream to which the connection data is published.
     */

    public String getCloudwatchLogStream() {
        return this.cloudwatchLogStream;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log stream to which the connection data is published.
     * </p>
     * 
     * @param cloudwatchLogStream
     *        The name of the CloudWatch Logs log stream to which the connection data is published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionLogOptions withCloudwatchLogStream(String cloudwatchLogStream) {
        setCloudwatchLogStream(cloudwatchLogStream);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getCloudwatchLogGroup() != null)
            sb.append("CloudwatchLogGroup: ").append(getCloudwatchLogGroup()).append(",");
        if (getCloudwatchLogStream() != null)
            sb.append("CloudwatchLogStream: ").append(getCloudwatchLogStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionLogOptions == false)
            return false;
        ConnectionLogOptions other = (ConnectionLogOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCloudwatchLogGroup() == null ^ this.getCloudwatchLogGroup() == null)
            return false;
        if (other.getCloudwatchLogGroup() != null && other.getCloudwatchLogGroup().equals(this.getCloudwatchLogGroup()) == false)
            return false;
        if (other.getCloudwatchLogStream() == null ^ this.getCloudwatchLogStream() == null)
            return false;
        if (other.getCloudwatchLogStream() != null && other.getCloudwatchLogStream().equals(this.getCloudwatchLogStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogGroup() == null) ? 0 : getCloudwatchLogGroup().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogStream() == null) ? 0 : getCloudwatchLogStream().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionLogOptions clone() {
        try {
            return (ConnectionLogOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
