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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateIPSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIPSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     */
    private String scope;
    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A description of the IP set that helps with identification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     */
    private java.util.List<String> addresses;
    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     */
    private String lockToken;

    /**
     * <p>
     * The name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        The name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @return The name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        The name of the IP set. You cannot change the name of an <code>IPSet</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     *        </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *         application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL
     *         API. </p>
     *         <p>
     *         To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CLI - Specify the Region when you use the CloudFront scope:
     *         <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         API and SDKs - For all calls, use the Region endpoint us-east-1.
     *         </p>
     *         </li>
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     *        </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public UpdateIPSetRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     *        </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public UpdateIPSetRequest withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *        provide it to operations like update and delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @return A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *         provide it to operations like update and delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *        provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A description of the IP set that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the IP set that helps with identification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the IP set that helps with identification.
     * </p>
     * 
     * @return A description of the IP set that helps with identification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the IP set that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the IP set that helps with identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @return Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *         Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0. </p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *         specify <code>192.0.2.44/32</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *         to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *         1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *         1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *         <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CIDR notation, see the Wikipedia entry <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public java.util.List<String> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param addresses
     *        Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *        Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0. </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *        specify <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *        to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *        1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *        1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *        <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public void setAddresses(java.util.Collection<String> addresses) {
        if (addresses == null) {
            this.addresses = null;
            return;
        }

        this.addresses = new java.util.ArrayList<String>(addresses);
    }

    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddresses(java.util.Collection)} or {@link #withAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addresses
     *        Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *        Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0. </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *        specify <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *        to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *        1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *        1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *        <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withAddresses(String... addresses) {
        if (this.addresses == null) {
            setAddresses(new java.util.ArrayList<String>(addresses.length));
        }
        for (String ele : addresses) {
            this.addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to
     * 192.0.2.255, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param addresses
     *        Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless
     *        Inter-Domain Routing (CIDR) notation. AWS WAF supports all IPv4 and IPv6 CIDR ranges except for /0. </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44,
     *        specify <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0
     *        to 192.0.2.255, specify <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *        1111:0000:0000:0000:0000:0000:0000:0111, specify <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *        1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *        <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withAddresses(java.util.Collection<String> addresses) {
        setAddresses(addresses);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     */

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *         state of the entity at the time of the request. To make changes to the entity associated with the token,
     *         you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *         changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *         fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *         new token returned by that operation.
     */

    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withLockToken(String lockToken) {
        setLockToken(lockToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAddresses() != null)
            sb.append("Addresses: ").append(getAddresses()).append(",");
        if (getLockToken() != null)
            sb.append("LockToken: ").append(getLockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIPSetRequest == false)
            return false;
        UpdateIPSetRequest other = (UpdateIPSetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null && other.getAddresses().equals(this.getAddresses()) == false)
            return false;
        if (other.getLockToken() == null ^ this.getLockToken() == null)
            return false;
        if (other.getLockToken() != null && other.getLockToken().equals(this.getLockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode + ((getLockToken() == null) ? 0 : getLockToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIPSetRequest clone() {
        return (UpdateIPSetRequest) super.clone();
    }

}
