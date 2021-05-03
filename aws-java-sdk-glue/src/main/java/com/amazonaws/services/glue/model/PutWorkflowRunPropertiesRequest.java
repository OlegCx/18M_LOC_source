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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutWorkflowRunProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutWorkflowRunPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the workflow which was run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the workflow run for which the run properties should be updated.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     */
    private java.util.Map<String, String> runProperties;

    /**
     * <p>
     * Name of the workflow which was run.
     * </p>
     * 
     * @param name
     *        Name of the workflow which was run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow which was run.
     * </p>
     * 
     * @return Name of the workflow which was run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the workflow which was run.
     * </p>
     * 
     * @param name
     *        Name of the workflow which was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWorkflowRunPropertiesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the workflow run for which the run properties should be updated.
     * </p>
     * 
     * @param runId
     *        The ID of the workflow run for which the run properties should be updated.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The ID of the workflow run for which the run properties should be updated.
     * </p>
     * 
     * @return The ID of the workflow run for which the run properties should be updated.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The ID of the workflow run for which the run properties should be updated.
     * </p>
     * 
     * @param runId
     *        The ID of the workflow run for which the run properties should be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWorkflowRunPropertiesRequest withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     * 
     * @return The properties to put for the specified run.
     */

    public java.util.Map<String, String> getRunProperties() {
        return runProperties;
    }

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     * 
     * @param runProperties
     *        The properties to put for the specified run.
     */

    public void setRunProperties(java.util.Map<String, String> runProperties) {
        this.runProperties = runProperties;
    }

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     * 
     * @param runProperties
     *        The properties to put for the specified run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWorkflowRunPropertiesRequest withRunProperties(java.util.Map<String, String> runProperties) {
        setRunProperties(runProperties);
        return this;
    }

    /**
     * Add a single RunProperties entry
     *
     * @see PutWorkflowRunPropertiesRequest#withRunProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutWorkflowRunPropertiesRequest addRunPropertiesEntry(String key, String value) {
        if (null == this.runProperties) {
            this.runProperties = new java.util.HashMap<String, String>();
        }
        if (this.runProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.runProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RunProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWorkflowRunPropertiesRequest clearRunPropertiesEntries() {
        this.runProperties = null;
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
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getRunProperties() != null)
            sb.append("RunProperties: ").append(getRunProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutWorkflowRunPropertiesRequest == false)
            return false;
        PutWorkflowRunPropertiesRequest other = (PutWorkflowRunPropertiesRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getRunProperties() == null ^ this.getRunProperties() == null)
            return false;
        if (other.getRunProperties() != null && other.getRunProperties().equals(this.getRunProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getRunProperties() == null) ? 0 : getRunProperties().hashCode());
        return hashCode;
    }

    @Override
    public PutWorkflowRunPropertiesRequest clone() {
        return (PutWorkflowRunPropertiesRequest) super.clone();
    }

}
