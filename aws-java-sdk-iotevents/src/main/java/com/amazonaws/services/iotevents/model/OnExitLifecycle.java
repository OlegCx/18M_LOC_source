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
 * When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is
 * <code>TRUE</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/OnExitLifecycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnExitLifecycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the <code>actions</code> that are performed when the state is exited and the <code>condition</code> is
     * <code>TRUE</code>.
     * </p>
     */
    private java.util.List<Event> events;

    /**
     * <p>
     * Specifies the <code>actions</code> that are performed when the state is exited and the <code>condition</code> is
     * <code>TRUE</code>.
     * </p>
     * 
     * @return Specifies the <code>actions</code> that are performed when the state is exited and the
     *         <code>condition</code> is <code>TRUE</code>.
     */

    public java.util.List<Event> getEvents() {
        return events;
    }

    /**
     * <p>
     * Specifies the <code>actions</code> that are performed when the state is exited and the <code>condition</code> is
     * <code>TRUE</code>.
     * </p>
     * 
     * @param events
     *        Specifies the <code>actions</code> that are performed when the state is exited and the
     *        <code>condition</code> is <code>TRUE</code>.
     */

    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<Event>(events);
    }

    /**
     * <p>
     * Specifies the <code>actions</code> that are performed when the state is exited and the <code>condition</code> is
     * <code>TRUE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        Specifies the <code>actions</code> that are performed when the state is exited and the
     *        <code>condition</code> is <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnExitLifecycle withEvents(Event... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<Event>(events.length));
        }
        for (Event ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the <code>actions</code> that are performed when the state is exited and the <code>condition</code> is
     * <code>TRUE</code>.
     * </p>
     * 
     * @param events
     *        Specifies the <code>actions</code> that are performed when the state is exited and the
     *        <code>condition</code> is <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnExitLifecycle withEvents(java.util.Collection<Event> events) {
        setEvents(events);
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnExitLifecycle == false)
            return false;
        OnExitLifecycle other = (OnExitLifecycle) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public OnExitLifecycle clone() {
        try {
            return (OnExitLifecycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.OnExitLifecycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
