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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of information about a transcription job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TranscriptionJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptionJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     */
    private String transcriptionJobName;
    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The language code for the input speech.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     * <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * </p>
     */
    private String transcriptionJobStatus;
    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     * <code>outputBucketName</code> field when the transcription job was started with the
     * <code>StartTranscriptionJob</code> operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be retrieved
     * using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code> field.
     * </p>
     */
    private String outputLocationType;
    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     */
    private ContentRedaction contentRedaction;

    private ModelSettings modelSettings;
    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription job.
     * </p>
     */
    private Boolean identifyLanguage;
    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language it identified in the source audio. A
     * higher score indicates that Amazon Transcribe is more confident in the language it identified.
     * </p>
     */
    private Float identifiedLanguageScore;

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the transcription job.
     */

    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * 
     * @return The name of the transcription job.
     */

    public String getTranscriptionJobName() {
        return this.transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withTranscriptionJobName(String transcriptionJobName) {
        setTranscriptionJobName(transcriptionJobName);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @return A timestamp that shows when the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job started processing.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * 
     * @return A timestamp that shows when the job started processing.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job started processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @return A timestamp that shows when the job was completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @param languageCode
     *        The language code for the input speech.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @return The language code for the input speech.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @param languageCode
     *        The language code for the input speech.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TranscriptionJobSummary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @param languageCode
     *        The language code for the input speech.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TranscriptionJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     * <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     *        <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * @see TranscriptionJobStatus
     */

    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     * <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * </p>
     * 
     * @return The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     *         <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * @see TranscriptionJobStatus
     */

    public String getTranscriptionJobStatus() {
        return this.transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     * <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     *        <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public TranscriptionJobSummary withTranscriptionJobStatus(String transcriptionJobStatus) {
        setTranscriptionJobStatus(transcriptionJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     * <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the transcription job. When the status is <code>COMPLETED</code>, use the
     *        <code>GetTranscriptionJob</code> operation to get the results of the transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public TranscriptionJobSummary withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @return If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     * <code>outputBucketName</code> field when the transcription job was started with the
     * <code>StartTranscriptionJob</code> operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be retrieved
     * using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates the location of the output of the transcription job.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     *        <code>outputBucketName</code> field when the transcription job was started with the
     *        <code>StartTranscriptionJob</code> operation.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be
     *        retrieved using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code>
     *        field.
     * @see OutputLocationType
     */

    public void setOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     * <code>outputBucketName</code> field when the transcription job was started with the
     * <code>StartTranscriptionJob</code> operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be retrieved
     * using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @return Indicates the location of the output of the transcription job.</p>
     *         <p>
     *         If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     *         <code>outputBucketName</code> field when the transcription job was started with the
     *         <code>StartTranscriptionJob</code> operation.
     *         </p>
     *         <p>
     *         If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be
     *         retrieved using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code>
     *         field.
     * @see OutputLocationType
     */

    public String getOutputLocationType() {
        return this.outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     * <code>outputBucketName</code> field when the transcription job was started with the
     * <code>StartTranscriptionJob</code> operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be retrieved
     * using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates the location of the output of the transcription job.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     *        <code>outputBucketName</code> field when the transcription job was started with the
     *        <code>StartTranscriptionJob</code> operation.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be
     *        retrieved using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code>
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public TranscriptionJobSummary withOutputLocationType(String outputLocationType) {
        setOutputLocationType(outputLocationType);
        return this;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     * <code>outputBucketName</code> field when the transcription job was started with the
     * <code>StartTranscriptionJob</code> operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be retrieved
     * using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates the location of the output of the transcription job.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3 bucket specified in the
     *        <code>outputBucketName</code> field when the transcription job was started with the
     *        <code>StartTranscriptionJob</code> operation.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code> then the output is stored by Amazon Transcribe and can be
     *        retrieved using the URI in the <code>GetTranscriptionJob</code> response's <code>TranscriptFileUri</code>
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public TranscriptionJobSummary withOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
        return this;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * 
     * @param contentRedaction
     *        The content redaction settings of the transcription job.
     */

    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * 
     * @return The content redaction settings of the transcription job.
     */

    public ContentRedaction getContentRedaction() {
        return this.contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * 
     * @param contentRedaction
     *        The content redaction settings of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withContentRedaction(ContentRedaction contentRedaction) {
        setContentRedaction(contentRedaction);
        return this;
    }

    /**
     * @param modelSettings
     */

    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * @return
     */

    public ModelSettings getModelSettings() {
        return this.modelSettings;
    }

    /**
     * @param modelSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withModelSettings(ModelSettings modelSettings) {
        setModelSettings(modelSettings);
        return this;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription job.
     * </p>
     * 
     * @param identifyLanguage
     *        Whether automatic language identification was enabled for a transcription job.
     */

    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription job.
     * </p>
     * 
     * @return Whether automatic language identification was enabled for a transcription job.
     */

    public Boolean getIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription job.
     * </p>
     * 
     * @param identifyLanguage
     *        Whether automatic language identification was enabled for a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withIdentifyLanguage(Boolean identifyLanguage) {
        setIdentifyLanguage(identifyLanguage);
        return this;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription job.
     * </p>
     * 
     * @return Whether automatic language identification was enabled for a transcription job.
     */

    public Boolean isIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language it identified in the source audio. A
     * higher score indicates that Amazon Transcribe is more confident in the language it identified.
     * </p>
     * 
     * @param identifiedLanguageScore
     *        A value between zero and one that Amazon Transcribe assigned to the language it identified in the source
     *        audio. A higher score indicates that Amazon Transcribe is more confident in the language it identified.
     */

    public void setIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language it identified in the source audio. A
     * higher score indicates that Amazon Transcribe is more confident in the language it identified.
     * </p>
     * 
     * @return A value between zero and one that Amazon Transcribe assigned to the language it identified in the source
     *         audio. A higher score indicates that Amazon Transcribe is more confident in the language it identified.
     */

    public Float getIdentifiedLanguageScore() {
        return this.identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language it identified in the source audio. A
     * higher score indicates that Amazon Transcribe is more confident in the language it identified.
     * </p>
     * 
     * @param identifiedLanguageScore
     *        A value between zero and one that Amazon Transcribe assigned to the language it identified in the source
     *        audio. A higher score indicates that Amazon Transcribe is more confident in the language it identified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        setIdentifiedLanguageScore(identifiedLanguageScore);
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
        if (getTranscriptionJobName() != null)
            sb.append("TranscriptionJobName: ").append(getTranscriptionJobName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: ").append(getTranscriptionJobStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getOutputLocationType() != null)
            sb.append("OutputLocationType: ").append(getOutputLocationType()).append(",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: ").append(getContentRedaction()).append(",");
        if (getModelSettings() != null)
            sb.append("ModelSettings: ").append(getModelSettings()).append(",");
        if (getIdentifyLanguage() != null)
            sb.append("IdentifyLanguage: ").append(getIdentifyLanguage()).append(",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: ").append(getIdentifiedLanguageScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptionJobSummary == false)
            return false;
        TranscriptionJobSummary other = (TranscriptionJobSummary) obj;
        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getOutputLocationType() == null ^ this.getOutputLocationType() == null)
            return false;
        if (other.getOutputLocationType() != null && other.getOutputLocationType().equals(this.getOutputLocationType()) == false)
            return false;
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getModelSettings() == null ^ this.getModelSettings() == null)
            return false;
        if (other.getModelSettings() != null && other.getModelSettings().equals(this.getModelSettings()) == false)
            return false;
        if (other.getIdentifyLanguage() == null ^ this.getIdentifyLanguage() == null)
            return false;
        if (other.getIdentifyLanguage() != null && other.getIdentifyLanguage().equals(this.getIdentifyLanguage()) == false)
            return false;
        if (other.getIdentifiedLanguageScore() == null ^ this.getIdentifiedLanguageScore() == null)
            return false;
        if (other.getIdentifiedLanguageScore() != null && other.getIdentifiedLanguageScore().equals(this.getIdentifiedLanguageScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getOutputLocationType() == null) ? 0 : getOutputLocationType().hashCode());
        hashCode = prime * hashCode + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode + ((getModelSettings() == null) ? 0 : getModelSettings().hashCode());
        hashCode = prime * hashCode + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime * hashCode + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptionJobSummary clone() {
        try {
            return (TranscriptionJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.TranscriptionJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
