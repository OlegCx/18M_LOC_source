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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregators"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationAggregatorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration aggregators.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configurationAggregatorNames;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0,
     * AWS Config uses the default.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The name of the configuration aggregators.
     * </p>
     * 
     * @return The name of the configuration aggregators.
     */

    public java.util.List<String> getConfigurationAggregatorNames() {
        if (configurationAggregatorNames == null) {
            configurationAggregatorNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configurationAggregatorNames;
    }

    /**
     * <p>
     * The name of the configuration aggregators.
     * </p>
     * 
     * @param configurationAggregatorNames
     *        The name of the configuration aggregators.
     */

    public void setConfigurationAggregatorNames(java.util.Collection<String> configurationAggregatorNames) {
        if (configurationAggregatorNames == null) {
            this.configurationAggregatorNames = null;
            return;
        }

        this.configurationAggregatorNames = new com.amazonaws.internal.SdkInternalList<String>(configurationAggregatorNames);
    }

    /**
     * <p>
     * The name of the configuration aggregators.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationAggregatorNames(java.util.Collection)} or
     * {@link #withConfigurationAggregatorNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationAggregatorNames
     *        The name of the configuration aggregators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorsRequest withConfigurationAggregatorNames(String... configurationAggregatorNames) {
        if (this.configurationAggregatorNames == null) {
            setConfigurationAggregatorNames(new com.amazonaws.internal.SdkInternalList<String>(configurationAggregatorNames.length));
        }
        for (String ele : configurationAggregatorNames) {
            this.configurationAggregatorNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the configuration aggregators.
     * </p>
     * 
     * @param configurationAggregatorNames
     *        The name of the configuration aggregators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorsRequest withConfigurationAggregatorNames(java.util.Collection<String> configurationAggregatorNames) {
        setConfigurationAggregatorNames(configurationAggregatorNames);
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

    public DescribeConfigurationAggregatorsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0,
     * AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of configuration aggregators returned on each page. The default is maximum. If you
     *        specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0,
     * AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of configuration aggregators returned on each page. The default is maximum. If you
     *         specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0,
     * AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of configuration aggregators returned on each page. The default is maximum. If you
     *        specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getConfigurationAggregatorNames() != null)
            sb.append("ConfigurationAggregatorNames: ").append(getConfigurationAggregatorNames()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationAggregatorsRequest == false)
            return false;
        DescribeConfigurationAggregatorsRequest other = (DescribeConfigurationAggregatorsRequest) obj;
        if (other.getConfigurationAggregatorNames() == null ^ this.getConfigurationAggregatorNames() == null)
            return false;
        if (other.getConfigurationAggregatorNames() != null && other.getConfigurationAggregatorNames().equals(this.getConfigurationAggregatorNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationAggregatorNames() == null) ? 0 : getConfigurationAggregatorNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationAggregatorsRequest clone() {
        return (DescribeConfigurationAggregatorsRequest) super.clone();
    }

}
