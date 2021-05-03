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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a recommendation option for an Auto Scaling group.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/AutoScalingGroupRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroupRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects that describe an Auto Scaling group configuration.
     * </p>
     */
    private AutoScalingGroupConfiguration configuration;
    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the Auto Scaling group recommendation
     * option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     */
    private java.util.List<UtilizationMetric> projectedUtilizationMetrics;
    /**
     * <p>
     * The performance risk of the Auto Scaling group configuration recommendation.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     */
    private Double performanceRisk;
    /**
     * <p>
     * The rank of the Auto Scaling group recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     */
    private Integer rank;

    /**
     * <p>
     * An array of objects that describe an Auto Scaling group configuration.
     * </p>
     * 
     * @param configuration
     *        An array of objects that describe an Auto Scaling group configuration.
     */

    public void setConfiguration(AutoScalingGroupConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * An array of objects that describe an Auto Scaling group configuration.
     * </p>
     * 
     * @return An array of objects that describe an Auto Scaling group configuration.
     */

    public AutoScalingGroupConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * An array of objects that describe an Auto Scaling group configuration.
     * </p>
     * 
     * @param configuration
     *        An array of objects that describe an Auto Scaling group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendationOption withConfiguration(AutoScalingGroupConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the Auto Scaling group recommendation
     * option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @return An array of objects that describe the projected utilization metrics of the Auto Scaling group
     *         recommendation option.</p> <note>
     *         <p>
     *         The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *         Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *         CloudWatch agent installed on them. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *         Utilization with the CloudWatch Agent</a>.
     *         </p>
     */

    public java.util.List<UtilizationMetric> getProjectedUtilizationMetrics() {
        return projectedUtilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the Auto Scaling group recommendation
     * option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the Auto Scaling group
     *        recommendation option.</p> <note>
     *        <p>
     *        The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *        Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *        CloudWatch agent installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     */

    public void setProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        if (projectedUtilizationMetrics == null) {
            this.projectedUtilizationMetrics = null;
            return;
        }

        this.projectedUtilizationMetrics = new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the Auto Scaling group recommendation
     * option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedUtilizationMetrics(java.util.Collection)} or
     * {@link #withProjectedUtilizationMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the Auto Scaling group
     *        recommendation option.</p> <note>
     *        <p>
     *        The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *        Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *        CloudWatch agent installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendationOption withProjectedUtilizationMetrics(UtilizationMetric... projectedUtilizationMetrics) {
        if (this.projectedUtilizationMetrics == null) {
            setProjectedUtilizationMetrics(new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics.length));
        }
        for (UtilizationMetric ele : projectedUtilizationMetrics) {
            this.projectedUtilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the Auto Scaling group recommendation
     * option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the Auto Scaling group
     *        recommendation option.</p> <note>
     *        <p>
     *        The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *        Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *        CloudWatch agent installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendationOption withProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        setProjectedUtilizationMetrics(projectedUtilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The performance risk of the Auto Scaling group configuration recommendation.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the Auto Scaling group configuration recommendation.</p>
     *        <p>
     *        Performance risk is the likelihood of the recommended instance type not meeting the performance
     *        requirement of your workload.
     *        </p>
     *        <p>
     *        The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     */

    public void setPerformanceRisk(Double performanceRisk) {
        this.performanceRisk = performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the Auto Scaling group configuration recommendation.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     * 
     * @return The performance risk of the Auto Scaling group configuration recommendation.</p>
     *         <p>
     *         Performance risk is the likelihood of the recommended instance type not meeting the performance
     *         requirement of your workload.
     *         </p>
     *         <p>
     *         The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     */

    public Double getPerformanceRisk() {
        return this.performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the Auto Scaling group configuration recommendation.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the Auto Scaling group configuration recommendation.</p>
     *        <p>
     *        Performance risk is the likelihood of the recommended instance type not meeting the performance
     *        requirement of your workload.
     *        </p>
     *        <p>
     *        The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendationOption withPerformanceRisk(Double performanceRisk) {
        setPerformanceRisk(performanceRisk);
        return this;
    }

    /**
     * <p>
     * The rank of the Auto Scaling group recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the Auto Scaling group recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank of the Auto Scaling group recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @return The rank of the Auto Scaling group recommendation option.</p>
     *         <p>
     *         The top recommendation option is ranked as <code>1</code>.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank of the Auto Scaling group recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the Auto Scaling group recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendationOption withRank(Integer rank) {
        setRank(rank);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getProjectedUtilizationMetrics() != null)
            sb.append("ProjectedUtilizationMetrics: ").append(getProjectedUtilizationMetrics()).append(",");
        if (getPerformanceRisk() != null)
            sb.append("PerformanceRisk: ").append(getPerformanceRisk()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingGroupRecommendationOption == false)
            return false;
        AutoScalingGroupRecommendationOption other = (AutoScalingGroupRecommendationOption) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getProjectedUtilizationMetrics() == null ^ this.getProjectedUtilizationMetrics() == null)
            return false;
        if (other.getProjectedUtilizationMetrics() != null && other.getProjectedUtilizationMetrics().equals(this.getProjectedUtilizationMetrics()) == false)
            return false;
        if (other.getPerformanceRisk() == null ^ this.getPerformanceRisk() == null)
            return false;
        if (other.getPerformanceRisk() != null && other.getPerformanceRisk().equals(this.getPerformanceRisk()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProjectedUtilizationMetrics() == null) ? 0 : getProjectedUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getPerformanceRisk() == null) ? 0 : getPerformanceRisk().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingGroupRecommendationOption clone() {
        try {
            return (AutoScalingGroupRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.AutoScalingGroupRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
