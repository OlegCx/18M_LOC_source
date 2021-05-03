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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeLocationS3Response
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationS3Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The URL of the Amazon S3 location that was described.
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     * destination. For more information about S3 storage classes, see <a
     * href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     * behaviors that can affect your S3 storage cost. For detailed information, see <a>using-storage-classes</a>.
     * </p>
     */
    private String s3StorageClass;

    private S3Config s3Config;
    /**
     * <p>
     * If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on your
     * Outpost. For more information about launching a DataSync agent on an AWS Outpost, see <a>outposts-agent</a>.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * The time that the Amazon S3 bucket location was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationS3Result withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon S3 location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the Amazon S3 location that was described.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URL of the Amazon S3 location that was described.
     * </p>
     * 
     * @return The URL of the Amazon S3 location that was described.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URL of the Amazon S3 location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the Amazon S3 location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationS3Result withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     * destination. For more information about S3 storage classes, see <a
     * href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     * behaviors that can affect your S3 storage cost. For detailed information, see <a>using-storage-classes</a>.
     * </p>
     * 
     * @param s3StorageClass
     *        The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     *        destination. For more information about S3 storage classes, see <a
     *        href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     *        behaviors that can affect your S3 storage cost. For detailed information, see
     *        <a>using-storage-classes</a>.
     * @see S3StorageClass
     */

    public void setS3StorageClass(String s3StorageClass) {
        this.s3StorageClass = s3StorageClass;
    }

    /**
     * <p>
     * The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     * destination. For more information about S3 storage classes, see <a
     * href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     * behaviors that can affect your S3 storage cost. For detailed information, see <a>using-storage-classes</a>.
     * </p>
     * 
     * @return The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     *         destination. For more information about S3 storage classes, see <a
     *         href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     *         behaviors that can affect your S3 storage cost. For detailed information, see
     *         <a>using-storage-classes</a>.
     * @see S3StorageClass
     */

    public String getS3StorageClass() {
        return this.s3StorageClass;
    }

    /**
     * <p>
     * The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     * destination. For more information about S3 storage classes, see <a
     * href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     * behaviors that can affect your S3 storage cost. For detailed information, see <a>using-storage-classes</a>.
     * </p>
     * 
     * @param s3StorageClass
     *        The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     *        destination. For more information about S3 storage classes, see <a
     *        href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     *        behaviors that can affect your S3 storage cost. For detailed information, see
     *        <a>using-storage-classes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public DescribeLocationS3Result withS3StorageClass(String s3StorageClass) {
        setS3StorageClass(s3StorageClass);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     * destination. For more information about S3 storage classes, see <a
     * href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     * behaviors that can affect your S3 storage cost. For detailed information, see <a>using-storage-classes</a>.
     * </p>
     * 
     * @param s3StorageClass
     *        The Amazon S3 storage class that you chose to store your files in when this location is used as a task
     *        destination. For more information about S3 storage classes, see <a
     *        href="http://aws.amazon.com/s3/storage-classes/">Amazon S3 Storage Classes</a>. Some storage classes have
     *        behaviors that can affect your S3 storage cost. For detailed information, see
     *        <a>using-storage-classes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public DescribeLocationS3Result withS3StorageClass(S3StorageClass s3StorageClass) {
        this.s3StorageClass = s3StorageClass.toString();
        return this;
    }

    /**
     * @param s3Config
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * @return
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * @param s3Config
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationS3Result withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
        return this;
    }

    /**
     * <p>
     * If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on your
     * Outpost. For more information about launching a DataSync agent on an AWS Outpost, see <a>outposts-agent</a>.
     * </p>
     * 
     * @return If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed
     *         on your Outpost. For more information about launching a DataSync agent on an AWS Outpost, see
     *         <a>outposts-agent</a>.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on your
     * Outpost. For more information about launching a DataSync agent on an AWS Outpost, see <a>outposts-agent</a>.
     * </p>
     * 
     * @param agentArns
     *        If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on
     *        your Outpost. For more information about launching a DataSync agent on an AWS Outpost, see
     *        <a>outposts-agent</a>.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on your
     * Outpost. For more information about launching a DataSync agent on an AWS Outpost, see <a>outposts-agent</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on
     *        your Outpost. For more information about launching a DataSync agent on an AWS Outpost, see
     *        <a>outposts-agent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationS3Result withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on your
     * Outpost. For more information about launching a DataSync agent on an AWS Outpost, see <a>outposts-agent</a>.
     * </p>
     * 
     * @param agentArns
     *        If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on
     *        your Outpost. For more information about launching a DataSync agent on an AWS Outpost, see
     *        <a>outposts-agent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationS3Result withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * The time that the Amazon S3 bucket location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the Amazon S3 bucket location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the Amazon S3 bucket location was created.
     * </p>
     * 
     * @return The time that the Amazon S3 bucket location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the Amazon S3 bucket location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the Amazon S3 bucket location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationS3Result withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getS3StorageClass() != null)
            sb.append("S3StorageClass: ").append(getS3StorageClass()).append(",");
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationS3Result == false)
            return false;
        DescribeLocationS3Result other = (DescribeLocationS3Result) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getS3StorageClass() == null ^ this.getS3StorageClass() == null)
            return false;
        if (other.getS3StorageClass() != null && other.getS3StorageClass().equals(this.getS3StorageClass()) == false)
            return false;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getS3StorageClass() == null) ? 0 : getS3StorageClass().hashCode());
        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationS3Result clone() {
        try {
            return (DescribeLocationS3Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
