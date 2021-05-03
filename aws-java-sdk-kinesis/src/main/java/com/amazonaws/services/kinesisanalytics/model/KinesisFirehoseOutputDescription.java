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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For an application output, describes the Amazon Kinesis Firehose delivery stream configured as its destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/KinesisFirehoseOutputDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisFirehoseOutputDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
     * </p>
     */
    private String roleARN;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
     * </p>
     * 
     * @param resourceARN
     *        Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
     * </p>
     * 
     * @param resourceARN
     *        Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseOutputDescription withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseOutputDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisFirehoseOutputDescription == false)
            return false;
        KinesisFirehoseOutputDescription other = (KinesisFirehoseOutputDescription) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public KinesisFirehoseOutputDescription clone() {
        try {
            return (KinesisFirehoseOutputDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.KinesisFirehoseOutputDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
