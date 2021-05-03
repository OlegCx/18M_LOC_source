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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you don't need
     * to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     */
    private String throughputMode;
    /**
     * <p>
     * (Optional) Sets the amount of provisioned throughput, in MiB/s, for the file system. Valid values are 1-1024. If
     * you are changing the throughput mode to provisioned, you must also provide the amount of provisioned throughput.
     * Required if <code>ThroughputMode</code> is changed to <code>provisioned</code> on update.
     * </p>
     */
    private Double provisionedThroughputInMibps;

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system that you want to update.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     * 
     * @return The ID of the file system that you want to update.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you don't need
     * to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * 
     * @param throughputMode
     *        (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you
     *        don't need to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     *        <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * @see ThroughputMode
     */

    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you don't need
     * to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * 
     * @return (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you
     *         don't need to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     *         <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * @see ThroughputMode
     */

    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * <p>
     * (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you don't need
     * to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * 
     * @param throughputMode
     *        (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you
     *        don't need to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     *        <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public UpdateFileSystemRequest withThroughputMode(String throughputMode) {
        setThroughputMode(throughputMode);
        return this;
    }

    /**
     * <p>
     * (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you don't need
     * to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * 
     * @param throughputMode
     *        (Optional) Updates the file system's throughput mode. If you're not updating your throughput mode, you
     *        don't need to provide this value in your request. If you are changing the <code>ThroughputMode</code> to
     *        <code>provisioned</code>, you must also set a value for <code>ProvisionedThroughputInMibps</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public UpdateFileSystemRequest withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) Sets the amount of provisioned throughput, in MiB/s, for the file system. Valid values are 1-1024. If
     * you are changing the throughput mode to provisioned, you must also provide the amount of provisioned throughput.
     * Required if <code>ThroughputMode</code> is changed to <code>provisioned</code> on update.
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        (Optional) Sets the amount of provisioned throughput, in MiB/s, for the file system. Valid values are
     *        1-1024. If you are changing the throughput mode to provisioned, you must also provide the amount of
     *        provisioned throughput. Required if <code>ThroughputMode</code> is changed to <code>provisioned</code> on
     *        update.
     */

    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    /**
     * <p>
     * (Optional) Sets the amount of provisioned throughput, in MiB/s, for the file system. Valid values are 1-1024. If
     * you are changing the throughput mode to provisioned, you must also provide the amount of provisioned throughput.
     * Required if <code>ThroughputMode</code> is changed to <code>provisioned</code> on update.
     * </p>
     * 
     * @return (Optional) Sets the amount of provisioned throughput, in MiB/s, for the file system. Valid values are
     *         1-1024. If you are changing the throughput mode to provisioned, you must also provide the amount of
     *         provisioned throughput. Required if <code>ThroughputMode</code> is changed to <code>provisioned</code> on
     *         update.
     */

    public Double getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps;
    }

    /**
     * <p>
     * (Optional) Sets the amount of provisioned throughput, in MiB/s, for the file system. Valid values are 1-1024. If
     * you are changing the throughput mode to provisioned, you must also provide the amount of provisioned throughput.
     * Required if <code>ThroughputMode</code> is changed to <code>provisioned</code> on update.
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        (Optional) Sets the amount of provisioned throughput, in MiB/s, for the file system. Valid values are
     *        1-1024. If you are changing the throughput mode to provisioned, you must also provide the amount of
     *        provisioned throughput. Required if <code>ThroughputMode</code> is changed to <code>provisioned</code> on
     *        update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        setProvisionedThroughputInMibps(provisionedThroughputInMibps);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: ").append(getThroughputMode()).append(",");
        if (getProvisionedThroughputInMibps() != null)
            sb.append("ProvisionedThroughputInMibps: ").append(getProvisionedThroughputInMibps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemRequest == false)
            return false;
        UpdateFileSystemRequest other = (UpdateFileSystemRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedThroughputInMibps() == null ^ this.getProvisionedThroughputInMibps() == null)
            return false;
        if (other.getProvisionedThroughputInMibps() != null && other.getProvisionedThroughputInMibps().equals(this.getProvisionedThroughputInMibps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputInMibps() == null) ? 0 : getProvisionedThroughputInMibps().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemRequest clone() {
        return (UpdateFileSystemRequest) super.clone();
    }

}
