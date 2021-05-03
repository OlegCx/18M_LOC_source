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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     */
    private Boolean verbose;

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * 
     * @param mLModelId
     *        The ID assigned to the <code>MLModel</code> at creation.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * 
     * @return The ID assigned to the <code>MLModel</code> at creation.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * 
     * @param mLModelId
     *        The ID assigned to the <code>MLModel</code> at creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelRequest withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     * 
     * @param verbose
     *        Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.</p>
     *        <p>
     *        If true, <code>Recipe</code> is returned.
     *        </p>
     *        <p>
     *        If false, <code>Recipe</code> is not returned.
     */

    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     * 
     * @return Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.</p>
     *         <p>
     *         If true, <code>Recipe</code> is returned.
     *         </p>
     *         <p>
     *         If false, <code>Recipe</code> is not returned.
     */

    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     * 
     * @param verbose
     *        Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.</p>
     *        <p>
     *        If true, <code>Recipe</code> is returned.
     *        </p>
     *        <p>
     *        If false, <code>Recipe</code> is not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelRequest withVerbose(Boolean verbose) {
        setVerbose(verbose);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     * 
     * @return Specifies whether the <code>GetMLModel</code> operation should return <code>Recipe</code>.</p>
     *         <p>
     *         If true, <code>Recipe</code> is returned.
     *         </p>
     *         <p>
     *         If false, <code>Recipe</code> is not returned.
     */

    public Boolean isVerbose() {
        return this.verbose;
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
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getVerbose() != null)
            sb.append("Verbose: ").append(getVerbose());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLModelRequest == false)
            return false;
        GetMLModelRequest other = (GetMLModelRequest) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getVerbose() == null ^ this.getVerbose() == null)
            return false;
        if (other.getVerbose() != null && other.getVerbose().equals(this.getVerbose()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getVerbose() == null) ? 0 : getVerbose().hashCode());
        return hashCode;
    }

    @Override
    public GetMLModelRequest clone() {
        return (GetMLModelRequest) super.clone();
    }

}
