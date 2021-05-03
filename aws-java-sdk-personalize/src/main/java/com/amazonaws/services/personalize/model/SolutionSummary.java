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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the properties of a solution. For a complete listing, call the <a>DescribeSolution</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/SolutionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the solution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     */
    private String solutionArn;
    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time (in Unix time) that the solution was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the solution.
     * </p>
     * 
     * @param name
     *        The name of the solution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the solution.
     * </p>
     * 
     * @return The name of the solution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the solution.
     * </p>
     * 
     * @param name
     *        The name of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The Amazon Resource Name (ARN) of the solution.
     */

    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the solution.
     */

    public String getSolutionArn() {
        return this.solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The Amazon Resource Name (ARN) of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionSummary withSolutionArn(String solutionArn) {
        setSolutionArn(solutionArn);
        return this;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution.</p>
     *        <p>
     *        A solution can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the solution.</p>
     *         <p>
     *         A solution can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution.</p>
     *        <p>
     *        A solution can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that the solution was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was created.
     * </p>
     * 
     * @return The date and time (in Unix time) that the solution was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that the solution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) that the solution was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSolutionArn() != null)
            sb.append("SolutionArn: ").append(getSolutionArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SolutionSummary == false)
            return false;
        SolutionSummary other = (SolutionSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SolutionSummary clone() {
        try {
            return (SolutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.SolutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
