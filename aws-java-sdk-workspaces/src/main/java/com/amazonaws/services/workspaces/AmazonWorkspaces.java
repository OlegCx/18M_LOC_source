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
package com.amazonaws.services.workspaces;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workspaces.model.*;

/**
 * Interface for accessing Amazon WorkSpaces.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspaces.AbstractAmazonWorkspaces} instead.
 * </p>
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
 * users.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkspaces {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "workspaces";

    /**
     * Overrides the default endpoint for this client ("https://workspaces.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "workspaces.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://workspaces.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "workspaces.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://workspaces.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonWorkspaces#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Associates the specified connection alias with the specified directory to enable cross-Region redirection. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param associateConnectionAliasRequest
     * @return Result of the AssociateConnectionAlias operation returned by the service.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.AssociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateConnectionAliasResult associateConnectionAlias(AssociateConnectionAliasRequest associateConnectionAliasRequest);

    /**
     * <p>
     * Associates the specified IP access control group with the specified directory.
     * </p>
     * 
     * @param associateIpGroupsRequest
     * @return Result of the AssociateIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.AssociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateIpGroupsResult associateIpGroups(AssociateIpGroupsRequest associateIpGroupsRequest);

    /**
     * <p>
     * Adds one or more rules to the specified IP access control group.
     * </p>
     * <p>
     * This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the
     * rules.
     * </p>
     * 
     * @param authorizeIpRulesRequest
     * @return Result of the AuthorizeIpRules operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.AuthorizeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AuthorizeIpRules" target="_top">AWS
     *      API Documentation</a>
     */
    AuthorizeIpRulesResult authorizeIpRules(AuthorizeIpRulesRequest authorizeIpRulesRequest);

    /**
     * <p>
     * Copies the specified image from the specified Region to the current Region. For more information about copying
     * images, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/copy-custom-image.html"> Copy a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <note>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In the AWS GovCloud (US-West) Region, to copy images to and from other AWS Regions, contact AWS Support.
     * </p>
     * </note> <important>
     * <p>
     * Before copying a shared image, be sure to verify that it has been shared from the correct AWS account. To
     * determine if an image has been shared and to see the AWS account ID that owns an image, use the <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImages.html"
     * >DescribeWorkSpaceImages</a> and <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImagePermissions.html"
     * >DescribeWorkspaceImagePermissions</a> API operations.
     * </p>
     * </important>
     * 
     * @param copyWorkspaceImageRequest
     * @return Result of the CopyWorkspaceImage operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CopyWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CopyWorkspaceImage" target="_top">AWS
     *      API Documentation</a>
     */
    CopyWorkspaceImageResult copyWorkspaceImage(CopyWorkspaceImageRequest copyWorkspaceImageRequest);

    /**
     * <p>
     * Creates the specified connection alias for use with cross-Region redirection. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param createConnectionAliasRequest
     * @return Result of the CreateConnectionAlias operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.CreateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectionAliasResult createConnectionAlias(CreateConnectionAliasRequest createConnectionAliasRequest);

    /**
     * <p>
     * Creates an IP access control group.
     * </p>
     * <p>
     * An IP access control group provides you with the ability to control the IP addresses from which users are allowed
     * to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and
     * then associate the group with your directory. You can add rules when you create the group or at any time using
     * <a>AuthorizeIpRules</a>.
     * </p>
     * <p>
     * There is a default IP access control group associated with your directory. If you don't associate an IP access
     * control group with your directory, the default group is used. The default group includes a default rule that
     * allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for
     * your directory.
     * </p>
     * 
     * @param createIpGroupRequest
     * @return Result of the CreateIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceCreationFailedException
     *         The resource could not be created.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.CreateIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIpGroupResult createIpGroup(CreateIpGroupRequest createIpGroupRequest);

    /**
     * <p>
     * Creates the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AmazonWorkspaces.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates the specified WorkSpace bundle. For more information about creating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/create-custom-bundle.html"> Create a Custom
     * WorkSpaces Image and Bundle</a>.
     * </p>
     * 
     * @param createWorkspaceBundleRequest
     * @return Result of the CreateWorkspaceBundle operation returned by the service.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.CreateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkspaceBundleResult createWorkspaceBundle(CreateWorkspaceBundleRequest createWorkspaceBundleRequest);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * 
     * @param createWorkspacesRequest
     * @return Result of the CreateWorkspaces operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest createWorkspacesRequest);

    /**
     * <p>
     * Deletes the specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <important>
     * <p>
     * <b>If you will no longer be using a fully qualified domain name (FQDN) as the registration code for your
     * WorkSpaces users, you must take certain precautions to prevent potential security issues.</b> For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html#cross-region-redirection-security-considerations"
     * > Security Considerations if You Stop Using Cross-Region Redirection</a>.
     * </p>
     * </important> <note>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </note>
     * 
     * @param deleteConnectionAliasRequest
     * @return Result of the DeleteConnectionAlias operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DeleteConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConnectionAliasResult deleteConnectionAlias(DeleteConnectionAliasRequest deleteConnectionAliasRequest);

    /**
     * <p>
     * Deletes the specified IP access control group.
     * </p>
     * <p>
     * You cannot delete an IP access control group that is associated with a directory.
     * </p>
     * 
     * @param deleteIpGroupRequest
     * @return Result of the DeleteIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIpGroupResult deleteIpGroup(DeleteIpGroupRequest deleteIpGroupRequest);

    /**
     * <p>
     * Deletes the specified tags from the specified WorkSpaces resource.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified WorkSpace bundle. For more information about deleting WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete_bundle.html"> Delete a Custom WorkSpaces
     * Bundle or Image</a>.
     * </p>
     * 
     * @param deleteWorkspaceBundleRequest
     * @return Result of the DeleteWorkspaceBundle operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkspaceBundleResult deleteWorkspaceBundle(DeleteWorkspaceBundleRequest deleteWorkspaceBundleRequest);

    /**
     * <p>
     * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
     * associated with the image and unshare the image if it is shared with other accounts.
     * </p>
     * 
     * @param deleteWorkspaceImageRequest
     * @return Result of the DeleteWorkspaceImage operation returned by the service.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest deleteWorkspaceImageRequest);

    /**
     * <p>
     * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister
     * the directory.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">AWS Directory Services pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param deregisterWorkspaceDirectoryRequest
     * @return Result of the DeregisterWorkspaceDirectory operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @sample AmazonWorkspaces.DeregisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeregisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterWorkspaceDirectoryResult deregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest deregisterWorkspaceDirectoryRequest);

    /**
     * <p>
     * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param describeAccountRequest
     * @return Result of the DescribeAccount operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccount" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAccountResult describeAccount(DescribeAccountRequest describeAccountRequest);

    /**
     * <p>
     * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the
     * specified account.
     * </p>
     * 
     * @param describeAccountModificationsRequest
     * @return Result of the DescribeAccountModifications operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeAccountModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccountModifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountModificationsResult describeAccountModifications(DescribeAccountModificationsRequest describeAccountModificationsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param describeClientPropertiesRequest
     * @return Result of the DescribeClientProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClientPropertiesResult describeClientProperties(DescribeClientPropertiesRequest describeClientPropertiesRequest);

    /**
     * <p>
     * Describes the permissions that the owner of a connection alias has granted to another AWS account for the
     * specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasPermissionsRequest
     * @return Result of the DescribeConnectionAliasPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DescribeConnectionAliasPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliasPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConnectionAliasPermissionsResult describeConnectionAliasPermissions(
            DescribeConnectionAliasPermissionsRequest describeConnectionAliasPermissionsRequest);

    /**
     * <p>
     * Retrieves a list that describes the connection aliases used for cross-Region redirection. For more information,
     * see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html">
     * Cross-Region Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasesRequest
     * @return Result of the DescribeConnectionAliases operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DescribeConnectionAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliases"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConnectionAliasesResult describeConnectionAliases(DescribeConnectionAliasesRequest describeConnectionAliasesRequest);

    /**
     * <p>
     * Describes one or more of your IP access control groups.
     * </p>
     * 
     * @param describeIpGroupsRequest
     * @return Result of the DescribeIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeIpGroupsResult describeIpGroups(DescribeIpGroupsRequest describeIpGroupsRequest);

    /**
     * <p>
     * Describes the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Retrieves a list that describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @return Result of the DescribeWorkspaceBundles operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation.
     *
     * @see #describeWorkspaceBundles(DescribeWorkspaceBundlesRequest)
     */
    DescribeWorkspaceBundlesResult describeWorkspaceBundles();

    /**
     * <p>
     * Describes the available directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @return Result of the DescribeWorkspaceDirectories operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation.
     *
     * @see #describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest)
     */
    DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories();

    /**
     * <p>
     * Describes the permissions that the owner of an image has granted to other AWS accounts for an image.
     * </p>
     * 
     * @param describeWorkspaceImagePermissionsRequest
     * @return Result of the DescribeWorkspaceImagePermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceImagePermissionsResult describeWorkspaceImagePermissions(DescribeWorkspaceImagePermissionsRequest describeWorkspaceImagePermissionsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
     * all images in the account are described.
     * </p>
     * 
     * @param describeWorkspaceImagesRequest
     * @return Result of the DescribeWorkspaceImages operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeWorkspaceImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImages"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceImagesResult describeWorkspaceImages(DescribeWorkspaceImagesRequest describeWorkspaceImagesRequest);

    /**
     * <p>
     * Describes the snapshots for the specified WorkSpace.
     * </p>
     * 
     * @param describeWorkspaceSnapshotsRequest
     * @return Result of the DescribeWorkspaceSnapshots operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeWorkspaceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceSnapshotsResult describeWorkspaceSnapshots(DescribeWorkspaceSnapshotsRequest describeWorkspaceSnapshotsRequest);

    /**
     * <p>
     * Describes the specified WorkSpaces.
     * </p>
     * <p>
     * You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify
     * only one filter at a time.
     * </p>
     * 
     * @param describeWorkspacesRequest
     * @return Result of the DescribeWorkspaces operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest describeWorkspacesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspaces(DescribeWorkspacesRequest)
     */
    DescribeWorkspacesResult describeWorkspaces();

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return Result of the DescribeWorkspacesConnectionStatus operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest);

    /**
     * <p>
     * Disassociates a connection alias from a directory. Disassociating a connection alias disables cross-Region
     * redirection between two directories in different AWS Regions. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param disassociateConnectionAliasRequest
     * @return Result of the DisassociateConnectionAlias operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.DisassociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateConnectionAliasResult disassociateConnectionAlias(DisassociateConnectionAliasRequest disassociateConnectionAliasRequest);

    /**
     * <p>
     * Disassociates the specified IP access control group from the specified directory.
     * </p>
     * 
     * @param disassociateIpGroupsRequest
     * @return Result of the DisassociateIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DisassociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateIpGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateIpGroupsResult disassociateIpGroups(DisassociateIpGroupsRequest disassociateIpGroupsRequest);

    /**
     * <p>
     * Imports the specified Windows 10 Bring Your Own License (BYOL) image into Amazon WorkSpaces. The image must be an
     * already licensed Amazon EC2 image that is in your AWS account, and you must own the image. For more information
     * about creating BYOL images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html"> Bring Your Own Windows
     * Desktop Licenses</a>.
     * </p>
     * 
     * @param importWorkspaceImageRequest
     * @return Result of the ImportWorkspaceImage operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.ImportWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    ImportWorkspaceImageResult importWorkspaceImage(ImportWorkspaceImageRequest importWorkspaceImageRequest);

    /**
     * <p>
     * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management
     * interface when you enable Bring Your Own License (BYOL).
     * </p>
     * <p>
     * This operation can be run only by AWS accounts that are enabled for BYOL. If your account isn't enabled for BYOL,
     * you'll receive an <code>AccessDeniedException</code> error.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     * 
     * @param listAvailableManagementCidrRangesRequest
     * @return Result of the ListAvailableManagementCidrRanges operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ListAvailableManagementCidrRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAvailableManagementCidrRanges"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableManagementCidrRangesResult listAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest listAvailableManagementCidrRangesRequest);

    /**
     * <p>
     * Migrates a WorkSpace from one operating system or bundle type to another, while retaining the data on the user
     * volume.
     * </p>
     * <p>
     * The migration process recreates the WorkSpace by using a new root volume from the target bundle image and the
     * user volume from the last available snapshot of the original WorkSpace. During migration, the original
     * <code>D:\Users\%USERNAME%</code> user profile folder is renamed to
     * <code>D:\Users\%USERNAME%MMddyyTHHmmss%.NotMigrated</code>. A new <code>D:\Users\%USERNAME%\</code> folder is
     * generated by the new OS. Certain files in the old user profile are moved to the new user profile.
     * </p>
     * <p>
     * For available migration scenarios, details about what happens during migration, and best practices, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/migrate-workspaces.html">Migrate a WorkSpace</a>.
     * </p>
     * 
     * @param migrateWorkspaceRequest
     * @return Result of the MigrateWorkspace operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.MigrateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/MigrateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    MigrateWorkspaceResult migrateWorkspace(MigrateWorkspaceRequest migrateWorkspaceRequest);

    /**
     * <p>
     * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param modifyAccountRequest
     * @return Result of the ModifyAccount operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifyAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyAccount" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyAccountResult modifyAccount(ModifyAccountRequest modifyAccountRequest);

    /**
     * <p>
     * Modifies the properties of the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param modifyClientPropertiesRequest
     * @return Result of the ModifyClientProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ModifyClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyClientPropertiesResult modifyClientProperties(ModifyClientPropertiesRequest modifyClientPropertiesRequest);

    /**
     * <p>
     * Modifies the self-service WorkSpace management capabilities for your users. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/enable-user-self-service-workspace-management.html"
     * >Enable Self-Service WorkSpace Management Capabilities for Your Users</a>.
     * </p>
     * 
     * @param modifySelfservicePermissionsRequest
     * @return Result of the ModifySelfservicePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifySelfservicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySelfservicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    ModifySelfservicePermissionsResult modifySelfservicePermissions(ModifySelfservicePermissionsRequest modifySelfservicePermissionsRequest);

    /**
     * <p>
     * Specifies which devices and operating systems users can use to access their WorkSpaces. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html#control-device-access">
     * Control Device Access</a>.
     * </p>
     * 
     * @param modifyWorkspaceAccessPropertiesRequest
     * @return Result of the ModifyWorkspaceAccessProperties operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ModifyWorkspaceAccessProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceAccessProperties"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyWorkspaceAccessPropertiesResult modifyWorkspaceAccessProperties(ModifyWorkspaceAccessPropertiesRequest modifyWorkspaceAccessPropertiesRequest);

    /**
     * <p>
     * Modify the default properties used to create WorkSpaces.
     * </p>
     * 
     * @param modifyWorkspaceCreationPropertiesRequest
     * @return Result of the ModifyWorkspaceCreationProperties operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.ModifyWorkspaceCreationProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceCreationProperties"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyWorkspaceCreationPropertiesResult modifyWorkspaceCreationProperties(ModifyWorkspaceCreationPropertiesRequest modifyWorkspaceCreationPropertiesRequest);

    /**
     * <p>
     * Modifies the specified WorkSpace properties. For important information about how to modify the size of the root
     * and user volumes, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html">
     * Modify a WorkSpace</a>.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return Result of the ModifyWorkspaceProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws UnsupportedWorkspaceConfigurationException
     *         The configuration of this WorkSpace is not supported for this operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/required-service-components.html">Required
     *         Configuration and Service Components for WorkSpaces </a>.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest);

    /**
     * <p>
     * Sets the state of the specified WorkSpace.
     * </p>
     * <p>
     * To maintain a WorkSpace without being interrupted, set the WorkSpace state to <code>ADMIN_MAINTENANCE</code>.
     * WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop
     * WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the <code>ADMIN_MAINTENANCE</code>
     * state.
     * </p>
     * 
     * @param modifyWorkspaceStateRequest
     * @return Result of the ModifyWorkspaceState operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifyWorkspaceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceState"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyWorkspaceStateResult modifyWorkspaceState(ModifyWorkspaceStateRequest modifyWorkspaceStateRequest);

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot reboot a WorkSpace unless its state is <code>AVAILABLE</code> or <code>UNHEALTHY</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have rebooted.
     * </p>
     * 
     * @param rebootWorkspacesRequest
     * @return Result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest);

    /**
     * <p>
     * Rebuilds the specified WorkSpace.
     * </p>
     * <p>
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, <code>STOPPED</code>, or <code>REBOOTING</code>.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/reset-workspace.html">Rebuild
     * a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
     * </p>
     * 
     * @param rebuildWorkspacesRequest
     * @return Result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest);

    /**
     * <p>
     * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * registered. If this is the first time you are registering a directory, you will need to create the
     * workspaces_DefaultRole role before you can register a directory. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role">
     * Creating the workspaces_DefaultRole Role</a>.
     * </p>
     * 
     * @param registerWorkspaceDirectoryRequest
     * @return Result of the RegisterWorkspaceDirectory operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws WorkspacesDefaultRoleNotFoundException
     *         The workspaces_DefaultRole role could not be found. If this is the first time you are registering a
     *         directory, you will need to create the workspaces_DefaultRole role before you can register a directory.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role"
     *         >Creating the workspaces_DefaultRole Role</a>.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws UnsupportedNetworkConfigurationException
     *         The configuration of this network is not supported for this operation, or your network configuration
     *         conflicts with the Amazon WorkSpaces management network IP range. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces-vpc.html"> Configure a
     *         VPC for Amazon WorkSpaces</a>.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.RegisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RegisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest registerWorkspaceDirectoryRequest);

    /**
     * <p>
     * Restores the specified WorkSpace to its last known healthy state.
     * </p>
     * <p>
     * You cannot restore a WorkSpace unless its state is <code> AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, or <code>STOPPED</code>.
     * </p>
     * <p>
     * Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/restore-workspace.html">Restore a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpace is completely restored.
     * </p>
     * 
     * @param restoreWorkspaceRequest
     * @return Result of the RestoreWorkspace operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.RestoreWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RestoreWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    RestoreWorkspaceResult restoreWorkspace(RestoreWorkspaceRequest restoreWorkspaceRequest);

    /**
     * <p>
     * Removes one or more rules from the specified IP access control group.
     * </p>
     * 
     * @param revokeIpRulesRequest
     * @return Result of the RevokeIpRules operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.RevokeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RevokeIpRules" target="_top">AWS API
     *      Documentation</a>
     */
    RevokeIpRulesResult revokeIpRules(RevokeIpRulesRequest revokeIpRulesRequest);

    /**
     * <p>
     * Starts the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot start a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>STOPPED</code>.
     * </p>
     * 
     * @param startWorkspacesRequest
     * @return Result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    StartWorkspacesResult startWorkspaces(StartWorkspacesRequest startWorkspacesRequest);

    /**
     * <p>
     * Stops the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot stop a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>AVAILABLE</code>, <code>IMPAIRED</code>, <code>UNHEALTHY</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @return Result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest stopWorkspacesRequest);

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <important>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact AWS Support before terminating the WorkSpace.
     * </p>
     * </important>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated. After a
     * WorkSpace is terminated, the <code>TERMINATED</code> state is returned only briefly before the WorkSpace
     * directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated,
     * check for the WorkSpace ID by using <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkSpaces</a>. If
     * the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">AWS Directory Services pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param terminateWorkspacesRequest
     * @return Result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest terminateWorkspacesRequest);

    /**
     * <p>
     * Shares or unshares a connection alias with one account by specifying whether that account has permission to
     * associate the connection alias with a directory. If the association permission is granted, the connection alias
     * is shared with that account. If the association permission is revoked, the connection alias is unshared with the
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateConnectionAliasPermissionRequest
     * @return Result of the UpdateConnectionAliasPermission operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.UpdateConnectionAliasPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectionAliasPermission"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConnectionAliasPermissionResult updateConnectionAliasPermission(UpdateConnectionAliasPermissionRequest updateConnectionAliasPermissionRequest);

    /**
     * <p>
     * Replaces the current rules of the specified IP access control group with the specified rules.
     * </p>
     * 
     * @param updateRulesOfIpGroupRequest
     * @return Result of the UpdateRulesOfIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.UpdateRulesOfIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateRulesOfIpGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRulesOfIpGroupResult updateRulesOfIpGroup(UpdateRulesOfIpGroupRequest updateRulesOfIpGroupRequest);

    /**
     * <p>
     * Updates a WorkSpace bundle with a new image. For more information about updating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/update-custom-bundle.html"> Update a Custom
     * WorkSpaces Bundle</a>.
     * </p>
     * <important>
     * <p>
     * Existing WorkSpaces aren't automatically updated when you update the bundle that they're based on. To update
     * existing WorkSpaces that are based on a bundle that you've updated, you must either rebuild the WorkSpaces or
     * delete and recreate them.
     * </p>
     * </important>
     * 
     * @param updateWorkspaceBundleRequest
     * @return Result of the UpdateWorkspaceBundle operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.UpdateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkspaceBundleResult updateWorkspaceBundle(UpdateWorkspaceBundleRequest updateWorkspaceBundleRequest);

    /**
     * <p>
     * Shares or unshares an image with one account in the same AWS Region by specifying whether that account has
     * permission to copy the image. If the copy image permission is granted, the image is shared with that account. If
     * the copy image permission is revoked, the image is unshared with the account.
     * </p>
     * <p>
     * After an image has been shared, the recipient account can copy the image to other AWS Regions as needed.
     * </p>
     * <note>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In the AWS GovCloud (US-West) Region, to copy images to and from other AWS Regions, contact AWS Support.
     * </p>
     * </note>
     * <p>
     * For more information about sharing images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/share-custom-image.html"> Share or Unshare a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To delete an image that has been shared, you must unshare the image before you delete it.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sharing Bring Your Own License (BYOL) images across AWS accounts isn't supported at this time in the AWS GovCloud
     * (US-West) Region. To share BYOL images across accounts in the AWS GovCloud (US-West) Region, contact AWS Support.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateWorkspaceImagePermissionRequest
     * @return Result of the UpdateWorkspaceImagePermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.UpdateWorkspaceImagePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceImagePermission"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkspaceImagePermissionResult updateWorkspaceImagePermission(UpdateWorkspaceImagePermissionRequest updateWorkspaceImagePermissionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
