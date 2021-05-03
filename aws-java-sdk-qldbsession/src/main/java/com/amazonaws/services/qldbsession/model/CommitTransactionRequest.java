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
 * Contains the details of the transaction to commit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/CommitTransactionRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitTransactionRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest must
     * be passed. QLDB validates <code>CommitDigest</code> and rejects the commit with an error if the digest computed
     * on the client does not match the digest computed by QLDB.
     * </p>
     * <p>
     * The purpose of the <code>CommitDigest</code> parameter is to ensure that QLDB commits a transaction if and only
     * if the server has processed the exact set of statements sent by the client, in the same order that client sent
     * them, and with no duplicates.
     * </p>
     */
    private java.nio.ByteBuffer commitDigest;

    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
     * </p>
     * 
     * @param transactionId
     *        Specifies the transaction ID of the transaction to commit.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
     * </p>
     * 
     * @return Specifies the transaction ID of the transaction to commit.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
     * </p>
     * 
     * @param transactionId
     *        Specifies the transaction ID of the transaction to commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitTransactionRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest must
     * be passed. QLDB validates <code>CommitDigest</code> and rejects the commit with an error if the digest computed
     * on the client does not match the digest computed by QLDB.
     * </p>
     * <p>
     * The purpose of the <code>CommitDigest</code> parameter is to ensure that QLDB commits a transaction if and only
     * if the server has processed the exact set of statements sent by the client, in the same order that client sent
     * them, and with no duplicates.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param commitDigest
     *        Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest
     *        must be passed. QLDB validates <code>CommitDigest</code> and rejects the commit with an error if the
     *        digest computed on the client does not match the digest computed by QLDB.</p>
     *        <p>
     *        The purpose of the <code>CommitDigest</code> parameter is to ensure that QLDB commits a transaction if and
     *        only if the server has processed the exact set of statements sent by the client, in the same order that
     *        client sent them, and with no duplicates.
     */

    public void setCommitDigest(java.nio.ByteBuffer commitDigest) {
        this.commitDigest = commitDigest;
    }

    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest must
     * be passed. QLDB validates <code>CommitDigest</code> and rejects the commit with an error if the digest computed
     * on the client does not match the digest computed by QLDB.
     * </p>
     * <p>
     * The purpose of the <code>CommitDigest</code> parameter is to ensure that QLDB commits a transaction if and only
     * if the server has processed the exact set of statements sent by the client, in the same order that client sent
     * them, and with no duplicates.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Specifies the commit digest for the transaction to commit. For every active transaction, the commit
     *         digest must be passed. QLDB validates <code>CommitDigest</code> and rejects the commit with an error if
     *         the digest computed on the client does not match the digest computed by QLDB.</p>
     *         <p>
     *         The purpose of the <code>CommitDigest</code> parameter is to ensure that QLDB commits a transaction if
     *         and only if the server has processed the exact set of statements sent by the client, in the same order
     *         that client sent them, and with no duplicates.
     */

    public java.nio.ByteBuffer getCommitDigest() {
        return this.commitDigest;
    }

    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest must
     * be passed. QLDB validates <code>CommitDigest</code> and rejects the commit with an error if the digest computed
     * on the client does not match the digest computed by QLDB.
     * </p>
     * <p>
     * The purpose of the <code>CommitDigest</code> parameter is to ensure that QLDB commits a transaction if and only
     * if the server has processed the exact set of statements sent by the client, in the same order that client sent
     * them, and with no duplicates.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param commitDigest
     *        Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest
     *        must be passed. QLDB validates <code>CommitDigest</code> and rejects the commit with an error if the
     *        digest computed on the client does not match the digest computed by QLDB.</p>
     *        <p>
     *        The purpose of the <code>CommitDigest</code> parameter is to ensure that QLDB commits a transaction if and
     *        only if the server has processed the exact set of statements sent by the client, in the same order that
     *        client sent them, and with no duplicates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitTransactionRequest withCommitDigest(java.nio.ByteBuffer commitDigest) {
        setCommitDigest(commitDigest);
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
        if (getCommitDigest() != null)
            sb.append("CommitDigest: ").append(getCommitDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitTransactionRequest == false)
            return false;
        CommitTransactionRequest other = (CommitTransactionRequest) obj;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getCommitDigest() == null ^ this.getCommitDigest() == null)
            return false;
        if (other.getCommitDigest() != null && other.getCommitDigest().equals(this.getCommitDigest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getCommitDigest() == null) ? 0 : getCommitDigest().hashCode());
        return hashCode;
    }

    @Override
    public CommitTransactionRequest clone() {
        try {
            return (CommitTransactionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.CommitTransactionRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
