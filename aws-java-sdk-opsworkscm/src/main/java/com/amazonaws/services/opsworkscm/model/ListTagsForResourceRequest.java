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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet Enterprise
     * server for which you want to show applied tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It indicates that not all entries have been
     * returned, and that you must run at least one more request to get remaining items. To get remaining results, call
     * <code>ListTagsForResource</code> again, and assign the token from the previous results as the value of the
     * <code>nextToken</code> parameter. If there are no more results, the response object's <code>nextToken</code>
     * parameter value is <code>null</code>. Setting a <code>nextToken</code> value that was not returned in your
     * previous results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet Enterprise
     * server for which you want to show applied tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Number (ARN) of an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet
     *        Enterprise server for which you want to show applied tags. For example,
     *        <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     *        .
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet Enterprise
     * server for which you want to show applied tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet
     *         Enterprise server for which you want to show applied tags. For example,
     *         <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     *         .
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet Enterprise
     * server for which you want to show applied tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Number (ARN) of an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet
     *        Enterprise server for which you want to show applied tags. For example,
     *        <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It indicates that not all entries have been
     * returned, and that you must run at least one more request to get remaining items. To get remaining results, call
     * <code>ListTagsForResource</code> again, and assign the token from the previous results as the value of the
     * <code>nextToken</code> parameter. If there are no more results, the response object's <code>nextToken</code>
     * parameter value is <code>null</code>. Setting a <code>nextToken</code> value that was not returned in your
     * previous results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     * 
     * @param nextToken
     *        NextToken is a string that is returned in some command responses. It indicates that not all entries have
     *        been returned, and that you must run at least one more request to get remaining items. To get remaining
     *        results, call <code>ListTagsForResource</code> again, and assign the token from the previous results as
     *        the value of the <code>nextToken</code> parameter. If there are no more results, the response object's
     *        <code>nextToken</code> parameter value is <code>null</code>. Setting a <code>nextToken</code> value that
     *        was not returned in your previous results causes an <code>InvalidNextTokenException</code> to occur.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It indicates that not all entries have been
     * returned, and that you must run at least one more request to get remaining items. To get remaining results, call
     * <code>ListTagsForResource</code> again, and assign the token from the previous results as the value of the
     * <code>nextToken</code> parameter. If there are no more results, the response object's <code>nextToken</code>
     * parameter value is <code>null</code>. Setting a <code>nextToken</code> value that was not returned in your
     * previous results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     * 
     * @return NextToken is a string that is returned in some command responses. It indicates that not all entries have
     *         been returned, and that you must run at least one more request to get remaining items. To get remaining
     *         results, call <code>ListTagsForResource</code> again, and assign the token from the previous results as
     *         the value of the <code>nextToken</code> parameter. If there are no more results, the response object's
     *         <code>nextToken</code> parameter value is <code>null</code>. Setting a <code>nextToken</code> value that
     *         was not returned in your previous results causes an <code>InvalidNextTokenException</code> to occur.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It indicates that not all entries have been
     * returned, and that you must run at least one more request to get remaining items. To get remaining results, call
     * <code>ListTagsForResource</code> again, and assign the token from the previous results as the value of the
     * <code>nextToken</code> parameter. If there are no more results, the response object's <code>nextToken</code>
     * parameter value is <code>null</code>. Setting a <code>nextToken</code> value that was not returned in your
     * previous results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     * 
     * @param nextToken
     *        NextToken is a string that is returned in some command responses. It indicates that not all entries have
     *        been returned, and that you must run at least one more request to get remaining items. To get remaining
     *        results, call <code>ListTagsForResource</code> again, and assign the token from the previous results as
     *        the value of the <code>nextToken</code> parameter. If there are no more results, the response object's
     *        <code>nextToken</code> parameter value is <code>null</code>. Setting a <code>nextToken</code> value that
     *        was not returned in your previous results causes an <code>InvalidNextTokenException</code> to occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     * 
     * @param maxResults
     *        To receive a paginated response, use this parameter to specify the maximum number of results to be
     *        returned with a single call. If the number of available results exceeds this maximum, the response
     *        includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code> request
     *        parameter to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     * 
     * @return To receive a paginated response, use this parameter to specify the maximum number of results to be
     *         returned with a single call. If the number of available results exceeds this maximum, the response
     *         includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code> request
     *         parameter to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     * 
     * @param maxResults
     *        To receive a paginated response, use this parameter to specify the maximum number of results to be
     *        returned with a single call. If the number of available results exceeds this maximum, the response
     *        includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code> request
     *        parameter to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
