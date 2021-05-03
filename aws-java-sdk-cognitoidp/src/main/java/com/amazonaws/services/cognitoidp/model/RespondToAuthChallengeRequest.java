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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to respond to an authentication challenge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RespondToAuthChallenge" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RespondToAuthChallengeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app client ID.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     * >InitiateAuth</a>.
     * </p>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * </p>
     */
    private String challengeName;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     */
    private String session;
    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <note>
     * <p>
     * <code>SECRET_HASH</code> (if app client is configured with client secret) applies to all inputs below (including
     * <code>SOFTWARE_TOKEN_MFA</code>).
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOFTWARE_TOKEN_MFA</code>: <code>USERNAME</code> and <code>SOFTWARE_TOKEN_MFA_CODE</code> are required
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code> requires <code>USERNAME</code>, <code>DEVICE_KEY</code>, <code>SRP_A</code> (and
     * <code>SECRET_HASH</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code> requires everything that <code>PASSWORD_VERIFIER</code> requires plus
     * <code>DEVICE_KEY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you need to use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> challengeResponses;
    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>RespondToAuthChallenge</code> calls.
     * </p>
     */
    private AnalyticsMetadataType analyticsMetadata;
    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     */
    private UserContextDataType userContextData;
    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>post authentication</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create auth
     * challenge</i>, and <i>verify auth challenge</i>. When Amazon Cognito invokes any of these functions, it passes a
     * JSON payload, which the function receives as input. This payload contains a <code>clientMetadata</code>
     * attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     * RespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     * <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @return The app client ID.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     * >InitiateAuth</a>.
     * </p>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a
     *        href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     *        >InitiateAuth</a>.</p>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * @see ChallengeNameType
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     * >InitiateAuth</a>.
     * </p>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * </p>
     * 
     * @return The challenge name. For more information, see <a
     *         href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     *         >InitiateAuth</a>.</p>
     *         <p>
     *         <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * @see ChallengeNameType
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     * >InitiateAuth</a>.
     * </p>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a
     *        href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     *        >InitiateAuth</a>.</p>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public RespondToAuthChallengeRequest withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     * >InitiateAuth</a>.
     * </p>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a
     *        href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     *        >InitiateAuth</a>.</p>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * @see ChallengeNameType
     */

    public void setChallengeName(ChallengeNameType challengeName) {
        withChallengeName(challengeName);
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     * >InitiateAuth</a>.
     * </p>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a
     *        href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html"
     *        >InitiateAuth</a>.</p>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code> is not a valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public RespondToAuthChallengeRequest withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs
     *        to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service. If
     *         <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller
     *         needs to go through another challenge, they return a session with other challenge parameters. This
     *         session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs
     *        to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest withSession(String session) {
        setSession(session);
        return this;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <note>
     * <p>
     * <code>SECRET_HASH</code> (if app client is configured with client secret) applies to all inputs below (including
     * <code>SOFTWARE_TOKEN_MFA</code>).
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOFTWARE_TOKEN_MFA</code>: <code>USERNAME</code> and <code>SOFTWARE_TOKEN_MFA_CODE</code> are required
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code> requires <code>USERNAME</code>, <code>DEVICE_KEY</code>, <code>SRP_A</code> (and
     * <code>SECRET_HASH</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code> requires everything that <code>PASSWORD_VERIFIER</code> requires plus
     * <code>DEVICE_KEY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you need to use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *         example:</p> <note>
     *         <p>
     *         <code>SECRET_HASH</code> (if app client is configured with client secret) applies to all inputs below
     *         (including <code>SOFTWARE_TOKEN_MFA</code>).
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *         <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *         <code>USERNAME</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SOFTWARE_TOKEN_MFA</code>: <code>USERNAME</code> and <code>SOFTWARE_TOKEN_MFA_CODE</code> are
     *         required attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEVICE_SRP_AUTH</code> requires <code>USERNAME</code>, <code>DEVICE_KEY</code>, <code>SRP_A</code>
     *         (and <code>SECRET_HASH</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEVICE_PASSWORD_VERIFIER</code> requires everything that <code>PASSWORD_VERIFIER</code> requires
     *         plus <code>DEVICE_KEY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you need to use the session value returned by
     *         <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getChallengeResponses() {
        return challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <note>
     * <p>
     * <code>SECRET_HASH</code> (if app client is configured with client secret) applies to all inputs below (including
     * <code>SOFTWARE_TOKEN_MFA</code>).
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOFTWARE_TOKEN_MFA</code>: <code>USERNAME</code> and <code>SOFTWARE_TOKEN_MFA_CODE</code> are required
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code> requires <code>USERNAME</code>, <code>DEVICE_KEY</code>, <code>SRP_A</code> (and
     * <code>SECRET_HASH</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code> requires everything that <code>PASSWORD_VERIFIER</code> requires plus
     * <code>DEVICE_KEY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you need to use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param challengeResponses
     *        The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *        example:</p> <note>
     *        <p>
     *        <code>SECRET_HASH</code> (if app client is configured with client secret) applies to all inputs below
     *        (including <code>SOFTWARE_TOKEN_MFA</code>).
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *        <code>USERNAME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SOFTWARE_TOKEN_MFA</code>: <code>USERNAME</code> and <code>SOFTWARE_TOKEN_MFA_CODE</code> are
     *        required attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_SRP_AUTH</code> requires <code>USERNAME</code>, <code>DEVICE_KEY</code>, <code>SRP_A</code>
     *        (and <code>SECRET_HASH</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_PASSWORD_VERIFIER</code> requires everything that <code>PASSWORD_VERIFIER</code> requires
     *        plus <code>DEVICE_KEY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you need to use the session value returned by
     *        <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     *        </p>
     *        </li>
     */

    public void setChallengeResponses(java.util.Map<String, String> challengeResponses) {
        this.challengeResponses = challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <note>
     * <p>
     * <code>SECRET_HASH</code> (if app client is configured with client secret) applies to all inputs below (including
     * <code>SOFTWARE_TOKEN_MFA</code>).
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOFTWARE_TOKEN_MFA</code>: <code>USERNAME</code> and <code>SOFTWARE_TOKEN_MFA_CODE</code> are required
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code> requires <code>USERNAME</code>, <code>DEVICE_KEY</code>, <code>SRP_A</code> (and
     * <code>SECRET_HASH</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code> requires everything that <code>PASSWORD_VERIFIER</code> requires plus
     * <code>DEVICE_KEY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you need to use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param challengeResponses
     *        The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *        example:</p> <note>
     *        <p>
     *        <code>SECRET_HASH</code> (if app client is configured with client secret) applies to all inputs below
     *        (including <code>SOFTWARE_TOKEN_MFA</code>).
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *        <code>USERNAME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SOFTWARE_TOKEN_MFA</code>: <code>USERNAME</code> and <code>SOFTWARE_TOKEN_MFA_CODE</code> are
     *        required attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_SRP_AUTH</code> requires <code>USERNAME</code>, <code>DEVICE_KEY</code>, <code>SRP_A</code>
     *        (and <code>SECRET_HASH</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_PASSWORD_VERIFIER</code> requires everything that <code>PASSWORD_VERIFIER</code> requires
     *        plus <code>DEVICE_KEY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you need to use the session value returned by
     *        <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest withChallengeResponses(java.util.Map<String, String> challengeResponses) {
        setChallengeResponses(challengeResponses);
        return this;
    }

    /**
     * Add a single ChallengeResponses entry
     *
     * @see RespondToAuthChallengeRequest#withChallengeResponses
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest addChallengeResponsesEntry(String key, String value) {
        if (null == this.challengeResponses) {
            this.challengeResponses = new java.util.HashMap<String, String>();
        }
        if (this.challengeResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.challengeResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeResponses.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest clearChallengeResponsesEntries() {
        this.challengeResponses = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>RespondToAuthChallenge</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The Amazon Pinpoint analytics metadata for collecting metrics for <code>RespondToAuthChallenge</code>
     *        calls.
     */

    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>RespondToAuthChallenge</code> calls.
     * </p>
     * 
     * @return The Amazon Pinpoint analytics metadata for collecting metrics for <code>RespondToAuthChallenge</code>
     *         calls.
     */

    public AnalyticsMetadataType getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>RespondToAuthChallenge</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The Amazon Pinpoint analytics metadata for collecting metrics for <code>RespondToAuthChallenge</code>
     *        calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest withAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        setAnalyticsMetadata(analyticsMetadata);
        return this;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @param userContextData
     *        Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *        risk of an unexpected event by Amazon Cognito advanced security.
     */

    public void setUserContextData(UserContextDataType userContextData) {
        this.userContextData = userContextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @return Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *         risk of an unexpected event by Amazon Cognito advanced security.
     */

    public UserContextDataType getUserContextData() {
        return this.userContextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @param userContextData
     *        Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *        risk of an unexpected event by Amazon Cognito advanced security.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest withUserContextData(UserContextDataType userContextData) {
        setUserContextData(userContextData);
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>post authentication</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create auth
     * challenge</i>, and <i>verify auth challenge</i>. When Amazon Cognito invokes any of these functions, it passes a
     * JSON payload, which the function receives as input. This payload contains a <code>clientMetadata</code>
     * attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     * RespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     * <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *         triggers. </p>
     *         <p>
     *         You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *         RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the
     *         following triggers: <i>post authentication</i>, <i>pre token generation</i>, <i>define auth
     *         challenge</i>, <i>create auth challenge</i>, and <i>verify auth challenge</i>. When Amazon Cognito
     *         invokes any of these functions, it passes a JSON payload, which the function receives as input. This
     *         payload contains a <code>clientMetadata</code> attribute, which provides the data that you assigned to
     *         the ClientMetadata parameter in your RespondToAuthChallenge request. In your function code in AWS Lambda,
     *         you can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Take the following limitations into consideration when you use the ClientMetadata parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda
     *         triggers that are assigned to a user pool to support custom workflows. If your user pool configuration
     *         does not include triggers, the ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *         information.
     *         </p>
     *         </li>
     *         </ul>
     */

    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>post authentication</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create auth
     * challenge</i>, and <i>verify auth challenge</i>. When Amazon Cognito invokes any of these functions, it passes a
     * JSON payload, which the function receives as input. This payload contains a <code>clientMetadata</code>
     * attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     * RespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     * <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers. </p>
     *        <p>
     *        You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *        RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     *        triggers: <i>post authentication</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create
     *        auth challenge</i>, and <i>verify auth challenge</i>. When Amazon Cognito invokes any of these functions,
     *        it passes a JSON payload, which the function receives as input. This payload contains a
     *        <code>clientMetadata</code> attribute, which provides the data that you assigned to the ClientMetadata
     *        parameter in your RespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     *        <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Take the following limitations into consideration when you use the ClientMetadata parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers
     *        that are assigned to a user pool to support custom workflows. If your user pool configuration does not
     *        include triggers, the ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *        information.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>post authentication</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create auth
     * challenge</i>, and <i>verify auth challenge</i>. When Amazon Cognito invokes any of these functions, it passes a
     * JSON payload, which the function receives as input. This payload contains a <code>clientMetadata</code>
     * attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     * RespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     * <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers. </p>
     *        <p>
     *        You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *        RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     *        triggers: <i>post authentication</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create
     *        auth challenge</i>, and <i>verify auth challenge</i>. When Amazon Cognito invokes any of these functions,
     *        it passes a JSON payload, which the function receives as input. This payload contains a
     *        <code>clientMetadata</code> attribute, which provides the data that you assigned to the ClientMetadata
     *        parameter in your RespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     *        <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Take the following limitations into consideration when you use the ClientMetadata parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers
     *        that are assigned to a user pool to support custom workflows. If your user pool configuration does not
     *        include triggers, the ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *        information.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest withClientMetadata(java.util.Map<String, String> clientMetadata) {
        setClientMetadata(clientMetadata);
        return this;
    }

    /**
     * Add a single ClientMetadata entry
     *
     * @see RespondToAuthChallengeRequest#withClientMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getClientId() != null)
            sb.append("ClientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getChallengeName() != null)
            sb.append("ChallengeName: ").append(getChallengeName()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession()).append(",");
        if (getChallengeResponses() != null)
            sb.append("ChallengeResponses: ").append(getChallengeResponses()).append(",");
        if (getAnalyticsMetadata() != null)
            sb.append("AnalyticsMetadata: ").append(getAnalyticsMetadata()).append(",");
        if (getUserContextData() != null)
            sb.append("UserContextData: ").append(getUserContextData()).append(",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: ").append(getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RespondToAuthChallengeRequest == false)
            return false;
        RespondToAuthChallengeRequest other = (RespondToAuthChallengeRequest) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getChallengeResponses() == null ^ this.getChallengeResponses() == null)
            return false;
        if (other.getChallengeResponses() != null && other.getChallengeResponses().equals(this.getChallengeResponses()) == false)
            return false;
        if (other.getAnalyticsMetadata() == null ^ this.getAnalyticsMetadata() == null)
            return false;
        if (other.getAnalyticsMetadata() != null && other.getAnalyticsMetadata().equals(this.getAnalyticsMetadata()) == false)
            return false;
        if (other.getUserContextData() == null ^ this.getUserContextData() == null)
            return false;
        if (other.getUserContextData() != null && other.getUserContextData().equals(this.getUserContextData()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getChallengeResponses() == null) ? 0 : getChallengeResponses().hashCode());
        hashCode = prime * hashCode + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        hashCode = prime * hashCode + ((getUserContextData() == null) ? 0 : getUserContextData().hashCode());
        hashCode = prime * hashCode + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public RespondToAuthChallengeRequest clone() {
        return (RespondToAuthChallengeRequest) super.clone();
    }

}
