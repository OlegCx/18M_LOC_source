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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DeleteConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the connection that was deleted.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The state of the connection before it was deleted.
     * </p>
     */
    private String connectionState;
    /**
     * <p>
     * A time stamp for the time that the connection was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A time stamp for the time that the connection was last modified before it was deleted.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A time stamp for the time that the connection was last authorized before it wa deleted.
     * </p>
     */
    private java.util.Date lastAuthorizedTime;

    /**
     * <p>
     * The ARN of the connection that was deleted.
     * </p>
     * 
     * @param connectionArn
     *        The ARN of the connection that was deleted.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The ARN of the connection that was deleted.
     * </p>
     * 
     * @return The ARN of the connection that was deleted.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The ARN of the connection that was deleted.
     * </p>
     * 
     * @param connectionArn
     *        The ARN of the connection that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The state of the connection before it was deleted.
     * </p>
     * 
     * @param connectionState
     *        The state of the connection before it was deleted.
     * @see ConnectionState
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * The state of the connection before it was deleted.
     * </p>
     * 
     * @return The state of the connection before it was deleted.
     * @see ConnectionState
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * <p>
     * The state of the connection before it was deleted.
     * </p>
     * 
     * @param connectionState
     *        The state of the connection before it was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public DeleteConnectionResult withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * The state of the connection before it was deleted.
     * </p>
     * 
     * @param connectionState
     *        The state of the connection before it was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public DeleteConnectionResult withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp for the time that the connection was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was created.
     * </p>
     * 
     * @return A time stamp for the time that the connection was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp for the time that the connection was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was last modified before it was deleted.
     * </p>
     * 
     * @param lastModifiedTime
     *        A time stamp for the time that the connection was last modified before it was deleted.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was last modified before it was deleted.
     * </p>
     * 
     * @return A time stamp for the time that the connection was last modified before it was deleted.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was last modified before it was deleted.
     * </p>
     * 
     * @param lastModifiedTime
     *        A time stamp for the time that the connection was last modified before it was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was last authorized before it wa deleted.
     * </p>
     * 
     * @param lastAuthorizedTime
     *        A time stamp for the time that the connection was last authorized before it wa deleted.
     */

    public void setLastAuthorizedTime(java.util.Date lastAuthorizedTime) {
        this.lastAuthorizedTime = lastAuthorizedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was last authorized before it wa deleted.
     * </p>
     * 
     * @return A time stamp for the time that the connection was last authorized before it wa deleted.
     */

    public java.util.Date getLastAuthorizedTime() {
        return this.lastAuthorizedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the connection was last authorized before it wa deleted.
     * </p>
     * 
     * @param lastAuthorizedTime
     *        A time stamp for the time that the connection was last authorized before it wa deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withLastAuthorizedTime(java.util.Date lastAuthorizedTime) {
        setLastAuthorizedTime(lastAuthorizedTime);
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
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: ").append(getConnectionState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastAuthorizedTime() != null)
            sb.append("LastAuthorizedTime: ").append(getLastAuthorizedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConnectionResult == false)
            return false;
        DeleteConnectionResult other = (DeleteConnectionResult) obj;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastAuthorizedTime() == null ^ this.getLastAuthorizedTime() == null)
            return false;
        if (other.getLastAuthorizedTime() != null && other.getLastAuthorizedTime().equals(this.getLastAuthorizedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastAuthorizedTime() == null) ? 0 : getLastAuthorizedTime().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConnectionResult clone() {
        try {
            return (DeleteConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
