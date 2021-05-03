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
package com.amazonaws.services.cloudfront;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters;

/**
 * Interface for accessing CloudFront.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudfront.AbstractAmazonCloudFront} instead.
 * </p>
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about
 * CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon
 * CloudFront Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudFront {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudfront";

    /**
     * Overrides the default endpoint for this client ("https://cloudfront.amazonaws.com/"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudfront.amazonaws.com/") or a full URL, including the protocol
     * (ex: "https://cloudfront.amazonaws.com/"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "cloudfront.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://cloudfront.amazonaws.com/") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudFront#setEndpoint(String)}, sets the regional endpoint for this client's
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
     * Creates a cache policy.
     * </p>
     * <p>
     * After you create a cache policy, you can attach it to one or more cache behaviors. When it’s attached to a cache
     * behavior, the cache policy determines the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values that CloudFront includes in the <i>cache key</i>. These values can include HTTP headers, cookies, and
     * URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront
     * cache.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The headers, cookies, and query strings that are included in the cache key are automatically included in requests
     * that CloudFront sends to the origin. CloudFront sends a request when it can’t find an object in its cache that
     * matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the
     * cache key, use <code>OriginRequestPolicy</code>.
     * </p>
     * <p>
     * For more information about cache policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     * >Controlling the cache key</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCachePolicyRequest
     * @return Result of the CreateCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws CachePolicyAlreadyExistsException
     *         A cache policy with this name already exists. You must provide a unique name. To modify an existing cache
     *         policy, use <code>UpdateCachePolicy</code>.
     * @throws TooManyCachePoliciesException
     *         You have reached the maximum number of cache policies for this AWS account. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyHeadersInCachePolicyException
     *         The number of headers in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInCachePolicyException
     *         The number of cookies in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInCachePolicyException
     *         The number of query strings in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.CreateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCachePolicyResult createCachePolicy(CreateCachePolicyRequest createCachePolicyRequest);

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity (OAI). An origin access identity is a special
     *        CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of
     *        your Amazon S3 content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *        > Restricting Access to Amazon S3 Content by Using an Origin Access Identity</a> in the <i>Amazon
     *        CloudFront Developer Guide</i>.
     * @return Result of the CreateCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws CloudFrontOriginAccessIdentityAlreadyExistsException
     *         If the <code>CallerReference</code> is a value you already sent in a previous request to create an
     *         identity but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     *         original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyCloudFrontOriginAccessIdentitiesException
     *         Processing your request would cause you to exceed the maximum number of origin access identities allowed.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to
     * be delivered from, and the details about how to track and manage content delivery. Send a <code>POST</code>
     * request to the <code>/<i>CloudFront API version</i>/distribution</code>/<code>distribution ID</code> resource.
     * </p>
     * <important>
     * <p>
     * When you update a distribution, there are more required fields than when you create a distribution. When you
     * update your distribution by using <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>, follow the steps included in the documentation to get the current configuration and then
     * make your updates. This helps to make sure that you include all of the required fields. To view a summary, see <a
     * href
     * ="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
     * >Required Fields for Create Distribution and Update Distribution</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </important>
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return Result of the CreateDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws DistributionAlreadyExistsException
     *         The caller reference you attempted to create the distribution with is associated with another
     *         distribution.
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InvalidViewerCertificateException
     *         A viewer certificate specified is not valid.
     * @throws InvalidMinimumProtocolVersionException
     *         The minimum protocol version specified is not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyDistributionsException
     *         Processing your request would cause you to exceed the maximum number of distributions allowed.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     *         An invalid error code was specified.
     * @throws InvalidResponseCodeException
     *         A response code is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyOriginGroupsPerDistributionException
     *         Processing your request would cause you to exceed the maximum number of origin groups allowed.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     *         Your request contains too many headers in forwarded values.
     * @throws InvalidHeadersForS3OriginException
     *         The headers specified are not valid for an Amazon S3 origin.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     *         The location code specified is not valid.
     * @throws InvalidGeoRestrictionParameterException
     *         The specified geo restriction parameter is not valid.
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     *         The TTL order specified is not valid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @throws TooManyOriginCustomHeadersException
     *         Your request contains too many origin custom headers.
     * @throws TooManyQueryStringParametersException
     *         Your request contains too many query string parameters.
     * @throws InvalidQueryStringParametersException
     *         The query string parameters specified are not valid.
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyDistributionsWithSingleFunctionARNException
     *         The maximum number of distributions have been associated with the specified Lambda function.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws TooManyDistributionsWithFunctionAssociationsException
     *         You have reached the maximum number of distributions that are associated with a CloudFront function. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyFunctionAssociationsException
     *         You have reached the maximum number of CloudFront function associations for this distribution. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws InvalidFunctionAssociationException
     *         A CloudFront function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     *         The read timeout specified for the origin is not valid.
     * @throws InvalidOriginKeepaliveTimeoutException
     *         The keep alive timeout specified for the origin is not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws TooManyDistributionsAssociatedToCachePolicyException
     *         The maximum number of distributions have been associated with the specified cache policy. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws TooManyDistributionsAssociatedToOriginRequestPolicyException
     *         The maximum number of distributions have been associated with the specified origin request policy. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyDistributionsAssociatedToKeyGroupException
     *         The number of distributions that reference this key group is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyKeyGroupsAssociatedToDistributionException
     *         The number of key groups referenced by this distribution is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TrustedKeyGroupDoesNotExistException
     *         The specified key group does not exist.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws RealtimeLogConfigOwnerMismatchException
     *         The specified real-time log configuration belongs to a different AWS account.
     * @sample AmazonCloudFront.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDistributionResult createDistribution(CreateDistributionRequest createDistributionRequest);

    /**
     * <p>
     * Create a new distribution with tags.
     * </p>
     * 
     * @param createDistributionWithTagsRequest
     *        The request to create a new distribution with tags.
     * @return Result of the CreateDistributionWithTags operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws DistributionAlreadyExistsException
     *         The caller reference you attempted to create the distribution with is associated with another
     *         distribution.
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InvalidViewerCertificateException
     *         A viewer certificate specified is not valid.
     * @throws InvalidMinimumProtocolVersionException
     *         The minimum protocol version specified is not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyDistributionsException
     *         Processing your request would cause you to exceed the maximum number of distributions allowed.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     *         An invalid error code was specified.
     * @throws InvalidResponseCodeException
     *         A response code is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyOriginGroupsPerDistributionException
     *         Processing your request would cause you to exceed the maximum number of origin groups allowed.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     *         Your request contains too many headers in forwarded values.
     * @throws InvalidHeadersForS3OriginException
     *         The headers specified are not valid for an Amazon S3 origin.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     *         The location code specified is not valid.
     * @throws InvalidGeoRestrictionParameterException
     *         The specified geo restriction parameter is not valid.
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     *         The TTL order specified is not valid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @throws TooManyOriginCustomHeadersException
     *         Your request contains too many origin custom headers.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws TooManyQueryStringParametersException
     *         Your request contains too many query string parameters.
     * @throws InvalidQueryStringParametersException
     *         The query string parameters specified are not valid.
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyDistributionsWithSingleFunctionARNException
     *         The maximum number of distributions have been associated with the specified Lambda function.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws TooManyDistributionsWithFunctionAssociationsException
     *         You have reached the maximum number of distributions that are associated with a CloudFront function. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyFunctionAssociationsException
     *         You have reached the maximum number of CloudFront function associations for this distribution. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws InvalidFunctionAssociationException
     *         A CloudFront function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     *         The read timeout specified for the origin is not valid.
     * @throws InvalidOriginKeepaliveTimeoutException
     *         The keep alive timeout specified for the origin is not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws TooManyDistributionsAssociatedToCachePolicyException
     *         The maximum number of distributions have been associated with the specified cache policy. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws TooManyDistributionsAssociatedToOriginRequestPolicyException
     *         The maximum number of distributions have been associated with the specified origin request policy. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyDistributionsAssociatedToKeyGroupException
     *         The number of distributions that reference this key group is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyKeyGroupsAssociatedToDistributionException
     *         The number of key groups referenced by this distribution is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TrustedKeyGroupDoesNotExistException
     *         The specified key group does not exist.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws RealtimeLogConfigOwnerMismatchException
     *         The specified real-time log configuration belongs to a different AWS account.
     * @sample AmazonCloudFront.CreateDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest createDistributionWithTagsRequest);

    /**
     * <p>
     * Create a new field-level encryption configuration.
     * </p>
     * 
     * @param createFieldLevelEncryptionConfigRequest
     * @return Result of the CreateFieldLevelEncryptionConfig operation returned by the service.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws FieldLevelEncryptionConfigAlreadyExistsException
     *         The specified configuration for field-level encryption already exists.
     * @throws TooManyFieldLevelEncryptionConfigsException
     *         The maximum number of configurations for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionQueryArgProfilesException
     *         The maximum number of query arg profiles for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionContentTypeProfilesException
     *         The maximum number of content type profiles for field-level encryption have been created.
     * @throws QueryArgProfileEmptyException
     *         No profile specified for the field-level encryption query argument.
     * @sample AmazonCloudFront.CreateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFieldLevelEncryptionConfigResult createFieldLevelEncryptionConfig(CreateFieldLevelEncryptionConfigRequest createFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Create a field-level encryption profile.
     * </p>
     * 
     * @param createFieldLevelEncryptionProfileRequest
     * @return Result of the CreateFieldLevelEncryptionProfile operation returned by the service.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws FieldLevelEncryptionProfileAlreadyExistsException
     *         The specified profile for field-level encryption already exists.
     * @throws FieldLevelEncryptionProfileSizeExceededException
     *         The maximum size of a profile for field-level encryption was exceeded.
     * @throws TooManyFieldLevelEncryptionProfilesException
     *         The maximum number of profiles for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionEncryptionEntitiesException
     *         The maximum number of encryption entities for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionFieldPatternsException
     *         The maximum number of field patterns for field-level encryption have been created.
     * @sample AmazonCloudFront.CreateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFieldLevelEncryptionProfileResult createFieldLevelEncryptionProfile(CreateFieldLevelEncryptionProfileRequest createFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Creates a CloudFront function.
     * </p>
     * <p>
     * To create a function, you provide the function code and some configuration information about the function. The
     * response contains an Amazon Resource Name (ARN) that uniquely identifies the function.
     * </p>
     * <p>
     * When you create a function, it’s in the <code>DEVELOPMENT</code> stage. In this stage, you can test the function
     * with <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When you’re ready to use your function with a CloudFront distribution, use <code>PublishFunction</code> to copy
     * the function from the <code>DEVELOPMENT</code> stage to <code>LIVE</code>. When it’s live, you can attach the
     * function to a distribution’s cache behavior, using the function’s ARN.
     * </p>
     * 
     * @param createFunctionRequest
     * @return Result of the CreateFunction operation returned by the service.
     * @throws TooManyFunctionsException
     *         You have reached the maximum number of CloudFront functions for this AWS account. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws FunctionAlreadyExistsException
     *         A function with the same name already exists in this AWS account. To create a function, you must provide
     *         a unique name. To update an existing function, use <code>UpdateFunction</code>.
     * @throws FunctionSizeLimitExceededException
     *         The function is too large. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFunctionResult createFunction(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @return Result of the CreateInvalidation operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws BatchTooLargeException
     *         Invalidation batch specified is too large.
     * @throws TooManyInvalidationsInProgressException
     *         You have exceeded the maximum number of allowable InProgress invalidation batch requests, or invalidation
     *         objects.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateInvalidation" target="_top">AWS
     *      API Documentation</a>
     */
    CreateInvalidationResult createInvalidation(CreateInvalidationRequest createInvalidationRequest);

    /**
     * <p>
     * Creates a key group that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">CloudFront signed
     * URLs and signed cookies</a>.
     * </p>
     * <p>
     * To create a key group, you must specify at least one public key for the key group. After you create a key group,
     * you can reference it from one or more cache behaviors. When you reference a key group in a cache behavior,
     * CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or
     * cookies must be signed with a private key whose corresponding public key is in the key group. The signed URL or
     * cookie contains information about which public key CloudFront should use to verify the signature. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createKeyGroupRequest
     * @return Result of the CreateKeyGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws KeyGroupAlreadyExistsException
     *         A key group with this name already exists. You must provide a unique name. To modify an existing key
     *         group, use <code>UpdateKeyGroup</code>.
     * @throws TooManyKeyGroupsException
     *         You have reached the maximum number of key groups for this AWS account. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyPublicKeysInKeyGroupException
     *         The number of public keys in this key group is more than the maximum allowed. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.CreateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKeyGroupResult createKeyGroup(CreateKeyGroupRequest createKeyGroupRequest);

    /**
     * <p>
     * Enables additional CloudWatch metrics for the specified CloudFront distribution. The additional metrics incur an
     * additional cost.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html#monitoring-console.distributions-additional"
     * >Viewing additional CloudFront distribution metrics</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createMonitoringSubscriptionRequest
     * @return Result of the CreateMonitoringSubscription operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws UnsupportedOperationException
     *         This operation is not supported in this region.
     * @sample AmazonCloudFront.CreateMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMonitoringSubscriptionResult createMonitoringSubscription(CreateMonitoringSubscriptionRequest createMonitoringSubscriptionRequest);

    /**
     * <p>
     * Creates an origin request policy.
     * </p>
     * <p>
     * After you create an origin request policy, you can attach it to one or more cache behaviors. When it’s attached
     * to a cache behavior, the origin request policy determines the values that CloudFront includes in requests that it
     * sends to the origin. Each request that CloudFront sends to the origin includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The request body and the URL path (without the domain name) from the viewer request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The headers that CloudFront automatically includes in every origin request, including <code>Host</code>,
     * <code>User-Agent</code>, and <code>X-Amz-Cf-Id</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request
     * policy. These can include items from the viewer request and, in the case of headers, additional ones that are
     * added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CloudFront sends a request when it can’t find a valid object in its cache that matches the request. If you want
     * to send values to the origin and also include them in the cache key, use <code>CachePolicy</code>.
     * </p>
     * <p>
     * For more information about origin request policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html"
     * >Controlling origin requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createOriginRequestPolicyRequest
     * @return Result of the CreateOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws OriginRequestPolicyAlreadyExistsException
     *         An origin request policy with this name already exists. You must provide a unique name. To modify an
     *         existing origin request policy, use <code>UpdateOriginRequestPolicy</code>.
     * @throws TooManyOriginRequestPoliciesException
     *         You have reached the maximum number of origin request policies for this AWS account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyHeadersInOriginRequestPolicyException
     *         The number of headers in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInOriginRequestPolicyException
     *         The number of cookies in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInOriginRequestPolicyException
     *         The number of query strings in the origin request policy exceeds the maximum. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.CreateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateOriginRequestPolicyResult createOriginRequestPolicy(CreateOriginRequestPolicyRequest createOriginRequestPolicyRequest);

    /**
     * <p>
     * Uploads a public key to CloudFront that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     * 
     * @param createPublicKeyRequest
     * @return Result of the CreatePublicKey operation returned by the service.
     * @throws PublicKeyAlreadyExistsException
     *         The specified public key already exists.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws TooManyPublicKeysException
     *         The maximum number of public keys for field-level encryption have been created. To create a new public
     *         key, delete one of the existing keys.
     * @sample AmazonCloudFront.CreatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePublicKeyResult createPublicKey(CreatePublicKeyRequest createPublicKeyRequest);

    /**
     * <p>
     * Creates a real-time log configuration.
     * </p>
     * <p>
     * After you create a real-time log configuration, you can attach it to one or more cache behaviors to send
     * real-time log data to the specified Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about real-time log configurations, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createRealtimeLogConfigRequest
     * @return Result of the CreateRealtimeLogConfig operation returned by the service.
     * @throws RealtimeLogConfigAlreadyExistsException
     *         A real-time log configuration with this name already exists. You must provide a unique name. To modify an
     *         existing real-time log configuration, use <code>UpdateRealtimeLogConfig</code>.
     * @throws TooManyRealtimeLogConfigsException
     *         You have reached the maximum number of real-time log configurations for this AWS account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.CreateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRealtimeLogConfigResult createRealtimeLogConfig(CreateRealtimeLogConfigRequest createRealtimeLogConfigRequest);

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return Result of the CreateStreamingDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws StreamingDistributionAlreadyExistsException
     *         The caller reference you attempted to create the streaming distribution with is associated with another
     *         distribution
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyStreamingDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest createStreamingDistributionRequest);

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @return Result of the CreateStreamingDistributionWithTags operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws StreamingDistributionAlreadyExistsException
     *         The caller reference you attempted to create the streaming distribution with is associated with another
     *         distribution
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyStreamingDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @sample AmazonCloudFront.CreateStreamingDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    CreateStreamingDistributionWithTagsResult createStreamingDistributionWithTags(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest);

    /**
     * <p>
     * Deletes a cache policy.
     * </p>
     * <p>
     * You cannot delete a cache policy if it’s attached to a cache behavior. First update your distributions to remove
     * the cache policy from all cache behaviors, then delete the cache policy.
     * </p>
     * <p>
     * To delete a cache policy, you must provide the policy’s identifier and version. To get these values, you can use
     * <code>ListCachePolicies</code> or <code>GetCachePolicy</code>.
     * </p>
     * 
     * @param deleteCachePolicyRequest
     * @return Result of the DeleteCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws IllegalDeleteException
     *         You cannot delete a managed policy.
     * @throws CachePolicyInUseException
     *         Cannot delete the cache policy because it is attached to one or more cache behaviors.
     * @sample AmazonCloudFront.DeleteCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCachePolicyResult deleteCachePolicy(DeleteCachePolicyRequest deleteCachePolicyRequest);

    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        Deletes a origin access identity.
     * @return Result of the DeleteCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws CloudFrontOriginAccessIdentityInUseException
     *         The Origin Access Identity specified is already in use.
     * @sample AmazonCloudFront.DeleteCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCloudFrontOriginAccessIdentityResult deleteCloudFrontOriginAccessIdentity(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Delete a distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     *        This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the
     *        following steps.</p>
     *        <p>
     *        <b>To delete a web distribution using the CloudFront API:</b>
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Disable the web distribution
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution Config</code> request to get the current configuration and the
     *        <code>Etag</code> header for the distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the XML document that was returned in the response to your <code>GET Distribution Config</code>
     *        request to change the value of <code>Enabled</code> to <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution.
     *        In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP
     *        <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when
     *        you submitted the <code>GET Distribution Config</code> request in Step 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution
     *        was successfully disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When
     *        propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header
     *        to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     *        <code>GET Distribution Config</code> request in Step 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was
     *        successfully deleted.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For information about deleting a distribution using the CloudFront console, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Result of the DeleteDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws DistributionNotDisabledException
     *         The specified CloudFront distribution is not disabled. You must disable the distribution before you can
     *         delete it.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDistributionResult deleteDistribution(DeleteDistributionRequest deleteDistributionRequest);

    /**
     * <p>
     * Remove a field-level encryption configuration.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionConfigRequest
     * @return Result of the DeleteFieldLevelEncryptionConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionConfigInUseException
     *         The specified configuration for field-level encryption is in use.
     * @sample AmazonCloudFront.DeleteFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFieldLevelEncryptionConfigResult deleteFieldLevelEncryptionConfig(DeleteFieldLevelEncryptionConfigRequest deleteFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Remove a field-level encryption profile.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionProfileRequest
     * @return Result of the DeleteFieldLevelEncryptionProfile operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionProfileInUseException
     *         The specified profile for field-level encryption is in use.
     * @sample AmazonCloudFront.DeleteFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFieldLevelEncryptionProfileResult deleteFieldLevelEncryptionProfile(DeleteFieldLevelEncryptionProfileRequest deleteFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Deletes a CloudFront function.
     * </p>
     * <p>
     * You cannot delete a function if it’s associated with a cache behavior. First, update your distributions to remove
     * the function association from all cache behaviors, then delete the function.
     * </p>
     * <p>
     * To delete a function, you must provide the function’s name and version (<code>ETag</code> value). To get these
     * values, you can use <code>ListFunctions</code> and <code>DescribeFunction</code>.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return Result of the DeleteFunction operation returned by the service.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFunctionExistsException
     *         The function does not exist.
     * @throws FunctionInUseException
     *         Cannot delete the function because it’s attached to one or more cache behaviors.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFunctionResult deleteFunction(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Deletes a key group.
     * </p>
     * <p>
     * You cannot delete a key group that is referenced in a cache behavior. First update your distributions to remove
     * the key group from all cache behaviors, then delete the key group.
     * </p>
     * <p>
     * To delete a key group, you must provide the key group’s identifier and version. To get these values, use
     * <code>ListKeyGroups</code> followed by <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * 
     * @param deleteKeyGroupRequest
     * @return Result of the DeleteKeyGroup operation returned by the service.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws ResourceInUseException
     *         Cannot delete this resource because it is in use.
     * @sample AmazonCloudFront.DeleteKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKeyGroupResult deleteKeyGroup(DeleteKeyGroupRequest deleteKeyGroupRequest);

    /**
     * <p>
     * Disables additional CloudWatch metrics for the specified CloudFront distribution.
     * </p>
     * 
     * @param deleteMonitoringSubscriptionRequest
     * @return Result of the DeleteMonitoringSubscription operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws UnsupportedOperationException
     *         This operation is not supported in this region.
     * @sample AmazonCloudFront.DeleteMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMonitoringSubscriptionResult deleteMonitoringSubscription(DeleteMonitoringSubscriptionRequest deleteMonitoringSubscriptionRequest);

    /**
     * <p>
     * Deletes an origin request policy.
     * </p>
     * <p>
     * You cannot delete an origin request policy if it’s attached to any cache behaviors. First update your
     * distributions to remove the origin request policy from all cache behaviors, then delete the origin request
     * policy.
     * </p>
     * <p>
     * To delete an origin request policy, you must provide the policy’s identifier and version. To get the identifier,
     * you can use <code>ListOriginRequestPolicies</code> or <code>GetOriginRequestPolicy</code>.
     * </p>
     * 
     * @param deleteOriginRequestPolicyRequest
     * @return Result of the DeleteOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws IllegalDeleteException
     *         You cannot delete a managed policy.
     * @throws OriginRequestPolicyInUseException
     *         Cannot delete the origin request policy because it is attached to one or more cache behaviors.
     * @sample AmazonCloudFront.DeleteOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOriginRequestPolicyResult deleteOriginRequestPolicy(DeleteOriginRequestPolicyRequest deleteOriginRequestPolicyRequest);

    /**
     * <p>
     * Remove a public key you previously added to CloudFront.
     * </p>
     * 
     * @param deletePublicKeyRequest
     * @return Result of the DeletePublicKey operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws PublicKeyInUseException
     *         The specified public key is in use.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeletePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeletePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePublicKeyResult deletePublicKey(DeletePublicKeyRequest deletePublicKeyRequest);

    /**
     * <p>
     * Deletes a real-time log configuration.
     * </p>
     * <p>
     * You cannot delete a real-time log configuration if it’s attached to a cache behavior. First update your
     * distributions to remove the real-time log configuration from all cache behaviors, then delete the real-time log
     * configuration.
     * </p>
     * <p>
     * To delete a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name
     * (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to delete.
     * </p>
     * 
     * @param deleteRealtimeLogConfigRequest
     * @return Result of the DeleteRealtimeLogConfig operation returned by the service.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws RealtimeLogConfigInUseException
     *         Cannot delete the real-time log configuration because it is attached to one or more cache behaviors.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.DeleteRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRealtimeLogConfigResult deleteRealtimeLogConfig(DeleteRealtimeLogConfigRequest deleteRealtimeLogConfigRequest);

    /**
     * <p>
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following
     * steps.
     * </p>
     * <p>
     * <b>To delete an RTMP distribution using the CloudFront API</b>:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Disable the RTMP distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to get the current configuration and the
     * <code>Etag</code> header for the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your <code>GET Streaming Distribution Config</code>
     * request to change the value of <code>Enabled</code> to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>PUT Streaming Distribution Config</code> request to update the configuration for your
     * distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the
     * HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you
     * submitted the <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>PUT Streaming Distribution Config</code> request to confirm that the
     * distribution was successfully disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to confirm that your changes have propagated.
     * When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DELETE Streaming Distribution</code> request. Set the value of the HTTP <code>If-Match</code>
     * header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     * <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to your <code>DELETE Streaming Distribution</code> request to confirm that the distribution
     * was successfully deleted.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For information about deleting a distribution using the CloudFront console, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
     * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @return Result of the DeleteStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws StreamingDistributionNotDisabledException
     *         The specified CloudFront distribution is not disabled. You must disable the distribution before you can
     *         delete it.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteStreamingDistributionResult deleteStreamingDistribution(DeleteStreamingDistributionRequest deleteStreamingDistributionRequest);

    /**
     * <p>
     * Gets configuration information and metadata about a CloudFront function, but not the function’s code. To get a
     * function’s code, use <code>GetFunction</code>.
     * </p>
     * <p>
     * To get configuration information and metadata about a function, you must provide the function’s name and stage.
     * To get these values, you can use <code>ListFunctions</code>.
     * </p>
     * 
     * @param describeFunctionRequest
     * @return Result of the DescribeFunction operation returned by the service.
     * @throws NoSuchFunctionExistsException
     *         The function does not exist.
     * @sample AmazonCloudFront.DescribeFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DescribeFunction" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeFunctionResult describeFunction(DescribeFunctionRequest describeFunctionRequest);

    /**
     * <p>
     * Gets a cache policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy’s identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a cache policy, you must provide the policy’s identifier. If the cache policy is attached to a
     * distribution’s cache behavior, you can get the policy’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyRequest
     * @return Result of the GetCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @sample AmazonCloudFront.GetCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetCachePolicyResult getCachePolicy(GetCachePolicyRequest getCachePolicyRequest);

    /**
     * <p>
     * Gets a cache policy configuration.
     * </p>
     * <p>
     * To get a cache policy configuration, you must provide the policy’s identifier. If the cache policy is attached to
     * a distribution’s cache behavior, you can get the policy’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyConfigRequest
     * @return Result of the GetCachePolicyConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @sample AmazonCloudFront.GetCachePolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetCachePolicyConfigResult getCachePolicyConfig(GetCachePolicyConfigRequest getCachePolicyConfigRequest);

    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @return Result of the GetCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The origin access identity's configuration information. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html"
     *        >CloudFrontOriginAccessIdentityConfig</a>.
     * @return Result of the GetCloudFrontOriginAccessIdentityConfig operation returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentityConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest);

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     * 
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @return Result of the GetDistribution operation returned by the service.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistribution" target="_top">AWS API
     *      Documentation</a>
     */
    GetDistributionResult getDistribution(GetDistributionRequest getDistributionRequest);

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @return Result of the GetDistributionConfig operation returned by the service.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetDistributionConfigResult getDistributionConfig(GetDistributionConfigRequest getDistributionConfigRequest);

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionRequest
     * @return Result of the GetFieldLevelEncryption operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryption"
     *      target="_top">AWS API Documentation</a>
     */
    GetFieldLevelEncryptionResult getFieldLevelEncryption(GetFieldLevelEncryptionRequest getFieldLevelEncryptionRequest);

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionConfigRequest
     * @return Result of the GetFieldLevelEncryptionConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest getFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Get the field-level encryption profile information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileRequest
     * @return Result of the GetFieldLevelEncryptionProfile operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    GetFieldLevelEncryptionProfileResult getFieldLevelEncryptionProfile(GetFieldLevelEncryptionProfileRequest getFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Get the field-level encryption profile configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileConfigRequest
     * @return Result of the GetFieldLevelEncryptionProfileConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryptionProfileConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfileConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetFieldLevelEncryptionProfileConfigResult getFieldLevelEncryptionProfileConfig(
            GetFieldLevelEncryptionProfileConfigRequest getFieldLevelEncryptionProfileConfigRequest);

    /**
     * <p>
     * Gets the code of a CloudFront function. To get configuration information and metadata about a function, use
     * <code>DescribeFunction</code>.
     * </p>
     * <p>
     * To get a function’s code, you must provide the function’s name and stage. To get these values, you can use
     * <code>ListFunctions</code>.
     * </p>
     * 
     * @param getFunctionRequest
     * @return Result of the GetFunction operation returned by the service.
     * @throws NoSuchFunctionExistsException
     *         The function does not exist.
     * @sample AmazonCloudFront.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    GetFunctionResult getFunction(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     * 
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @return Result of the GetInvalidation operation returned by the service.
     * @throws NoSuchInvalidationException
     *         The specified invalidation does not exist.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetInvalidation" target="_top">AWS API
     *      Documentation</a>
     */
    GetInvalidationResult getInvalidation(GetInvalidationRequest getInvalidationRequest);

    /**
     * <p>
     * Gets a key group, including the date and time when the key group was last modified.
     * </p>
     * <p>
     * To get a key group, you must provide the key group’s identifier. If the key group is referenced in a
     * distribution’s cache behavior, you can get the key group’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupRequest
     * @return Result of the GetKeyGroup operation returned by the service.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.GetKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetKeyGroupResult getKeyGroup(GetKeyGroupRequest getKeyGroupRequest);

    /**
     * <p>
     * Gets a key group configuration.
     * </p>
     * <p>
     * To get a key group configuration, you must provide the key group’s identifier. If the key group is referenced in
     * a distribution’s cache behavior, you can get the key group’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupConfigRequest
     * @return Result of the GetKeyGroupConfig operation returned by the service.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.GetKeyGroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroupConfig" target="_top">AWS
     *      API Documentation</a>
     */
    GetKeyGroupConfigResult getKeyGroupConfig(GetKeyGroupConfigRequest getKeyGroupConfigRequest);

    /**
     * <p>
     * Gets information about whether additional CloudWatch metrics are enabled for the specified CloudFront
     * distribution.
     * </p>
     * 
     * @param getMonitoringSubscriptionRequest
     * @return Result of the GetMonitoringSubscription operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws UnsupportedOperationException
     *         This operation is not supported in this region.
     * @sample AmazonCloudFront.GetMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    GetMonitoringSubscriptionResult getMonitoringSubscription(GetMonitoringSubscriptionRequest getMonitoringSubscriptionRequest);

    /**
     * <p>
     * Gets an origin request policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy’s identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get an origin request policy, you must provide the policy’s identifier. If the origin request policy is
     * attached to a distribution’s cache behavior, you can get the policy’s identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyRequest
     * @return Result of the GetOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @sample AmazonCloudFront.GetOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetOriginRequestPolicyResult getOriginRequestPolicy(GetOriginRequestPolicyRequest getOriginRequestPolicyRequest);

    /**
     * <p>
     * Gets an origin request policy configuration.
     * </p>
     * <p>
     * To get an origin request policy configuration, you must provide the policy’s identifier. If the origin request
     * policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyConfigRequest
     * @return Result of the GetOriginRequestPolicyConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @sample AmazonCloudFront.GetOriginRequestPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetOriginRequestPolicyConfigResult getOriginRequestPolicyConfig(GetOriginRequestPolicyConfigRequest getOriginRequestPolicyConfigRequest);

    /**
     * <p>
     * Gets a public key.
     * </p>
     * 
     * @param getPublicKeyRequest
     * @return Result of the GetPublicKey operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @sample AmazonCloudFront.GetPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    GetPublicKeyResult getPublicKey(GetPublicKeyRequest getPublicKeyRequest);

    /**
     * <p>
     * Gets a public key configuration.
     * </p>
     * 
     * @param getPublicKeyConfigRequest
     * @return Result of the GetPublicKeyConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @sample AmazonCloudFront.GetPublicKeyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKeyConfig" target="_top">AWS
     *      API Documentation</a>
     */
    GetPublicKeyConfigResult getPublicKeyConfig(GetPublicKeyConfigRequest getPublicKeyConfigRequest);

    /**
     * <p>
     * Gets a real-time log configuration.
     * </p>
     * <p>
     * To get a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name (ARN).
     * You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to get.
     * </p>
     * 
     * @param getRealtimeLogConfigRequest
     * @return Result of the GetRealtimeLogConfig operation returned by the service.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetRealtimeLogConfigResult getRealtimeLogConfig(GetRealtimeLogConfigRequest getRealtimeLogConfigRequest);

    /**
     * <p>
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     * </p>
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @return Result of the GetStreamingDistribution operation returned by the service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    GetStreamingDistributionResult getStreamingDistribution(GetStreamingDistributionRequest getStreamingDistributionRequest);

    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     * 
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @return Result of the GetStreamingDistributionConfig operation returned by the service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetStreamingDistributionConfigResult getStreamingDistributionConfig(GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest);

    /**
     * <p>
     * Gets a list of cache policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies
     * created in your AWS account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listCachePoliciesRequest
     * @return Result of the ListCachePolicies operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListCachePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCachePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    ListCachePoliciesResult listCachePolicies(ListCachePoliciesRequest listCachePoliciesRequest);

    /**
     * <p>
     * Lists origin access identities.
     * </p>
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @return Result of the ListCloudFrontOriginAccessIdentities operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListCloudFrontOriginAccessIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCloudFrontOriginAccessIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest);

    /**
     * <p>
     * List CloudFront distributions.
     * </p>
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return Result of the ListDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributions" target="_top">AWS
     *      API Documentation</a>
     */
    ListDistributionsResult listDistributions(ListDistributionsRequest listDistributionsRequest);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified
     * cache policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByCachePolicyIdRequest
     * @return Result of the ListDistributionsByCachePolicyId operation returned by the service.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListDistributionsByCachePolicyId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByCachePolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributionsByCachePolicyIdResult listDistributionsByCachePolicyId(ListDistributionsByCachePolicyIdRequest listDistributionsByCachePolicyIdRequest);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that references the specified key
     * group.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByKeyGroupRequest
     * @return Result of the ListDistributionsByKeyGroup operation returned by the service.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListDistributionsByKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByKeyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributionsByKeyGroupResult listDistributionsByKeyGroup(ListDistributionsByKeyGroupRequest listDistributionsByKeyGroupRequest);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified
     * origin request policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByOriginRequestPolicyIdRequest
     * @return Result of the ListDistributionsByOriginRequestPolicyId operation returned by the service.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListDistributionsByOriginRequestPolicyId
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByOriginRequestPolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributionsByOriginRequestPolicyIdResult listDistributionsByOriginRequestPolicyId(
            ListDistributionsByOriginRequestPolicyIdRequest listDistributionsByOriginRequestPolicyIdRequest);

    /**
     * <p>
     * Gets a list of distributions that have a cache behavior that’s associated with the specified real-time log
     * configuration.
     * </p>
     * <p>
     * You can specify the real-time log configuration by its name or its Amazon Resource Name (ARN). You must provide
     * at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to list
     * distributions for.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByRealtimeLogConfigRequest
     * @return Result of the ListDistributionsByRealtimeLogConfig operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListDistributionsByRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributionsByRealtimeLogConfigResult listDistributionsByRealtimeLogConfig(
            ListDistributionsByRealtimeLogConfigRequest listDistributionsByRealtimeLogConfigRequest);

    /**
     * <p>
     * List the distributions that are associated with a specified AWS WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified AWS WAF web ACL.
     * @return Result of the ListDistributionsByWebACLId operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @sample AmazonCloudFront.ListDistributionsByWebACLId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByWebACLId"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributionsByWebACLIdResult listDistributionsByWebACLId(ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest);

    /**
     * <p>
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionConfigsRequest
     * @return Result of the ListFieldLevelEncryptionConfigs operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListFieldLevelEncryptionConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListFieldLevelEncryptionConfigsResult listFieldLevelEncryptionConfigs(ListFieldLevelEncryptionConfigsRequest listFieldLevelEncryptionConfigsRequest);

    /**
     * <p>
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionProfilesRequest
     * @return Result of the ListFieldLevelEncryptionProfiles operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListFieldLevelEncryptionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListFieldLevelEncryptionProfilesResult listFieldLevelEncryptionProfiles(ListFieldLevelEncryptionProfilesRequest listFieldLevelEncryptionProfilesRequest);

    /**
     * <p>
     * Gets a list of all CloudFront functions in your AWS account.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the functions that are in the specified stage, either
     * <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return Result of the ListFunctions operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    ListFunctionsResult listFunctions(ListFunctionsRequest listFunctionsRequest);

    /**
     * <p>
     * Lists invalidation batches.
     * </p>
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @return Result of the ListInvalidations operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListInvalidations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListInvalidations" target="_top">AWS
     *      API Documentation</a>
     */
    ListInvalidationsResult listInvalidations(ListInvalidationsRequest listInvalidationsRequest);

    /**
     * <p>
     * Gets a list of key groups.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listKeyGroupsRequest
     * @return Result of the ListKeyGroups operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListKeyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListKeyGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListKeyGroupsResult listKeyGroups(ListKeyGroupsRequest listKeyGroupsRequest);

    /**
     * <p>
     * Gets a list of origin request policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies
     * created in your AWS account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listOriginRequestPoliciesRequest
     * @return Result of the ListOriginRequestPolicies operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListOriginRequestPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListOriginRequestPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListOriginRequestPoliciesResult listOriginRequestPolicies(ListOriginRequestPoliciesRequest listOriginRequestPoliciesRequest);

    /**
     * <p>
     * List all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param listPublicKeysRequest
     * @return Result of the ListPublicKeys operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    ListPublicKeysResult listPublicKeys(ListPublicKeysRequest listPublicKeysRequest);

    /**
     * <p>
     * Gets a list of real-time log configurations.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listRealtimeLogConfigsRequest
     * @return Result of the ListRealtimeLogConfigs operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @sample AmazonCloudFront.ListRealtimeLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListRealtimeLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListRealtimeLogConfigsResult listRealtimeLogConfigs(ListRealtimeLogConfigsRequest listRealtimeLogConfigsRequest);

    /**
     * <p>
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return Result of the ListStreamingDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListStreamingDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListStreamingDistributions"
     *      target="_top">AWS API Documentation</a>
     */
    ListStreamingDistributionsResult listStreamingDistributions(ListStreamingDistributionsRequest listStreamingDistributionsRequest);

    /**
     * <p>
     * List tags for a CloudFront resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request to list tags for a CloudFront resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Publishes a CloudFront function by copying the function code from the <code>DEVELOPMENT</code> stage to
     * <code>LIVE</code>. This automatically updates all cache behaviors that are using this function to use the newly
     * published copy in the <code>LIVE</code> stage.
     * </p>
     * <p>
     * When a function is published to the <code>LIVE</code> stage, you can attach the function to a distribution’s
     * cache behavior, using the function’s Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To publish a function, you must provide the function’s name and version (<code>ETag</code> value). To get these
     * values, you can use <code>ListFunctions</code> and <code>DescribeFunction</code>.
     * </p>
     * 
     * @param publishFunctionRequest
     * @return Result of the PublishFunction operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFunctionExistsException
     *         The function does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.PublishFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/PublishFunction" target="_top">AWS API
     *      Documentation</a>
     */
    PublishFunctionResult publishFunction(PublishFunctionRequest publishFunctionRequest);

    /**
     * <p>
     * Add tags to a CloudFront resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tests a CloudFront function.
     * </p>
     * <p>
     * To test a function, you provide an <i>event object</i> that represents an HTTP request or response that your
     * CloudFront distribution could receive in production. CloudFront runs the function, passing it the event object
     * that you provided, and returns the function’s result (the modified event object) in the response. The response
     * also contains function logs and error messages, if any exist. For more information about testing functions, see
     * <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function"
     * >Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * To test a function, you provide the function’s name and version (<code>ETag</code> value) along with the event
     * object. To get the function’s name and version, you can use <code>ListFunctions</code> and
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param testFunctionRequest
     * @return Result of the TestFunction operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFunctionExistsException
     *         The function does not exist.
     * @throws TestFunctionFailedException
     *         The CloudFront function failed.
     * @sample AmazonCloudFront.TestFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TestFunction" target="_top">AWS API
     *      Documentation</a>
     */
    TestFunctionResult testFunction(TestFunctionRequest testFunctionRequest);

    /**
     * <p>
     * Remove tags from a CloudFront resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a cache policy configuration.
     * </p>
     * <p>
     * When you update a cache policy configuration, all the fields are updated with the values provided in the request.
     * You cannot update some fields independent of others. To update a cache policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetCachePolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the cache policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateCachePolicy</code> by providing the entire cache policy configuration, including the fields that
     * you modified and those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateCachePolicyRequest
     * @return Result of the UpdateCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws CachePolicyAlreadyExistsException
     *         A cache policy with this name already exists. You must provide a unique name. To modify an existing cache
     *         policy, use <code>UpdateCachePolicy</code>.
     * @throws TooManyHeadersInCachePolicyException
     *         The number of headers in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInCachePolicyException
     *         The number of cookies in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInCachePolicyException
     *         The number of query strings in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.UpdateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateCachePolicyResult updateCachePolicy(UpdateCachePolicyRequest updateCachePolicyRequest);

    /**
     * <p>
     * Update an origin access identity.
     * </p>
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @return Result of the UpdateCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.UpdateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Updates the configuration for a web distribution.
     * </p>
     * <important>
     * <p>
     * When you update a distribution, there are more required fields than when you create a distribution. When you
     * update your distribution by using this API action, follow the steps here to get the current configuration and
     * then make your updates, to make sure that you include all of the required fields. To view a summary, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
     * >Required Fields for Create Distribution and Update Distribution</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * The update process includes getting the current distribution configuration, updating the XML document that is
     * returned to make your changes, and then submitting an <code>UpdateDistribution</code> request to make the
     * updates.
     * </p>
     * <p>
     * For information about updating a distribution using the CloudFront console instead, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-creating-console.html"
     * >Creating a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * <b>To update a web distribution using the CloudFront API</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistributionConfig.html">
     * GetDistributionConfig</a> request to get the current configuration and an <code>Etag</code> header for the
     * distribution.
     * </p>
     * <note>
     * <p>
     * If you update the distribution again, you must get a new <code>Etag</code> header.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your <code>GetDistributionConfig</code> request to
     * include your changes.
     * </p>
     * <important>
     * <p>
     * When you edit the XML file, be aware of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must strip out the ETag parameter that is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * Additional fields are required when you update a distribution. There may be fields included in the XML file for
     * features that you haven't configured for your distribution. This is expected and required to successfully update
     * the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't change the value of <code>CallerReference</code>. If you try to change this value, CloudFront returns
     * an <code>IllegalUpdate</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * The new configuration replaces the existing configuration; the values that you specify in an
     * <code>UpdateDistribution</code> request are not merged into your existing configuration. When you add, delete, or
     * replace values in an element that allows multiple values (for example, <code>CNAME</code>), you must specify all
     * of the values that you want to appear in the updated distribution. In addition, you must update the corresponding
     * <code>Quantity</code> element.
     * </p>
     * </li>
     * </ul>
     * </important></li>
     * <li>
     * <p>
     * Submit an <code>UpdateDistribution</code> request to update the configuration for your distribution:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In the request body, include the XML document that you updated in Step 2. The request body must include an XML
     * document with a <code>DistributionConfig</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that
     * CloudFront returned when you submitted the <code>GetDistributionConfig</code> request in Step 1.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>UpdateDistribution</code> request to confirm that the configuration was
     * successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: Submit a <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistribution.html">GetDistribution</a>
     * request to confirm that your changes have propagated. When propagation is complete, the value of
     * <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @return Result of the UpdateDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     *         An invalid error code was specified.
     * @throws InvalidResponseCodeException
     *         A response code is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InvalidViewerCertificateException
     *         A viewer certificate specified is not valid.
     * @throws InvalidMinimumProtocolVersionException
     *         The minimum protocol version specified is not valid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyOriginGroupsPerDistributionException
     *         Processing your request would cause you to exceed the maximum number of origin groups allowed.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     *         Your request contains too many headers in forwarded values.
     * @throws InvalidHeadersForS3OriginException
     *         The headers specified are not valid for an Amazon S3 origin.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     *         The location code specified is not valid.
     * @throws InvalidGeoRestrictionParameterException
     *         The specified geo restriction parameter is not valid.
     * @throws InvalidTTLOrderException
     *         The TTL order specified is not valid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @throws TooManyOriginCustomHeadersException
     *         Your request contains too many origin custom headers.
     * @throws TooManyQueryStringParametersException
     *         Your request contains too many query string parameters.
     * @throws InvalidQueryStringParametersException
     *         The query string parameters specified are not valid.
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyDistributionsWithSingleFunctionARNException
     *         The maximum number of distributions have been associated with the specified Lambda function.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws TooManyDistributionsWithFunctionAssociationsException
     *         You have reached the maximum number of distributions that are associated with a CloudFront function. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyFunctionAssociationsException
     *         You have reached the maximum number of CloudFront function associations for this distribution. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws InvalidFunctionAssociationException
     *         A CloudFront function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     *         The read timeout specified for the origin is not valid.
     * @throws InvalidOriginKeepaliveTimeoutException
     *         The keep alive timeout specified for the origin is not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws TooManyDistributionsAssociatedToCachePolicyException
     *         The maximum number of distributions have been associated with the specified cache policy. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws TooManyDistributionsAssociatedToOriginRequestPolicyException
     *         The maximum number of distributions have been associated with the specified origin request policy. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyDistributionsAssociatedToKeyGroupException
     *         The number of distributions that reference this key group is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyKeyGroupsAssociatedToDistributionException
     *         The number of key groups referenced by this distribution is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TrustedKeyGroupDoesNotExistException
     *         The specified key group does not exist.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws RealtimeLogConfigOwnerMismatchException
     *         The specified real-time log configuration belongs to a different AWS account.
     * @sample AmazonCloudFront.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDistributionResult updateDistribution(UpdateDistributionRequest updateDistributionRequest);

    /**
     * <p>
     * Update a field-level encryption configuration.
     * </p>
     * 
     * @param updateFieldLevelEncryptionConfigRequest
     * @return Result of the UpdateFieldLevelEncryptionConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws TooManyFieldLevelEncryptionQueryArgProfilesException
     *         The maximum number of query arg profiles for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionContentTypeProfilesException
     *         The maximum number of content type profiles for field-level encryption have been created.
     * @throws QueryArgProfileEmptyException
     *         No profile specified for the field-level encryption query argument.
     * @sample AmazonCloudFront.UpdateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFieldLevelEncryptionConfigResult updateFieldLevelEncryptionConfig(UpdateFieldLevelEncryptionConfigRequest updateFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Update a field-level encryption profile.
     * </p>
     * 
     * @param updateFieldLevelEncryptionProfileRequest
     * @return Result of the UpdateFieldLevelEncryptionProfile operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws FieldLevelEncryptionProfileAlreadyExistsException
     *         The specified profile for field-level encryption already exists.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionProfileSizeExceededException
     *         The maximum size of a profile for field-level encryption was exceeded.
     * @throws TooManyFieldLevelEncryptionEncryptionEntitiesException
     *         The maximum number of encryption entities for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionFieldPatternsException
     *         The maximum number of field patterns for field-level encryption have been created.
     * @sample AmazonCloudFront.UpdateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFieldLevelEncryptionProfileResult updateFieldLevelEncryptionProfile(UpdateFieldLevelEncryptionProfileRequest updateFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Updates a CloudFront function.
     * </p>
     * <p>
     * You can update a function’s code or the comment that describes the function. You cannot update a function’s name.
     * </p>
     * <p>
     * To update a function, you provide the function’s name and version (<code>ETag</code> value) along with the
     * updated function code. To get the name and version, you can use <code>ListFunctions</code> and
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param updateFunctionRequest
     * @return Result of the UpdateFunction operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFunctionExistsException
     *         The function does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws FunctionSizeLimitExceededException
     *         The function is too large. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.UpdateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFunctionResult updateFunction(UpdateFunctionRequest updateFunctionRequest);

    /**
     * <p>
     * Updates a key group.
     * </p>
     * <p>
     * When you update a key group, all the fields are updated with the values provided in the request. You cannot
     * update some fields independent of others. To update a key group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Get the current key group with <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the key group that you want to update. For example, add or remove public key IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateKeyGroup</code> with the entire key group object, including the fields that you modified and
     * those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateKeyGroupRequest
     * @return Result of the UpdateKeyGroup operation returned by the service.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws KeyGroupAlreadyExistsException
     *         A key group with this name already exists. You must provide a unique name. To modify an existing key
     *         group, use <code>UpdateKeyGroup</code>.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws TooManyPublicKeysInKeyGroupException
     *         The number of public keys in this key group is more than the maximum allowed. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.UpdateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateKeyGroupResult updateKeyGroup(UpdateKeyGroupRequest updateKeyGroupRequest);

    /**
     * <p>
     * Updates an origin request policy configuration.
     * </p>
     * <p>
     * When you update an origin request policy configuration, all the fields are updated with the values provided in
     * the request. You cannot update some fields independent of others. To update an origin request policy
     * configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetOriginRequestPolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the origin request policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateOriginRequestPolicy</code> by providing the entire origin request policy configuration,
     * including the fields that you modified and those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateOriginRequestPolicyRequest
     * @return Result of the UpdateOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws OriginRequestPolicyAlreadyExistsException
     *         An origin request policy with this name already exists. You must provide a unique name. To modify an
     *         existing origin request policy, use <code>UpdateOriginRequestPolicy</code>.
     * @throws TooManyHeadersInOriginRequestPolicyException
     *         The number of headers in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInOriginRequestPolicyException
     *         The number of cookies in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInOriginRequestPolicyException
     *         The number of query strings in the origin request policy exceeds the maximum. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.UpdateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOriginRequestPolicyResult updateOriginRequestPolicy(UpdateOriginRequestPolicyRequest updateOriginRequestPolicyRequest);

    /**
     * <p>
     * Update public key information. Note that the only value you can change is the comment.
     * </p>
     * 
     * @param updatePublicKeyRequest
     * @return Result of the UpdatePublicKey operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CannotChangeImmutablePublicKeyFieldsException
     *         You can't change the value of a public key.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.UpdatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePublicKeyResult updatePublicKey(UpdatePublicKeyRequest updatePublicKeyRequest);

    /**
     * <p>
     * Updates a real-time log configuration.
     * </p>
     * <p>
     * When you update a real-time log configuration, all the parameters are updated with the values provided in the
     * request. You cannot update some parameters independent of others. To update a real-time log configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>GetRealtimeLogConfig</code> to get the current real-time log configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the parameters in the real-time log configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call this API (<code>UpdateRealtimeLogConfig</code>) by providing the entire real-time log configuration,
     * including the parameters that you modified and those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * <p>
     * You cannot update a real-time log configuration’s <code>Name</code> or <code>ARN</code>.
     * </p>
     * 
     * @param updateRealtimeLogConfigRequest
     * @return Result of the UpdateRealtimeLogConfig operation returned by the service.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.UpdateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRealtimeLogConfigResult updateRealtimeLogConfig(UpdateRealtimeLogConfigRequest updateRealtimeLogConfigRequest);

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return Result of the UpdateStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition in one or more of the request fields evaluated to <code>false</code>.
     * @throws TooManyStreamingDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.UpdateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateStreamingDistributionResult updateStreamingDistribution(UpdateStreamingDistributionRequest updateStreamingDistributionRequest);

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

    AmazonCloudFrontWaiters waiters();

}
