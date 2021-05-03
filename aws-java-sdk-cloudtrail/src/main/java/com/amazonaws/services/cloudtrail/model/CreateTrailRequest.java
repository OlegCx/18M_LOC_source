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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Specifies the settings for each trail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateTrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the trail. The name must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3
     * Bucket Naming Requirements</a>.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     */
    private String snsTopicName;
    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     */
    private Boolean includeGlobalServiceEvents;
    /**
     * <p>
     * Specifies whether the trail is created in the current region or in all regions. The default is false, which
     * creates a trail only in the region where you are signed in. As a best practice, consider creating trails that log
     * events in all regions.
     * </p>
     */
    private Boolean isMultiRegionTrail;
    /**
     * <p>
     * Specifies whether log file integrity validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     */
    private Boolean enableLogFileValidation;
    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;
    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     */
    private String cloudWatchLogsRoleArn;
    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations.
     * </p>
     */
    private Boolean isOrganizationTrail;

    private com.amazonaws.internal.SdkInternalList<Tag> tagsList;

    /**
     * <p>
     * Specifies the name of the trail. The name must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        Specifies the name of the trail. The name must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start with a letter or number, and end with a letter or number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be between 3 and 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *        <code>my--namespace</code> are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not be in IP address format (for example, 192.168.5.4)
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the trail. The name must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the name of the trail. The name must meet the following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the trail. The name must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        Specifies the name of the trail. The name must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start with a letter or number, and end with a letter or number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be between 3 and 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *        <code>my--namespace</code> are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not be in IP address format (for example, 192.168.5.4)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3
     * Bucket Naming Requirements</a>.
     * </p>
     * 
     * @param s3BucketName
     *        Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     *        S3 Bucket Naming Requirements</a>.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3
     * Bucket Naming Requirements</a>.
     * </p>
     * 
     * @return Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     *         S3 Bucket Naming Requirements</a>.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon S3
     * Bucket Naming Requirements</a>.
     * </p>
     * 
     * @param s3BucketName
     *        Specifies the name of the Amazon S3 bucket designated for publishing log files. See <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create_trail_naming_policy.html">Amazon
     *        S3 Bucket Naming Requirements</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log
     *        file delivery. For more information, see <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *        Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     * 
     * @return Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log
     *         file delivery. For more information, see <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *         Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file
     * delivery. For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding Your
     * CloudTrail Log Files</a>. The maximum length is 200 characters.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log
     *        file delivery. For more information, see <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html">Finding
     *        Your CloudTrail Log Files</a>. The maximum length is 200 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     * 
     * @param snsTopicName
     *        Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum
     *        length is 256 characters.
     */

    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     * 
     * @return Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum
     *         length is 256 characters.
     */

    public String getSnsTopicName() {
        return this.snsTopicName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is
     * 256 characters.
     * </p>
     * 
     * @param snsTopicName
     *        Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum
     *        length is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withSnsTopicName(String snsTopicName) {
        setSnsTopicName(snsTopicName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Specifies whether the trail is publishing events from global services such as IAM to the log files.
     */

    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @return Specifies whether the trail is publishing events from global services such as IAM to the log files.
     */

    public Boolean getIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        setIncludeGlobalServiceEvents(includeGlobalServiceEvents);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services such as IAM to the log files.
     * </p>
     * 
     * @return Specifies whether the trail is publishing events from global services such as IAM to the log files.
     */

    public Boolean isIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail is created in the current region or in all regions. The default is false, which
     * creates a trail only in the region where you are signed in. As a best practice, consider creating trails that log
     * events in all regions.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Specifies whether the trail is created in the current region or in all regions. The default is false,
     *        which creates a trail only in the region where you are signed in. As a best practice, consider creating
     *        trails that log events in all regions.
     */

    public void setIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether the trail is created in the current region or in all regions. The default is false, which
     * creates a trail only in the region where you are signed in. As a best practice, consider creating trails that log
     * events in all regions.
     * </p>
     * 
     * @return Specifies whether the trail is created in the current region or in all regions. The default is false,
     *         which creates a trail only in the region where you are signed in. As a best practice, consider creating
     *         trails that log events in all regions.
     */

    public Boolean getIsMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether the trail is created in the current region or in all regions. The default is false, which
     * creates a trail only in the region where you are signed in. As a best practice, consider creating trails that log
     * events in all regions.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Specifies whether the trail is created in the current region or in all regions. The default is false,
     *        which creates a trail only in the region where you are signed in. As a best practice, consider creating
     *        trails that log events in all regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        setIsMultiRegionTrail(isMultiRegionTrail);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is created in the current region or in all regions. The default is false, which
     * creates a trail only in the region where you are signed in. As a best practice, consider creating trails that log
     * events in all regions.
     * </p>
     * 
     * @return Specifies whether the trail is created in the current region or in all regions. The default is false,
     *         which creates a trail only in the region where you are signed in. As a best practice, consider creating
     *         trails that log events in all regions.
     */

    public Boolean isMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @param enableLogFileValidation
     *        Specifies whether log file integrity validation is enabled. The default is false.</p> <note>
     *        <p>
     *        When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *        CloudTrail will not create digest files for log files that were delivered during a period in which log
     *        file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *        on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *        not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *        whenever you stop CloudTrail logging or delete a trail.
     *        </p>
     */

    public void setEnableLogFileValidation(Boolean enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @return Specifies whether log file integrity validation is enabled. The default is false.</p> <note>
     *         <p>
     *         When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were delivered during a period in which log
     *         file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *         on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *         not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *         whenever you stop CloudTrail logging or delete a trail.
     *         </p>
     */

    public Boolean getEnableLogFileValidation() {
        return this.enableLogFileValidation;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @param enableLogFileValidation
     *        Specifies whether log file integrity validation is enabled. The default is false.</p> <note>
     *        <p>
     *        When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *        CloudTrail will not create digest files for log files that were delivered during a period in which log
     *        file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *        on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *        not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *        whenever you stop CloudTrail logging or delete a trail.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withEnableLogFileValidation(Boolean enableLogFileValidation) {
        setEnableLogFileValidation(enableLogFileValidation);
        return this;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled. The default is false.
     * </p>
     * <note>
     * <p>
     * When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail
     * will not create digest files for log files that were delivered during a period in which log file integrity
     * validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable
     * it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log
     * files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail
     * logging or delete a trail.
     * </p>
     * </note>
     * 
     * @return Specifies whether log file integrity validation is enabled. The default is false.</p> <note>
     *         <p>
     *         When you disable log file integrity validation, the chain of digest files is broken after one hour.
     *         CloudTrail will not create digest files for log files that were delivered during a period in which log
     *         file integrity validation was disabled. For example, if you enable log file integrity validation at noon
     *         on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will
     *         not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies
     *         whenever you stop CloudTrail logging or delete a trail.
     *         </p>
     */

    public Boolean isEnableLogFileValidation() {
        return this.enableLogFileValidation;
    }

    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the
     *        log group to which CloudTrail logs will be delivered. Not required unless you specify
     *        CloudWatchLogsRoleArn.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     * 
     * @return Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the
     *         log group to which CloudTrail logs will be delivered. Not required unless you specify
     *         CloudWatchLogsRoleArn.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group
     * to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the
     *        log group to which CloudTrail logs will be delivered. Not required unless you specify
     *        CloudWatchLogsRoleArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
        return this;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     * 
     * @return Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias
     *        name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a
     *        globally unique identifier.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias
     *         name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a
     *         globally unique identifier.</p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         alias/MyAliasName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name
     * prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique
     * identifier.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias
     *        name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a
     *        globally unique identifier.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations.
     * </p>
     * 
     * @param isOrganizationTrail
     *        Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only
     *        for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of
     *        an AWS account that is the master account for an organization in AWS Organizations.
     */

    public void setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
    }

    /**
     * <p>
     * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations.
     * </p>
     * 
     * @return Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only
     *         for the current AWS account. The default is false, and cannot be true unless the call is made on behalf
     *         of an AWS account that is the master account for an organization in AWS Organizations.
     */

    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    /**
     * <p>
     * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations.
     * </p>
     * 
     * @param isOrganizationTrail
     *        Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only
     *        for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of
     *        an AWS account that is the master account for an organization in AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withIsOrganizationTrail(Boolean isOrganizationTrail) {
        setIsOrganizationTrail(isOrganizationTrail);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the
     * current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account
     * that is the master account for an organization in AWS Organizations.
     * </p>
     * 
     * @return Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only
     *         for the current AWS account. The default is false, and cannot be true unless the call is made on behalf
     *         of an AWS account that is the master account for an organization in AWS Organizations.
     */

    public Boolean isOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTagsList() {
        if (tagsList == null) {
            tagsList = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagsList;
    }

    /**
     * @param tagsList
     */

    public void setTagsList(java.util.Collection<Tag> tagsList) {
        if (tagsList == null) {
            this.tagsList = null;
            return;
        }

        this.tagsList = new com.amazonaws.internal.SdkInternalList<Tag>(tagsList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsList(java.util.Collection)} or {@link #withTagsList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagsList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withTagsList(Tag... tagsList) {
        if (this.tagsList == null) {
            setTagsList(new com.amazonaws.internal.SdkInternalList<Tag>(tagsList.length));
        }
        for (Tag ele : tagsList) {
            this.tagsList.add(ele);
        }
        return this;
    }

    /**
     * @param tagsList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrailRequest withTagsList(java.util.Collection<Tag> tagsList) {
        setTagsList(tagsList);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getSnsTopicName() != null)
            sb.append("SnsTopicName: ").append(getSnsTopicName()).append(",");
        if (getIncludeGlobalServiceEvents() != null)
            sb.append("IncludeGlobalServiceEvents: ").append(getIncludeGlobalServiceEvents()).append(",");
        if (getIsMultiRegionTrail() != null)
            sb.append("IsMultiRegionTrail: ").append(getIsMultiRegionTrail()).append(",");
        if (getEnableLogFileValidation() != null)
            sb.append("EnableLogFileValidation: ").append(getEnableLogFileValidation()).append(",");
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: ").append(getCloudWatchLogsLogGroupArn()).append(",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: ").append(getCloudWatchLogsRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getIsOrganizationTrail() != null)
            sb.append("IsOrganizationTrail: ").append(getIsOrganizationTrail()).append(",");
        if (getTagsList() != null)
            sb.append("TagsList: ").append(getTagsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrailRequest == false)
            return false;
        CreateTrailRequest other = (CreateTrailRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getSnsTopicName() == null ^ this.getSnsTopicName() == null)
            return false;
        if (other.getSnsTopicName() != null && other.getSnsTopicName().equals(this.getSnsTopicName()) == false)
            return false;
        if (other.getIncludeGlobalServiceEvents() == null ^ this.getIncludeGlobalServiceEvents() == null)
            return false;
        if (other.getIncludeGlobalServiceEvents() != null && other.getIncludeGlobalServiceEvents().equals(this.getIncludeGlobalServiceEvents()) == false)
            return false;
        if (other.getIsMultiRegionTrail() == null ^ this.getIsMultiRegionTrail() == null)
            return false;
        if (other.getIsMultiRegionTrail() != null && other.getIsMultiRegionTrail().equals(this.getIsMultiRegionTrail()) == false)
            return false;
        if (other.getEnableLogFileValidation() == null ^ this.getEnableLogFileValidation() == null)
            return false;
        if (other.getEnableLogFileValidation() != null && other.getEnableLogFileValidation().equals(this.getEnableLogFileValidation()) == false)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() == null ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getIsOrganizationTrail() == null ^ this.getIsOrganizationTrail() == null)
            return false;
        if (other.getIsOrganizationTrail() != null && other.getIsOrganizationTrail().equals(this.getIsOrganizationTrail()) == false)
            return false;
        if (other.getTagsList() == null ^ this.getTagsList() == null)
            return false;
        if (other.getTagsList() != null && other.getTagsList().equals(this.getTagsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicName() == null) ? 0 : getSnsTopicName().hashCode());
        hashCode = prime * hashCode + ((getIncludeGlobalServiceEvents() == null) ? 0 : getIncludeGlobalServiceEvents().hashCode());
        hashCode = prime * hashCode + ((getIsMultiRegionTrail() == null) ? 0 : getIsMultiRegionTrail().hashCode());
        hashCode = prime * hashCode + ((getEnableLogFileValidation() == null) ? 0 : getEnableLogFileValidation().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getIsOrganizationTrail() == null) ? 0 : getIsOrganizationTrail().hashCode());
        hashCode = prime * hashCode + ((getTagsList() == null) ? 0 : getTagsList().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrailRequest clone() {
        return (CreateTrailRequest) super.clone();
    }

}
