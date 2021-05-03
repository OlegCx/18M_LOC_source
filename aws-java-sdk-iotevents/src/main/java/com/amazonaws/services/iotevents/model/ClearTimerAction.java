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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information needed to clear the timer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ClearTimerAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClearTimerAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the timer to clear.
     * </p>
     */
    private String timerName;

    /**
     * <p>
     * The name of the timer to clear.
     * </p>
     * 
     * @param timerName
     *        The name of the timer to clear.
     */

    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    /**
     * <p>
     * The name of the timer to clear.
     * </p>
     * 
     * @return The name of the timer to clear.
     */

    public String getTimerName() {
        return this.timerName;
    }

    /**
     * <p>
     * The name of the timer to clear.
     * </p>
     * 
     * @param timerName
     *        The name of the timer to clear.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClearTimerAction withTimerName(String timerName) {
        setTimerName(timerName);
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
        if (getTimerName() != null)
            sb.append("TimerName: ").append(getTimerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClearTimerAction == false)
            return false;
        ClearTimerAction other = (ClearTimerAction) obj;
        if (other.getTimerName() == null ^ this.getTimerName() == null)
            return false;
        if (other.getTimerName() != null && other.getTimerName().equals(this.getTimerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerName() == null) ? 0 : getTimerName().hashCode());
        return hashCode;
    }

    @Override
    public ClearTimerAction clone() {
        try {
            return (ClearTimerAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.ClearTimerActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
