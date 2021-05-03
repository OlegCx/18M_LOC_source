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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration details that control the trigger for a flow. Currently, these settings only apply to the
 * Scheduled trigger type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/TriggerProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TriggerProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow that you define.
     * </p>
     */
    private ScheduledTriggerProperties scheduled;

    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow that you define.
     * </p>
     * 
     * @param scheduled
     *        Specifies the configuration details of a schedule-triggered flow that you define.
     */

    public void setScheduled(ScheduledTriggerProperties scheduled) {
        this.scheduled = scheduled;
    }

    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow that you define.
     * </p>
     * 
     * @return Specifies the configuration details of a schedule-triggered flow that you define.
     */

    public ScheduledTriggerProperties getScheduled() {
        return this.scheduled;
    }

    /**
     * <p>
     * Specifies the configuration details of a schedule-triggered flow that you define.
     * </p>
     * 
     * @param scheduled
     *        Specifies the configuration details of a schedule-triggered flow that you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TriggerProperties withScheduled(ScheduledTriggerProperties scheduled) {
        setScheduled(scheduled);
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
        if (getScheduled() != null)
            sb.append("Scheduled: ").append(getScheduled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TriggerProperties == false)
            return false;
        TriggerProperties other = (TriggerProperties) obj;
        if (other.getScheduled() == null ^ this.getScheduled() == null)
            return false;
        if (other.getScheduled() != null && other.getScheduled().equals(this.getScheduled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduled() == null) ? 0 : getScheduled().hashCode());
        return hashCode;
    }

    @Override
    public TriggerProperties clone() {
        try {
            return (TriggerProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.TriggerPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
