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
package com.amazonaws.services.eks;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.*;
import com.amazonaws.services.eks.waiters.AmazonEKSWaiters;

/**
 * Abstract implementation of {@code AmazonEKS}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEKS implements AmazonEKS {

    protected AbstractAmazonEKS() {
    }

    @Override
    public AssociateEncryptionConfigResult associateEncryptionConfig(AssociateEncryptionConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateIdentityProviderConfigResult associateIdentityProviderConfig(AssociateIdentityProviderConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAddonResult createAddon(CreateAddonRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFargateProfileResult createFargateProfile(CreateFargateProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNodegroupResult createNodegroup(CreateNodegroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAddonResult deleteAddon(DeleteAddonRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFargateProfileResult deleteFargateProfile(DeleteFargateProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNodegroupResult deleteNodegroup(DeleteNodegroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAddonResult describeAddon(DescribeAddonRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAddonVersionsResult describeAddonVersions(DescribeAddonVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFargateProfileResult describeFargateProfile(DescribeFargateProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIdentityProviderConfigResult describeIdentityProviderConfig(DescribeIdentityProviderConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNodegroupResult describeNodegroup(DescribeNodegroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeUpdateResult describeUpdate(DescribeUpdateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateIdentityProviderConfigResult disassociateIdentityProviderConfig(DisassociateIdentityProviderConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAddonsResult listAddons(ListAddonsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFargateProfilesResult listFargateProfiles(ListFargateProfilesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIdentityProviderConfigsResult listIdentityProviderConfigs(ListIdentityProviderConfigsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListNodegroupsResult listNodegroups(ListNodegroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUpdatesResult listUpdates(ListUpdatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAddonResult updateAddon(UpdateAddonRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateClusterConfigResult updateClusterConfig(UpdateClusterConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateClusterVersionResult updateClusterVersion(UpdateClusterVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateNodegroupConfigResult updateNodegroupConfig(UpdateNodegroupConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateNodegroupVersionResult updateNodegroupVersion(UpdateNodegroupVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonEKSWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
