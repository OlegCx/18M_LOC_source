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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The root cause information for a trace summary fault.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/FaultRootCause" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaultRootCause implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and
     * inferred flag.
     * </p>
     */
    private java.util.List<FaultRootCauseService> services;
    /**
     * <p>
     * A flag that denotes that the root cause impacts the trace client.
     * </p>
     */
    private Boolean clientImpacting;

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * 
     * @return A list of corresponding services. A service identifies a segment and it contains a name, account ID,
     *         type, and inferred flag.
     */

    public java.util.List<FaultRootCauseService> getServices() {
        return services;
    }

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * 
     * @param services
     *        A list of corresponding services. A service identifies a segment and it contains a name, account ID, type,
     *        and inferred flag.
     */

    public void setServices(java.util.Collection<FaultRootCauseService> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<FaultRootCauseService>(services);
    }

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        A list of corresponding services. A service identifies a segment and it contains a name, account ID, type,
     *        and inferred flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaultRootCause withServices(FaultRootCauseService... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<FaultRootCauseService>(services.length));
        }
        for (FaultRootCauseService ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * 
     * @param services
     *        A list of corresponding services. A service identifies a segment and it contains a name, account ID, type,
     *        and inferred flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaultRootCause withServices(java.util.Collection<FaultRootCauseService> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A flag that denotes that the root cause impacts the trace client.
     * </p>
     * 
     * @param clientImpacting
     *        A flag that denotes that the root cause impacts the trace client.
     */

    public void setClientImpacting(Boolean clientImpacting) {
        this.clientImpacting = clientImpacting;
    }

    /**
     * <p>
     * A flag that denotes that the root cause impacts the trace client.
     * </p>
     * 
     * @return A flag that denotes that the root cause impacts the trace client.
     */

    public Boolean getClientImpacting() {
        return this.clientImpacting;
    }

    /**
     * <p>
     * A flag that denotes that the root cause impacts the trace client.
     * </p>
     * 
     * @param clientImpacting
     *        A flag that denotes that the root cause impacts the trace client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaultRootCause withClientImpacting(Boolean clientImpacting) {
        setClientImpacting(clientImpacting);
        return this;
    }

    /**
     * <p>
     * A flag that denotes that the root cause impacts the trace client.
     * </p>
     * 
     * @return A flag that denotes that the root cause impacts the trace client.
     */

    public Boolean isClientImpacting() {
        return this.clientImpacting;
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
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getClientImpacting() != null)
            sb.append("ClientImpacting: ").append(getClientImpacting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaultRootCause == false)
            return false;
        FaultRootCause other = (FaultRootCause) obj;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getClientImpacting() == null ^ this.getClientImpacting() == null)
            return false;
        if (other.getClientImpacting() != null && other.getClientImpacting().equals(this.getClientImpacting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getClientImpacting() == null) ? 0 : getClientImpacting().hashCode());
        return hashCode;
    }

    @Override
    public FaultRootCause clone() {
        try {
            return (FaultRootCause) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.FaultRootCauseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
