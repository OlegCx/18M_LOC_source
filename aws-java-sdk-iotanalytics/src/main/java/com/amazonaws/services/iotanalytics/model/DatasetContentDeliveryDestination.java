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
 * The destination to which dataset contents are delivered.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetContentDeliveryDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetContentDeliveryDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration information for delivery of dataset contents to AWS IoT Events.
     * </p>
     */
    private IotEventsDestinationConfiguration iotEventsDestinationConfiguration;
    /**
     * <p>
     * Configuration information for delivery of dataset contents to Amazon S3.
     * </p>
     */
    private S3DestinationConfiguration s3DestinationConfiguration;

    /**
     * <p>
     * Configuration information for delivery of dataset contents to AWS IoT Events.
     * </p>
     * 
     * @param iotEventsDestinationConfiguration
     *        Configuration information for delivery of dataset contents to AWS IoT Events.
     */

    public void setIotEventsDestinationConfiguration(IotEventsDestinationConfiguration iotEventsDestinationConfiguration) {
        this.iotEventsDestinationConfiguration = iotEventsDestinationConfiguration;
    }

    /**
     * <p>
     * Configuration information for delivery of dataset contents to AWS IoT Events.
     * </p>
     * 
     * @return Configuration information for delivery of dataset contents to AWS IoT Events.
     */

    public IotEventsDestinationConfiguration getIotEventsDestinationConfiguration() {
        return this.iotEventsDestinationConfiguration;
    }

    /**
     * <p>
     * Configuration information for delivery of dataset contents to AWS IoT Events.
     * </p>
     * 
     * @param iotEventsDestinationConfiguration
     *        Configuration information for delivery of dataset contents to AWS IoT Events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentDeliveryDestination withIotEventsDestinationConfiguration(IotEventsDestinationConfiguration iotEventsDestinationConfiguration) {
        setIotEventsDestinationConfiguration(iotEventsDestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration information for delivery of dataset contents to Amazon S3.
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        Configuration information for delivery of dataset contents to Amazon S3.
     */

    public void setS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    /**
     * <p>
     * Configuration information for delivery of dataset contents to Amazon S3.
     * </p>
     * 
     * @return Configuration information for delivery of dataset contents to Amazon S3.
     */

    public S3DestinationConfiguration getS3DestinationConfiguration() {
        return this.s3DestinationConfiguration;
    }

    /**
     * <p>
     * Configuration information for delivery of dataset contents to Amazon S3.
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        Configuration information for delivery of dataset contents to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentDeliveryDestination withS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        setS3DestinationConfiguration(s3DestinationConfiguration);
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
        if (getIotEventsDestinationConfiguration() != null)
            sb.append("IotEventsDestinationConfiguration: ").append(getIotEventsDestinationConfiguration()).append(",");
        if (getS3DestinationConfiguration() != null)
            sb.append("S3DestinationConfiguration: ").append(getS3DestinationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetContentDeliveryDestination == false)
            return false;
        DatasetContentDeliveryDestination other = (DatasetContentDeliveryDestination) obj;
        if (other.getIotEventsDestinationConfiguration() == null ^ this.getIotEventsDestinationConfiguration() == null)
            return false;
        if (other.getIotEventsDestinationConfiguration() != null
                && other.getIotEventsDestinationConfiguration().equals(this.getIotEventsDestinationConfiguration()) == false)
            return false;
        if (other.getS3DestinationConfiguration() == null ^ this.getS3DestinationConfiguration() == null)
            return false;
        if (other.getS3DestinationConfiguration() != null && other.getS3DestinationConfiguration().equals(this.getS3DestinationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIotEventsDestinationConfiguration() == null) ? 0 : getIotEventsDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationConfiguration() == null) ? 0 : getS3DestinationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DatasetContentDeliveryDestination clone() {
        try {
            return (DatasetContentDeliveryDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetContentDeliveryDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
