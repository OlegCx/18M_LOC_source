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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteSubscriptionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSubscriptionFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     */
    private String filterName;

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSubscriptionFilterRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * 
     * @param filterName
     *        The name of the subscription filter.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * 
     * @return The name of the subscription filter.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * 
     * @param filterName
     *        The name of the subscription filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSubscriptionFilterRequest withFilterName(String filterName) {
        setFilterName(filterName);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSubscriptionFilterRequest == false)
            return false;
        DeleteSubscriptionFilterRequest other = (DeleteSubscriptionFilterRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSubscriptionFilterRequest clone() {
        return (DeleteSubscriptionFilterRequest) super.clone();
    }

}
