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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeRegions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of Region information related to the directory for each replicated Region.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RegionDescription> regionsDescription;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeRegions</a> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of Region information related to the directory for each replicated Region.
     * </p>
     * 
     * @return List of Region information related to the directory for each replicated Region.
     */

    public java.util.List<RegionDescription> getRegionsDescription() {
        if (regionsDescription == null) {
            regionsDescription = new com.amazonaws.internal.SdkInternalList<RegionDescription>();
        }
        return regionsDescription;
    }

    /**
     * <p>
     * List of Region information related to the directory for each replicated Region.
     * </p>
     * 
     * @param regionsDescription
     *        List of Region information related to the directory for each replicated Region.
     */

    public void setRegionsDescription(java.util.Collection<RegionDescription> regionsDescription) {
        if (regionsDescription == null) {
            this.regionsDescription = null;
            return;
        }

        this.regionsDescription = new com.amazonaws.internal.SdkInternalList<RegionDescription>(regionsDescription);
    }

    /**
     * <p>
     * List of Region information related to the directory for each replicated Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionsDescription(java.util.Collection)} or {@link #withRegionsDescription(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param regionsDescription
     *        List of Region information related to the directory for each replicated Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsResult withRegionsDescription(RegionDescription... regionsDescription) {
        if (this.regionsDescription == null) {
            setRegionsDescription(new com.amazonaws.internal.SdkInternalList<RegionDescription>(regionsDescription.length));
        }
        for (RegionDescription ele : regionsDescription) {
            this.regionsDescription.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Region information related to the directory for each replicated Region.
     * </p>
     * 
     * @param regionsDescription
     *        List of Region information related to the directory for each replicated Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsResult withRegionsDescription(java.util.Collection<RegionDescription> regionsDescription) {
        setRegionsDescription(regionsDescription);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeRegions</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to <a>DescribeRegions</a> to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeRegions</a> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *         subsequent call to <a>DescribeRegions</a> to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeRegions</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to <a>DescribeRegions</a> to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRegionsDescription() != null)
            sb.append("RegionsDescription: ").append(getRegionsDescription()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegionsResult == false)
            return false;
        DescribeRegionsResult other = (DescribeRegionsResult) obj;
        if (other.getRegionsDescription() == null ^ this.getRegionsDescription() == null)
            return false;
        if (other.getRegionsDescription() != null && other.getRegionsDescription().equals(this.getRegionsDescription()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionsDescription() == null) ? 0 : getRegionsDescription().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegionsResult clone() {
        try {
            return (DescribeRegionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
