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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies restrictions for the batch build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchRestrictions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchRestrictions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the maximum number of builds allowed.
     * </p>
     */
    private Integer maximumBuildsAllowed;
    /**
     * <p>
     * An array of strings that specify the compute types that are allowed for the batch build. See <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     * </p>
     */
    private java.util.List<String> computeTypesAllowed;

    /**
     * <p>
     * Specifies the maximum number of builds allowed.
     * </p>
     * 
     * @param maximumBuildsAllowed
     *        Specifies the maximum number of builds allowed.
     */

    public void setMaximumBuildsAllowed(Integer maximumBuildsAllowed) {
        this.maximumBuildsAllowed = maximumBuildsAllowed;
    }

    /**
     * <p>
     * Specifies the maximum number of builds allowed.
     * </p>
     * 
     * @return Specifies the maximum number of builds allowed.
     */

    public Integer getMaximumBuildsAllowed() {
        return this.maximumBuildsAllowed;
    }

    /**
     * <p>
     * Specifies the maximum number of builds allowed.
     * </p>
     * 
     * @param maximumBuildsAllowed
     *        Specifies the maximum number of builds allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRestrictions withMaximumBuildsAllowed(Integer maximumBuildsAllowed) {
        setMaximumBuildsAllowed(maximumBuildsAllowed);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the compute types that are allowed for the batch build. See <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     * </p>
     * 
     * @return An array of strings that specify the compute types that are allowed for the batch build. See <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *         environment compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     */

    public java.util.List<String> getComputeTypesAllowed() {
        return computeTypesAllowed;
    }

    /**
     * <p>
     * An array of strings that specify the compute types that are allowed for the batch build. See <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     * </p>
     * 
     * @param computeTypesAllowed
     *        An array of strings that specify the compute types that are allowed for the batch build. See <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     */

    public void setComputeTypesAllowed(java.util.Collection<String> computeTypesAllowed) {
        if (computeTypesAllowed == null) {
            this.computeTypesAllowed = null;
            return;
        }

        this.computeTypesAllowed = new java.util.ArrayList<String>(computeTypesAllowed);
    }

    /**
     * <p>
     * An array of strings that specify the compute types that are allowed for the batch build. See <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeTypesAllowed(java.util.Collection)} or {@link #withComputeTypesAllowed(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param computeTypesAllowed
     *        An array of strings that specify the compute types that are allowed for the batch build. See <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRestrictions withComputeTypesAllowed(String... computeTypesAllowed) {
        if (this.computeTypesAllowed == null) {
            setComputeTypesAllowed(new java.util.ArrayList<String>(computeTypesAllowed.length));
        }
        for (String ele : computeTypesAllowed) {
            this.computeTypesAllowed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the compute types that are allowed for the batch build. See <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     * </p>
     * 
     * @param computeTypesAllowed
     *        An array of strings that specify the compute types that are allowed for the batch build. See <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>AWS CodeBuild User Guide</i> for these values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRestrictions withComputeTypesAllowed(java.util.Collection<String> computeTypesAllowed) {
        setComputeTypesAllowed(computeTypesAllowed);
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
        if (getMaximumBuildsAllowed() != null)
            sb.append("MaximumBuildsAllowed: ").append(getMaximumBuildsAllowed()).append(",");
        if (getComputeTypesAllowed() != null)
            sb.append("ComputeTypesAllowed: ").append(getComputeTypesAllowed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchRestrictions == false)
            return false;
        BatchRestrictions other = (BatchRestrictions) obj;
        if (other.getMaximumBuildsAllowed() == null ^ this.getMaximumBuildsAllowed() == null)
            return false;
        if (other.getMaximumBuildsAllowed() != null && other.getMaximumBuildsAllowed().equals(this.getMaximumBuildsAllowed()) == false)
            return false;
        if (other.getComputeTypesAllowed() == null ^ this.getComputeTypesAllowed() == null)
            return false;
        if (other.getComputeTypesAllowed() != null && other.getComputeTypesAllowed().equals(this.getComputeTypesAllowed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumBuildsAllowed() == null) ? 0 : getMaximumBuildsAllowed().hashCode());
        hashCode = prime * hashCode + ((getComputeTypesAllowed() == null) ? 0 : getComputeTypesAllowed().hashCode());
        return hashCode;
    }

    @Override
    public BatchRestrictions clone() {
        try {
            return (BatchRestrictions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BatchRestrictionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
