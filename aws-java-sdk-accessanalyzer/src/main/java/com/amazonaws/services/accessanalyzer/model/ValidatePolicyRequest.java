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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ValidatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The locale to use for localizing the findings.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups. They also include service-control policies (SCPs)
     * that are attached to an AWS organization, organizational unit (OU), or an account.
     * </p>
     * <p>
     * Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM roles and
     * bucket policies for S3 buckets. You can provide a generic input such as identity policy or resource policy or a
     * specific input such as managed policy or S3 bucket policy.
     * </p>
     */
    private String policyType;

    /**
     * <p>
     * The locale to use for localizing the findings.
     * </p>
     * 
     * @param locale
     *        The locale to use for localizing the findings.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale to use for localizing the findings.
     * </p>
     * 
     * @return The locale to use for localizing the findings.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale to use for localizing the findings.
     * </p>
     * 
     * @param locale
     *        The locale to use for localizing the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public ValidatePolicyRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The locale to use for localizing the findings.
     * </p>
     * 
     * @param locale
     *        The locale to use for localizing the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public ValidatePolicyRequest withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON policy document to use as the content for the policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @return The JSON policy document to use as the content for the policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON policy document to use as the content for the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups. They also include service-control policies (SCPs)
     * that are attached to an AWS organization, organizational unit (OU), or an account.
     * </p>
     * <p>
     * Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM roles and
     * bucket policies for S3 buckets. You can provide a generic input such as identity policy or resource policy or a
     * specific input such as managed policy or S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies
     *        include managed and inline policies for IAM roles, users, and groups. They also include service-control
     *        policies (SCPs) that are attached to an AWS organization, organizational unit (OU), or an account.</p>
     *        <p>
     *        Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM
     *        roles and bucket policies for S3 buckets. You can provide a generic input such as identity policy or
     *        resource policy or a specific input such as managed policy or S3 bucket policy.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups. They also include service-control policies (SCPs)
     * that are attached to an AWS organization, organizational unit (OU), or an account.
     * </p>
     * <p>
     * Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM roles and
     * bucket policies for S3 buckets. You can provide a generic input such as identity policy or resource policy or a
     * specific input such as managed policy or S3 bucket policy.
     * </p>
     * 
     * @return The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies
     *         include managed and inline policies for IAM roles, users, and groups. They also include service-control
     *         policies (SCPs) that are attached to an AWS organization, organizational unit (OU), or an account.</p>
     *         <p>
     *         Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM
     *         roles and bucket policies for S3 buckets. You can provide a generic input such as identity policy or
     *         resource policy or a specific input such as managed policy or S3 bucket policy.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups. They also include service-control policies (SCPs)
     * that are attached to an AWS organization, organizational unit (OU), or an account.
     * </p>
     * <p>
     * Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM roles and
     * bucket policies for S3 buckets. You can provide a generic input such as identity policy or resource policy or a
     * specific input such as managed policy or S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies
     *        include managed and inline policies for IAM roles, users, and groups. They also include service-control
     *        policies (SCPs) that are attached to an AWS organization, organizational unit (OU), or an account.</p>
     *        <p>
     *        Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM
     *        roles and bucket policies for S3 buckets. You can provide a generic input such as identity policy or
     *        resource policy or a specific input such as managed policy or S3 bucket policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ValidatePolicyRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies include
     * managed and inline policies for IAM roles, users, and groups. They also include service-control policies (SCPs)
     * that are attached to an AWS organization, organizational unit (OU), or an account.
     * </p>
     * <p>
     * Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM roles and
     * bucket policies for S3 buckets. You can provide a generic input such as identity policy or resource policy or a
     * specific input such as managed policy or S3 bucket policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies
     *        include managed and inline policies for IAM roles, users, and groups. They also include service-control
     *        policies (SCPs) that are attached to an AWS organization, organizational unit (OU), or an account.</p>
     *        <p>
     *        Resource policies grant permissions on AWS resources. Resource policies include trust policies for IAM
     *        roles and bucket policies for S3 buckets. You can provide a generic input such as identity policy or
     *        resource policy or a specific input such as managed policy or S3 bucket policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ValidatePolicyRequest withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
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
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidatePolicyRequest == false)
            return false;
        ValidatePolicyRequest other = (ValidatePolicyRequest) obj;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public ValidatePolicyRequest clone() {
        return (ValidatePolicyRequest) super.clone();
    }

}
