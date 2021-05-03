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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource that represents your subscription to a supported standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsSubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     */
    private String standardsSubscriptionArn;
    /**
     * <p>
     * The ARN of a standard.
     * </p>
     */
    private String standardsArn;
    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     */
    private java.util.Map<String, String> standardsInput;
    /**
     * <p>
     * The status of the standard subscription.
     * </p>
     * <p>
     * The status values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Standard is in the process of being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - Standard is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Standard is in the process of being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standard could not be disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String standardsStatus;

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     * 
     * @param standardsSubscriptionArn
     *        The ARN of a resource that represents your subscription to a supported standard.
     */

    public void setStandardsSubscriptionArn(String standardsSubscriptionArn) {
        this.standardsSubscriptionArn = standardsSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     * 
     * @return The ARN of a resource that represents your subscription to a supported standard.
     */

    public String getStandardsSubscriptionArn() {
        return this.standardsSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of a resource that represents your subscription to a supported standard.
     * </p>
     * 
     * @param standardsSubscriptionArn
     *        The ARN of a resource that represents your subscription to a supported standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscription withStandardsSubscriptionArn(String standardsSubscriptionArn) {
        setStandardsSubscriptionArn(standardsSubscriptionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @param standardsArn
     *        The ARN of a standard.
     */

    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @return The ARN of a standard.
     */

    public String getStandardsArn() {
        return this.standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @param standardsArn
     *        The ARN of a standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscription withStandardsArn(String standardsArn) {
        setStandardsArn(standardsArn);
        return this;
    }

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     * 
     * @return A key-value pair of input for the standard.
     */

    public java.util.Map<String, String> getStandardsInput() {
        return standardsInput;
    }

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     * 
     * @param standardsInput
     *        A key-value pair of input for the standard.
     */

    public void setStandardsInput(java.util.Map<String, String> standardsInput) {
        this.standardsInput = standardsInput;
    }

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     * 
     * @param standardsInput
     *        A key-value pair of input for the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscription withStandardsInput(java.util.Map<String, String> standardsInput) {
        setStandardsInput(standardsInput);
        return this;
    }

    /**
     * Add a single StandardsInput entry
     *
     * @see StandardsSubscription#withStandardsInput
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscription addStandardsInputEntry(String key, String value) {
        if (null == this.standardsInput) {
            this.standardsInput = new java.util.HashMap<String, String>();
        }
        if (this.standardsInput.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.standardsInput.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StandardsInput.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscription clearStandardsInputEntries() {
        this.standardsInput = null;
        return this;
    }

    /**
     * <p>
     * The status of the standard subscription.
     * </p>
     * <p>
     * The status values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Standard is in the process of being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - Standard is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Standard is in the process of being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standard could not be disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param standardsStatus
     *        The status of the standard subscription.</p>
     *        <p>
     *        The status values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Standard is in the process of being enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - Standard is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Standard is in the process of being disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Standard could not be disabled.
     *        </p>
     *        </li>
     * @see StandardsStatus
     */

    public void setStandardsStatus(String standardsStatus) {
        this.standardsStatus = standardsStatus;
    }

    /**
     * <p>
     * The status of the standard subscription.
     * </p>
     * <p>
     * The status values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Standard is in the process of being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - Standard is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Standard is in the process of being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standard could not be disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the standard subscription.</p>
     *         <p>
     *         The status values are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Standard is in the process of being enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READY</code> - Standard is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - Standard is in the process of being disabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Standard could not be disabled.
     *         </p>
     *         </li>
     * @see StandardsStatus
     */

    public String getStandardsStatus() {
        return this.standardsStatus;
    }

    /**
     * <p>
     * The status of the standard subscription.
     * </p>
     * <p>
     * The status values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Standard is in the process of being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - Standard is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Standard is in the process of being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standard could not be disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param standardsStatus
     *        The status of the standard subscription.</p>
     *        <p>
     *        The status values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Standard is in the process of being enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - Standard is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Standard is in the process of being disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Standard could not be disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardsStatus
     */

    public StandardsSubscription withStandardsStatus(String standardsStatus) {
        setStandardsStatus(standardsStatus);
        return this;
    }

    /**
     * <p>
     * The status of the standard subscription.
     * </p>
     * <p>
     * The status values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Standard is in the process of being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - Standard is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Standard is in the process of being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standard could not be disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param standardsStatus
     *        The status of the standard subscription.</p>
     *        <p>
     *        The status values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Standard is in the process of being enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - Standard is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCOMPLETE</code> - Standard could not be enabled completely. Some controls may not be available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Standard is in the process of being disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Standard could not be disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardsStatus
     */

    public StandardsSubscription withStandardsStatus(StandardsStatus standardsStatus) {
        this.standardsStatus = standardsStatus.toString();
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
        if (getStandardsSubscriptionArn() != null)
            sb.append("StandardsSubscriptionArn: ").append(getStandardsSubscriptionArn()).append(",");
        if (getStandardsArn() != null)
            sb.append("StandardsArn: ").append(getStandardsArn()).append(",");
        if (getStandardsInput() != null)
            sb.append("StandardsInput: ").append(getStandardsInput()).append(",");
        if (getStandardsStatus() != null)
            sb.append("StandardsStatus: ").append(getStandardsStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsSubscription == false)
            return false;
        StandardsSubscription other = (StandardsSubscription) obj;
        if (other.getStandardsSubscriptionArn() == null ^ this.getStandardsSubscriptionArn() == null)
            return false;
        if (other.getStandardsSubscriptionArn() != null && other.getStandardsSubscriptionArn().equals(this.getStandardsSubscriptionArn()) == false)
            return false;
        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        if (other.getStandardsInput() == null ^ this.getStandardsInput() == null)
            return false;
        if (other.getStandardsInput() != null && other.getStandardsInput().equals(this.getStandardsInput()) == false)
            return false;
        if (other.getStandardsStatus() == null ^ this.getStandardsStatus() == null)
            return false;
        if (other.getStandardsStatus() != null && other.getStandardsStatus().equals(this.getStandardsStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsSubscriptionArn() == null) ? 0 : getStandardsSubscriptionArn().hashCode());
        hashCode = prime * hashCode + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode + ((getStandardsInput() == null) ? 0 : getStandardsInput().hashCode());
        hashCode = prime * hashCode + ((getStandardsStatus() == null) ? 0 : getStandardsStatus().hashCode());
        return hashCode;
    }

    @Override
    public StandardsSubscription clone() {
        try {
            return (StandardsSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsSubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
