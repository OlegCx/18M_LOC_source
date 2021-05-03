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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Use these settings to insert a DVB Time and Date Table (TDT) in the transport stream of this output. When you work
 * directly in your JSON job specification, include this object only when your job has a transport stream output and the
 * container settings contain the object M2tsSettings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DvbTdtSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbTdtSettings implements Serializable, Cloneable, StructuredPojo {

    /** The number of milliseconds between instances of this table in the output transport stream. */
    private Integer tdtInterval;

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param tdtInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     */

    public void setTdtInterval(Integer tdtInterval) {
        this.tdtInterval = tdtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream.
     */

    public Integer getTdtInterval() {
        return this.tdtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param tdtInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbTdtSettings withTdtInterval(Integer tdtInterval) {
        setTdtInterval(tdtInterval);
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
        if (getTdtInterval() != null)
            sb.append("TdtInterval: ").append(getTdtInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbTdtSettings == false)
            return false;
        DvbTdtSettings other = (DvbTdtSettings) obj;
        if (other.getTdtInterval() == null ^ this.getTdtInterval() == null)
            return false;
        if (other.getTdtInterval() != null && other.getTdtInterval().equals(this.getTdtInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTdtInterval() == null) ? 0 : getTdtInterval().hashCode());
        return hashCode;
    }

    @Override
    public DvbTdtSettings clone() {
        try {
            return (DvbTdtSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DvbTdtSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
