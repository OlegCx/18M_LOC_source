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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DescribeCodeCoverages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCodeCoveragesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>DescribeCodeCoverages</code> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of <code>CodeCoverage</code> objects that contain the results.
     * </p>
     */
    private java.util.List<CodeCoverage> codeCoverages;

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>DescribeCodeCoverages</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to
     *        <code>DescribeCodeCoverages</code> to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>DescribeCodeCoverages</code> to retrieve the next set of items.
     * </p>
     * 
     * @return If there are more items to return, this contains a token that is passed to a subsequent call to
     *         <code>DescribeCodeCoverages</code> to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to
     * <code>DescribeCodeCoverages</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to
     *        <code>DescribeCodeCoverages</code> to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>CodeCoverage</code> objects that contain the results.
     * </p>
     * 
     * @return An array of <code>CodeCoverage</code> objects that contain the results.
     */

    public java.util.List<CodeCoverage> getCodeCoverages() {
        return codeCoverages;
    }

    /**
     * <p>
     * An array of <code>CodeCoverage</code> objects that contain the results.
     * </p>
     * 
     * @param codeCoverages
     *        An array of <code>CodeCoverage</code> objects that contain the results.
     */

    public void setCodeCoverages(java.util.Collection<CodeCoverage> codeCoverages) {
        if (codeCoverages == null) {
            this.codeCoverages = null;
            return;
        }

        this.codeCoverages = new java.util.ArrayList<CodeCoverage>(codeCoverages);
    }

    /**
     * <p>
     * An array of <code>CodeCoverage</code> objects that contain the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCodeCoverages(java.util.Collection)} or {@link #withCodeCoverages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param codeCoverages
     *        An array of <code>CodeCoverage</code> objects that contain the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesResult withCodeCoverages(CodeCoverage... codeCoverages) {
        if (this.codeCoverages == null) {
            setCodeCoverages(new java.util.ArrayList<CodeCoverage>(codeCoverages.length));
        }
        for (CodeCoverage ele : codeCoverages) {
            this.codeCoverages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>CodeCoverage</code> objects that contain the results.
     * </p>
     * 
     * @param codeCoverages
     *        An array of <code>CodeCoverage</code> objects that contain the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesResult withCodeCoverages(java.util.Collection<CodeCoverage> codeCoverages) {
        setCodeCoverages(codeCoverages);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCodeCoverages() != null)
            sb.append("CodeCoverages: ").append(getCodeCoverages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCodeCoveragesResult == false)
            return false;
        DescribeCodeCoveragesResult other = (DescribeCodeCoveragesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCodeCoverages() == null ^ this.getCodeCoverages() == null)
            return false;
        if (other.getCodeCoverages() != null && other.getCodeCoverages().equals(this.getCodeCoverages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCodeCoverages() == null) ? 0 : getCodeCoverages().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCodeCoveragesResult clone() {
        try {
            return (DescribeCodeCoveragesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
