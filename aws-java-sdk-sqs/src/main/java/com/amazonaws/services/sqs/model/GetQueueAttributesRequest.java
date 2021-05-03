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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/GetQueueAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueueAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attribute information is retrieved.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <important>
     * <p>
     * The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>, and
     * <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1 minute after
     * the producers stop sending messages. This period is required for the queue metadata to reach eventual
     * consistency.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for retrieval
     * from the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue that
     * are delayed and not available for reading immediately. This can happen when the queue is configured as a delay
     * queue or when a message has been sent with a delay parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are in
     * flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not yet been
     * deleted or have not yet reached the end of their visibility window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon SQS
     * rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains a
     * message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     * <code>ReceiveMessage</code> action waits for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about the
     * visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To determine whether a queue is <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you
     * can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the queue.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Preview: High throughput for FIFO queues</b>
     * </p>
     * <p>
     * <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This feature
     * provides a high number of transactions per second (TPS) for messages in FIFO queues. For information on
     * throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * This preview includes two new attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, standard
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * This preview is available in the following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (Ohio); us-east-2
     * </p>
     * </li>
     * <li>
     * <p>
     * US East (N. Virginia); us-east-1
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon); us-west-2
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland); eu-west-1
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about high throughput for FIFO queues, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     * >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;

    /**
     * Default constructor for GetQueueAttributesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public GetQueueAttributesRequest() {
    }

    /**
     * Constructs a new GetQueueAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue whose attribute information is retrieved.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */
    public GetQueueAttributesRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new GetQueueAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue whose attribute information is retrieved.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @param attributeNames
     *        A list of attributes for which to retrieve information.
     *        </p>
     *        <note>
     *        <p>
     *        In the future, new attributes might be added. If you write code that calls this action, we recommend that
     *        you structure your code so that it can handle new attributes gracefully.
     *        </p>
     *        </note>
     *        <p>
     *        The following attributes are supported:
     *        </p>
     *        <important>
     *        <p>
     *        The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     *        and <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1
     *        minute after the producers stop sending messages. This period is required for the queue metadata to reach
     *        eventual consistency.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> – Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for
     *        retrieval from the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue
     *        that are delayed and not available for reading immediately. This can happen when the queue is configured
     *        as a delay queue or when a message has been sent with a delay parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are
     *        in flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not
     *        yet been deleted or have not yet reached the end of their visibility window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon
     *        SQS rejects it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains
     *        a message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – Returns the policy of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     *        <code>ReceiveMessage</code> action waits for a message to arrive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *        functionality of the source queue as a JSON object. For more information about the redrive policy and
     *        dead-letter queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     *        SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being
     *        moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *        <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about
     *        the visibility timeout, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or
     *        a custom CMK. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *        >Key Terms</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS
     *        can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *        >How Does the Data Key Reuse Period Work?</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *        >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        To determine whether a queue is <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *        >FIFO</a>, you can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the
     *        queue. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Preview: High throughput for FIFO queues</b>
     *        </p>
     *        <p>
     *        <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This
     *        feature provides a high number of transactions per second (TPS) for messages in FIFO queues. For
     *        information on throughput quotas, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *        >Quotas related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This preview includes two new attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *        queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire
     *        queue or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     *        <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     *        <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable high throughput for FIFO queues, do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set these attributes to anything other than the values shown for enabling high throughput, standard
     *        throughput is in effect and deduplication occurs as specified.
     *        </p>
     *        <p>
     *        This preview is available in the following AWS Regions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (Ohio); us-east-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US East (N. Virginia); us-east-1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon); us-west-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland); eu-west-1
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about high throughput for FIFO queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *        >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */
    public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) {
        setQueueUrl(queueUrl);
        setAttributeNames(attributeNames);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attribute information is retrieved.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue whose attribute information is retrieved.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attribute information is retrieved.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue whose attribute information is retrieved.</p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attribute information is retrieved.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue whose attribute information is retrieved.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueAttributesRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <important>
     * <p>
     * The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>, and
     * <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1 minute after
     * the producers stop sending messages. This period is required for the queue metadata to reach eventual
     * consistency.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for retrieval
     * from the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue that
     * are delayed and not available for reading immediately. This can happen when the queue is configured as a delay
     * queue or when a message has been sent with a delay parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are in
     * flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not yet been
     * deleted or have not yet reached the end of their visibility window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon SQS
     * rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains a
     * message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     * <code>ReceiveMessage</code> action waits for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about the
     * visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To determine whether a queue is <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you
     * can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the queue.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Preview: High throughput for FIFO queues</b>
     * </p>
     * <p>
     * <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This feature
     * provides a high number of transactions per second (TPS) for messages in FIFO queues. For information on
     * throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * This preview includes two new attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, standard
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * This preview is available in the following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (Ohio); us-east-2
     * </p>
     * </li>
     * <li>
     * <p>
     * US East (N. Virginia); us-east-1
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon); us-west-2
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland); eu-west-1
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about high throughput for FIFO queues, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     * >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of attributes for which to retrieve information.</p> <note>
     *         <p>
     *         In the future, new attributes might be added. If you write code that calls this action, we recommend that
     *         you structure your code so that it can handle new attributes gracefully.
     *         </p>
     *         </note>
     *         <p>
     *         The following attributes are supported:
     *         </p>
     *         <important>
     *         <p>
     *         The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     *         and <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1
     *         minute after the producers stop sending messages. This period is required for the queue metadata to reach
     *         eventual consistency.
     *         </p>
     *         </important>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>All</code> – Returns all values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for
     *         retrieval from the queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue
     *         that are delayed and not available for reading immediately. This can happen when the queue is configured
     *         as a delay queue or when a message has been sent with a delay parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are
     *         in flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not
     *         yet been deleted or have not yet reached the end of their visibility window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon
     *         SQS rejects it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS
     *         retains a message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> – Returns the policy of the queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     *         <code>ReceiveMessage</code> action waits for a message to arrive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *         functionality of the source queue as a JSON object. For more information about the redrive policy and
     *         dead-letter queues, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *         >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which
     *         Amazon SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before
     *         being moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *         <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about
     *         the visibility timeout, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *         >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *         >server-side-encryption</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS
     *         or a custom CMK. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *         >Key Terms</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS
     *         can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *         >How Does the Data Key Reuse Period Work?</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a
     *         href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *         (first-in-first-out) queues</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *         >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         To determine whether a queue is <a
     *         href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *         >FIFO</a>, you can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the
     *         queue. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *         >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Preview: High throughput for FIFO queues</b>
     *         </p>
     *         <p>
     *         <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This
     *         feature provides a high number of transactions per second (TPS) for messages in FIFO queues. For
     *         information on throughput quotas, see <a
     *         href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *         >Quotas related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         This preview includes two new attributes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *         queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the
     *         entire queue or per message group. Valid values are <code>perQueue</code> and
     *         <code>perMessageGroupId</code>. The <code>perMessageGroupId</code> value is allowed only when the value
     *         for <code>DeduplicationScope</code> is <code>messageGroup</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To enable high throughput for FIFO queues, do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you set these attributes to anything other than the values shown for enabling high throughput,
     *         standard throughput is in effect and deduplication occurs as specified.
     *         </p>
     *         <p>
     *         This preview is available in the following AWS Regions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (Ohio); us-east-2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US East (N. Virginia); us-east-1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon); us-west-2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Ireland); eu-west-1
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about high throughput for FIFO queues, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *         >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @see QueueAttributeName
     */

    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeNames;
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <important>
     * <p>
     * The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>, and
     * <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1 minute after
     * the producers stop sending messages. This period is required for the queue metadata to reach eventual
     * consistency.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for retrieval
     * from the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue that
     * are delayed and not available for reading immediately. This can happen when the queue is configured as a delay
     * queue or when a message has been sent with a delay parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are in
     * flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not yet been
     * deleted or have not yet reached the end of their visibility window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon SQS
     * rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains a
     * message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     * <code>ReceiveMessage</code> action waits for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about the
     * visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To determine whether a queue is <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you
     * can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the queue.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Preview: High throughput for FIFO queues</b>
     * </p>
     * <p>
     * <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This feature
     * provides a high number of transactions per second (TPS) for messages in FIFO queues. For information on
     * throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * This preview includes two new attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, standard
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * This preview is available in the following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (Ohio); us-east-2
     * </p>
     * </li>
     * <li>
     * <p>
     * US East (N. Virginia); us-east-1
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon); us-west-2
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland); eu-west-1
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about high throughput for FIFO queues, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     * >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes for which to retrieve information.</p> <note>
     *        <p>
     *        In the future, new attributes might be added. If you write code that calls this action, we recommend that
     *        you structure your code so that it can handle new attributes gracefully.
     *        </p>
     *        </note>
     *        <p>
     *        The following attributes are supported:
     *        </p>
     *        <important>
     *        <p>
     *        The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     *        and <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1
     *        minute after the producers stop sending messages. This period is required for the queue metadata to reach
     *        eventual consistency.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> – Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for
     *        retrieval from the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue
     *        that are delayed and not available for reading immediately. This can happen when the queue is configured
     *        as a delay queue or when a message has been sent with a delay parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are
     *        in flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not
     *        yet been deleted or have not yet reached the end of their visibility window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon
     *        SQS rejects it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains
     *        a message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – Returns the policy of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     *        <code>ReceiveMessage</code> action waits for a message to arrive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *        functionality of the source queue as a JSON object. For more information about the redrive policy and
     *        dead-letter queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     *        SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being
     *        moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *        <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about
     *        the visibility timeout, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or
     *        a custom CMK. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *        >Key Terms</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS
     *        can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *        >How Does the Data Key Reuse Period Work?</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *        >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        To determine whether a queue is <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *        >FIFO</a>, you can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the
     *        queue. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Preview: High throughput for FIFO queues</b>
     *        </p>
     *        <p>
     *        <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This
     *        feature provides a high number of transactions per second (TPS) for messages in FIFO queues. For
     *        information on throughput quotas, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *        >Quotas related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This preview includes two new attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *        queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire
     *        queue or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     *        <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     *        <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable high throughput for FIFO queues, do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set these attributes to anything other than the values shown for enabling high throughput, standard
     *        throughput is in effect and deduplication occurs as specified.
     *        </p>
     *        <p>
     *        This preview is available in the following AWS Regions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (Ohio); us-east-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US East (N. Virginia); us-east-1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon); us-west-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland); eu-west-1
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about high throughput for FIFO queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *        >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @see QueueAttributeName
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new com.amazonaws.internal.SdkInternalList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <important>
     * <p>
     * The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>, and
     * <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1 minute after
     * the producers stop sending messages. This period is required for the queue metadata to reach eventual
     * consistency.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for retrieval
     * from the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue that
     * are delayed and not available for reading immediately. This can happen when the queue is configured as a delay
     * queue or when a message has been sent with a delay parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are in
     * flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not yet been
     * deleted or have not yet reached the end of their visibility window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon SQS
     * rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains a
     * message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     * <code>ReceiveMessage</code> action waits for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about the
     * visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To determine whether a queue is <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you
     * can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the queue.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Preview: High throughput for FIFO queues</b>
     * </p>
     * <p>
     * <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This feature
     * provides a high number of transactions per second (TPS) for messages in FIFO queues. For information on
     * throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * This preview includes two new attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, standard
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * This preview is available in the following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (Ohio); us-east-2
     * </p>
     * </li>
     * <li>
     * <p>
     * US East (N. Virginia); us-east-1
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon); us-west-2
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland); eu-west-1
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about high throughput for FIFO queues, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     * >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes for which to retrieve information.</p> <note>
     *        <p>
     *        In the future, new attributes might be added. If you write code that calls this action, we recommend that
     *        you structure your code so that it can handle new attributes gracefully.
     *        </p>
     *        </note>
     *        <p>
     *        The following attributes are supported:
     *        </p>
     *        <important>
     *        <p>
     *        The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     *        and <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1
     *        minute after the producers stop sending messages. This period is required for the queue metadata to reach
     *        eventual consistency.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> – Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for
     *        retrieval from the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue
     *        that are delayed and not available for reading immediately. This can happen when the queue is configured
     *        as a delay queue or when a message has been sent with a delay parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are
     *        in flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not
     *        yet been deleted or have not yet reached the end of their visibility window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon
     *        SQS rejects it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains
     *        a message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – Returns the policy of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     *        <code>ReceiveMessage</code> action waits for a message to arrive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *        functionality of the source queue as a JSON object. For more information about the redrive policy and
     *        dead-letter queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     *        SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being
     *        moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *        <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about
     *        the visibility timeout, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or
     *        a custom CMK. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *        >Key Terms</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS
     *        can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *        >How Does the Data Key Reuse Period Work?</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *        >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        To determine whether a queue is <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *        >FIFO</a>, you can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the
     *        queue. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Preview: High throughput for FIFO queues</b>
     *        </p>
     *        <p>
     *        <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This
     *        feature provides a high number of transactions per second (TPS) for messages in FIFO queues. For
     *        information on throughput quotas, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *        >Quotas related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This preview includes two new attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *        queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire
     *        queue or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     *        <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     *        <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable high throughput for FIFO queues, do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set these attributes to anything other than the values shown for enabling high throughput, standard
     *        throughput is in effect and deduplication occurs as specified.
     *        </p>
     *        <p>
     *        This preview is available in the following AWS Regions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (Ohio); us-east-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US East (N. Virginia); us-east-1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon); us-west-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland); eu-west-1
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about high throughput for FIFO queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *        >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public GetQueueAttributesRequest withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <important>
     * <p>
     * The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>, and
     * <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1 minute after
     * the producers stop sending messages. This period is required for the queue metadata to reach eventual
     * consistency.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for retrieval
     * from the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue that
     * are delayed and not available for reading immediately. This can happen when the queue is configured as a delay
     * queue or when a message has been sent with a delay parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are in
     * flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not yet been
     * deleted or have not yet reached the end of their visibility window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon SQS
     * rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains a
     * message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     * <code>ReceiveMessage</code> action waits for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about the
     * visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To determine whether a queue is <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you
     * can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the queue.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Preview: High throughput for FIFO queues</b>
     * </p>
     * <p>
     * <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This feature
     * provides a high number of transactions per second (TPS) for messages in FIFO queues. For information on
     * throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * This preview includes two new attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, standard
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * This preview is available in the following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (Ohio); us-east-2
     * </p>
     * </li>
     * <li>
     * <p>
     * US East (N. Virginia); us-east-1
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon); us-west-2
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland); eu-west-1
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about high throughput for FIFO queues, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     * >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes for which to retrieve information.</p> <note>
     *        <p>
     *        In the future, new attributes might be added. If you write code that calls this action, we recommend that
     *        you structure your code so that it can handle new attributes gracefully.
     *        </p>
     *        </note>
     *        <p>
     *        The following attributes are supported:
     *        </p>
     *        <important>
     *        <p>
     *        The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     *        and <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1
     *        minute after the producers stop sending messages. This period is required for the queue metadata to reach
     *        eventual consistency.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> – Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for
     *        retrieval from the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue
     *        that are delayed and not available for reading immediately. This can happen when the queue is configured
     *        as a delay queue or when a message has been sent with a delay parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are
     *        in flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not
     *        yet been deleted or have not yet reached the end of their visibility window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon
     *        SQS rejects it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains
     *        a message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – Returns the policy of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     *        <code>ReceiveMessage</code> action waits for a message to arrive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *        functionality of the source queue as a JSON object. For more information about the redrive policy and
     *        dead-letter queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     *        SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being
     *        moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *        <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about
     *        the visibility timeout, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or
     *        a custom CMK. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *        >Key Terms</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS
     *        can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *        >How Does the Data Key Reuse Period Work?</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *        >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        To determine whether a queue is <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *        >FIFO</a>, you can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the
     *        queue. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Preview: High throughput for FIFO queues</b>
     *        </p>
     *        <p>
     *        <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This
     *        feature provides a high number of transactions per second (TPS) for messages in FIFO queues. For
     *        information on throughput quotas, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *        >Quotas related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This preview includes two new attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *        queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire
     *        queue or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     *        <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     *        <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable high throughput for FIFO queues, do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set these attributes to anything other than the values shown for enabling high throughput, standard
     *        throughput is in effect and deduplication occurs as specified.
     *        </p>
     *        <p>
     *        This preview is available in the following AWS Regions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (Ohio); us-east-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US East (N. Virginia); us-east-1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon); us-west-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland); eu-west-1
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about high throughput for FIFO queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *        >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public GetQueueAttributesRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * A list of attributes for which to retrieve information.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * <p>
     * The following attributes are supported:
     * </p>
     * <important>
     * <p>
     * The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>, and
     * <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1 minute after
     * the producers stop sending messages. This period is required for the queue metadata to reach eventual
     * consistency.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> – Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for retrieval
     * from the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue that
     * are delayed and not available for reading immediately. This can happen when the queue is configured as a delay
     * queue or when a message has been sent with a delay parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are in
     * flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not yet been
     * deleted or have not yet reached the end of their visibility window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon SQS
     * rejects it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains a
     * message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – Returns the policy of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     * <code>ReceiveMessage</code> action waits for a message to arrive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about the
     * visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     * >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To determine whether a queue is <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you
     * can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the queue.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Preview: High throughput for FIFO queues</b>
     * </p>
     * <p>
     * <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This feature
     * provides a high number of transactions per second (TPS) for messages in FIFO queues. For information on
     * throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * This preview includes two new attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, standard
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * This preview is available in the following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (Ohio); us-east-2
     * </p>
     * </li>
     * <li>
     * <p>
     * US East (N. Virginia); us-east-1
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon); us-west-2
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland); eu-west-1
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about high throughput for FIFO queues, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     * >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes for which to retrieve information.</p> <note>
     *        <p>
     *        In the future, new attributes might be added. If you write code that calls this action, we recommend that
     *        you structure your code so that it can handle new attributes gracefully.
     *        </p>
     *        </note>
     *        <p>
     *        The following attributes are supported:
     *        </p>
     *        <important>
     *        <p>
     *        The <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     *        and <code>ApproximateNumberOfMessagesVisible</code> metrics may not achieve consistency until at least 1
     *        minute after the producers stop sending messages. This period is required for the queue metadata to reach
     *        eventual consistency.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> – Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code> – Returns the approximate number of messages available for
     *        retrieval from the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code> – Returns the approximate number of messages in the queue
     *        that are delayed and not available for reading immediately. This can happen when the queue is configured
     *        as a delay queue or when a message has been sent with a delay parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code> – Returns the approximate number of messages that are
     *        in flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not
     *        yet been deleted or have not yet reached the end of their visibility window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code> – Returns the time when the queue was created in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> – Returns the default delay on the queue in seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code> – Returns the time when the queue was last changed in seconds (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> – Returns the limit of how many bytes a message can contain before Amazon
     *        SQS rejects it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> – Returns the length of time, in seconds, for which Amazon SQS retains
     *        a message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – Returns the policy of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code> – Returns the Amazon resource name (ARN) of the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> – Returns the length of time, in seconds, for which the
     *        <code>ReceiveMessage</code> action waits for a message to arrive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *        functionality of the source queue as a JSON object. For more information about the redrive policy and
     *        dead-letter queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     *        SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being
     *        moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *        <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> – Returns the visibility timeout for the queue. For more information about
     *        the visibility timeout, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or
     *        a custom CMK. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *        >Key Terms</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsDataKeyReusePeriodSeconds</code> – Returns the length of time, in seconds, for which Amazon SQS
     *        can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *        >How Does the Data Key Reuse Period Work?</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoQueue</code> – Returns information about whether the queue is FIFO. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *        >FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        To determine whether a queue is <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *        >FIFO</a>, you can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Returns whether content-based deduplication is enabled for the
     *        queue. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Preview: High throughput for FIFO queues</b>
     *        </p>
     *        <p>
     *        <b>High throughput for Amazon SQS FIFO queues is in preview release and is subject to change.</b> This
     *        feature provides a high number of transactions per second (TPS) for messages in FIFO queues. For
     *        information on throughput quotas, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *        >Quotas related to messages</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This preview includes two new attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *        queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire
     *        queue or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     *        <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     *        <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable high throughput for FIFO queues, do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set these attributes to anything other than the values shown for enabling high throughput, standard
     *        throughput is in effect and deduplication occurs as specified.
     *        </p>
     *        <p>
     *        This preview is available in the following AWS Regions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (Ohio); us-east-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US East (N. Virginia); us-east-1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon); us-west-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland); eu-west-1
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about high throughput for FIFO queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *        >Preview: High throughput for FIFO queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public GetQueueAttributesRequest withAttributeNames(QueueAttributeName... attributeNames) {
        com.amazonaws.internal.SdkInternalList<String> attributeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length);
        for (QueueAttributeName value : attributeNames) {
            attributeNamesCopy.add(value.toString());
        }
        if (getAttributeNames() == null) {
            setAttributeNames(attributeNamesCopy);
        } else {
            getAttributeNames().addAll(attributeNamesCopy);
        }
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueAttributesRequest == false)
            return false;
        GetQueueAttributesRequest other = (GetQueueAttributesRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public GetQueueAttributesRequest clone() {
        return (GetQueueAttributesRequest) super.clone();
    }

}
