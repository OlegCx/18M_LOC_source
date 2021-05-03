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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your database. To
 * allow or block web requests that appear to contain malicious SQL code, create one or more SQL injection match
 * conditions. An SQL injection match condition identifies the part of web requests, such as the URI or the query
 * string, that you want AWS WAF to inspect. Later in the process, when you create a web ACL, you specify whether to
 * allow or block requests that appear to contain malicious SQL code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/SqliMatchStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqliMatchStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     */
    private FieldToMatch fieldToMatch;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     */
    private java.util.List<TextTransformation> textTransformations;

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     */

    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @return The part of a web request that you want AWS WAF to inspect. For more information, see
     *         <a>FieldToMatch</a>.
     */

    public FieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqliMatchStatement withFieldToMatch(FieldToMatch fieldToMatch) {
        setFieldToMatch(fieldToMatch);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *         effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *         performs all transformations on the content of the request component identified by
     *         <code>FieldToMatch</code>, starting from the lowest priority setting, before inspecting the content for a
     *         match.
     */

    public java.util.List<TextTransformation> getTextTransformations() {
        return textTransformations;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content of the request component identified by
     *        <code>FieldToMatch</code>, starting from the lowest priority setting, before inspecting the content for a
     *        match.
     */

    public void setTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
        if (textTransformations == null) {
            this.textTransformations = null;
            return;
        }

        this.textTransformations = new java.util.ArrayList<TextTransformation>(textTransformations);
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextTransformations(java.util.Collection)} or {@link #withTextTransformations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content of the request component identified by
     *        <code>FieldToMatch</code>, starting from the lowest priority setting, before inspecting the content for a
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqliMatchStatement withTextTransformations(TextTransformation... textTransformations) {
        if (this.textTransformations == null) {
            setTextTransformations(new java.util.ArrayList<TextTransformation>(textTransformations.length));
        }
        for (TextTransformation ele : textTransformations) {
            this.textTransformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content of the request component identified by
     *        <code>FieldToMatch</code>, starting from the lowest priority setting, before inspecting the content for a
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqliMatchStatement withTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
        setTextTransformations(textTransformations);
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
        if (getFieldToMatch() != null)
            sb.append("FieldToMatch: ").append(getFieldToMatch()).append(",");
        if (getTextTransformations() != null)
            sb.append("TextTransformations: ").append(getTextTransformations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqliMatchStatement == false)
            return false;
        SqliMatchStatement other = (SqliMatchStatement) obj;
        if (other.getFieldToMatch() == null ^ this.getFieldToMatch() == null)
            return false;
        if (other.getFieldToMatch() != null && other.getFieldToMatch().equals(this.getFieldToMatch()) == false)
            return false;
        if (other.getTextTransformations() == null ^ this.getTextTransformations() == null)
            return false;
        if (other.getTextTransformations() != null && other.getTextTransformations().equals(this.getTextTransformations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldToMatch() == null) ? 0 : getFieldToMatch().hashCode());
        hashCode = prime * hashCode + ((getTextTransformations() == null) ? 0 : getTextTransformations().hashCode());
        return hashCode;
    }

    @Override
    public SqliMatchStatement clone() {
        try {
            return (SqliMatchStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.SqliMatchStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
