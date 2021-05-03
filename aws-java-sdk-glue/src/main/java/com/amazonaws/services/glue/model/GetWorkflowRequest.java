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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the workflow to retrieve.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     */
    private Boolean includeGraph;

    /**
     * <p>
     * The name of the workflow to retrieve.
     * </p>
     * 
     * @param name
     *        The name of the workflow to retrieve.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow to retrieve.
     * </p>
     * 
     * @return The name of the workflow to retrieve.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow to retrieve.
     * </p>
     * 
     * @param name
     *        The name of the workflow to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include a graph when returning the workflow resource metadata.
     */

    public void setIncludeGraph(Boolean includeGraph) {
        this.includeGraph = includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @return Specifies whether to include a graph when returning the workflow resource metadata.
     */

    public Boolean getIncludeGraph() {
        return this.includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include a graph when returning the workflow resource metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRequest withIncludeGraph(Boolean includeGraph) {
        setIncludeGraph(includeGraph);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @return Specifies whether to include a graph when returning the workflow resource metadata.
     */

    public Boolean isIncludeGraph() {
        return this.includeGraph;
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
        if (getIncludeGraph() != null)
            sb.append("IncludeGraph: ").append(getIncludeGraph());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowRequest == false)
            return false;
        GetWorkflowRequest other = (GetWorkflowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIncludeGraph() == null ^ this.getIncludeGraph() == null)
            return false;
        if (other.getIncludeGraph() != null && other.getIncludeGraph().equals(this.getIncludeGraph()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIncludeGraph() == null) ? 0 : getIncludeGraph().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowRequest clone() {
        return (GetWorkflowRequest) super.clone();
    }

}
