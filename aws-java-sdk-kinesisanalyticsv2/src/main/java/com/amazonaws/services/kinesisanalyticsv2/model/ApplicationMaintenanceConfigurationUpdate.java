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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the updated time window for automatic application maintenance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationMaintenanceConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationMaintenanceConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The updated start time for the automatic maintenance window.
     * </p>
     */
    private String applicationMaintenanceWindowStartTimeUpdate;

    /**
     * <p>
     * The updated start time for the automatic maintenance window.
     * </p>
     * 
     * @param applicationMaintenanceWindowStartTimeUpdate
     *        The updated start time for the automatic maintenance window.
     */

    public void setApplicationMaintenanceWindowStartTimeUpdate(String applicationMaintenanceWindowStartTimeUpdate) {
        this.applicationMaintenanceWindowStartTimeUpdate = applicationMaintenanceWindowStartTimeUpdate;
    }

    /**
     * <p>
     * The updated start time for the automatic maintenance window.
     * </p>
     * 
     * @return The updated start time for the automatic maintenance window.
     */

    public String getApplicationMaintenanceWindowStartTimeUpdate() {
        return this.applicationMaintenanceWindowStartTimeUpdate;
    }

    /**
     * <p>
     * The updated start time for the automatic maintenance window.
     * </p>
     * 
     * @param applicationMaintenanceWindowStartTimeUpdate
     *        The updated start time for the automatic maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationMaintenanceConfigurationUpdate withApplicationMaintenanceWindowStartTimeUpdate(String applicationMaintenanceWindowStartTimeUpdate) {
        setApplicationMaintenanceWindowStartTimeUpdate(applicationMaintenanceWindowStartTimeUpdate);
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
        if (getApplicationMaintenanceWindowStartTimeUpdate() != null)
            sb.append("ApplicationMaintenanceWindowStartTimeUpdate: ").append(getApplicationMaintenanceWindowStartTimeUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationMaintenanceConfigurationUpdate == false)
            return false;
        ApplicationMaintenanceConfigurationUpdate other = (ApplicationMaintenanceConfigurationUpdate) obj;
        if (other.getApplicationMaintenanceWindowStartTimeUpdate() == null ^ this.getApplicationMaintenanceWindowStartTimeUpdate() == null)
            return false;
        if (other.getApplicationMaintenanceWindowStartTimeUpdate() != null
                && other.getApplicationMaintenanceWindowStartTimeUpdate().equals(this.getApplicationMaintenanceWindowStartTimeUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationMaintenanceWindowStartTimeUpdate() == null) ? 0 : getApplicationMaintenanceWindowStartTimeUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationMaintenanceConfigurationUpdate clone() {
        try {
            return (ApplicationMaintenanceConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationMaintenanceConfigurationUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
