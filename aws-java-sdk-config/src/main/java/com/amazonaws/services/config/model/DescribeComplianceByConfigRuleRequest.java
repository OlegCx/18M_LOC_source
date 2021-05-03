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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByConfigRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComplianceByConfigRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify one or more AWS Config rule names to filter the results by rule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configRuleNames;
    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> complianceTypes;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specify one or more AWS Config rule names to filter the results by rule.
     * </p>
     * 
     * @return Specify one or more AWS Config rule names to filter the results by rule.
     */

    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
            configRuleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configRuleNames;
    }

    /**
     * <p>
     * Specify one or more AWS Config rule names to filter the results by rule.
     * </p>
     * 
     * @param configRuleNames
     *        Specify one or more AWS Config rule names to filter the results by rule.
     */

    public void setConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
            return;
        }

        this.configRuleNames = new com.amazonaws.internal.SdkInternalList<String>(configRuleNames);
    }

    /**
     * <p>
     * Specify one or more AWS Config rule names to filter the results by rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRuleNames(java.util.Collection)} or {@link #withConfigRuleNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configRuleNames
     *        Specify one or more AWS Config rule names to filter the results by rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComplianceByConfigRuleRequest withConfigRuleNames(String... configRuleNames) {
        if (this.configRuleNames == null) {
            setConfigRuleNames(new com.amazonaws.internal.SdkInternalList<String>(configRuleNames.length));
        }
        for (String ele : configRuleNames) {
            this.configRuleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more AWS Config rule names to filter the results by rule.
     * </p>
     * 
     * @param configRuleNames
     *        Specify one or more AWS Config rule names to filter the results by rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComplianceByConfigRuleRequest withConfigRuleNames(java.util.Collection<String> configRuleNames) {
        setConfigRuleNames(configRuleNames);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return Filters the results by compliance.</p>
     *         <p>
     *         The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ComplianceType
     */

    public java.util.List<String> getComplianceTypes() {
        if (complianceTypes == null) {
            complianceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return complianceTypes;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ComplianceType
     */

    public void setComplianceTypes(java.util.Collection<String> complianceTypes) {
        if (complianceTypes == null) {
            this.complianceTypes = null;
            return;
        }

        this.complianceTypes = new com.amazonaws.internal.SdkInternalList<String>(complianceTypes);
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceTypes(java.util.Collection)} or {@link #withComplianceTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public DescribeComplianceByConfigRuleRequest withComplianceTypes(String... complianceTypes) {
        if (this.complianceTypes == null) {
            setComplianceTypes(new com.amazonaws.internal.SdkInternalList<String>(complianceTypes.length));
        }
        for (String ele : complianceTypes) {
            this.complianceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public DescribeComplianceByConfigRuleRequest withComplianceTypes(java.util.Collection<String> complianceTypes) {
        setComplianceTypes(complianceTypes);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public DescribeComplianceByConfigRuleRequest withComplianceTypes(ComplianceType... complianceTypes) {
        com.amazonaws.internal.SdkInternalList<String> complianceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(complianceTypes.length);
        for (ComplianceType value : complianceTypes) {
            complianceTypesCopy.add(value.toString());
        }
        if (getComplianceTypes() == null) {
            setComplianceTypes(complianceTypesCopy);
        } else {
            getComplianceTypes().addAll(complianceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComplianceByConfigRuleRequest withNextToken(String nextToken) {
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
        if (getConfigRuleNames() != null)
            sb.append("ConfigRuleNames: ").append(getConfigRuleNames()).append(",");
        if (getComplianceTypes() != null)
            sb.append("ComplianceTypes: ").append(getComplianceTypes()).append(",");
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

        if (obj instanceof DescribeComplianceByConfigRuleRequest == false)
            return false;
        DescribeComplianceByConfigRuleRequest other = (DescribeComplianceByConfigRuleRequest) obj;
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null)
            return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false)
            return false;
        if (other.getComplianceTypes() == null ^ this.getComplianceTypes() == null)
            return false;
        if (other.getComplianceTypes() != null && other.getComplianceTypes().equals(this.getComplianceTypes()) == false)
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

        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode());
        hashCode = prime * hashCode + ((getComplianceTypes() == null) ? 0 : getComplianceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComplianceByConfigRuleRequest clone() {
        return (DescribeComplianceByConfigRuleRequest) super.clone();
    }

}
