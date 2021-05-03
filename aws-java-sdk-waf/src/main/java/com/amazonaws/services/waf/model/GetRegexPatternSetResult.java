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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexPatternSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegexPatternSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>RegexPatternSet</a> that you specified in the <code>GetRegexPatternSet</code> request,
     * including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for.
     * </p>
     */
    private RegexPatternSet regexPatternSet;

    /**
     * <p>
     * Information about the <a>RegexPatternSet</a> that you specified in the <code>GetRegexPatternSet</code> request,
     * including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for.
     * </p>
     * 
     * @param regexPatternSet
     *        Information about the <a>RegexPatternSet</a> that you specified in the <code>GetRegexPatternSet</code>
     *        request, including the identifier of the pattern set and the regular expression patterns you want AWS WAF
     *        to search for.
     */

    public void setRegexPatternSet(RegexPatternSet regexPatternSet) {
        this.regexPatternSet = regexPatternSet;
    }

    /**
     * <p>
     * Information about the <a>RegexPatternSet</a> that you specified in the <code>GetRegexPatternSet</code> request,
     * including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for.
     * </p>
     * 
     * @return Information about the <a>RegexPatternSet</a> that you specified in the <code>GetRegexPatternSet</code>
     *         request, including the identifier of the pattern set and the regular expression patterns you want AWS WAF
     *         to search for.
     */

    public RegexPatternSet getRegexPatternSet() {
        return this.regexPatternSet;
    }

    /**
     * <p>
     * Information about the <a>RegexPatternSet</a> that you specified in the <code>GetRegexPatternSet</code> request,
     * including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for.
     * </p>
     * 
     * @param regexPatternSet
     *        Information about the <a>RegexPatternSet</a> that you specified in the <code>GetRegexPatternSet</code>
     *        request, including the identifier of the pattern set and the regular expression patterns you want AWS WAF
     *        to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegexPatternSetResult withRegexPatternSet(RegexPatternSet regexPatternSet) {
        setRegexPatternSet(regexPatternSet);
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
        if (getRegexPatternSet() != null)
            sb.append("RegexPatternSet: ").append(getRegexPatternSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegexPatternSetResult == false)
            return false;
        GetRegexPatternSetResult other = (GetRegexPatternSetResult) obj;
        if (other.getRegexPatternSet() == null ^ this.getRegexPatternSet() == null)
            return false;
        if (other.getRegexPatternSet() != null && other.getRegexPatternSet().equals(this.getRegexPatternSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexPatternSet() == null) ? 0 : getRegexPatternSet().hashCode());
        return hashCode;
    }

    @Override
    public GetRegexPatternSetResult clone() {
        try {
            return (GetRegexPatternSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
