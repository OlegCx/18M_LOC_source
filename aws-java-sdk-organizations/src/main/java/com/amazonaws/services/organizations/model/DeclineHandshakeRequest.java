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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeclineHandshake" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeclineHandshakeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the
     * <a>ListHandshakesForAccount</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lowercase letters or digits.
     * </p>
     */
    private String handshakeId;

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the
     * <a>ListHandshakesForAccount</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lowercase letters or digits.
     * </p>
     * 
     * @param handshakeId
     *        The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the
     *        <a>ListHandshakesForAccount</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *        followed by from 8 to 32 lowercase letters or digits.
     */

    public void setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the
     * <a>ListHandshakesForAccount</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lowercase letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the
     *         <a>ListHandshakesForAccount</a> operation.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *         followed by from 8 to 32 lowercase letters or digits.
     */

    public String getHandshakeId() {
        return this.handshakeId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the
     * <a>ListHandshakesForAccount</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lowercase letters or digits.
     * </p>
     * 
     * @param handshakeId
     *        The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the
     *        <a>ListHandshakesForAccount</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *        followed by from 8 to 32 lowercase letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeclineHandshakeRequest withHandshakeId(String handshakeId) {
        setHandshakeId(handshakeId);
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
        if (getHandshakeId() != null)
            sb.append("HandshakeId: ").append(getHandshakeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeclineHandshakeRequest == false)
            return false;
        DeclineHandshakeRequest other = (DeclineHandshakeRequest) obj;
        if (other.getHandshakeId() == null ^ this.getHandshakeId() == null)
            return false;
        if (other.getHandshakeId() != null && other.getHandshakeId().equals(this.getHandshakeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHandshakeId() == null) ? 0 : getHandshakeId().hashCode());
        return hashCode;
    }

    @Override
    public DeclineHandshakeRequest clone() {
        return (DeclineHandshakeRequest) super.clone();
    }

}
