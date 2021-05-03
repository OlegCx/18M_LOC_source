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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJobTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use
     * this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     */
    private AccelerationSettings accelerationSettings;
    /** Optional. A category for the job template you are creating */
    private String category;
    /** Optional. A description of the job template you are creating. */
    private String description;
    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to.
     * Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For
     * more information about this feature, see the AWS Elemental MediaConvert User Guide.
     */
    private java.util.List<HopDestination> hopDestinations;
    /** The name of the job template you are creating. */
    private String name;
    /**
     * Specify the relative priority for this job. In any given queue, the service begins processing the job with the
     * highest value first. When more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     */
    private Integer priority;
    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     */
    private String queue;
    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     */
    private JobTemplateSettings settings;
    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     */
    private String statusUpdateInterval;
    /** The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key. */
    private java.util.Map<String, String> tags;

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use
     * this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     * 
     * @param accelerationSettings
     *        Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that
     *        use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental
     *        MediaConvert User Guide.
     */

    public void setAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use
     * this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     * 
     * @return Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that
     *         use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental
     *         MediaConvert User Guide.
     */

    public AccelerationSettings getAccelerationSettings() {
        return this.accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use
     * this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     * 
     * @param accelerationSettings
     *        Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that
     *        use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental
     *        MediaConvert User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withAccelerationSettings(AccelerationSettings accelerationSettings) {
        setAccelerationSettings(accelerationSettings);
        return this;
    }

    /**
     * Optional. A category for the job template you are creating
     * 
     * @param category
     *        Optional. A category for the job template you are creating
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Optional. A category for the job template you are creating
     * 
     * @return Optional. A category for the job template you are creating
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * Optional. A category for the job template you are creating
     * 
     * @param category
     *        Optional. A category for the job template you are creating
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * Optional. A description of the job template you are creating.
     * 
     * @param description
     *        Optional. A description of the job template you are creating.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Optional. A description of the job template you are creating.
     * 
     * @return Optional. A description of the job template you are creating.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * Optional. A description of the job template you are creating.
     * 
     * @param description
     *        Optional. A description of the job template you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to.
     * Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For
     * more information about this feature, see the AWS Elemental MediaConvert User Guide.
     * 
     * @return Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your
     *         job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue
     *         before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
     */

    public java.util.List<HopDestination> getHopDestinations() {
        return hopDestinations;
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to.
     * Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For
     * more information about this feature, see the AWS Elemental MediaConvert User Guide.
     * 
     * @param hopDestinations
     *        Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your
     *        job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue
     *        before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
     */

    public void setHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        if (hopDestinations == null) {
            this.hopDestinations = null;
            return;
        }

        this.hopDestinations = new java.util.ArrayList<HopDestination>(hopDestinations);
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to.
     * Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For
     * more information about this feature, see the AWS Elemental MediaConvert User Guide.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHopDestinations(java.util.Collection)} or {@link #withHopDestinations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param hopDestinations
     *        Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your
     *        job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue
     *        before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withHopDestinations(HopDestination... hopDestinations) {
        if (this.hopDestinations == null) {
            setHopDestinations(new java.util.ArrayList<HopDestination>(hopDestinations.length));
        }
        for (HopDestination ele : hopDestinations) {
            this.hopDestinations.add(ele);
        }
        return this;
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to.
     * Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For
     * more information about this feature, see the AWS Elemental MediaConvert User Guide.
     * 
     * @param hopDestinations
     *        Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your
     *        job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue
     *        before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        setHopDestinations(hopDestinations);
        return this;
    }

    /**
     * The name of the job template you are creating.
     * 
     * @param name
     *        The name of the job template you are creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the job template you are creating.
     * 
     * @return The name of the job template you are creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the job template you are creating.
     * 
     * @param name
     *        The name of the job template you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Specify the relative priority for this job. In any given queue, the service begins processing the job with the
     * highest value first. When more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * 
     * @param priority
     *        Specify the relative priority for this job. In any given queue, the service begins processing the job with
     *        the highest value first. When more than one job has the same priority, the service begins processing the
     *        job that you submitted first. If you don't specify a priority, the service uses the default value 0.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Specify the relative priority for this job. In any given queue, the service begins processing the job with the
     * highest value first. When more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * 
     * @return Specify the relative priority for this job. In any given queue, the service begins processing the job
     *         with the highest value first. When more than one job has the same priority, the service begins processing
     *         the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Specify the relative priority for this job. In any given queue, the service begins processing the job with the
     * highest value first. When more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * 
     * @param priority
     *        Specify the relative priority for this job. In any given queue, the service begins processing the job with
     *        the highest value first. When more than one job has the same priority, the service begins processing the
     *        job that you submitted first. If you don't specify a priority, the service uses the default value 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     * 
     * @param queue
     *        Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs
     *        will go to the default queue.
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     * 
     * @return Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs
     *         will go to the default queue.
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     * 
     * @param queue
     *        Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs
     *        will go to the default queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     * 
     * @param settings
     *        JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     *        created from it.
     */

    public void setSettings(JobTemplateSettings settings) {
        this.settings = settings;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     * 
     * @return JobTemplateSettings contains all the transcode settings saved in the template that will be applied to
     *         jobs created from it.
     */

    public JobTemplateSettings getSettings() {
        return this.settings;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     * 
     * @param settings
     *        JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     *        created from it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withSettings(JobTemplateSettings settings) {
        setSettings(settings);
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

    public CreateJobTemplateRequest withStatusUpdateInterval(String statusUpdateInterval) {
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

    public CreateJobTemplateRequest withStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
        return this;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @return The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *         key.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @param tags
     *        The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *        key.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @param tags
     *        The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateJobTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateJobTemplateRequest clearTagsEntries() {
        this.tags = null;
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHopDestinations() != null)
            sb.append("HopDestinations: ").append(getHopDestinations()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: ").append(getStatusUpdateInterval()).append(",");
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

        if (obj instanceof CreateJobTemplateRequest == false)
            return false;
        CreateJobTemplateRequest other = (CreateJobTemplateRequest) obj;
        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHopDestinations() == null ^ this.getHopDestinations() == null)
            return false;
        if (other.getHopDestinations() != null && other.getHopDestinations().equals(this.getHopDestinations()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getStatusUpdateInterval() == null ^ this.getStatusUpdateInterval() == null)
            return false;
        if (other.getStatusUpdateInterval() != null && other.getStatusUpdateInterval().equals(this.getStatusUpdateInterval()) == false)
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

        hashCode = prime * hashCode + ((getAccelerationSettings() == null) ? 0 : getAccelerationSettings().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHopDestinations() == null) ? 0 : getHopDestinations().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobTemplateRequest clone() {
        return (CreateJobTemplateRequest) super.clone();
    }

}
