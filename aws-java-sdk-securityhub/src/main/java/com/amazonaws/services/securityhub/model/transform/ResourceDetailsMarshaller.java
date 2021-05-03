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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> AWSAUTOSCALINGAUTOSCALINGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsAutoScalingAutoScalingGroup").build();
    private static final MarshallingInfo<StructuredPojo> AWSCODEBUILDPROJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsCodeBuildProject").build();
    private static final MarshallingInfo<StructuredPojo> AWSCLOUDFRONTDISTRIBUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsCloudFrontDistribution").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2INSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2Instance").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2NETWORKINTERFACE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2NetworkInterface").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2SECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2SecurityGroup").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2VOLUME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2Volume").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2VPC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2Vpc").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2EIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2Eip").build();
    private static final MarshallingInfo<StructuredPojo> AWSELBV2LOADBALANCER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsElbv2LoadBalancer").build();
    private static final MarshallingInfo<StructuredPojo> AWSELASTICSEARCHDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsElasticsearchDomain").build();
    private static final MarshallingInfo<StructuredPojo> AWSS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsS3Bucket").build();
    private static final MarshallingInfo<StructuredPojo> AWSS3ACCOUNTPUBLICACCESSBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsS3AccountPublicAccessBlock").build();
    private static final MarshallingInfo<StructuredPojo> AWSS3OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsS3Object").build();
    private static final MarshallingInfo<StructuredPojo> AWSSECRETSMANAGERSECRET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsSecretsManagerSecret").build();
    private static final MarshallingInfo<StructuredPojo> AWSIAMACCESSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIamAccessKey").build();
    private static final MarshallingInfo<StructuredPojo> AWSIAMUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIamUser").build();
    private static final MarshallingInfo<StructuredPojo> AWSIAMPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIamPolicy").build();
    private static final MarshallingInfo<StructuredPojo> AWSAPIGATEWAYV2STAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsApiGatewayV2Stage").build();
    private static final MarshallingInfo<StructuredPojo> AWSAPIGATEWAYV2API_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsApiGatewayV2Api").build();
    private static final MarshallingInfo<StructuredPojo> AWSDYNAMODBTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsDynamoDbTable").build();
    private static final MarshallingInfo<StructuredPojo> AWSAPIGATEWAYSTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsApiGatewayStage").build();
    private static final MarshallingInfo<StructuredPojo> AWSAPIGATEWAYRESTAPI_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsApiGatewayRestApi").build();
    private static final MarshallingInfo<StructuredPojo> AWSCLOUDTRAILTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsCloudTrailTrail").build();
    private static final MarshallingInfo<StructuredPojo> AWSSSMPATCHCOMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsSsmPatchCompliance").build();
    private static final MarshallingInfo<StructuredPojo> AWSCERTIFICATEMANAGERCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsCertificateManagerCertificate").build();
    private static final MarshallingInfo<StructuredPojo> AWSREDSHIFTCLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsRedshiftCluster").build();
    private static final MarshallingInfo<StructuredPojo> AWSELBLOADBALANCER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsElbLoadBalancer").build();
    private static final MarshallingInfo<StructuredPojo> AWSIAMGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIamGroup").build();
    private static final MarshallingInfo<StructuredPojo> AWSIAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIamRole").build();
    private static final MarshallingInfo<StructuredPojo> AWSKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsKmsKey").build();
    private static final MarshallingInfo<StructuredPojo> AWSLAMBDAFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsLambdaFunction").build();
    private static final MarshallingInfo<StructuredPojo> AWSLAMBDALAYERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsLambdaLayerVersion").build();
    private static final MarshallingInfo<StructuredPojo> AWSRDSDBINSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsRdsDbInstance").build();
    private static final MarshallingInfo<StructuredPojo> AWSSNSTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsSnsTopic").build();
    private static final MarshallingInfo<StructuredPojo> AWSSQSQUEUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsSqsQueue").build();
    private static final MarshallingInfo<StructuredPojo> AWSWAFWEBACL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsWafWebAcl").build();
    private static final MarshallingInfo<StructuredPojo> AWSRDSDBSNAPSHOT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsRdsDbSnapshot").build();
    private static final MarshallingInfo<StructuredPojo> AWSRDSDBCLUSTERSNAPSHOT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsRdsDbClusterSnapshot").build();
    private static final MarshallingInfo<StructuredPojo> AWSRDSDBCLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsRdsDbCluster").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Container").build();
    private static final MarshallingInfo<Map> OTHER_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Other").build();

    private static final ResourceDetailsMarshaller instance = new ResourceDetailsMarshaller();

    public static ResourceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDetails resourceDetails, ProtocolMarshaller protocolMarshaller) {

        if (resourceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDetails.getAwsAutoScalingAutoScalingGroup(), AWSAUTOSCALINGAUTOSCALINGGROUP_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsCodeBuildProject(), AWSCODEBUILDPROJECT_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsCloudFrontDistribution(), AWSCLOUDFRONTDISTRIBUTION_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2Instance(), AWSEC2INSTANCE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2NetworkInterface(), AWSEC2NETWORKINTERFACE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2SecurityGroup(), AWSEC2SECURITYGROUP_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2Volume(), AWSEC2VOLUME_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2Vpc(), AWSEC2VPC_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2Eip(), AWSEC2EIP_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsElbv2LoadBalancer(), AWSELBV2LOADBALANCER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsElasticsearchDomain(), AWSELASTICSEARCHDOMAIN_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsS3Bucket(), AWSS3BUCKET_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsS3AccountPublicAccessBlock(), AWSS3ACCOUNTPUBLICACCESSBLOCK_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsS3Object(), AWSS3OBJECT_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsSecretsManagerSecret(), AWSSECRETSMANAGERSECRET_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsIamAccessKey(), AWSIAMACCESSKEY_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsIamUser(), AWSIAMUSER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsIamPolicy(), AWSIAMPOLICY_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsApiGatewayV2Stage(), AWSAPIGATEWAYV2STAGE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsApiGatewayV2Api(), AWSAPIGATEWAYV2API_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsDynamoDbTable(), AWSDYNAMODBTABLE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsApiGatewayStage(), AWSAPIGATEWAYSTAGE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsApiGatewayRestApi(), AWSAPIGATEWAYRESTAPI_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsCloudTrailTrail(), AWSCLOUDTRAILTRAIL_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsSsmPatchCompliance(), AWSSSMPATCHCOMPLIANCE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsCertificateManagerCertificate(), AWSCERTIFICATEMANAGERCERTIFICATE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsRedshiftCluster(), AWSREDSHIFTCLUSTER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsElbLoadBalancer(), AWSELBLOADBALANCER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsIamGroup(), AWSIAMGROUP_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsIamRole(), AWSIAMROLE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsKmsKey(), AWSKMSKEY_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsLambdaFunction(), AWSLAMBDAFUNCTION_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsLambdaLayerVersion(), AWSLAMBDALAYERVERSION_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsRdsDbInstance(), AWSRDSDBINSTANCE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsSnsTopic(), AWSSNSTOPIC_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsSqsQueue(), AWSSQSQUEUE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsWafWebAcl(), AWSWAFWEBACL_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsRdsDbSnapshot(), AWSRDSDBSNAPSHOT_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsRdsDbClusterSnapshot(), AWSRDSDBCLUSTERSNAPSHOT_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsRdsDbCluster(), AWSRDSDBCLUSTER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getContainer(), CONTAINER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getOther(), OTHER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
