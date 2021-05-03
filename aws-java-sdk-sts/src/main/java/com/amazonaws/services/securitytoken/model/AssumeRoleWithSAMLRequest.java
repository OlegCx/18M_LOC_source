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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRoleWithSAML" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleWithSAMLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a Relying
     * Party and Adding Claims</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String sAMLAssertion;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for
     * both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
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
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<PolicyDescriptorType> policyArns;
    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
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
     * The duration, in seconds, of the role session. Your role session lasts for the duration that you specify for the
     * <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication response's
     * <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a <code>DurationSeconds</code>
     * value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can
     * have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration
     * to 6 hours, your operation fails. To learn how to view the maximum value for your role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the caller is assuming.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that the caller is assuming.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a Relying
     * Party and Adding Claims</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param sAMLAssertion
     *        The base64 encoded SAML authentication response provided by the IdP.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a
     *        Relying Party and Adding Claims</a> in the <i>IAM User Guide</i>.
     */

    public void setSAMLAssertion(String sAMLAssertion) {
        this.sAMLAssertion = sAMLAssertion;
    }

    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a Relying
     * Party and Adding Claims</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The base64 encoded SAML authentication response provided by the IdP.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a
     *         Relying Party and Adding Claims</a> in the <i>IAM User Guide</i>.
     */

    public String getSAMLAssertion() {
        return this.sAMLAssertion;
    }

    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a Relying
     * Party and Adding Claims</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param sAMLAssertion
     *        The base64 encoded SAML authentication response provided by the IdP.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a
     *        Relying Party and Adding Claims</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLRequest withSAMLAssertion(String sAMLAssertion) {
        setSAMLAssertion(sAMLAssertion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for
     * both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
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
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *         policies. The policies must exist in the same account as the role.</p>
     *         <p>
     *         This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you
     *         use for both inline and managed session policies can't exceed 2,048 characters. For more information
     *         about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
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
     *         Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *         are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *         temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *         You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *         of the role that is being assumed. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *         Policies</a> in the <i>IAM User Guide</i>.
     */

    public java.util.List<PolicyDescriptorType> getPolicyArns() {
        return policyArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for
     * both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
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
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *        policies. The policies must exist in the same account as the role.</p>
     *        <p>
     *        This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you
     *        use for both inline and managed session policies can't exceed 2,048 characters. For more information about
     *        ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
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
     *        Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *        are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *        temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *        You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *        of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
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
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for
     * both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
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
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyArns(java.util.Collection)} or {@link #withPolicyArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *        policies. The policies must exist in the same account as the role.</p>
     *        <p>
     *        This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you
     *        use for both inline and managed session policies can't exceed 2,048 characters. For more information about
     *        ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
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
     *        Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *        are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *        temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *        You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *        of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLRequest withPolicyArns(PolicyDescriptorType... policyArns) {
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
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for
     * both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
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
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *        policies. The policies must exist in the same account as the role.</p>
     *        <p>
     *        This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you
     *        use for both inline and managed session policies can't exceed 2,048 characters. For more information about
     *        ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
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
     *        Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *        are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *        temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *        You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *        of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLRequest withPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        setPolicyArns(policyArns);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
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
     *        This parameter is optional. Passing policies to this operation returns new temporary credentials. The
     *        resulting session's permissions are the intersection of the role's identity-based policy and the session
     *        policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in
     *        the account that owns the role. You cannot use session policies to grant more permissions than those
     *        allowed by the identity-based policy of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
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
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
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
     *         This parameter is optional. Passing policies to this operation returns new temporary credentials. The
     *         resulting session's permissions are the intersection of the role's identity-based policy and the session
     *         policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in
     *         the account that owns the role. You cannot use session policies to grant more permissions than those
     *         allowed by the identity-based policy of the role that is being assumed. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *         Policies</a> in the <i>IAM User Guide</i>.
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
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
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
     *        This parameter is optional. Passing policies to this operation returns new temporary credentials. The
     *        resulting session's permissions are the intersection of the role's identity-based policy and the session
     *        policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in
     *        the account that owns the role. You cannot use session policies to grant more permissions than those
     *        allowed by the identity-based policy of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
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

    public AssumeRoleWithSAMLRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. Your role session lasts for the duration that you specify for the
     * <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication response's
     * <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a <code>DurationSeconds</code>
     * value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can
     * have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration
     * to 6 hours, your operation fails. To learn how to view the maximum value for your role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. Your role session lasts for the duration that you specify
     *        for the <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication
     *        response's <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a
     *        <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the maximum session duration
     *        setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher
     *        than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but
     *        your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view
     *        the maximum value for your role, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to <code>3600</code> seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *        >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. Your role session lasts for the duration that you specify for the
     * <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication response's
     * <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a <code>DurationSeconds</code>
     * value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can
     * have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration
     * to 6 hours, your operation fails. To learn how to view the maximum value for your role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @return The duration, in seconds, of the role session. Your role session lasts for the duration that you specify
     *         for the <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication
     *         response's <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a
     *         <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the maximum session duration
     *         setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value
     *         higher than this setting, the operation fails. For example, if you specify a session duration of 12
     *         hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn
     *         how to view the maximum value for your role, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *         >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         By default, the value is set to <code>3600</code> seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *         might request using the returned credentials. The request to the federation endpoint for a console
     *         sign-in token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the
     *         console session. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *         >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. Your role session lasts for the duration that you specify for the
     * <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication response's
     * <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a <code>DurationSeconds</code>
     * value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can
     * have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration
     * to 6 hours, your operation fails. To learn how to view the maximum value for your role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. Your role session lasts for the duration that you specify
     *        for the <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication
     *        response's <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a
     *        <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the maximum session duration
     *        setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher
     *        than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but
     *        your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view
     *        the maximum value for your role, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to <code>3600</code> seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *        >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getSAMLAssertion() != null)
            sb.append("SAMLAssertion: ").append(getSAMLAssertion()).append(",");
        if (getPolicyArns() != null)
            sb.append("PolicyArns: ").append(getPolicyArns()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithSAMLRequest == false)
            return false;
        AssumeRoleWithSAMLRequest other = (AssumeRoleWithSAMLRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getSAMLAssertion() == null ^ this.getSAMLAssertion() == null)
            return false;
        if (other.getSAMLAssertion() != null && other.getSAMLAssertion().equals(this.getSAMLAssertion()) == false)
            return false;
        if (other.getPolicyArns() == null ^ this.getPolicyArns() == null)
            return false;
        if (other.getPolicyArns() != null && other.getPolicyArns().equals(this.getPolicyArns()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getSAMLAssertion() == null) ? 0 : getSAMLAssertion().hashCode());
        hashCode = prime * hashCode + ((getPolicyArns() == null) ? 0 : getPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleWithSAMLRequest clone() {
        return (AssumeRoleWithSAMLRequest) super.clone();
    }

}
