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
package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigurationItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationItemMarshaller {

    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<java.util.Date> CONFIGURATIONITEMCAPTURETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationItemCaptureTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CONFIGURATIONITEMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationItemStatus").build();
    private static final MarshallingInfo<String> CONFIGURATIONSTATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationStateId").build();
    private static final MarshallingInfo<String> CONFIGURATIONITEMMD5HASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationItemMD5Hash").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceId").build();
    private static final MarshallingInfo<String> RESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceName").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsRegion").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZone").build();
    private static final MarshallingInfo<java.util.Date> RESOURCECREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceCreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> RELATEDEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("relatedEvents").build();
    private static final MarshallingInfo<List> RELATIONSHIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("relationships").build();
    private static final MarshallingInfo<String> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<Map> SUPPLEMENTARYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supplementaryConfiguration").build();

    private static final ConfigurationItemMarshaller instance = new ConfigurationItemMarshaller();

    public static ConfigurationItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigurationItem configurationItem, ProtocolMarshaller protocolMarshaller) {

        if (configurationItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configurationItem.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(configurationItem.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(configurationItem.getConfigurationItemCaptureTime(), CONFIGURATIONITEMCAPTURETIME_BINDING);
            protocolMarshaller.marshall(configurationItem.getConfigurationItemStatus(), CONFIGURATIONITEMSTATUS_BINDING);
            protocolMarshaller.marshall(configurationItem.getConfigurationStateId(), CONFIGURATIONSTATEID_BINDING);
            protocolMarshaller.marshall(configurationItem.getConfigurationItemMD5Hash(), CONFIGURATIONITEMMD5HASH_BINDING);
            protocolMarshaller.marshall(configurationItem.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(configurationItem.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(configurationItem.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(configurationItem.getResourceName(), RESOURCENAME_BINDING);
            protocolMarshaller.marshall(configurationItem.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(configurationItem.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(configurationItem.getResourceCreationTime(), RESOURCECREATIONTIME_BINDING);
            protocolMarshaller.marshall(configurationItem.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(configurationItem.getRelatedEvents(), RELATEDEVENTS_BINDING);
            protocolMarshaller.marshall(configurationItem.getRelationships(), RELATIONSHIPS_BINDING);
            protocolMarshaller.marshall(configurationItem.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(configurationItem.getSupplementaryConfiguration(), SUPPLEMENTARYCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
