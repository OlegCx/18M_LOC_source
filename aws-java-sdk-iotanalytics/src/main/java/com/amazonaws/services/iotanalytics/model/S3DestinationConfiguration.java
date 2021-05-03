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
 * Configuration information for delivery of dataset contents to Amazon Simple Storage Service (Amazon S3).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/S3DestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket to which dataset contents are delivered.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     * <p>
     * You can create a unique key with the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:scheduleTime}</code> to insert the time of a scheduled SQL query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:versionId}</code> to insert a unique hash that identifies a dataset content.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:creationTime}</code> to insert the creation time of a dataset content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example creates a unique key for a CSV file:
     * <code>dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv</code>
     * </p>
     * <note>
     * <p>
     * If you don't use <code>!{iotanalytics:versionId}</code> to specify the key, you might get duplicate keys. For
     * example, you might have two dataset contents with the same <code>scheduleTime</code> but different
     * <code>versionId</code>s. This means that one dataset content overwrites the other.
     * </p>
     * </note>
     */
    private String key;
    /**
     * <p>
     * Configuration information for coordination with AWS Glue, a fully managed extract, transform and load (ETL)
     * service.
     * </p>
     */
    private GlueConfiguration glueConfiguration;
    /**
     * <p>
     * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue
     * resources.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the S3 bucket to which dataset contents are delivered.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket to which dataset contents are delivered.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket to which dataset contents are delivered.
     * </p>
     * 
     * @return The name of the S3 bucket to which dataset contents are delivered.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket to which dataset contents are delivered.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket to which dataset contents are delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     * <p>
     * You can create a unique key with the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:scheduleTime}</code> to insert the time of a scheduled SQL query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:versionId}</code> to insert a unique hash that identifies a dataset content.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:creationTime}</code> to insert the creation time of a dataset content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example creates a unique key for a CSV file:
     * <code>dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv</code>
     * </p>
     * <note>
     * <p>
     * If you don't use <code>!{iotanalytics:versionId}</code> to specify the key, you might get duplicate keys. For
     * example, you might have two dataset contents with the same <code>scheduleTime</code> but different
     * <code>versionId</code>s. This means that one dataset content overwrites the other.
     * </p>
     * </note>
     * 
     * @param key
     *        The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique identifier.
     *        Each object has exactly one key.</p>
     *        <p>
     *        You can create a unique key with the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>!{iotanalytics:scheduleTime}</code> to insert the time of a scheduled SQL query run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>!{iotanalytics:versionId}</code> to insert a unique hash that identifies a dataset content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>!{iotanalytics:creationTime}</code> to insert the creation time of a dataset content.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following example creates a unique key for a CSV file:
     *        <code>dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv</code>
     *        </p>
     *        <note>
     *        <p>
     *        If you don't use <code>!{iotanalytics:versionId}</code> to specify the key, you might get duplicate keys.
     *        For example, you might have two dataset contents with the same <code>scheduleTime</code> but different
     *        <code>versionId</code>s. This means that one dataset content overwrites the other.
     *        </p>
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     * <p>
     * You can create a unique key with the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:scheduleTime}</code> to insert the time of a scheduled SQL query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:versionId}</code> to insert a unique hash that identifies a dataset content.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:creationTime}</code> to insert the creation time of a dataset content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example creates a unique key for a CSV file:
     * <code>dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv</code>
     * </p>
     * <note>
     * <p>
     * If you don't use <code>!{iotanalytics:versionId}</code> to specify the key, you might get duplicate keys. For
     * example, you might have two dataset contents with the same <code>scheduleTime</code> but different
     * <code>versionId</code>s. This means that one dataset content overwrites the other.
     * </p>
     * </note>
     * 
     * @return The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique
     *         identifier. Each object has exactly one key.</p>
     *         <p>
     *         You can create a unique key with the following options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use <code>!{iotanalytics:scheduleTime}</code> to insert the time of a scheduled SQL query run.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>!{iotanalytics:versionId}</code> to insert a unique hash that identifies a dataset content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>!{iotanalytics:creationTime}</code> to insert the creation time of a dataset content.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following example creates a unique key for a CSV file:
     *         <code>dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv</code>
     *         </p>
     *         <note>
     *         <p>
     *         If you don't use <code>!{iotanalytics:versionId}</code> to specify the key, you might get duplicate keys.
     *         For example, you might have two dataset contents with the same <code>scheduleTime</code> but different
     *         <code>versionId</code>s. This means that one dataset content overwrites the other.
     *         </p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     * <p>
     * You can create a unique key with the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:scheduleTime}</code> to insert the time of a scheduled SQL query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:versionId}</code> to insert a unique hash that identifies a dataset content.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>!{iotanalytics:creationTime}</code> to insert the creation time of a dataset content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example creates a unique key for a CSV file:
     * <code>dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv</code>
     * </p>
     * <note>
     * <p>
     * If you don't use <code>!{iotanalytics:versionId}</code> to specify the key, you might get duplicate keys. For
     * example, you might have two dataset contents with the same <code>scheduleTime</code> but different
     * <code>versionId</code>s. This means that one dataset content overwrites the other.
     * </p>
     * </note>
     * 
     * @param key
     *        The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique identifier.
     *        Each object has exactly one key.</p>
     *        <p>
     *        You can create a unique key with the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>!{iotanalytics:scheduleTime}</code> to insert the time of a scheduled SQL query run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>!{iotanalytics:versionId}</code> to insert a unique hash that identifies a dataset content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>!{iotanalytics:creationTime}</code> to insert the creation time of a dataset content.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following example creates a unique key for a CSV file:
     *        <code>dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv</code>
     *        </p>
     *        <note>
     *        <p>
     *        If you don't use <code>!{iotanalytics:versionId}</code> to specify the key, you might get duplicate keys.
     *        For example, you might have two dataset contents with the same <code>scheduleTime</code> but different
     *        <code>versionId</code>s. This means that one dataset content overwrites the other.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Configuration information for coordination with AWS Glue, a fully managed extract, transform and load (ETL)
     * service.
     * </p>
     * 
     * @param glueConfiguration
     *        Configuration information for coordination with AWS Glue, a fully managed extract, transform and load
     *        (ETL) service.
     */

    public void setGlueConfiguration(GlueConfiguration glueConfiguration) {
        this.glueConfiguration = glueConfiguration;
    }

    /**
     * <p>
     * Configuration information for coordination with AWS Glue, a fully managed extract, transform and load (ETL)
     * service.
     * </p>
     * 
     * @return Configuration information for coordination with AWS Glue, a fully managed extract, transform and load
     *         (ETL) service.
     */

    public GlueConfiguration getGlueConfiguration() {
        return this.glueConfiguration;
    }

    /**
     * <p>
     * Configuration information for coordination with AWS Glue, a fully managed extract, transform and load (ETL)
     * service.
     * </p>
     * 
     * @param glueConfiguration
     *        Configuration information for coordination with AWS Glue, a fully managed extract, transform and load
     *        (ETL) service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withGlueConfiguration(GlueConfiguration glueConfiguration) {
        setGlueConfiguration(glueConfiguration);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue
     * resources.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue
     *        resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue
     * resources.
     * </p>
     * 
     * @return The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue
     *         resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue
     * resources.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getGlueConfiguration() != null)
            sb.append("GlueConfiguration: ").append(getGlueConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationConfiguration == false)
            return false;
        S3DestinationConfiguration other = (S3DestinationConfiguration) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getGlueConfiguration() == null ^ this.getGlueConfiguration() == null)
            return false;
        if (other.getGlueConfiguration() != null && other.getGlueConfiguration().equals(this.getGlueConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getGlueConfiguration() == null) ? 0 : getGlueConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public S3DestinationConfiguration clone() {
        try {
            return (S3DestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.S3DestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
