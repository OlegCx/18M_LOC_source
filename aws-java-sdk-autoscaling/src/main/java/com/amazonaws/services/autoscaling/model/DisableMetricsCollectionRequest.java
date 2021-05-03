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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DisableMetricsCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableMetricsCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * Specifies one or more of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolWarmedCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit this parameter, all metrics are disabled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> metrics;

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

    public DisableMetricsCollectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies one or more of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolWarmedCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit this parameter, all metrics are disabled.
     * </p>
     * 
     * @return Specifies one or more of the following metrics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GroupMinSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupMaxSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupInServiceInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupPendingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupStandbyInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTerminatingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTotalInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupInServiceCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupPendingCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupStandbyCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTerminatingCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTotalCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WarmPoolDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WarmPoolWarmedCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WarmPoolPendingCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WarmPoolTerminatingCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WarmPoolTotalCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupAndWarmPoolDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupAndWarmPoolTotalCapacity</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you omit this parameter, all metrics are disabled.
     */

    public java.util.List<String> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return metrics;
    }

    /**
     * <p>
     * Specifies one or more of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolWarmedCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit this parameter, all metrics are disabled.
     * </p>
     * 
     * @param metrics
     *        Specifies one or more of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolWarmedCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolPendingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolTerminatingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolTotalCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupAndWarmPoolDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupAndWarmPoolTotalCapacity</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit this parameter, all metrics are disabled.
     */

    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<String>(metrics);
    }

    /**
     * <p>
     * Specifies one or more of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolWarmedCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit this parameter, all metrics are disabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        Specifies one or more of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolWarmedCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolPendingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolTerminatingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolTotalCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupAndWarmPoolDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupAndWarmPoolTotalCapacity</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit this parameter, all metrics are disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableMetricsCollectionRequest withMetrics(String... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<String>(metrics.length));
        }
        for (String ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolWarmedCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolPendingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTerminatingCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupAndWarmPoolTotalCapacity</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit this parameter, all metrics are disabled.
     * </p>
     * 
     * @param metrics
     *        Specifies one or more of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolWarmedCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolPendingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolTerminatingCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WarmPoolTotalCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupAndWarmPoolDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupAndWarmPoolTotalCapacity</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit this parameter, all metrics are disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableMetricsCollectionRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableMetricsCollectionRequest == false)
            return false;
        DisableMetricsCollectionRequest other = (DisableMetricsCollectionRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public DisableMetricsCollectionRequest clone() {
        return (DisableMetricsCollectionRequest) super.clone();
    }

}
