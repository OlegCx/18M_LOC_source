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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSimulationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the simulation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last started.
     * </p>
     */
    private java.util.Date lastStartedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * the failure behavior for the simulation job.
     * </p>
     */
    private String failureBehavior;
    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     */
    private String failureCode;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Simulation job output files location.
     * </p>
     */
    private OutputLocation outputLocation;
    /**
     * <p>
     * The logging configuration.
     * </p>
     */
    private LoggingConfig loggingConfig;
    /**
     * <p>
     * The maximum simulation job duration in seconds.
     * </p>
     */
    private Long maxJobDurationInSeconds;
    /**
     * <p>
     * The simulation job execution duration in milliseconds.
     * </p>
     */
    private Long simulationTimeMillis;
    /**
     * <p>
     * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on
     * your behalf.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * The robot application used by the simulation job.
     * </p>
     */
    private java.util.List<RobotApplicationConfig> robotApplications;
    /**
     * <p>
     * The simulation application used by the simulation job.
     * </p>
     */
    private java.util.List<SimulationApplicationConfig> simulationApplications;
    /**
     * <p>
     * The data sources for the simulation job.
     * </p>
     */
    private java.util.List<DataSource> dataSources;
    /**
     * <p>
     * The list of all tags added to the simulation job.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Information about the vpc configuration.
     * </p>
     */
    private VPCConfigResponse vpcConfig;
    /**
     * <p>
     * Compute information for the simulation job.
     * </p>
     */
    private ComputeResponse compute;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the simulation job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @param status
     *        The status of the simulation job.
     * @see SimulationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @return The status of the simulation job.
     * @see SimulationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @param status
     *        The status of the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobStatus
     */

    public CreateSimulationJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @param status
     *        The status of the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobStatus
     */

    public CreateSimulationJobResult withStatus(SimulationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last started.
     * </p>
     * 
     * @param lastStartedAt
     *        The time, in milliseconds since the epoch, when the simulation job was last started.
     */

    public void setLastStartedAt(java.util.Date lastStartedAt) {
        this.lastStartedAt = lastStartedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last started.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the simulation job was last started.
     */

    public java.util.Date getLastStartedAt() {
        return this.lastStartedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last started.
     * </p>
     * 
     * @param lastStartedAt
     *        The time, in milliseconds since the epoch, when the simulation job was last started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withLastStartedAt(java.util.Date lastStartedAt) {
        setLastStartedAt(lastStartedAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the simulation job was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the simulation job was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the simulation job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * the failure behavior for the simulation job.
     * </p>
     * 
     * @param failureBehavior
     *        the failure behavior for the simulation job.
     * @see FailureBehavior
     */

    public void setFailureBehavior(String failureBehavior) {
        this.failureBehavior = failureBehavior;
    }

    /**
     * <p>
     * the failure behavior for the simulation job.
     * </p>
     * 
     * @return the failure behavior for the simulation job.
     * @see FailureBehavior
     */

    public String getFailureBehavior() {
        return this.failureBehavior;
    }

    /**
     * <p>
     * the failure behavior for the simulation job.
     * </p>
     * 
     * @param failureBehavior
     *        the failure behavior for the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureBehavior
     */

    public CreateSimulationJobResult withFailureBehavior(String failureBehavior) {
        setFailureBehavior(failureBehavior);
        return this;
    }

    /**
     * <p>
     * the failure behavior for the simulation job.
     * </p>
     * 
     * @param failureBehavior
     *        the failure behavior for the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureBehavior
     */

    public CreateSimulationJobResult withFailureBehavior(FailureBehavior failureBehavior) {
        this.failureBehavior = failureBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the simulation job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Robot application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Simulation application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsS3Output</dt>
     *        <dd>
     *        <p>
     *        Unable to publish outputs to customer-provided S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsCloudwatchLogs</dt>
     *        <dd>
     *        <p>
     *        Unable to publish logs to customer-provided CloudWatch Logs resource.
     *        </p>
     *        </dd>
     *        <dt>SubnetIpLimitExceeded</dt>
     *        <dd>
     *        <p>
     *        Subnet IP limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>ENILimitExceeded</dt>
     *        <dd>
     *        <p>
     *        ENI limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsUserCredentials</dt>
     *        <dd>
     *        <p>
     *        Unable to use the Role provided.
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for RobotApplication does not match value during version creation.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for SimulationApplication does not match value during version creation.
     *        </p>
     *        </dd>
     * @see SimulationJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The failure code of the simulation job if it failed:</p>
     *         <dl>
     *         <dt>InternalServiceError</dt>
     *         <dd>
     *         <p>
     *         Internal service error.
     *         </p>
     *         </dd>
     *         <dt>RobotApplicationCrash</dt>
     *         <dd>
     *         <p>
     *         Robot application exited abnormally.
     *         </p>
     *         </dd>
     *         <dt>SimulationApplicationCrash</dt>
     *         <dd>
     *         <p>
     *         Simulation application exited abnormally.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsRobotApplication</dt>
     *         <dd>
     *         <p>
     *         Robot application bundle could not be downloaded.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsSimulationApplication</dt>
     *         <dd>
     *         <p>
     *         Simulation application bundle could not be downloaded.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsS3Output</dt>
     *         <dd>
     *         <p>
     *         Unable to publish outputs to customer-provided S3 bucket.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsCloudwatchLogs</dt>
     *         <dd>
     *         <p>
     *         Unable to publish logs to customer-provided CloudWatch Logs resource.
     *         </p>
     *         </dd>
     *         <dt>SubnetIpLimitExceeded</dt>
     *         <dd>
     *         <p>
     *         Subnet IP limit exceeded.
     *         </p>
     *         </dd>
     *         <dt>ENILimitExceeded</dt>
     *         <dd>
     *         <p>
     *         ENI limit exceeded.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsUserCredentials</dt>
     *         <dd>
     *         <p>
     *         Unable to use the Role provided.
     *         </p>
     *         </dd>
     *         <dt>InvalidBundleRobotApplication</dt>
     *         <dd>
     *         <p>
     *         Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *         </p>
     *         </dd>
     *         <dt>InvalidBundleSimulationApplication</dt>
     *         <dd>
     *         <p>
     *         Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *         </p>
     *         </dd>
     *         <dt>RobotApplicationVersionMismatchedEtag</dt>
     *         <dd>
     *         <p>
     *         Etag for RobotApplication does not match value during version creation.
     *         </p>
     *         </dd>
     *         <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *         <dd>
     *         <p>
     *         Etag for SimulationApplication does not match value during version creation.
     *         </p>
     *         </dd>
     * @see SimulationJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the simulation job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Robot application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Simulation application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsS3Output</dt>
     *        <dd>
     *        <p>
     *        Unable to publish outputs to customer-provided S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsCloudwatchLogs</dt>
     *        <dd>
     *        <p>
     *        Unable to publish logs to customer-provided CloudWatch Logs resource.
     *        </p>
     *        </dd>
     *        <dt>SubnetIpLimitExceeded</dt>
     *        <dd>
     *        <p>
     *        Subnet IP limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>ENILimitExceeded</dt>
     *        <dd>
     *        <p>
     *        ENI limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsUserCredentials</dt>
     *        <dd>
     *        <p>
     *        Unable to use the Role provided.
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for RobotApplication does not match value during version creation.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for SimulationApplication does not match value during version creation.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobErrorCode
     */

    public CreateSimulationJobResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the simulation job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Robot application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Simulation application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsS3Output</dt>
     *        <dd>
     *        <p>
     *        Unable to publish outputs to customer-provided S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsCloudwatchLogs</dt>
     *        <dd>
     *        <p>
     *        Unable to publish logs to customer-provided CloudWatch Logs resource.
     *        </p>
     *        </dd>
     *        <dt>SubnetIpLimitExceeded</dt>
     *        <dd>
     *        <p>
     *        Subnet IP limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>ENILimitExceeded</dt>
     *        <dd>
     *        <p>
     *        ENI limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsUserCredentials</dt>
     *        <dd>
     *        <p>
     *        Unable to use the Role provided.
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for RobotApplication does not match value during version creation.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for SimulationApplication does not match value during version creation.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobErrorCode
     */

    public CreateSimulationJobResult withFailureCode(SimulationJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Simulation job output files location.
     * </p>
     * 
     * @param outputLocation
     *        Simulation job output files location.
     */

    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * Simulation job output files location.
     * </p>
     * 
     * @return Simulation job output files location.
     */

    public OutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * Simulation job output files location.
     * </p>
     * 
     * @param outputLocation
     *        Simulation job output files location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withOutputLocation(OutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The logging configuration.
     * </p>
     * 
     * @param loggingConfig
     *        The logging configuration.
     */

    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * <p>
     * The logging configuration.
     * </p>
     * 
     * @return The logging configuration.
     */

    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * <p>
     * The logging configuration.
     * </p>
     * 
     * @param loggingConfig
     *        The logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withLoggingConfig(LoggingConfig loggingConfig) {
        setLoggingConfig(loggingConfig);
        return this;
    }

    /**
     * <p>
     * The maximum simulation job duration in seconds.
     * </p>
     * 
     * @param maxJobDurationInSeconds
     *        The maximum simulation job duration in seconds.
     */

    public void setMaxJobDurationInSeconds(Long maxJobDurationInSeconds) {
        this.maxJobDurationInSeconds = maxJobDurationInSeconds;
    }

    /**
     * <p>
     * The maximum simulation job duration in seconds.
     * </p>
     * 
     * @return The maximum simulation job duration in seconds.
     */

    public Long getMaxJobDurationInSeconds() {
        return this.maxJobDurationInSeconds;
    }

    /**
     * <p>
     * The maximum simulation job duration in seconds.
     * </p>
     * 
     * @param maxJobDurationInSeconds
     *        The maximum simulation job duration in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withMaxJobDurationInSeconds(Long maxJobDurationInSeconds) {
        setMaxJobDurationInSeconds(maxJobDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The simulation job execution duration in milliseconds.
     * </p>
     * 
     * @param simulationTimeMillis
     *        The simulation job execution duration in milliseconds.
     */

    public void setSimulationTimeMillis(Long simulationTimeMillis) {
        this.simulationTimeMillis = simulationTimeMillis;
    }

    /**
     * <p>
     * The simulation job execution duration in milliseconds.
     * </p>
     * 
     * @return The simulation job execution duration in milliseconds.
     */

    public Long getSimulationTimeMillis() {
        return this.simulationTimeMillis;
    }

    /**
     * <p>
     * The simulation job execution duration in milliseconds.
     * </p>
     * 
     * @param simulationTimeMillis
     *        The simulation job execution duration in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withSimulationTimeMillis(Long simulationTimeMillis) {
        setSimulationTimeMillis(simulationTimeMillis);
        return this;
    }

    /**
     * <p>
     * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on
     * your behalf.
     * </p>
     * 
     * @param iamRole
     *        The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated
     *        policies on your behalf.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on
     * your behalf.
     * </p>
     * 
     * @return The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated
     *         policies on your behalf.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on
     * your behalf.
     * </p>
     * 
     * @param iamRole
     *        The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated
     *        policies on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * The robot application used by the simulation job.
     * </p>
     * 
     * @return The robot application used by the simulation job.
     */

    public java.util.List<RobotApplicationConfig> getRobotApplications() {
        return robotApplications;
    }

    /**
     * <p>
     * The robot application used by the simulation job.
     * </p>
     * 
     * @param robotApplications
     *        The robot application used by the simulation job.
     */

    public void setRobotApplications(java.util.Collection<RobotApplicationConfig> robotApplications) {
        if (robotApplications == null) {
            this.robotApplications = null;
            return;
        }

        this.robotApplications = new java.util.ArrayList<RobotApplicationConfig>(robotApplications);
    }

    /**
     * <p>
     * The robot application used by the simulation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRobotApplications(java.util.Collection)} or {@link #withRobotApplications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param robotApplications
     *        The robot application used by the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withRobotApplications(RobotApplicationConfig... robotApplications) {
        if (this.robotApplications == null) {
            setRobotApplications(new java.util.ArrayList<RobotApplicationConfig>(robotApplications.length));
        }
        for (RobotApplicationConfig ele : robotApplications) {
            this.robotApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The robot application used by the simulation job.
     * </p>
     * 
     * @param robotApplications
     *        The robot application used by the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withRobotApplications(java.util.Collection<RobotApplicationConfig> robotApplications) {
        setRobotApplications(robotApplications);
        return this;
    }

    /**
     * <p>
     * The simulation application used by the simulation job.
     * </p>
     * 
     * @return The simulation application used by the simulation job.
     */

    public java.util.List<SimulationApplicationConfig> getSimulationApplications() {
        return simulationApplications;
    }

    /**
     * <p>
     * The simulation application used by the simulation job.
     * </p>
     * 
     * @param simulationApplications
     *        The simulation application used by the simulation job.
     */

    public void setSimulationApplications(java.util.Collection<SimulationApplicationConfig> simulationApplications) {
        if (simulationApplications == null) {
            this.simulationApplications = null;
            return;
        }

        this.simulationApplications = new java.util.ArrayList<SimulationApplicationConfig>(simulationApplications);
    }

    /**
     * <p>
     * The simulation application used by the simulation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSimulationApplications(java.util.Collection)} or
     * {@link #withSimulationApplications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param simulationApplications
     *        The simulation application used by the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withSimulationApplications(SimulationApplicationConfig... simulationApplications) {
        if (this.simulationApplications == null) {
            setSimulationApplications(new java.util.ArrayList<SimulationApplicationConfig>(simulationApplications.length));
        }
        for (SimulationApplicationConfig ele : simulationApplications) {
            this.simulationApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The simulation application used by the simulation job.
     * </p>
     * 
     * @param simulationApplications
     *        The simulation application used by the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withSimulationApplications(java.util.Collection<SimulationApplicationConfig> simulationApplications) {
        setSimulationApplications(simulationApplications);
        return this;
    }

    /**
     * <p>
     * The data sources for the simulation job.
     * </p>
     * 
     * @return The data sources for the simulation job.
     */

    public java.util.List<DataSource> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * The data sources for the simulation job.
     * </p>
     * 
     * @param dataSources
     *        The data sources for the simulation job.
     */

    public void setDataSources(java.util.Collection<DataSource> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<DataSource>(dataSources);
    }

    /**
     * <p>
     * The data sources for the simulation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        The data sources for the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withDataSources(DataSource... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<DataSource>(dataSources.length));
        }
        for (DataSource ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data sources for the simulation job.
     * </p>
     * 
     * @param dataSources
     *        The data sources for the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withDataSources(java.util.Collection<DataSource> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * The list of all tags added to the simulation job.
     * </p>
     * 
     * @return The list of all tags added to the simulation job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of all tags added to the simulation job.
     * </p>
     * 
     * @param tags
     *        The list of all tags added to the simulation job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of all tags added to the simulation job.
     * </p>
     * 
     * @param tags
     *        The list of all tags added to the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSimulationJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Information about the vpc configuration.
     * </p>
     * 
     * @param vpcConfig
     *        Information about the vpc configuration.
     */

    public void setVpcConfig(VPCConfigResponse vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Information about the vpc configuration.
     * </p>
     * 
     * @return Information about the vpc configuration.
     */

    public VPCConfigResponse getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * Information about the vpc configuration.
     * </p>
     * 
     * @param vpcConfig
     *        Information about the vpc configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withVpcConfig(VPCConfigResponse vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Compute information for the simulation job.
     * </p>
     * 
     * @param compute
     *        Compute information for the simulation job.
     */

    public void setCompute(ComputeResponse compute) {
        this.compute = compute;
    }

    /**
     * <p>
     * Compute information for the simulation job.
     * </p>
     * 
     * @return Compute information for the simulation job.
     */

    public ComputeResponse getCompute() {
        return this.compute;
    }

    /**
     * <p>
     * Compute information for the simulation job.
     * </p>
     * 
     * @param compute
     *        Compute information for the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationJobResult withCompute(ComputeResponse compute) {
        setCompute(compute);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastStartedAt() != null)
            sb.append("LastStartedAt: ").append(getLastStartedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getFailureBehavior() != null)
            sb.append("FailureBehavior: ").append(getFailureBehavior()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getLoggingConfig() != null)
            sb.append("LoggingConfig: ").append(getLoggingConfig()).append(",");
        if (getMaxJobDurationInSeconds() != null)
            sb.append("MaxJobDurationInSeconds: ").append(getMaxJobDurationInSeconds()).append(",");
        if (getSimulationTimeMillis() != null)
            sb.append("SimulationTimeMillis: ").append(getSimulationTimeMillis()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getRobotApplications() != null)
            sb.append("RobotApplications: ").append(getRobotApplications()).append(",");
        if (getSimulationApplications() != null)
            sb.append("SimulationApplications: ").append(getSimulationApplications()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getCompute() != null)
            sb.append("Compute: ").append(getCompute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSimulationJobResult == false)
            return false;
        CreateSimulationJobResult other = (CreateSimulationJobResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastStartedAt() == null ^ this.getLastStartedAt() == null)
            return false;
        if (other.getLastStartedAt() != null && other.getLastStartedAt().equals(this.getLastStartedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getFailureBehavior() == null ^ this.getFailureBehavior() == null)
            return false;
        if (other.getFailureBehavior() != null && other.getFailureBehavior().equals(this.getFailureBehavior()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getLoggingConfig() == null ^ this.getLoggingConfig() == null)
            return false;
        if (other.getLoggingConfig() != null && other.getLoggingConfig().equals(this.getLoggingConfig()) == false)
            return false;
        if (other.getMaxJobDurationInSeconds() == null ^ this.getMaxJobDurationInSeconds() == null)
            return false;
        if (other.getMaxJobDurationInSeconds() != null && other.getMaxJobDurationInSeconds().equals(this.getMaxJobDurationInSeconds()) == false)
            return false;
        if (other.getSimulationTimeMillis() == null ^ this.getSimulationTimeMillis() == null)
            return false;
        if (other.getSimulationTimeMillis() != null && other.getSimulationTimeMillis().equals(this.getSimulationTimeMillis()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getRobotApplications() == null ^ this.getRobotApplications() == null)
            return false;
        if (other.getRobotApplications() != null && other.getRobotApplications().equals(this.getRobotApplications()) == false)
            return false;
        if (other.getSimulationApplications() == null ^ this.getSimulationApplications() == null)
            return false;
        if (other.getSimulationApplications() != null && other.getSimulationApplications().equals(this.getSimulationApplications()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getCompute() == null ^ this.getCompute() == null)
            return false;
        if (other.getCompute() != null && other.getCompute().equals(this.getCompute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastStartedAt() == null) ? 0 : getLastStartedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getFailureBehavior() == null) ? 0 : getFailureBehavior().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode + ((getMaxJobDurationInSeconds() == null) ? 0 : getMaxJobDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getSimulationTimeMillis() == null) ? 0 : getSimulationTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getRobotApplications() == null) ? 0 : getRobotApplications().hashCode());
        hashCode = prime * hashCode + ((getSimulationApplications() == null) ? 0 : getSimulationApplications().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getCompute() == null) ? 0 : getCompute().hashCode());
        return hashCode;
    }

    @Override
    public CreateSimulationJobResult clone() {
        try {
            return (CreateSimulationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
