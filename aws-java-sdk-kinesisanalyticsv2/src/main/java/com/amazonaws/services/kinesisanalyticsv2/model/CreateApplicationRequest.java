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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your application (for example, <code>sample-app</code>).
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * A summary description of the application.
     * </p>
     */
    private String applicationDescription;
    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>, <code>FLINK-1_8</code>
     * , or <code>FLINK-1_11</code>).
     * </p>
     */
    private String runtimeEnvironment;
    /**
     * <p>
     * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams,
     * Amazon S3 objects, and other external resources.
     * </p>
     */
    private String serviceExecutionRole;
    /**
     * <p>
     * Use this parameter to configure the application.
     * </p>
     */
    private ApplicationConfiguration applicationConfiguration;
    /**
     * <p>
     * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     */
    private java.util.List<CloudWatchLoggingOption> cloudWatchLoggingOptions;
    /**
     * <p>
     * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     * application. Note that the maximum number of application tags includes system tags. The maximum number of
     * user-defined application tags is 50. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of your application (for example, <code>sample-app</code>).
     * </p>
     * 
     * @param applicationName
     *        The name of your application (for example, <code>sample-app</code>).
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of your application (for example, <code>sample-app</code>).
     * </p>
     * 
     * @return The name of your application (for example, <code>sample-app</code>).
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of your application (for example, <code>sample-app</code>).
     * </p>
     * 
     * @param applicationName
     *        The name of your application (for example, <code>sample-app</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * A summary description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        A summary description of the application.
     */

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    /**
     * <p>
     * A summary description of the application.
     * </p>
     * 
     * @return A summary description of the application.
     */

    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    /**
     * <p>
     * A summary description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        A summary description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationDescription(String applicationDescription) {
        setApplicationDescription(applicationDescription);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>, <code>FLINK-1_8</code>
     * , or <code>FLINK-1_11</code>).
     * </p>
     * 
     * @param runtimeEnvironment
     *        The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>,
     *        <code>FLINK-1_8</code>, or <code>FLINK-1_11</code>).
     * @see RuntimeEnvironment
     */

    public void setRuntimeEnvironment(String runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>, <code>FLINK-1_8</code>
     * , or <code>FLINK-1_11</code>).
     * </p>
     * 
     * @return The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>,
     *         <code>FLINK-1_8</code>, or <code>FLINK-1_11</code>).
     * @see RuntimeEnvironment
     */

    public String getRuntimeEnvironment() {
        return this.runtimeEnvironment;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>, <code>FLINK-1_8</code>
     * , or <code>FLINK-1_11</code>).
     * </p>
     * 
     * @param runtimeEnvironment
     *        The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>,
     *        <code>FLINK-1_8</code>, or <code>FLINK-1_11</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeEnvironment
     */

    public CreateApplicationRequest withRuntimeEnvironment(String runtimeEnvironment) {
        setRuntimeEnvironment(runtimeEnvironment);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>, <code>FLINK-1_8</code>
     * , or <code>FLINK-1_11</code>).
     * </p>
     * 
     * @param runtimeEnvironment
     *        The runtime environment for the application (<code>SQL-1_0</code>, <code>FLINK-1_6</code>,
     *        <code>FLINK-1_8</code>, or <code>FLINK-1_11</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeEnvironment
     */

    public CreateApplicationRequest withRuntimeEnvironment(RuntimeEnvironment runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment.toString();
        return this;
    }

    /**
     * <p>
     * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams,
     * Amazon S3 objects, and other external resources.
     * </p>
     * 
     * @param serviceExecutionRole
     *        The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery
     *        streams, Amazon S3 objects, and other external resources.
     */

    public void setServiceExecutionRole(String serviceExecutionRole) {
        this.serviceExecutionRole = serviceExecutionRole;
    }

    /**
     * <p>
     * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams,
     * Amazon S3 objects, and other external resources.
     * </p>
     * 
     * @return The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery
     *         streams, Amazon S3 objects, and other external resources.
     */

    public String getServiceExecutionRole() {
        return this.serviceExecutionRole;
    }

    /**
     * <p>
     * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams,
     * Amazon S3 objects, and other external resources.
     * </p>
     * 
     * @param serviceExecutionRole
     *        The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery
     *        streams, Amazon S3 objects, and other external resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withServiceExecutionRole(String serviceExecutionRole) {
        setServiceExecutionRole(serviceExecutionRole);
        return this;
    }

    /**
     * <p>
     * Use this parameter to configure the application.
     * </p>
     * 
     * @param applicationConfiguration
     *        Use this parameter to configure the application.
     */

    public void setApplicationConfiguration(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    /**
     * <p>
     * Use this parameter to configure the application.
     * </p>
     * 
     * @return Use this parameter to configure the application.
     */

    public ApplicationConfiguration getApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    /**
     * <p>
     * Use this parameter to configure the application.
     * </p>
     * 
     * @param applicationConfiguration
     *        Use this parameter to configure the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationConfiguration(ApplicationConfiguration applicationConfiguration) {
        setApplicationConfiguration(applicationConfiguration);
        return this;
    }

    /**
     * <p>
     * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * 
     * @return Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration
     *         errors.
     */

    public java.util.List<CloudWatchLoggingOption> getCloudWatchLoggingOptions() {
        return cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration
     *        errors.
     */

    public void setCloudWatchLoggingOptions(java.util.Collection<CloudWatchLoggingOption> cloudWatchLoggingOptions) {
        if (cloudWatchLoggingOptions == null) {
            this.cloudWatchLoggingOptions = null;
            return;
        }

        this.cloudWatchLoggingOptions = new java.util.ArrayList<CloudWatchLoggingOption>(cloudWatchLoggingOptions);
    }

    /**
     * <p>
     * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchLoggingOptions(java.util.Collection)} or
     * {@link #withCloudWatchLoggingOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration
     *        errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withCloudWatchLoggingOptions(CloudWatchLoggingOption... cloudWatchLoggingOptions) {
        if (this.cloudWatchLoggingOptions == null) {
            setCloudWatchLoggingOptions(new java.util.ArrayList<CloudWatchLoggingOption>(cloudWatchLoggingOptions.length));
        }
        for (CloudWatchLoggingOption ele : cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration
     *        errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withCloudWatchLoggingOptions(java.util.Collection<CloudWatchLoggingOption> cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * <p>
     * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     * application. Note that the maximum number of application tags includes system tags. The maximum number of
     * user-defined application tags is 50. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     * </p>
     * 
     * @return A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     *         application. Note that the maximum number of application tags includes system tags. The maximum number of
     *         user-defined application tags is 50. For more information, see <a
     *         href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     * application. Note that the maximum number of application tags includes system tags. The maximum number of
     * user-defined application tags is 50. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     * </p>
     * 
     * @param tags
     *        A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     *        application. Note that the maximum number of application tags includes system tags. The maximum number of
     *        user-defined application tags is 50. For more information, see <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     * application. Note that the maximum number of application tags includes system tags. The maximum number of
     * user-defined application tags is 50. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     *        application. Note that the maximum number of application tags includes system tags. The maximum number of
     *        user-defined application tags is 50. For more information, see <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     * application. Note that the maximum number of application tags includes system tags. The maximum number of
     * user-defined application tags is 50. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     * </p>
     * 
     * @param tags
     *        A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an
     *        application. Note that the maximum number of application tags includes system tags. The maximum number of
     *        user-defined application tags is 50. For more information, see <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-tagging.html">Using Tagging</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getApplicationDescription() != null)
            sb.append("ApplicationDescription: ").append(getApplicationDescription()).append(",");
        if (getRuntimeEnvironment() != null)
            sb.append("RuntimeEnvironment: ").append(getRuntimeEnvironment()).append(",");
        if (getServiceExecutionRole() != null)
            sb.append("ServiceExecutionRole: ").append(getServiceExecutionRole()).append(",");
        if (getApplicationConfiguration() != null)
            sb.append("ApplicationConfiguration: ").append(getApplicationConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getApplicationDescription() == null ^ this.getApplicationDescription() == null)
            return false;
        if (other.getApplicationDescription() != null && other.getApplicationDescription().equals(this.getApplicationDescription()) == false)
            return false;
        if (other.getRuntimeEnvironment() == null ^ this.getRuntimeEnvironment() == null)
            return false;
        if (other.getRuntimeEnvironment() != null && other.getRuntimeEnvironment().equals(this.getRuntimeEnvironment()) == false)
            return false;
        if (other.getServiceExecutionRole() == null ^ this.getServiceExecutionRole() == null)
            return false;
        if (other.getServiceExecutionRole() != null && other.getServiceExecutionRole().equals(this.getServiceExecutionRole()) == false)
            return false;
        if (other.getApplicationConfiguration() == null ^ this.getApplicationConfiguration() == null)
            return false;
        if (other.getApplicationConfiguration() != null && other.getApplicationConfiguration().equals(this.getApplicationConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getApplicationDescription() == null) ? 0 : getApplicationDescription().hashCode());
        hashCode = prime * hashCode + ((getRuntimeEnvironment() == null) ? 0 : getRuntimeEnvironment().hashCode());
        hashCode = prime * hashCode + ((getServiceExecutionRole() == null) ? 0 : getServiceExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getApplicationConfiguration() == null) ? 0 : getApplicationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
