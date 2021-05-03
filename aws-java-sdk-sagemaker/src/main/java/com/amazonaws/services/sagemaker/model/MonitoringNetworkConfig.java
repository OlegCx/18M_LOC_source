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
 * The networking configuration for the monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringNetworkConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringNetworkConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     * <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs, but the
     * processing might take longer.
     * </p>
     */
    private Boolean enableInterContainerTrafficEncryption;
    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
     * </p>
     */
    private Boolean enableNetworkIsolation;

    private VpcConfig vpcConfig;

    /**
     * <p>
     * Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     * <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs, but the
     * processing might take longer.
     * </p>
     * 
     * @param enableInterContainerTrafficEncryption
     *        Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     *        <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs,
     *        but the processing might take longer.
     */

    public void setEnableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     * <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs, but the
     * processing might take longer.
     * </p>
     * 
     * @return Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     *         <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs,
     *         but the processing might take longer.
     */

    public Boolean getEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     * <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs, but the
     * processing might take longer.
     * </p>
     * 
     * @param enableInterContainerTrafficEncryption
     *        Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     *        <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs,
     *        but the processing might take longer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringNetworkConfig withEnableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
        setEnableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption);
        return this;
    }

    /**
     * <p>
     * Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     * <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs, but the
     * processing might take longer.
     * </p>
     * 
     * @return Whether to encrypt all communications between the instances used for the monitoring jobs. Choose
     *         <code>True</code> to encrypt communications. Encryption provides greater security for distributed jobs,
     *         but the processing might take longer.
     */

    public Boolean isEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        Whether to allow inbound and outbound network calls to and from the containers used for the monitoring
     *        job.
     */

    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
     * </p>
     * 
     * @return Whether to allow inbound and outbound network calls to and from the containers used for the monitoring
     *         job.
     */

    public Boolean getEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
     * </p>
     * 
     * @param enableNetworkIsolation
     *        Whether to allow inbound and outbound network calls to and from the containers used for the monitoring
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringNetworkConfig withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        setEnableNetworkIsolation(enableNetworkIsolation);
        return this;
    }

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
     * </p>
     * 
     * @return Whether to allow inbound and outbound network calls to and from the containers used for the monitoring
     *         job.
     */

    public Boolean isEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringNetworkConfig withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: ").append(getEnableInterContainerTrafficEncryption()).append(",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: ").append(getEnableNetworkIsolation()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringNetworkConfig == false)
            return false;
        MonitoringNetworkConfig other = (MonitoringNetworkConfig) obj;
        if (other.getEnableInterContainerTrafficEncryption() == null ^ this.getEnableInterContainerTrafficEncryption() == null)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() != null
                && other.getEnableInterContainerTrafficEncryption().equals(this.getEnableInterContainerTrafficEncryption()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableInterContainerTrafficEncryption() == null) ? 0 : getEnableInterContainerTrafficEncryption().hashCode());
        hashCode = prime * hashCode + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringNetworkConfig clone() {
        try {
            return (MonitoringNetworkConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringNetworkConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
