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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DisassociateTrackerConsumer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateTrackerConsumerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     */
    private String consumerArn;
    /**
     * <p>
     * The name of the tracker resource to be dissociated from the consumer.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param consumerArn
     *        The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource.
     *        Used when you need to specify a resource across all AWS. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     *        </p>
     *        </li>
     */

    public void setConsumerArn(String consumerArn) {
        this.consumerArn = consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource.
     *         Used when you need to specify a resource across all AWS. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     *         </p>
     *         </li>
     */

    public String getConsumerArn() {
        return this.consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource. Used
     * when you need to specify a resource across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param consumerArn
     *        The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource.
     *        Used when you need to specify a resource across all AWS. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:partition:service:region:account-id:resource-type:resource-id</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTrackerConsumerRequest withConsumerArn(String consumerArn) {
        setConsumerArn(consumerArn);
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource to be dissociated from the consumer.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to be dissociated from the consumer.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to be dissociated from the consumer.
     * </p>
     * 
     * @return The name of the tracker resource to be dissociated from the consumer.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to be dissociated from the consumer.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to be dissociated from the consumer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTrackerConsumerRequest withTrackerName(String trackerName) {
        setTrackerName(trackerName);
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
        if (getConsumerArn() != null)
            sb.append("ConsumerArn: ").append(getConsumerArn()).append(",");
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateTrackerConsumerRequest == false)
            return false;
        DisassociateTrackerConsumerRequest other = (DisassociateTrackerConsumerRequest) obj;
        if (other.getConsumerArn() == null ^ this.getConsumerArn() == null)
            return false;
        if (other.getConsumerArn() != null && other.getConsumerArn().equals(this.getConsumerArn()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumerArn() == null) ? 0 : getConsumerArn().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateTrackerConsumerRequest clone() {
        return (DisassociateTrackerConsumerRequest) super.clone();
    }

}
