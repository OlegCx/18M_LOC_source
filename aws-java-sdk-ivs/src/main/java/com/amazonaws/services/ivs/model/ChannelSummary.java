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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ChannelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Channel ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Channel name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the Amazon IVS
     * console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard, respectively.)
     * </p>
     */
    private String latencyMode;
    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     */
    private Boolean authorized;
    /**
     * <p>
     * Recording-configuration ARN. A value other than an empty string indicates that recording is enabled. Default: ""
     * (empty string, recording is disabled).
     * </p>
     */
    private String recordingConfigurationArn;
    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @param arn
     *        Channel ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @return Channel ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @param arn
     *        Channel ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @param name
     *        Channel name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @return Channel name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @param name
     *        Channel name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the Amazon IVS
     * console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard, respectively.)
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *        <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the
     *        Amazon IVS console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard,
     *        respectively.)
     * @see ChannelLatencyMode
     */

    public void setLatencyMode(String latencyMode) {
        this.latencyMode = latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the Amazon IVS
     * console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard, respectively.)
     * </p>
     * 
     * @return Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *         <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the
     *         Amazon IVS console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard,
     *         respectively.)
     * @see ChannelLatencyMode
     */

    public String getLatencyMode() {
        return this.latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the Amazon IVS
     * console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard, respectively.)
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *        <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the
     *        Amazon IVS console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard,
     *        respectively.)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public ChannelSummary withLatencyMode(String latencyMode) {
        setLatencyMode(latencyMode);
        return this;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the Amazon IVS
     * console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard, respectively.)
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *        <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>. (Note: In the
     *        Amazon IVS console, <code>LOW</code> and <code>NORMAL</code> correspond to Ultra-low and Standard,
     *        respectively.)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public ChannelSummary withLatencyMode(ChannelLatencyMode latencyMode) {
        this.latencyMode = latencyMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @param authorized
     *        Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     */

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     */

    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @param authorized
     *        Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSummary withAuthorized(Boolean authorized) {
        setAuthorized(authorized);
        return this;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     */

    public Boolean isAuthorized() {
        return this.authorized;
    }

    /**
     * <p>
     * Recording-configuration ARN. A value other than an empty string indicates that recording is enabled. Default: ""
     * (empty string, recording is disabled).
     * </p>
     * 
     * @param recordingConfigurationArn
     *        Recording-configuration ARN. A value other than an empty string indicates that recording is enabled.
     *        Default: "" (empty string, recording is disabled).
     */

    public void setRecordingConfigurationArn(String recordingConfigurationArn) {
        this.recordingConfigurationArn = recordingConfigurationArn;
    }

    /**
     * <p>
     * Recording-configuration ARN. A value other than an empty string indicates that recording is enabled. Default: ""
     * (empty string, recording is disabled).
     * </p>
     * 
     * @return Recording-configuration ARN. A value other than an empty string indicates that recording is enabled.
     *         Default: "" (empty string, recording is disabled).
     */

    public String getRecordingConfigurationArn() {
        return this.recordingConfigurationArn;
    }

    /**
     * <p>
     * Recording-configuration ARN. A value other than an empty string indicates that recording is enabled. Default: ""
     * (empty string, recording is disabled).
     * </p>
     * 
     * @param recordingConfigurationArn
     *        Recording-configuration ARN. A value other than an empty string indicates that recording is enabled.
     *        Default: "" (empty string, recording is disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSummary withRecordingConfigurationArn(String recordingConfigurationArn) {
        setRecordingConfigurationArn(recordingConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ChannelSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSummary clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLatencyMode() != null)
            sb.append("LatencyMode: ").append(getLatencyMode()).append(",");
        if (getAuthorized() != null)
            sb.append("Authorized: ").append(getAuthorized()).append(",");
        if (getRecordingConfigurationArn() != null)
            sb.append("RecordingConfigurationArn: ").append(getRecordingConfigurationArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelSummary == false)
            return false;
        ChannelSummary other = (ChannelSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLatencyMode() == null ^ this.getLatencyMode() == null)
            return false;
        if (other.getLatencyMode() != null && other.getLatencyMode().equals(this.getLatencyMode()) == false)
            return false;
        if (other.getAuthorized() == null ^ this.getAuthorized() == null)
            return false;
        if (other.getAuthorized() != null && other.getAuthorized().equals(this.getAuthorized()) == false)
            return false;
        if (other.getRecordingConfigurationArn() == null ^ this.getRecordingConfigurationArn() == null)
            return false;
        if (other.getRecordingConfigurationArn() != null && other.getRecordingConfigurationArn().equals(this.getRecordingConfigurationArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLatencyMode() == null) ? 0 : getLatencyMode().hashCode());
        hashCode = prime * hashCode + ((getAuthorized() == null) ? 0 : getAuthorized().hashCode());
        hashCode = prime * hashCode + ((getRecordingConfigurationArn() == null) ? 0 : getRecordingConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ChannelSummary clone() {
        try {
            return (ChannelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.ChannelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
