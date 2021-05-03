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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateNodegroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNodegroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to create the node group in.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The unique name to give your node group.
     * </p>
     */
    private String nodegroupName;
    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is created for your node group.
     * </p>
     */
    private NodegroupScalingConfig scalingConfig;
    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you specify
     * <code>launchTemplate</code>, then don't specify <code>diskSize</code>, or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     */
    private Integer diskSize;
    /**
     * <p>
     * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the
     * tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     * <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify <code>launchTemplate</code>,
     * then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     * <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     * <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify <code>launchTemplate</code>,
     * then you can specify zero or one instance type in your launch template <i>or</i> you can specify 0-20 instance
     * types for <code>instanceTypes</code>. If however, you specify an instance type in your launch template <i>and</i>
     * specify any <code>instanceTypes</code>, the node group deployment will fail. If you don't specify an instance
     * type in a launch template or for <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If
     * you specify <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     * <code>instanceTypes</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     * >Managed node group capacity types</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private java.util.List<String> instanceTypes;
    /**
     * <p>
     * The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type. Non-GPU
     * instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the <code>AL2_ARM_64</code>
     * AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you specify <code>launchTemplate</code>,
     * and your launch template uses a custom AMI, then don't specify <code>amiType</code>, or the node group deployment
     * will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     */
    private String amiType;
    /**
     * <p>
     * The remote access (SSH) configuration to use with your node group. If you specify <code>launchTemplate</code>,
     * then don't specify <code>remoteAccess</code>, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     */
    private RemoteAccessConfig remoteAccess;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker node
     * <code>kubelet</code> daemon makes calls to AWS APIs on your behalf. Nodes receive permissions for these API calls
     * through an IAM instance profile and associated policies. Before you can launch nodes and register them into a
     * cluster, you must create an IAM role for those nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS node IAM role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>. If you specify <code>launchTemplate</code>, then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
     * <code>IamInstanceProfile</code> </a> in your launch template, or the node group deployment will fail. For more
     * information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     */
    private String nodeRole;
    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     * </p>
     */
    private java.util.Map<String, String> labels;
    /**
     * <p>
     * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * An object representing a node group's launch template specification. If specified, then do not specify
     * <code>instanceTypes</code>, <code>diskSize</code>, or <code>remoteAccess</code> and make sure that the launch
     * template meets the requirements in <code>launchTemplateSpecification</code>.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * The capacity type for your node group.
     * </p>
     */
    private String capacityType;
    /**
     * <p>
     * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used,
     * and this is the only accepted specified value. If you specify <code>launchTemplate</code>, and your launch
     * template uses a custom AMI, then don't specify <code>version</code>, or the node group deployment will fail. For
     * more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest available AMI
     * version for the node group's current Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS optimized Amazon
     * Linux 2 AMI versions</a> in the <i>Amazon EKS User Guide</i>. If you specify <code>launchTemplate</code>, and
     * your launch template uses a custom AMI, then don't specify <code>releaseVersion</code>, or the node group
     * deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     */
    private String releaseVersion;

    /**
     * <p>
     * The name of the cluster to create the node group in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to create the node group in.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to create the node group in.
     * </p>
     * 
     * @return The name of the cluster to create the node group in.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to create the node group in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to create the node group in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The unique name to give your node group.
     * </p>
     * 
     * @param nodegroupName
     *        The unique name to give your node group.
     */

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The unique name to give your node group.
     * </p>
     * 
     * @return The unique name to give your node group.
     */

    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The unique name to give your node group.
     * </p>
     * 
     * @param nodegroupName
     *        The unique name to give your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is created for your node group.
     * </p>
     * 
     * @param scalingConfig
     *        The scaling configuration details for the Auto Scaling group that is created for your node group.
     */

    public void setScalingConfig(NodegroupScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is created for your node group.
     * </p>
     * 
     * @return The scaling configuration details for the Auto Scaling group that is created for your node group.
     */

    public NodegroupScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is created for your node group.
     * </p>
     * 
     * @param scalingConfig
     *        The scaling configuration details for the Auto Scaling group that is created for your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withScalingConfig(NodegroupScalingConfig scalingConfig) {
        setScalingConfig(scalingConfig);
        return this;
    }

    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you specify
     * <code>launchTemplate</code>, then don't specify <code>diskSize</code>, or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param diskSize
     *        The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you
     *        specify <code>launchTemplate</code>, then don't specify <code>diskSize</code>, or the node group
     *        deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     */

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you specify
     * <code>launchTemplate</code>, then don't specify <code>diskSize</code>, or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @return The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you
     *         specify <code>launchTemplate</code>, then don't specify <code>diskSize</code>, or the node group
     *         deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the Amazon EKS User Guide.
     */

    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you specify
     * <code>launchTemplate</code>, then don't specify <code>diskSize</code>, or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param diskSize
     *        The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB. If you
     *        specify <code>launchTemplate</code>, then don't specify <code>diskSize</code>, or the node group
     *        deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withDiskSize(Integer diskSize) {
        setDiskSize(diskSize);
        return this;
    }

    /**
     * <p>
     * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the
     * tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     * <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify <code>launchTemplate</code>,
     * then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     * <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @return The subnets to use for the Auto Scaling group that is created for your node group. These subnets must
     *         have the tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>,
     *         where <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify
     *         <code>launchTemplate</code>, then don't specify <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     *         <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more
     *         information about using launch templates with Amazon EKS, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the Amazon EKS User Guide.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the
     * tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     * <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify <code>launchTemplate</code>,
     * then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     * <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param subnets
     *        The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have
     *        the tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     *        <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify
     *        <code>launchTemplate</code>, then don't specify <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     *        <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more
     *        information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the
     * tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     * <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify <code>launchTemplate</code>,
     * then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     * <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have
     *        the tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     *        <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify
     *        <code>launchTemplate</code>, then don't specify <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     *        <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more
     *        information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the
     * tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     * <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify <code>launchTemplate</code>,
     * then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     * <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param subnets
     *        The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have
     *        the tag key <code>kubernetes.io/cluster/CLUSTER_NAME</code> with a value of <code>shared</code>, where
     *        <code>CLUSTER_NAME</code> is replaced with the name of your cluster. If you specify
     *        <code>launchTemplate</code>, then don't specify <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html">
     *        <code>SubnetId</code> </a> in your launch template, or the node group deployment will fail. For more
     *        information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     * <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify <code>launchTemplate</code>,
     * then you can specify zero or one instance type in your launch template <i>or</i> you can specify 0-20 instance
     * types for <code>instanceTypes</code>. If however, you specify an instance type in your launch template <i>and</i>
     * specify any <code>instanceTypes</code>, the node group deployment will fail. If you don't specify an instance
     * type in a launch template or for <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If
     * you specify <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     * <code>instanceTypes</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     * >Managed node group capacity types</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     *         <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify
     *         <code>launchTemplate</code>, then you can specify zero or one instance type in your launch template
     *         <i>or</i> you can specify 0-20 instance types for <code>instanceTypes</code>. If however, you specify an
     *         instance type in your launch template <i>and</i> specify any <code>instanceTypes</code>, the node group
     *         deployment will fail. If you don't specify an instance type in a launch template or for
     *         <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If you specify
     *         <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     *         <code>instanceTypes</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     *         >Managed node group capacity types</a> and <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the <i>Amazon EKS User Guide</i>.
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     * <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify <code>launchTemplate</code>,
     * then you can specify zero or one instance type in your launch template <i>or</i> you can specify 0-20 instance
     * types for <code>instanceTypes</code>. If however, you specify an instance type in your launch template <i>and</i>
     * specify any <code>instanceTypes</code>, the node group deployment will fail. If you don't specify an instance
     * type in a launch template or for <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If
     * you specify <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     * <code>instanceTypes</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     * >Managed node group capacity types</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param instanceTypes
     *        Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     *        <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify
     *        <code>launchTemplate</code>, then you can specify zero or one instance type in your launch template
     *        <i>or</i> you can specify 0-20 instance types for <code>instanceTypes</code>. If however, you specify an
     *        instance type in your launch template <i>and</i> specify any <code>instanceTypes</code>, the node group
     *        deployment will fail. If you don't specify an instance type in a launch template or for
     *        <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If you specify
     *        <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     *        <code>instanceTypes</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     *        >Managed node group capacity types</a> and <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the <i>Amazon EKS User Guide</i>.
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new java.util.ArrayList<String>(instanceTypes);
    }

    /**
     * <p>
     * Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     * <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify <code>launchTemplate</code>,
     * then you can specify zero or one instance type in your launch template <i>or</i> you can specify 0-20 instance
     * types for <code>instanceTypes</code>. If however, you specify an instance type in your launch template <i>and</i>
     * specify any <code>instanceTypes</code>, the node group deployment will fail. If you don't specify an instance
     * type in a launch template or for <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If
     * you specify <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     * <code>instanceTypes</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     * >Managed node group capacity types</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     *        <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify
     *        <code>launchTemplate</code>, then you can specify zero or one instance type in your launch template
     *        <i>or</i> you can specify 0-20 instance types for <code>instanceTypes</code>. If however, you specify an
     *        instance type in your launch template <i>and</i> specify any <code>instanceTypes</code>, the node group
     *        deployment will fail. If you don't specify an instance type in a launch template or for
     *        <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If you specify
     *        <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     *        <code>instanceTypes</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     *        >Managed node group capacity types</a> and <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     * <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify <code>launchTemplate</code>,
     * then you can specify zero or one instance type in your launch template <i>or</i> you can specify 0-20 instance
     * types for <code>instanceTypes</code>. If however, you specify an instance type in your launch template <i>and</i>
     * specify any <code>instanceTypes</code>, the node group deployment will fail. If you don't specify an instance
     * type in a launch template or for <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If
     * you specify <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     * <code>instanceTypes</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     * >Managed node group capacity types</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param instanceTypes
     *        Specify the instance types for a node group. If you specify a GPU instance type, be sure to specify
     *        <code>AL2_x86_64_GPU</code> with the <code>amiType</code> parameter. If you specify
     *        <code>launchTemplate</code>, then you can specify zero or one instance type in your launch template
     *        <i>or</i> you can specify 0-20 instance types for <code>instanceTypes</code>. If however, you specify an
     *        instance type in your launch template <i>and</i> specify any <code>instanceTypes</code>, the node group
     *        deployment will fail. If you don't specify an instance type in a launch template or for
     *        <code>instanceTypes</code>, then <code>t3.medium</code> is used, by default. If you specify
     *        <code>Spot</code> for <code>capacityType</code>, then we recommend specifying multiple values for
     *        <code>instanceTypes</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types"
     *        >Managed node group capacity types</a> and <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type. Non-GPU
     * instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the <code>AL2_ARM_64</code>
     * AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you specify <code>launchTemplate</code>,
     * and your launch template uses a custom AMI, then don't specify <code>amiType</code>, or the node group deployment
     * will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param amiType
     *        The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type.
     *        Non-GPU instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the
     *        <code>AL2_ARM_64</code> AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you
     *        specify <code>launchTemplate</code>, and your launch template uses a custom AMI, then don't specify
     *        <code>amiType</code>, or the node group deployment will fail. For more information about using launch
     *        templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @see AMITypes
     */

    public void setAmiType(String amiType) {
        this.amiType = amiType;
    }

    /**
     * <p>
     * The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type. Non-GPU
     * instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the <code>AL2_ARM_64</code>
     * AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you specify <code>launchTemplate</code>,
     * and your launch template uses a custom AMI, then don't specify <code>amiType</code>, or the node group deployment
     * will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @return The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type.
     *         Non-GPU instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the
     *         <code>AL2_ARM_64</code> AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you
     *         specify <code>launchTemplate</code>, and your launch template uses a custom AMI, then don't specify
     *         <code>amiType</code>, or the node group deployment will fail. For more information about using launch
     *         templates with Amazon EKS, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the Amazon EKS User Guide.
     * @see AMITypes
     */

    public String getAmiType() {
        return this.amiType;
    }

    /**
     * <p>
     * The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type. Non-GPU
     * instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the <code>AL2_ARM_64</code>
     * AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you specify <code>launchTemplate</code>,
     * and your launch template uses a custom AMI, then don't specify <code>amiType</code>, or the node group deployment
     * will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param amiType
     *        The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type.
     *        Non-GPU instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the
     *        <code>AL2_ARM_64</code> AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you
     *        specify <code>launchTemplate</code>, and your launch template uses a custom AMI, then don't specify
     *        <code>amiType</code>, or the node group deployment will fail. For more information about using launch
     *        templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AMITypes
     */

    public CreateNodegroupRequest withAmiType(String amiType) {
        setAmiType(amiType);
        return this;
    }

    /**
     * <p>
     * The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type. Non-GPU
     * instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the <code>AL2_ARM_64</code>
     * AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you specify <code>launchTemplate</code>,
     * and your launch template uses a custom AMI, then don't specify <code>amiType</code>, or the node group deployment
     * will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param amiType
     *        The AMI type for your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI type.
     *        Non-GPU instances should use the <code>AL2_x86_64</code> AMI type. Arm instances should use the
     *        <code>AL2_ARM_64</code> AMI type. All types use the Amazon EKS optimized Amazon Linux 2 AMI. If you
     *        specify <code>launchTemplate</code>, and your launch template uses a custom AMI, then don't specify
     *        <code>amiType</code>, or the node group deployment will fail. For more information about using launch
     *        templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AMITypes
     */

    public CreateNodegroupRequest withAmiType(AMITypes amiType) {
        this.amiType = amiType.toString();
        return this;
    }

    /**
     * <p>
     * The remote access (SSH) configuration to use with your node group. If you specify <code>launchTemplate</code>,
     * then don't specify <code>remoteAccess</code>, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param remoteAccess
     *        The remote access (SSH) configuration to use with your node group. If you specify
     *        <code>launchTemplate</code>, then don't specify <code>remoteAccess</code>, or the node group deployment
     *        will fail. For more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     */

    public void setRemoteAccess(RemoteAccessConfig remoteAccess) {
        this.remoteAccess = remoteAccess;
    }

    /**
     * <p>
     * The remote access (SSH) configuration to use with your node group. If you specify <code>launchTemplate</code>,
     * then don't specify <code>remoteAccess</code>, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @return The remote access (SSH) configuration to use with your node group. If you specify
     *         <code>launchTemplate</code>, then don't specify <code>remoteAccess</code>, or the node group deployment
     *         will fail. For more information about using launch templates with Amazon EKS, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the Amazon EKS User Guide.
     */

    public RemoteAccessConfig getRemoteAccess() {
        return this.remoteAccess;
    }

    /**
     * <p>
     * The remote access (SSH) configuration to use with your node group. If you specify <code>launchTemplate</code>,
     * then don't specify <code>remoteAccess</code>, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param remoteAccess
     *        The remote access (SSH) configuration to use with your node group. If you specify
     *        <code>launchTemplate</code>, then don't specify <code>remoteAccess</code>, or the node group deployment
     *        will fail. For more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withRemoteAccess(RemoteAccessConfig remoteAccess) {
        setRemoteAccess(remoteAccess);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker node
     * <code>kubelet</code> daemon makes calls to AWS APIs on your behalf. Nodes receive permissions for these API calls
     * through an IAM instance profile and associated policies. Before you can launch nodes and register them into a
     * cluster, you must create an IAM role for those nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS node IAM role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>. If you specify <code>launchTemplate</code>, then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
     * <code>IamInstanceProfile</code> </a> in your launch template, or the node group deployment will fail. For more
     * information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param nodeRole
     *        The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker
     *        node <code>kubelet</code> daemon makes calls to AWS APIs on your behalf. Nodes receive permissions for
     *        these API calls through an IAM instance profile and associated policies. Before you can launch nodes and
     *        register them into a cluster, you must create an IAM role for those nodes to use when they are launched.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS node IAM
     *        role</a> in the <i> <i>Amazon EKS User Guide</i> </i>. If you specify <code>launchTemplate</code>, then
     *        don't specify <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
     *        <code>IamInstanceProfile</code> </a> in your launch template, or the node group deployment will fail. For
     *        more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     */

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker node
     * <code>kubelet</code> daemon makes calls to AWS APIs on your behalf. Nodes receive permissions for these API calls
     * through an IAM instance profile and associated policies. Before you can launch nodes and register them into a
     * cluster, you must create an IAM role for those nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS node IAM role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>. If you specify <code>launchTemplate</code>, then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
     * <code>IamInstanceProfile</code> </a> in your launch template, or the node group deployment will fail. For more
     * information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker
     *         node <code>kubelet</code> daemon makes calls to AWS APIs on your behalf. Nodes receive permissions for
     *         these API calls through an IAM instance profile and associated policies. Before you can launch nodes and
     *         register them into a cluster, you must create an IAM role for those nodes to use when they are launched.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS node IAM
     *         role</a> in the <i> <i>Amazon EKS User Guide</i> </i>. If you specify <code>launchTemplate</code>, then
     *         don't specify <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
     *         <code>IamInstanceProfile</code> </a> in your launch template, or the node group deployment will fail. For
     *         more information about using launch templates with Amazon EKS, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the Amazon EKS User Guide.
     */

    public String getNodeRole() {
        return this.nodeRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker node
     * <code>kubelet</code> daemon makes calls to AWS APIs on your behalf. Nodes receive permissions for these API calls
     * through an IAM instance profile and associated policies. Before you can launch nodes and register them into a
     * cluster, you must create an IAM role for those nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS node IAM role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>. If you specify <code>launchTemplate</code>, then don't specify <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
     * <code>IamInstanceProfile</code> </a> in your launch template, or the node group deployment will fail. For more
     * information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param nodeRole
     *        The Amazon Resource Name (ARN) of the IAM role to associate with your node group. The Amazon EKS worker
     *        node <code>kubelet</code> daemon makes calls to AWS APIs on your behalf. Nodes receive permissions for
     *        these API calls through an IAM instance profile and associated policies. Before you can launch nodes and
     *        register them into a cluster, you must create an IAM role for those nodes to use when they are launched.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS node IAM
     *        role</a> in the <i> <i>Amazon EKS User Guide</i> </i>. If you specify <code>launchTemplate</code>, then
     *        don't specify <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
     *        <code>IamInstanceProfile</code> </a> in your launch template, or the node group deployment will fail. For
     *        more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withNodeRole(String nodeRole) {
        setNodeRole(nodeRole);
        return this;
    }

    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     * </p>
     * 
     * @return The Kubernetes labels to be applied to the nodes in the node group when they are created.
     */

    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     * </p>
     * 
     * @param labels
     *        The Kubernetes labels to be applied to the nodes in the node group when they are created.
     */

    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * <p>
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     * </p>
     * 
     * @param labels
     *        The Kubernetes labels to be applied to the nodes in the node group when they are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withLabels(java.util.Map<String, String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * Add a single Labels entry
     *
     * @see CreateNodegroupRequest#withLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest addLabelsEntry(String key, String value) {
        if (null == this.labels) {
            this.labels = new java.util.HashMap<String, String>();
        }
        if (this.labels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.labels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Labels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest clearLabelsEntries() {
        this.labels = null;
        return this;
    }

    /**
     * <p>
     * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     * 
     * @return The metadata to apply to the node group to assist with categorization and organization. Each tag consists
     *         of a key and an optional value, both of which you define. Node group tags do not propagate to any other
     *         resources associated with the node group, such as the Amazon EC2 instances or subnets.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the node group to assist with categorization and organization. Each tag consists
     *        of a key and an optional value, both of which you define. Node group tags do not propagate to any other
     *        resources associated with the node group, such as the Amazon EC2 instances or subnets.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the node group to assist with categorization and organization. Each tag consists
     *        of a key and an optional value, both of which you define. Node group tags do not propagate to any other
     *        resources associated with the node group, such as the Amazon EC2 instances or subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateNodegroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * An object representing a node group's launch template specification. If specified, then do not specify
     * <code>instanceTypes</code>, <code>diskSize</code>, or <code>remoteAccess</code> and make sure that the launch
     * template meets the requirements in <code>launchTemplateSpecification</code>.
     * </p>
     * 
     * @param launchTemplate
     *        An object representing a node group's launch template specification. If specified, then do not specify
     *        <code>instanceTypes</code>, <code>diskSize</code>, or <code>remoteAccess</code> and make sure that the
     *        launch template meets the requirements in <code>launchTemplateSpecification</code>.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * An object representing a node group's launch template specification. If specified, then do not specify
     * <code>instanceTypes</code>, <code>diskSize</code>, or <code>remoteAccess</code> and make sure that the launch
     * template meets the requirements in <code>launchTemplateSpecification</code>.
     * </p>
     * 
     * @return An object representing a node group's launch template specification. If specified, then do not specify
     *         <code>instanceTypes</code>, <code>diskSize</code>, or <code>remoteAccess</code> and make sure that the
     *         launch template meets the requirements in <code>launchTemplateSpecification</code>.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * An object representing a node group's launch template specification. If specified, then do not specify
     * <code>instanceTypes</code>, <code>diskSize</code>, or <code>remoteAccess</code> and make sure that the launch
     * template meets the requirements in <code>launchTemplateSpecification</code>.
     * </p>
     * 
     * @param launchTemplate
     *        An object representing a node group's launch template specification. If specified, then do not specify
     *        <code>instanceTypes</code>, <code>diskSize</code>, or <code>remoteAccess</code> and make sure that the
     *        launch template meets the requirements in <code>launchTemplateSpecification</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The capacity type for your node group.
     * </p>
     * 
     * @param capacityType
     *        The capacity type for your node group.
     * @see CapacityTypes
     */

    public void setCapacityType(String capacityType) {
        this.capacityType = capacityType;
    }

    /**
     * <p>
     * The capacity type for your node group.
     * </p>
     * 
     * @return The capacity type for your node group.
     * @see CapacityTypes
     */

    public String getCapacityType() {
        return this.capacityType;
    }

    /**
     * <p>
     * The capacity type for your node group.
     * </p>
     * 
     * @param capacityType
     *        The capacity type for your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTypes
     */

    public CreateNodegroupRequest withCapacityType(String capacityType) {
        setCapacityType(capacityType);
        return this;
    }

    /**
     * <p>
     * The capacity type for your node group.
     * </p>
     * 
     * @param capacityType
     *        The capacity type for your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTypes
     */

    public CreateNodegroupRequest withCapacityType(CapacityTypes capacityType) {
        this.capacityType = capacityType.toString();
        return this;
    }

    /**
     * <p>
     * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used,
     * and this is the only accepted specified value. If you specify <code>launchTemplate</code>, and your launch
     * template uses a custom AMI, then don't specify <code>version</code>, or the node group deployment will fail. For
     * more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param version
     *        The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is
     *        used, and this is the only accepted specified value. If you specify <code>launchTemplate</code>, and your
     *        launch template uses a custom AMI, then don't specify <code>version</code>, or the node group deployment
     *        will fail. For more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used,
     * and this is the only accepted specified value. If you specify <code>launchTemplate</code>, and your launch
     * template uses a custom AMI, then don't specify <code>version</code>, or the node group deployment will fail. For
     * more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @return The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster
     *         is used, and this is the only accepted specified value. If you specify <code>launchTemplate</code>, and
     *         your launch template uses a custom AMI, then don't specify <code>version</code>, or the node group
     *         deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the Amazon EKS User Guide.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used,
     * and this is the only accepted specified value. If you specify <code>launchTemplate</code>, and your launch
     * template uses a custom AMI, then don't specify <code>version</code>, or the node group deployment will fail. For
     * more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param version
     *        The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is
     *        used, and this is the only accepted specified value. If you specify <code>launchTemplate</code>, and your
     *        launch template uses a custom AMI, then don't specify <code>version</code>, or the node group deployment
     *        will fail. For more information about using launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest available AMI
     * version for the node group's current Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS optimized Amazon
     * Linux 2 AMI versions</a> in the <i>Amazon EKS User Guide</i>. If you specify <code>launchTemplate</code>, and
     * your launch template uses a custom AMI, then don't specify <code>releaseVersion</code>, or the node group
     * deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param releaseVersion
     *        The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest
     *        available AMI version for the node group's current Kubernetes version is used. For more information, see
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS
     *        optimized Amazon Linux 2 AMI versions</a> in the <i>Amazon EKS User Guide</i>. If you specify
     *        <code>launchTemplate</code>, and your launch template uses a custom AMI, then don't specify
     *        <code>releaseVersion</code>, or the node group deployment will fail. For more information about using
     *        launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     */

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    /**
     * <p>
     * The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest available AMI
     * version for the node group's current Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS optimized Amazon
     * Linux 2 AMI versions</a> in the <i>Amazon EKS User Guide</i>. If you specify <code>launchTemplate</code>, and
     * your launch template uses a custom AMI, then don't specify <code>releaseVersion</code>, or the node group
     * deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @return The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest
     *         available AMI version for the node group's current Kubernetes version is used. For more information, see
     *         <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS
     *         optimized Amazon Linux 2 AMI versions</a> in the <i>Amazon EKS User Guide</i>. If you specify
     *         <code>launchTemplate</code>, and your launch template uses a custom AMI, then don't specify
     *         <code>releaseVersion</code>, or the node group deployment will fail. For more information about using
     *         launch templates with Amazon EKS, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *         in the Amazon EKS User Guide.
     */

    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * <p>
     * The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest available AMI
     * version for the node group's current Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS optimized Amazon
     * Linux 2 AMI versions</a> in the <i>Amazon EKS User Guide</i>. If you specify <code>launchTemplate</code>, and
     * your launch template uses a custom AMI, then don't specify <code>releaseVersion</code>, or the node group
     * deployment will fail. For more information about using launch templates with Amazon EKS, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
     * Amazon EKS User Guide.
     * </p>
     * 
     * @param releaseVersion
     *        The AMI version of the Amazon EKS optimized AMI to use with your node group. By default, the latest
     *        available AMI version for the node group's current Kubernetes version is used. For more information, see
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS
     *        optimized Amazon Linux 2 AMI versions</a> in the <i>Amazon EKS User Guide</i>. If you specify
     *        <code>launchTemplate</code>, and your launch template uses a custom AMI, then don't specify
     *        <code>releaseVersion</code>, or the node group deployment will fail. For more information about using
     *        launch templates with Amazon EKS, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a>
     *        in the Amazon EKS User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodegroupRequest withReleaseVersion(String releaseVersion) {
        setReleaseVersion(releaseVersion);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getNodegroupName() != null)
            sb.append("NodegroupName: ").append(getNodegroupName()).append(",");
        if (getScalingConfig() != null)
            sb.append("ScalingConfig: ").append(getScalingConfig()).append(",");
        if (getDiskSize() != null)
            sb.append("DiskSize: ").append(getDiskSize()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getAmiType() != null)
            sb.append("AmiType: ").append(getAmiType()).append(",");
        if (getRemoteAccess() != null)
            sb.append("RemoteAccess: ").append(getRemoteAccess()).append(",");
        if (getNodeRole() != null)
            sb.append("NodeRole: ").append(getNodeRole()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getCapacityType() != null)
            sb.append("CapacityType: ").append(getCapacityType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getReleaseVersion() != null)
            sb.append("ReleaseVersion: ").append(getReleaseVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNodegroupRequest == false)
            return false;
        CreateNodegroupRequest other = (CreateNodegroupRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNodegroupName() == null ^ this.getNodegroupName() == null)
            return false;
        if (other.getNodegroupName() != null && other.getNodegroupName().equals(this.getNodegroupName()) == false)
            return false;
        if (other.getScalingConfig() == null ^ this.getScalingConfig() == null)
            return false;
        if (other.getScalingConfig() != null && other.getScalingConfig().equals(this.getScalingConfig()) == false)
            return false;
        if (other.getDiskSize() == null ^ this.getDiskSize() == null)
            return false;
        if (other.getDiskSize() != null && other.getDiskSize().equals(this.getDiskSize()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getAmiType() == null ^ this.getAmiType() == null)
            return false;
        if (other.getAmiType() != null && other.getAmiType().equals(this.getAmiType()) == false)
            return false;
        if (other.getRemoteAccess() == null ^ this.getRemoteAccess() == null)
            return false;
        if (other.getRemoteAccess() != null && other.getRemoteAccess().equals(this.getRemoteAccess()) == false)
            return false;
        if (other.getNodeRole() == null ^ this.getNodeRole() == null)
            return false;
        if (other.getNodeRole() != null && other.getNodeRole().equals(this.getNodeRole()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getCapacityType() == null ^ this.getCapacityType() == null)
            return false;
        if (other.getCapacityType() != null && other.getCapacityType().equals(this.getCapacityType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getReleaseVersion() == null ^ this.getReleaseVersion() == null)
            return false;
        if (other.getReleaseVersion() != null && other.getReleaseVersion().equals(this.getReleaseVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodegroupName() == null) ? 0 : getNodegroupName().hashCode());
        hashCode = prime * hashCode + ((getScalingConfig() == null) ? 0 : getScalingConfig().hashCode());
        hashCode = prime * hashCode + ((getDiskSize() == null) ? 0 : getDiskSize().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getAmiType() == null) ? 0 : getAmiType().hashCode());
        hashCode = prime * hashCode + ((getRemoteAccess() == null) ? 0 : getRemoteAccess().hashCode());
        hashCode = prime * hashCode + ((getNodeRole() == null) ? 0 : getNodeRole().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getCapacityType() == null) ? 0 : getCapacityType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getReleaseVersion() == null) ? 0 : getReleaseVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateNodegroupRequest clone() {
        return (CreateNodegroupRequest) super.clone();
    }

}
