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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A document that contains additional information about the authorization status of a request from an encoded message
 * that is returned in response to an AWS request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/DecodeAuthorizationMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecodeAuthorizationMessageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An XML document that contains the decoded message.
     * </p>
     */
    private String decodedMessage;

    /**
     * <p>
     * An XML document that contains the decoded message.
     * </p>
     * 
     * @param decodedMessage
     *        An XML document that contains the decoded message.
     */

    public void setDecodedMessage(String decodedMessage) {
        this.decodedMessage = decodedMessage;
    }

    /**
     * <p>
     * An XML document that contains the decoded message.
     * </p>
     * 
     * @return An XML document that contains the decoded message.
     */

    public String getDecodedMessage() {
        return this.decodedMessage;
    }

    /**
     * <p>
     * An XML document that contains the decoded message.
     * </p>
     * 
     * @param decodedMessage
     *        An XML document that contains the decoded message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecodeAuthorizationMessageResult withDecodedMessage(String decodedMessage) {
        setDecodedMessage(decodedMessage);
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
        if (getDecodedMessage() != null)
            sb.append("DecodedMessage: ").append(getDecodedMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecodeAuthorizationMessageResult == false)
            return false;
        DecodeAuthorizationMessageResult other = (DecodeAuthorizationMessageResult) obj;
        if (other.getDecodedMessage() == null ^ this.getDecodedMessage() == null)
            return false;
        if (other.getDecodedMessage() != null && other.getDecodedMessage().equals(this.getDecodedMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecodedMessage() == null) ? 0 : getDecodedMessage().hashCode());
        return hashCode;
    }

    @Override
    public DecodeAuthorizationMessageResult clone() {
        try {
            return (DecodeAuthorizationMessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
