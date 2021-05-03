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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Where channel data is stored. You may choose one of <code>serviceManagedS3</code> or <code>customerManagedS3</code>
 * storage. If not specified, the default is <code>serviceManagedS3</code>. This cannot be changed after creation of the
 * channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ChannelStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice of
     * service-managed or customer-managed S3 storage after the channel is created.
     * </p>
     */
    private ServiceManagedChannelS3Storage serviceManagedS3;
    /**
     * <p>
     * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the
     * <code>retentionPeriod</code> parameter is ignored. You cannot change the choice of service-managed or
     * customer-managed S3 storage after the channel is created.
     * </p>
     */
    private CustomerManagedChannelS3Storage customerManagedS3;

    /**
     * <p>
     * Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice of
     * service-managed or customer-managed S3 storage after the channel is created.
     * </p>
     * 
     * @param serviceManagedS3
     *        Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice
     *        of service-managed or customer-managed S3 storage after the channel is created.
     */

    public void setServiceManagedS3(ServiceManagedChannelS3Storage serviceManagedS3) {
        this.serviceManagedS3 = serviceManagedS3;
    }

    /**
     * <p>
     * Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice of
     * service-managed or customer-managed S3 storage after the channel is created.
     * </p>
     * 
     * @return Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice
     *         of service-managed or customer-managed S3 storage after the channel is created.
     */

    public ServiceManagedChannelS3Storage getServiceManagedS3() {
        return this.serviceManagedS3;
    }

    /**
     * <p>
     * Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice of
     * service-managed or customer-managed S3 storage after the channel is created.
     * </p>
     * 
     * @param serviceManagedS3
     *        Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice
     *        of service-managed or customer-managed S3 storage after the channel is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelStorage withServiceManagedS3(ServiceManagedChannelS3Storage serviceManagedS3) {
        setServiceManagedS3(serviceManagedS3);
        return this;
    }

    /**
     * <p>
     * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the
     * <code>retentionPeriod</code> parameter is ignored. You cannot change the choice of service-managed or
     * customer-managed S3 storage after the channel is created.
     * </p>
     * 
     * @param customerManagedS3
     *        Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected,
     *        the <code>retentionPeriod</code> parameter is ignored. You cannot change the choice of service-managed or
     *        customer-managed S3 storage after the channel is created.
     */

    public void setCustomerManagedS3(CustomerManagedChannelS3Storage customerManagedS3) {
        this.customerManagedS3 = customerManagedS3;
    }

    /**
     * <p>
     * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the
     * <code>retentionPeriod</code> parameter is ignored. You cannot change the choice of service-managed or
     * customer-managed S3 storage after the channel is created.
     * </p>
     * 
     * @return Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected,
     *         the <code>retentionPeriod</code> parameter is ignored. You cannot change the choice of service-managed or
     *         customer-managed S3 storage after the channel is created.
     */

    public CustomerManagedChannelS3Storage getCustomerManagedS3() {
        return this.customerManagedS3;
    }

    /**
     * <p>
     * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the
     * <code>retentionPeriod</code> parameter is ignored. You cannot change the choice of service-managed or
     * customer-managed S3 storage after the channel is created.
     * </p>
     * 
     * @param customerManagedS3
     *        Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected,
     *        the <code>retentionPeriod</code> parameter is ignored. You cannot change the choice of service-managed or
     *        customer-managed S3 storage after the channel is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelStorage withCustomerManagedS3(CustomerManagedChannelS3Storage customerManagedS3) {
        setCustomerManagedS3(customerManagedS3);
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
        if (getServiceManagedS3() != null)
            sb.append("ServiceManagedS3: ").append(getServiceManagedS3()).append(",");
        if (getCustomerManagedS3() != null)
            sb.append("CustomerManagedS3: ").append(getCustomerManagedS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelStorage == false)
            return false;
        ChannelStorage other = (ChannelStorage) obj;
        if (other.getServiceManagedS3() == null ^ this.getServiceManagedS3() == null)
            return false;
        if (other.getServiceManagedS3() != null && other.getServiceManagedS3().equals(this.getServiceManagedS3()) == false)
            return false;
        if (other.getCustomerManagedS3() == null ^ this.getCustomerManagedS3() == null)
            return false;
        if (other.getCustomerManagedS3() != null && other.getCustomerManagedS3().equals(this.getCustomerManagedS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceManagedS3() == null) ? 0 : getServiceManagedS3().hashCode());
        hashCode = prime * hashCode + ((getCustomerManagedS3() == null) ? 0 : getCustomerManagedS3().hashCode());
        return hashCode;
    }

    @Override
    public ChannelStorage clone() {
        try {
            return (ChannelStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.ChannelStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
