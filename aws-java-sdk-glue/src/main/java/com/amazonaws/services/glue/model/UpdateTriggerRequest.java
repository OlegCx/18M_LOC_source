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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTriggerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trigger to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new values with which to update the trigger.
     * </p>
     */
    private TriggerUpdate triggerUpdate;

    /**
     * <p>
     * The name of the trigger to update.
     * </p>
     * 
     * @param name
     *        The name of the trigger to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trigger to update.
     * </p>
     * 
     * @return The name of the trigger to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trigger to update.
     * </p>
     * 
     * @param name
     *        The name of the trigger to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTriggerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new values with which to update the trigger.
     * </p>
     * 
     * @param triggerUpdate
     *        The new values with which to update the trigger.
     */

    public void setTriggerUpdate(TriggerUpdate triggerUpdate) {
        this.triggerUpdate = triggerUpdate;
    }

    /**
     * <p>
     * The new values with which to update the trigger.
     * </p>
     * 
     * @return The new values with which to update the trigger.
     */

    public TriggerUpdate getTriggerUpdate() {
        return this.triggerUpdate;
    }

    /**
     * <p>
     * The new values with which to update the trigger.
     * </p>
     * 
     * @param triggerUpdate
     *        The new values with which to update the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTriggerRequest withTriggerUpdate(TriggerUpdate triggerUpdate) {
        setTriggerUpdate(triggerUpdate);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTriggerUpdate() != null)
            sb.append("TriggerUpdate: ").append(getTriggerUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTriggerRequest == false)
            return false;
        UpdateTriggerRequest other = (UpdateTriggerRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTriggerUpdate() == null ^ this.getTriggerUpdate() == null)
            return false;
        if (other.getTriggerUpdate() != null && other.getTriggerUpdate().equals(this.getTriggerUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTriggerUpdate() == null) ? 0 : getTriggerUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTriggerRequest clone() {
        return (UpdateTriggerRequest) super.clone();
    }

}
