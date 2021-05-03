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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRoomMemberships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoomMembershipsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The room membership details.
     * </p>
     */
    private java.util.List<RoomMembership> roomMemberships;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The room membership details.
     * </p>
     * 
     * @return The room membership details.
     */

    public java.util.List<RoomMembership> getRoomMemberships() {
        return roomMemberships;
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     * 
     * @param roomMemberships
     *        The room membership details.
     */

    public void setRoomMemberships(java.util.Collection<RoomMembership> roomMemberships) {
        if (roomMemberships == null) {
            this.roomMemberships = null;
            return;
        }

        this.roomMemberships = new java.util.ArrayList<RoomMembership>(roomMemberships);
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoomMemberships(java.util.Collection)} or {@link #withRoomMemberships(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param roomMemberships
     *        The room membership details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomMembershipsResult withRoomMemberships(RoomMembership... roomMemberships) {
        if (this.roomMemberships == null) {
            setRoomMemberships(new java.util.ArrayList<RoomMembership>(roomMemberships.length));
        }
        for (RoomMembership ele : roomMemberships) {
            this.roomMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     * 
     * @param roomMemberships
     *        The room membership details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomMembershipsResult withRoomMemberships(java.util.Collection<RoomMembership> roomMemberships) {
        setRoomMemberships(roomMemberships);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomMembershipsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRoomMemberships() != null)
            sb.append("RoomMemberships: ").append(getRoomMemberships()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoomMembershipsResult == false)
            return false;
        ListRoomMembershipsResult other = (ListRoomMembershipsResult) obj;
        if (other.getRoomMemberships() == null ^ this.getRoomMemberships() == null)
            return false;
        if (other.getRoomMemberships() != null && other.getRoomMemberships().equals(this.getRoomMemberships()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomMemberships() == null) ? 0 : getRoomMemberships().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRoomMembershipsResult clone() {
        try {
            return (ListRoomMembershipsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
