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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Required. The Amazon Resource Name (ARN) of the configuration. */
    private String arn;
    /** The authentication strategy associated with the configuration. */
    private String authenticationStrategy;
    /** Required. The date and time of the configuration. */
    private java.util.Date created;
    /** Required. The unique ID that Amazon MQ generates for the configuration. */
    private String id;
    /** The latest revision of the configuration. */
    private ConfigurationRevision latestRevision;
    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */
    private String name;

    /**
     * Required. The Amazon Resource Name (ARN) of the configuration.
     * 
     * @param arn
     *        Required. The Amazon Resource Name (ARN) of the configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Required. The Amazon Resource Name (ARN) of the configuration.
     * 
     * @return Required. The Amazon Resource Name (ARN) of the configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Required. The Amazon Resource Name (ARN) of the configuration.
     * 
     * @param arn
     *        Required. The Amazon Resource Name (ARN) of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The authentication strategy associated with the configuration.
     * 
     * @param authenticationStrategy
     *        The authentication strategy associated with the configuration.
     * @see AuthenticationStrategy
     */

    public void setAuthenticationStrategy(String authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    /**
     * The authentication strategy associated with the configuration.
     * 
     * @return The authentication strategy associated with the configuration.
     * @see AuthenticationStrategy
     */

    public String getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }

    /**
     * The authentication strategy associated with the configuration.
     * 
     * @param authenticationStrategy
     *        The authentication strategy associated with the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public CreateConfigurationResult withAuthenticationStrategy(String authenticationStrategy) {
        setAuthenticationStrategy(authenticationStrategy);
        return this;
    }

    /**
     * The authentication strategy associated with the configuration.
     * 
     * @param authenticationStrategy
     *        The authentication strategy associated with the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public CreateConfigurationResult withAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy.toString();
        return this;
    }

    /**
     * Required. The date and time of the configuration.
     * 
     * @param created
     *        Required. The date and time of the configuration.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * Required. The date and time of the configuration.
     * 
     * @return Required. The date and time of the configuration.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * Required. The date and time of the configuration.
     * 
     * @param created
     *        Required. The date and time of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationResult withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @return Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The latest revision of the configuration.
     * 
     * @param latestRevision
     *        The latest revision of the configuration.
     */

    public void setLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * The latest revision of the configuration.
     * 
     * @return The latest revision of the configuration.
     */

    public ConfigurationRevision getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * The latest revision of the configuration.
     * 
     * @param latestRevision
     *        The latest revision of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationResult withLatestRevision(ConfigurationRevision latestRevision) {
        setLatestRevision(latestRevision);
        return this;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @param name
     *        Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @return Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *         periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @param name
     *        Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationResult withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAuthenticationStrategy() != null)
            sb.append("AuthenticationStrategy: ").append(getAuthenticationStrategy()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLatestRevision() != null)
            sb.append("LatestRevision: ").append(getLatestRevision()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationResult == false)
            return false;
        CreateConfigurationResult other = (CreateConfigurationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAuthenticationStrategy() == null ^ this.getAuthenticationStrategy() == null)
            return false;
        if (other.getAuthenticationStrategy() != null && other.getAuthenticationStrategy().equals(this.getAuthenticationStrategy()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null && other.getLatestRevision().equals(this.getLatestRevision()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationStrategy() == null) ? 0 : getAuthenticationStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigurationResult clone() {
        try {
            return (CreateConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
