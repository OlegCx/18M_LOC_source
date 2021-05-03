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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the VPC configuration to use for an Amazon EKS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/VpcConfigRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these
     * subnets to allow communication between your nodes and the Kubernetes control plane.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your nodes and the Kubernetes control plane. If you don't specify any security
     * groups, then familiarize yourself with the difference between Amazon EKS defaults for clusters deployed with
     * Kubernetes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.3</code> and later
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon
     * EKS security group considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server endpoint.
     * If you disable public access, your cluster's Kubernetes API server can only receive requests from within the
     * cluster VPC. The default value for this parameter is <code>true</code>, which enables public access for your
     * Kubernetes API server. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     */
    private Boolean endpointPublicAccess;
    /**
     * <p>
     * Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server endpoint.
     * If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC
     * endpoint. The default value for this parameter is <code>false</code>, which disables private access for your
     * Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then
     * ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks for communication with the nodes or
     * Fargate pods. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     */
    private Boolean endpointPrivateAccess;
    /**
     * <p>
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to
     * the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is
     * <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or AWS Fargate pods in the
     * cluster, then ensure that you specify the necessary CIDR blocks. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     */
    private java.util.List<String> publicAccessCidrs;

    /**
     * <p>
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these
     * subnets to allow communication between your nodes and the Kubernetes control plane.
     * </p>
     * 
     * @return Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in
     *         these subnets to allow communication between your nodes and the Kubernetes control plane.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these
     * subnets to allow communication between your nodes and the Kubernetes control plane.
     * </p>
     * 
     * @param subnetIds
     *        Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in
     *        these subnets to allow communication between your nodes and the Kubernetes control plane.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these
     * subnets to allow communication between your nodes and the Kubernetes control plane.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in
     *        these subnets to allow communication between your nodes and the Kubernetes control plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these
     * subnets to allow communication between your nodes and the Kubernetes control plane.
     * </p>
     * 
     * @param subnetIds
     *        Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in
     *        these subnets to allow communication between your nodes and the Kubernetes control plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your nodes and the Kubernetes control plane. If you don't specify any security
     * groups, then familiarize yourself with the difference between Amazon EKS defaults for clusters deployed with
     * Kubernetes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.3</code> and later
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon
     * EKS security group considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *         creates to use to allow communication between your nodes and the Kubernetes control plane. If you don't
     *         specify any security groups, then familiarize yourself with the difference between Amazon EKS defaults
     *         for clusters deployed with Kubernetes:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.14 Amazon EKS platform version <code>eks.3</code> and later
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon EKS security group
     *         considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your nodes and the Kubernetes control plane. If you don't specify any security
     * groups, then familiarize yourself with the difference between Amazon EKS defaults for clusters deployed with
     * Kubernetes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.3</code> and later
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon
     * EKS security group considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param securityGroupIds
     *        Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *        creates to use to allow communication between your nodes and the Kubernetes control plane. If you don't
     *        specify any security groups, then familiarize yourself with the difference between Amazon EKS defaults for
     *        clusters deployed with Kubernetes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.14 Amazon EKS platform version <code>eks.3</code> and later
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon EKS security group
     *        considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your nodes and the Kubernetes control plane. If you don't specify any security
     * groups, then familiarize yourself with the difference between Amazon EKS defaults for clusters deployed with
     * Kubernetes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.3</code> and later
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon
     * EKS security group considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *        creates to use to allow communication between your nodes and the Kubernetes control plane. If you don't
     *        specify any security groups, then familiarize yourself with the difference between Amazon EKS defaults for
     *        clusters deployed with Kubernetes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.14 Amazon EKS platform version <code>eks.3</code> and later
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon EKS security group
     *        considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your nodes and the Kubernetes control plane. If you don't specify any security
     * groups, then familiarize yourself with the difference between Amazon EKS defaults for clusters deployed with
     * Kubernetes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.14 Amazon EKS platform version <code>eks.3</code> and later
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon
     * EKS security group considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param securityGroupIds
     *        Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *        creates to use to allow communication between your nodes and the Kubernetes control plane. If you don't
     *        specify any security groups, then familiarize yourself with the difference between Amazon EKS defaults for
     *        clusters deployed with Kubernetes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        1.14 Amazon EKS platform version <code>eks.2</code> and earlier
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.14 Amazon EKS platform version <code>eks.3</code> and later
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Amazon EKS security group
     *        considerations</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server endpoint.
     * If you disable public access, your cluster's Kubernetes API server can only receive requests from within the
     * cluster VPC. The default value for this parameter is <code>true</code>, which enables public access for your
     * Kubernetes API server. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param endpointPublicAccess
     *        Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server
     *        endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests
     *        from within the cluster VPC. The default value for this parameter is <code>true</code>, which enables
     *        public access for your Kubernetes API server. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *        Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public void setEndpointPublicAccess(Boolean endpointPublicAccess) {
        this.endpointPublicAccess = endpointPublicAccess;
    }

    /**
     * <p>
     * Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server endpoint.
     * If you disable public access, your cluster's Kubernetes API server can only receive requests from within the
     * cluster VPC. The default value for this parameter is <code>true</code>, which enables public access for your
     * Kubernetes API server. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server
     *         endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests
     *         from within the cluster VPC. The default value for this parameter is <code>true</code>, which enables
     *         public access for your Kubernetes API server. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *         Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * <p>
     * Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server endpoint.
     * If you disable public access, your cluster's Kubernetes API server can only receive requests from within the
     * cluster VPC. The default value for this parameter is <code>true</code>, which enables public access for your
     * Kubernetes API server. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param endpointPublicAccess
     *        Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server
     *        endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests
     *        from within the cluster VPC. The default value for this parameter is <code>true</code>, which enables
     *        public access for your Kubernetes API server. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *        Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withEndpointPublicAccess(Boolean endpointPublicAccess) {
        setEndpointPublicAccess(endpointPublicAccess);
        return this;
    }

    /**
     * <p>
     * Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server endpoint.
     * If you disable public access, your cluster's Kubernetes API server can only receive requests from within the
     * cluster VPC. The default value for this parameter is <code>true</code>, which enables public access for your
     * Kubernetes API server. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return Set this value to <code>false</code> to disable public access to your cluster's Kubernetes API server
     *         endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests
     *         from within the cluster VPC. The default value for this parameter is <code>true</code>, which enables
     *         public access for your Kubernetes API server. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *         Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public Boolean isEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server endpoint.
     * If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC
     * endpoint. The default value for this parameter is <code>false</code>, which disables private access for your
     * Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then
     * ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks for communication with the nodes or
     * Fargate pods. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param endpointPrivateAccess
     *        Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server
     *        endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the
     *        private VPC endpoint. The default value for this parameter is <code>false</code>, which disables private
     *        access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate
     *        pods in the cluster, then ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks
     *        for communication with the nodes or Fargate pods. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *        Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public void setEndpointPrivateAccess(Boolean endpointPrivateAccess) {
        this.endpointPrivateAccess = endpointPrivateAccess;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server endpoint.
     * If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC
     * endpoint. The default value for this parameter is <code>false</code>, which disables private access for your
     * Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then
     * ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks for communication with the nodes or
     * Fargate pods. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server
     *         endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the
     *         private VPC endpoint. The default value for this parameter is <code>false</code>, which disables private
     *         access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate
     *         pods in the cluster, then ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks
     *         for communication with the nodes or Fargate pods. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *         Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public Boolean getEndpointPrivateAccess() {
        return this.endpointPrivateAccess;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server endpoint.
     * If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC
     * endpoint. The default value for this parameter is <code>false</code>, which disables private access for your
     * Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then
     * ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks for communication with the nodes or
     * Fargate pods. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param endpointPrivateAccess
     *        Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server
     *        endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the
     *        private VPC endpoint. The default value for this parameter is <code>false</code>, which disables private
     *        access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate
     *        pods in the cluster, then ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks
     *        for communication with the nodes or Fargate pods. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *        Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withEndpointPrivateAccess(Boolean endpointPrivateAccess) {
        setEndpointPrivateAccess(endpointPrivateAccess);
        return this;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server endpoint.
     * If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC
     * endpoint. The default value for this parameter is <code>false</code>, which disables private access for your
     * Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then
     * ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks for communication with the nodes or
     * Fargate pods. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return Set this value to <code>true</code> to enable private access for your cluster's Kubernetes API server
     *         endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the
     *         private VPC endpoint. The default value for this parameter is <code>false</code>, which disables private
     *         access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate
     *         pods in the cluster, then ensure that <code>publicAccessCidrs</code> includes the necessary CIDR blocks
     *         for communication with the nodes or Fargate pods. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     *         Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public Boolean isEndpointPrivateAccess() {
        return this.endpointPrivateAccess;
    }

    /**
     * <p>
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to
     * the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is
     * <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or AWS Fargate pods in the
     * cluster, then ensure that you specify the necessary CIDR blocks. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint.
     *         Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The
     *         default value is <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or
     *         AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks. For more
     *         information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon
     *         EKS Cluster Endpoint Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public java.util.List<String> getPublicAccessCidrs() {
        return publicAccessCidrs;
    }

    /**
     * <p>
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to
     * the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is
     * <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or AWS Fargate pods in the
     * cluster, then ensure that you specify the necessary CIDR blocks. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param publicAccessCidrs
     *        The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint.
     *        Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The
     *        default value is <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or
     *        AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks. For more
     *        information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon
     *        EKS Cluster Endpoint Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public void setPublicAccessCidrs(java.util.Collection<String> publicAccessCidrs) {
        if (publicAccessCidrs == null) {
            this.publicAccessCidrs = null;
            return;
        }

        this.publicAccessCidrs = new java.util.ArrayList<String>(publicAccessCidrs);
    }

    /**
     * <p>
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to
     * the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is
     * <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or AWS Fargate pods in the
     * cluster, then ensure that you specify the necessary CIDR blocks. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicAccessCidrs(java.util.Collection)} or {@link #withPublicAccessCidrs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param publicAccessCidrs
     *        The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint.
     *        Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The
     *        default value is <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or
     *        AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks. For more
     *        information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon
     *        EKS Cluster Endpoint Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withPublicAccessCidrs(String... publicAccessCidrs) {
        if (this.publicAccessCidrs == null) {
            setPublicAccessCidrs(new java.util.ArrayList<String>(publicAccessCidrs.length));
        }
        for (String ele : publicAccessCidrs) {
            this.publicAccessCidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to
     * the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is
     * <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or AWS Fargate pods in the
     * cluster, then ensure that you specify the necessary CIDR blocks. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param publicAccessCidrs
     *        The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint.
     *        Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The
     *        default value is <code>0.0.0.0/0</code>. If you've disabled private endpoint access and you have nodes or
     *        AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks. For more
     *        information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon
     *        EKS Cluster Endpoint Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withPublicAccessCidrs(java.util.Collection<String> publicAccessCidrs) {
        setPublicAccessCidrs(publicAccessCidrs);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getEndpointPublicAccess() != null)
            sb.append("EndpointPublicAccess: ").append(getEndpointPublicAccess()).append(",");
        if (getEndpointPrivateAccess() != null)
            sb.append("EndpointPrivateAccess: ").append(getEndpointPrivateAccess()).append(",");
        if (getPublicAccessCidrs() != null)
            sb.append("PublicAccessCidrs: ").append(getPublicAccessCidrs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfigRequest == false)
            return false;
        VpcConfigRequest other = (VpcConfigRequest) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getEndpointPublicAccess() == null ^ this.getEndpointPublicAccess() == null)
            return false;
        if (other.getEndpointPublicAccess() != null && other.getEndpointPublicAccess().equals(this.getEndpointPublicAccess()) == false)
            return false;
        if (other.getEndpointPrivateAccess() == null ^ this.getEndpointPrivateAccess() == null)
            return false;
        if (other.getEndpointPrivateAccess() != null && other.getEndpointPrivateAccess().equals(this.getEndpointPrivateAccess()) == false)
            return false;
        if (other.getPublicAccessCidrs() == null ^ this.getPublicAccessCidrs() == null)
            return false;
        if (other.getPublicAccessCidrs() != null && other.getPublicAccessCidrs().equals(this.getPublicAccessCidrs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getEndpointPublicAccess() == null) ? 0 : getEndpointPublicAccess().hashCode());
        hashCode = prime * hashCode + ((getEndpointPrivateAccess() == null) ? 0 : getEndpointPrivateAccess().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessCidrs() == null) ? 0 : getPublicAccessCidrs().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfigRequest clone() {
        try {
            return (VpcConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.VpcConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
