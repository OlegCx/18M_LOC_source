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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a queued dataset SPICE ingestion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/QueueInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueueInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     */
    private String waitingOnIngestion;
    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
     * </p>
     */
    private String queuedIngestion;

    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     * 
     * @param waitingOnIngestion
     *        The ID of the queued ingestion.
     */

    public void setWaitingOnIngestion(String waitingOnIngestion) {
        this.waitingOnIngestion = waitingOnIngestion;
    }

    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     * 
     * @return The ID of the queued ingestion.
     */

    public String getWaitingOnIngestion() {
        return this.waitingOnIngestion;
    }

    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     * 
     * @param waitingOnIngestion
     *        The ID of the queued ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueInfo withWaitingOnIngestion(String waitingOnIngestion) {
        setWaitingOnIngestion(waitingOnIngestion);
        return this;
    }

    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
     * </p>
     * 
     * @param queuedIngestion
     *        The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
     */

    public void setQueuedIngestion(String queuedIngestion) {
        this.queuedIngestion = queuedIngestion;
    }

    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
     * </p>
     * 
     * @return The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
     */

    public String getQueuedIngestion() {
        return this.queuedIngestion;
    }

    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
     * </p>
     * 
     * @param queuedIngestion
     *        The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueInfo withQueuedIngestion(String queuedIngestion) {
        setQueuedIngestion(queuedIngestion);
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
        if (getWaitingOnIngestion() != null)
            sb.append("WaitingOnIngestion: ").append(getWaitingOnIngestion()).append(",");
        if (getQueuedIngestion() != null)
            sb.append("QueuedIngestion: ").append(getQueuedIngestion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueInfo == false)
            return false;
        QueueInfo other = (QueueInfo) obj;
        if (other.getWaitingOnIngestion() == null ^ this.getWaitingOnIngestion() == null)
            return false;
        if (other.getWaitingOnIngestion() != null && other.getWaitingOnIngestion().equals(this.getWaitingOnIngestion()) == false)
            return false;
        if (other.getQueuedIngestion() == null ^ this.getQueuedIngestion() == null)
            return false;
        if (other.getQueuedIngestion() != null && other.getQueuedIngestion().equals(this.getQueuedIngestion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWaitingOnIngestion() == null) ? 0 : getWaitingOnIngestion().hashCode());
        hashCode = prime * hashCode + ((getQueuedIngestion() == null) ? 0 : getQueuedIngestion().hashCode());
        return hashCode;
    }

    @Override
    public QueueInfo clone() {
        try {
            return (QueueInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.QueueInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
