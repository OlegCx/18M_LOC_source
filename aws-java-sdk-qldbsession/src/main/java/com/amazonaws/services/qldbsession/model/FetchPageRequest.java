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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the details of the page to be fetched.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/FetchPageRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FetchPageRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     * 
     * @param transactionId
     *        Specifies the transaction ID of the page to be fetched.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     * 
     * @return Specifies the transaction ID of the page to be fetched.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     * 
     * @param transactionId
     *        Specifies the transaction ID of the page to be fetched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FetchPageRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     * 
     * @param nextPageToken
     *        Specifies the next page token of the page to be fetched.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     * 
     * @return Specifies the next page token of the page to be fetched.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     * 
     * @param nextPageToken
     *        Specifies the next page token of the page to be fetched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FetchPageRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FetchPageRequest == false)
            return false;
        FetchPageRequest other = (FetchPageRequest) obj;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public FetchPageRequest clone() {
        try {
            return (FetchPageRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.FetchPageRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
