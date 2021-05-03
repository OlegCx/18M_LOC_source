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
package com.amazonaws.services.waf;

import javax.annotation.Generated;

import com.amazonaws.services.waf.model.*;

/**
 * Interface for accessing WAF Regional asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.waf.AbstractAWSWAFRegionalAsync} instead.
 * </p>
 * <p>
 * <note>
 * <p>
 * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
 * developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With the
 * latest version, AWS WAF has a single set of endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * This is the <i>AWS WAF Regional Classic API Reference</i> for using AWS WAF Classic with the AWS resources, Elastic
 * Load Balancing (ELB) Application Load Balancers and API Gateway APIs. The AWS WAF Classic actions and data types
 * listed in the reference are available for protecting Elastic Load Balancing (ELB) Application Load Balancers and API
 * Gateway APIs. You can use these actions and data types by means of the endpoints listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region">AWS Regions and Endpoints</a>. This guide
 * is for developers who need detailed information about the AWS WAF Classic API actions, data types, and errors. For
 * detailed information about AWS WAF Classic features and an overview of how to use the AWS WAF Classic API, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
 * developer guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSWAFRegionalAsync extends AWSWAFRegional {

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param associateWebACLRequest
     * @return A Java Future containing the result of the AssociateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsync.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/AssociateWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest associateWebACLRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param associateWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/AssociateWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest associateWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWebACLRequest, AssociateWebACLResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>ByteMatchSet</code>. You then use <a>UpdateByteMatchSet</a> to identify the part of a web request
     * that you want AWS WAF to inspect, such as the values of the <code>User-Agent</code> header or the query string.
     * For example, you can create a <code>ByteMatchSet</code> that matches any requests with <code>User-Agent</code>
     * headers that contain the string <code>BadBot</code>. You can then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateByteMatchSet</a> request to specify the part of the request that you want AWS WAF to inspect
     * (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createByteMatchSetRequest
     * @return A Java Future containing the result of the CreateByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest createByteMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>ByteMatchSet</code>. You then use <a>UpdateByteMatchSet</a> to identify the part of a web request
     * that you want AWS WAF to inspect, such as the values of the <code>User-Agent</code> header or the query string.
     * For example, you can create a <code>ByteMatchSet</code> that matches any requests with <code>User-Agent</code>
     * headers that contain the string <code>BadBot</code>. You can then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateByteMatchSet</a> request to specify the part of the request that you want AWS WAF to inspect
     * (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createByteMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest createByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateByteMatchSetRequest, CreateByteMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>GeoMatchSet</a>, which you use to specify which web requests you want to allow or block based on
     * the country that the requests originate from. For example, if you're receiving a lot of requests from one or more
     * countries and you want to block the requests, you can create an <code>GeoMatchSet</code> that contains those
     * countries and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>GeoMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSetSet</code> request to specify the countries that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createGeoMatchSetRequest
     * @return A Java Future containing the result of the CreateGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(CreateGeoMatchSetRequest createGeoMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>GeoMatchSet</a>, which you use to specify which web requests you want to allow or block based on
     * the country that the requests originate from. For example, if you're receiving a lot of requests from one or more
     * countries and you want to block the requests, you can create an <code>GeoMatchSet</code> that contains those
     * countries and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>GeoMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSetSet</code> request to specify the countries that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createGeoMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(CreateGeoMatchSetRequest createGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGeoMatchSetRequest, CreateGeoMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>IPSet</a>, which you use to specify which web requests that you want to allow or block based on the
     * IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or
     * more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can
     * create an <code>IPSet</code> that contains those IP addresses and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createIPSetRequest
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>IPSet</a>, which you use to specify which web requests that you want to allow or block based on the
     * IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or
     * more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can
     * create an <code>IPSet</code> that contains those IP addresses and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RateBasedRule</a>. The <code>RateBasedRule</code> contains a <code>RateLimit</code>, which specifies
     * the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The
     * <code>RateBasedRule</code> also contains the <code>IPSet</code> objects, <code>ByteMatchSet</code> objects, and
     * other predicates that identify the requests that you want to count or block if these requests exceed the
     * <code>RateLimit</code>.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a request not only must exceed the
     * <code>RateLimit</code>, but it also must match all the conditions to be counted or blocked. For example, suppose
     * you add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and specify that you want to block requests
     * that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>. Further,
     * requests that match these two conditions must be received at a rate of more than 1,000 requests every five
     * minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops
     * below 1,000 for a five-minute period, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you could limit requests to your login page
     * without affecting the rest of your site.
     * </p>
     * <p>
     * To create and configure a <code>RateBasedRule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the rule. For more information, see
     * <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRateBasedRule</code> request to specify the predicates that you want to include in the
     * rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>RateBasedRule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRateBasedRuleRequest
     * @return A Java Future containing the result of the CreateRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(CreateRateBasedRuleRequest createRateBasedRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RateBasedRule</a>. The <code>RateBasedRule</code> contains a <code>RateLimit</code>, which specifies
     * the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The
     * <code>RateBasedRule</code> also contains the <code>IPSet</code> objects, <code>ByteMatchSet</code> objects, and
     * other predicates that identify the requests that you want to count or block if these requests exceed the
     * <code>RateLimit</code>.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a request not only must exceed the
     * <code>RateLimit</code>, but it also must match all the conditions to be counted or blocked. For example, suppose
     * you add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and specify that you want to block requests
     * that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>. Further,
     * requests that match these two conditions must be received at a rate of more than 1,000 requests every five
     * minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops
     * below 1,000 for a five-minute period, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you could limit requests to your login page
     * without affecting the rest of your site.
     * </p>
     * <p>
     * To create and configure a <code>RateBasedRule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the rule. For more information, see
     * <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRateBasedRule</code> request to specify the predicates that you want to include in the
     * rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>RateBasedRule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRateBasedRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(CreateRateBasedRuleRequest createRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRateBasedRuleRequest, CreateRateBasedRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RegexMatchSet</a>. You then use <a>UpdateRegexMatchSet</a> to identify the part of a web request
     * that you want AWS WAF to inspect, such as the values of the <code>User-Agent</code> header or the query string.
     * For example, you can create a <code>RegexMatchSet</code> that contains a <code>RegexMatchTuple</code> that looks
     * for any requests with <code>User-Agent</code> headers that match a <code>RegexPatternSet</code> with pattern
     * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexMatchSet</a> request to specify the part of the request that you want AWS WAF to inspect
     * (for example, the header or the URI) and the value, using a <code>RegexPatternSet</code>, that you want AWS WAF
     * to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRegexMatchSetRequest
     * @return A Java Future containing the result of the CreateRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(CreateRegexMatchSetRequest createRegexMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RegexMatchSet</a>. You then use <a>UpdateRegexMatchSet</a> to identify the part of a web request
     * that you want AWS WAF to inspect, such as the values of the <code>User-Agent</code> header or the query string.
     * For example, you can create a <code>RegexMatchSet</code> that contains a <code>RegexMatchTuple</code> that looks
     * for any requests with <code>User-Agent</code> headers that match a <code>RegexPatternSet</code> with pattern
     * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexMatchSet</a> request to specify the part of the request that you want AWS WAF to inspect
     * (for example, the header or the URI) and the value, using a <code>RegexPatternSet</code>, that you want AWS WAF
     * to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRegexMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(CreateRegexMatchSetRequest createRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegexMatchSetRequest, CreateRegexMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RegexPatternSet</code>. You then use <a>UpdateRegexPatternSet</a> to specify the regular
     * expression (regex) pattern that you want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>. You can then
     * configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexPatternSet</a> request to specify the string that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @return A Java Future containing the result of the CreateRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest createRegexPatternSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RegexPatternSet</code>. You then use <a>UpdateRegexPatternSet</a> to specify the regular
     * expression (regex) pattern that you want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>. You can then
     * configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexPatternSet</a> request to specify the string that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest createRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegexPatternSetRequest, CreateRegexPatternSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>Rule</code>, which contains the <code>IPSet</code> objects, <code>ByteMatchSet</code> objects,
     * and other predicates that identify the requests that you want to block. If you add more than one predicate to a
     * <code>Rule</code>, a request must match all of the specifications to be allowed or blocked. For example, suppose
     * that you add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to blocks requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to specify the predicates that you want to include in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>Rule</code>, which contains the <code>IPSet</code> objects, <code>ByteMatchSet</code> objects,
     * and other predicates that identify the requests that you want to block. If you add more than one predicate to a
     * <code>Rule</code>, a request must match all of the specifications to be allowed or blocked. For example, suppose
     * that you add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to blocks requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to specify the predicates that you want to include in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RuleGroup</code>. A rule group is a collection of predefined rules that you add to a web ACL. You
     * use <a>UpdateRuleGroup</a> to add rules to the rule group.
     * </p>
     * <p>
     * Rule groups are subject to the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Three rule groups per account. You can request an increase to this limit by contacting customer support.
     * </p>
     * </li>
     * <li>
     * <p>
     * One rule group per web ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ten rules per rule group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return A Java Future containing the result of the CreateRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest createRuleGroupRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RuleGroup</code>. A rule group is a collection of predefined rules that you add to a web ACL. You
     * use <a>UpdateRuleGroup</a> to add rules to the rule group.
     * </p>
     * <p>
     * Rule groups are subject to the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Three rule groups per account. You can request an increase to this limit by contacting customer support.
     * </p>
     * </li>
     * <li>
     * <p>
     * One rule group per web ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ten rules per rule group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest createRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>SizeConstraintSet</code>. You then use <a>UpdateSizeConstraintSet</a> to identify the part of a
     * web request that you want AWS WAF to check for length, such as the length of the <code>User-Agent</code> header
     * or the length of the query string. For example, you can create a <code>SizeConstraintSet</code> that matches any
     * requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSizeConstraintSet</a> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSizeConstraintSetRequest
     * @return A Java Future containing the result of the CreateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(CreateSizeConstraintSetRequest createSizeConstraintSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>SizeConstraintSet</code>. You then use <a>UpdateSizeConstraintSet</a> to identify the part of a
     * web request that you want AWS WAF to check for length, such as the length of the <code>User-Agent</code> header
     * or the length of the query string. For example, you can create a <code>SizeConstraintSet</code> that matches any
     * requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSizeConstraintSet</a> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSizeConstraintSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(CreateSizeConstraintSetRequest createSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSizeConstraintSetRequest, CreateSizeConstraintSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>SqlInjectionMatchSet</a>, which you use to allow, block, or count requests that contain snippets of
     * SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSqlInjectionMatchSet</a> request to specify the parts of web requests in which you want to
     * allow, block, or count malicious SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSqlInjectionMatchSetRequest
     *        A request to create a <a>SqlInjectionMatchSet</a>.
     * @return A Java Future containing the result of the CreateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(
            CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>SqlInjectionMatchSet</a>, which you use to allow, block, or count requests that contain snippets of
     * SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSqlInjectionMatchSet</a> request to specify the parts of web requests in which you want to
     * allow, block, or count malicious SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSqlInjectionMatchSetRequest
     *        A request to create a <a>SqlInjectionMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(
            CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSqlInjectionMatchSetRequest, CreateSqlInjectionMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>WebACL</code>, which contains the <code>Rules</code> that identify the CloudFront web requests
     * that you want to allow, block, or count. AWS WAF evaluates <code>Rules</code> in order based on the value of
     * <code>Priority</code> for each <code>Rule</code>.
     * </p>
     * <p>
     * You also specify a default action, either <code>ALLOW</code> or <code>BLOCK</code>. If a web request doesn't
     * match any of the <code>Rules</code> in a <code>WebACL</code>, AWS WAF responds to the request with the default
     * action.
     * </p>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>ByteMatchSet</code> objects and other predicates that you want to include in
     * <code>Rules</code>. For more information, see <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>,
     * <a>CreateIPSet</a>, <a>UpdateIPSet</a>, <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLRequest
     * @return A Java Future containing the result of the CreateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest createWebACLRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>WebACL</code>, which contains the <code>Rules</code> that identify the CloudFront web requests
     * that you want to allow, block, or count. AWS WAF evaluates <code>Rules</code> in order based on the value of
     * <code>Priority</code> for each <code>Rule</code>.
     * </p>
     * <p>
     * You also specify a default action, either <code>ALLOW</code> or <code>BLOCK</code>. If a web request doesn't
     * match any of the <code>Rules</code> in a <code>WebACL</code>, AWS WAF responds to the request with the default
     * action.
     * </p>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>ByteMatchSet</code> objects and other predicates that you want to include in
     * <code>Rules</code>. For more information, see <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>,
     * <a>CreateIPSet</a>, <a>UpdateIPSet</a>, <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest createWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebACLRequest, CreateWebACLResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS CloudFormation WAFV2 template for the specified web ACL in the specified Amazon S3 bucket. Then,
     * in CloudFormation, you create a stack from the template, to create the web ACL and its resources in AWS WAFV2.
     * Use this to migrate your AWS WAF Classic web ACL to the latest version of AWS WAF.
     * </p>
     * <p>
     * This is part of a larger migration procedure for web ACLs from AWS WAF Classic to the latest version of AWS WAF.
     * For the full procedure, including caveats and manual steps to complete the migration and switch over to the new
     * web ACL, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-migrating-from-classic.html">Migrating your AWS
     * WAF Classic resources to AWS WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLMigrationStackRequest
     * @return A Java Future containing the result of the CreateWebACLMigrationStack operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateWebACLMigrationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACLMigrationStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLMigrationStackResult> createWebACLMigrationStackAsync(
            CreateWebACLMigrationStackRequest createWebACLMigrationStackRequest);

    /**
     * <p>
     * Creates an AWS CloudFormation WAFV2 template for the specified web ACL in the specified Amazon S3 bucket. Then,
     * in CloudFormation, you create a stack from the template, to create the web ACL and its resources in AWS WAFV2.
     * Use this to migrate your AWS WAF Classic web ACL to the latest version of AWS WAF.
     * </p>
     * <p>
     * This is part of a larger migration procedure for web ACLs from AWS WAF Classic to the latest version of AWS WAF.
     * For the full procedure, including caveats and manual steps to complete the migration and switch over to the new
     * web ACL, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-migrating-from-classic.html">Migrating your AWS
     * WAF Classic resources to AWS WAF</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLMigrationStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebACLMigrationStack operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateWebACLMigrationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACLMigrationStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLMigrationStackResult> createWebACLMigrationStackAsync(
            CreateWebACLMigrationStackRequest createWebACLMigrationStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebACLMigrationStackRequest, CreateWebACLMigrationStackResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>XssMatchSet</a>, which you use to allow, block, or count requests that contain cross-site scripting
     * attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateXssMatchSet</a> request to specify the parts of web requests in which you want to allow,
     * block, or count cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createXssMatchSetRequest
     *        A request to create an <a>XssMatchSet</a>.
     * @return A Java Future containing the result of the CreateXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.CreateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(CreateXssMatchSetRequest createXssMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>XssMatchSet</a>, which you use to allow, block, or count requests that contain cross-site scripting
     * attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateXssMatchSet</a> request to specify the parts of web requests in which you want to allow,
     * block, or count cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createXssMatchSetRequest
     *        A request to create an <a>XssMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.CreateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(CreateXssMatchSetRequest createXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateXssMatchSetRequest, CreateXssMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>ByteMatchSet</a>. You can't delete a <code>ByteMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any <a>ByteMatchTuple</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>ByteMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>ByteMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteByteMatchSetRequest
     * @return A Java Future containing the result of the DeleteByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(DeleteByteMatchSetRequest deleteByteMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>ByteMatchSet</a>. You can't delete a <code>ByteMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any <a>ByteMatchTuple</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>ByteMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>ByteMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteByteMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(DeleteByteMatchSetRequest deleteByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteByteMatchSetRequest, DeleteByteMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>GeoMatchSet</a>. You can't delete a <code>GeoMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any countries.
     * </p>
     * <p>
     * If you just want to remove a <code>GeoMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>GeoMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>GeoMatchSet</code> to remove any countries. For more information, see <a>UpdateGeoMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteGeoMatchSetRequest
     * @return A Java Future containing the result of the DeleteGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(DeleteGeoMatchSetRequest deleteGeoMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>GeoMatchSet</a>. You can't delete a <code>GeoMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any countries.
     * </p>
     * <p>
     * If you just want to remove a <code>GeoMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>GeoMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>GeoMatchSet</code> to remove any countries. For more information, see <a>UpdateGeoMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteGeoMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(DeleteGeoMatchSetRequest deleteGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGeoMatchSetRequest, DeleteGeoMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>IPSet</a>. You can't delete an <code>IPSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any IP addresses.
     * </p>
     * <p>
     * If you just want to remove an <code>IPSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>IPSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>IPSet</code> to remove IP address ranges, if any. For more information, see <a>UpdateIPSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteIPSetRequest
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>IPSet</a>. You can't delete an <code>IPSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any IP addresses.
     * </p>
     * <p>
     * If you just want to remove an <code>IPSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>IPSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>IPSet</code> to remove IP address ranges, if any. For more information, see <a>UpdateIPSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an IAM policy from the specified RuleGroup.
     * </p>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return A Java Future containing the result of the DeletePermissionPolicy operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeletePermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest deletePermissionPolicyRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an IAM policy from the specified RuleGroup.
     * </p>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermissionPolicy operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeletePermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest deletePermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionPolicyRequest, DeletePermissionPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RateBasedRule</a>. You can't delete a rule if it's still used in any <code>WebACL</code>
     * objects or if it still includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a rule from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RateBasedRule</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RateBasedRule</code> to remove predicates, if any. For more information, see
     * <a>UpdateRateBasedRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRateBasedRuleRequest
     * @return A Java Future containing the result of the DeleteRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(DeleteRateBasedRuleRequest deleteRateBasedRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RateBasedRule</a>. You can't delete a rule if it's still used in any <code>WebACL</code>
     * objects or if it still includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a rule from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RateBasedRule</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RateBasedRule</code> to remove predicates, if any. For more information, see
     * <a>UpdateRateBasedRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRateBasedRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(DeleteRateBasedRuleRequest deleteRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRateBasedRuleRequest, DeleteRateBasedRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexMatchSet</a>. You can't delete a <code>RegexMatchSet</code> if it's still used in
     * any <code>Rules</code> or if it still includes any <code>RegexMatchTuples</code> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>RegexMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RegexMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRegexMatchSetRequest
     * @return A Java Future containing the result of the DeleteRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(DeleteRegexMatchSetRequest deleteRegexMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexMatchSet</a>. You can't delete a <code>RegexMatchSet</code> if it's still used in
     * any <code>Rules</code> or if it still includes any <code>RegexMatchTuples</code> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>RegexMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RegexMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRegexMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(DeleteRegexMatchSetRequest deleteRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegexMatchSetRequest, DeleteRegexMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexPatternSet</a>. You can't delete a <code>RegexPatternSet</code> if it's still used
     * in any <code>RegexMatchSet</code> or if the <code>RegexPatternSet</code> is not empty.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return A Java Future containing the result of the DeleteRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexPatternSet</a>. You can't delete a <code>RegexPatternSet</code> if it's still used
     * in any <code>RegexMatchSet</code> or if the <code>RegexPatternSet</code> is not empty.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegexPatternSetRequest, DeleteRegexPatternSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>Rule</a>. You can't delete a <code>Rule</code> if it's still used in any
     * <code>WebACL</code> objects or if it still includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>Rule</code> from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>Rule</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>Rule</code> to remove predicates, if any. For more information, see <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>Rule</a>. You can't delete a <code>Rule</code> if it's still used in any
     * <code>WebACL</code> objects or if it still includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>Rule</code> from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>Rule</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>Rule</code> to remove predicates, if any. For more information, see <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RuleGroup</a>. You can't delete a <code>RuleGroup</code> if it's still used in any
     * <code>WebACL</code> objects or if it still includes any rules.
     * </p>
     * <p>
     * If you just want to remove a <code>RuleGroup</code> from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RuleGroup</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RuleGroup</code> to remove rules, if any. For more information, see <a>UpdateRuleGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleGroupRequest
     * @return A Java Future containing the result of the DeleteRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest deleteRuleGroupRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RuleGroup</a>. You can't delete a <code>RuleGroup</code> if it's still used in any
     * <code>WebACL</code> objects or if it still includes any rules.
     * </p>
     * <p>
     * If you just want to remove a <code>RuleGroup</code> from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RuleGroup</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RuleGroup</code> to remove rules, if any. For more information, see <a>UpdateRuleGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest deleteRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SizeConstraintSet</a>. You can't delete a <code>SizeConstraintSet</code> if it's still
     * used in any <code>Rules</code> or if it still includes any <a>SizeConstraint</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>SizeConstraintSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SizeConstraintSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSizeConstraintSetRequest
     * @return A Java Future containing the result of the DeleteSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SizeConstraintSet</a>. You can't delete a <code>SizeConstraintSet</code> if it's still
     * used in any <code>Rules</code> or if it still includes any <a>SizeConstraint</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>SizeConstraintSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SizeConstraintSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSizeConstraintSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSizeConstraintSetRequest, DeleteSizeConstraintSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SqlInjectionMatchSet</a>. You can't delete a <code>SqlInjectionMatchSet</code> if it's
     * still used in any <code>Rules</code> or if it still contains any <a>SqlInjectionMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>SqlInjectionMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SqlInjectionMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SqlInjectionMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSqlInjectionMatchSetRequest
     *        A request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
     * @return A Java Future containing the result of the DeleteSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(
            DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SqlInjectionMatchSet</a>. You can't delete a <code>SqlInjectionMatchSet</code> if it's
     * still used in any <code>Rules</code> or if it still contains any <a>SqlInjectionMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>SqlInjectionMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SqlInjectionMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SqlInjectionMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSqlInjectionMatchSetRequest
     *        A request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(
            DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSqlInjectionMatchSetRequest, DeleteSqlInjectionMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>WebACL</a>. You can't delete a <code>WebACL</code> if it still contains any
     * <code>Rules</code>.
     * </p>
     * <p>
     * To delete a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>WebACL</code> to remove <code>Rules</code>, if any. For more information, see
     * <a>UpdateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteWebACLRequest
     * @return A Java Future containing the result of the DeleteWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest deleteWebACLRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>WebACL</a>. You can't delete a <code>WebACL</code> if it still contains any
     * <code>Rules</code>.
     * </p>
     * <p>
     * To delete a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>WebACL</code> to remove <code>Rules</code>, if any. For more information, see
     * <a>UpdateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest deleteWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWebACLRequest, DeleteWebACLResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>XssMatchSet</a>. You can't delete an <code>XssMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still contains any <a>XssMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove an <code>XssMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>XssMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>XssMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateXssMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteXssMatchSetRequest
     *        A request to delete an <a>XssMatchSet</a> from AWS WAF.
     * @return A Java Future containing the result of the DeleteXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.DeleteXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(DeleteXssMatchSetRequest deleteXssMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>XssMatchSet</a>. You can't delete an <code>XssMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still contains any <a>XssMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove an <code>XssMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>XssMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>XssMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateXssMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteXssMatchSetRequest
     *        A request to delete an <a>XssMatchSet</a> from AWS WAF.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DeleteXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(DeleteXssMatchSetRequest deleteXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteXssMatchSetRequest, DeleteXssMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @return A Java Future containing the result of the DisassociateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsync.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DisassociateWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(DisassociateWebACLRequest disassociateWebACLRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DisassociateWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(DisassociateWebACLRequest disassociateWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWebACLRequest, DisassociateWebACLResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @return A Java Future containing the result of the GetByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetByteMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(GetByteMatchSetRequest getByteMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetByteMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(GetByteMatchSetRequest getByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetByteMatchSetRequest, GetByteMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in
     * the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting
     * requests to AWS WAF.
     * </p>
     * <p>
     * Each create, update, or delete request must use a unique change token. If your application submits a
     * <code>GetChangeToken</code> request and then submits a second <code>GetChangeToken</code> request before
     * submitting a create, update, or delete request, the second <code>GetChangeToken</code> request returns the same
     * value as the first <code>GetChangeToken</code> request.
     * </p>
     * <p>
     * When you use a change token in a create, update, or delete request, the status of the change token changes to
     * <code>PENDING</code>, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use
     * <code>GetChangeTokenStatus</code> to determine the status of your change token.
     * </p>
     * 
     * @param getChangeTokenRequest
     * @return A Java Future containing the result of the GetChangeToken operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetChangeToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(GetChangeTokenRequest getChangeTokenRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in
     * the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting
     * requests to AWS WAF.
     * </p>
     * <p>
     * Each create, update, or delete request must use a unique change token. If your application submits a
     * <code>GetChangeToken</code> request and then submits a second <code>GetChangeToken</code> request before
     * submitting a create, update, or delete request, the second <code>GetChangeToken</code> request returns the same
     * value as the first <code>GetChangeToken</code> request.
     * </p>
     * <p>
     * When you use a change token in a create, update, or delete request, the status of the change token changes to
     * <code>PENDING</code>, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use
     * <code>GetChangeTokenStatus</code> to determine the status of your change token.
     * </p>
     * 
     * @param getChangeTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeToken operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetChangeToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(GetChangeTokenRequest getChangeTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeTokenRequest, GetChangeTokenResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the status of a <code>ChangeToken</code> that you got by calling <a>GetChangeToken</a>.
     * <code>ChangeTokenStatus</code> is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code>: You requested the change token by calling <code>GetChangeToken</code>, but you haven't
     * used it yet in a call to create, update, or delete an AWS WAF object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code>: Propagation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeTokenStatusRequest
     * @return A Java Future containing the result of the GetChangeTokenStatus operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetChangeTokenStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeTokenStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(GetChangeTokenStatusRequest getChangeTokenStatusRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the status of a <code>ChangeToken</code> that you got by calling <a>GetChangeToken</a>.
     * <code>ChangeTokenStatus</code> is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code>: You requested the change token by calling <code>GetChangeToken</code>, but you haven't
     * used it yet in a call to create, update, or delete an AWS WAF object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code>: Propagation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeTokenStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeTokenStatus operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetChangeTokenStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeTokenStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(GetChangeTokenStatusRequest getChangeTokenStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeTokenStatusRequest, GetChangeTokenStatusResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>GeoMatchSet</a> that is specified by <code>GeoMatchSetId</code>.
     * </p>
     * 
     * @param getGeoMatchSetRequest
     * @return A Java Future containing the result of the GetGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(GetGeoMatchSetRequest getGeoMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>GeoMatchSet</a> that is specified by <code>GeoMatchSetId</code>.
     * </p>
     * 
     * @param getGeoMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(GetGeoMatchSetRequest getGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetGeoMatchSetRequest, GetGeoMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the IAM policy attached to the RuleGroup.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return A Java Future containing the result of the GetPermissionPolicy operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetPermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest getPermissionPolicyRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the IAM policy attached to the RuleGroup.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPermissionPolicy operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetPermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest getPermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPermissionPolicyRequest, GetPermissionPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RateBasedRule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRateBasedRule</code> request.
     * </p>
     * 
     * @param getRateBasedRuleRequest
     * @return A Java Future containing the result of the GetRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRateBasedRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(GetRateBasedRuleRequest getRateBasedRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RateBasedRule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRateBasedRule</code> request.
     * </p>
     * 
     * @param getRateBasedRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRateBasedRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(GetRateBasedRuleRequest getRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleRequest, GetRateBasedRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of IP addresses currently being blocked by the <a>RateBasedRule</a> that is specified by the
     * <code>RuleId</code>. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000
     * addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
     * </p>
     * 
     * @param getRateBasedRuleManagedKeysRequest
     * @return A Java Future containing the result of the GetRateBasedRuleManagedKeys operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetRateBasedRuleManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRateBasedRuleManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(
            GetRateBasedRuleManagedKeysRequest getRateBasedRuleManagedKeysRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of IP addresses currently being blocked by the <a>RateBasedRule</a> that is specified by the
     * <code>RuleId</code>. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000
     * addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
     * </p>
     * 
     * @param getRateBasedRuleManagedKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRateBasedRuleManagedKeys operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetRateBasedRuleManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRateBasedRuleManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(
            GetRateBasedRuleManagedKeysRequest getRateBasedRuleManagedKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleManagedKeysRequest, GetRateBasedRuleManagedKeysResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexMatchSet</a> specified by <code>RegexMatchSetId</code>.
     * </p>
     * 
     * @param getRegexMatchSetRequest
     * @return A Java Future containing the result of the GetRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(GetRegexMatchSetRequest getRegexMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexMatchSet</a> specified by <code>RegexMatchSetId</code>.
     * </p>
     * 
     * @param getRegexMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(GetRegexMatchSetRequest getRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegexMatchSetRequest, GetRegexMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexPatternSet</a> specified by <code>RegexPatternSetId</code>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return A Java Future containing the result of the GetRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest getRegexPatternSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexPatternSet</a> specified by <code>RegexPatternSetId</code>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest getRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegexPatternSetRequest, GetRegexPatternSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleRequest, GetRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RuleGroup</a> that is specified by the <code>RuleGroupId</code> that you included in the
     * <code>GetRuleGroup</code> request.
     * </p>
     * <p>
     * To view the rules in a rule group, use <a>ListActivatedRulesInRuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @return A Java Future containing the result of the GetRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest getRuleGroupRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RuleGroup</a> that is specified by the <code>RuleGroupId</code> that you included in the
     * <code>GetRuleGroup</code> request.
     * </p>
     * <p>
     * To view the rules in a rule group, use <a>ListActivatedRulesInRuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest getRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleGroupRequest, GetRuleGroupResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
     * among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
     * specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which AWS WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @return A Java Future containing the result of the GetSampledRequests operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSampledRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest getSampledRequestsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
     * among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
     * specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which AWS WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSampledRequests operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSampledRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest getSampledRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSampledRequestsRequest, GetSampledRequestsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @return A Java Future containing the result of the GetSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(GetSizeConstraintSetRequest getSizeConstraintSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(GetSizeConstraintSetRequest getSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetSizeConstraintSetRequest, GetSizeConstraintSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest
     *        A request to get a <a>SqlInjectionMatchSet</a>.
     * @return A Java Future containing the result of the GetSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest
     *        A request to get a <a>SqlInjectionMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetSqlInjectionMatchSetRequest, GetSqlInjectionMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return A Java Future containing the result of the GetWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest getWebACLRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest getWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<GetWebACLRequest, GetWebACLResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @return A Java Future containing the result of the GetWebACLForResource operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACLForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(GetWebACLForResourceRequest getWebACLForResourceRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWebACLForResource operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACLForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(GetWebACLForResourceRequest getWebACLForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetWebACLForResourceRequest, GetWebACLForResourceResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest
     *        A request to get an <a>XssMatchSet</a>.
     * @return A Java Future containing the result of the GetXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.GetXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(GetXssMatchSetRequest getXssMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest
     *        A request to get an <a>XssMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.GetXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(GetXssMatchSetRequest getXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetXssMatchSetRequest, GetXssMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ActivatedRule</a> objects.
     * </p>
     * 
     * @param listActivatedRulesInRuleGroupRequest
     * @return A Java Future containing the result of the ListActivatedRulesInRuleGroup operation returned by the
     *         service.
     * @sample AWSWAFRegionalAsync.ListActivatedRulesInRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListActivatedRulesInRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(
            ListActivatedRulesInRuleGroupRequest listActivatedRulesInRuleGroupRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ActivatedRule</a> objects.
     * </p>
     * 
     * @param listActivatedRulesInRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActivatedRulesInRuleGroup operation returned by the
     *         service.
     * @sample AWSWAFRegionalAsyncHandler.ListActivatedRulesInRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListActivatedRulesInRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(
            ListActivatedRulesInRuleGroupRequest listActivatedRulesInRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListActivatedRulesInRuleGroupRequest, ListActivatedRulesInRuleGroupResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @return A Java Future containing the result of the ListByteMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListByteMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListByteMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(ListByteMatchSetsRequest listByteMatchSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListByteMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListByteMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListByteMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(ListByteMatchSetsRequest listByteMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListByteMatchSetsRequest, ListByteMatchSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listGeoMatchSetsRequest
     * @return A Java Future containing the result of the ListGeoMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListGeoMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListGeoMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(ListGeoMatchSetsRequest listGeoMatchSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listGeoMatchSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeoMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListGeoMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListGeoMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(ListGeoMatchSetsRequest listGeoMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGeoMatchSetsRequest, ListGeoMatchSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRateBasedRulesRequest
     * @return A Java Future containing the result of the ListRateBasedRules operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListRateBasedRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRateBasedRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(ListRateBasedRulesRequest listRateBasedRulesRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRateBasedRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRateBasedRules operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListRateBasedRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRateBasedRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(ListRateBasedRulesRequest listRateBasedRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRateBasedRulesRequest, ListRateBasedRulesResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexMatchSetsRequest
     * @return A Java Future containing the result of the ListRegexMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListRegexMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRegexMatchSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(ListRegexMatchSetsRequest listRegexMatchSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexMatchSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegexMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListRegexMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRegexMatchSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(ListRegexMatchSetsRequest listRegexMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegexMatchSetsRequest, ListRegexMatchSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return A Java Future containing the result of the ListRegexPatternSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRegexPatternSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest listRegexPatternSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegexPatternSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRegexPatternSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest listRegexPatternSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegexPatternSetsRequest, ListRegexPatternSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of resources associated with the specified web ACL.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @return A Java Future containing the result of the ListResourcesForWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListResourcesForWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(ListResourcesForWebACLRequest listResourcesForWebACLRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of resources associated with the specified web ACL.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourcesForWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListResourcesForWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(ListResourcesForWebACLRequest listResourcesForWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesForWebACLRequest, ListResourcesForWebACLResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return A Java Future containing the result of the ListRuleGroups operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRuleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest listRuleGroupsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleGroups operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRuleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest listRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @return A Java Future containing the result of the ListSizeConstraintSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListSizeConstraintSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSizeConstraintSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(ListSizeConstraintSetsRequest listSizeConstraintSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSizeConstraintSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListSizeConstraintSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSizeConstraintSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(ListSizeConstraintSetsRequest listSizeConstraintSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSizeConstraintSetsRequest, ListSizeConstraintSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest
     *        A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
     * @return A Java Future containing the result of the ListSqlInjectionMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListSqlInjectionMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSqlInjectionMatchSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(
            ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest
     *        A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSqlInjectionMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListSqlInjectionMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSqlInjectionMatchSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(
            ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSqlInjectionMatchSetsRequest, ListSqlInjectionMatchSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects that you are subscribed to.
     * </p>
     * 
     * @param listSubscribedRuleGroupsRequest
     * @return A Java Future containing the result of the ListSubscribedRuleGroups operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListSubscribedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSubscribedRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(ListSubscribedRuleGroupsRequest listSubscribedRuleGroupsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects that you are subscribed to.
     * </p>
     * 
     * @param listSubscribedRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscribedRuleGroups operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListSubscribedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSubscribedRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(ListSubscribedRuleGroupsRequest listSubscribedRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscribedRuleGroupsRequest, ListSubscribedRuleGroupsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Retrieves the tags associated with the specified AWS resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS
     * resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't manage or view tags through the AWS WAF
     * Classic console. You can tag the AWS resources that you manage through AWS WAF Classic: web ACLs, rule groups,
     * and rules.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Retrieves the tags associated with the specified AWS resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS
     * resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't manage or view tags through the AWS WAF
     * Classic console. You can tag the AWS resources that you manage through AWS WAF Classic: web ACLs, rule groups,
     * and rules.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return A Java Future containing the result of the ListWebACLs operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest listWebACLsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWebACLs operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest listWebACLsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWebACLsRequest, ListWebACLsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest
     *        A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
     * @return A Java Future containing the result of the ListXssMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsync.ListXssMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListXssMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(ListXssMatchSetsRequest listXssMatchSetsRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest
     *        A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListXssMatchSets operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.ListXssMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListXssMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(ListXssMatchSetsRequest listXssMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListXssMatchSetsRequest, ListXssMatchSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates a <a>LoggingConfiguration</a> with a specified web ACL.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the region that you are operating. However, if you are
     * capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).
     * </p>
     * <note>
     * <p>
     * Do not create the data firehose using a <code>Kinesis stream</code> as your source.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
     * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging Web ACL
     * Traffic Information</a> in the <i>AWS WAF Developer Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @return A Java Future containing the result of the PutLoggingConfiguration operation returned by the service.
     * @sample AWSWAFRegionalAsync.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest putLoggingConfigurationRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates a <a>LoggingConfiguration</a> with a specified web ACL.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the region that you are operating. However, if you are
     * capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).
     * </p>
     * <note>
     * <p>
     * Do not create the data firehose using a <code>Kinesis stream</code> as your source.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
     * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging Web ACL
     * Traffic Information</a> in the <i>AWS WAF Developer Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLoggingConfiguration operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest putLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutLoggingConfigurationRequest, PutLoggingConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Attaches an IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup
     * across accounts.
     * </p>
     * <p>
     * The <code>PutPermissionPolicy</code> is subject to the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy must include an <code>Effect</code>, <code>Action</code> and <code>Principal</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Effect</code> must specify <code>Allow</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Action</code> in the policy must be <code>waf:UpdateWebACL</code>,
     * <code>waf-regional:UpdateWebACL</code>, <code>waf:GetRuleGroup</code> and <code>waf-regional:GetRuleGroup</code>
     * . Any extra or wildcard actions in the policy will be rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy cannot include a <code>Resource</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your policy must be composed using IAM Policy version 2012-10-17.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM
     * Policies</a>.
     * </p>
     * <p>
     * An example of a valid policy parameter is shown in the Examples section below.
     * </p>
     * 
     * @param putPermissionPolicyRequest
     * @return A Java Future containing the result of the PutPermissionPolicy operation returned by the service.
     * @sample AWSWAFRegionalAsync.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutPermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest putPermissionPolicyRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Attaches an IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup
     * across accounts.
     * </p>
     * <p>
     * The <code>PutPermissionPolicy</code> is subject to the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy must include an <code>Effect</code>, <code>Action</code> and <code>Principal</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Effect</code> must specify <code>Allow</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Action</code> in the policy must be <code>waf:UpdateWebACL</code>,
     * <code>waf-regional:UpdateWebACL</code>, <code>waf:GetRuleGroup</code> and <code>waf-regional:GetRuleGroup</code>
     * . Any extra or wildcard actions in the policy will be rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy cannot include a <code>Resource</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your policy must be composed using IAM Policy version 2012-10-17.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM
     * Policies</a>.
     * </p>
     * <p>
     * An example of a valid policy parameter is shown in the Examples section below.
     * </p>
     * 
     * @param putPermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPermissionPolicy operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutPermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest putPermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutPermissionPolicyRequest, PutPermissionPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates tags with the specified AWS resource. Tags are key:value pairs that you can use to categorize and
     * manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the
     * value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for
     * a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't manage or view tags through the AWS WAF
     * Classic console. You can use this action to tag the AWS resources that you manage through AWS WAF Classic: web
     * ACLs, rule groups, and rules.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSWAFRegionalAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates tags with the specified AWS resource. Tags are key:value pairs that you can use to categorize and
     * manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the
     * value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for
     * a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't manage or view tags through the AWS WAF
     * Classic console. You can use this action to tag the AWS resources that you manage through AWS WAF Classic: web
     * ACLs, rule groups, and rules.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p/>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSWAFRegionalAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p/>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ByteMatchTuple</a> objects (filters) in a <a>ByteMatchSet</a>. For each
     * <code>ByteMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a <code>ByteMatchSetUpdate</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more
     * information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see
     * <code>TargetString</code> in the <a>ByteMatchTuple</a> data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Where to look, such as at the beginning or the end of a query string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>ByteMatchSetUpdate</code> object that matches web requests in which
     * <code>User-Agent</code> headers contain the string <code>BadBot</code>. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>ByteMatchSet.</code> For more information, see <a>CreateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateByteMatchSet</code> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateByteMatchSetRequest
     * @return A Java Future containing the result of the UpdateByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(UpdateByteMatchSetRequest updateByteMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ByteMatchTuple</a> objects (filters) in a <a>ByteMatchSet</a>. For each
     * <code>ByteMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a <code>ByteMatchSetUpdate</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more
     * information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see
     * <code>TargetString</code> in the <a>ByteMatchTuple</a> data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Where to look, such as at the beginning or the end of a query string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>ByteMatchSetUpdate</code> object that matches web requests in which
     * <code>User-Agent</code> headers contain the string <code>BadBot</code>. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>ByteMatchSet.</code> For more information, see <a>CreateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateByteMatchSet</code> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateByteMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateByteMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(UpdateByteMatchSetRequest updateByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateByteMatchSetRequest, UpdateByteMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>GeoMatchConstraint</a> objects in an <code>GeoMatchSet</code>. For each
     * <code>GeoMatchConstraint</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change an <code>GeoMatchConstraint</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Type</code>. The only valid value for <code>Type</code> is <code>Country</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Value</code>, which is a two character code for the country to add to the
     * <code>GeoMatchConstraint</code> object. Valid codes are listed in <a>GeoMatchConstraint$Value</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure an <code>GeoMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSet</code> request to specify the country that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>GeoMatchSet</code>, you specify the country that you want to add and/or the country that
     * you want to delete. If you want to change a country, you delete the existing country and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateGeoMatchSetRequest
     * @return A Java Future containing the result of the UpdateGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(UpdateGeoMatchSetRequest updateGeoMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>GeoMatchConstraint</a> objects in an <code>GeoMatchSet</code>. For each
     * <code>GeoMatchConstraint</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change an <code>GeoMatchConstraint</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Type</code>. The only valid value for <code>Type</code> is <code>Country</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Value</code>, which is a two character code for the country to add to the
     * <code>GeoMatchConstraint</code> object. Valid codes are listed in <a>GeoMatchConstraint$Value</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure an <code>GeoMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSet</code> request to specify the country that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>GeoMatchSet</code>, you specify the country that you want to add and/or the country that
     * you want to delete. If you want to change a country, you delete the existing country and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateGeoMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGeoMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(UpdateGeoMatchSetRequest updateGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGeoMatchSetRequest, UpdateGeoMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>IPSetDescriptor</a> objects in an <code>IPSet</code>. For each <code>IPSetDescriptor</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change an <code>IPSetDescriptor</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address version, <code>IPv4</code> or <code>IPv6</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address in CIDR notation, for example, <code>192.0.2.0/24</code> (for the range of IP addresses from
     * <code>192.0.2.0</code> to <code>192.0.2.255</code>) or <code>192.0.2.44/32</code> (for the individual IP address
     * <code>192.0.2.44</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address
     * ranges: /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * IPv6 addresses can be represented using any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1111:0000:0000:0000:0000:0000:0000:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111:0:0:0:0:0:0:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::111/128
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use an <code>IPSet</code> to specify which web requests you want to allow or block based on the IP addresses
     * that the requests originated from. For example, if you're receiving a lot of requests from one or a small number
     * of IP addresses and you want to block the requests, you can create an <code>IPSet</code> that specifies those IP
     * addresses, and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>IPSet</code>, you specify the IP addresses that you want to add and/or the IP addresses
     * that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new
     * one.
     * </p>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>IPSetDescriptor</a> objects in an <code>IPSet</code>. For each <code>IPSetDescriptor</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change an <code>IPSetDescriptor</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address version, <code>IPv4</code> or <code>IPv6</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address in CIDR notation, for example, <code>192.0.2.0/24</code> (for the range of IP addresses from
     * <code>192.0.2.0</code> to <code>192.0.2.255</code>) or <code>192.0.2.44/32</code> (for the individual IP address
     * <code>192.0.2.44</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address
     * ranges: /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * IPv6 addresses can be represented using any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1111:0000:0000:0000:0000:0000:0000:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111:0:0:0:0:0:0:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::111/128
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use an <code>IPSet</code> to specify which web requests you want to allow or block based on the IP addresses
     * that the requests originated from. For example, if you're receiving a lot of requests from one or a small number
     * of IP addresses and you want to block the requests, you can create an <code>IPSet</code> that specifies those IP
     * addresses, and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>IPSet</code>, you specify the IP addresses that you want to add and/or the IP addresses
     * that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new
     * one.
     * </p>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a rule and updates the <code>RateLimit</code> in the rule.
     * </p>
     * <p>
     * Each <code>Predicate</code> object identifies a predicate, such as a <a>ByteMatchSet</a> or an <a>IPSet</a>, that
     * specifies the web requests that you want to block or count. The <code>RateLimit</code> specifies the number of
     * requests every five minutes that triggers the rule.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a request must match all the predicates and
     * exceed the <code>RateLimit</code> to be counted or blocked. For example, suppose you add the following to a
     * <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and specify that you want to block requests
     * that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 <i>and</i> the
     * <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>. Further, requests that
     * match these two conditions much be received at a rate of more than 1,000 every five minutes. If the rate drops
     * below this limit, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you could limit requests to your login page
     * without affecting the rest of your site.
     * </p>
     * 
     * @param updateRateBasedRuleRequest
     * @return A Java Future containing the result of the UpdateRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(UpdateRateBasedRuleRequest updateRateBasedRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a rule and updates the <code>RateLimit</code> in the rule.
     * </p>
     * <p>
     * Each <code>Predicate</code> object identifies a predicate, such as a <a>ByteMatchSet</a> or an <a>IPSet</a>, that
     * specifies the web requests that you want to block or count. The <code>RateLimit</code> specifies the number of
     * requests every five minutes that triggers the rule.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a request must match all the predicates and
     * exceed the <code>RateLimit</code> to be counted or blocked. For example, suppose you add the following to a
     * <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and specify that you want to block requests
     * that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 <i>and</i> the
     * <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>. Further, requests that
     * match these two conditions much be received at a rate of more than 1,000 every five minutes. If the rate drops
     * below this limit, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you could limit requests to your login page
     * without affecting the rest of your site.
     * </p>
     * 
     * @param updateRateBasedRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRateBasedRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(UpdateRateBasedRuleRequest updateRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRateBasedRuleRequest, UpdateRateBasedRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>RegexMatchTuple</a> objects (filters) in a <a>RegexMatchSet</a>. For each
     * <code>RegexMatchSetUpdate</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a <code>RegexMatchSetUpdate</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternSet</code> that matches any requests with <code>User-Agent</code>
     * headers that contain the string <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexMatchSet.</code> For more information, see <a>CreateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexMatchSet</code> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the identifier of the <code>RegexPatternSet</code> that contain
     * the regular expression patters you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexMatchSetRequest
     * @return A Java Future containing the result of the UpdateRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(UpdateRegexMatchSetRequest updateRegexMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>RegexMatchTuple</a> objects (filters) in a <a>RegexMatchSet</a>. For each
     * <code>RegexMatchSetUpdate</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a <code>RegexMatchSetUpdate</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternSet</code> that matches any requests with <code>User-Agent</code>
     * headers that contain the string <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexMatchSet.</code> For more information, see <a>CreateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexMatchSet</code> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the identifier of the <code>RegexPatternSet</code> that contain
     * the regular expression patters you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRegexMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(UpdateRegexMatchSetRequest updateRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRegexMatchSetRequest, UpdateRegexMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <code>RegexPatternString</code> objects in a <a>RegexPatternSet</a>. For each
     * <code>RegexPatternString</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the <code>RegexPatternString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The regular expression pattern that you want to insert or delete. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternString</code> such as <code>B[a@]dB[o0]t</code>. AWS WAF will
     * match this <code>RegexPatternString</code> to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BadBot
     * </p>
     * </li>
     * <li>
     * <p>
     * BadB0t
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dBot
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dB0t
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexPatternSet.</code> For more information, see <a>CreateRegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexPatternSet</code> request to specify the regular expression pattern that you want AWS
     * WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexPatternSetRequest
     * @return A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest updateRegexPatternSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <code>RegexPatternString</code> objects in a <a>RegexPatternSet</a>. For each
     * <code>RegexPatternString</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the <code>RegexPatternString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The regular expression pattern that you want to insert or delete. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternString</code> such as <code>B[a@]dB[o0]t</code>. AWS WAF will
     * match this <code>RegexPatternString</code> to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BadBot
     * </p>
     * </li>
     * <li>
     * <p>
     * BadB0t
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dBot
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dB0t
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexPatternSet.</code> For more information, see <a>CreateRegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexPatternSet</code> request to specify the regular expression pattern that you want AWS
     * WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest updateRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRegexPatternSetRequest, UpdateRegexPatternSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a <code>Rule</code>. Each <code>Predicate</code> object identifies
     * a predicate, such as a <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests that you want to
     * allow, block, or count. If you add more than one predicate to a <code>Rule</code>, a request must match all of
     * the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a
     * <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches the value <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to block requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code> <i>and</i> the request must originate from the IP address 192.0.2.44.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the <code>Rule</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to add predicates to the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>ByteMatchSet</code> or <code>IPSet</code> with another, you delete the existing
     * one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a <code>Rule</code>. Each <code>Predicate</code> object identifies
     * a predicate, such as a <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests that you want to
     * allow, block, or count. If you add more than one predicate to a <code>Rule</code>, a request must match all of
     * the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a
     * <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches the value <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to block requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code> <i>and</i> the request must originate from the IP address 192.0.2.44.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the <code>Rule</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to add predicates to the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>ByteMatchSet</code> or <code>IPSet</code> with another, you delete the existing
     * one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>RuleGroup</code>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * You can have a maximum of ten rules per rule group.
     * </p>
     * <p>
     * To create and configure a <code>RuleGroup</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>RuleGroup</code>. See
     * <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRuleGroup</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRuleGroup</code> request to add <code>Rules</code> to the <code>RuleGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>RuleGroup</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>Rule</code> with another, you delete the existing one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return A Java Future containing the result of the UpdateRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest updateRuleGroupRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>RuleGroup</code>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * You can have a maximum of ten rules per rule group.
     * </p>
     * <p>
     * To create and configure a <code>RuleGroup</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>RuleGroup</code>. See
     * <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRuleGroup</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRuleGroup</code> request to add <code>Rules</code> to the <code>RuleGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>RuleGroup</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>Rule</code> with another, you delete the existing one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuleGroup operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest updateRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SizeConstraint</a> objects (filters) in a <a>SizeConstraintSet</a>. For each
     * <code>SizeConstraint</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a
     * <code>SizeConstraintSetUpdate</code> object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length
     * of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any transformations on the request, such as converting it to lowercase, before checking its
     * length. Note that transformations of the request body are not supported because the AWS resource forwards only
     * the first <code>8192</code> bytes of your request to AWS WAF.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ComparisonOperator</code> used for evaluating the selected part of the request against the specified
     * <code>Size</code>, such as equals, greater than, less than, and so on.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed
     * after applying the transformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>SizeConstraintSetUpdate</code> object that matches web requests in which the
     * length of the <code>User-Agent</code> header is greater than 100 bytes. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>SizeConstraintSet.</code> For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSizeConstraintSet</code> request to specify the part of the request that you want AWS WAF
     * to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSizeConstraintSetRequest
     * @return A Java Future containing the result of the UpdateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SizeConstraint</a> objects (filters) in a <a>SizeConstraintSet</a>. For each
     * <code>SizeConstraint</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a
     * <code>SizeConstraintSetUpdate</code> object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length
     * of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any transformations on the request, such as converting it to lowercase, before checking its
     * length. Note that transformations of the request body are not supported because the AWS resource forwards only
     * the first <code>8192</code> bytes of your request to AWS WAF.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ComparisonOperator</code> used for evaluating the selected part of the request against the specified
     * <code>Size</code>, such as equals, greater than, less than, and so on.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed
     * after applying the transformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>SizeConstraintSetUpdate</code> object that matches web requests in which the
     * length of the <code>User-Agent</code> header is greater than 100 bytes. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>SizeConstraintSet.</code> For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSizeConstraintSet</code> request to specify the part of the request that you want AWS WAF
     * to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSizeConstraintSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSizeConstraintSetRequest, UpdateSizeConstraintSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SqlInjectionMatchTuple</a> objects (filters) in a <a>SqlInjectionMatchSet</a>. For each
     * <code>SqlInjectionMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change a
     * <code>SqlInjectionMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header or custom query parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for snippets of malicious SQL code.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>SqlInjectionMatchSet</code> objects to specify which CloudFront requests that you want to allow,
     * block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string
     * and you want to block the requests, you can create a <code>SqlInjectionMatchSet</code> with the applicable
     * settings, and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSqlInjectionMatchSet</code> request to specify the parts of web requests that you want AWS
     * WAF to inspect for snippets of SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSqlInjectionMatchSetRequest
     *        A request to update a <a>SqlInjectionMatchSet</a>.
     * @return A Java Future containing the result of the UpdateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(
            UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SqlInjectionMatchTuple</a> objects (filters) in a <a>SqlInjectionMatchSet</a>. For each
     * <code>SqlInjectionMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change a
     * <code>SqlInjectionMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header or custom query parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for snippets of malicious SQL code.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>SqlInjectionMatchSet</code> objects to specify which CloudFront requests that you want to allow,
     * block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string
     * and you want to block the requests, you can create a <code>SqlInjectionMatchSet</code> with the applicable
     * settings, and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSqlInjectionMatchSet</code> request to specify the parts of web requests that you want AWS
     * WAF to inspect for snippets of SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSqlInjectionMatchSetRequest
     *        A request to update a <a>SqlInjectionMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(
            UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSqlInjectionMatchSetRequest, UpdateSqlInjectionMatchSetResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>WebACL</code>. Each <code>Rule</code> identifies web
     * requests that you want to allow, block, or count. When you update a <code>WebACL</code>, you specify the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A default action for the <code>WebACL</code>, either <code>ALLOW</code> or <code>BLOCK</code>. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the <code>Rules</code> in a
     * <code>WebACL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Rules</code> that you want to add or delete. If you want to replace one <code>Rule</code> with another,
     * you delete the existing <code>Rule</code> and add the new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each <code>Rule</code>, whether you want AWS WAF to allow requests, block requests, or count requests that
     * match the conditions in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order in which you want AWS WAF to evaluate the <code>Rules</code> in a <code>WebACL</code>. If you add more
     * than one <code>Rule</code> to a <code>WebACL</code>, AWS WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. (The <code>Rule</code> that has the
     * lowest value for <code>Priority</code> is evaluated first.) When a web request matches all the predicates (such
     * as <code>ByteMatchSets</code> and <code>IPSets</code>) in a <code>Rule</code>, AWS WAF immediately takes the
     * corresponding action, allow or block, and doesn't evaluate the request against the remaining <code>Rules</code>
     * in the <code>WebACL</code>, if any.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in <code>Rules</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <code>WebACL</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateWebACL</code> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * <p>
     * The <code>ActivatedRule</code> can be a rule group. If you specify a rule group as your
     * <code>ActivatedRule</code> , you can exclude specific rules from that rule group.
     * </p>
     * <p>
     * If you already have a rule group associated with a web ACL and want to submit an <code>UpdateWebACL</code>
     * request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the
     * re-insert it again, specifying the excluded rules. For details, see <a>ActivatedRule$ExcludedRules</a> .
     * </p>
     * </li>
     * </ol>
     * <p>
     * Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating
     * the rule, the <a>UpdateWebACL</a> request will fail because the request tries to add a REGULAR rule (the default
     * rule type) with the specified ID, which does not exist.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return A Java Future containing the result of the UpdateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest updateWebACLRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>WebACL</code>. Each <code>Rule</code> identifies web
     * requests that you want to allow, block, or count. When you update a <code>WebACL</code>, you specify the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A default action for the <code>WebACL</code>, either <code>ALLOW</code> or <code>BLOCK</code>. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the <code>Rules</code> in a
     * <code>WebACL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Rules</code> that you want to add or delete. If you want to replace one <code>Rule</code> with another,
     * you delete the existing <code>Rule</code> and add the new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each <code>Rule</code>, whether you want AWS WAF to allow requests, block requests, or count requests that
     * match the conditions in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order in which you want AWS WAF to evaluate the <code>Rules</code> in a <code>WebACL</code>. If you add more
     * than one <code>Rule</code> to a <code>WebACL</code>, AWS WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. (The <code>Rule</code> that has the
     * lowest value for <code>Priority</code> is evaluated first.) When a web request matches all the predicates (such
     * as <code>ByteMatchSets</code> and <code>IPSets</code>) in a <code>Rule</code>, AWS WAF immediately takes the
     * corresponding action, allow or block, and doesn't evaluate the request against the remaining <code>Rules</code>
     * in the <code>WebACL</code>, if any.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in <code>Rules</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <code>WebACL</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateWebACL</code> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * <p>
     * The <code>ActivatedRule</code> can be a rule group. If you specify a rule group as your
     * <code>ActivatedRule</code> , you can exclude specific rules from that rule group.
     * </p>
     * <p>
     * If you already have a rule group associated with a web ACL and want to submit an <code>UpdateWebACL</code>
     * request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the
     * re-insert it again, specifying the excluded rules. For details, see <a>ActivatedRule$ExcludedRules</a> .
     * </p>
     * </li>
     * </ol>
     * <p>
     * Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating
     * the rule, the <a>UpdateWebACL</a> request will fail because the request tries to add a REGULAR rule (the default
     * rule type) with the specified ID, which does not exist.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWebACL operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest updateWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWebACLRequest, UpdateWebACLResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>XssMatchTuple</a> objects (filters) in an <a>XssMatchSet</a>. For each
     * <code>XssMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change an
     * <code>XssMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header or custom query parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for cross-site scripting attacks.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>XssMatchSet</code> objects to specify which CloudFront requests that you want to allow, block, or
     * count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body
     * and you want to block the requests, you can create an <code>XssMatchSet</code> with the applicable settings, and
     * then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateXssMatchSet</code> request to specify the parts of web requests that you want AWS WAF to
     * inspect for cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateXssMatchSetRequest
     *        A request to update an <a>XssMatchSet</a>.
     * @return A Java Future containing the result of the UpdateXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsync.UpdateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(UpdateXssMatchSetRequest updateXssMatchSetRequest);

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
     * developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With
     * the latest version, AWS WAF has a single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>XssMatchTuple</a> objects (filters) in an <a>XssMatchSet</a>. For each
     * <code>XssMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change an
     * <code>XssMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header or custom query parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for cross-site scripting attacks.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>XssMatchSet</code> objects to specify which CloudFront requests that you want to allow, block, or
     * count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body
     * and you want to block the requests, you can create an <code>XssMatchSet</code> with the applicable settings, and
     * then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateXssMatchSet</code> request to specify the parts of web requests that you want AWS WAF to
     * inspect for cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateXssMatchSetRequest
     *        A request to update an <a>XssMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateXssMatchSet operation returned by the service.
     * @sample AWSWAFRegionalAsyncHandler.UpdateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(UpdateXssMatchSetRequest updateXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateXssMatchSetRequest, UpdateXssMatchSetResult> asyncHandler);

}
