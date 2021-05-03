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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexPatternSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegexPatternSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to get.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     */
    private String regexPatternSetId;

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to get.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @param regexPatternSetId
     *        The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to get.
     *        <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *        <a>ListRegexPatternSets</a>.
     */

    public void setRegexPatternSetId(String regexPatternSetId) {
        this.regexPatternSetId = regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to get.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @return The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to get.
     *         <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *         <a>ListRegexPatternSets</a>.
     */

    public String getRegexPatternSetId() {
        return this.regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to get.
     * <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * 
     * @param regexPatternSetId
     *        The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you want to get.
     *        <code>RegexPatternSetId</code> is returned by <a>CreateRegexPatternSet</a> and by
     *        <a>ListRegexPatternSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegexPatternSetRequest withRegexPatternSetId(String regexPatternSetId) {
        setRegexPatternSetId(regexPatternSetId);
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
        if (getRegexPatternSetId() != null)
            sb.append("RegexPatternSetId: ").append(getRegexPatternSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegexPatternSetRequest == false)
            return false;
        GetRegexPatternSetRequest other = (GetRegexPatternSetRequest) obj;
        if (other.getRegexPatternSetId() == null ^ this.getRegexPatternSetId() == null)
            return false;
        if (other.getRegexPatternSetId() != null && other.getRegexPatternSetId().equals(this.getRegexPatternSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexPatternSetId() == null) ? 0 : getRegexPatternSetId().hashCode());
        return hashCode;
    }

    @Override
    public GetRegexPatternSetRequest clone() {
        return (GetRegexPatternSetRequest) super.clone();
    }

}
