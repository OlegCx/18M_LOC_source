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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetProposal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProposalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     */
    private String proposalId;

    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which the proposal is made.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     * 
     * @return The unique identifier of the network for which the proposal is made.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which the proposal is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProposalRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     * 
     * @param proposalId
     *        The unique identifier of the proposal.
     */

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     * 
     * @return The unique identifier of the proposal.
     */

    public String getProposalId() {
        return this.proposalId;
    }

    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     * 
     * @param proposalId
     *        The unique identifier of the proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProposalRequest withProposalId(String proposalId) {
        setProposalId(proposalId);
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getProposalId() != null)
            sb.append("ProposalId: ").append(getProposalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProposalRequest == false)
            return false;
        GetProposalRequest other = (GetProposalRequest) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        return hashCode;
    }

    @Override
    public GetProposalRequest clone() {
        return (GetProposalRequest) super.clone();
    }

}
