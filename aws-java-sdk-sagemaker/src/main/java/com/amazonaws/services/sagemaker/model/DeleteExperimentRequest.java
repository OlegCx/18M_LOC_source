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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     */
    private String experimentName;

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment to delete.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     * 
     * @return The name of the experiment to delete.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExperimentRequest withExperimentName(String experimentName) {
        setExperimentName(experimentName);
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
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteExperimentRequest == false)
            return false;
        DeleteExperimentRequest other = (DeleteExperimentRequest) obj;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteExperimentRequest clone() {
        return (DeleteExperimentRequest) super.clone();
    }

}
