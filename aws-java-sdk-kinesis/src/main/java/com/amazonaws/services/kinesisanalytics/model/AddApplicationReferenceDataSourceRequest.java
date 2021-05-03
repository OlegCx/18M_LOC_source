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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationReferenceDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationReferenceDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of an existing application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Version of the application for which you are adding the reference data source. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the object
     * and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and
     * the resulting in-application table that is created. You must also provide an IAM role with the necessary
     * permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     * </p>
     */
    private ReferenceDataSource referenceDataSource;

    /**
     * <p>
     * Name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        Name of an existing application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of an existing application.
     * </p>
     * 
     * @return Name of an existing application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        Name of an existing application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationReferenceDataSourceRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Version of the application for which you are adding the reference data source. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Version of the application for which you are adding the reference data source. You can use the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *        >DescribeApplication</a> operation to get the current application version. If the version specified is not
     *        the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * Version of the application for which you are adding the reference data source. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @return Version of the application for which you are adding the reference data source. You can use the <a
     *         href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *         >DescribeApplication</a> operation to get the current application version. If the version specified is
     *         not the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * Version of the application for which you are adding the reference data source. You can use the <a
     * href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     * >DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Version of the application for which you are adding the reference data source. You can use the <a
     *        href="https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html"
     *        >DescribeApplication</a> operation to get the current application version. If the version specified is not
     *        the current version, the <code>ConcurrentModificationException</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationReferenceDataSourceRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the object
     * and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and
     * the resulting in-application table that is created. You must also provide an IAM role with the necessary
     * permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     * </p>
     * 
     * @param referenceDataSource
     *        The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the
     *        object and copies the data into the in-application table that is created. You provide an S3 bucket, object
     *        key name, and the resulting in-application table that is created. You must also provide an IAM role with
     *        the necessary permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket
     *        on your behalf.
     */

    public void setReferenceDataSource(ReferenceDataSource referenceDataSource) {
        this.referenceDataSource = referenceDataSource;
    }

    /**
     * <p>
     * The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the object
     * and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and
     * the resulting in-application table that is created. You must also provide an IAM role with the necessary
     * permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     * </p>
     * 
     * @return The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the
     *         object and copies the data into the in-application table that is created. You provide an S3 bucket,
     *         object key name, and the resulting in-application table that is created. You must also provide an IAM
     *         role with the necessary permissions that Amazon Kinesis Analytics can assume to read the object from your
     *         S3 bucket on your behalf.
     */

    public ReferenceDataSource getReferenceDataSource() {
        return this.referenceDataSource;
    }

    /**
     * <p>
     * The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the object
     * and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and
     * the resulting in-application table that is created. You must also provide an IAM role with the necessary
     * permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     * </p>
     * 
     * @param referenceDataSource
     *        The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the
     *        object and copies the data into the in-application table that is created. You provide an S3 bucket, object
     *        key name, and the resulting in-application table that is created. You must also provide an IAM role with
     *        the necessary permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket
     *        on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationReferenceDataSourceRequest withReferenceDataSource(ReferenceDataSource referenceDataSource) {
        setReferenceDataSource(referenceDataSource);
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
        if (getReferenceDataSource() != null)
            sb.append("ReferenceDataSource: ").append(getReferenceDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationReferenceDataSourceRequest == false)
            return false;
        AddApplicationReferenceDataSourceRequest other = (AddApplicationReferenceDataSourceRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getReferenceDataSource() == null ^ this.getReferenceDataSource() == null)
            return false;
        if (other.getReferenceDataSource() != null && other.getReferenceDataSource().equals(this.getReferenceDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getReferenceDataSource() == null) ? 0 : getReferenceDataSource().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationReferenceDataSourceRequest clone() {
        return (AddApplicationReferenceDataSourceRequest) super.clone();
    }

}
