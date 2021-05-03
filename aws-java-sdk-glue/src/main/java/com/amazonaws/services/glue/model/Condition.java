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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a condition under which a trigger fires.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A logical operator.
     * </p>
     */
    private String logicalOperator;
    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to, and on which this trigger waits.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The name of the crawler to which this condition applies.
     * </p>
     */
    private String crawlerName;
    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     */
    private String crawlState;

    /**
     * <p>
     * A logical operator.
     * </p>
     * 
     * @param logicalOperator
     *        A logical operator.
     * @see LogicalOperator
     */

    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    /**
     * <p>
     * A logical operator.
     * </p>
     * 
     * @return A logical operator.
     * @see LogicalOperator
     */

    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    /**
     * <p>
     * A logical operator.
     * </p>
     * 
     * @param logicalOperator
     *        A logical operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public Condition withLogicalOperator(String logicalOperator) {
        setLogicalOperator(logicalOperator);
        return this;
    }

    /**
     * <p>
     * A logical operator.
     * </p>
     * 
     * @param logicalOperator
     *        A logical operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public Condition withLogicalOperator(LogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator.toString();
        return this;
    }

    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to, and on which this trigger waits.
     * </p>
     * 
     * @param jobName
     *        The name of the job whose <code>JobRuns</code> this condition applies to, and on which this trigger waits.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to, and on which this trigger waits.
     * </p>
     * 
     * @return The name of the job whose <code>JobRuns</code> this condition applies to, and on which this trigger
     *         waits.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to, and on which this trigger waits.
     * </p>
     * 
     * @param jobName
     *        The name of the job whose <code>JobRuns</code> this condition applies to, and on which this trigger waits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * 
     * @param state
     *        The condition state. Currently, the only job states that a trigger can listen for are
     *        <code>SUCCEEDED</code>, <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only
     *        crawler states that a trigger can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and
     *        <code>CANCELLED</code>.
     * @see JobRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * 
     * @return The condition state. Currently, the only job states that a trigger can listen for are
     *         <code>SUCCEEDED</code>, <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only
     *         crawler states that a trigger can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and
     *         <code>CANCELLED</code>.
     * @see JobRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * 
     * @param state
     *        The condition state. Currently, the only job states that a trigger can listen for are
     *        <code>SUCCEEDED</code>, <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only
     *        crawler states that a trigger can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and
     *        <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public Condition withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * 
     * @param state
     *        The condition state. Currently, the only job states that a trigger can listen for are
     *        <code>SUCCEEDED</code>, <code>STOPPED</code>, <code>FAILED</code>, and <code>TIMEOUT</code>. The only
     *        crawler states that a trigger can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and
     *        <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public Condition withState(JobRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The name of the crawler to which this condition applies.
     * </p>
     * 
     * @param crawlerName
     *        The name of the crawler to which this condition applies.
     */

    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * The name of the crawler to which this condition applies.
     * </p>
     * 
     * @return The name of the crawler to which this condition applies.
     */

    public String getCrawlerName() {
        return this.crawlerName;
    }

    /**
     * <p>
     * The name of the crawler to which this condition applies.
     * </p>
     * 
     * @param crawlerName
     *        The name of the crawler to which this condition applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withCrawlerName(String crawlerName) {
        setCrawlerName(crawlerName);
        return this;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * 
     * @param crawlState
     *        The state of the crawler to which this condition applies.
     * @see CrawlState
     */

    public void setCrawlState(String crawlState) {
        this.crawlState = crawlState;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * 
     * @return The state of the crawler to which this condition applies.
     * @see CrawlState
     */

    public String getCrawlState() {
        return this.crawlState;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * 
     * @param crawlState
     *        The state of the crawler to which this condition applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlState
     */

    public Condition withCrawlState(String crawlState) {
        setCrawlState(crawlState);
        return this;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * 
     * @param crawlState
     *        The state of the crawler to which this condition applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlState
     */

    public Condition withCrawlState(CrawlState crawlState) {
        this.crawlState = crawlState.toString();
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
        if (getLogicalOperator() != null)
            sb.append("LogicalOperator: ").append(getLogicalOperator()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCrawlerName() != null)
            sb.append("CrawlerName: ").append(getCrawlerName()).append(",");
        if (getCrawlState() != null)
            sb.append("CrawlState: ").append(getCrawlState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getLogicalOperator() == null ^ this.getLogicalOperator() == null)
            return false;
        if (other.getLogicalOperator() != null && other.getLogicalOperator().equals(this.getLogicalOperator()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        if (other.getCrawlState() == null ^ this.getCrawlState() == null)
            return false;
        if (other.getCrawlState() != null && other.getCrawlState().equals(this.getCrawlState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogicalOperator() == null) ? 0 : getLogicalOperator().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        hashCode = prime * hashCode + ((getCrawlState() == null) ? 0 : getCrawlState().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
