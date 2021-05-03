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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the experiment template.
     * </p>
     */
    private ExperimentTemplate experimentTemplate;

    /**
     * <p>
     * Information about the experiment template.
     * </p>
     * 
     * @param experimentTemplate
     *        Information about the experiment template.
     */

    public void setExperimentTemplate(ExperimentTemplate experimentTemplate) {
        this.experimentTemplate = experimentTemplate;
    }

    /**
     * <p>
     * Information about the experiment template.
     * </p>
     * 
     * @return Information about the experiment template.
     */

    public ExperimentTemplate getExperimentTemplate() {
        return this.experimentTemplate;
    }

    /**
     * <p>
     * Information about the experiment template.
     * </p>
     * 
     * @param experimentTemplate
     *        Information about the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateResult withExperimentTemplate(ExperimentTemplate experimentTemplate) {
        setExperimentTemplate(experimentTemplate);
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
        if (getExperimentTemplate() != null)
            sb.append("ExperimentTemplate: ").append(getExperimentTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExperimentTemplateResult == false)
            return false;
        CreateExperimentTemplateResult other = (CreateExperimentTemplateResult) obj;
        if (other.getExperimentTemplate() == null ^ this.getExperimentTemplate() == null)
            return false;
        if (other.getExperimentTemplate() != null && other.getExperimentTemplate().equals(this.getExperimentTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentTemplate() == null) ? 0 : getExperimentTemplate().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperimentTemplateResult clone() {
        try {
            return (CreateExperimentTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
