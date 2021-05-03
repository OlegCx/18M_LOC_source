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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateListenerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListenerRequestMarshaller implements Marshaller<Request<CreateListenerRequest>, CreateListenerRequest> {

    public Request<CreateListenerRequest> marshall(CreateListenerRequest createListenerRequest) {

        if (createListenerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateListenerRequest> request = new DefaultRequest<CreateListenerRequest>(createListenerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateListener");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createListenerRequest.getLoadBalancerArn() != null) {
            request.addParameter("LoadBalancerArn", StringUtils.fromString(createListenerRequest.getLoadBalancerArn()));
        }

        if (createListenerRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromString(createListenerRequest.getProtocol()));
        }

        if (createListenerRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createListenerRequest.getPort()));
        }

        if (createListenerRequest.getSslPolicy() != null) {
            request.addParameter("SslPolicy", StringUtils.fromString(createListenerRequest.getSslPolicy()));
        }

        if (createListenerRequest.getCertificates() != null) {
            java.util.List<Certificate> certificatesList = createListenerRequest.getCertificates();
            if (certificatesList.isEmpty()) {
                request.addParameter("Certificates", "");
            } else {
                int certificatesListIndex = 1;

                for (Certificate certificatesListValue : certificatesList) {
                    if (certificatesListValue != null) {

                        if (certificatesListValue.getCertificateArn() != null) {
                            request.addParameter("Certificates.member." + certificatesListIndex + ".CertificateArn",
                                    StringUtils.fromString(certificatesListValue.getCertificateArn()));
                        }

                        if (certificatesListValue.getIsDefault() != null) {
                            request.addParameter("Certificates.member." + certificatesListIndex + ".IsDefault",
                                    StringUtils.fromBoolean(certificatesListValue.getIsDefault()));
                        }
                    }
                    certificatesListIndex++;
                }
            }
        }

        if (createListenerRequest.getDefaultActions() != null) {
            java.util.List<Action> defaultActionsList = createListenerRequest.getDefaultActions();
            if (defaultActionsList.isEmpty()) {
                request.addParameter("DefaultActions", "");
            } else {
                int defaultActionsListIndex = 1;

                for (Action defaultActionsListValue : defaultActionsList) {
                    if (defaultActionsListValue != null) {

                        if (defaultActionsListValue.getType() != null) {
                            request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".Type",
                                    StringUtils.fromString(defaultActionsListValue.getType()));
                        }

                        if (defaultActionsListValue.getTargetGroupArn() != null) {
                            request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".TargetGroupArn",
                                    StringUtils.fromString(defaultActionsListValue.getTargetGroupArn()));
                        }

                        {
                            AuthenticateOidcActionConfig authenticateOidcConfig = defaultActionsListValue.getAuthenticateOidcConfig();
                            if (authenticateOidcConfig != null) {

                                if (authenticateOidcConfig.getIssuer() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.Issuer",
                                            StringUtils.fromString(authenticateOidcConfig.getIssuer()));
                                }

                                if (authenticateOidcConfig.getAuthorizationEndpoint() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.AuthorizationEndpoint",
                                            StringUtils.fromString(authenticateOidcConfig.getAuthorizationEndpoint()));
                                }

                                if (authenticateOidcConfig.getTokenEndpoint() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.TokenEndpoint",
                                            StringUtils.fromString(authenticateOidcConfig.getTokenEndpoint()));
                                }

                                if (authenticateOidcConfig.getUserInfoEndpoint() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.UserInfoEndpoint",
                                            StringUtils.fromString(authenticateOidcConfig.getUserInfoEndpoint()));
                                }

                                if (authenticateOidcConfig.getClientId() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.ClientId",
                                            StringUtils.fromString(authenticateOidcConfig.getClientId()));
                                }

                                if (authenticateOidcConfig.getClientSecret() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.ClientSecret",
                                            StringUtils.fromString(authenticateOidcConfig.getClientSecret()));
                                }

                                if (authenticateOidcConfig.getSessionCookieName() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.SessionCookieName",
                                            StringUtils.fromString(authenticateOidcConfig.getSessionCookieName()));
                                }

                                if (authenticateOidcConfig.getScope() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.Scope",
                                            StringUtils.fromString(authenticateOidcConfig.getScope()));
                                }

                                if (authenticateOidcConfig.getSessionTimeout() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.SessionTimeout",
                                            StringUtils.fromLong(authenticateOidcConfig.getSessionTimeout()));
                                }

                                java.util.Map<String, String> authenticationRequestExtraParams = authenticateOidcConfig.getAuthenticationRequestExtraParams();
                                if (authenticationRequestExtraParams != null) {
                                    int authenticationRequestExtraParamsListIndex = 1;
                                    for (Map.Entry<String, String> entry : authenticationRequestExtraParams.entrySet()) {
                                        if (entry != null && entry.getKey() != null) {
                                            request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                    + ".AuthenticateOidcConfig.AuthenticationRequestExtraParams.entry."
                                                    + authenticationRequestExtraParamsListIndex + ".key", StringUtils.fromString(entry.getKey()));
                                        }
                                        if (entry != null && entry.getValue() != null) {
                                            request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                    + ".AuthenticateOidcConfig.AuthenticationRequestExtraParams.entry."
                                                    + authenticationRequestExtraParamsListIndex + ".value", StringUtils.fromString(entry.getValue()));
                                        }
                                        authenticationRequestExtraParamsListIndex++;
                                    }
                                }

                                if (authenticateOidcConfig.getOnUnauthenticatedRequest() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                            + ".AuthenticateOidcConfig.OnUnauthenticatedRequest",
                                            StringUtils.fromString(authenticateOidcConfig.getOnUnauthenticatedRequest()));
                                }

                                if (authenticateOidcConfig.getUseExistingClientSecret() != null) {
                                    request.addParameter(
                                            "DefaultActions.member." + defaultActionsListIndex + ".AuthenticateOidcConfig.UseExistingClientSecret",
                                            StringUtils.fromBoolean(authenticateOidcConfig.getUseExistingClientSecret()));
                                }
                            }
                        }

                        {
                            AuthenticateCognitoActionConfig authenticateCognitoConfig = defaultActionsListValue.getAuthenticateCognitoConfig();
                            if (authenticateCognitoConfig != null) {

                                if (authenticateCognitoConfig.getUserPoolArn() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateCognitoConfig.UserPoolArn",
                                            StringUtils.fromString(authenticateCognitoConfig.getUserPoolArn()));
                                }

                                if (authenticateCognitoConfig.getUserPoolClientId() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateCognitoConfig.UserPoolClientId",
                                            StringUtils.fromString(authenticateCognitoConfig.getUserPoolClientId()));
                                }

                                if (authenticateCognitoConfig.getUserPoolDomain() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateCognitoConfig.UserPoolDomain",
                                            StringUtils.fromString(authenticateCognitoConfig.getUserPoolDomain()));
                                }

                                if (authenticateCognitoConfig.getSessionCookieName() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateCognitoConfig.SessionCookieName",
                                            StringUtils.fromString(authenticateCognitoConfig.getSessionCookieName()));
                                }

                                if (authenticateCognitoConfig.getScope() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateCognitoConfig.Scope",
                                            StringUtils.fromString(authenticateCognitoConfig.getScope()));
                                }

                                if (authenticateCognitoConfig.getSessionTimeout() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".AuthenticateCognitoConfig.SessionTimeout",
                                            StringUtils.fromLong(authenticateCognitoConfig.getSessionTimeout()));
                                }

                                java.util.Map<String, String> authenticationRequestExtraParams = authenticateCognitoConfig
                                        .getAuthenticationRequestExtraParams();
                                if (authenticationRequestExtraParams != null) {
                                    int authenticationRequestExtraParamsListIndex = 1;
                                    for (Map.Entry<String, String> entry : authenticationRequestExtraParams.entrySet()) {
                                        if (entry != null && entry.getKey() != null) {
                                            request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                    + ".AuthenticateCognitoConfig.AuthenticationRequestExtraParams.entry."
                                                    + authenticationRequestExtraParamsListIndex + ".key", StringUtils.fromString(entry.getKey()));
                                        }
                                        if (entry != null && entry.getValue() != null) {
                                            request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                    + ".AuthenticateCognitoConfig.AuthenticationRequestExtraParams.entry."
                                                    + authenticationRequestExtraParamsListIndex + ".value", StringUtils.fromString(entry.getValue()));
                                        }
                                        authenticationRequestExtraParamsListIndex++;
                                    }
                                }

                                if (authenticateCognitoConfig.getOnUnauthenticatedRequest() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                            + ".AuthenticateCognitoConfig.OnUnauthenticatedRequest",
                                            StringUtils.fromString(authenticateCognitoConfig.getOnUnauthenticatedRequest()));
                                }
                            }
                        }

                        if (defaultActionsListValue.getOrder() != null) {
                            request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".Order",
                                    StringUtils.fromInteger(defaultActionsListValue.getOrder()));
                        }

                        {
                            RedirectActionConfig redirectConfig = defaultActionsListValue.getRedirectConfig();
                            if (redirectConfig != null) {

                                if (redirectConfig.getProtocol() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".RedirectConfig.Protocol",
                                            StringUtils.fromString(redirectConfig.getProtocol()));
                                }

                                if (redirectConfig.getPort() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".RedirectConfig.Port",
                                            StringUtils.fromString(redirectConfig.getPort()));
                                }

                                if (redirectConfig.getHost() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".RedirectConfig.Host",
                                            StringUtils.fromString(redirectConfig.getHost()));
                                }

                                if (redirectConfig.getPath() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".RedirectConfig.Path",
                                            StringUtils.fromString(redirectConfig.getPath()));
                                }

                                if (redirectConfig.getQuery() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".RedirectConfig.Query",
                                            StringUtils.fromString(redirectConfig.getQuery()));
                                }

                                if (redirectConfig.getStatusCode() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".RedirectConfig.StatusCode",
                                            StringUtils.fromString(redirectConfig.getStatusCode()));
                                }
                            }
                        }

                        {
                            FixedResponseActionConfig fixedResponseConfig = defaultActionsListValue.getFixedResponseConfig();
                            if (fixedResponseConfig != null) {

                                if (fixedResponseConfig.getMessageBody() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".FixedResponseConfig.MessageBody",
                                            StringUtils.fromString(fixedResponseConfig.getMessageBody()));
                                }

                                if (fixedResponseConfig.getStatusCode() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".FixedResponseConfig.StatusCode",
                                            StringUtils.fromString(fixedResponseConfig.getStatusCode()));
                                }

                                if (fixedResponseConfig.getContentType() != null) {
                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".FixedResponseConfig.ContentType",
                                            StringUtils.fromString(fixedResponseConfig.getContentType()));
                                }
                            }
                        }

                        {
                            ForwardActionConfig forwardConfig = defaultActionsListValue.getForwardConfig();
                            if (forwardConfig != null) {

                                if (forwardConfig.getTargetGroups() != null) {
                                    java.util.List<TargetGroupTuple> targetGroupsList = forwardConfig.getTargetGroups();
                                    if (targetGroupsList.isEmpty()) {
                                        request.addParameter("DefaultActions.member." + defaultActionsListIndex + ".ForwardConfig.TargetGroups", "");
                                    } else {
                                        int targetGroupsListIndex = 1;

                                        for (TargetGroupTuple targetGroupsListValue : targetGroupsList) {
                                            if (targetGroupsListValue != null) {

                                                if (targetGroupsListValue.getTargetGroupArn() != null) {
                                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                            + ".ForwardConfig.TargetGroups.member." + targetGroupsListIndex + ".TargetGroupArn",
                                                            StringUtils.fromString(targetGroupsListValue.getTargetGroupArn()));
                                                }

                                                if (targetGroupsListValue.getWeight() != null) {
                                                    request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                            + ".ForwardConfig.TargetGroups.member." + targetGroupsListIndex + ".Weight",
                                                            StringUtils.fromInteger(targetGroupsListValue.getWeight()));
                                                }
                                            }
                                            targetGroupsListIndex++;
                                        }
                                    }
                                }

                                {
                                    TargetGroupStickinessConfig targetGroupStickinessConfig = forwardConfig.getTargetGroupStickinessConfig();
                                    if (targetGroupStickinessConfig != null) {

                                        if (targetGroupStickinessConfig.getEnabled() != null) {
                                            request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                    + ".ForwardConfig.TargetGroupStickinessConfig.Enabled",
                                                    StringUtils.fromBoolean(targetGroupStickinessConfig.getEnabled()));
                                        }

                                        if (targetGroupStickinessConfig.getDurationSeconds() != null) {
                                            request.addParameter("DefaultActions.member." + defaultActionsListIndex
                                                    + ".ForwardConfig.TargetGroupStickinessConfig.DurationSeconds",
                                                    StringUtils.fromInteger(targetGroupStickinessConfig.getDurationSeconds()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    defaultActionsListIndex++;
                }
            }
        }

        if (createListenerRequest.getAlpnPolicy() != null) {
            java.util.List<String> alpnPolicyList = createListenerRequest.getAlpnPolicy();
            if (alpnPolicyList.isEmpty()) {
                request.addParameter("AlpnPolicy", "");
            } else {
                int alpnPolicyListIndex = 1;

                for (String alpnPolicyListValue : alpnPolicyList) {
                    if (alpnPolicyListValue != null) {
                        request.addParameter("AlpnPolicy.member." + alpnPolicyListIndex, StringUtils.fromString(alpnPolicyListValue));
                    }
                    alpnPolicyListIndex++;
                }
            }
        }

        if (createListenerRequest.getTags() != null) {
            java.util.List<Tag> tagsList = createListenerRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        if (tagsListValue.getKey() != null) {
                            request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                        }

                        if (tagsListValue.getValue() != null) {
                            request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                        }
                    }
                    tagsListIndex++;
                }
            }
        }

        return request;
    }

}
