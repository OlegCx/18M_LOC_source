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
 * When updating an output configuration using the <a
 * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html">UpdateApplication</a>
 * operation, provides information about an AWS Lambda function configured as the destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/LambdaOutputUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaOutputUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the destination Lambda function.
     * </p>
     * <note>
     * <p>
     * To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the
     * Lambda function ARN. For more information about Lambda ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda">Example ARNs: AWS Lambda</a>
     * </p>
     * </note>
     */
    private String resourceARNUpdate;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf.
     * You need to grant the necessary permissions to this role.
     * </p>
     */
    private String roleARNUpdate;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the destination Lambda function.
     * </p>
     * <note>
     * <p>
     * To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the
     * Lambda function ARN. For more information about Lambda ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda">Example ARNs: AWS Lambda</a>
     * </p>
     * </note>
     * 
     * @param resourceARNUpdate
     *        Amazon Resource Name (ARN) of the destination Lambda function.</p> <note>
     *        <p>
     *        To specify an earlier version of the Lambda function than the latest, include the Lambda function version
     *        in the Lambda function ARN. For more information about Lambda ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda">Example ARNs: AWS Lambda</a>
     *        </p>
     */

    public void setResourceARNUpdate(String resourceARNUpdate) {
        this.resourceARNUpdate = resourceARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the destination Lambda function.
     * </p>
     * <note>
     * <p>
     * To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the
     * Lambda function ARN. For more information about Lambda ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda">Example ARNs: AWS Lambda</a>
     * </p>
     * </note>
     * 
     * @return Amazon Resource Name (ARN) of the destination Lambda function.</p> <note>
     *         <p>
     *         To specify an earlier version of the Lambda function than the latest, include the Lambda function version
     *         in the Lambda function ARN. For more information about Lambda ARNs, see <a
     *         href="/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda">Example ARNs: AWS Lambda</a>
     *         </p>
     */

    public String getResourceARNUpdate() {
        return this.resourceARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the destination Lambda function.
     * </p>
     * <note>
     * <p>
     * To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the
     * Lambda function ARN. For more information about Lambda ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda">Example ARNs: AWS Lambda</a>
     * </p>
     * </note>
     * 
     * @param resourceARNUpdate
     *        Amazon Resource Name (ARN) of the destination Lambda function.</p> <note>
     *        <p>
     *        To specify an earlier version of the Lambda function than the latest, include the Lambda function version
     *        in the Lambda function ARN. For more information about Lambda ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda">Example ARNs: AWS Lambda</a>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaOutputUpdate withResourceARNUpdate(String resourceARNUpdate) {
        setResourceARNUpdate(resourceARNUpdate);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf.
     * You need to grant the necessary permissions to this role.
     * </p>
     * 
     * @param roleARNUpdate
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your
     *        behalf. You need to grant the necessary permissions to this role.
     */

    public void setRoleARNUpdate(String roleARNUpdate) {
        this.roleARNUpdate = roleARNUpdate;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf.
     * You need to grant the necessary permissions to this role.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your
     *         behalf. You need to grant the necessary permissions to this role.
     */

    public String getRoleARNUpdate() {
        return this.roleARNUpdate;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf.
     * You need to grant the necessary permissions to this role.
     * </p>
     * 
     * @param roleARNUpdate
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your
     *        behalf. You need to grant the necessary permissions to this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaOutputUpdate withRoleARNUpdate(String roleARNUpdate) {
        setRoleARNUpdate(roleARNUpdate);
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
        if (getResourceARNUpdate() != null)
            sb.append("ResourceARNUpdate: ").append(getResourceARNUpdate()).append(",");
        if (getRoleARNUpdate() != null)
            sb.append("RoleARNUpdate: ").append(getRoleARNUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaOutputUpdate == false)
            return false;
        LambdaOutputUpdate other = (LambdaOutputUpdate) obj;
        if (other.getResourceARNUpdate() == null ^ this.getResourceARNUpdate() == null)
            return false;
        if (other.getResourceARNUpdate() != null && other.getResourceARNUpdate().equals(this.getResourceARNUpdate()) == false)
            return false;
        if (other.getRoleARNUpdate() == null ^ this.getRoleARNUpdate() == null)
            return false;
        if (other.getRoleARNUpdate() != null && other.getRoleARNUpdate().equals(this.getRoleARNUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARNUpdate() == null) ? 0 : getResourceARNUpdate().hashCode());
        hashCode = prime * hashCode + ((getRoleARNUpdate() == null) ? 0 : getRoleARNUpdate().hashCode());
        return hashCode;
    }

    @Override
    public LambdaOutputUpdate clone() {
        try {
            return (LambdaOutputUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.LambdaOutputUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
