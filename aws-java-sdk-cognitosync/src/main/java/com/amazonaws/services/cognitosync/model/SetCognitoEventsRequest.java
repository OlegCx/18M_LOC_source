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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to configure Cognito Events"
 * </p>
 * "
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetCognitoEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetCognitoEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Cognito Identity Pool to use when configuring Cognito Events
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The events to configure
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> events;

    /**
     * <p>
     * The Cognito Identity Pool to use when configuring Cognito Events
     * </p>
     * 
     * @param identityPoolId
     *        The Cognito Identity Pool to use when configuring Cognito Events
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The Cognito Identity Pool to use when configuring Cognito Events
     * </p>
     * 
     * @return The Cognito Identity Pool to use when configuring Cognito Events
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * The Cognito Identity Pool to use when configuring Cognito Events
     * </p>
     * 
     * @param identityPoolId
     *        The Cognito Identity Pool to use when configuring Cognito Events
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetCognitoEventsRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The events to configure
     * </p>
     * 
     * @return The events to configure
     */

    public java.util.Map<String, String> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return events;
    }

    /**
     * <p>
     * The events to configure
     * </p>
     * 
     * @param events
     *        The events to configure
     */

    public void setEvents(java.util.Map<String, String> events) {
        this.events = events == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(events);
    }

    /**
     * <p>
     * The events to configure
     * </p>
     * 
     * @param events
     *        The events to configure
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetCognitoEventsRequest withEvents(java.util.Map<String, String> events) {
        setEvents(events);
        return this;
    }

    /**
     * Add a single Events entry
     *
     * @see SetCognitoEventsRequest#withEvents
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SetCognitoEventsRequest addEventsEntry(String key, String value) {
        if (null == this.events) {
            this.events = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.events.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.events.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Events.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetCognitoEventsRequest clearEventsEntries() {
        this.events = null;
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
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

        if (obj instanceof SetCognitoEventsRequest == false)
            return false;
        SetCognitoEventsRequest other = (SetCognitoEventsRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public SetCognitoEventsRequest clone() {
        return (SetCognitoEventsRequest) super.clone();
    }

}
