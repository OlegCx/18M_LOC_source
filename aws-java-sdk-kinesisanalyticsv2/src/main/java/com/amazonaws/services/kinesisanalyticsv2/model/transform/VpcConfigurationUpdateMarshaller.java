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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcConfigurationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcConfigurationUpdateMarshaller {

    private static final MarshallingInfo<String> VPCCONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfigurationId").build();
    private static final MarshallingInfo<List> SUBNETIDUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetIdUpdates").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIdUpdates").build();

    private static final VpcConfigurationUpdateMarshaller instance = new VpcConfigurationUpdateMarshaller();

    public static VpcConfigurationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcConfigurationUpdate vpcConfigurationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (vpcConfigurationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcConfigurationUpdate.getVpcConfigurationId(), VPCCONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(vpcConfigurationUpdate.getSubnetIdUpdates(), SUBNETIDUPDATES_BINDING);
            protocolMarshaller.marshall(vpcConfigurationUpdate.getSecurityGroupIdUpdates(), SECURITYGROUPIDUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
