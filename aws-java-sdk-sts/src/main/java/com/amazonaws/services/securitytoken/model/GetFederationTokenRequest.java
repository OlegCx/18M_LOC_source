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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetFederationToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFederationTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     */
    private String name;
    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     */
    private String policy;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy.
     * The policies must exist in the same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies. The plaintext that you use for both inline
     * and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For
     * more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     */
    private java.util.List<PolicyDescriptorType> policyArns;
    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using root user credentials defaults to one
     * hour.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an associated value. For more information
     * about session tags, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing
     * Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128
     * characters and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the user you are federating.
     * When you do, session tags override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * Default constructor for GetFederationTokenRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public GetFederationTokenRequest() {
    }

    /**
     * Constructs a new GetFederationTokenRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param name
     *        The name of the federated user. The name is used as an identifier for the temporary security credentials
     *        (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *        policy, such as in an Amazon S3 bucket policy.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     */
    public GetFederationTokenRequest(String name) {
        setName(name);
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param name
     *        The name of the federated user. The name is used as an identifier for the temporary security credentials
     *        (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *        policy, such as in an Amazon S3 bucket policy.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @return The name of the federated user. The name is used as an identifier for the temporary security credentials
     *         (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *         policy, such as in an Amazon S3 bucket policy.</p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@-
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as
     * <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in
     * an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param name
     *        The name of the federated user. The name is used as an identifier for the temporary security credentials
     *        (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based
     *        policy, such as in an Amazon S3 bucket policy.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format that you want to use as an inline session policy.</p>
     *        <p>
     *        You must pass an inline or managed <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     *        policy</a> to this operation. You can pass a single JSON policy document to use as an inline session
     *        policy. You can also specify up to 10 managed policies to use as managed session policies.
     *        </p>
     *        <p>
     *        This parameter is optional. However, if you do not pass any session policies, then the resulting federated
     *        user session has no permissions.
     *        </p>
     *        <p>
     *        When you pass session policies, the session permissions are the intersection of the IAM user policies and
     *        the session policies that you pass. This gives you a way to further restrict the permissions for a
     *        federated user. You cannot use session policies to grant more permissions than those that are defined in
     *        the permissions policy of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The resulting credentials can be used to access a resource that has a resource-based policy. If that
     *        policy specifically references the federated user session in the <code>Principal</code> element of the
     *        policy, the session has the permissions allowed by the policy. These permissions are granted in addition
     *        to the permissions that are granted by the session policies.
     *        </p>
     *        <p>
     *        The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The
     *        JSON policy characters can be any ASCII character from the space character to the end of the valid
     *        character list ( through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @return An IAM policy in JSON format that you want to use as an inline session policy.</p>
     *         <p>
     *         You must pass an inline or managed <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     *         policy</a> to this operation. You can pass a single JSON policy document to use as an inline session
     *         policy. You can also specify up to 10 managed policies to use as managed session policies.
     *         </p>
     *         <p>
     *         This parameter is optional. However, if you do not pass any session policies, then the resulting
     *         federated user session has no permissions.
     *         </p>
     *         <p>
     *         When you pass session policies, the session permissions are the intersection of the IAM user policies and
     *         the session policies that you pass. This gives you a way to further restrict the permissions for a
     *         federated user. You cannot use session policies to grant more permissions than those that are defined in
     *         the permissions policy of the IAM user. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *         Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The resulting credentials can be used to access a resource that has a resource-based policy. If that
     *         policy specifically references the federated user session in the <code>Principal</code> element of the
     *         policy, the session has the permissions allowed by the policy. These permissions are granted in addition
     *         to the permissions that are granted by the session policies.
     *         </p>
     *         <p>
     *         The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters.
     *         The JSON policy characters can be any ASCII character from the space character to the end of the valid
     *         character list ( through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         An AWS conversion compresses the passed session policies and session tags into a packed binary format
     *         that has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *         requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *         policies and tags for your request are to the upper size limit.
     *         </p>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format that you want to use as an inline session policy.</p>
     *        <p>
     *        You must pass an inline or managed <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     *        policy</a> to this operation. You can pass a single JSON policy document to use as an inline session
     *        policy. You can also specify up to 10 managed policies to use as managed session policies.
     *        </p>
     *        <p>
     *        This parameter is optional. However, if you do not pass any session policies, then the resulting federated
     *        user session has no permissions.
     *        </p>
     *        <p>
     *        When you pass session policies, the session permissions are the intersection of the IAM user policies and
     *        the session policies that you pass. This gives you a way to further restrict the permissions for a
     *        federated user. You cannot use session policies to grant more permissions than those that are defined in
     *        the permissions policy of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The resulting credentials can be used to access a resource that has a resource-based policy. If that
     *        policy specifically references the federated user session in the <code>Principal</code> element of the
     *        policy, the session has the permissions allowed by the policy. These permissions are granted in addition
     *        to the permissions that are granted by the session policies.
     *        </p>
     *        <p>
     *        The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The
     *        JSON policy characters can be any ASCII character from the space character to the end of the valid
     *        character list ( through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy.
     * The policies must exist in the same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies. The plaintext that you use for both inline
     * and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For
     * more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session
     *         policy. The policies must exist in the same account as the IAM user that is requesting federated
     *         access.</p>
     *         <p>
     *         You must pass an inline or managed <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     *         policy</a> to this operation. You can pass a single JSON policy document to use as an inline session
     *         policy. You can also specify up to 10 managed policies to use as managed session policies. The plaintext
     *         that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide
     *         up to 10 managed policy ARNs. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *         </p>
     *         <p>
     *         This parameter is optional. However, if you do not pass any session policies, then the resulting
     *         federated user session has no permissions.
     *         </p>
     *         <p>
     *         When you pass session policies, the session permissions are the intersection of the IAM user policies and
     *         the session policies that you pass. This gives you a way to further restrict the permissions for a
     *         federated user. You cannot use session policies to grant more permissions than those that are defined in
     *         the permissions policy of the IAM user. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *         Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The resulting credentials can be used to access a resource that has a resource-based policy. If that
     *         policy specifically references the federated user session in the <code>Principal</code> element of the
     *         policy, the session has the permissions allowed by the policy. These permissions are granted in addition
     *         to the permissions that are granted by the session policies.
     *         </p>
     *         <note>
     *         <p>
     *         An AWS conversion compresses the passed session policies and session tags into a packed binary format
     *         that has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *         requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *         policies and tags for your request are to the upper size limit.
     *         </p>
     */

    public java.util.List<PolicyDescriptorType> getPolicyArns() {
        return policyArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy.
     * The policies must exist in the same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies. The plaintext that you use for both inline
     * and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For
     * more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session
     *        policy. The policies must exist in the same account as the IAM user that is requesting federated
     *        access.</p>
     *        <p>
     *        You must pass an inline or managed <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     *        policy</a> to this operation. You can pass a single JSON policy document to use as an inline session
     *        policy. You can also specify up to 10 managed policies to use as managed session policies. The plaintext
     *        that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide
     *        up to 10 managed policy ARNs. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *        </p>
     *        <p>
     *        This parameter is optional. However, if you do not pass any session policies, then the resulting federated
     *        user session has no permissions.
     *        </p>
     *        <p>
     *        When you pass session policies, the session permissions are the intersection of the IAM user policies and
     *        the session policies that you pass. This gives you a way to further restrict the permissions for a
     *        federated user. You cannot use session policies to grant more permissions than those that are defined in
     *        the permissions policy of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The resulting credentials can be used to access a resource that has a resource-based policy. If that
     *        policy specifically references the federated user session in the <code>Principal</code> element of the
     *        policy, the session has the permissions allowed by the policy. These permissions are granted in addition
     *        to the permissions that are granted by the session policies.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     */

    public void setPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        if (policyArns == null) {
            this.policyArns = null;
            return;
        }

        this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy.
     * The policies must exist in the same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies. The plaintext that you use for both inline
     * and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For
     * more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyArns(java.util.Collection)} or {@link #withPolicyArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session
     *        policy. The policies must exist in the same account as the IAM user that is requesting federated
     *        access.</p>
     *        <p>
     *        You must pass an inline or managed <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     *        policy</a> to this operation. You can pass a single JSON policy document to use as an inline session
     *        policy. You can also specify up to 10 managed policies to use as managed session policies. The plaintext
     *        that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide
     *        up to 10 managed policy ARNs. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *        </p>
     *        <p>
     *        This parameter is optional. However, if you do not pass any session policies, then the resulting federated
     *        user session has no permissions.
     *        </p>
     *        <p>
     *        When you pass session policies, the session permissions are the intersection of the IAM user policies and
     *        the session policies that you pass. This gives you a way to further restrict the permissions for a
     *        federated user. You cannot use session policies to grant more permissions than those that are defined in
     *        the permissions policy of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The resulting credentials can be used to access a resource that has a resource-based policy. If that
     *        policy specifically references the federated user session in the <code>Principal</code> element of the
     *        policy, the session has the permissions allowed by the policy. These permissions are granted in addition
     *        to the permissions that are granted by the session policies.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withPolicyArns(PolicyDescriptorType... policyArns) {
        if (this.policyArns == null) {
            setPolicyArns(new java.util.ArrayList<PolicyDescriptorType>(policyArns.length));
        }
        for (PolicyDescriptorType ele : policyArns) {
            this.policyArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy.
     * The policies must exist in the same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies. The plaintext that you use for both inline
     * and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For
     * more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user
     * session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the
     * session policies that you pass. This gives you a way to further restrict the permissions for a federated user.
     * You cannot use session policies to grant more permissions than those that are defined in the permissions policy
     * of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy
     * specifically references the federated user session in the <code>Principal</code> element of the policy, the
     * session has the permissions allowed by the policy. These permissions are granted in addition to the permissions
     * that are granted by the session policies.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session
     *        policy. The policies must exist in the same account as the IAM user that is requesting federated
     *        access.</p>
     *        <p>
     *        You must pass an inline or managed <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     *        policy</a> to this operation. You can pass a single JSON policy document to use as an inline session
     *        policy. You can also specify up to 10 managed policies to use as managed session policies. The plaintext
     *        that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide
     *        up to 10 managed policy ARNs. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *        </p>
     *        <p>
     *        This parameter is optional. However, if you do not pass any session policies, then the resulting federated
     *        user session has no permissions.
     *        </p>
     *        <p>
     *        When you pass session policies, the session permissions are the intersection of the IAM user policies and
     *        the session policies that you pass. This gives you a way to further restrict the permissions for a
     *        federated user. You cannot use session policies to grant more permissions than those that are defined in
     *        the permissions policy of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The resulting credentials can be used to access a resource that has a resource-based policy. If that
     *        policy specifically references the federated user session in the <code>Principal</code> element of the
     *        policy, the session has the permissions allowed by the policy. These permissions are granted in addition
     *        to the permissions that are granted by the session policies.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        setPolicyArns(policyArns);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using root user credentials defaults to one
     * hour.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, that the session should last. Acceptable durations for federation sessions range
     *        from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the
     *        default. Sessions obtained using AWS account root user credentials are restricted to a maximum of 3,600
     *        seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root
     *        user credentials defaults to one hour.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using root user credentials defaults to one
     * hour.
     * </p>
     * 
     * @return The duration, in seconds, that the session should last. Acceptable durations for federation sessions
     *         range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the
     *         default. Sessions obtained using AWS account root user credentials are restricted to a maximum of 3,600
     *         seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root
     *         user credentials defaults to one hour.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from
     * 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions
     * obtained using AWS account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the
     * specified duration is longer than one hour, the session obtained by using root user credentials defaults to one
     * hour.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, that the session should last. Acceptable durations for federation sessions range
     *        from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the
     *        default. Sessions obtained using AWS account root user credentials are restricted to a maximum of 3,600
     *        seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root
     *        user credentials defaults to one hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an associated value. For more information
     * about session tags, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing
     * Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128
     * characters and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the user you are federating.
     * When you do, session tags override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * 
     * @return A list of session tags. Each session tag consists of a key name and an associated value. For more
     *         information about session tags, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *         STS</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t
     *         exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *         >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         An AWS conversion compresses the passed session policies and session tags into a packed binary format
     *         that has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *         requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *         policies and tags for your request are to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         You can pass a session tag with the same key as a tag that is already attached to the user you are
     *         federating. When you do, session tags override a user tag with the same key.
     *         </p>
     *         <p>
     *         Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *         separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *         <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *         <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved
     *         as separate tags, and the session tag passed in the request takes precedence over the role tag.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an associated value. For more information
     * about session tags, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing
     * Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128
     * characters and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the user you are federating.
     * When you do, session tags override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * 
     * @param tags
     *        A list of session tags. Each session tag consists of a key name and an associated value. For more
     *        information about session tags, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *        STS</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t
     *        exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see <a
     *        href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *        >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        You can pass a session tag with the same key as a tag that is already attached to the user you are
     *        federating. When you do, session tags override a user tag with the same key.
     *        </p>
     *        <p>
     *        Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *        separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *        <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *        <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     *        separate tags, and the session tag passed in the request takes precedence over the role tag.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an associated value. For more information
     * about session tags, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing
     * Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128
     * characters and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the user you are federating.
     * When you do, session tags override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of session tags. Each session tag consists of a key name and an associated value. For more
     *        information about session tags, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *        STS</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t
     *        exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see <a
     *        href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *        >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        You can pass a session tag with the same key as a tag that is already attached to the user you are
     *        federating. When you do, session tags override a user tag with the same key.
     *        </p>
     *        <p>
     *        Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *        separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *        <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *        <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     *        separate tags, and the session tag passed in the request takes precedence over the role tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an associated value. For more information
     * about session tags, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing
     * Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128
     * characters and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the user you are federating.
     * When you do, session tags override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * 
     * @param tags
     *        A list of session tags. Each session tag consists of a key name and an associated value. For more
     *        information about session tags, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *        STS</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t
     *        exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see <a
     *        href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *        >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plaintext meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        You can pass a session tag with the same key as a tag that is already attached to the user you are
     *        federating. When you do, session tags override a user tag with the same key.
     *        </p>
     *        <p>
     *        Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *        separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *        <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *        <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     *        separate tags, and the session tag passed in the request takes precedence over the role tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getPolicyArns() != null)
            sb.append("PolicyArns: ").append(getPolicyArns()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
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

        if (obj instanceof GetFederationTokenRequest == false)
            return false;
        GetFederationTokenRequest other = (GetFederationTokenRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPolicyArns() == null ^ this.getPolicyArns() == null)
            return false;
        if (other.getPolicyArns() != null && other.getPolicyArns().equals(this.getPolicyArns()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
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
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyArns() == null) ? 0 : getPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetFederationTokenRequest clone() {
        return (GetFederationTokenRequest) super.clone();
    }

}
