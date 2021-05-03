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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of information about a data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatastoreSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastoreSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data store.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * Where data store data is stored.
     * </p>
     */
    private DatastoreStorageSummary datastoreStorage;
    /**
     * <p>
     * The status of the data store.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the data store was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The last time when a new message arrived in the data store.
     * </p>
     * <p>
     * AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the
     * <code>lastMessageArrivalTime</code> value is an approximation.
     * </p>
     * <p>
     * This feature only applies to messages that arrived in the data store after October 23, 2020.
     * </p>
     */
    private java.util.Date lastMessageArrivalTime;
    /**
     * <p>
     * The file format of the data in the data store.
     * </p>
     */
    private String fileFormatType;

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store.
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @return The name of the data store.
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * Where data store data is stored.
     * </p>
     * 
     * @param datastoreStorage
     *        Where data store data is stored.
     */

    public void setDatastoreStorage(DatastoreStorageSummary datastoreStorage) {
        this.datastoreStorage = datastoreStorage;
    }

    /**
     * <p>
     * Where data store data is stored.
     * </p>
     * 
     * @return Where data store data is stored.
     */

    public DatastoreStorageSummary getDatastoreStorage() {
        return this.datastoreStorage;
    }

    /**
     * <p>
     * Where data store data is stored.
     * </p>
     * 
     * @param datastoreStorage
     *        Where data store data is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withDatastoreStorage(DatastoreStorageSummary datastoreStorage) {
        setDatastoreStorage(datastoreStorage);
        return this;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @param status
     *        The status of the data store.
     * @see DatastoreStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @return The status of the data store.
     * @see DatastoreStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @param status
     *        The status of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @param status
     *        The status of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreSummary withStatus(DatastoreStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the data store was created.
     * </p>
     * 
     * @param creationTime
     *        When the data store was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the data store was created.
     * </p>
     * 
     * @return When the data store was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the data store was created.
     * </p>
     * 
     * @param creationTime
     *        When the data store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the data store was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     * 
     * @return The last time the data store was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the data store was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The last time when a new message arrived in the data store.
     * </p>
     * <p>
     * AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the
     * <code>lastMessageArrivalTime</code> value is an approximation.
     * </p>
     * <p>
     * This feature only applies to messages that arrived in the data store after October 23, 2020.
     * </p>
     * 
     * @param lastMessageArrivalTime
     *        The last time when a new message arrived in the data store.</p>
     *        <p>
     *        AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the
     *        <code>lastMessageArrivalTime</code> value is an approximation.
     *        </p>
     *        <p>
     *        This feature only applies to messages that arrived in the data store after October 23, 2020.
     */

    public void setLastMessageArrivalTime(java.util.Date lastMessageArrivalTime) {
        this.lastMessageArrivalTime = lastMessageArrivalTime;
    }

    /**
     * <p>
     * The last time when a new message arrived in the data store.
     * </p>
     * <p>
     * AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the
     * <code>lastMessageArrivalTime</code> value is an approximation.
     * </p>
     * <p>
     * This feature only applies to messages that arrived in the data store after October 23, 2020.
     * </p>
     * 
     * @return The last time when a new message arrived in the data store.</p>
     *         <p>
     *         AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the
     *         <code>lastMessageArrivalTime</code> value is an approximation.
     *         </p>
     *         <p>
     *         This feature only applies to messages that arrived in the data store after October 23, 2020.
     */

    public java.util.Date getLastMessageArrivalTime() {
        return this.lastMessageArrivalTime;
    }

    /**
     * <p>
     * The last time when a new message arrived in the data store.
     * </p>
     * <p>
     * AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the
     * <code>lastMessageArrivalTime</code> value is an approximation.
     * </p>
     * <p>
     * This feature only applies to messages that arrived in the data store after October 23, 2020.
     * </p>
     * 
     * @param lastMessageArrivalTime
     *        The last time when a new message arrived in the data store.</p>
     *        <p>
     *        AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the
     *        <code>lastMessageArrivalTime</code> value is an approximation.
     *        </p>
     *        <p>
     *        This feature only applies to messages that arrived in the data store after October 23, 2020.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withLastMessageArrivalTime(java.util.Date lastMessageArrivalTime) {
        setLastMessageArrivalTime(lastMessageArrivalTime);
        return this;
    }

    /**
     * <p>
     * The file format of the data in the data store.
     * </p>
     * 
     * @param fileFormatType
     *        The file format of the data in the data store.
     * @see FileFormatType
     */

    public void setFileFormatType(String fileFormatType) {
        this.fileFormatType = fileFormatType;
    }

    /**
     * <p>
     * The file format of the data in the data store.
     * </p>
     * 
     * @return The file format of the data in the data store.
     * @see FileFormatType
     */

    public String getFileFormatType() {
        return this.fileFormatType;
    }

    /**
     * <p>
     * The file format of the data in the data store.
     * </p>
     * 
     * @param fileFormatType
     *        The file format of the data in the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormatType
     */

    public DatastoreSummary withFileFormatType(String fileFormatType) {
        setFileFormatType(fileFormatType);
        return this;
    }

    /**
     * <p>
     * The file format of the data in the data store.
     * </p>
     * 
     * @param fileFormatType
     *        The file format of the data in the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormatType
     */

    public DatastoreSummary withFileFormatType(FileFormatType fileFormatType) {
        this.fileFormatType = fileFormatType.toString();
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
        if (getDatastoreName() != null)
            sb.append("DatastoreName: ").append(getDatastoreName()).append(",");
        if (getDatastoreStorage() != null)
            sb.append("DatastoreStorage: ").append(getDatastoreStorage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getLastMessageArrivalTime() != null)
            sb.append("LastMessageArrivalTime: ").append(getLastMessageArrivalTime()).append(",");
        if (getFileFormatType() != null)
            sb.append("FileFormatType: ").append(getFileFormatType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastoreSummary == false)
            return false;
        DatastoreSummary other = (DatastoreSummary) obj;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getDatastoreStorage() == null ^ this.getDatastoreStorage() == null)
            return false;
        if (other.getDatastoreStorage() != null && other.getDatastoreStorage().equals(this.getDatastoreStorage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getLastMessageArrivalTime() == null ^ this.getLastMessageArrivalTime() == null)
            return false;
        if (other.getLastMessageArrivalTime() != null && other.getLastMessageArrivalTime().equals(this.getLastMessageArrivalTime()) == false)
            return false;
        if (other.getFileFormatType() == null ^ this.getFileFormatType() == null)
            return false;
        if (other.getFileFormatType() != null && other.getFileFormatType().equals(this.getFileFormatType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getDatastoreStorage() == null) ? 0 : getDatastoreStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getLastMessageArrivalTime() == null) ? 0 : getLastMessageArrivalTime().hashCode());
        hashCode = prime * hashCode + ((getFileFormatType() == null) ? 0 : getFileFormatType().hashCode());
        return hashCode;
    }

    @Override
    public DatastoreSummary clone() {
        try {
            return (DatastoreSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatastoreSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
