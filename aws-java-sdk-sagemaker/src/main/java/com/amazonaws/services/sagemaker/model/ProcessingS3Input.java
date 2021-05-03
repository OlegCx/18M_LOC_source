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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for downloading input data from Amazon S3 into the processing container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingS3Input" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingS3Input implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The local path in your container where you want Amazon SageMaker to write input data to. <code>LocalPath</code>
     * is an absolute path to the input data and must begin with <code>/opt/ml/processing/</code>.
     * <code>LocalPath</code> is a required parameter when <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     * <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects with
     * the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>, <code>S3Uri</code>
     * identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to
     * use for the processing job.
     * </p>
     */
    private String s3DataType;
    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies the data
     * from the input source onto the local ML storage volume before starting your processing container. This is the
     * most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     * directly to your processing container into named pipes without using the ML storage volume.
     * </p>
     */
    private String s3InputMode;
    /**
     * <p>
     * Whether to distribute the data from Amazon S3 to all processing instances with <code>FullyReplicated</code>, or
     * whether the data from Amazon S3 is shared by Amazon S3 key, downloading one shard of data to each processing
     * instance.
     * </p>
     */
    private String s3DataDistributionType;
    /**
     * <p>
     * Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     * <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the <code>S3InputMode</code>. In
     * <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your container without
     * using the EBS volume.
     * </p>
     */
    private String s3CompressionType;

    /**
     * <p>
     * The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
     * </p>
     * 
     * @param s3Uri
     *        The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
     * </p>
     * 
     * @return The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
     * </p>
     * 
     * @param s3Uri
     *        The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingS3Input withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The local path in your container where you want Amazon SageMaker to write input data to. <code>LocalPath</code>
     * is an absolute path to the input data and must begin with <code>/opt/ml/processing/</code>.
     * <code>LocalPath</code> is a required parameter when <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     * 
     * @param localPath
     *        The local path in your container where you want Amazon SageMaker to write input data to.
     *        <code>LocalPath</code> is an absolute path to the input data and must begin with
     *        <code>/opt/ml/processing/</code>. <code>LocalPath</code> is a required parameter when
     *        <code>AppManaged</code> is <code>False</code> (default).
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * The local path in your container where you want Amazon SageMaker to write input data to. <code>LocalPath</code>
     * is an absolute path to the input data and must begin with <code>/opt/ml/processing/</code>.
     * <code>LocalPath</code> is a required parameter when <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     * 
     * @return The local path in your container where you want Amazon SageMaker to write input data to.
     *         <code>LocalPath</code> is an absolute path to the input data and must begin with
     *         <code>/opt/ml/processing/</code>. <code>LocalPath</code> is a required parameter when
     *         <code>AppManaged</code> is <code>False</code> (default).
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * The local path in your container where you want Amazon SageMaker to write input data to. <code>LocalPath</code>
     * is an absolute path to the input data and must begin with <code>/opt/ml/processing/</code>.
     * <code>LocalPath</code> is a required parameter when <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     * 
     * @param localPath
     *        The local path in your container where you want Amazon SageMaker to write input data to.
     *        <code>LocalPath</code> is an absolute path to the input data and must begin with
     *        <code>/opt/ml/processing/</code>. <code>LocalPath</code> is a required parameter when
     *        <code>AppManaged</code> is <code>False</code> (default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingS3Input withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     * <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects with
     * the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>, <code>S3Uri</code>
     * identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to
     * use for the processing job.
     * </p>
     * 
     * @param s3DataType
     *        Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     *        <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects
     *        with the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>,
     *        <code>S3Uri</code> identifies an object that is a manifest file containing a list of object keys that you
     *        want Amazon SageMaker to use for the processing job.
     * @see ProcessingS3DataType
     */

    public void setS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     * <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects with
     * the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>, <code>S3Uri</code>
     * identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to
     * use for the processing job.
     * </p>
     * 
     * @return Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     *         <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects
     *         with the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>,
     *         <code>S3Uri</code> identifies an object that is a manifest file containing a list of object keys that you
     *         want Amazon SageMaker to use for the processing job.
     * @see ProcessingS3DataType
     */

    public String getS3DataType() {
        return this.s3DataType;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     * <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects with
     * the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>, <code>S3Uri</code>
     * identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to
     * use for the processing job.
     * </p>
     * 
     * @param s3DataType
     *        Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     *        <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects
     *        with the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>,
     *        <code>S3Uri</code> identifies an object that is a manifest file containing a list of object keys that you
     *        want Amazon SageMaker to use for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataType
     */

    public ProcessingS3Input withS3DataType(String s3DataType) {
        setS3DataType(s3DataType);
        return this;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     * <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects with
     * the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>, <code>S3Uri</code>
     * identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to
     * use for the processing job.
     * </p>
     * 
     * @param s3DataType
     *        Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code> for the data type. If you choose
     *        <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all objects
     *        with the specified key name prefix for the processing job. If you choose <code>ManifestFile</code>,
     *        <code>S3Uri</code> identifies an object that is a manifest file containing a list of object keys that you
     *        want Amazon SageMaker to use for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataType
     */

    public ProcessingS3Input withS3DataType(ProcessingS3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies the data
     * from the input source onto the local ML storage volume before starting your processing container. This is the
     * most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     * directly to your processing container into named pipes without using the ML storage volume.
     * </p>
     * 
     * @param s3InputMode
     *        Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies
     *        the data from the input source onto the local ML storage volume before starting your processing container.
     *        This is the most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data
     *        from the source directly to your processing container into named pipes without using the ML storage
     *        volume.
     * @see ProcessingS3InputMode
     */

    public void setS3InputMode(String s3InputMode) {
        this.s3InputMode = s3InputMode;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies the data
     * from the input source onto the local ML storage volume before starting your processing container. This is the
     * most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     * directly to your processing container into named pipes without using the ML storage volume.
     * </p>
     * 
     * @return Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies
     *         the data from the input source onto the local ML storage volume before starting your processing
     *         container. This is the most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams
     *         input data from the source directly to your processing container into named pipes without using the ML
     *         storage volume.
     * @see ProcessingS3InputMode
     */

    public String getS3InputMode() {
        return this.s3InputMode;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies the data
     * from the input source onto the local ML storage volume before starting your processing container. This is the
     * most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     * directly to your processing container into named pipes without using the ML storage volume.
     * </p>
     * 
     * @param s3InputMode
     *        Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies
     *        the data from the input source onto the local ML storage volume before starting your processing container.
     *        This is the most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data
     *        from the source directly to your processing container into named pipes without using the ML storage
     *        volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3InputMode
     */

    public ProcessingS3Input withS3InputMode(String s3InputMode) {
        setS3InputMode(s3InputMode);
        return this;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies the data
     * from the input source onto the local ML storage volume before starting your processing container. This is the
     * most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     * directly to your processing container into named pipes without using the ML storage volume.
     * </p>
     * 
     * @param s3InputMode
     *        Whether to use <code>File</code> or <code>Pipe</code> input mode. In File mode, Amazon SageMaker copies
     *        the data from the input source onto the local ML storage volume before starting your processing container.
     *        This is the most commonly used input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input data
     *        from the source directly to your processing container into named pipes without using the ML storage
     *        volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3InputMode
     */

    public ProcessingS3Input withS3InputMode(ProcessingS3InputMode s3InputMode) {
        this.s3InputMode = s3InputMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether to distribute the data from Amazon S3 to all processing instances with <code>FullyReplicated</code>, or
     * whether the data from Amazon S3 is shared by Amazon S3 key, downloading one shard of data to each processing
     * instance.
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether to distribute the data from Amazon S3 to all processing instances with
     *        <code>FullyReplicated</code>, or whether the data from Amazon S3 is shared by Amazon S3 key, downloading
     *        one shard of data to each processing instance.
     * @see ProcessingS3DataDistributionType
     */

    public void setS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
    }

    /**
     * <p>
     * Whether to distribute the data from Amazon S3 to all processing instances with <code>FullyReplicated</code>, or
     * whether the data from Amazon S3 is shared by Amazon S3 key, downloading one shard of data to each processing
     * instance.
     * </p>
     * 
     * @return Whether to distribute the data from Amazon S3 to all processing instances with
     *         <code>FullyReplicated</code>, or whether the data from Amazon S3 is shared by Amazon S3 key, downloading
     *         one shard of data to each processing instance.
     * @see ProcessingS3DataDistributionType
     */

    public String getS3DataDistributionType() {
        return this.s3DataDistributionType;
    }

    /**
     * <p>
     * Whether to distribute the data from Amazon S3 to all processing instances with <code>FullyReplicated</code>, or
     * whether the data from Amazon S3 is shared by Amazon S3 key, downloading one shard of data to each processing
     * instance.
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether to distribute the data from Amazon S3 to all processing instances with
     *        <code>FullyReplicated</code>, or whether the data from Amazon S3 is shared by Amazon S3 key, downloading
     *        one shard of data to each processing instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataDistributionType
     */

    public ProcessingS3Input withS3DataDistributionType(String s3DataDistributionType) {
        setS3DataDistributionType(s3DataDistributionType);
        return this;
    }

    /**
     * <p>
     * Whether to distribute the data from Amazon S3 to all processing instances with <code>FullyReplicated</code>, or
     * whether the data from Amazon S3 is shared by Amazon S3 key, downloading one shard of data to each processing
     * instance.
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether to distribute the data from Amazon S3 to all processing instances with
     *        <code>FullyReplicated</code>, or whether the data from Amazon S3 is shared by Amazon S3 key, downloading
     *        one shard of data to each processing instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataDistributionType
     */

    public ProcessingS3Input withS3DataDistributionType(ProcessingS3DataDistributionType s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     * <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the <code>S3InputMode</code>. In
     * <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your container without
     * using the EBS volume.
     * </p>
     * 
     * @param s3CompressionType
     *        Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     *        <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the
     *        <code>S3InputMode</code>. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     *        directly to your container without using the EBS volume.
     * @see ProcessingS3CompressionType
     */

    public void setS3CompressionType(String s3CompressionType) {
        this.s3CompressionType = s3CompressionType;
    }

    /**
     * <p>
     * Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     * <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the <code>S3InputMode</code>. In
     * <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your container without
     * using the EBS volume.
     * </p>
     * 
     * @return Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     *         <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the
     *         <code>S3InputMode</code>. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     *         directly to your container without using the EBS volume.
     * @see ProcessingS3CompressionType
     */

    public String getS3CompressionType() {
        return this.s3CompressionType;
    }

    /**
     * <p>
     * Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     * <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the <code>S3InputMode</code>. In
     * <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your container without
     * using the EBS volume.
     * </p>
     * 
     * @param s3CompressionType
     *        Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     *        <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the
     *        <code>S3InputMode</code>. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     *        directly to your container without using the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3CompressionType
     */

    public ProcessingS3Input withS3CompressionType(String s3CompressionType) {
        setS3CompressionType(s3CompressionType);
        return this;
    }

    /**
     * <p>
     * Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     * <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the <code>S3InputMode</code>. In
     * <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your container without
     * using the EBS volume.
     * </p>
     * 
     * @param s3CompressionType
     *        Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container.
     *        <code>Gzip</code> can only be used when <code>Pipe</code> mode is specified as the
     *        <code>S3InputMode</code>. In <code>Pipe</code> mode, Amazon SageMaker streams input data from the source
     *        directly to your container without using the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3CompressionType
     */

    public ProcessingS3Input withS3CompressionType(ProcessingS3CompressionType s3CompressionType) {
        this.s3CompressionType = s3CompressionType.toString();
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getS3DataType() != null)
            sb.append("S3DataType: ").append(getS3DataType()).append(",");
        if (getS3InputMode() != null)
            sb.append("S3InputMode: ").append(getS3InputMode()).append(",");
        if (getS3DataDistributionType() != null)
            sb.append("S3DataDistributionType: ").append(getS3DataDistributionType()).append(",");
        if (getS3CompressionType() != null)
            sb.append("S3CompressionType: ").append(getS3CompressionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingS3Input == false)
            return false;
        ProcessingS3Input other = (ProcessingS3Input) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3DataType() == null ^ this.getS3DataType() == null)
            return false;
        if (other.getS3DataType() != null && other.getS3DataType().equals(this.getS3DataType()) == false)
            return false;
        if (other.getS3InputMode() == null ^ this.getS3InputMode() == null)
            return false;
        if (other.getS3InputMode() != null && other.getS3InputMode().equals(this.getS3InputMode()) == false)
            return false;
        if (other.getS3DataDistributionType() == null ^ this.getS3DataDistributionType() == null)
            return false;
        if (other.getS3DataDistributionType() != null && other.getS3DataDistributionType().equals(this.getS3DataDistributionType()) == false)
            return false;
        if (other.getS3CompressionType() == null ^ this.getS3CompressionType() == null)
            return false;
        if (other.getS3CompressionType() != null && other.getS3CompressionType().equals(this.getS3CompressionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3DataType() == null) ? 0 : getS3DataType().hashCode());
        hashCode = prime * hashCode + ((getS3InputMode() == null) ? 0 : getS3InputMode().hashCode());
        hashCode = prime * hashCode + ((getS3DataDistributionType() == null) ? 0 : getS3DataDistributionType().hashCode());
        hashCode = prime * hashCode + ((getS3CompressionType() == null) ? 0 : getS3CompressionType().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingS3Input clone() {
        try {
            return (ProcessingS3Input) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingS3InputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
