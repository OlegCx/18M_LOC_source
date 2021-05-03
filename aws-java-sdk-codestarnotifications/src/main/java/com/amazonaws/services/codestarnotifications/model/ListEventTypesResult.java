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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListEventTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about each event, including service name, resource type, event ID, and event name.
     * </p>
     */
    private java.util.List<EventTypeSummary> eventTypes;
    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about each event, including service name, resource type, event ID, and event name.
     * </p>
     * 
     * @return Information about each event, including service name, resource type, event ID, and event name.
     */

    public java.util.List<EventTypeSummary> getEventTypes() {
        return eventTypes;
    }

    /**
     * <p>
     * Information about each event, including service name, resource type, event ID, and event name.
     * </p>
     * 
     * @param eventTypes
     *        Information about each event, including service name, resource type, event ID, and event name.
     */

    public void setEventTypes(java.util.Collection<EventTypeSummary> eventTypes) {
        if (eventTypes == null) {
            this.eventTypes = null;
            return;
        }

        this.eventTypes = new java.util.ArrayList<EventTypeSummary>(eventTypes);
    }

    /**
     * <p>
     * Information about each event, including service name, resource type, event ID, and event name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypes(java.util.Collection)} or {@link #withEventTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTypes
     *        Information about each event, including service name, resource type, event ID, and event name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesResult withEventTypes(EventTypeSummary... eventTypes) {
        if (this.eventTypes == null) {
            setEventTypes(new java.util.ArrayList<EventTypeSummary>(eventTypes.length));
        }
        for (EventTypeSummary ele : eventTypes) {
            this.eventTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about each event, including service name, resource type, event ID, and event name.
     * </p>
     * 
     * @param eventTypes
     *        Information about each event, including service name, resource type, event ID, and event name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesResult withEventTypes(java.util.Collection<EventTypeSummary> eventTypes) {
        setEventTypes(eventTypes);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that can be used in a request to return the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEventTypes() != null)
            sb.append("EventTypes: ").append(getEventTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventTypesResult == false)
            return false;
        ListEventTypesResult other = (ListEventTypesResult) obj;
        if (other.getEventTypes() == null ^ this.getEventTypes() == null)
            return false;
        if (other.getEventTypes() != null && other.getEventTypes().equals(this.getEventTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypes() == null) ? 0 : getEventTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventTypesResult clone() {
        try {
            return (ListEventTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
