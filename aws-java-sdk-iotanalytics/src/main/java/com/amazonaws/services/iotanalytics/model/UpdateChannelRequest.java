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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the channel to be updated.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * Where channel data is stored. You can choose one of <code>serviceManagedS3</code> or
     * <code>customerManagedS3</code> storage. If not specified, the default is <code>serviceManagedS3</code>. You
     * cannot change this storage option after the channel is created.
     * </p>
     */
    private ChannelStorage channelStorage;
    /**
     * <p>
     * How long, in days, message data is kept for the channel. The retention period cannot be updated if the channel's
     * S3 storage is customer-managed.
     * </p>
     */
    private RetentionPeriod retentionPeriod;

    /**
     * <p>
     * The name of the channel to be updated.
     * </p>
     * 
     * @param channelName
     *        The name of the channel to be updated.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel to be updated.
     * </p>
     * 
     * @return The name of the channel to be updated.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel to be updated.
     * </p>
     * 
     * @param channelName
     *        The name of the channel to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * Where channel data is stored. You can choose one of <code>serviceManagedS3</code> or
     * <code>customerManagedS3</code> storage. If not specified, the default is <code>serviceManagedS3</code>. You
     * cannot change this storage option after the channel is created.
     * </p>
     * 
     * @param channelStorage
     *        Where channel data is stored. You can choose one of <code>serviceManagedS3</code> or
     *        <code>customerManagedS3</code> storage. If not specified, the default is <code>serviceManagedS3</code>.
     *        You cannot change this storage option after the channel is created.
     */

    public void setChannelStorage(ChannelStorage channelStorage) {
        this.channelStorage = channelStorage;
    }

    /**
     * <p>
     * Where channel data is stored. You can choose one of <code>serviceManagedS3</code> or
     * <code>customerManagedS3</code> storage. If not specified, the default is <code>serviceManagedS3</code>. You
     * cannot change this storage option after the channel is created.
     * </p>
     * 
     * @return Where channel data is stored. You can choose one of <code>serviceManagedS3</code> or
     *         <code>customerManagedS3</code> storage. If not specified, the default is <code>serviceManagedS3</code>.
     *         You cannot change this storage option after the channel is created.
     */

    public ChannelStorage getChannelStorage() {
        return this.channelStorage;
    }

    /**
     * <p>
     * Where channel data is stored. You can choose one of <code>serviceManagedS3</code> or
     * <code>customerManagedS3</code> storage. If not specified, the default is <code>serviceManagedS3</code>. You
     * cannot change this storage option after the channel is created.
     * </p>
     * 
     * @param channelStorage
     *        Where channel data is stored. You can choose one of <code>serviceManagedS3</code> or
     *        <code>customerManagedS3</code> storage. If not specified, the default is <code>serviceManagedS3</code>.
     *        You cannot change this storage option after the channel is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withChannelStorage(ChannelStorage channelStorage) {
        setChannelStorage(channelStorage);
        return this;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the channel. The retention period cannot be updated if the channel's
     * S3 storage is customer-managed.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the channel. The retention period cannot be updated if the
     *        channel's S3 storage is customer-managed.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the channel. The retention period cannot be updated if the channel's
     * S3 storage is customer-managed.
     * </p>
     * 
     * @return How long, in days, message data is kept for the channel. The retention period cannot be updated if the
     *         channel's S3 storage is customer-managed.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the channel. The retention period cannot be updated if the channel's
     * S3 storage is customer-managed.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the channel. The retention period cannot be updated if the
     *        channel's S3 storage is customer-managed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelStorage() != null)
            sb.append("ChannelStorage: ").append(getChannelStorage()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelRequest == false)
            return false;
        UpdateChannelRequest other = (UpdateChannelRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelStorage() == null ^ this.getChannelStorage() == null)
            return false;
        if (other.getChannelStorage() != null && other.getChannelStorage().equals(this.getChannelStorage()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelStorage() == null) ? 0 : getChannelStorage().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelRequest clone() {
        return (UpdateChannelRequest) super.clone();
    }

}
