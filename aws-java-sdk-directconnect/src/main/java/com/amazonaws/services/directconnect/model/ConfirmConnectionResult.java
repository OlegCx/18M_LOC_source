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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmConnection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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

    public ConfirmConnectionResult withConnectionState(String connectionState) {
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

    public ConfirmConnectionResult withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
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
        if (getConnectionState() != null)
            sb.append("ConnectionState: ").append(getConnectionState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmConnectionResult == false)
            return false;
        ConfirmConnectionResult other = (ConfirmConnectionResult) obj;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmConnectionResult clone() {
        try {
            return (ConfirmConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
