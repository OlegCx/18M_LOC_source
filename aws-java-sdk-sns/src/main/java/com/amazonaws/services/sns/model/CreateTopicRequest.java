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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for CreateTopic action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreateTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html">server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms">Key Terms</a>. For
     * more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html">FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to <code>false</code>. If you create a FIFO topic and
     * this attribute is <code>false</code>, you must specify a value for the <code>MessageDeduplicationId</code>
     * parameter for the <a href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>, Amazon SNS uses a SHA-256 hash to
     * generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the
     * message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for the the
     * <code>MessageDeduplicationId</code> parameter for the <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     * <code>sns:TagResource</code> permissions.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateTopicRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateTopicRequest() {
    }

    /**
     * Constructs a new CreateTopicRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     *        </p>
     *        <p>
     *        For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     */
    public CreateTopicRequest(String name) {
        setName(name);
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     * </p>
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     *        </p>
     *        <p>
     *        For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     * </p>
     * 
     * @return The name of the topic you want to create.</p>
     *         <p>
     *         Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *         underscores, and hyphens, and must be between 1 and 256 characters long.
     *         </p>
     *         <p>
     *         For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * <p>
     * For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     * </p>
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     *        </p>
     *        <p>
     *        For a FIFO (first-in-first-out) topic, the name must end with the <code>.fifo</code> suffix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html">server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms">Key Terms</a>. For
     * more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html">FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to <code>false</code>. If you create a FIFO topic and
     * this attribute is <code>false</code>, you must specify a value for the <code>MessageDeduplicationId</code>
     * parameter for the <a href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>, Amazon SNS uses a SHA-256 hash to
     * generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the
     * message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for the the
     * <code>MessageDeduplicationId</code> parameter for the <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return A map of attributes with their corresponding values.</p>
     *         <p>
     *         The following lists the names, descriptions, and values of the special request parameters that the
     *         <code>CreateTopic</code> action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *         endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FifoTopic</code> – Set to true to create a FIFO topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner
     *         can publish or subscribe to the topic.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attribute applies only to <a
     *         href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *         >server-side-encryption</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a
     *         custom CMK. For more information, see <a
     *         href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms">Key
     *         Terms</a>. For more examples, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *         >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a
     *         href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html">FIFO topics</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO topic is created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> – Enables content-based deduplication for FIFO topics.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         By default, <code>ContentBasedDeduplication</code> is set to <code>false</code>. If you create a FIFO
     *         topic and this attribute is <code>false</code>, you must specify a value for the
     *         <code>MessageDeduplicationId</code> parameter for the <a
     *         href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a> action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you set <code>ContentBasedDeduplication</code> to <code>true</code>, Amazon SNS uses a SHA-256 hash
     *         to generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes
     *         of the message).
     *         </p>
     *         <p>
     *         (Optional) To override the generated value, you can specify a value for the the
     *         <code>MessageDeduplicationId</code> parameter for the <code>Publish</code> action.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html">server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms">Key Terms</a>. For
     * more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html">FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to <code>false</code>. If you create a FIFO topic and
     * this attribute is <code>false</code>, you must specify a value for the <code>MessageDeduplicationId</code>
     * parameter for the <a href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>, Amazon SNS uses a SHA-256 hash to
     * generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the
     * message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for the the
     * <code>MessageDeduplicationId</code> parameter for the <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>CreateTopic</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *        endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoTopic</code> – Set to true to create a FIFO topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner
     *        can publish or subscribe to the topic.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute applies only to <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a
     *        custom CMK. For more information, see <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms">Key
     *        Terms</a>. For more examples, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *        >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html">FIFO topics</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO topic is created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Enables content-based deduplication for FIFO topics.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, <code>ContentBasedDeduplication</code> is set to <code>false</code>. If you create a FIFO
     *        topic and this attribute is <code>false</code>, you must specify a value for the
     *        <code>MessageDeduplicationId</code> parameter for the <a
     *        href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you set <code>ContentBasedDeduplication</code> to <code>true</code>, Amazon SNS uses a SHA-256 hash
     *        to generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes
     *        of the message).
     *        </p>
     *        <p>
     *        (Optional) To override the generated value, you can specify a value for the the
     *        <code>MessageDeduplicationId</code> parameter for the <code>Publish</code> action.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoTopic</code> – Set to true to create a FIFO topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html">server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms">Key Terms</a>. For
     * more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html">FIFO topics</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO topic is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication for FIFO topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, <code>ContentBasedDeduplication</code> is set to <code>false</code>. If you create a FIFO topic and
     * this attribute is <code>false</code>, you must specify a value for the <code>MessageDeduplicationId</code>
     * parameter for the <a href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>ContentBasedDeduplication</code> to <code>true</code>, Amazon SNS uses a SHA-256 hash to
     * generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the
     * message).
     * </p>
     * <p>
     * (Optional) To override the generated value, you can specify a value for the the
     * <code>MessageDeduplicationId</code> parameter for the <code>Publish</code> action.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>CreateTopic</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *        endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoTopic</code> – Set to true to create a FIFO topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner
     *        can publish or subscribe to the topic.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute applies only to <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a
     *        custom CMK. For more information, see <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms">Key
     *        Terms</a>. For more examples, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *        >KeyId</a> in the <i>AWS Key Management Service API Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html">FIFO topics</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoTopic</code> – When this is set to <code>true</code>, a FIFO topic is created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Enables content-based deduplication for FIFO topics.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, <code>ContentBasedDeduplication</code> is set to <code>false</code>. If you create a FIFO
     *        topic and this attribute is <code>false</code>, you must specify a value for the
     *        <code>MessageDeduplicationId</code> parameter for the <a
     *        href="https://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you set <code>ContentBasedDeduplication</code> to <code>true</code>, Amazon SNS uses a SHA-256 hash
     *        to generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes
     *        of the message).
     *        </p>
     *        <p>
     *        (Optional) To override the generated value, you can specify a value for the the
     *        <code>MessageDeduplicationId</code> parameter for the <code>Publish</code> action.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see CreateTopicRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     * <code>sns:TagResource</code> permissions.
     * </p>
     * </note>
     * 
     * @return The list of tags to add to a new topic.</p> <note>
     *         <p>
     *         To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     *         <code>sns:TagResource</code> permissions.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     * <code>sns:TagResource</code> permissions.
     * </p>
     * </note>
     * 
     * @param tags
     *        The list of tags to add to a new topic.</p> <note>
     *        <p>
     *        To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     *        <code>sns:TagResource</code> permissions.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     * <code>sns:TagResource</code> permissions.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags to add to a new topic.</p> <note>
     *        <p>
     *        To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     *        <code>sns:TagResource</code> permissions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags to add to a new topic.
     * </p>
     * <note>
     * <p>
     * To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     * <code>sns:TagResource</code> permissions.
     * </p>
     * </note>
     * 
     * @param tags
     *        The list of tags to add to a new topic.</p> <note>
     *        <p>
     *        To be able to tag a topic on creation, you must have the <code>sns:CreateTopic</code> and
     *        <code>sns:TagResource</code> permissions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
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

        if (obj instanceof CreateTopicRequest == false)
            return false;
        CreateTopicRequest other = (CreateTopicRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTopicRequest clone() {
        return (CreateTopicRequest) super.clone();
    }

}
