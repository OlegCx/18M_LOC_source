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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Each job converts an input file into an output file or files. For more information, see the User Guide at
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Job" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /** Accelerated transcoding can significantly speed up jobs with long, visually complex content. */
    private AccelerationSettings accelerationSettings;
    /**
     * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     * (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration
     * (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus
     * is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible
     * with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings
     * aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated
     * transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without
     * accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
     */
    private String accelerationStatus;
    /** An identifier for this resource that is unique within all of AWS. */
    private String arn;
    /**
     * The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any
     * billing report that you set up.
     */
    private String billingTagsSource;
    /** The time, in Unix epoch format in seconds, when the job got created. */
    private java.util.Date createdAt;
    /** A job's phase can be PROBING, TRANSCODING OR UPLOADING */
    private String currentPhase;
    /** Error code for the job */
    private Integer errorCode;
    /** Error message of Job */
    private String errorMessage;
    /** Optional list of hop destinations. */
    private java.util.List<HopDestination> hopDestinations;
    /** A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources */
    private String id;
    /**
     * An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time from
     * when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS Elemental
     * MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response to GetJob and
     * ListJobs requests. The jobPercentComplete estimate is reliable for the following input containers: Quicktime,
     * Transport Stream, MP4, and MXF. For some jobs, the service can't provide information about job progress. In those
     * cases, jobPercentComplete returns a null value.
     */
    private Integer jobPercentComplete;
    /** The job template that the job is created from, if it is created from a job template. */
    private String jobTemplate;
    /** Provides messages from the service about jobs that you have already successfully submitted. */
    private JobMessages messages;
    /** List of output group details */
    private java.util.List<OutputGroupDetail> outputGroupDetails;
    /** Relative priority on the job. */
    private Integer priority;
    /**
     * When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the
     * default queue. For more about queues, see the User Guide topic at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    private String queue;
    /** The job's queue hopping history. */
    private java.util.List<QueueTransition> queueTransitions;
    /** The number of times that the service automatically attempted to process your job after encountering an error. */
    private Integer retryCount;
    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */
    private String role;
    /** JobSettings contains all the transcode settings for a job. */
    private JobSettings settings;
    /**
     * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When
     * this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see
     * with one RTS in a reserved queue. This setting is disabled by default.
     */
    private String simulateReservedQueue;
    /** A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR. */
    private String status;
    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     */
    private String statusUpdateInterval;
    /** Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds. */
    private Timing timing;
    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     */
    private java.util.Map<String, String> userMetadata;

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     * 
     * @param accelerationSettings
     *        Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     */

    public void setAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     * 
     * @return Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     */

    public AccelerationSettings getAccelerationSettings() {
        return this.accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     * 
     * @param accelerationSettings
     *        Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withAccelerationSettings(AccelerationSettings accelerationSettings) {
        setAccelerationSettings(accelerationSettings);
        return this;
    }

    /**
     * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     * (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration
     * (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus
     * is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible
     * with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings
     * aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated
     * transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without
     * accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
     * 
     * @param accelerationStatus
     *        Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     *        (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     *        Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other
     *        states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files
     *        and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is
     *        ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the
     *        service either fails your job or runs it without accelerated transcoding, depending on how you set
     *        Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding,
     *        AccelerationStatus is NOT_ACCELERATED.
     * @see AccelerationStatus
     */

    public void setAccelerationStatus(String accelerationStatus) {
        this.accelerationStatus = accelerationStatus;
    }

    /**
     * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     * (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration
     * (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus
     * is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible
     * with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings
     * aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated
     * transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without
     * accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
     * 
     * @return Describes whether the current job is running with accelerated transcoding. For jobs that have
     *         Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs
     *         that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the
     *         other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input
     *         files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is
     *         ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the
     *         service either fails your job or runs it without accelerated transcoding, depending on how you set
     *         Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding,
     *         AccelerationStatus is NOT_ACCELERATED.
     * @see AccelerationStatus
     */

    public String getAccelerationStatus() {
        return this.accelerationStatus;
    }

    /**
     * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     * (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration
     * (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus
     * is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible
     * with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings
     * aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated
     * transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without
     * accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
     * 
     * @param accelerationStatus
     *        Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     *        (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     *        Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other
     *        states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files
     *        and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is
     *        ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the
     *        service either fails your job or runs it without accelerated transcoding, depending on how you set
     *        Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding,
     *        AccelerationStatus is NOT_ACCELERATED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccelerationStatus
     */

    public Job withAccelerationStatus(String accelerationStatus) {
        setAccelerationStatus(accelerationStatus);
        return this;
    }

    /**
     * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     * (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration
     * (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus
     * is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible
     * with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings
     * aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated
     * transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without
     * accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
     * 
     * @param accelerationStatus
     *        Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
     *        (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     *        Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other
     *        states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files
     *        and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is
     *        ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the
     *        service either fails your job or runs it without accelerated transcoding, depending on how you set
     *        Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding,
     *        AccelerationStatus is NOT_ACCELERATED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccelerationStatus
     */

    public Job withAccelerationStatus(AccelerationStatus accelerationStatus) {
        this.accelerationStatus = accelerationStatus.toString();
        return this;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @return An identifier for this resource that is unique within all of AWS.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any
     * billing report that you set up.
     * 
     * @param billingTagsSource
     *        The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs
     *        on any billing report that you set up.
     * @see BillingTagsSource
     */

    public void setBillingTagsSource(String billingTagsSource) {
        this.billingTagsSource = billingTagsSource;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any
     * billing report that you set up.
     * 
     * @return The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs
     *         on any billing report that you set up.
     * @see BillingTagsSource
     */

    public String getBillingTagsSource() {
        return this.billingTagsSource;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any
     * billing report that you set up.
     * 
     * @param billingTagsSource
     *        The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs
     *        on any billing report that you set up.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingTagsSource
     */

    public Job withBillingTagsSource(String billingTagsSource) {
        setBillingTagsSource(billingTagsSource);
        return this;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any
     * billing report that you set up.
     * 
     * @param billingTagsSource
     *        The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs
     *        on any billing report that you set up.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingTagsSource
     */

    public Job withBillingTagsSource(BillingTagsSource billingTagsSource) {
        this.billingTagsSource = billingTagsSource.toString();
        return this;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     * 
     * @param createdAt
     *        The time, in Unix epoch format in seconds, when the job got created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     * 
     * @return The time, in Unix epoch format in seconds, when the job got created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     * 
     * @param createdAt
     *        The time, in Unix epoch format in seconds, when the job got created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * 
     * @param currentPhase
     *        A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * @see JobPhase
     */

    public void setCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * 
     * @return A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * @see JobPhase
     */

    public String getCurrentPhase() {
        return this.currentPhase;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * 
     * @param currentPhase
     *        A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobPhase
     */

    public Job withCurrentPhase(String currentPhase) {
        setCurrentPhase(currentPhase);
        return this;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * 
     * @param currentPhase
     *        A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobPhase
     */

    public Job withCurrentPhase(JobPhase currentPhase) {
        this.currentPhase = currentPhase.toString();
        return this;
    }

    /**
     * Error code for the job
     * 
     * @param errorCode
     *        Error code for the job
     */

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Error code for the job
     * 
     * @return Error code for the job
     */

    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * Error code for the job
     * 
     * @param errorCode
     *        Error code for the job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withErrorCode(Integer errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * Error message of Job
     * 
     * @param errorMessage
     *        Error message of Job
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Error message of Job
     * 
     * @return Error message of Job
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Error message of Job
     * 
     * @param errorMessage
     *        Error message of Job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * Optional list of hop destinations.
     * 
     * @return Optional list of hop destinations.
     */

    public java.util.List<HopDestination> getHopDestinations() {
        return hopDestinations;
    }

    /**
     * Optional list of hop destinations.
     * 
     * @param hopDestinations
     *        Optional list of hop destinations.
     */

    public void setHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        if (hopDestinations == null) {
            this.hopDestinations = null;
            return;
        }

        this.hopDestinations = new java.util.ArrayList<HopDestination>(hopDestinations);
    }

    /**
     * Optional list of hop destinations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHopDestinations(java.util.Collection)} or {@link #withHopDestinations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param hopDestinations
     *        Optional list of hop destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withHopDestinations(HopDestination... hopDestinations) {
        if (this.hopDestinations == null) {
            setHopDestinations(new java.util.ArrayList<HopDestination>(hopDestinations.length));
        }
        for (HopDestination ele : hopDestinations) {
            this.hopDestinations.add(ele);
        }
        return this;
    }

    /**
     * Optional list of hop destinations.
     * 
     * @param hopDestinations
     *        Optional list of hop destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        setHopDestinations(hopDestinations);
        return this;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * 
     * @param id
     *        A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * 
     * @return A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     */

    public String getId() {
        return this.id;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * 
     * @param id
     *        A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withId(String id) {
        setId(id);
        return this;
    }

    /**
     * An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time from
     * when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS Elemental
     * MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response to GetJob and
     * ListJobs requests. The jobPercentComplete estimate is reliable for the following input containers: Quicktime,
     * Transport Stream, MP4, and MXF. For some jobs, the service can't provide information about job progress. In those
     * cases, jobPercentComplete returns a null value.
     * 
     * @param jobPercentComplete
     *        An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time
     *        from when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS
     *        Elemental MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response
     *        to GetJob and ListJobs requests. The jobPercentComplete estimate is reliable for the following input
     *        containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the service can't provide
     *        information about job progress. In those cases, jobPercentComplete returns a null value.
     */

    public void setJobPercentComplete(Integer jobPercentComplete) {
        this.jobPercentComplete = jobPercentComplete;
    }

    /**
     * An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time from
     * when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS Elemental
     * MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response to GetJob and
     * ListJobs requests. The jobPercentComplete estimate is reliable for the following input containers: Quicktime,
     * Transport Stream, MP4, and MXF. For some jobs, the service can't provide information about job progress. In those
     * cases, jobPercentComplete returns a null value.
     * 
     * @return An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time
     *         from when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS
     *         Elemental MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response
     *         to GetJob and ListJobs requests. The jobPercentComplete estimate is reliable for the following input
     *         containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the service can't provide
     *         information about job progress. In those cases, jobPercentComplete returns a null value.
     */

    public Integer getJobPercentComplete() {
        return this.jobPercentComplete;
    }

    /**
     * An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time from
     * when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS Elemental
     * MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response to GetJob and
     * ListJobs requests. The jobPercentComplete estimate is reliable for the following input containers: Quicktime,
     * Transport Stream, MP4, and MXF. For some jobs, the service can't provide information about job progress. In those
     * cases, jobPercentComplete returns a null value.
     * 
     * @param jobPercentComplete
     *        An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time
     *        from when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS
     *        Elemental MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response
     *        to GetJob and ListJobs requests. The jobPercentComplete estimate is reliable for the following input
     *        containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the service can't provide
     *        information about job progress. In those cases, jobPercentComplete returns a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobPercentComplete(Integer jobPercentComplete) {
        setJobPercentComplete(jobPercentComplete);
        return this;
    }

    /**
     * The job template that the job is created from, if it is created from a job template.
     * 
     * @param jobTemplate
     *        The job template that the job is created from, if it is created from a job template.
     */

    public void setJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * The job template that the job is created from, if it is created from a job template.
     * 
     * @return The job template that the job is created from, if it is created from a job template.
     */

    public String getJobTemplate() {
        return this.jobTemplate;
    }

    /**
     * The job template that the job is created from, if it is created from a job template.
     * 
     * @param jobTemplate
     *        The job template that the job is created from, if it is created from a job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobTemplate(String jobTemplate) {
        setJobTemplate(jobTemplate);
        return this;
    }

    /**
     * Provides messages from the service about jobs that you have already successfully submitted.
     * 
     * @param messages
     *        Provides messages from the service about jobs that you have already successfully submitted.
     */

    public void setMessages(JobMessages messages) {
        this.messages = messages;
    }

    /**
     * Provides messages from the service about jobs that you have already successfully submitted.
     * 
     * @return Provides messages from the service about jobs that you have already successfully submitted.
     */

    public JobMessages getMessages() {
        return this.messages;
    }

    /**
     * Provides messages from the service about jobs that you have already successfully submitted.
     * 
     * @param messages
     *        Provides messages from the service about jobs that you have already successfully submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMessages(JobMessages messages) {
        setMessages(messages);
        return this;
    }

    /**
     * List of output group details
     * 
     * @return List of output group details
     */

    public java.util.List<OutputGroupDetail> getOutputGroupDetails() {
        return outputGroupDetails;
    }

    /**
     * List of output group details
     * 
     * @param outputGroupDetails
     *        List of output group details
     */

    public void setOutputGroupDetails(java.util.Collection<OutputGroupDetail> outputGroupDetails) {
        if (outputGroupDetails == null) {
            this.outputGroupDetails = null;
            return;
        }

        this.outputGroupDetails = new java.util.ArrayList<OutputGroupDetail>(outputGroupDetails);
    }

    /**
     * List of output group details
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputGroupDetails(java.util.Collection)} or {@link #withOutputGroupDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputGroupDetails
     *        List of output group details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputGroupDetails(OutputGroupDetail... outputGroupDetails) {
        if (this.outputGroupDetails == null) {
            setOutputGroupDetails(new java.util.ArrayList<OutputGroupDetail>(outputGroupDetails.length));
        }
        for (OutputGroupDetail ele : outputGroupDetails) {
            this.outputGroupDetails.add(ele);
        }
        return this;
    }

    /**
     * List of output group details
     * 
     * @param outputGroupDetails
     *        List of output group details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputGroupDetails(java.util.Collection<OutputGroupDetail> outputGroupDetails) {
        setOutputGroupDetails(outputGroupDetails);
        return this;
    }

    /**
     * Relative priority on the job.
     * 
     * @param priority
     *        Relative priority on the job.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Relative priority on the job.
     * 
     * @return Relative priority on the job.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Relative priority on the job.
     * 
     * @param priority
     *        Relative priority on the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the
     * default queue. For more about queues, see the User Guide topic at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param queue
     *        When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the
     *        default queue. For more about queues, see the User Guide topic at
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the
     * default queue. For more about queues, see the User Guide topic at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @return When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     *         the default queue. For more about queues, see the User Guide topic at
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the
     * default queue. For more about queues, see the User Guide topic at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param queue
     *        When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the
     *        default queue. For more about queues, see the User Guide topic at
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * The job's queue hopping history.
     * 
     * @return The job's queue hopping history.
     */

    public java.util.List<QueueTransition> getQueueTransitions() {
        return queueTransitions;
    }

    /**
     * The job's queue hopping history.
     * 
     * @param queueTransitions
     *        The job's queue hopping history.
     */

    public void setQueueTransitions(java.util.Collection<QueueTransition> queueTransitions) {
        if (queueTransitions == null) {
            this.queueTransitions = null;
            return;
        }

        this.queueTransitions = new java.util.ArrayList<QueueTransition>(queueTransitions);
    }

    /**
     * The job's queue hopping history.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueTransitions(java.util.Collection)} or {@link #withQueueTransitions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queueTransitions
     *        The job's queue hopping history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withQueueTransitions(QueueTransition... queueTransitions) {
        if (this.queueTransitions == null) {
            setQueueTransitions(new java.util.ArrayList<QueueTransition>(queueTransitions.length));
        }
        for (QueueTransition ele : queueTransitions) {
            this.queueTransitions.add(ele);
        }
        return this;
    }

    /**
     * The job's queue hopping history.
     * 
     * @param queueTransitions
     *        The job's queue hopping history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withQueueTransitions(java.util.Collection<QueueTransition> queueTransitions) {
        setQueueTransitions(queueTransitions);
        return this;
    }

    /**
     * The number of times that the service automatically attempted to process your job after encountering an error.
     * 
     * @param retryCount
     *        The number of times that the service automatically attempted to process your job after encountering an
     *        error.
     */

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * The number of times that the service automatically attempted to process your job after encountering an error.
     * 
     * @return The number of times that the service automatically attempted to process your job after encountering an
     *         error.
     */

    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * The number of times that the service automatically attempted to process your job after encountering an error.
     * 
     * @param retryCount
     *        The number of times that the service automatically attempted to process your job after encountering an
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withRetryCount(Integer retryCount) {
        setRetryCount(retryCount);
        return this;
    }

    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @param role
     *        The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the
     *        User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @return The IAM role you use for creating this job. For details about permissions, see the User Guide topic at
     *         the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */

    public String getRole() {
        return this.role;
    }

    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @param role
     *        The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the
     *        User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     * 
     * @param settings
     *        JobSettings contains all the transcode settings for a job.
     */

    public void setSettings(JobSettings settings) {
        this.settings = settings;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     * 
     * @return JobSettings contains all the transcode settings for a job.
     */

    public JobSettings getSettings() {
        return this.settings;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     * 
     * @param settings
     *        JobSettings contains all the transcode settings for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withSettings(JobSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When
     * this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see
     * with one RTS in a reserved queue. This setting is disabled by default.
     * 
     * @param simulateReservedQueue
     *        Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you
     *        need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to
     *        what you will see with one RTS in a reserved queue. This setting is disabled by default.
     * @see SimulateReservedQueue
     */

    public void setSimulateReservedQueue(String simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When
     * this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see
     * with one RTS in a reserved queue. This setting is disabled by default.
     * 
     * @return Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you
     *         need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance
     *         to what you will see with one RTS in a reserved queue. This setting is disabled by default.
     * @see SimulateReservedQueue
     */

    public String getSimulateReservedQueue() {
        return this.simulateReservedQueue;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When
     * this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see
     * with one RTS in a reserved queue. This setting is disabled by default.
     * 
     * @param simulateReservedQueue
     *        Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you
     *        need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to
     *        what you will see with one RTS in a reserved queue. This setting is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulateReservedQueue
     */

    public Job withSimulateReservedQueue(String simulateReservedQueue) {
        setSimulateReservedQueue(simulateReservedQueue);
        return this;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When
     * this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see
     * with one RTS in a reserved queue. This setting is disabled by default.
     * 
     * @param simulateReservedQueue
     *        Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you
     *        need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to
     *        what you will see with one RTS in a reserved queue. This setting is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulateReservedQueue
     */

    public Job withSimulateReservedQueue(SimulateReservedQueue simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue.toString();
        return this;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @param status
     *        A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @return A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @param status
     *        A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * 
     * @param status
     *        A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateInterval
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     * @see StatusUpdateInterval
     */

    public void setStatusUpdateInterval(String statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @return Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *         in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *         service begins processing your job to the time it completes the transcode or encounters an error.
     * @see StatusUpdateInterval
     */

    public String getStatusUpdateInterval() {
        return this.statusUpdateInterval;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateInterval
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusUpdateInterval
     */

    public Job withStatusUpdateInterval(String statusUpdateInterval) {
        setStatusUpdateInterval(statusUpdateInterval);
        return this;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateInterval
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusUpdateInterval
     */

    public Job withStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
        return this;
    }

    /**
     * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
     * 
     * @param timing
     *        Information about when jobs are submitted, started, and finished is specified in Unix epoch format in
     *        seconds.
     */

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    /**
     * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
     * 
     * @return Information about when jobs are submitted, started, and finished is specified in Unix epoch format in
     *         seconds.
     */

    public Timing getTiming() {
        return this.timing;
    }

    /**
     * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
     * 
     * @param timing
     *        Information about when jobs are submitted, started, and finished is specified in Unix epoch format in
     *        seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTiming(Timing timing) {
        setTiming(timing);
        return this;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     * 
     * @return User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in
     *         key/value pairs.
     */

    public java.util.Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in
     *        key/value pairs.
     */

    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in
     *        key/value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withUserMetadata(java.util.Map<String, String> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    /**
     * Add a single UserMetadata entry
     *
     * @see Job#withUserMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Job addUserMetadataEntry(String key, String value) {
        if (null == this.userMetadata) {
            this.userMetadata = new java.util.HashMap<String, String>();
        }
        if (this.userMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearUserMetadataEntries() {
        this.userMetadata = null;
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
        if (getAccelerationSettings() != null)
            sb.append("AccelerationSettings: ").append(getAccelerationSettings()).append(",");
        if (getAccelerationStatus() != null)
            sb.append("AccelerationStatus: ").append(getAccelerationStatus()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBillingTagsSource() != null)
            sb.append("BillingTagsSource: ").append(getBillingTagsSource()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCurrentPhase() != null)
            sb.append("CurrentPhase: ").append(getCurrentPhase()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getHopDestinations() != null)
            sb.append("HopDestinations: ").append(getHopDestinations()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getJobPercentComplete() != null)
            sb.append("JobPercentComplete: ").append(getJobPercentComplete()).append(",");
        if (getJobTemplate() != null)
            sb.append("JobTemplate: ").append(getJobTemplate()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getOutputGroupDetails() != null)
            sb.append("OutputGroupDetails: ").append(getOutputGroupDetails()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getQueueTransitions() != null)
            sb.append("QueueTransitions: ").append(getQueueTransitions()).append(",");
        if (getRetryCount() != null)
            sb.append("RetryCount: ").append(getRetryCount()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getSimulateReservedQueue() != null)
            sb.append("SimulateReservedQueue: ").append(getSimulateReservedQueue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: ").append(getStatusUpdateInterval()).append(",");
        if (getTiming() != null)
            sb.append("Timing: ").append(getTiming()).append(",");
        if (getUserMetadata() != null)
            sb.append("UserMetadata: ").append(getUserMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getAccelerationStatus() == null ^ this.getAccelerationStatus() == null)
            return false;
        if (other.getAccelerationStatus() != null && other.getAccelerationStatus().equals(this.getAccelerationStatus()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBillingTagsSource() == null ^ this.getBillingTagsSource() == null)
            return false;
        if (other.getBillingTagsSource() != null && other.getBillingTagsSource().equals(this.getBillingTagsSource()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCurrentPhase() == null ^ this.getCurrentPhase() == null)
            return false;
        if (other.getCurrentPhase() != null && other.getCurrentPhase().equals(this.getCurrentPhase()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getHopDestinations() == null ^ this.getHopDestinations() == null)
            return false;
        if (other.getHopDestinations() != null && other.getHopDestinations().equals(this.getHopDestinations()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getJobPercentComplete() == null ^ this.getJobPercentComplete() == null)
            return false;
        if (other.getJobPercentComplete() != null && other.getJobPercentComplete().equals(this.getJobPercentComplete()) == false)
            return false;
        if (other.getJobTemplate() == null ^ this.getJobTemplate() == null)
            return false;
        if (other.getJobTemplate() != null && other.getJobTemplate().equals(this.getJobTemplate()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getOutputGroupDetails() == null ^ this.getOutputGroupDetails() == null)
            return false;
        if (other.getOutputGroupDetails() != null && other.getOutputGroupDetails().equals(this.getOutputGroupDetails()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getQueueTransitions() == null ^ this.getQueueTransitions() == null)
            return false;
        if (other.getQueueTransitions() != null && other.getQueueTransitions().equals(this.getQueueTransitions()) == false)
            return false;
        if (other.getRetryCount() == null ^ this.getRetryCount() == null)
            return false;
        if (other.getRetryCount() != null && other.getRetryCount().equals(this.getRetryCount()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getSimulateReservedQueue() == null ^ this.getSimulateReservedQueue() == null)
            return false;
        if (other.getSimulateReservedQueue() != null && other.getSimulateReservedQueue().equals(this.getSimulateReservedQueue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusUpdateInterval() == null ^ this.getStatusUpdateInterval() == null)
            return false;
        if (other.getStatusUpdateInterval() != null && other.getStatusUpdateInterval().equals(this.getStatusUpdateInterval()) == false)
            return false;
        if (other.getTiming() == null ^ this.getTiming() == null)
            return false;
        if (other.getTiming() != null && other.getTiming().equals(this.getTiming()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccelerationSettings() == null) ? 0 : getAccelerationSettings().hashCode());
        hashCode = prime * hashCode + ((getAccelerationStatus() == null) ? 0 : getAccelerationStatus().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBillingTagsSource() == null) ? 0 : getBillingTagsSource().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCurrentPhase() == null) ? 0 : getCurrentPhase().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getHopDestinations() == null) ? 0 : getHopDestinations().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getJobPercentComplete() == null) ? 0 : getJobPercentComplete().hashCode());
        hashCode = prime * hashCode + ((getJobTemplate() == null) ? 0 : getJobTemplate().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getOutputGroupDetails() == null) ? 0 : getOutputGroupDetails().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getQueueTransitions() == null) ? 0 : getQueueTransitions().hashCode());
        hashCode = prime * hashCode + ((getRetryCount() == null) ? 0 : getRetryCount().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getSimulateReservedQueue() == null) ? 0 : getSimulateReservedQueue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        hashCode = prime * hashCode + ((getTiming() == null) ? 0 : getTiming().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
