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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The fields that you want to update in the output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */
    private java.util.List<String> cidrAllowList;
    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     */
    private String description;
    /** The IP address where you want to send the output. */
    private String destination;
    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     */
    private UpdateEncryption encryption;
    /** The flow that is associated with the output that you want to update. */
    private String flowArn;
    /** The maximum latency in milliseconds for Zixi-based streams. */
    private Integer maxLatency;
    /**
     * The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this value that
     * you set on your MediaConnect source or output represents the minimal potential latency of that connection. The
     * latency of the stream is set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     */
    private Integer minLatency;
    /** The ARN of the output that you want to update. */
    private String outputArn;
    /** The port to use when content is distributed to this output. */
    private Integer port;
    /** The protocol to use for the output. */
    private String protocol;
    /** The remote ID for the Zixi-pull stream. */
    private String remoteId;
    /** The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams. */
    private Integer smoothingLatency;
    /** The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams. */
    private String streamId;
    /** The name of the VPC interface attachment to use for this output. */
    private VpcInterfaceAttachment vpcInterfaceAttachment;

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @return The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *         addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *         10.0.0.0/16.
     */

    public java.util.List<String> getCidrAllowList() {
        return cidrAllowList;
    }

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param cidrAllowList
     *        The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *        addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *        10.0.0.0/16.
     */

    public void setCidrAllowList(java.util.Collection<String> cidrAllowList) {
        if (cidrAllowList == null) {
            this.cidrAllowList = null;
            return;
        }

        this.cidrAllowList = new java.util.ArrayList<String>(cidrAllowList);
    }

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrAllowList(java.util.Collection)} or {@link #withCidrAllowList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cidrAllowList
     *        The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *        addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *        10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withCidrAllowList(String... cidrAllowList) {
        if (this.cidrAllowList == null) {
            setCidrAllowList(new java.util.ArrayList<String>(cidrAllowList.length));
        }
        for (String ele : cidrAllowList) {
            this.cidrAllowList.add(ele);
        }
        return this;
    }

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param cidrAllowList
     *        The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *        addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *        10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withCidrAllowList(java.util.Collection<String> cidrAllowList) {
        setCidrAllowList(cidrAllowList);
        return this;
    }

    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     * 
     * @param description
     *        A description of the output. This description appears only on the AWS Elemental MediaConnect console and
     *        will not be seen by the end user.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     * 
     * @return A description of the output. This description appears only on the AWS Elemental MediaConnect console and
     *         will not be seen by the end user.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     * 
     * @param description
     *        A description of the output. This description appears only on the AWS Elemental MediaConnect console and
     *        will not be seen by the end user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The IP address where you want to send the output.
     * 
     * @param destination
     *        The IP address where you want to send the output.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * The IP address where you want to send the output.
     * 
     * @return The IP address where you want to send the output.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * The IP address where you want to send the output.
     * 
     * @param destination
     *        The IP address where you want to send the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @param encryption
     *        The type of key used for the encryption. If no keyType is provided, the service will use the default
     *        setting (static-key).
     */

    public void setEncryption(UpdateEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @return The type of key used for the encryption. If no keyType is provided, the service will use the default
     *         setting (static-key).
     */

    public UpdateEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @param encryption
     *        The type of key used for the encryption. If no keyType is provided, the service will use the default
     *        setting (static-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withEncryption(UpdateEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * The flow that is associated with the output that you want to update.
     * 
     * @param flowArn
     *        The flow that is associated with the output that you want to update.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that is associated with the output that you want to update.
     * 
     * @return The flow that is associated with the output that you want to update.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that is associated with the output that you want to update.
     * 
     * @param flowArn
     *        The flow that is associated with the output that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The maximum latency in milliseconds for Zixi-based streams.
     * 
     * @param maxLatency
     *        The maximum latency in milliseconds for Zixi-based streams.
     */

    public void setMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * The maximum latency in milliseconds for Zixi-based streams.
     * 
     * @return The maximum latency in milliseconds for Zixi-based streams.
     */

    public Integer getMaxLatency() {
        return this.maxLatency;
    }

    /**
     * The maximum latency in milliseconds for Zixi-based streams.
     * 
     * @param maxLatency
     *        The maximum latency in milliseconds for Zixi-based streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withMaxLatency(Integer maxLatency) {
        setMaxLatency(maxLatency);
        return this;
    }

    /**
     * The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this value that
     * you set on your MediaConnect source or output represents the minimal potential latency of that connection. The
     * latency of the stream is set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     * 
     * @param minLatency
     *        The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this
     *        value that you set on your MediaConnect source or output represents the minimal potential latency of that
     *        connection. The latency of the stream is set to the highest number between the sender’s minimum latency
     *        and the receiver’s minimum latency.
     */

    public void setMinLatency(Integer minLatency) {
        this.minLatency = minLatency;
    }

    /**
     * The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this value that
     * you set on your MediaConnect source or output represents the minimal potential latency of that connection. The
     * latency of the stream is set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     * 
     * @return The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this
     *         value that you set on your MediaConnect source or output represents the minimal potential latency of that
     *         connection. The latency of the stream is set to the highest number between the sender’s minimum latency
     *         and the receiver’s minimum latency.
     */

    public Integer getMinLatency() {
        return this.minLatency;
    }

    /**
     * The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this value that
     * you set on your MediaConnect source or output represents the minimal potential latency of that connection. The
     * latency of the stream is set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     * 
     * @param minLatency
     *        The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this
     *        value that you set on your MediaConnect source or output represents the minimal potential latency of that
     *        connection. The latency of the stream is set to the highest number between the sender’s minimum latency
     *        and the receiver’s minimum latency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withMinLatency(Integer minLatency) {
        setMinLatency(minLatency);
        return this;
    }

    /**
     * The ARN of the output that you want to update.
     * 
     * @param outputArn
     *        The ARN of the output that you want to update.
     */

    public void setOutputArn(String outputArn) {
        this.outputArn = outputArn;
    }

    /**
     * The ARN of the output that you want to update.
     * 
     * @return The ARN of the output that you want to update.
     */

    public String getOutputArn() {
        return this.outputArn;
    }

    /**
     * The ARN of the output that you want to update.
     * 
     * @param outputArn
     *        The ARN of the output that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withOutputArn(String outputArn) {
        setOutputArn(outputArn);
        return this;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @param port
     *        The port to use when content is distributed to this output.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @return The port to use when content is distributed to this output.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @param port
     *        The port to use when content is distributed to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * The protocol to use for the output.
     * 
     * @param protocol
     *        The protocol to use for the output.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * The protocol to use for the output.
     * 
     * @return The protocol to use for the output.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The protocol to use for the output.
     * 
     * @param protocol
     *        The protocol to use for the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateFlowOutputRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * The protocol to use for the output.
     * 
     * @param protocol
     *        The protocol to use for the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateFlowOutputRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * The remote ID for the Zixi-pull stream.
     * 
     * @param remoteId
     *        The remote ID for the Zixi-pull stream.
     */

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    /**
     * The remote ID for the Zixi-pull stream.
     * 
     * @return The remote ID for the Zixi-pull stream.
     */

    public String getRemoteId() {
        return this.remoteId;
    }

    /**
     * The remote ID for the Zixi-pull stream.
     * 
     * @param remoteId
     *        The remote ID for the Zixi-pull stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withRemoteId(String remoteId) {
        setRemoteId(remoteId);
        return this;
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * 
     * @param smoothingLatency
     *        The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     */

    public void setSmoothingLatency(Integer smoothingLatency) {
        this.smoothingLatency = smoothingLatency;
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * 
     * @return The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     */

    public Integer getSmoothingLatency() {
        return this.smoothingLatency;
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * 
     * @param smoothingLatency
     *        The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withSmoothingLatency(Integer smoothingLatency) {
        setSmoothingLatency(smoothingLatency);
        return this;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     * @param streamId
     *        The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     * @return The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     * @param streamId
     *        The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * The name of the VPC interface attachment to use for this output.
     * 
     * @param vpcInterfaceAttachment
     *        The name of the VPC interface attachment to use for this output.
     */

    public void setVpcInterfaceAttachment(VpcInterfaceAttachment vpcInterfaceAttachment) {
        this.vpcInterfaceAttachment = vpcInterfaceAttachment;
    }

    /**
     * The name of the VPC interface attachment to use for this output.
     * 
     * @return The name of the VPC interface attachment to use for this output.
     */

    public VpcInterfaceAttachment getVpcInterfaceAttachment() {
        return this.vpcInterfaceAttachment;
    }

    /**
     * The name of the VPC interface attachment to use for this output.
     * 
     * @param vpcInterfaceAttachment
     *        The name of the VPC interface attachment to use for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowOutputRequest withVpcInterfaceAttachment(VpcInterfaceAttachment vpcInterfaceAttachment) {
        setVpcInterfaceAttachment(vpcInterfaceAttachment);
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
        if (getCidrAllowList() != null)
            sb.append("CidrAllowList: ").append(getCidrAllowList()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getMaxLatency() != null)
            sb.append("MaxLatency: ").append(getMaxLatency()).append(",");
        if (getMinLatency() != null)
            sb.append("MinLatency: ").append(getMinLatency()).append(",");
        if (getOutputArn() != null)
            sb.append("OutputArn: ").append(getOutputArn()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getRemoteId() != null)
            sb.append("RemoteId: ").append(getRemoteId()).append(",");
        if (getSmoothingLatency() != null)
            sb.append("SmoothingLatency: ").append(getSmoothingLatency()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId()).append(",");
        if (getVpcInterfaceAttachment() != null)
            sb.append("VpcInterfaceAttachment: ").append(getVpcInterfaceAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlowOutputRequest == false)
            return false;
        UpdateFlowOutputRequest other = (UpdateFlowOutputRequest) obj;
        if (other.getCidrAllowList() == null ^ this.getCidrAllowList() == null)
            return false;
        if (other.getCidrAllowList() != null && other.getCidrAllowList().equals(this.getCidrAllowList()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getMaxLatency() == null ^ this.getMaxLatency() == null)
            return false;
        if (other.getMaxLatency() != null && other.getMaxLatency().equals(this.getMaxLatency()) == false)
            return false;
        if (other.getMinLatency() == null ^ this.getMinLatency() == null)
            return false;
        if (other.getMinLatency() != null && other.getMinLatency().equals(this.getMinLatency()) == false)
            return false;
        if (other.getOutputArn() == null ^ this.getOutputArn() == null)
            return false;
        if (other.getOutputArn() != null && other.getOutputArn().equals(this.getOutputArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRemoteId() == null ^ this.getRemoteId() == null)
            return false;
        if (other.getRemoteId() != null && other.getRemoteId().equals(this.getRemoteId()) == false)
            return false;
        if (other.getSmoothingLatency() == null ^ this.getSmoothingLatency() == null)
            return false;
        if (other.getSmoothingLatency() != null && other.getSmoothingLatency().equals(this.getSmoothingLatency()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getVpcInterfaceAttachment() == null ^ this.getVpcInterfaceAttachment() == null)
            return false;
        if (other.getVpcInterfaceAttachment() != null && other.getVpcInterfaceAttachment().equals(this.getVpcInterfaceAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrAllowList() == null) ? 0 : getCidrAllowList().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        hashCode = prime * hashCode + ((getMinLatency() == null) ? 0 : getMinLatency().hashCode());
        hashCode = prime * hashCode + ((getOutputArn() == null) ? 0 : getOutputArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRemoteId() == null) ? 0 : getRemoteId().hashCode());
        hashCode = prime * hashCode + ((getSmoothingLatency() == null) ? 0 : getSmoothingLatency().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getVpcInterfaceAttachment() == null) ? 0 : getVpcInterfaceAttachment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowOutputRequest clone() {
        return (UpdateFlowOutputRequest) super.clone();
    }

}
