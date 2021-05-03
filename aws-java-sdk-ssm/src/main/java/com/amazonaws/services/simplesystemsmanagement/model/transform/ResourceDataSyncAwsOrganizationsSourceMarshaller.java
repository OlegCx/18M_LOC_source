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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceDataSyncAwsOrganizationsSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDataSyncAwsOrganizationsSourceMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONSOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationSourceType").build();
    private static final MarshallingInfo<List> ORGANIZATIONALUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationalUnits").build();

    private static final ResourceDataSyncAwsOrganizationsSourceMarshaller instance = new ResourceDataSyncAwsOrganizationsSourceMarshaller();

    public static ResourceDataSyncAwsOrganizationsSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDataSyncAwsOrganizationsSource resourceDataSyncAwsOrganizationsSource, ProtocolMarshaller protocolMarshaller) {

        if (resourceDataSyncAwsOrganizationsSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDataSyncAwsOrganizationsSource.getOrganizationSourceType(), ORGANIZATIONSOURCETYPE_BINDING);
            protocolMarshaller.marshall(resourceDataSyncAwsOrganizationsSource.getOrganizationalUnits(), ORGANIZATIONALUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
