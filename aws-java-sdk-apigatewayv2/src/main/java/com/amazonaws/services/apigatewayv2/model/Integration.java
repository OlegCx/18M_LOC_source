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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an integration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Integration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you created an API using using quick create, the
     * resulting integration is managed by API Gateway. You can update a managed integration, but you can't delete it.
     * </p>
     */
    private Boolean apiGatewayManaged;
    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP APIs.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify INTERNET for connections through the
     * public routable internet or VPC_LINK for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     */
    private String contentHandlingStrategy;
    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     */
    private String credentialsArn;
    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     */
    private String integrationId;
    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     */
    private String integrationMethod;
    /**
     * <p>
     * The integration response selection expression for the integration. Supported only for WebSocket APIs. See <a
     * href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     */
    private String integrationResponseSelectionExpression;
    /**
     * <p>
     * Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn more,
     * see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html"
     * >Integration subtype reference</a>.
     * </p>
     */
    private String integrationSubtype;
    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket
     * APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action. This
     * integration is also referred to as a Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * the HTTP custom integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed
     * through as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend. Supported only for WebSocket APIs.
     * </p>
     */
    private String integrationType;
    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load
     * Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API Gateway uses
     * DiscoverInstances to identify resources. You can use query parameters to target specific resources. To learn
     * more, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html">DiscoverInstances</a>. For
     * private integrations, all resources must be owned by the same AWS account.
     * </p>
     */
    private String integrationUri;
    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     */
    private String passthroughBehavior;
    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for HTTP APIs.
     * </p>
     */
    private String payloadFormatVersion;
    /**
     * <p>
     * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the
     * backend. The key is an integration request parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The
     * method request parameter value must match the pattern of
     * method.request.<replaceable>{location}</replaceable>.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header; and <replaceable>{name}</replaceable> must
     * be a valid and unique method request parameter name.
     * </p>
     * <p>
     * For HTTP API integrations with a specified integrationSubtype, request parameters are a key-value map specifying
     * parameters that are passed to AWS_PROXY integrations. You can provide static values, or map request data, stage
     * variables, or context variables that are evaluated at runtime. To learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html"
     * >Working with AWS service integrations for HTTP APIs</a>.
     * </p>
     * <p>
     * For HTTP API itegrations, without a specified integrationSubtype request parameters are a key-value map
     * specifying how to transform HTTP requests before sending them to backend integrations. The key should follow the
     * pattern &lt;action&gt;:&lt;header|querystring|path&gt;.&lt;location&gt;. The action can be append, overwrite or
     * remove. For values, you can provide static values, or map request data, stage variables, or context variables
     * that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     */
    private java.util.Map<String, String> requestParameters;
    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     */
    private java.util.Map<String, String> requestTemplates;
    /**
     * <p>
     * Supported only for HTTP APIs. You use response parameters to transform the HTTP response from a backend
     * integration before returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599. Response parameters
     * are a key-value map. The key must match pattern &lt;action&gt;:&lt;header&gt;.&lt;location&gt; or
     * overwrite.statuscode. The action can be append, overwrite or remove. The value can be a static value, or map to
     * response data, stage variables, or context variables that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> responseParameters;
    /**
     * <p>
     * The template selection expression for the integration. Supported only for WebSocket APIs.
     * </p>
     */
    private String templateSelectionExpression;
    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for
     * HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     */
    private Integer timeoutInMillis;
    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic
     * uses the HTTPS protocol. Supported only for HTTP APIs.
     * </p>
     */
    private TlsConfig tlsConfig;

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you created an API using using quick create, the
     * resulting integration is managed by API Gateway. You can update a managed integration, but you can't delete it.
     * </p>
     * 
     * @param apiGatewayManaged
     *        Specifies whether an integration is managed by API Gateway. If you created an API using using quick
     *        create, the resulting integration is managed by API Gateway. You can update a managed integration, but you
     *        can't delete it.
     */

    public void setApiGatewayManaged(Boolean apiGatewayManaged) {
        this.apiGatewayManaged = apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you created an API using using quick create, the
     * resulting integration is managed by API Gateway. You can update a managed integration, but you can't delete it.
     * </p>
     * 
     * @return Specifies whether an integration is managed by API Gateway. If you created an API using using quick
     *         create, the resulting integration is managed by API Gateway. You can update a managed integration, but
     *         you can't delete it.
     */

    public Boolean getApiGatewayManaged() {
        return this.apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you created an API using using quick create, the
     * resulting integration is managed by API Gateway. You can update a managed integration, but you can't delete it.
     * </p>
     * 
     * @param apiGatewayManaged
     *        Specifies whether an integration is managed by API Gateway. If you created an API using using quick
     *        create, the resulting integration is managed by API Gateway. You can update a managed integration, but you
     *        can't delete it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withApiGatewayManaged(Boolean apiGatewayManaged) {
        setApiGatewayManaged(apiGatewayManaged);
        return this;
    }

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you created an API using using quick create, the
     * resulting integration is managed by API Gateway. You can update a managed integration, but you can't delete it.
     * </p>
     * 
     * @return Specifies whether an integration is managed by API Gateway. If you created an API using using quick
     *         create, the resulting integration is managed by API Gateway. You can update a managed integration, but
     *         you can't delete it.
     */

    public Boolean isApiGatewayManaged() {
        return this.apiGatewayManaged;
    }

    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP APIs.
     * </p>
     * 
     * @param connectionId
     *        The ID of the VPC link for a private integration. Supported only for HTTP APIs.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP APIs.
     * </p>
     * 
     * @return The ID of the VPC link for a private integration. Supported only for HTTP APIs.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP APIs.
     * </p>
     * 
     * @param connectionId
     *        The ID of the VPC link for a private integration. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify INTERNET for connections through the
     * public routable internet or VPC_LINK for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. Specify INTERNET for connections through
     *        the public routable internet or VPC_LINK for private connections between API Gateway and resources in a
     *        VPC. The default value is INTERNET.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify INTERNET for connections through the
     * public routable internet or VPC_LINK for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * 
     * @return The type of the network connection to the integration endpoint. Specify INTERNET for connections through
     *         the public routable internet or VPC_LINK for private connections between API Gateway and resources in a
     *         VPC. The default value is INTERNET.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify INTERNET for connections through the
     * public routable internet or VPC_LINK for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. Specify INTERNET for connections through
     *        the public routable internet or VPC_LINK for private connections between API Gateway and resources in a
     *        VPC. The default value is INTERNET.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public Integration withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify INTERNET for connections through the
     * public routable internet or VPC_LINK for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. Specify INTERNET for connections through
     *        the public routable internet or VPC_LINK for private connections between API Gateway and resources in a
     *        VPC. The default value is INTERNET.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public Integration withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *        Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @see ContentHandlingStrategy
     */

    public void setContentHandlingStrategy(String contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @return Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *         Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *         <p>
     *         CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *         blob.
     *         </p>
     *         <p>
     *         CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *         </p>
     *         <p>
     *         If this property is not defined, the response payload will be passed through from the integration
     *         response to the route response or method response without modification.
     * @see ContentHandlingStrategy
     */

    public String getContentHandlingStrategy() {
        return this.contentHandlingStrategy;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *        Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public Integration withContentHandlingStrategy(String contentHandlingStrategy) {
        setContentHandlingStrategy(contentHandlingStrategy);
        return this;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported
     * values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions.
     *        Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public Integration withContentHandlingStrategy(ContentHandlingStrategy contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentialsArn
     *        Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *        available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     *        require that the caller's identity be passed through from the request, specify the string
     *        arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS services, specify null.
     */

    public void setCredentialsArn(String credentialsArn) {
        this.credentialsArn = credentialsArn;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @return Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *         available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     *         To require that the caller's identity be passed through from the request, specify the string
     *         arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS services, specify null.
     */

    public String getCredentialsArn() {
        return this.credentialsArn;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentialsArn
     *        Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *        available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     *        require that the caller's identity be passed through from the request, specify the string
     *        arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS services, specify null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withCredentialsArn(String credentialsArn) {
        setCredentialsArn(credentialsArn);
        return this;
    }

    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     * 
     * @param description
     *        Represents the description of an integration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     * 
     * @return Represents the description of an integration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     * 
     * @param description
     *        Represents the description of an integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     * 
     * @param integrationId
     *        Represents the identifier of an integration.
     */

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     * 
     * @return Represents the identifier of an integration.
     */

    public String getIntegrationId() {
        return this.integrationId;
    }

    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     * 
     * @param integrationId
     *        Represents the identifier of an integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withIntegrationId(String integrationId) {
        setIntegrationId(integrationId);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @param integrationMethod
     *        Specifies the integration's HTTP method type.
     */

    public void setIntegrationMethod(String integrationMethod) {
        this.integrationMethod = integrationMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @return Specifies the integration's HTTP method type.
     */

    public String getIntegrationMethod() {
        return this.integrationMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @param integrationMethod
     *        Specifies the integration's HTTP method type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withIntegrationMethod(String integrationMethod) {
        setIntegrationMethod(integrationMethod);
        return this;
    }

    /**
     * <p>
     * The integration response selection expression for the integration. Supported only for WebSocket APIs. See <a
     * href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     * 
     * @param integrationResponseSelectionExpression
     *        The integration response selection expression for the integration. Supported only for WebSocket APIs. See
     *        <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     *        >Integration Response Selection Expressions</a>.
     */

    public void setIntegrationResponseSelectionExpression(String integrationResponseSelectionExpression) {
        this.integrationResponseSelectionExpression = integrationResponseSelectionExpression;
    }

    /**
     * <p>
     * The integration response selection expression for the integration. Supported only for WebSocket APIs. See <a
     * href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     * 
     * @return The integration response selection expression for the integration. Supported only for WebSocket APIs. See
     *         <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     *         >Integration Response Selection Expressions</a>.
     */

    public String getIntegrationResponseSelectionExpression() {
        return this.integrationResponseSelectionExpression;
    }

    /**
     * <p>
     * The integration response selection expression for the integration. Supported only for WebSocket APIs. See <a
     * href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     * 
     * @param integrationResponseSelectionExpression
     *        The integration response selection expression for the integration. Supported only for WebSocket APIs. See
     *        <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     *        >Integration Response Selection Expressions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withIntegrationResponseSelectionExpression(String integrationResponseSelectionExpression) {
        setIntegrationResponseSelectionExpression(integrationResponseSelectionExpression);
        return this;
    }

    /**
     * <p>
     * Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn more,
     * see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html"
     * >Integration subtype reference</a>.
     * </p>
     * 
     * @param integrationSubtype
     *        Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn
     *        more, see <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html"
     *        >Integration subtype reference</a>.
     */

    public void setIntegrationSubtype(String integrationSubtype) {
        this.integrationSubtype = integrationSubtype;
    }

    /**
     * <p>
     * Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn more,
     * see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html"
     * >Integration subtype reference</a>.
     * </p>
     * 
     * @return Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn
     *         more, see <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html"
     *         >Integration subtype reference</a>.
     */

    public String getIntegrationSubtype() {
        return this.integrationSubtype;
    }

    /**
     * <p>
     * Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn more,
     * see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html"
     * >Integration subtype reference</a>.
     * </p>
     * 
     * @param integrationSubtype
     *        Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn
     *        more, see <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html"
     *        >Integration subtype reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withIntegrationSubtype(String integrationSubtype) {
        setIntegrationSubtype(integrationSubtype);
        return this;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket
     * APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action. This
     * integration is also referred to as a Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * the HTTP custom integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed
     * through as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param integrationType
     *        The integration type of an integration. One of the following:</p>
     *        <p>
     *        AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *        function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *        custom integration. With any other AWS service action, this is known as AWS integration. Supported only
     *        for WebSocket APIs.
     *        </p>
     *        <p>
     *        AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action.
     *        This integration is also referred to as a Lambda proxy integration.
     *        </p>
     *        <p>
     *        HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred
     *        to as the HTTP custom integration. Supported only for WebSocket APIs.
     *        </p>
     *        <p>
     *        HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request
     *        passed through as-is. This is also referred to as HTTP proxy integration.
     *        </p>
     *        <p>
     *        MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *        invoking any backend. Supported only for WebSocket APIs.
     * @see IntegrationType
     */

    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket
     * APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action. This
     * integration is also referred to as a Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * the HTTP custom integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed
     * through as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return The integration type of an integration. One of the following:</p>
     *         <p>
     *         AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *         function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *         custom integration. With any other AWS service action, this is known as AWS integration. Supported only
     *         for WebSocket APIs.
     *         </p>
     *         <p>
     *         AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service
     *         action. This integration is also referred to as a Lambda proxy integration.
     *         </p>
     *         <p>
     *         HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also
     *         referred to as the HTTP custom integration. Supported only for WebSocket APIs.
     *         </p>
     *         <p>
     *         HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request
     *         passed through as-is. This is also referred to as HTTP proxy integration.
     *         </p>
     *         <p>
     *         MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *         invoking any backend. Supported only for WebSocket APIs.
     * @see IntegrationType
     */

    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket
     * APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action. This
     * integration is also referred to as a Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * the HTTP custom integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed
     * through as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param integrationType
     *        The integration type of an integration. One of the following:</p>
     *        <p>
     *        AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *        function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *        custom integration. With any other AWS service action, this is known as AWS integration. Supported only
     *        for WebSocket APIs.
     *        </p>
     *        <p>
     *        AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action.
     *        This integration is also referred to as a Lambda proxy integration.
     *        </p>
     *        <p>
     *        HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred
     *        to as the HTTP custom integration. Supported only for WebSocket APIs.
     *        </p>
     *        <p>
     *        HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request
     *        passed through as-is. This is also referred to as HTTP proxy integration.
     *        </p>
     *        <p>
     *        MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *        invoking any backend. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public Integration withIntegrationType(String integrationType) {
        setIntegrationType(integrationType);
        return this;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket
     * APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action. This
     * integration is also referred to as a Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * the HTTP custom integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed
     * through as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param integrationType
     *        The integration type of an integration. One of the following:</p>
     *        <p>
     *        AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *        function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *        custom integration. With any other AWS service action, this is known as AWS integration. Supported only
     *        for WebSocket APIs.
     *        </p>
     *        <p>
     *        AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action.
     *        This integration is also referred to as a Lambda proxy integration.
     *        </p>
     *        <p>
     *        HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred
     *        to as the HTTP custom integration. Supported only for WebSocket APIs.
     *        </p>
     *        <p>
     *        HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request
     *        passed through as-is. This is also referred to as HTTP proxy integration.
     *        </p>
     *        <p>
     *        MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *        invoking any backend. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public Integration withIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
        return this;
    }

    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load
     * Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API Gateway uses
     * DiscoverInstances to identify resources. You can use query parameters to target specific resources. To learn
     * more, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html">DiscoverInstances</a>. For
     * private integrations, all resources must be owned by the same AWS account.
     * </p>
     * 
     * @param integrationUri
     *        For a Lambda integration, specify the URI of a Lambda function.</p>
     *        <p>
     *        For an HTTP integration, specify a fully-qualified URL.
     *        </p>
     *        <p>
     *        For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network
     *        Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API
     *        Gateway uses DiscoverInstances to identify resources. You can use query parameters to target specific
     *        resources. To learn more, see <a
     *        href="https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html">DiscoverInstances</a>.
     *        For private integrations, all resources must be owned by the same AWS account.
     */

    public void setIntegrationUri(String integrationUri) {
        this.integrationUri = integrationUri;
    }

    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load
     * Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API Gateway uses
     * DiscoverInstances to identify resources. You can use query parameters to target specific resources. To learn
     * more, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html">DiscoverInstances</a>. For
     * private integrations, all resources must be owned by the same AWS account.
     * </p>
     * 
     * @return For a Lambda integration, specify the URI of a Lambda function.</p>
     *         <p>
     *         For an HTTP integration, specify a fully-qualified URL.
     *         </p>
     *         <p>
     *         For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network
     *         Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API
     *         Gateway uses DiscoverInstances to identify resources. You can use query parameters to target specific
     *         resources. To learn more, see <a
     *         href="https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html">DiscoverInstances</a>.
     *         For private integrations, all resources must be owned by the same AWS account.
     */

    public String getIntegrationUri() {
        return this.integrationUri;
    }

    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load
     * Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API Gateway uses
     * DiscoverInstances to identify resources. You can use query parameters to target specific resources. To learn
     * more, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html">DiscoverInstances</a>. For
     * private integrations, all resources must be owned by the same AWS account.
     * </p>
     * 
     * @param integrationUri
     *        For a Lambda integration, specify the URI of a Lambda function.</p>
     *        <p>
     *        For an HTTP integration, specify a fully-qualified URL.
     *        </p>
     *        <p>
     *        For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network
     *        Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API
     *        Gateway uses DiscoverInstances to identify resources. You can use query parameters to target specific
     *        resources. To learn more, see <a
     *        href="https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html">DiscoverInstances</a>.
     *        For private integrations, all resources must be owned by the same AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withIntegrationUri(String integrationUri) {
        setIntegrationUri(integrationUri);
        return this;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the requestTemplates property on the Integration
     *        resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for
     *        WebSocket APIs.</p>
     *        <p>
     *        WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *        without transformation.
     *        </p>
     *        <p>
     *        NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *        </p>
     *        <p>
     *        WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *        However, if there is at least one content type defined, unmapped content types will be rejected with the
     *        same HTTP 415 Unsupported Media Type response.
     * @see PassthroughBehavior
     */

    public void setPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @return Specifies the pass-through behavior for incoming requests based on the Content-Type header in the
     *         request, and the available mapping templates specified as the requestTemplates property on the
     *         Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     *         Supported only for WebSocket APIs.</p>
     *         <p>
     *         WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *         without transformation.
     *         </p>
     *         <p>
     *         NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *         </p>
     *         <p>
     *         WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *         However, if there is at least one content type defined, unmapped content types will be rejected with the
     *         same HTTP 415 Unsupported Media Type response.
     * @see PassthroughBehavior
     */

    public String getPassthroughBehavior() {
        return this.passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the requestTemplates property on the Integration
     *        resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for
     *        WebSocket APIs.</p>
     *        <p>
     *        WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *        without transformation.
     *        </p>
     *        <p>
     *        NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *        </p>
     *        <p>
     *        WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *        However, if there is at least one content type defined, unmapped content types will be rejected with the
     *        same HTTP 415 Unsupported Media Type response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PassthroughBehavior
     */

    public Integration withPassthroughBehavior(String passthroughBehavior) {
        setPassthroughBehavior(passthroughBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the requestTemplates property on the Integration
     *        resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for
     *        WebSocket APIs.</p>
     *        <p>
     *        WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *        without transformation.
     *        </p>
     *        <p>
     *        NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *        </p>
     *        <p>
     *        WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *        However, if there is at least one content type defined, unmapped content types will be rejected with the
     *        same HTTP 415 Unsupported Media Type response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PassthroughBehavior
     */

    public Integration withPassthroughBehavior(PassthroughBehavior passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for HTTP APIs.
     * </p>
     * 
     * @param payloadFormatVersion
     *        Specifies the format of the payload sent to an integration. Required for HTTP APIs.
     */

    public void setPayloadFormatVersion(String payloadFormatVersion) {
        this.payloadFormatVersion = payloadFormatVersion;
    }

    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for HTTP APIs.
     * </p>
     * 
     * @return Specifies the format of the payload sent to an integration. Required for HTTP APIs.
     */

    public String getPayloadFormatVersion() {
        return this.payloadFormatVersion;
    }

    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for HTTP APIs.
     * </p>
     * 
     * @param payloadFormatVersion
     *        Specifies the format of the payload sent to an integration. Required for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withPayloadFormatVersion(String payloadFormatVersion) {
        setPayloadFormatVersion(payloadFormatVersion);
        return this;
    }

    /**
     * <p>
     * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the
     * backend. The key is an integration request parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The
     * method request parameter value must match the pattern of
     * method.request.<replaceable>{location}</replaceable>.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header; and <replaceable>{name}</replaceable> must
     * be a valid and unique method request parameter name.
     * </p>
     * <p>
     * For HTTP API integrations with a specified integrationSubtype, request parameters are a key-value map specifying
     * parameters that are passed to AWS_PROXY integrations. You can provide static values, or map request data, stage
     * variables, or context variables that are evaluated at runtime. To learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html"
     * >Working with AWS service integrations for HTTP APIs</a>.
     * </p>
     * <p>
     * For HTTP API itegrations, without a specified integrationSubtype request parameters are a key-value map
     * specifying how to transform HTTP requests before sending them to backend integrations. The key should follow the
     * pattern &lt;action&gt;:&lt;header|querystring|path&gt;.&lt;location&gt;. The action can be append, overwrite or
     * remove. For values, you can provide static values, or map request data, stage variables, or context variables
     * that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     * 
     * @return For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request
     *         to the backend. The key is an integration request parameter name and the associated value is a method
     *         request parameter value or static value that must be enclosed within single quotes and pre-encoded as
     *         required by the backend. The method request parameter value must match the pattern of
     *         method.request.<replaceable>{location}</replaceable>.<replaceable>{name}</replaceable> , where
     *         <replaceable>{location}</replaceable> is querystring, path, or header; and
     *         <replaceable>{name}</replaceable> must be a valid and unique method request parameter name.</p>
     *         <p>
     *         For HTTP API integrations with a specified integrationSubtype, request parameters are a key-value map
     *         specifying parameters that are passed to AWS_PROXY integrations. You can provide static values, or map
     *         request data, stage variables, or context variables that are evaluated at runtime. To learn more, see <a
     *         href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html"
     *         >Working with AWS service integrations for HTTP APIs</a>.
     *         </p>
     *         <p>
     *         For HTTP API itegrations, without a specified integrationSubtype request parameters are a key-value map
     *         specifying how to transform HTTP requests before sending them to backend integrations. The key should
     *         follow the pattern &lt;action&gt;:&lt;header|querystring|path&gt;.&lt;location&gt;. The action can be
     *         append, overwrite or remove. For values, you can provide static values, or map request data, stage
     *         variables, or context variables that are evaluated at runtime. To learn more, see <a
     *         href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html"
     *         >Transforming API requests and responses</a>.
     */

    public java.util.Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the
     * backend. The key is an integration request parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The
     * method request parameter value must match the pattern of
     * method.request.<replaceable>{location}</replaceable>.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header; and <replaceable>{name}</replaceable> must
     * be a valid and unique method request parameter name.
     * </p>
     * <p>
     * For HTTP API integrations with a specified integrationSubtype, request parameters are a key-value map specifying
     * parameters that are passed to AWS_PROXY integrations. You can provide static values, or map request data, stage
     * variables, or context variables that are evaluated at runtime. To learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html"
     * >Working with AWS service integrations for HTTP APIs</a>.
     * </p>
     * <p>
     * For HTTP API itegrations, without a specified integrationSubtype request parameters are a key-value map
     * specifying how to transform HTTP requests before sending them to backend integrations. The key should follow the
     * pattern &lt;action&gt;:&lt;header|querystring|path&gt;.&lt;location&gt;. The action can be append, overwrite or
     * remove. For values, you can provide static values, or map request data, stage variables, or context variables
     * that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     * 
     * @param requestParameters
     *        For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request
     *        to the backend. The key is an integration request parameter name and the associated value is a method
     *        request parameter value or static value that must be enclosed within single quotes and pre-encoded as
     *        required by the backend. The method request parameter value must match the pattern of
     *        method.request.<replaceable>{location}</replaceable>.<replaceable>{name}</replaceable> , where
     *        <replaceable>{location}</replaceable> is querystring, path, or header; and
     *        <replaceable>{name}</replaceable> must be a valid and unique method request parameter name.</p>
     *        <p>
     *        For HTTP API integrations with a specified integrationSubtype, request parameters are a key-value map
     *        specifying parameters that are passed to AWS_PROXY integrations. You can provide static values, or map
     *        request data, stage variables, or context variables that are evaluated at runtime. To learn more, see <a
     *        href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html"
     *        >Working with AWS service integrations for HTTP APIs</a>.
     *        </p>
     *        <p>
     *        For HTTP API itegrations, without a specified integrationSubtype request parameters are a key-value map
     *        specifying how to transform HTTP requests before sending them to backend integrations. The key should
     *        follow the pattern &lt;action&gt;:&lt;header|querystring|path&gt;.&lt;location&gt;. The action can be
     *        append, overwrite or remove. For values, you can provide static values, or map request data, stage
     *        variables, or context variables that are evaluated at runtime. To learn more, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html"
     *        >Transforming API requests and responses</a>.
     */

    public void setRequestParameters(java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the
     * backend. The key is an integration request parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The
     * method request parameter value must match the pattern of
     * method.request.<replaceable>{location}</replaceable>.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header; and <replaceable>{name}</replaceable> must
     * be a valid and unique method request parameter name.
     * </p>
     * <p>
     * For HTTP API integrations with a specified integrationSubtype, request parameters are a key-value map specifying
     * parameters that are passed to AWS_PROXY integrations. You can provide static values, or map request data, stage
     * variables, or context variables that are evaluated at runtime. To learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html"
     * >Working with AWS service integrations for HTTP APIs</a>.
     * </p>
     * <p>
     * For HTTP API itegrations, without a specified integrationSubtype request parameters are a key-value map
     * specifying how to transform HTTP requests before sending them to backend integrations. The key should follow the
     * pattern &lt;action&gt;:&lt;header|querystring|path&gt;.&lt;location&gt;. The action can be append, overwrite or
     * remove. For values, you can provide static values, or map request data, stage variables, or context variables
     * that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     * 
     * @param requestParameters
     *        For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request
     *        to the backend. The key is an integration request parameter name and the associated value is a method
     *        request parameter value or static value that must be enclosed within single quotes and pre-encoded as
     *        required by the backend. The method request parameter value must match the pattern of
     *        method.request.<replaceable>{location}</replaceable>.<replaceable>{name}</replaceable> , where
     *        <replaceable>{location}</replaceable> is querystring, path, or header; and
     *        <replaceable>{name}</replaceable> must be a valid and unique method request parameter name.</p>
     *        <p>
     *        For HTTP API integrations with a specified integrationSubtype, request parameters are a key-value map
     *        specifying parameters that are passed to AWS_PROXY integrations. You can provide static values, or map
     *        request data, stage variables, or context variables that are evaluated at runtime. To learn more, see <a
     *        href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services.html"
     *        >Working with AWS service integrations for HTTP APIs</a>.
     *        </p>
     *        <p>
     *        For HTTP API itegrations, without a specified integrationSubtype request parameters are a key-value map
     *        specifying how to transform HTTP requests before sending them to backend integrations. The key should
     *        follow the pattern &lt;action&gt;:&lt;header|querystring|path&gt;.&lt;location&gt;. The action can be
     *        append, overwrite or remove. For values, you can provide static values, or map request data, stage
     *        variables, or context variables that are evaluated at runtime. To learn more, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html"
     *        >Transforming API requests and responses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withRequestParameters(java.util.Map<String, String> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    /**
     * Add a single RequestParameters entry
     *
     * @see Integration#withRequestParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Integration addRequestParametersEntry(String key, String value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, String>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return Represents a map of Velocity templates that are applied on the request payload based on the value of the
     *         Content-Type header sent by the client. The content type value is the key in this map, and the template
     *         (as a String) is the value. Supported only for WebSocket APIs.
     */

    public java.util.Map<String, String> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param requestTemplates
     *        Represents a map of Velocity templates that are applied on the request payload based on the value of the
     *        Content-Type header sent by the client. The content type value is the key in this map, and the template
     *        (as a String) is the value. Supported only for WebSocket APIs.
     */

    public void setRequestTemplates(java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param requestTemplates
     *        Represents a map of Velocity templates that are applied on the request payload based on the value of the
     *        Content-Type header sent by the client. The content type value is the key in this map, and the template
     *        (as a String) is the value. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withRequestTemplates(java.util.Map<String, String> requestTemplates) {
        setRequestTemplates(requestTemplates);
        return this;
    }

    /**
     * Add a single RequestTemplates entry
     *
     * @see Integration#withRequestTemplates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Integration addRequestTemplatesEntry(String key, String value) {
        if (null == this.requestTemplates) {
            this.requestTemplates = new java.util.HashMap<String, String>();
        }
        if (this.requestTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestTemplates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration clearRequestTemplatesEntries() {
        this.requestTemplates = null;
        return this;
    }

    /**
     * <p>
     * Supported only for HTTP APIs. You use response parameters to transform the HTTP response from a backend
     * integration before returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599. Response parameters
     * are a key-value map. The key must match pattern &lt;action&gt;:&lt;header&gt;.&lt;location&gt; or
     * overwrite.statuscode. The action can be append, overwrite or remove. The value can be a static value, or map to
     * response data, stage variables, or context variables that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     * 
     * @return Supported only for HTTP APIs. You use response parameters to transform the HTTP response from a backend
     *         integration before returning the response to clients. Specify a key-value map from a selection key to
     *         response parameters. The selection key must be a valid HTTP status code within the range of 200-599.
     *         Response parameters are a key-value map. The key must match pattern
     *         &lt;action&gt;:&lt;header&gt;.&lt;location&gt; or overwrite.statuscode. The action can be append,
     *         overwrite or remove. The value can be a static value, or map to response data, stage variables, or
     *         context variables that are evaluated at runtime. To learn more, see <a
     *         href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html"
     *         >Transforming API requests and responses</a>.
     */

    public java.util.Map<String, java.util.Map<String, String>> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * Supported only for HTTP APIs. You use response parameters to transform the HTTP response from a backend
     * integration before returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599. Response parameters
     * are a key-value map. The key must match pattern &lt;action&gt;:&lt;header&gt;.&lt;location&gt; or
     * overwrite.statuscode. The action can be append, overwrite or remove. The value can be a static value, or map to
     * response data, stage variables, or context variables that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     * 
     * @param responseParameters
     *        Supported only for HTTP APIs. You use response parameters to transform the HTTP response from a backend
     *        integration before returning the response to clients. Specify a key-value map from a selection key to
     *        response parameters. The selection key must be a valid HTTP status code within the range of 200-599.
     *        Response parameters are a key-value map. The key must match pattern
     *        &lt;action&gt;:&lt;header&gt;.&lt;location&gt; or overwrite.statuscode. The action can be append,
     *        overwrite or remove. The value can be a static value, or map to response data, stage variables, or context
     *        variables that are evaluated at runtime. To learn more, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html"
     *        >Transforming API requests and responses</a>.
     */

    public void setResponseParameters(java.util.Map<String, java.util.Map<String, String>> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * Supported only for HTTP APIs. You use response parameters to transform the HTTP response from a backend
     * integration before returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599. Response parameters
     * are a key-value map. The key must match pattern &lt;action&gt;:&lt;header&gt;.&lt;location&gt; or
     * overwrite.statuscode. The action can be append, overwrite or remove. The value can be a static value, or map to
     * response data, stage variables, or context variables that are evaluated at runtime. To learn more, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html">Transforming
     * API requests and responses</a>.
     * </p>
     * 
     * @param responseParameters
     *        Supported only for HTTP APIs. You use response parameters to transform the HTTP response from a backend
     *        integration before returning the response to clients. Specify a key-value map from a selection key to
     *        response parameters. The selection key must be a valid HTTP status code within the range of 200-599.
     *        Response parameters are a key-value map. The key must match pattern
     *        &lt;action&gt;:&lt;header&gt;.&lt;location&gt; or overwrite.statuscode. The action can be append,
     *        overwrite or remove. The value can be a static value, or map to response data, stage variables, or context
     *        variables that are evaluated at runtime. To learn more, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html"
     *        >Transforming API requests and responses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withResponseParameters(java.util.Map<String, java.util.Map<String, String>> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    /**
     * Add a single ResponseParameters entry
     *
     * @see Integration#withResponseParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Integration addResponseParametersEntry(String key, java.util.Map<String, String> value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * The template selection expression for the integration. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param templateSelectionExpression
     *        The template selection expression for the integration. Supported only for WebSocket APIs.
     */

    public void setTemplateSelectionExpression(String templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return The template selection expression for the integration. Supported only for WebSocket APIs.
     */

    public String getTemplateSelectionExpression() {
        return this.templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param templateSelectionExpression
     *        The template selection expression for the integration. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withTemplateSelectionExpression(String templateSelectionExpression) {
        setTemplateSelectionExpression(templateSelectionExpression);
        return this;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for
     * HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     * 
     * @param timeoutInMillis
     *        Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000
     *        milliseconds for HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP
     *        APIs.
     */

    public void setTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for
     * HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     * 
     * @return Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000
     *         milliseconds for HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP
     *         APIs.
     */

    public Integer getTimeoutInMillis() {
        return this.timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for
     * HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     * 
     * @param timeoutInMillis
     *        Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000
     *        milliseconds for HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP
     *        APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withTimeoutInMillis(Integer timeoutInMillis) {
        setTimeoutInMillis(timeoutInMillis);
        return this;
    }

    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic
     * uses the HTTPS protocol. Supported only for HTTP APIs.
     * </p>
     * 
     * @param tlsConfig
     *        The TLS configuration for a private integration. If you specify a TLS configuration, private integration
     *        traffic uses the HTTPS protocol. Supported only for HTTP APIs.
     */

    public void setTlsConfig(TlsConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
    }

    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic
     * uses the HTTPS protocol. Supported only for HTTP APIs.
     * </p>
     * 
     * @return The TLS configuration for a private integration. If you specify a TLS configuration, private integration
     *         traffic uses the HTTPS protocol. Supported only for HTTP APIs.
     */

    public TlsConfig getTlsConfig() {
        return this.tlsConfig;
    }

    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic
     * uses the HTTPS protocol. Supported only for HTTP APIs.
     * </p>
     * 
     * @param tlsConfig
     *        The TLS configuration for a private integration. If you specify a TLS configuration, private integration
     *        traffic uses the HTTPS protocol. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withTlsConfig(TlsConfig tlsConfig) {
        setTlsConfig(tlsConfig);
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
        if (getApiGatewayManaged() != null)
            sb.append("ApiGatewayManaged: ").append(getApiGatewayManaged()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getContentHandlingStrategy() != null)
            sb.append("ContentHandlingStrategy: ").append(getContentHandlingStrategy()).append(",");
        if (getCredentialsArn() != null)
            sb.append("CredentialsArn: ").append(getCredentialsArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIntegrationId() != null)
            sb.append("IntegrationId: ").append(getIntegrationId()).append(",");
        if (getIntegrationMethod() != null)
            sb.append("IntegrationMethod: ").append(getIntegrationMethod()).append(",");
        if (getIntegrationResponseSelectionExpression() != null)
            sb.append("IntegrationResponseSelectionExpression: ").append(getIntegrationResponseSelectionExpression()).append(",");
        if (getIntegrationSubtype() != null)
            sb.append("IntegrationSubtype: ").append(getIntegrationSubtype()).append(",");
        if (getIntegrationType() != null)
            sb.append("IntegrationType: ").append(getIntegrationType()).append(",");
        if (getIntegrationUri() != null)
            sb.append("IntegrationUri: ").append(getIntegrationUri()).append(",");
        if (getPassthroughBehavior() != null)
            sb.append("PassthroughBehavior: ").append(getPassthroughBehavior()).append(",");
        if (getPayloadFormatVersion() != null)
            sb.append("PayloadFormatVersion: ").append(getPayloadFormatVersion()).append(",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: ").append(getRequestParameters()).append(",");
        if (getRequestTemplates() != null)
            sb.append("RequestTemplates: ").append(getRequestTemplates()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getTemplateSelectionExpression() != null)
            sb.append("TemplateSelectionExpression: ").append(getTemplateSelectionExpression()).append(",");
        if (getTimeoutInMillis() != null)
            sb.append("TimeoutInMillis: ").append(getTimeoutInMillis()).append(",");
        if (getTlsConfig() != null)
            sb.append("TlsConfig: ").append(getTlsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Integration == false)
            return false;
        Integration other = (Integration) obj;
        if (other.getApiGatewayManaged() == null ^ this.getApiGatewayManaged() == null)
            return false;
        if (other.getApiGatewayManaged() != null && other.getApiGatewayManaged().equals(this.getApiGatewayManaged()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getContentHandlingStrategy() == null ^ this.getContentHandlingStrategy() == null)
            return false;
        if (other.getContentHandlingStrategy() != null && other.getContentHandlingStrategy().equals(this.getContentHandlingStrategy()) == false)
            return false;
        if (other.getCredentialsArn() == null ^ this.getCredentialsArn() == null)
            return false;
        if (other.getCredentialsArn() != null && other.getCredentialsArn().equals(this.getCredentialsArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntegrationId() == null ^ this.getIntegrationId() == null)
            return false;
        if (other.getIntegrationId() != null && other.getIntegrationId().equals(this.getIntegrationId()) == false)
            return false;
        if (other.getIntegrationMethod() == null ^ this.getIntegrationMethod() == null)
            return false;
        if (other.getIntegrationMethod() != null && other.getIntegrationMethod().equals(this.getIntegrationMethod()) == false)
            return false;
        if (other.getIntegrationResponseSelectionExpression() == null ^ this.getIntegrationResponseSelectionExpression() == null)
            return false;
        if (other.getIntegrationResponseSelectionExpression() != null
                && other.getIntegrationResponseSelectionExpression().equals(this.getIntegrationResponseSelectionExpression()) == false)
            return false;
        if (other.getIntegrationSubtype() == null ^ this.getIntegrationSubtype() == null)
            return false;
        if (other.getIntegrationSubtype() != null && other.getIntegrationSubtype().equals(this.getIntegrationSubtype()) == false)
            return false;
        if (other.getIntegrationType() == null ^ this.getIntegrationType() == null)
            return false;
        if (other.getIntegrationType() != null && other.getIntegrationType().equals(this.getIntegrationType()) == false)
            return false;
        if (other.getIntegrationUri() == null ^ this.getIntegrationUri() == null)
            return false;
        if (other.getIntegrationUri() != null && other.getIntegrationUri().equals(this.getIntegrationUri()) == false)
            return false;
        if (other.getPassthroughBehavior() == null ^ this.getPassthroughBehavior() == null)
            return false;
        if (other.getPassthroughBehavior() != null && other.getPassthroughBehavior().equals(this.getPassthroughBehavior()) == false)
            return false;
        if (other.getPayloadFormatVersion() == null ^ this.getPayloadFormatVersion() == null)
            return false;
        if (other.getPayloadFormatVersion() != null && other.getPayloadFormatVersion().equals(this.getPayloadFormatVersion()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestTemplates() == null ^ this.getRequestTemplates() == null)
            return false;
        if (other.getRequestTemplates() != null && other.getRequestTemplates().equals(this.getRequestTemplates()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getTemplateSelectionExpression() == null ^ this.getTemplateSelectionExpression() == null)
            return false;
        if (other.getTemplateSelectionExpression() != null && other.getTemplateSelectionExpression().equals(this.getTemplateSelectionExpression()) == false)
            return false;
        if (other.getTimeoutInMillis() == null ^ this.getTimeoutInMillis() == null)
            return false;
        if (other.getTimeoutInMillis() != null && other.getTimeoutInMillis().equals(this.getTimeoutInMillis()) == false)
            return false;
        if (other.getTlsConfig() == null ^ this.getTlsConfig() == null)
            return false;
        if (other.getTlsConfig() != null && other.getTlsConfig().equals(this.getTlsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiGatewayManaged() == null) ? 0 : getApiGatewayManaged().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getContentHandlingStrategy() == null) ? 0 : getContentHandlingStrategy().hashCode());
        hashCode = prime * hashCode + ((getCredentialsArn() == null) ? 0 : getCredentialsArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIntegrationId() == null) ? 0 : getIntegrationId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationMethod() == null) ? 0 : getIntegrationMethod().hashCode());
        hashCode = prime * hashCode + ((getIntegrationResponseSelectionExpression() == null) ? 0 : getIntegrationResponseSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getIntegrationSubtype() == null) ? 0 : getIntegrationSubtype().hashCode());
        hashCode = prime * hashCode + ((getIntegrationType() == null) ? 0 : getIntegrationType().hashCode());
        hashCode = prime * hashCode + ((getIntegrationUri() == null) ? 0 : getIntegrationUri().hashCode());
        hashCode = prime * hashCode + ((getPassthroughBehavior() == null) ? 0 : getPassthroughBehavior().hashCode());
        hashCode = prime * hashCode + ((getPayloadFormatVersion() == null) ? 0 : getPayloadFormatVersion().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getTemplateSelectionExpression() == null) ? 0 : getTemplateSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMillis() == null) ? 0 : getTimeoutInMillis().hashCode());
        hashCode = prime * hashCode + ((getTlsConfig() == null) ? 0 : getTlsConfig().hashCode());
        return hashCode;
    }

    @Override
    public Integration clone() {
        try {
            return (Integration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.IntegrationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
