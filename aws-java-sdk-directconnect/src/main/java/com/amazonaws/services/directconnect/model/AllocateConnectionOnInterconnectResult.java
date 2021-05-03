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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an AWS Direct Connect connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateConnectionOnInterconnect"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateConnectionOnInterconnectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The name of the connection.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The connection stays in the requested state
     * until the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the <code>rejected</code>
     * state if it is deleted by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     */
    private String connectionState;
    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The location of the connection.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     */
    private String bandwidth;
    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;
    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     */
    private String partnerName;
    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     */
    private java.util.Date loaIssueTime;
    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;
    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     */
    private String awsDevice;
    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     */
    private Boolean jumboFrameCapable;
    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     */
    private String awsDeviceV2;
    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     */
    private String hasLogicalRedundancy;
    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * Indicates whether the connection supports MAC Security (MACsec).
     * </p>
     */
    private Boolean macSecCapable;
    /**
     * <p>
     * The MAC Security (MACsec) port link status of the connection.
     * </p>
     * <p>
     * The valid values are <code>Encryption Up</code>, which means that there is an active Connection Key Name, or
     * <code>Encryption Down</code>.
     * </p>
     */
    private String portEncryptionStatus;
    /**
     * <p>
     * The MAC Security (MACsec) connection encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     */
    private String encryptionMode;
    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the connection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MacSecKey> macSecKeys;

    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the connection.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     * 
     * @return The ID of the AWS account that owns the connection.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the connection.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @return The ID of the connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @return The name of the connection.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The connection stays in the requested state
     * until the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the <code>rejected</code>
     * state if it is deleted by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionState
     *        The state of the connection. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The
     *        connection stays in the ordering state until the owner of the hosted connection confirms or declines the
     *        connection order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a standard connection. The connection stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The connection has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up and the connection is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The connection is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The connection has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the
     *        <code>rejected</code> state if it is deleted by the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the connection is not available.
     *        </p>
     *        </li>
     * @see ConnectionState
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The connection stays in the requested state
     * until the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the <code>rejected</code>
     * state if it is deleted by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the connection. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The
     *         connection stays in the ordering state until the owner of the hosted connection confirms or declines the
     *         connection order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requested</code>: The initial state of a standard connection. The connection stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The connection has been approved and is being initialized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The network link is up and the connection is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The network link is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The connection is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The connection has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the
     *         <code>rejected</code> state if it is deleted by the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the connection is not available.
     *         </p>
     *         </li>
     * @see ConnectionState
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The connection stays in the requested state
     * until the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the <code>rejected</code>
     * state if it is deleted by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionState
     *        The state of the connection. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The
     *        connection stays in the ordering state until the owner of the hosted connection confirms or declines the
     *        connection order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a standard connection. The connection stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The connection has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up and the connection is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The connection is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The connection has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the
     *        <code>rejected</code> state if it is deleted by the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the connection is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public AllocateConnectionOnInterconnectResult withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The connection stays in the requested state
     * until the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the <code>rejected</code>
     * state if it is deleted by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionState
     *        The state of the connection. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The
     *        connection stays in the ordering state until the owner of the hosted connection confirms or declines the
     *        connection order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a standard connection. The connection stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The connection has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up and the connection is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The connection is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The connection has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the
     *        <code>rejected</code> state if it is deleted by the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the connection is not available.
     *        </p>
     *        </li>
     * @see ConnectionState
     */

    public void setConnectionState(ConnectionState connectionState) {
        withConnectionState(connectionState);
    }

    /**
     * <p>
     * The state of the connection. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a standard connection. The connection stays in the requested state
     * until the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The connection has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up and the connection is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The connection is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The connection has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the <code>rejected</code>
     * state if it is deleted by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the connection is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionState
     *        The state of the connection. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ordering</code>: The initial state of a hosted connection provisioned on an interconnect. The
     *        connection stays in the ordering state until the owner of the hosted connection confirms or declines the
     *        connection order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a standard connection. The connection stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The connection has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up and the connection is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The connection is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The connection has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: A hosted connection in the <code>ordering</code> state enters the
     *        <code>rejected</code> state if it is deleted by the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the connection is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public AllocateConnectionOnInterconnectResult withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     * 
     * @param region
     *        The AWS Region where the connection is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     * 
     * @return The AWS Region where the connection is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     * 
     * @param region
     *        The AWS Region where the connection is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * 
     * @param location
     *        The location of the connection.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * 
     * @return The location of the connection.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * 
     * @param location
     *        The location of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth of the connection.
     */

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * 
     * @return The bandwidth of the connection.
     */

    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withBandwidth(String bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @return The ID of the VLAN.
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     * 
     * @param partnerName
     *        The name of the AWS Direct Connect service provider associated with the connection.
     */

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     * 
     * @return The name of the AWS Direct Connect service provider associated with the connection.
     */

    public String getPartnerName() {
        return this.partnerName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     * 
     * @param partnerName
     *        The name of the AWS Direct Connect service provider associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withPartnerName(String partnerName) {
        setPartnerName(partnerName);
        return this;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to <a>DescribeLoa</a> for this connection.
     */

    public void setLoaIssueTime(java.util.Date loaIssueTime) {
        this.loaIssueTime = loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     * 
     * @return The time of the most recent call to <a>DescribeLoa</a> for this connection.
     */

    public java.util.Date getLoaIssueTime() {
        return this.loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withLoaIssueTime(java.util.Date loaIssueTime) {
        setLoaIssueTime(loaIssueTime);
        return this;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     */

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @return The ID of the LAG.
     */

    public String getLagId() {
        return this.lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withLagId(String lagId) {
        setLagId(lagId);
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connect endpoint on which the physical connection terminates.
     */

    public void setAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @return The Direct Connect endpoint on which the physical connection terminates.
     */

    public String getAwsDevice() {
        return this.awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connect endpoint on which the physical connection terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withAwsDevice(String awsDevice) {
        setAwsDevice(awsDevice);
        return this;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @param jumboFrameCapable
     *        Indicates whether jumbo frames (9001 MTU) are supported.
     */

    public void setJumboFrameCapable(Boolean jumboFrameCapable) {
        this.jumboFrameCapable = jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @return Indicates whether jumbo frames (9001 MTU) are supported.
     */

    public Boolean getJumboFrameCapable() {
        return this.jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @param jumboFrameCapable
     *        Indicates whether jumbo frames (9001 MTU) are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withJumboFrameCapable(Boolean jumboFrameCapable) {
        setJumboFrameCapable(jumboFrameCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @return Indicates whether jumbo frames (9001 MTU) are supported.
     */

    public Boolean isJumboFrameCapable() {
        return this.jumboFrameCapable;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the physical connection terminates.
     */

    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @return The Direct Connect endpoint on which the physical connection terminates.
     */

    public String getAwsDeviceV2() {
        return this.awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the physical connection terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withAwsDeviceV2(String awsDeviceV2) {
        setAwsDeviceV2(awsDeviceV2);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public void setHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @return Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public String getHasLogicalRedundancy() {
        return this.hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HasLogicalRedundancy
     */

    public AllocateConnectionOnInterconnectResult withHasLogicalRedundancy(String hasLogicalRedundancy) {
        setHasLogicalRedundancy(hasLogicalRedundancy);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public void setHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        withHasLogicalRedundancy(hasLogicalRedundancy);
    }

    /**
     * <p>
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HasLogicalRedundancy
     */

    public AllocateConnectionOnInterconnectResult withHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     * 
     * @return The tags associated with the connection.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     * 
     * @param tags
     *        The tags associated with the connection.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     * 
     * @param tags
     *        The tags associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     * 
     * @param providerName
     *        The name of the service provider associated with the connection.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     * 
     * @return The name of the service provider associated with the connection.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the connection.
     * </p>
     * 
     * @param providerName
     *        The name of the service provider associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connection supports MAC Security (MACsec).
     * </p>
     * 
     * @param macSecCapable
     *        Indicates whether the connection supports MAC Security (MACsec).
     */

    public void setMacSecCapable(Boolean macSecCapable) {
        this.macSecCapable = macSecCapable;
    }

    /**
     * <p>
     * Indicates whether the connection supports MAC Security (MACsec).
     * </p>
     * 
     * @return Indicates whether the connection supports MAC Security (MACsec).
     */

    public Boolean getMacSecCapable() {
        return this.macSecCapable;
    }

    /**
     * <p>
     * Indicates whether the connection supports MAC Security (MACsec).
     * </p>
     * 
     * @param macSecCapable
     *        Indicates whether the connection supports MAC Security (MACsec).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withMacSecCapable(Boolean macSecCapable) {
        setMacSecCapable(macSecCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connection supports MAC Security (MACsec).
     * </p>
     * 
     * @return Indicates whether the connection supports MAC Security (MACsec).
     */

    public Boolean isMacSecCapable() {
        return this.macSecCapable;
    }

    /**
     * <p>
     * The MAC Security (MACsec) port link status of the connection.
     * </p>
     * <p>
     * The valid values are <code>Encryption Up</code>, which means that there is an active Connection Key Name, or
     * <code>Encryption Down</code>.
     * </p>
     * 
     * @param portEncryptionStatus
     *        The MAC Security (MACsec) port link status of the connection.</p>
     *        <p>
     *        The valid values are <code>Encryption Up</code>, which means that there is an active Connection Key Name,
     *        or <code>Encryption Down</code>.
     */

    public void setPortEncryptionStatus(String portEncryptionStatus) {
        this.portEncryptionStatus = portEncryptionStatus;
    }

    /**
     * <p>
     * The MAC Security (MACsec) port link status of the connection.
     * </p>
     * <p>
     * The valid values are <code>Encryption Up</code>, which means that there is an active Connection Key Name, or
     * <code>Encryption Down</code>.
     * </p>
     * 
     * @return The MAC Security (MACsec) port link status of the connection.</p>
     *         <p>
     *         The valid values are <code>Encryption Up</code>, which means that there is an active Connection Key Name,
     *         or <code>Encryption Down</code>.
     */

    public String getPortEncryptionStatus() {
        return this.portEncryptionStatus;
    }

    /**
     * <p>
     * The MAC Security (MACsec) port link status of the connection.
     * </p>
     * <p>
     * The valid values are <code>Encryption Up</code>, which means that there is an active Connection Key Name, or
     * <code>Encryption Down</code>.
     * </p>
     * 
     * @param portEncryptionStatus
     *        The MAC Security (MACsec) port link status of the connection.</p>
     *        <p>
     *        The valid values are <code>Encryption Up</code>, which means that there is an active Connection Key Name,
     *        or <code>Encryption Down</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withPortEncryptionStatus(String portEncryptionStatus) {
        setPortEncryptionStatus(portEncryptionStatus);
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) connection encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @param encryptionMode
     *        The MAC Security (MACsec) connection encryption mode.</p>
     *        <p>
     *        The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     */

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The MAC Security (MACsec) connection encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @return The MAC Security (MACsec) connection encryption mode.</p>
     *         <p>
     *         The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     */

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    /**
     * <p>
     * The MAC Security (MACsec) connection encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @param encryptionMode
     *        The MAC Security (MACsec) connection encryption mode.</p>
     *        <p>
     *        The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withEncryptionMode(String encryptionMode) {
        setEncryptionMode(encryptionMode);
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the connection.
     * </p>
     * 
     * @return The MAC Security (MACsec) security keys associated with the connection.
     */

    public java.util.List<MacSecKey> getMacSecKeys() {
        if (macSecKeys == null) {
            macSecKeys = new com.amazonaws.internal.SdkInternalList<MacSecKey>();
        }
        return macSecKeys;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the connection.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the connection.
     */

    public void setMacSecKeys(java.util.Collection<MacSecKey> macSecKeys) {
        if (macSecKeys == null) {
            this.macSecKeys = null;
            return;
        }

        this.macSecKeys = new com.amazonaws.internal.SdkInternalList<MacSecKey>(macSecKeys);
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMacSecKeys(java.util.Collection)} or {@link #withMacSecKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withMacSecKeys(MacSecKey... macSecKeys) {
        if (this.macSecKeys == null) {
            setMacSecKeys(new com.amazonaws.internal.SdkInternalList<MacSecKey>(macSecKeys.length));
        }
        for (MacSecKey ele : macSecKeys) {
            this.macSecKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the connection.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectResult withMacSecKeys(java.util.Collection<MacSecKey> macSecKeys) {
        setMacSecKeys(macSecKeys);
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
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: ").append(getConnectionState()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getVlan() != null)
            sb.append("Vlan: ").append(getVlan()).append(",");
        if (getPartnerName() != null)
            sb.append("PartnerName: ").append(getPartnerName()).append(",");
        if (getLoaIssueTime() != null)
            sb.append("LoaIssueTime: ").append(getLoaIssueTime()).append(",");
        if (getLagId() != null)
            sb.append("LagId: ").append(getLagId()).append(",");
        if (getAwsDevice() != null)
            sb.append("AwsDevice: ").append(getAwsDevice()).append(",");
        if (getJumboFrameCapable() != null)
            sb.append("JumboFrameCapable: ").append(getJumboFrameCapable()).append(",");
        if (getAwsDeviceV2() != null)
            sb.append("AwsDeviceV2: ").append(getAwsDeviceV2()).append(",");
        if (getHasLogicalRedundancy() != null)
            sb.append("HasLogicalRedundancy: ").append(getHasLogicalRedundancy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getMacSecCapable() != null)
            sb.append("MacSecCapable: ").append(getMacSecCapable()).append(",");
        if (getPortEncryptionStatus() != null)
            sb.append("PortEncryptionStatus: ").append(getPortEncryptionStatus()).append(",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode()).append(",");
        if (getMacSecKeys() != null)
            sb.append("MacSecKeys: ").append(getMacSecKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateConnectionOnInterconnectResult == false)
            return false;
        AllocateConnectionOnInterconnectResult other = (AllocateConnectionOnInterconnectResult) obj;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getPartnerName() == null ^ this.getPartnerName() == null)
            return false;
        if (other.getPartnerName() != null && other.getPartnerName().equals(this.getPartnerName()) == false)
            return false;
        if (other.getLoaIssueTime() == null ^ this.getLoaIssueTime() == null)
            return false;
        if (other.getLoaIssueTime() != null && other.getLoaIssueTime().equals(this.getLoaIssueTime()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getAwsDevice() == null ^ this.getAwsDevice() == null)
            return false;
        if (other.getAwsDevice() != null && other.getAwsDevice().equals(this.getAwsDevice()) == false)
            return false;
        if (other.getJumboFrameCapable() == null ^ this.getJumboFrameCapable() == null)
            return false;
        if (other.getJumboFrameCapable() != null && other.getJumboFrameCapable().equals(this.getJumboFrameCapable()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
            return false;
        if (other.getHasLogicalRedundancy() == null ^ this.getHasLogicalRedundancy() == null)
            return false;
        if (other.getHasLogicalRedundancy() != null && other.getHasLogicalRedundancy().equals(this.getHasLogicalRedundancy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getMacSecCapable() == null ^ this.getMacSecCapable() == null)
            return false;
        if (other.getMacSecCapable() != null && other.getMacSecCapable().equals(this.getMacSecCapable()) == false)
            return false;
        if (other.getPortEncryptionStatus() == null ^ this.getPortEncryptionStatus() == null)
            return false;
        if (other.getPortEncryptionStatus() != null && other.getPortEncryptionStatus().equals(this.getPortEncryptionStatus()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getMacSecKeys() == null ^ this.getMacSecKeys() == null)
            return false;
        if (other.getMacSecKeys() != null && other.getMacSecKeys().equals(this.getMacSecKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        hashCode = prime * hashCode + ((getLoaIssueTime() == null) ? 0 : getLoaIssueTime().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getAwsDevice() == null) ? 0 : getAwsDevice().hashCode());
        hashCode = prime * hashCode + ((getJumboFrameCapable() == null) ? 0 : getJumboFrameCapable().hashCode());
        hashCode = prime * hashCode + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        hashCode = prime * hashCode + ((getHasLogicalRedundancy() == null) ? 0 : getHasLogicalRedundancy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getMacSecCapable() == null) ? 0 : getMacSecCapable().hashCode());
        hashCode = prime * hashCode + ((getPortEncryptionStatus() == null) ? 0 : getPortEncryptionStatus().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getMacSecKeys() == null) ? 0 : getMacSecKeys().hashCode());
        return hashCode;
    }

    @Override
    public AllocateConnectionOnInterconnectResult clone() {
        try {
            return (AllocateConnectionOnInterconnectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
