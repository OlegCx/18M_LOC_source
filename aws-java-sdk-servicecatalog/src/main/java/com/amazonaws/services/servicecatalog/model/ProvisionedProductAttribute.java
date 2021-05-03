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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a provisioned product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisionedProductAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedProductAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product.
     * </p>
     */
    private String lastRecordId;
    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     */
    private String lastProvisioningRecordId;
    /**
     * <p>
     * The record identifier of the last successful request performed on this provisioned product of the following
     * types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     */
    private String lastSuccessfulProvisioningRecordId;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
     * </p>
     */
    private String physicalId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The name of the product.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The ARN of the IAM user in the session. This ARN might contain a session ID.
     * </p>
     */
    private String userArnSession;

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param name
     *        The user-friendly name of the provisioned product.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @return The user-friendly name of the provisioned product.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param name
     *        The user-friendly name of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     * 
     * @param arn
     *        The ARN of the provisioned product.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     * 
     * @return The ARN of the provisioned product.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     * 
     * @param arn
     *        The ARN of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * 
     * @param type
     *        The type of provisioned product. The supported values are <code>CFN_STACK</code> and
     *        <code>CFN_STACKSET</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * 
     * @return The type of provisioned product. The supported values are <code>CFN_STACK</code> and
     *         <code>CFN_STACKSET</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * 
     * @param type
     *        The type of provisioned product. The supported values are <code>CFN_STACK</code> and
     *        <code>CFN_STACKSET</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @param id
     *        The identifier of the provisioned product.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @return The identifier of the provisioned product.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @param id
     *        The identifier of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the provisioned product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded
     *        and completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for
     *        an <code>AVAILABLE</code> status before performing operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     *        operation but is not exactly what was requested. For example, a request to update to a new version failed
     *        and the stack rolled back to the current version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not
     *        running. For example, CloudFormation received a parameter value that was not valid and could not launch
     *        the stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new
     *        product, but resources have not yet been created. After reviewing the list of resources to be created,
     *        execute the plan. Wait for an <code>AVAILABLE</code> status before performing operations.
     *        </p>
     *        </li>
     * @see ProvisionedProductStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the provisioned product.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation
     *         succeeded and completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for
     *         an <code>AVAILABLE</code> status before performing operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the
     *         requested operation but is not exactly what was requested. For example, a request to update to a new
     *         version failed and the stack rolled back to the current version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not
     *         running. For example, CloudFormation received a parameter value that was not valid and could not launch
     *         the stack.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new
     *         product, but resources have not yet been created. After reviewing the list of resources to be created,
     *         execute the plan. Wait for an <code>AVAILABLE</code> status before performing operations.
     *         </p>
     *         </li>
     * @see ProvisionedProductStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the provisioned product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded
     *        and completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for
     *        an <code>AVAILABLE</code> status before performing operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     *        operation but is not exactly what was requested. For example, a request to update to a new version failed
     *        and the stack rolled back to the current version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not
     *        running. For example, CloudFormation received a parameter value that was not valid and could not launch
     *        the stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new
     *        product, but resources have not yet been created. After reviewing the list of resources to be created,
     *        execute the plan. Wait for an <code>AVAILABLE</code> status before performing operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedProductStatus
     */

    public ProvisionedProductAttribute withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded and
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for an
     * <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     * operation but is not exactly what was requested. For example, a request to update to a new version failed and the
     * stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not running.
     * For example, CloudFormation received a parameter value that was not valid and could not launch the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new product,
     * but resources have not yet been created. After reviewing the list of resources to be created, execute the plan.
     * Wait for an <code>AVAILABLE</code> status before performing operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the provisioned product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - Stable state, ready to perform any operation. The most recent operation succeeded
     *        and completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code> - Transitive state. Operations performed might not have valid results. Wait for
     *        an <code>AVAILABLE</code> status before performing operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TAINTED</code> - Stable state, ready to perform any operation. The stack has completed the requested
     *        operation but is not exactly what was requested. For example, a request to update to a new version failed
     *        and the stack rolled back to the current version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An unexpected error occurred. The provisioned product exists but the stack is not
     *        running. For example, CloudFormation received a parameter value that was not valid and could not launch
     *        the stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations were performed to provision a new
     *        product, but resources have not yet been created. After reviewing the list of resources to be created,
     *        execute the plan. Wait for an <code>AVAILABLE</code> status before performing operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedProductStatus
     */

    public ProvisionedProductAttribute withStatus(ProvisionedProductStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     * 
     * @param statusMessage
     *        The current status message of the provisioned product.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     * 
     * @return The current status message of the provisioned product.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     * 
     * @param statusMessage
     *        The current status message of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @return The UTC time stamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @return A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *         idempotency token, the same response is returned for each repeated request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product.
     * </p>
     * 
     * @param lastRecordId
     *        The record identifier of the last request performed on this provisioned product.
     */

    public void setLastRecordId(String lastRecordId) {
        this.lastRecordId = lastRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product.
     * </p>
     * 
     * @return The record identifier of the last request performed on this provisioned product.
     */

    public String getLastRecordId() {
        return this.lastRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product.
     * </p>
     * 
     * @param lastRecordId
     *        The record identifier of the last request performed on this provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withLastRecordId(String lastRecordId) {
        setLastRecordId(lastRecordId);
        return this;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastProvisioningRecordId
     *        The record identifier of the last request performed on this provisioned product of the following
     *        types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UpdateProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ExecuteProvisionedProductPlan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TerminateProvisionedProduct
     *        </p>
     *        </li>
     */

    public void setLastProvisioningRecordId(String lastProvisioningRecordId) {
        this.lastProvisioningRecordId = lastProvisioningRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     * 
     * @return The record identifier of the last request performed on this provisioned product of the following
     *         types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ProvisionedProduct
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UpdateProvisionedProduct
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ExecuteProvisionedProductPlan
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TerminateProvisionedProduct
     *         </p>
     *         </li>
     */

    public String getLastProvisioningRecordId() {
        return this.lastProvisioningRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned product of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastProvisioningRecordId
     *        The record identifier of the last request performed on this provisioned product of the following
     *        types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UpdateProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ExecuteProvisionedProductPlan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TerminateProvisionedProduct
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withLastProvisioningRecordId(String lastProvisioningRecordId) {
        setLastProvisioningRecordId(lastProvisioningRecordId);
        return this;
    }

    /**
     * <p>
     * The record identifier of the last successful request performed on this provisioned product of the following
     * types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastSuccessfulProvisioningRecordId
     *        The record identifier of the last successful request performed on this provisioned product of the
     *        following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UpdateProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ExecuteProvisionedProductPlan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TerminateProvisionedProduct
     *        </p>
     *        </li>
     */

    public void setLastSuccessfulProvisioningRecordId(String lastSuccessfulProvisioningRecordId) {
        this.lastSuccessfulProvisioningRecordId = lastSuccessfulProvisioningRecordId;
    }

    /**
     * <p>
     * The record identifier of the last successful request performed on this provisioned product of the following
     * types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     * 
     * @return The record identifier of the last successful request performed on this provisioned product of the
     *         following types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ProvisionedProduct
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UpdateProvisionedProduct
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ExecuteProvisionedProductPlan
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TerminateProvisionedProduct
     *         </p>
     *         </li>
     */

    public String getLastSuccessfulProvisioningRecordId() {
        return this.lastSuccessfulProvisioningRecordId;
    }

    /**
     * <p>
     * The record identifier of the last successful request performed on this provisioned product of the following
     * types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * UpdateProvisionedProduct
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecuteProvisionedProductPlan
     * </p>
     * </li>
     * <li>
     * <p>
     * TerminateProvisionedProduct
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastSuccessfulProvisioningRecordId
     *        The record identifier of the last successful request performed on this provisioned product of the
     *        following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UpdateProvisionedProduct
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ExecuteProvisionedProductPlan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TerminateProvisionedProduct
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withLastSuccessfulProvisioningRecordId(String lastSuccessfulProvisioningRecordId) {
        setLastSuccessfulProvisioningRecordId(lastSuccessfulProvisioningRecordId);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
     * </p>
     * 
     * @param physicalId
     *        The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
     */

    public void setPhysicalId(String physicalId) {
        this.physicalId = physicalId;
    }

    /**
     * <p>
     * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
     * </p>
     * 
     * @return The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
     */

    public String getPhysicalId() {
        return this.physicalId;
    }

    /**
     * <p>
     * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
     * </p>
     * 
     * @param physicalId
     *        The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withPhysicalId(String physicalId) {
        setPhysicalId(physicalId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @param productName
     *        The name of the product.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @return The name of the product.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @param productName
     *        The name of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @return The identifier of the provisioning artifact.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The name of the provisioning artifact.
     */

    public void setProvisioningArtifactName(String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * 
     * @return The name of the provisioning artifact.
     */

    public String getProvisioningArtifactName() {
        return this.provisioningArtifactName;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The name of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withProvisioningArtifactName(String provisioningArtifactName) {
        setProvisioningArtifactName(provisioningArtifactName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the IAM user.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM user.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the IAM user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM user in the session. This ARN might contain a session ID.
     * </p>
     * 
     * @param userArnSession
     *        The ARN of the IAM user in the session. This ARN might contain a session ID.
     */

    public void setUserArnSession(String userArnSession) {
        this.userArnSession = userArnSession;
    }

    /**
     * <p>
     * The ARN of the IAM user in the session. This ARN might contain a session ID.
     * </p>
     * 
     * @return The ARN of the IAM user in the session. This ARN might contain a session ID.
     */

    public String getUserArnSession() {
        return this.userArnSession;
    }

    /**
     * <p>
     * The ARN of the IAM user in the session. This ARN might contain a session ID.
     * </p>
     * 
     * @param userArnSession
     *        The ARN of the IAM user in the session. This ARN might contain a session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductAttribute withUserArnSession(String userArnSession) {
        setUserArnSession(userArnSession);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getLastRecordId() != null)
            sb.append("LastRecordId: ").append(getLastRecordId()).append(",");
        if (getLastProvisioningRecordId() != null)
            sb.append("LastProvisioningRecordId: ").append(getLastProvisioningRecordId()).append(",");
        if (getLastSuccessfulProvisioningRecordId() != null)
            sb.append("LastSuccessfulProvisioningRecordId: ").append(getLastSuccessfulProvisioningRecordId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPhysicalId() != null)
            sb.append("PhysicalId: ").append(getPhysicalId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getProvisioningArtifactName() != null)
            sb.append("ProvisioningArtifactName: ").append(getProvisioningArtifactName()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getUserArnSession() != null)
            sb.append("UserArnSession: ").append(getUserArnSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedProductAttribute == false)
            return false;
        ProvisionedProductAttribute other = (ProvisionedProductAttribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getLastRecordId() == null ^ this.getLastRecordId() == null)
            return false;
        if (other.getLastRecordId() != null && other.getLastRecordId().equals(this.getLastRecordId()) == false)
            return false;
        if (other.getLastProvisioningRecordId() == null ^ this.getLastProvisioningRecordId() == null)
            return false;
        if (other.getLastProvisioningRecordId() != null && other.getLastProvisioningRecordId().equals(this.getLastProvisioningRecordId()) == false)
            return false;
        if (other.getLastSuccessfulProvisioningRecordId() == null ^ this.getLastSuccessfulProvisioningRecordId() == null)
            return false;
        if (other.getLastSuccessfulProvisioningRecordId() != null
                && other.getLastSuccessfulProvisioningRecordId().equals(this.getLastSuccessfulProvisioningRecordId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPhysicalId() == null ^ this.getPhysicalId() == null)
            return false;
        if (other.getPhysicalId() != null && other.getPhysicalId().equals(this.getPhysicalId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getProvisioningArtifactName() == null ^ this.getProvisioningArtifactName() == null)
            return false;
        if (other.getProvisioningArtifactName() != null && other.getProvisioningArtifactName().equals(this.getProvisioningArtifactName()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getUserArnSession() == null ^ this.getUserArnSession() == null)
            return false;
        if (other.getUserArnSession() != null && other.getUserArnSession().equals(this.getUserArnSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getLastRecordId() == null) ? 0 : getLastRecordId().hashCode());
        hashCode = prime * hashCode + ((getLastProvisioningRecordId() == null) ? 0 : getLastProvisioningRecordId().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulProvisioningRecordId() == null) ? 0 : getLastSuccessfulProvisioningRecordId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPhysicalId() == null) ? 0 : getPhysicalId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactName() == null) ? 0 : getProvisioningArtifactName().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getUserArnSession() == null) ? 0 : getUserArnSession().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedProductAttribute clone() {
        try {
            return (ProvisionedProductAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisionedProductAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
