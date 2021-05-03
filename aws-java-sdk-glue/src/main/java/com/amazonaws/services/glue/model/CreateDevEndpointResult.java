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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDevEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     */
    private String yarnEndpointAddress;
    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     */
    private Integer zeppelinRemoteSparkInterpreterPort;
    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or
     * G.2X.
     * </p>
     */
    private String workerType;
    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     */
    private String glueVersion;
    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be loaded in your <code>DevEndpoint</code>.
     * </p>
     */
    private String extraPythonLibsS3Path;
    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that will be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     */
    private String extraJarsS3Path;
    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used with this <code>DevEndpoint</code>.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     */
    private java.util.Map<String, String> arguments;

    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param endpointName
     *        The name assigned to the new <code>DevEndpoint</code>.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The name assigned to the new <code>DevEndpoint</code>.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param endpointName
     *        The name assigned to the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param status
     *        The current status of the new <code>DevEndpoint</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The current status of the new <code>DevEndpoint</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param status
     *        The current status of the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The security groups assigned to the new <code>DevEndpoint</code>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups assigned to the new <code>DevEndpoint</code>.
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
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups assigned to the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withSecurityGroupIds(String... securityGroupIds) {
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
     * The security groups assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups assigned to the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID assigned to the new <code>DevEndpoint</code>.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The subnet ID assigned to the new <code>DevEndpoint</code>.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID assigned to the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role assigned to the new <code>DevEndpoint</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role assigned to the new <code>DevEndpoint</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role assigned to the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param yarnEndpointAddress
     *        The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     */

    public void setYarnEndpointAddress(String yarnEndpointAddress) {
        this.yarnEndpointAddress = yarnEndpointAddress;
    }

    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     */

    public String getYarnEndpointAddress() {
        return this.yarnEndpointAddress;
    }

    /**
     * <p>
     * The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param yarnEndpointAddress
     *        The address of the YARN endpoint used by this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withYarnEndpointAddress(String yarnEndpointAddress) {
        setYarnEndpointAddress(yarnEndpointAddress);
        return this;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     * 
     * @param zeppelinRemoteSparkInterpreterPort
     *        The Apache Zeppelin port for the remote Apache Spark interpreter.
     */

    public void setZeppelinRemoteSparkInterpreterPort(Integer zeppelinRemoteSparkInterpreterPort) {
        this.zeppelinRemoteSparkInterpreterPort = zeppelinRemoteSparkInterpreterPort;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     * 
     * @return The Apache Zeppelin port for the remote Apache Spark interpreter.
     */

    public Integer getZeppelinRemoteSparkInterpreterPort() {
        return this.zeppelinRemoteSparkInterpreterPort;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     * 
     * @param zeppelinRemoteSparkInterpreterPort
     *        The Apache Zeppelin port for the remote Apache Spark interpreter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withZeppelinRemoteSparkInterpreterPort(Integer zeppelinRemoteSparkInterpreterPort) {
        setZeppelinRemoteSparkInterpreterPort(zeppelinRemoteSparkInterpreterPort);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
     * </p>
     * 
     * @return The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or
     * G.2X.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. May be a value of Standard,
     *        G.1X, or G.2X.
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or
     * G.2X.
     * </p>
     * 
     * @return The type of predefined worker that is allocated to the development endpoint. May be a value of Standard,
     *         G.1X, or G.2X.
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or
     * G.2X.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. May be a value of Standard,
     *        G.1X, or G.2X.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateDevEndpointResult withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or
     * G.2X.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. May be a value of Standard,
     *        G.1X, or G.2X.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateDevEndpointResult withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * 
     * @param glueVersion
     *        Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     *        indicates the version supported for running your ETL scripts on development endpoints.
     */

    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * 
     * @return Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python
     *         version indicates the version supported for running your ETL scripts on development endpoints.
     */

    public String getGlueVersion() {
        return this.glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * 
     * @param glueVersion
     *        Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     *        indicates the version supported for running your ETL scripts on development endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withGlueVersion(String glueVersion) {
        setGlueVersion(glueVersion);
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * 
     * @return The number of workers of a defined <code>workerType</code> that are allocated to the development
     *         endpoint.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     * 
     * @param availabilityZone
     *        The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     * 
     * @return The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     * 
     * @param availabilityZone
     *        The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be loaded in your <code>DevEndpoint</code>.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        The paths to one or more Python libraries in an S3 bucket that will be loaded in your
     *        <code>DevEndpoint</code>.
     */

    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be loaded in your <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The paths to one or more Python libraries in an S3 bucket that will be loaded in your
     *         <code>DevEndpoint</code>.
     */

    public String getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an S3 bucket that will be loaded in your <code>DevEndpoint</code>.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        The paths to one or more Python libraries in an S3 bucket that will be loaded in your
     *        <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        setExtraPythonLibsS3Path(extraPythonLibsS3Path);
        return this;
    }

    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that will be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java <code>.jar</code> files in an S3 bucket that will be loaded in your
     *        <code>DevEndpoint</code>.
     */

    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that will be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * 
     * @return Path to one or more Java <code>.jar</code> files in an S3 bucket that will be loaded in your
     *         <code>DevEndpoint</code>.
     */

    public String getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java <code>.jar</code> files in an S3 bucket that will be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java <code>.jar</code> files in an S3 bucket that will be loaded in your
     *        <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withExtraJarsS3Path(String extraJarsS3Path) {
        setExtraJarsS3Path(extraJarsS3Path);
        return this;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason for a current failure in this <code>DevEndpoint</code>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The reason for a current failure in this <code>DevEndpoint</code>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason for a current failure in this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure being used with this <code>DevEndpoint</code>
     *        .
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The name of the <code>SecurityConfiguration</code> structure being used with this
     *         <code>DevEndpoint</code>.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure being used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure being used with this <code>DevEndpoint</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The point in time at which this <code>DevEndpoint</code> was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     * 
     * @return The point in time at which this <code>DevEndpoint</code> was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The point in time at which this <code>DevEndpoint</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @return The map of arguments used to configure this <code>DevEndpoint</code>.</p>
     *         <p>
     *         Valid arguments are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"--enable-glue-datacatalog": ""</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "3"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "2"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *         parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *         are provided, the version defaults to Python 2.
     */

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param arguments
     *        The map of arguments used to configure this <code>DevEndpoint</code>.</p>
     *        <p>
     *        Valid arguments are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"--enable-glue-datacatalog": ""</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "3"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "2"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     */

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * The map of arguments used to configure this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param arguments
     *        The map of arguments used to configure this <code>DevEndpoint</code>.</p>
     *        <p>
     *        Valid arguments are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"--enable-glue-datacatalog": ""</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "3"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "2"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    /**
     * Add a single Arguments entry
     *
     * @see CreateDevEndpointResult#withArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointResult clearArgumentsEntries() {
        this.arguments = null;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getYarnEndpointAddress() != null)
            sb.append("YarnEndpointAddress: ").append(getYarnEndpointAddress()).append(",");
        if (getZeppelinRemoteSparkInterpreterPort() != null)
            sb.append("ZeppelinRemoteSparkInterpreterPort: ").append(getZeppelinRemoteSparkInterpreterPort()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: ").append(getGlueVersion()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: ").append(getExtraPythonLibsS3Path()).append(",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: ").append(getExtraJarsS3Path()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append(getArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDevEndpointResult == false)
            return false;
        CreateDevEndpointResult other = (CreateDevEndpointResult) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getYarnEndpointAddress() == null ^ this.getYarnEndpointAddress() == null)
            return false;
        if (other.getYarnEndpointAddress() != null && other.getYarnEndpointAddress().equals(this.getYarnEndpointAddress()) == false)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() == null ^ this.getZeppelinRemoteSparkInterpreterPort() == null)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() != null
                && other.getZeppelinRemoteSparkInterpreterPort().equals(this.getZeppelinRemoteSparkInterpreterPort()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getYarnEndpointAddress() == null) ? 0 : getYarnEndpointAddress().hashCode());
        hashCode = prime * hashCode + ((getZeppelinRemoteSparkInterpreterPort() == null) ? 0 : getZeppelinRemoteSparkInterpreterPort().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        return hashCode;
    }

    @Override
    public CreateDevEndpointResult clone() {
        try {
            return (CreateDevEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
