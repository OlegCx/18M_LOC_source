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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDevEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to be assigned to the new <code>DevEndpoint</code>.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The IAM role for the <code>DevEndpoint</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID for the new <code>DevEndpoint</code> to use.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * A list of public keys to be used by the development endpoints for authentication. The use of this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     */
    private java.util.List<String> publicKeys;
    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this <code>DevEndpoint</code>.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     */
    private String workerType;
    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     */
    private String glueVersion;
    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet supported.
     * </p>
     * </note>
     */
    private String extraPythonLibsS3Path;
    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     */
    private String extraJarsS3Path;
    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in
     * AWS Glue</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.Map<String, String> arguments;

    /**
     * <p>
     * The name to be assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param endpointName
     *        The name to be assigned to the new <code>DevEndpoint</code>.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name to be assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The name to be assigned to the new <code>DevEndpoint</code>.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name to be assigned to the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param endpointName
     *        The name to be assigned to the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The IAM role for the <code>DevEndpoint</code>.
     * </p>
     * 
     * @param roleArn
     *        The IAM role for the <code>DevEndpoint</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role for the <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The IAM role for the <code>DevEndpoint</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role for the <code>DevEndpoint</code>.
     * </p>
     * 
     * @param roleArn
     *        The IAM role for the <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @return Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
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
     * Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID for the new <code>DevEndpoint</code> to use.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for the new <code>DevEndpoint</code> to use.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID for the new <code>DevEndpoint</code> to use.
     * </p>
     * 
     * @return The subnet ID for the new <code>DevEndpoint</code> to use.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID for the new <code>DevEndpoint</code> to use.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for the new <code>DevEndpoint</code> to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided
     *        for backward compatibility because the recommended attribute to use is public keys.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     * 
     * @return The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided
     *         for backward compatibility because the recommended attribute to use is public keys.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided
     *        for backward compatibility because the recommended attribute to use is public keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the development endpoints for authentication. The use of this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @return A list of public keys to be used by the development endpoints for authentication. The use of this
     *         attribute is preferred over a single public key because the public keys allow you to have a different
     *         private key per client.</p> <note>
     *         <p>
     *         If you previously created an endpoint with a public key, you must remove that key to be able to set a
     *         list of public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *         <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *         attribute.
     *         </p>
     */

    public java.util.List<String> getPublicKeys() {
        return publicKeys;
    }

    /**
     * <p>
     * A list of public keys to be used by the development endpoints for authentication. The use of this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the development endpoints for authentication. The use of this
     *        attribute is preferred over a single public key because the public keys allow you to have a different
     *        private key per client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     */

    public void setPublicKeys(java.util.Collection<String> publicKeys) {
        if (publicKeys == null) {
            this.publicKeys = null;
            return;
        }

        this.publicKeys = new java.util.ArrayList<String>(publicKeys);
    }

    /**
     * <p>
     * A list of public keys to be used by the development endpoints for authentication. The use of this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicKeys(java.util.Collection)} or {@link #withPublicKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the development endpoints for authentication. The use of this
     *        attribute is preferred over a single public key because the public keys allow you to have a different
     *        private key per client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withPublicKeys(String... publicKeys) {
        if (this.publicKeys == null) {
            setPublicKeys(new java.util.ArrayList<String>(publicKeys.length));
        }
        for (String ele : publicKeys) {
            this.publicKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the development endpoints for authentication. The use of this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the development endpoints for authentication. The use of this
     *        attribute is preferred over a single public key because the public keys allow you to have a different
     *        private key per client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys. Call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withPublicKeys(java.util.Collection<String> publicKeys) {
        setPublicKeys(publicKeys);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) to allocate to this <code>DevEndpoint</code>.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The number of AWS Glue Data Processing Units (DPUs) to allocate to this <code>DevEndpoint</code>.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) to allocate to this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *        G.1X, or G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *        configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *        64 GB disk.
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @return The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *         G.1X, or G.2X.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *         and 2 executors per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *         and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *         and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *         configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *         64 GB disk.
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *        G.1X, or G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *        configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *        64 GB disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateDevEndpointRequest withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *        G.1X, or G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *        configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *        64 GB disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateDevEndpointRequest withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param glueVersion
     *        Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     *        indicates the version supported for running your ETL scripts on development endpoints. </p>
     *        <p>
     *        For more information about the available AWS Glue versions and corresponding Spark and Python versions,
     *        see <a href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer
     *        guide.
     *        </p>
     *        <p>
     *        Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     *        </p>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     */

    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @return Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python
     *         version indicates the version supported for running your ETL scripts on development endpoints. </p>
     *         <p>
     *         For more information about the available AWS Glue versions and corresponding Spark and Python versions,
     *         see <a href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer
     *         guide.
     *         </p>
     *         <p>
     *         Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     *         </p>
     *         <p>
     *         You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *         parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *         are provided, the version defaults to Python 2.
     */

    public String getGlueVersion() {
        return this.glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param glueVersion
     *        Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     *        indicates the version supported for running your ETL scripts on development endpoints. </p>
     *        <p>
     *        For more information about the available AWS Glue versions and corresponding Spark and Python versions,
     *        see <a href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer
     *        guide.
     *        </p>
     *        <p>
     *        Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     *        </p>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withGlueVersion(String glueVersion) {
        setGlueVersion(glueVersion);
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated to the development
     *        endpoint.</p>
     *        <p>
     *        The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @return The number of workers of a defined <code>workerType</code> that are allocated to the development
     *         endpoint.</p>
     *         <p>
     *         The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated to the development
     *        endpoint.</p>
     *        <p>
     *        The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet supported.
     * </p>
     * </note>
     * 
     * @param extraPythonLibsS3Path
     *        The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.</p> <note>
     *        <p>
     *        You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C
     *        extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     *        </p>
     */

    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet supported.
     * </p>
     * </note>
     * 
     * @return The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     *         <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.</p> <note>
     *         <p>
     *         You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C
     *         extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *         not yet supported.
     *         </p>
     */

    public String getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet supported.
     * </p>
     * </note>
     * 
     * @param extraPythonLibsS3Path
     *        The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.</p> <note>
     *        <p>
     *        You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C
     *        extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        setExtraPythonLibsS3Path(extraPythonLibsS3Path);
        return this;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * 
     * @param extraJarsS3Path
     *        The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>.
     */

    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     *         <code>DevEndpoint</code>.
     */

    public String getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * 
     * @param extraJarsS3Path
     *        The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withExtraJarsS3Path(String extraJarsS3Path) {
        setExtraJarsS3Path(extraJarsS3Path);
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>
     *        .
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The name of the <code>SecurityConfiguration</code> structure to be used with this
     *         <code>DevEndpoint</code>.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in
     * AWS Glue</a> in the developer guide.
     * </p>
     * 
     * @return The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more
     *         information about tags in AWS Glue, see <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *         developer guide.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in
     * AWS Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more
     *        information about tags in AWS Glue, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *        developer guide.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in
     * AWS Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more
     *        information about tags in AWS Glue, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDevEndpointRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest addTagsEntry(String key, String value) {
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

    public CreateDevEndpointRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     * 
     * @return A map of arguments used to configure the <code>DevEndpoint</code>.
     */

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     * 
     * @param arguments
     *        A map of arguments used to configure the <code>DevEndpoint</code>.
     */

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     * 
     * @param arguments
     *        A map of arguments used to configure the <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    /**
     * Add a single Arguments entry
     *
     * @see CreateDevEndpointRequest#withArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest addArgumentsEntry(String key, String value) {
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

    public CreateDevEndpointRequest clearArgumentsEntries() {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getPublicKeys() != null)
            sb.append("PublicKeys: ").append(getPublicKeys()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: ").append(getGlueVersion()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: ").append(getExtraPythonLibsS3Path()).append(",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: ").append(getExtraJarsS3Path()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateDevEndpointRequest == false)
            return false;
        CreateDevEndpointRequest other = (CreateDevEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getPublicKeys() == null ^ this.getPublicKeys() == null)
            return false;
        if (other.getPublicKeys() != null && other.getPublicKeys().equals(this.getPublicKeys()) == false)
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
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getPublicKeys() == null) ? 0 : getPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        return hashCode;
    }

    @Override
    public CreateDevEndpointRequest clone() {
        return (CreateDevEndpointRequest) super.clone();
    }

}
