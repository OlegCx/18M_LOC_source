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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the resource id (<code>rid</code>) and the time it took to process the request (<code>timems</code>).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long it took to process the request, in milliseconds.
     * </p>
     */
    private Long timems;
    /**
     * <p>
     * The encrypted resource ID for the request.
     * </p>
     */
    private String rid;

    /**
     * <p>
     * How long it took to process the request, in milliseconds.
     * </p>
     * 
     * @param timems
     *        How long it took to process the request, in milliseconds.
     */

    public void setTimems(Long timems) {
        this.timems = timems;
    }

    /**
     * <p>
     * How long it took to process the request, in milliseconds.
     * </p>
     * 
     * @return How long it took to process the request, in milliseconds.
     */

    public Long getTimems() {
        return this.timems;
    }

    /**
     * <p>
     * How long it took to process the request, in milliseconds.
     * </p>
     * 
     * @param timems
     *        How long it took to process the request, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestStatus withTimems(Long timems) {
        setTimems(timems);
        return this;
    }

    /**
     * <p>
     * The encrypted resource ID for the request.
     * </p>
     * 
     * @param rid
     *        The encrypted resource ID for the request.
     */

    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * <p>
     * The encrypted resource ID for the request.
     * </p>
     * 
     * @return The encrypted resource ID for the request.
     */

    public String getRid() {
        return this.rid;
    }

    /**
     * <p>
     * The encrypted resource ID for the request.
     * </p>
     * 
     * @param rid
     *        The encrypted resource ID for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestStatus withRid(String rid) {
        setRid(rid);
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
        if (getTimems() != null)
            sb.append("Timems: ").append(getTimems()).append(",");
        if (getRid() != null)
            sb.append("Rid: ").append(getRid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestStatus == false)
            return false;
        SuggestStatus other = (SuggestStatus) obj;
        if (other.getTimems() == null ^ this.getTimems() == null)
            return false;
        if (other.getTimems() != null && other.getTimems().equals(this.getTimems()) == false)
            return false;
        if (other.getRid() == null ^ this.getRid() == null)
            return false;
        if (other.getRid() != null && other.getRid().equals(this.getRid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimems() == null) ? 0 : getTimems().hashCode());
        hashCode = prime * hashCode + ((getRid() == null) ? 0 : getRid().hashCode());
        return hashCode;
    }

    @Override
    public SuggestStatus clone() {
        try {
            return (SuggestStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudsearchdomain.model.transform.SuggestStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
