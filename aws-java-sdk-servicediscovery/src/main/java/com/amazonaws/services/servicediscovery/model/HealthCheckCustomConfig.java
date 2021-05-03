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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about an optional custom health check. A custom health check, which requires
 * that you use a third-party health checker to evaluate the health of your resources, is useful in the following
 * circumstances:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can't use a health check that is defined by <code>HealthCheckConfig</code> because the resource isn't available
 * over the internet. For example, you can use a custom health check when the instance is in an Amazon VPC. (To check
 * the health of resources in a VPC, the health checker must also be in the VPC.)
 * </p>
 * </li>
 * <li>
 * <p>
 * You want to use a third-party health checker regardless of where your resources are.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
 * <code>HealthCheckConfig</code> but not both.
 * </p>
 * </important>
 * <p>
 * To change the status of a custom health check, submit an <code>UpdateInstanceCustomHealthStatus</code> request. AWS
 * Cloud Map doesn't monitor the status of the resource, it just keeps a record of the status specified in the most
 * recent <code>UpdateInstanceCustomHealthStatus</code> request.
 * </p>
 * <p>
 * Here's how custom health checks work:
 * </p>
 * <ol>
 * <li>
 * <p>
 * You create a service and specify a value for <code>FailureThreshold</code>.
 * </p>
 * <p>
 * The failure threshold indicates the number of 30-second intervals you want AWS Cloud Map to wait between the time
 * that your application sends an <a
 * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
 * >UpdateInstanceCustomHealthStatus</a> request and the time that AWS Cloud Map stops routing internet traffic to the
 * corresponding resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * You register an instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * You configure a third-party health checker to monitor the resource that is associated with the new instance.
 * </p>
 * <note>
 * <p>
 * AWS Cloud Map doesn't check the health of the resource directly.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * The third-party health-checker determines that the resource is unhealthy and notifies your application.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your application submits an <code>UpdateInstanceCustomHealthStatus</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
 * </p>
 * </li>
 * <li>
 * <p>
 * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't arrive during that time to change the status
 * back to healthy, AWS Cloud Map stops routing traffic to the resource.
 * </p>
 * </li>
 * </ol>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/HealthCheckCustomConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckCustomConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <important>
     * <p>
     * This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30 seconds after
     * receiving an <code>UpdateInstanceCustomHealthStatus</code> request before changing the status of the service
     * instance.
     * </p>
     * </important>
     * <p>
     * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     * <code>UpdateInstanceCustomHealthStatus</code> request before it changes the health status of a service instance.
     * </p>
     * <p>
     * Sending a second or subsequent <code>UpdateInstanceCustomHealthStatus</code> request with the same value before
     * 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits <code>30</code> seconds after the
     * first request to make the change.
     * </p>
     */
    @Deprecated
    private Integer failureThreshold;

    /**
     * <important>
     * <p>
     * This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30 seconds after
     * receiving an <code>UpdateInstanceCustomHealthStatus</code> request before changing the status of the service
     * instance.
     * </p>
     * </important>
     * <p>
     * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     * <code>UpdateInstanceCustomHealthStatus</code> request before it changes the health status of a service instance.
     * </p>
     * <p>
     * Sending a second or subsequent <code>UpdateInstanceCustomHealthStatus</code> request with the same value before
     * 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits <code>30</code> seconds after the
     * first request to make the change.
     * </p>
     * 
     * @param failureThreshold
     *        <p>
     *        This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30
     *        seconds after receiving an <code>UpdateInstanceCustomHealthStatus</code> request before changing the
     *        status of the service instance.
     *        </p>
     *        </important>
     *        <p>
     *        The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     *        <code>UpdateInstanceCustomHealthStatus</code> request before it changes the health status of a service
     *        instance.
     *        </p>
     *        <p>
     *        Sending a second or subsequent <code>UpdateInstanceCustomHealthStatus</code> request with the same value
     *        before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits <code>30</code>
     *        seconds after the first request to make the change.
     */
    @Deprecated
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * <important>
     * <p>
     * This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30 seconds after
     * receiving an <code>UpdateInstanceCustomHealthStatus</code> request before changing the status of the service
     * instance.
     * </p>
     * </important>
     * <p>
     * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     * <code>UpdateInstanceCustomHealthStatus</code> request before it changes the health status of a service instance.
     * </p>
     * <p>
     * Sending a second or subsequent <code>UpdateInstanceCustomHealthStatus</code> request with the same value before
     * 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits <code>30</code> seconds after the
     * first request to make the change.
     * </p>
     * 
     * @return <p>
     *         This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30
     *         seconds after receiving an <code>UpdateInstanceCustomHealthStatus</code> request before changing the
     *         status of the service instance.
     *         </p>
     *         </important>
     *         <p>
     *         The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     *         <code>UpdateInstanceCustomHealthStatus</code> request before it changes the health status of a service
     *         instance.
     *         </p>
     *         <p>
     *         Sending a second or subsequent <code>UpdateInstanceCustomHealthStatus</code> request with the same value
     *         before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits <code>30</code>
     *         seconds after the first request to make the change.
     */
    @Deprecated
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * <important>
     * <p>
     * This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30 seconds after
     * receiving an <code>UpdateInstanceCustomHealthStatus</code> request before changing the status of the service
     * instance.
     * </p>
     * </important>
     * <p>
     * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     * <code>UpdateInstanceCustomHealthStatus</code> request before it changes the health status of a service instance.
     * </p>
     * <p>
     * Sending a second or subsequent <code>UpdateInstanceCustomHealthStatus</code> request with the same value before
     * 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits <code>30</code> seconds after the
     * first request to make the change.
     * </p>
     * 
     * @param failureThreshold
     *        <p>
     *        This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30
     *        seconds after receiving an <code>UpdateInstanceCustomHealthStatus</code> request before changing the
     *        status of the service instance.
     *        </p>
     *        </important>
     *        <p>
     *        The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     *        <code>UpdateInstanceCustomHealthStatus</code> request before it changes the health status of a service
     *        instance.
     *        </p>
     *        <p>
     *        Sending a second or subsequent <code>UpdateInstanceCustomHealthStatus</code> request with the same value
     *        before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits <code>30</code>
     *        seconds after the first request to make the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public HealthCheckCustomConfig withFailureThreshold(Integer failureThreshold) {
        setFailureThreshold(failureThreshold);
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
        if (getFailureThreshold() != null)
            sb.append("FailureThreshold: ").append(getFailureThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckCustomConfig == false)
            return false;
        HealthCheckCustomConfig other = (HealthCheckCustomConfig) obj;
        if (other.getFailureThreshold() == null ^ this.getFailureThreshold() == null)
            return false;
        if (other.getFailureThreshold() != null && other.getFailureThreshold().equals(this.getFailureThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureThreshold() == null) ? 0 : getFailureThreshold().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckCustomConfig clone() {
        try {
            return (HealthCheckCustomConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.HealthCheckCustomConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
