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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of owner.
     * </p>
     */
    private String resourceOwner;
    /**
     * <p>
     * The principal.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>acm-pca:CertificateAuthority</code> | <code>appmesh:Mesh</code> |
     * <code>codebuild:Project</code> | <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code> |
     * <code>ec2:DedicatedHost</code> | <code>ec2:LocalGatewayRouteTable</code> | <code>ec2:PrefixList</code> |
     * <code>ec2:Subnet</code> | <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> | <code>imagebuilder:ImageRecipe</code> |
     * <code>imagebuilder:ContainerRecipe</code> | <code>glue:Catalog</code> | <code>glue:Database</code> |
     * <code>glue:Table</code> | <code>license-manager:LicenseConfiguration</code> I
     * <code>network-firewall:FirewallPolicy</code> | <code>network-firewall:StatefulRuleGroup</code> |
     * <code>network-firewall:StatelessRuleGroup</code> | <code>outposts:Outpost</code> |
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> | <code>route53resolver:FirewallRuleGroup</code> |
     * <code>route53resolver:ResolverQueryLogConfig</code> | <code>route53resolver:ResolverRule</code>
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     */
    private java.util.List<String> resourceShareArns;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @param resourceOwner
     *        The type of owner.
     * @see ResourceOwner
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @return The type of owner.
     * @see ResourceOwner
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @param resourceOwner
     *        The type of owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListResourcesRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @param resourceOwner
     *        The type of owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListResourcesRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @param principal
     *        The principal.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @return The principal.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @param principal
     *        The principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>acm-pca:CertificateAuthority</code> | <code>appmesh:Mesh</code> |
     * <code>codebuild:Project</code> | <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code> |
     * <code>ec2:DedicatedHost</code> | <code>ec2:LocalGatewayRouteTable</code> | <code>ec2:PrefixList</code> |
     * <code>ec2:Subnet</code> | <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> | <code>imagebuilder:ImageRecipe</code> |
     * <code>imagebuilder:ContainerRecipe</code> | <code>glue:Catalog</code> | <code>glue:Database</code> |
     * <code>glue:Table</code> | <code>license-manager:LicenseConfiguration</code> I
     * <code>network-firewall:FirewallPolicy</code> | <code>network-firewall:StatefulRuleGroup</code> |
     * <code>network-firewall:StatelessRuleGroup</code> | <code>outposts:Outpost</code> |
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> | <code>route53resolver:FirewallRuleGroup</code> |
     * <code>route53resolver:ResolverQueryLogConfig</code> | <code>route53resolver:ResolverRule</code>
     * </p>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <p>
     *        Valid values: <code>acm-pca:CertificateAuthority</code> | <code>appmesh:Mesh</code> |
     *        <code>codebuild:Project</code> | <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code>
     *        | <code>ec2:DedicatedHost</code> | <code>ec2:LocalGatewayRouteTable</code> | <code>ec2:PrefixList</code> |
     *        <code>ec2:Subnet</code> | <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     *        <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> |
     *        <code>imagebuilder:ImageRecipe</code> | <code>imagebuilder:ContainerRecipe</code> |
     *        <code>glue:Catalog</code> | <code>glue:Database</code> | <code>glue:Table</code> |
     *        <code>license-manager:LicenseConfiguration</code> I <code>network-firewall:FirewallPolicy</code> |
     *        <code>network-firewall:StatefulRuleGroup</code> | <code>network-firewall:StatelessRuleGroup</code> |
     *        <code>outposts:Outpost</code> | <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     *        <code>route53resolver:FirewallRuleGroup</code> |<code>route53resolver:ResolverQueryLogConfig</code> |
     *        <code>route53resolver:ResolverRule</code>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>acm-pca:CertificateAuthority</code> | <code>appmesh:Mesh</code> |
     * <code>codebuild:Project</code> | <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code> |
     * <code>ec2:DedicatedHost</code> | <code>ec2:LocalGatewayRouteTable</code> | <code>ec2:PrefixList</code> |
     * <code>ec2:Subnet</code> | <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> | <code>imagebuilder:ImageRecipe</code> |
     * <code>imagebuilder:ContainerRecipe</code> | <code>glue:Catalog</code> | <code>glue:Database</code> |
     * <code>glue:Table</code> | <code>license-manager:LicenseConfiguration</code> I
     * <code>network-firewall:FirewallPolicy</code> | <code>network-firewall:StatefulRuleGroup</code> |
     * <code>network-firewall:StatelessRuleGroup</code> | <code>outposts:Outpost</code> |
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> | <code>route53resolver:FirewallRuleGroup</code> |
     * <code>route53resolver:ResolverQueryLogConfig</code> | <code>route53resolver:ResolverRule</code>
     * </p>
     * 
     * @return The resource type.</p>
     *         <p>
     *         Valid values: <code>acm-pca:CertificateAuthority</code> | <code>appmesh:Mesh</code> |
     *         <code>codebuild:Project</code> | <code>codebuild:ReportGroup</code> |
     *         <code>ec2:CapacityReservation</code> | <code>ec2:DedicatedHost</code> |
     *         <code>ec2:LocalGatewayRouteTable</code> | <code>ec2:PrefixList</code> | <code>ec2:Subnet</code> |
     *         <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     *         <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> |
     *         <code>imagebuilder:ImageRecipe</code> | <code>imagebuilder:ContainerRecipe</code> |
     *         <code>glue:Catalog</code> | <code>glue:Database</code> | <code>glue:Table</code> |
     *         <code>license-manager:LicenseConfiguration</code> I <code>network-firewall:FirewallPolicy</code> |
     *         <code>network-firewall:StatefulRuleGroup</code> | <code>network-firewall:StatelessRuleGroup</code> |
     *         <code>outposts:Outpost</code> | <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     *         <code>route53resolver:FirewallRuleGroup</code> |<code>route53resolver:ResolverQueryLogConfig</code> |
     *         <code>route53resolver:ResolverRule</code>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>acm-pca:CertificateAuthority</code> | <code>appmesh:Mesh</code> |
     * <code>codebuild:Project</code> | <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code> |
     * <code>ec2:DedicatedHost</code> | <code>ec2:LocalGatewayRouteTable</code> | <code>ec2:PrefixList</code> |
     * <code>ec2:Subnet</code> | <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> | <code>imagebuilder:ImageRecipe</code> |
     * <code>imagebuilder:ContainerRecipe</code> | <code>glue:Catalog</code> | <code>glue:Database</code> |
     * <code>glue:Table</code> | <code>license-manager:LicenseConfiguration</code> I
     * <code>network-firewall:FirewallPolicy</code> | <code>network-firewall:StatefulRuleGroup</code> |
     * <code>network-firewall:StatelessRuleGroup</code> | <code>outposts:Outpost</code> |
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> | <code>route53resolver:FirewallRuleGroup</code> |
     * <code>route53resolver:ResolverQueryLogConfig</code> | <code>route53resolver:ResolverRule</code>
     * </p>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <p>
     *        Valid values: <code>acm-pca:CertificateAuthority</code> | <code>appmesh:Mesh</code> |
     *        <code>codebuild:Project</code> | <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code>
     *        | <code>ec2:DedicatedHost</code> | <code>ec2:LocalGatewayRouteTable</code> | <code>ec2:PrefixList</code> |
     *        <code>ec2:Subnet</code> | <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     *        <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> |
     *        <code>imagebuilder:ImageRecipe</code> | <code>imagebuilder:ContainerRecipe</code> |
     *        <code>glue:Catalog</code> | <code>glue:Database</code> | <code>glue:Table</code> |
     *        <code>license-manager:LicenseConfiguration</code> I <code>network-firewall:FirewallPolicy</code> |
     *        <code>network-firewall:StatefulRuleGroup</code> | <code>network-firewall:StatelessRuleGroup</code> |
     *        <code>outposts:Outpost</code> | <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     *        <code>route53resolver:FirewallRuleGroup</code> |<code>route53resolver:ResolverQueryLogConfig</code> |
     *        <code>route53resolver:ResolverRule</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the resources.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARN) of the resources.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARN) of the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARN) of the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the resource shares.
     */

    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * 
     * @param resourceShareArns
     *        The Amazon Resource Names (ARN) of the resource shares.
     */

    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareArns(java.util.Collection)} or {@link #withResourceShareArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceShareArns
     *        The Amazon Resource Names (ARN) of the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceShareArns(String... resourceShareArns) {
        if (this.resourceShareArns == null) {
            setResourceShareArns(new java.util.ArrayList<String>(resourceShareArns.length));
        }
        for (String ele : resourceShareArns) {
            this.resourceShareArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * 
     * @param resourceShareArns
     *        The Amazon Resource Names (ARN) of the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceShareArns(java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getResourceShareArns() != null)
            sb.append("ResourceShareArns: ").append(getResourceShareArns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesRequest == false)
            return false;
        ListResourcesRequest other = (ListResourcesRequest) obj;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesRequest clone() {
        return (ListResourcesRequest) super.clone();
    }

}
