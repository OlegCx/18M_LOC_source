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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeIdentityIdFormatRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIdentityIdFormatRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeIdentityIdFormatRequest> {

    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     */
    private String resource;

    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     * </p>
     * 
     * @return The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityIdFormatRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * 
     * @param resource
     *        The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     *        <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *        <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *        <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     *        <code>network-acl-association</code> | <code>network-interface</code> |
     *        <code>network-interface-attachment</code> | <code>prefix-list</code> | <code>reservation</code> |
     *        <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *        <code>snapshot</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> |
     *        <code>volume</code> | <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     *        <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     *        <code>vpn-gateway</code>
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * 
     * @return The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code>
     *         | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *         <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *         <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-acl-association</code> | <code>network-interface</code> |
     *         <code>network-interface-attachment</code> | <code>prefix-list</code> | <code>reservation</code> |
     *         <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *         <code>snapshot</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> |
     *         <code>volume</code> | <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     *         <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     *         <code>vpn-gateway</code>
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * 
     * @param resource
     *        The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     *        <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *        <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *        <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     *        <code>network-acl-association</code> | <code>network-interface</code> |
     *        <code>network-interface-attachment</code> | <code>prefix-list</code> | <code>reservation</code> |
     *        <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *        <code>snapshot</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> |
     *        <code>volume</code> | <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     *        <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     *        <code>vpn-gateway</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityIdFormatRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeIdentityIdFormatRequest> getDryRunRequest() {
        Request<DescribeIdentityIdFormatRequest> request = new DescribeIdentityIdFormatRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityIdFormatRequest == false)
            return false;
        DescribeIdentityIdFormatRequest other = (DescribeIdentityIdFormatRequest) obj;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityIdFormatRequest clone() {
        return (DescribeIdentityIdFormatRequest) super.clone();
    }
}
