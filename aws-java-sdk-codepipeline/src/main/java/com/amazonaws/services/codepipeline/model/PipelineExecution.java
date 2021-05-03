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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about an execution of a pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the pipeline with the specified pipeline execution.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The version number of the pipeline with the specified pipeline execution.
     * </p>
     */
    private Integer pipelineVersion;
    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: The pipeline execution was manually stopped. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode,
     * the execution is either completing or abandoning in-progress actions. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded">Superseded
     * Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A summary that contains a description of the pipeline execution status.
     * </p>
     */
    private String statusSummary;
    /**
     * <p>
     * A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     * </p>
     */
    private java.util.List<ArtifactRevision> artifactRevisions;

    /**
     * <p>
     * The name of the pipeline with the specified pipeline execution.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline with the specified pipeline execution.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline with the specified pipeline execution.
     * </p>
     * 
     * @return The name of the pipeline with the specified pipeline execution.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline with the specified pipeline execution.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline with the specified pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecution withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline with the specified pipeline execution.
     * </p>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline with the specified pipeline execution.
     */

    public void setPipelineVersion(Integer pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline with the specified pipeline execution.
     * </p>
     * 
     * @return The version number of the pipeline with the specified pipeline execution.
     */

    public Integer getPipelineVersion() {
        return this.pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline with the specified pipeline execution.
     * </p>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline with the specified pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecution withPipelineVersion(Integer pipelineVersion) {
        setPipelineVersion(pipelineVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @return The ID of the pipeline execution.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecution withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: The pipeline execution was manually stopped. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode,
     * the execution is either completing or abandoning in-progress actions. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded">Superseded
     * Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: The pipeline execution was manually stopped. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     *        >Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop
     *        mode, the execution is either completing or abandoning in-progress actions. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped">
     *        Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead. For more information, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded"
     *        >Superseded Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @see PipelineExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: The pipeline execution was manually stopped. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode,
     * the execution is either completing or abandoning in-progress actions. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded">Superseded
     * Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the pipeline execution.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InProgress: The pipeline execution is currently running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Stopped: The pipeline execution was manually stopped. For more information, see <a href=
     *         "https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     *         >Stopped Executions</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected
     *         stop mode, the execution is either completing or abandoning in-progress actions. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     *         >Stopped Executions</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: The pipeline execution was completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer
     *         pipeline execution advanced and continued through the pipeline instead. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded">Superseded
     *         Executions</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The pipeline execution was not completed successfully.
     *         </p>
     *         </li>
     * @see PipelineExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: The pipeline execution was manually stopped. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode,
     * the execution is either completing or abandoning in-progress actions. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded">Superseded
     * Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: The pipeline execution was manually stopped. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     *        >Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop
     *        mode, the execution is either completing or abandoning in-progress actions. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped">
     *        Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead. For more information, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded"
     *        >Superseded Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStatus
     */

    public PipelineExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: The pipeline execution was manually stopped. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode,
     * the execution is either completing or abandoning in-progress actions. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded">Superseded
     * Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: The pipeline execution was manually stopped. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     *        >Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop
     *        mode, the execution is either completing or abandoning in-progress actions. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped">
     *        Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead. For more information, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded"
     *        >Superseded Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @see PipelineExecutionStatus
     */

    public void setStatus(PipelineExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: The pipeline execution was manually stopped. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode,
     * the execution is either completing or abandoning in-progress actions. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     * >Stopped Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead. For more information, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded">Superseded
     * Executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cancelled: The pipeline’s definition was updated before the pipeline execution could be completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: The pipeline execution was manually stopped. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped"
     *        >Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop
     *        mode, the execution is either completing or abandoning in-progress actions. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-executions-stopped">
     *        Stopped Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead. For more information, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#concepts-superseded"
     *        >Superseded Executions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStatus
     */

    public PipelineExecution withStatus(PipelineExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A summary that contains a description of the pipeline execution status.
     * </p>
     * 
     * @param statusSummary
     *        A summary that contains a description of the pipeline execution status.
     */

    public void setStatusSummary(String statusSummary) {
        this.statusSummary = statusSummary;
    }

    /**
     * <p>
     * A summary that contains a description of the pipeline execution status.
     * </p>
     * 
     * @return A summary that contains a description of the pipeline execution status.
     */

    public String getStatusSummary() {
        return this.statusSummary;
    }

    /**
     * <p>
     * A summary that contains a description of the pipeline execution status.
     * </p>
     * 
     * @param statusSummary
     *        A summary that contains a description of the pipeline execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecution withStatusSummary(String statusSummary) {
        setStatusSummary(statusSummary);
        return this;
    }

    /**
     * <p>
     * A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     * </p>
     * 
     * @return A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     */

    public java.util.List<ArtifactRevision> getArtifactRevisions() {
        return artifactRevisions;
    }

    /**
     * <p>
     * A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     * </p>
     * 
     * @param artifactRevisions
     *        A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     */

    public void setArtifactRevisions(java.util.Collection<ArtifactRevision> artifactRevisions) {
        if (artifactRevisions == null) {
            this.artifactRevisions = null;
            return;
        }

        this.artifactRevisions = new java.util.ArrayList<ArtifactRevision>(artifactRevisions);
    }

    /**
     * <p>
     * A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArtifactRevisions(java.util.Collection)} or {@link #withArtifactRevisions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param artifactRevisions
     *        A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecution withArtifactRevisions(ArtifactRevision... artifactRevisions) {
        if (this.artifactRevisions == null) {
            setArtifactRevisions(new java.util.ArrayList<ArtifactRevision>(artifactRevisions.length));
        }
        for (ArtifactRevision ele : artifactRevisions) {
            this.artifactRevisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     * </p>
     * 
     * @param artifactRevisions
     *        A list of <code>ArtifactRevision</code> objects included in a pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecution withArtifactRevisions(java.util.Collection<ArtifactRevision> artifactRevisions) {
        setArtifactRevisions(artifactRevisions);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineVersion() != null)
            sb.append("PipelineVersion: ").append(getPipelineVersion()).append(",");
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusSummary() != null)
            sb.append("StatusSummary: ").append(getStatusSummary()).append(",");
        if (getArtifactRevisions() != null)
            sb.append("ArtifactRevisions: ").append(getArtifactRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineExecution == false)
            return false;
        PipelineExecution other = (PipelineExecution) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineVersion() == null ^ this.getPipelineVersion() == null)
            return false;
        if (other.getPipelineVersion() != null && other.getPipelineVersion().equals(this.getPipelineVersion()) == false)
            return false;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusSummary() == null ^ this.getStatusSummary() == null)
            return false;
        if (other.getStatusSummary() != null && other.getStatusSummary().equals(this.getStatusSummary()) == false)
            return false;
        if (other.getArtifactRevisions() == null ^ this.getArtifactRevisions() == null)
            return false;
        if (other.getArtifactRevisions() != null && other.getArtifactRevisions().equals(this.getArtifactRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineVersion() == null) ? 0 : getPipelineVersion().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusSummary() == null) ? 0 : getStatusSummary().hashCode());
        hashCode = prime * hashCode + ((getArtifactRevisions() == null) ? 0 : getArtifactRevisions().hashCode());
        return hashCode;
    }

    @Override
    public PipelineExecution clone() {
        try {
            return (PipelineExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
