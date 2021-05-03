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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about dimensions that contributed to an anomaly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ContributionMatrix" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContributionMatrix implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of contributing dimensions.
     * </p>
     */
    private java.util.List<DimensionContribution> dimensionContributionList;

    /**
     * <p>
     * A list of contributing dimensions.
     * </p>
     * 
     * @return A list of contributing dimensions.
     */

    public java.util.List<DimensionContribution> getDimensionContributionList() {
        return dimensionContributionList;
    }

    /**
     * <p>
     * A list of contributing dimensions.
     * </p>
     * 
     * @param dimensionContributionList
     *        A list of contributing dimensions.
     */

    public void setDimensionContributionList(java.util.Collection<DimensionContribution> dimensionContributionList) {
        if (dimensionContributionList == null) {
            this.dimensionContributionList = null;
            return;
        }

        this.dimensionContributionList = new java.util.ArrayList<DimensionContribution>(dimensionContributionList);
    }

    /**
     * <p>
     * A list of contributing dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionContributionList(java.util.Collection)} or
     * {@link #withDimensionContributionList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dimensionContributionList
     *        A list of contributing dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContributionMatrix withDimensionContributionList(DimensionContribution... dimensionContributionList) {
        if (this.dimensionContributionList == null) {
            setDimensionContributionList(new java.util.ArrayList<DimensionContribution>(dimensionContributionList.length));
        }
        for (DimensionContribution ele : dimensionContributionList) {
            this.dimensionContributionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of contributing dimensions.
     * </p>
     * 
     * @param dimensionContributionList
     *        A list of contributing dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContributionMatrix withDimensionContributionList(java.util.Collection<DimensionContribution> dimensionContributionList) {
        setDimensionContributionList(dimensionContributionList);
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
        if (getDimensionContributionList() != null)
            sb.append("DimensionContributionList: ").append(getDimensionContributionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContributionMatrix == false)
            return false;
        ContributionMatrix other = (ContributionMatrix) obj;
        if (other.getDimensionContributionList() == null ^ this.getDimensionContributionList() == null)
            return false;
        if (other.getDimensionContributionList() != null && other.getDimensionContributionList().equals(this.getDimensionContributionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionContributionList() == null) ? 0 : getDimensionContributionList().hashCode());
        return hashCode;
    }

    @Override
    public ContributionMatrix clone() {
        try {
            return (ContributionMatrix) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.ContributionMatrixMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
