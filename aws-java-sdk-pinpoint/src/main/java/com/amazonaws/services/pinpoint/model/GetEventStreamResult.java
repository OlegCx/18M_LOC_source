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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private EventStream eventStream;

    /**
     * @param eventStream
     */

    public void setEventStream(EventStream eventStream) {
        this.eventStream = eventStream;
    }

    /**
     * @return
     */

    public EventStream getEventStream() {
        return this.eventStream;
    }

    /**
     * @param eventStream
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventStreamResult withEventStream(EventStream eventStream) {
        setEventStream(eventStream);
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
        if (getEventStream() != null)
            sb.append("EventStream: ").append(getEventStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEventStreamResult == false)
            return false;
        GetEventStreamResult other = (GetEventStreamResult) obj;
        if (other.getEventStream() == null ^ this.getEventStream() == null)
            return false;
        if (other.getEventStream() != null && other.getEventStream().equals(this.getEventStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventStream() == null) ? 0 : getEventStream().hashCode());
        return hashCode;
    }

    @Override
    public GetEventStreamResult clone() {
        try {
            return (GetEventStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
