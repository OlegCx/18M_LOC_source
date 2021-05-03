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

/**
 * <p>
 * Initiates the authentication response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/InitiateAuth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateAuthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the challenge which you are responding to with this call. This is returned to you in the
     * <code>AdminInitiateAuth</code> response if you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     * <code>SECRET_HASH</code> (if applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the user
     * should pass another challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges were
     * passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful first
     * login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA types
     * enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code> value.
     * </p>
     * <p>
     * To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     * <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as an input
     * to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete sign-in. To setup
     * SMS MFA, users will need help from an administrator to add a phone number to their account and then call
     * <code>InitiateAuth</code> again to restart sign-in.
     * </p>
     * </li>
     * </ul>
     */
    private String challengeName;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the caller needs to
     * go through another challenge, they return a session with other challenge parameters. This session should be
     * passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     */
    private String session;
    /**
     * <p>
     * The challenge parameters. These are returned to you in the <code>InitiateAuth</code> response if you need to pass
     * another challenge. The responses in this parameter should be used to compute inputs to the next call (
     * <code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code> (if applicable).
     * </p>
     */
    private java.util.Map<String, String> challengeParameters;
    /**
     * <p>
     * The result of the authentication response. This is only returned if the caller does not need to pass another
     * challenge. If the caller does need to pass another challenge before it gets tokens, <code>ChallengeName</code>,
     * <code>ChallengeParameters</code>, and <code>Session</code> are returned.
     * </p>
     */
    private AuthenticationResultType authenticationResult;

    /**
     * <p>
     * The name of the challenge which you are responding to with this call. This is returned to you in the
     * <code>AdminInitiateAuth</code> response if you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     * <code>SECRET_HASH</code> (if applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the user
     * should pass another challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges were
     * passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful first
     * login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA types
     * enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code> value.
     * </p>
     * <p>
     * To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     * <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as an input
     * to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete sign-in. To setup
     * SMS MFA, users will need help from an administrator to add a phone number to their account and then call
     * <code>InitiateAuth</code> again to restart sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param challengeName
     *        The name of the challenge which you are responding to with this call. This is returned to you in the
     *        <code>AdminInitiateAuth</code> response if you need to pass another challenge.</p>
     *        <p>
     *        Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     *        <code>SECRET_HASH</code> (if applicable) in the parameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP
     *        calculations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the
     *        user should pass another challenge before tokens are issued.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges
     *        were passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful
     *        first login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA
     *        types enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code>
     *        value.
     *        </p>
     *        <p>
     *        To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     *        <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as
     *        an input to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete
     *        sign-in. To setup SMS MFA, users will need help from an administrator to add a phone number to their
     *        account and then call <code>InitiateAuth</code> again to restart sign-in.
     *        </p>
     *        </li>
     * @see ChallengeNameType
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call. This is returned to you in the
     * <code>AdminInitiateAuth</code> response if you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     * <code>SECRET_HASH</code> (if applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the user
     * should pass another challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges were
     * passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful first
     * login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA types
     * enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code> value.
     * </p>
     * <p>
     * To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     * <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as an input
     * to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete sign-in. To setup
     * SMS MFA, users will need help from an administrator to add a phone number to their account and then call
     * <code>InitiateAuth</code> again to restart sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the challenge which you are responding to with this call. This is returned to you in the
     *         <code>AdminInitiateAuth</code> response if you need to pass another challenge.</p>
     *         <p>
     *         Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     *         <code>SECRET_HASH</code> (if applicable) in the parameters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *         <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP
     *         calculations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the
     *         user should pass another challenge before tokens are issued.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous
     *         challenges were passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful
     *         first login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required
     *         attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The
     *         MFA types enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code>
     *         value.
     *         </p>
     *         <p>
     *         To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     *         <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as
     *         an input to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete
     *         sign-in. To setup SMS MFA, users will need help from an administrator to add a phone number to their
     *         account and then call <code>InitiateAuth</code> again to restart sign-in.
     *         </p>
     *         </li>
     * @see ChallengeNameType
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call. This is returned to you in the
     * <code>AdminInitiateAuth</code> response if you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     * <code>SECRET_HASH</code> (if applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the user
     * should pass another challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges were
     * passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful first
     * login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA types
     * enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code> value.
     * </p>
     * <p>
     * To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     * <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as an input
     * to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete sign-in. To setup
     * SMS MFA, users will need help from an administrator to add a phone number to their account and then call
     * <code>InitiateAuth</code> again to restart sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param challengeName
     *        The name of the challenge which you are responding to with this call. This is returned to you in the
     *        <code>AdminInitiateAuth</code> response if you need to pass another challenge.</p>
     *        <p>
     *        Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     *        <code>SECRET_HASH</code> (if applicable) in the parameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP
     *        calculations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the
     *        user should pass another challenge before tokens are issued.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges
     *        were passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful
     *        first login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA
     *        types enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code>
     *        value.
     *        </p>
     *        <p>
     *        To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     *        <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as
     *        an input to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete
     *        sign-in. To setup SMS MFA, users will need help from an administrator to add a phone number to their
     *        account and then call <code>InitiateAuth</code> again to restart sign-in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public InitiateAuthResult withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call. This is returned to you in the
     * <code>AdminInitiateAuth</code> response if you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     * <code>SECRET_HASH</code> (if applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the user
     * should pass another challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges were
     * passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful first
     * login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA types
     * enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code> value.
     * </p>
     * <p>
     * To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     * <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as an input
     * to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete sign-in. To setup
     * SMS MFA, users will need help from an administrator to add a phone number to their account and then call
     * <code>InitiateAuth</code> again to restart sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param challengeName
     *        The name of the challenge which you are responding to with this call. This is returned to you in the
     *        <code>AdminInitiateAuth</code> response if you need to pass another challenge.</p>
     *        <p>
     *        Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     *        <code>SECRET_HASH</code> (if applicable) in the parameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP
     *        calculations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the
     *        user should pass another challenge before tokens are issued.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges
     *        were passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful
     *        first login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA
     *        types enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code>
     *        value.
     *        </p>
     *        <p>
     *        To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     *        <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as
     *        an input to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete
     *        sign-in. To setup SMS MFA, users will need help from an administrator to add a phone number to their
     *        account and then call <code>InitiateAuth</code> again to restart sign-in.
     *        </p>
     *        </li>
     * @see ChallengeNameType
     */

    public void setChallengeName(ChallengeNameType challengeName) {
        withChallengeName(challengeName);
    }

    /**
     * <p>
     * The name of the challenge which you are responding to with this call. This is returned to you in the
     * <code>AdminInitiateAuth</code> response if you need to pass another challenge.
     * </p>
     * <p>
     * Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     * <code>SECRET_HASH</code> (if applicable) in the parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP calculations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the user
     * should pass another challenge before tokens are issued.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges were
     * passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful first
     * login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA types
     * enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code> value.
     * </p>
     * <p>
     * To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     * <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as an input
     * to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete sign-in. To setup
     * SMS MFA, users will need help from an administrator to add a phone number to their account and then call
     * <code>InitiateAuth</code> again to restart sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param challengeName
     *        The name of the challenge which you are responding to with this call. This is returned to you in the
     *        <code>AdminInitiateAuth</code> response if you need to pass another challenge.</p>
     *        <p>
     *        Valid values include the following. Note that all of these challenges require <code>USERNAME</code> and
     *        <code>SECRET_HASH</code> (if applicable) in the parameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: Next challenge is to supply an <code>SMS_MFA_CODE</code>, delivered via SMS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: Next challenge is to supply <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, and <code>TIMESTAMP</code> after the client-side SRP
     *        calculations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_CHALLENGE</code>: This is returned if your custom authentication flow determines that the
     *        user should pass another challenge before tokens are issued.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_SRP_AUTH</code>: If device tracking was enabled on your user pool and the previous challenges
     *        were passed, this challenge is returned so that Amazon Cognito can start tracking this device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEVICE_PASSWORD_VERIFIER</code>: Similar to <code>PASSWORD_VERIFIER</code>, but for devices only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: For users who are required to change their passwords after successful
     *        first login. This challenge should be passed with <code>NEW_PASSWORD</code> and any other required
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code>: For users who are required to setup an MFA factor before they can sign-in. The MFA
     *        types enabled for the user pool will be listed in the challenge parameters <code>MFA_CAN_SETUP</code>
     *        value.
     *        </p>
     *        <p>
     *        To setup software token MFA, use the session returned here from <code>InitiateAuth</code> as an input to
     *        <code>AssociateSoftwareToken</code>, and use the session returned by <code>VerifySoftwareToken</code> as
     *        an input to <code>RespondToAuthChallenge</code> with challenge name <code>MFA_SETUP</code> to complete
     *        sign-in. To setup SMS MFA, users will need help from an administrator to add a phone number to their
     *        account and then call <code>InitiateAuth</code> again to restart sign-in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public InitiateAuthResult withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the caller needs to
     * go through another challenge, they return a session with other challenge parameters. This session should be
     * passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If the caller
     *        needs to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the caller needs to
     * go through another challenge, they return a session with other challenge parameters. This session should be
     * passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service. If the caller
     *         needs to go through another challenge, they return a session with other challenge parameters. This
     *         session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the caller needs to
     * go through another challenge, they return a session with other challenge parameters. This session should be
     * passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If the caller
     *        needs to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateAuthResult withSession(String session) {
        setSession(session);
        return this;
    }

    /**
     * <p>
     * The challenge parameters. These are returned to you in the <code>InitiateAuth</code> response if you need to pass
     * another challenge. The responses in this parameter should be used to compute inputs to the next call (
     * <code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code> (if applicable).
     * </p>
     * 
     * @return The challenge parameters. These are returned to you in the <code>InitiateAuth</code> response if you need
     *         to pass another challenge. The responses in this parameter should be used to compute inputs to the next
     *         call (<code>RespondToAuthChallenge</code>). </p>
     *         <p>
     *         All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code> (if applicable).
     */

    public java.util.Map<String, String> getChallengeParameters() {
        return challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters. These are returned to you in the <code>InitiateAuth</code> response if you need to pass
     * another challenge. The responses in this parameter should be used to compute inputs to the next call (
     * <code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code> (if applicable).
     * </p>
     * 
     * @param challengeParameters
     *        The challenge parameters. These are returned to you in the <code>InitiateAuth</code> response if you need
     *        to pass another challenge. The responses in this parameter should be used to compute inputs to the next
     *        call (<code>RespondToAuthChallenge</code>). </p>
     *        <p>
     *        All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code> (if applicable).
     */

    public void setChallengeParameters(java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters. These are returned to you in the <code>InitiateAuth</code> response if you need to pass
     * another challenge. The responses in this parameter should be used to compute inputs to the next call (
     * <code>RespondToAuthChallenge</code>).
     * </p>
     * <p>
     * All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code> (if applicable).
     * </p>
     * 
     * @param challengeParameters
     *        The challenge parameters. These are returned to you in the <code>InitiateAuth</code> response if you need
     *        to pass another challenge. The responses in this parameter should be used to compute inputs to the next
     *        call (<code>RespondToAuthChallenge</code>). </p>
     *        <p>
     *        All challenges require <code>USERNAME</code> and <code>SECRET_HASH</code> (if applicable).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateAuthResult withChallengeParameters(java.util.Map<String, String> challengeParameters) {
        setChallengeParameters(challengeParameters);
        return this;
    }

    /**
     * Add a single ChallengeParameters entry
     *
     * @see InitiateAuthResult#withChallengeParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InitiateAuthResult addChallengeParametersEntry(String key, String value) {
        if (null == this.challengeParameters) {
            this.challengeParameters = new java.util.HashMap<String, String>();
        }
        if (this.challengeParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.challengeParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateAuthResult clearChallengeParametersEntries() {
        this.challengeParameters = null;
        return this;
    }

    /**
     * <p>
     * The result of the authentication response. This is only returned if the caller does not need to pass another
     * challenge. If the caller does need to pass another challenge before it gets tokens, <code>ChallengeName</code>,
     * <code>ChallengeParameters</code>, and <code>Session</code> are returned.
     * </p>
     * 
     * @param authenticationResult
     *        The result of the authentication response. This is only returned if the caller does not need to pass
     *        another challenge. If the caller does need to pass another challenge before it gets tokens,
     *        <code>ChallengeName</code>, <code>ChallengeParameters</code>, and <code>Session</code> are returned.
     */

    public void setAuthenticationResult(AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * <p>
     * The result of the authentication response. This is only returned if the caller does not need to pass another
     * challenge. If the caller does need to pass another challenge before it gets tokens, <code>ChallengeName</code>,
     * <code>ChallengeParameters</code>, and <code>Session</code> are returned.
     * </p>
     * 
     * @return The result of the authentication response. This is only returned if the caller does not need to pass
     *         another challenge. If the caller does need to pass another challenge before it gets tokens,
     *         <code>ChallengeName</code>, <code>ChallengeParameters</code>, and <code>Session</code> are returned.
     */

    public AuthenticationResultType getAuthenticationResult() {
        return this.authenticationResult;
    }

    /**
     * <p>
     * The result of the authentication response. This is only returned if the caller does not need to pass another
     * challenge. If the caller does need to pass another challenge before it gets tokens, <code>ChallengeName</code>,
     * <code>ChallengeParameters</code>, and <code>Session</code> are returned.
     * </p>
     * 
     * @param authenticationResult
     *        The result of the authentication response. This is only returned if the caller does not need to pass
     *        another challenge. If the caller does need to pass another challenge before it gets tokens,
     *        <code>ChallengeName</code>, <code>ChallengeParameters</code>, and <code>Session</code> are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateAuthResult withAuthenticationResult(AuthenticationResultType authenticationResult) {
        setAuthenticationResult(authenticationResult);
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
        if (getChallengeName() != null)
            sb.append("ChallengeName: ").append(getChallengeName()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession()).append(",");
        if (getChallengeParameters() != null)
            sb.append("ChallengeParameters: ").append(getChallengeParameters()).append(",");
        if (getAuthenticationResult() != null)
            sb.append("AuthenticationResult: ").append(getAuthenticationResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateAuthResult == false)
            return false;
        InitiateAuthResult other = (InitiateAuthResult) obj;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getChallengeParameters() == null ^ this.getChallengeParameters() == null)
            return false;
        if (other.getChallengeParameters() != null && other.getChallengeParameters().equals(this.getChallengeParameters()) == false)
            return false;
        if (other.getAuthenticationResult() == null ^ this.getAuthenticationResult() == null)
            return false;
        if (other.getAuthenticationResult() != null && other.getAuthenticationResult().equals(this.getAuthenticationResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getChallengeParameters() == null) ? 0 : getChallengeParameters().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationResult() == null) ? 0 : getAuthenticationResult().hashCode());
        return hashCode;
    }

    @Override
    public InitiateAuthResult clone() {
        try {
            return (InitiateAuthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
