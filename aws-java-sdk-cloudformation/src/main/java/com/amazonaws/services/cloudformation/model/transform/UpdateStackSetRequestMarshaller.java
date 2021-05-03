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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * UpdateStackSetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStackSetRequestMarshaller implements Marshaller<Request<UpdateStackSetRequest>, UpdateStackSetRequest> {

    public Request<UpdateStackSetRequest> marshall(UpdateStackSetRequest updateStackSetRequest) {

        if (updateStackSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateStackSetRequest> request = new DefaultRequest<UpdateStackSetRequest>(updateStackSetRequest, "AmazonCloudFormation");
        request.addParameter("Action", "UpdateStackSet");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateStackSetRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(updateStackSetRequest.getStackSetName()));
        }

        if (updateStackSetRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(updateStackSetRequest.getDescription()));
        }

        if (updateStackSetRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(updateStackSetRequest.getTemplateBody()));
        }

        if (updateStackSetRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(updateStackSetRequest.getTemplateURL()));
        }

        if (updateStackSetRequest.getUsePreviousTemplate() != null) {
            request.addParameter("UsePreviousTemplate", StringUtils.fromBoolean(updateStackSetRequest.getUsePreviousTemplate()));
        }

        if (updateStackSetRequest.getParameters().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<Parameter>) updateStackSetRequest.getParameters()).isAutoConstruct()) {
            request.addParameter("Parameters", "");
        }
        if (!updateStackSetRequest.getParameters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Parameter>) updateStackSetRequest.getParameters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) updateStackSetRequest
                    .getParameters();
            int parametersListIndex = 1;

            for (Parameter parametersListValue : parametersList) {
                if (parametersListValue != null) {

                    if (parametersListValue.getParameterKey() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ParameterKey",
                                StringUtils.fromString(parametersListValue.getParameterKey()));
                    }

                    if (parametersListValue.getParameterValue() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ParameterValue",
                                StringUtils.fromString(parametersListValue.getParameterValue()));
                    }

                    if (parametersListValue.getUsePreviousValue() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".UsePreviousValue",
                                StringUtils.fromBoolean(parametersListValue.getUsePreviousValue()));
                    }

                    if (parametersListValue.getResolvedValue() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ResolvedValue",
                                StringUtils.fromString(parametersListValue.getResolvedValue()));
                    }
                }
                parametersListIndex++;
            }
        }

        if (updateStackSetRequest.getCapabilities().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getCapabilities()).isAutoConstruct()) {
            request.addParameter("Capabilities", "");
        }
        if (!updateStackSetRequest.getCapabilities().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getCapabilities()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> capabilitiesList = (com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest
                    .getCapabilities();
            int capabilitiesListIndex = 1;

            for (String capabilitiesListValue : capabilitiesList) {
                if (capabilitiesListValue != null) {
                    request.addParameter("Capabilities.member." + capabilitiesListIndex, StringUtils.fromString(capabilitiesListValue));
                }
                capabilitiesListIndex++;
            }
        }

        if (updateStackSetRequest.getTags().isEmpty() && !((com.amazonaws.internal.SdkInternalList<Tag>) updateStackSetRequest.getTags()).isAutoConstruct()) {
            request.addParameter("Tags", "");
        }
        if (!updateStackSetRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) updateStackSetRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) updateStackSetRequest.getTags();
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

        {
            StackSetOperationPreferences operationPreferences = updateStackSetRequest.getOperationPreferences();
            if (operationPreferences != null) {

                if (operationPreferences.getRegionConcurrencyType() != null) {
                    request.addParameter("OperationPreferences.RegionConcurrencyType", StringUtils.fromString(operationPreferences.getRegionConcurrencyType()));
                }

                if (operationPreferences.getRegionOrder().isEmpty()
                        && !((com.amazonaws.internal.SdkInternalList<String>) operationPreferences.getRegionOrder()).isAutoConstruct()) {
                    request.addParameter("OperationPreferences.RegionOrder", "");
                }
                if (!operationPreferences.getRegionOrder().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) operationPreferences.getRegionOrder()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> regionOrderList = (com.amazonaws.internal.SdkInternalList<String>) operationPreferences
                            .getRegionOrder();
                    int regionOrderListIndex = 1;

                    for (String regionOrderListValue : regionOrderList) {
                        if (regionOrderListValue != null) {
                            request.addParameter("OperationPreferences.RegionOrder.member." + regionOrderListIndex,
                                    StringUtils.fromString(regionOrderListValue));
                        }
                        regionOrderListIndex++;
                    }
                }

                if (operationPreferences.getFailureToleranceCount() != null) {
                    request.addParameter("OperationPreferences.FailureToleranceCount", StringUtils.fromInteger(operationPreferences.getFailureToleranceCount()));
                }

                if (operationPreferences.getFailureTolerancePercentage() != null) {
                    request.addParameter("OperationPreferences.FailureTolerancePercentage",
                            StringUtils.fromInteger(operationPreferences.getFailureTolerancePercentage()));
                }

                if (operationPreferences.getMaxConcurrentCount() != null) {
                    request.addParameter("OperationPreferences.MaxConcurrentCount", StringUtils.fromInteger(operationPreferences.getMaxConcurrentCount()));
                }

                if (operationPreferences.getMaxConcurrentPercentage() != null) {
                    request.addParameter("OperationPreferences.MaxConcurrentPercentage",
                            StringUtils.fromInteger(operationPreferences.getMaxConcurrentPercentage()));
                }
            }
        }

        if (updateStackSetRequest.getAdministrationRoleARN() != null) {
            request.addParameter("AdministrationRoleARN", StringUtils.fromString(updateStackSetRequest.getAdministrationRoleARN()));
        }

        if (updateStackSetRequest.getExecutionRoleName() != null) {
            request.addParameter("ExecutionRoleName", StringUtils.fromString(updateStackSetRequest.getExecutionRoleName()));
        }

        {
            DeploymentTargets deploymentTargets = updateStackSetRequest.getDeploymentTargets();
            if (deploymentTargets != null) {

                if (deploymentTargets.getAccounts().isEmpty()
                        && !((com.amazonaws.internal.SdkInternalList<String>) deploymentTargets.getAccounts()).isAutoConstruct()) {
                    request.addParameter("DeploymentTargets.Accounts", "");
                }
                if (!deploymentTargets.getAccounts().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) deploymentTargets.getAccounts()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> accountsList = (com.amazonaws.internal.SdkInternalList<String>) deploymentTargets
                            .getAccounts();
                    int accountsListIndex = 1;

                    for (String accountsListValue : accountsList) {
                        if (accountsListValue != null) {
                            request.addParameter("DeploymentTargets.Accounts.member." + accountsListIndex, StringUtils.fromString(accountsListValue));
                        }
                        accountsListIndex++;
                    }
                }

                if (deploymentTargets.getAccountsUrl() != null) {
                    request.addParameter("DeploymentTargets.AccountsUrl", StringUtils.fromString(deploymentTargets.getAccountsUrl()));
                }

                if (deploymentTargets.getOrganizationalUnitIds().isEmpty()
                        && !((com.amazonaws.internal.SdkInternalList<String>) deploymentTargets.getOrganizationalUnitIds()).isAutoConstruct()) {
                    request.addParameter("DeploymentTargets.OrganizationalUnitIds", "");
                }
                if (!deploymentTargets.getOrganizationalUnitIds().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) deploymentTargets.getOrganizationalUnitIds()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> organizationalUnitIdsList = (com.amazonaws.internal.SdkInternalList<String>) deploymentTargets
                            .getOrganizationalUnitIds();
                    int organizationalUnitIdsListIndex = 1;

                    for (String organizationalUnitIdsListValue : organizationalUnitIdsList) {
                        if (organizationalUnitIdsListValue != null) {
                            request.addParameter("DeploymentTargets.OrganizationalUnitIds.member." + organizationalUnitIdsListIndex,
                                    StringUtils.fromString(organizationalUnitIdsListValue));
                        }
                        organizationalUnitIdsListIndex++;
                    }
                }
            }
        }

        if (updateStackSetRequest.getPermissionModel() != null) {
            request.addParameter("PermissionModel", StringUtils.fromString(updateStackSetRequest.getPermissionModel()));
        }

        {
            AutoDeployment autoDeployment = updateStackSetRequest.getAutoDeployment();
            if (autoDeployment != null) {

                if (autoDeployment.getEnabled() != null) {
                    request.addParameter("AutoDeployment.Enabled", StringUtils.fromBoolean(autoDeployment.getEnabled()));
                }

                if (autoDeployment.getRetainStacksOnAccountRemoval() != null) {
                    request.addParameter("AutoDeployment.RetainStacksOnAccountRemoval",
                            StringUtils.fromBoolean(autoDeployment.getRetainStacksOnAccountRemoval()));
                }
            }
        }

        request.addParameter("OperationId", IdempotentUtils.resolveString(updateStackSetRequest.getOperationId()));

        if (updateStackSetRequest.getAccounts().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getAccounts()).isAutoConstruct()) {
            request.addParameter("Accounts", "");
        }
        if (!updateStackSetRequest.getAccounts().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getAccounts()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> accountsList = (com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getAccounts();
            int accountsListIndex = 1;

            for (String accountsListValue : accountsList) {
                if (accountsListValue != null) {
                    request.addParameter("Accounts.member." + accountsListIndex, StringUtils.fromString(accountsListValue));
                }
                accountsListIndex++;
            }
        }

        if (updateStackSetRequest.getRegions().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getRegions()).isAutoConstruct()) {
            request.addParameter("Regions", "");
        }
        if (!updateStackSetRequest.getRegions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getRegions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> regionsList = (com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest.getRegions();
            int regionsListIndex = 1;

            for (String regionsListValue : regionsList) {
                if (regionsListValue != null) {
                    request.addParameter("Regions.member." + regionsListIndex, StringUtils.fromString(regionsListValue));
                }
                regionsListIndex++;
            }
        }

        if (updateStackSetRequest.getCallAs() != null) {
            request.addParameter("CallAs", StringUtils.fromString(updateStackSetRequest.getCallAs()));
        }

        return request;
    }

}
