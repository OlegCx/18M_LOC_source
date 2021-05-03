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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     */
    private java.util.List<String> kafkaVersions;
    /**
     * <p>
     * The name of the configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
     * </p>
     */
    private java.nio.ByteBuffer serverProperties;

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @param description
     *        <p>
     *        The description of the configuration.
     *        </p>
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @return <p>
     *         The description of the configuration.
     *         </p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @param description
     *        <p>
     *        The description of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * @return <p>
     *         The versions of Apache Kafka with which you can use this MSK configuration.
     *         </p>
     */

    public java.util.List<String> getKafkaVersions() {
        return kafkaVersions;
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * @param kafkaVersions
     *        <p>
     *        The versions of Apache Kafka with which you can use this MSK configuration.
     *        </p>
     */

    public void setKafkaVersions(java.util.Collection<String> kafkaVersions) {
        if (kafkaVersions == null) {
            this.kafkaVersions = null;
            return;
        }

        this.kafkaVersions = new java.util.ArrayList<String>(kafkaVersions);
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKafkaVersions(java.util.Collection)} or {@link #withKafkaVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param kafkaVersions
     *        <p>
     *        The versions of Apache Kafka with which you can use this MSK configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withKafkaVersions(String... kafkaVersions) {
        if (this.kafkaVersions == null) {
            setKafkaVersions(new java.util.ArrayList<String>(kafkaVersions.length));
        }
        for (String ele : kafkaVersions) {
            this.kafkaVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * @param kafkaVersions
     *        <p>
     *        The versions of Apache Kafka with which you can use this MSK configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withKafkaVersions(java.util.Collection<String> kafkaVersions) {
        setKafkaVersions(kafkaVersions);
        return this;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name
     *        <p>
     *        The name of the configuration.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @return <p>
     *         The name of the configuration.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name
     *        <p>
     *        The name of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
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
     * @param serverProperties
     *        <p>
     *        Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     *        contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     *        the contents of <filename>server.properties</filename> can be in plaintext.
     *        </p>
     */

    public void setServerProperties(java.nio.ByteBuffer serverProperties) {
        this.serverProperties = serverProperties;
    }

    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
     * </p>
     * 
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}
     * . Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return <p>
     *         Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     *         contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     *         the contents of <filename>server.properties</filename> can be in plaintext.
     *         </p>
     */

    public java.nio.ByteBuffer getServerProperties() {
        return this.serverProperties;
    }

    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
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
     * @param serverProperties
     *        <p>
     *        Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     *        contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     *        the contents of <filename>server.properties</filename> can be in plaintext.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withServerProperties(java.nio.ByteBuffer serverProperties) {
        setServerProperties(serverProperties);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKafkaVersions() != null)
            sb.append("KafkaVersions: ").append(getKafkaVersions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServerProperties() != null)
            sb.append("ServerProperties: ").append(getServerProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationRequest == false)
            return false;
        CreateConfigurationRequest other = (CreateConfigurationRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKafkaVersions() == null ^ this.getKafkaVersions() == null)
            return false;
        if (other.getKafkaVersions() != null && other.getKafkaVersions().equals(this.getKafkaVersions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerProperties() == null ^ this.getServerProperties() == null)
            return false;
        if (other.getServerProperties() != null && other.getServerProperties().equals(this.getServerProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKafkaVersions() == null) ? 0 : getKafkaVersions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerProperties() == null) ? 0 : getServerProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigurationRequest clone() {
        return (CreateConfigurationRequest) super.clone();
    }

}
