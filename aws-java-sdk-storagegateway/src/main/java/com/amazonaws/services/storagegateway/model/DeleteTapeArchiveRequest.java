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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DeleteTapeArchiveInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTapeArchive" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTapeArchiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
     * </p>
     */
    private String tapeARN;
    /**
     * <p>
     * Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention lock. Only
     * archived tapes with tape retention lock set to <code>governance</code> can be deleted. Archived tapes with tape
     * retention lock set to <code>compliance</code> can't be deleted.
     * </p>
     */
    private Boolean bypassGovernanceRetention;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTapeArchiveRequest withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention lock. Only
     * archived tapes with tape retention lock set to <code>governance</code> can be deleted. Archived tapes with tape
     * retention lock set to <code>compliance</code> can't be deleted.
     * </p>
     * 
     * @param bypassGovernanceRetention
     *        Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention
     *        lock. Only archived tapes with tape retention lock set to <code>governance</code> can be deleted. Archived
     *        tapes with tape retention lock set to <code>compliance</code> can't be deleted.
     */

    public void setBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention lock. Only
     * archived tapes with tape retention lock set to <code>governance</code> can be deleted. Archived tapes with tape
     * retention lock set to <code>compliance</code> can't be deleted.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention
     *         lock. Only archived tapes with tape retention lock set to <code>governance</code> can be deleted.
     *         Archived tapes with tape retention lock set to <code>compliance</code> can't be deleted.
     */

    public Boolean getBypassGovernanceRetention() {
        return this.bypassGovernanceRetention;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention lock. Only
     * archived tapes with tape retention lock set to <code>governance</code> can be deleted. Archived tapes with tape
     * retention lock set to <code>compliance</code> can't be deleted.
     * </p>
     * 
     * @param bypassGovernanceRetention
     *        Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention
     *        lock. Only archived tapes with tape retention lock set to <code>governance</code> can be deleted. Archived
     *        tapes with tape retention lock set to <code>compliance</code> can't be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTapeArchiveRequest withBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        setBypassGovernanceRetention(bypassGovernanceRetention);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention lock. Only
     * archived tapes with tape retention lock set to <code>governance</code> can be deleted. Archived tapes with tape
     * retention lock set to <code>compliance</code> can't be deleted.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to delete an archived tape that belongs to a custom pool with tape retention
     *         lock. Only archived tapes with tape retention lock set to <code>governance</code> can be deleted.
     *         Archived tapes with tape retention lock set to <code>compliance</code> can't be deleted.
     */

    public Boolean isBypassGovernanceRetention() {
        return this.bypassGovernanceRetention;
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
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN()).append(",");
        if (getBypassGovernanceRetention() != null)
            sb.append("BypassGovernanceRetention: ").append(getBypassGovernanceRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTapeArchiveRequest == false)
            return false;
        DeleteTapeArchiveRequest other = (DeleteTapeArchiveRequest) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getBypassGovernanceRetention() == null ^ this.getBypassGovernanceRetention() == null)
            return false;
        if (other.getBypassGovernanceRetention() != null && other.getBypassGovernanceRetention().equals(this.getBypassGovernanceRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getBypassGovernanceRetention() == null) ? 0 : getBypassGovernanceRetention().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTapeArchiveRequest clone() {
        return (DeleteTapeArchiveRequest) super.clone();
    }

}
