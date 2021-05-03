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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a scaling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ScalingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     */
    private String policyARN;
    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target tracking
     * scaling policies</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple scaling
     * policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     */
    private String adjustmentType;
    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     */
    private Integer minAdjustmentStep;
    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>.
     * </p>
     */
    private Integer minAdjustmentMagnitude;
    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity.
     * </p>
     */
    private Integer scalingAdjustment;
    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds.
     * </p>
     */
    private Integer cooldown;
    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepAdjustment> stepAdjustments;
    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>.
     * </p>
     */
    private String metricAggregationType;
    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * </p>
     */
    private Integer estimatedInstanceWarmup;
    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Alarm> alarms;
    /**
     * <p>
     * A target tracking scaling policy.
     * </p>
     */
    private TargetTrackingConfiguration targetTrackingConfiguration;
    /**
     * <p>
     * Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @return The name of the scaling policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @param policyARN
     *        The Amazon Resource Name (ARN) of the policy.
     */

    public void setPolicyARN(String policyARN) {
        this.policyARN = policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the policy.
     */

    public String getPolicyARN() {
        return this.policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @param policyARN
     *        The Amazon Resource Name (ARN) of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withPolicyARN(String policyARN) {
        setPolicyARN(policyARN);
        return this;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target tracking
     * scaling policies</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple scaling
     * policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param policyType
     *        One of the following policy types: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetTrackingScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StepScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SimpleScaling</code> (default)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target
     *        tracking scaling policies</a> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple
     *        scaling policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target tracking
     * scaling policies</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple scaling
     * policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return One of the following policy types: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TargetTrackingScaling</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StepScaling</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SimpleScaling</code> (default)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target
     *         tracking scaling policies</a> and <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple
     *         scaling policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target tracking
     * scaling policies</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple scaling
     * policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param policyType
     *        One of the following policy types: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetTrackingScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StepScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SimpleScaling</code> (default)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target
     *        tracking scaling policies</a> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple
     *        scaling policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The
     *        valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *        <code>PercentChangeInCapacity</code>.
     */

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @return Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage).
     *         The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     */

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The
     *        valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *        <code>PercentChangeInCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withAdjustmentType(String adjustmentType) {
        setAdjustmentType(adjustmentType);
        return this;
    }

    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @param minAdjustmentStep
     *        Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     */

    public void setMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @return Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     */

    public Integer getMinAdjustmentStep() {
        return this.minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @param minAdjustmentStep
     *        Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withMinAdjustmentStep(Integer minAdjustmentStep) {
        setMinAdjustmentStep(minAdjustmentStep);
        return this;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>.
     */

    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @return The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>.
     */

    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        setMinAdjustmentMagnitude(minAdjustmentMagnitude);
        return this;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity.
     * </p>
     * 
     * @param scalingAdjustment
     *        The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     *        capacity while a negative number removes from the current capacity.
     */

    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity.
     * </p>
     * 
     * @return The amount by which to scale, based on the specified adjustment type. A positive value adds to the
     *         current capacity while a negative number removes from the current capacity.
     */

    public Integer getScalingAdjustment() {
        return this.scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity.
     * </p>
     * 
     * @param scalingAdjustment
     *        The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     *        capacity while a negative number removes from the current capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withScalingAdjustment(Integer scalingAdjustment) {
        setScalingAdjustment(scalingAdjustment);
        return this;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds.
     * </p>
     * 
     * @param cooldown
     *        The duration of the policy's cooldown period, in seconds.
     */

    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds.
     * </p>
     * 
     * @return The duration of the policy's cooldown period, in seconds.
     */

    public Integer getCooldown() {
        return this.cooldown;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds.
     * </p>
     * 
     * @param cooldown
     *        The duration of the policy's cooldown period, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withCooldown(Integer cooldown) {
        setCooldown(cooldown);
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * 
     * @return A set of adjustments that enable you to scale based on the size of the alarm breach.
     */

    public java.util.List<StepAdjustment> getStepAdjustments() {
        if (stepAdjustments == null) {
            stepAdjustments = new com.amazonaws.internal.SdkInternalList<StepAdjustment>();
        }
        return stepAdjustments;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.
     */

    public void setStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
            return;
        }

        this.stepAdjustments = new com.amazonaws.internal.SdkInternalList<StepAdjustment>(stepAdjustments);
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepAdjustments(java.util.Collection)} or {@link #withStepAdjustments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withStepAdjustments(StepAdjustment... stepAdjustments) {
        if (this.stepAdjustments == null) {
            setStepAdjustments(new com.amazonaws.internal.SdkInternalList<StepAdjustment>(stepAdjustments.length));
        }
        for (StepAdjustment ele : stepAdjustments) {
            this.stepAdjustments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        setStepAdjustments(stepAdjustments);
        return this;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>.
     */

    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>.
     * </p>
     * 
     * @return The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>,
     *         <code>Maximum</code>, and <code>Average</code>.
     */

    public String getMetricAggregationType() {
        return this.metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withMetricAggregationType(String metricAggregationType) {
        setMetricAggregationType(metricAggregationType);
        return this;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     */

    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * </p>
     * 
     * @return The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     */

    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        setEstimatedInstanceWarmup(estimatedInstanceWarmup);
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * 
     * @return The CloudWatch alarms related to the policy.
     */

    public java.util.List<Alarm> getAlarms() {
        if (alarms == null) {
            alarms = new com.amazonaws.internal.SdkInternalList<Alarm>();
        }
        return alarms;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms related to the policy.
     */

    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new com.amazonaws.internal.SdkInternalList<Alarm>(alarms);
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarms(java.util.Collection)} or {@link #withAlarms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms related to the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withAlarms(Alarm... alarms) {
        if (this.alarms == null) {
            setAlarms(new com.amazonaws.internal.SdkInternalList<Alarm>(alarms.length));
        }
        for (Alarm ele : alarms) {
            this.alarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms related to the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
        return this;
    }

    /**
     * <p>
     * A target tracking scaling policy.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        A target tracking scaling policy.
     */

    public void setTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking scaling policy.
     * </p>
     * 
     * @return A target tracking scaling policy.
     */

    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking scaling policy.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        A target tracking scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        setTargetTrackingConfiguration(targetTrackingConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     * </p>
     * 
     * @param enabled
     *        Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     * </p>
     * 
     * @return Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     * </p>
     * 
     * @param enabled
     *        Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     * </p>
     * 
     * @return Indicates whether the policy is enabled (<code>true</code>) or disabled (<code>false</code>).
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyARN() != null)
            sb.append("PolicyARN: ").append(getPolicyARN()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getAdjustmentType() != null)
            sb.append("AdjustmentType: ").append(getAdjustmentType()).append(",");
        if (getMinAdjustmentStep() != null)
            sb.append("MinAdjustmentStep: ").append(getMinAdjustmentStep()).append(",");
        if (getMinAdjustmentMagnitude() != null)
            sb.append("MinAdjustmentMagnitude: ").append(getMinAdjustmentMagnitude()).append(",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: ").append(getScalingAdjustment()).append(",");
        if (getCooldown() != null)
            sb.append("Cooldown: ").append(getCooldown()).append(",");
        if (getStepAdjustments() != null)
            sb.append("StepAdjustments: ").append(getStepAdjustments()).append(",");
        if (getMetricAggregationType() != null)
            sb.append("MetricAggregationType: ").append(getMetricAggregationType()).append(",");
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: ").append(getEstimatedInstanceWarmup()).append(",");
        if (getAlarms() != null)
            sb.append("Alarms: ").append(getAlarms()).append(",");
        if (getTargetTrackingConfiguration() != null)
            sb.append("TargetTrackingConfiguration: ").append(getTargetTrackingConfiguration()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicy == false)
            return false;
        ScalingPolicy other = (ScalingPolicy) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyARN() == null ^ this.getPolicyARN() == null)
            return false;
        if (other.getPolicyARN() != null && other.getPolicyARN().equals(this.getPolicyARN()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null)
            return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false)
            return false;
        if (other.getMinAdjustmentStep() == null ^ this.getMinAdjustmentStep() == null)
            return false;
        if (other.getMinAdjustmentStep() != null && other.getMinAdjustmentStep().equals(this.getMinAdjustmentStep()) == false)
            return false;
        if (other.getMinAdjustmentMagnitude() == null ^ this.getMinAdjustmentMagnitude() == null)
            return false;
        if (other.getMinAdjustmentMagnitude() != null && other.getMinAdjustmentMagnitude().equals(this.getMinAdjustmentMagnitude()) == false)
            return false;
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false)
            return false;
        if (other.getCooldown() == null ^ this.getCooldown() == null)
            return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false)
            return false;
        if (other.getStepAdjustments() == null ^ this.getStepAdjustments() == null)
            return false;
        if (other.getStepAdjustments() != null && other.getStepAdjustments().equals(this.getStepAdjustments()) == false)
            return false;
        if (other.getMetricAggregationType() == null ^ this.getMetricAggregationType() == null)
            return false;
        if (other.getMetricAggregationType() != null && other.getMetricAggregationType().equals(this.getMetricAggregationType()) == false)
            return false;
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        if (other.getTargetTrackingConfiguration() == null ^ this.getTargetTrackingConfiguration() == null)
            return false;
        if (other.getTargetTrackingConfiguration() != null && other.getTargetTrackingConfiguration().equals(this.getTargetTrackingConfiguration()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyARN() == null) ? 0 : getPolicyARN().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode());
        hashCode = prime * hashCode + ((getMinAdjustmentStep() == null) ? 0 : getMinAdjustmentStep().hashCode());
        hashCode = prime * hashCode + ((getMinAdjustmentMagnitude() == null) ? 0 : getMinAdjustmentMagnitude().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode + ((getCooldown() == null) ? 0 : getCooldown().hashCode());
        hashCode = prime * hashCode + ((getStepAdjustments() == null) ? 0 : getStepAdjustments().hashCode());
        hashCode = prime * hashCode + ((getMetricAggregationType() == null) ? 0 : getMetricAggregationType().hashCode());
        hashCode = prime * hashCode + ((getEstimatedInstanceWarmup() == null) ? 0 : getEstimatedInstanceWarmup().hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingConfiguration() == null) ? 0 : getTargetTrackingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicy clone() {
        try {
            return (ScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
