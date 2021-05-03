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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Kinesis Analytics application name.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Amazon Kinesis Analytics application version. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * The ID of the configuration to delete. Each output configuration that is added to the application, either when
     * the application is created or later using the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html"
     * >AddApplicationOutput</a> operation, has a unique ID. You need to provide the ID to uniquely identify the output
     * configuration that you want to delete from the application configuration. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the specific <code>OutputId</code>.
     * </p>
     */
    private String outputId;

    /**
     * <p>
     * Amazon Kinesis Analytics application name.
     * </p>
     * 
     * @param applicationName
     *        Amazon Kinesis Analytics application name.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Amazon Kinesis Analytics application name.
     * </p>
     * 
     * @return Amazon Kinesis Analytics application name.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Amazon Kinesis Analytics application name.
     * </p>
     * 
     * @param applicationName
     *        Amazon Kinesis Analytics application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationOutputRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Amazon Kinesis Analytics application version. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Amazon Kinesis Analytics application version. You can use the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *        >DescribeApplication</a> operation to get the current application version. If the version specified is not
     *        the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * Amazon Kinesis Analytics application version. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @return Amazon Kinesis Analytics application version. You can use the <a
     *         href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *         >DescribeApplication</a> operation to get the current application version. If the version specified is
     *         not the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * Amazon Kinesis Analytics application version. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Amazon Kinesis Analytics application version. You can use the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *        >DescribeApplication</a> operation to get the current application version. If the version specified is not
     *        the current version, the <code>ConcurrentModificationException</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationOutputRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * The ID of the configuration to delete. Each output configuration that is added to the application, either when
     * the application is created or later using the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html"
     * >AddApplicationOutput</a> operation, has a unique ID. You need to provide the ID to uniquely identify the output
     * configuration that you want to delete from the application configuration. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the specific <code>OutputId</code>.
     * </p>
     * 
     * @param outputId
     *        The ID of the configuration to delete. Each output configuration that is added to the application, either
     *        when the application is created or later using the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html"
     *        >AddApplicationOutput</a> operation, has a unique ID. You need to provide the ID to uniquely identify the
     *        output configuration that you want to delete from the application configuration. You can use the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *        >DescribeApplication</a> operation to get the specific <code>OutputId</code>.
     */

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    /**
     * <p>
     * The ID of the configuration to delete. Each output configuration that is added to the application, either when
     * the application is created or later using the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html"
     * >AddApplicationOutput</a> operation, has a unique ID. You need to provide the ID to uniquely identify the output
     * configuration that you want to delete from the application configuration. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the specific <code>OutputId</code>.
     * </p>
     * 
     * @return The ID of the configuration to delete. Each output configuration that is added to the application, either
     *         when the application is created or later using the <a
     *         href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html"
     *         >AddApplicationOutput</a> operation, has a unique ID. You need to provide the ID to uniquely identify the
     *         output configuration that you want to delete from the application configuration. You can use the <a
     *         href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *         >DescribeApplication</a> operation to get the specific <code>OutputId</code>.
     */

    public String getOutputId() {
        return this.outputId;
    }

    /**
     * <p>
     * The ID of the configuration to delete. Each output configuration that is added to the application, either when
     * the application is created or later using the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html"
     * >AddApplicationOutput</a> operation, has a unique ID. You need to provide the ID to uniquely identify the output
     * configuration that you want to delete from the application configuration. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the specific <code>OutputId</code>.
     * </p>
     * 
     * @param outputId
     *        The ID of the configuration to delete. Each output configuration that is added to the application, either
     *        when the application is created or later using the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html"
     *        >AddApplicationOutput</a> operation, has a unique ID. You need to provide the ID to uniquely identify the
     *        output configuration that you want to delete from the application configuration. You can use the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *        >DescribeApplication</a> operation to get the specific <code>OutputId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationOutputRequest withOutputId(String outputId) {
        setOutputId(outputId);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getCurrentApplicationVersionId() != null)
            sb.append("CurrentApplicationVersionId: ").append(getCurrentApplicationVersionId()).append(",");
        if (getOutputId() != null)
            sb.append("OutputId: ").append(getOutputId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationOutputRequest == false)
            return false;
        DeleteApplicationOutputRequest other = (DeleteApplicationOutputRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getOutputId() == null ^ this.getOutputId() == null)
            return false;
        if (other.getOutputId() != null && other.getOutputId().equals(this.getOutputId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getOutputId() == null) ? 0 : getOutputId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationOutputRequest clone() {
        return (DeleteApplicationOutputRequest) super.clone();
    }

}
