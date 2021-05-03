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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Auto-Tune options: the Auto-Tune desired state for the domain and list of maintenance schedules.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneOptionsOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Specifies the error message while enabling or disabling the Auto-Tune.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param state
     *        Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * @see AutoTuneState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * @see AutoTuneState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param state
     *        Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneState
     */

    public AutoTuneOptionsOutput withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param state
     *        Specifies the <code>AutoTuneState</code> for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneState
     */

    public AutoTuneOptionsOutput withState(AutoTuneState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the error message while enabling or disabling the Auto-Tune.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message while enabling or disabling the Auto-Tune.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Specifies the error message while enabling or disabling the Auto-Tune.
     * </p>
     * 
     * @return Specifies the error message while enabling or disabling the Auto-Tune.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Specifies the error message while enabling or disabling the Auto-Tune.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message while enabling or disabling the Auto-Tune.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneOptionsOutput withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoTuneOptionsOutput == false)
            return false;
        AutoTuneOptionsOutput other = (AutoTuneOptionsOutput) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public AutoTuneOptionsOutput clone() {
        try {
            return (AutoTuneOptionsOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.AutoTuneOptionsOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
