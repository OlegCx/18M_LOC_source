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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetPreparedStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPreparedStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the prepared statement to retrieve.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * The workgroup to which the statement to be retrieved belongs.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * The name of the prepared statement to retrieve.
     * </p>
     * 
     * @param statementName
     *        The name of the prepared statement to retrieve.
     */

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    /**
     * <p>
     * The name of the prepared statement to retrieve.
     * </p>
     * 
     * @return The name of the prepared statement to retrieve.
     */

    public String getStatementName() {
        return this.statementName;
    }

    /**
     * <p>
     * The name of the prepared statement to retrieve.
     * </p>
     * 
     * @param statementName
     *        The name of the prepared statement to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPreparedStatementRequest withStatementName(String statementName) {
        setStatementName(statementName);
        return this;
    }

    /**
     * <p>
     * The workgroup to which the statement to be retrieved belongs.
     * </p>
     * 
     * @param workGroup
     *        The workgroup to which the statement to be retrieved belongs.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The workgroup to which the statement to be retrieved belongs.
     * </p>
     * 
     * @return The workgroup to which the statement to be retrieved belongs.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The workgroup to which the statement to be retrieved belongs.
     * </p>
     * 
     * @param workGroup
     *        The workgroup to which the statement to be retrieved belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPreparedStatementRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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
        if (getStatementName() != null)
            sb.append("StatementName: ").append(getStatementName()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPreparedStatementRequest == false)
            return false;
        GetPreparedStatementRequest other = (GetPreparedStatementRequest) obj;
        if (other.getStatementName() == null ^ this.getStatementName() == null)
            return false;
        if (other.getStatementName() != null && other.getStatementName().equals(this.getStatementName()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetPreparedStatementRequest clone() {
        return (GetPreparedStatementRequest) super.clone();
    }

}
