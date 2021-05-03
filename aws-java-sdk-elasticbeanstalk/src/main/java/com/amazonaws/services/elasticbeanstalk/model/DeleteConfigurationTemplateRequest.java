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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to delete a configuration template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConfigurationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to delete the configuration template from.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the configuration template to delete.
     * </p>
     */
    private String templateName;

    /**
     * Default constructor for DeleteConfigurationTemplateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteConfigurationTemplateRequest() {
    }

    /**
     * Constructs a new DeleteConfigurationTemplateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application to delete the configuration template from.
     * @param templateName
     *        The name of the configuration template to delete.
     */
    public DeleteConfigurationTemplateRequest(String applicationName, String templateName) {
        setApplicationName(applicationName);
        setTemplateName(templateName);
    }

    /**
     * <p>
     * The name of the application to delete the configuration template from.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to delete the configuration template from.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to delete the configuration template from.
     * </p>
     * 
     * @return The name of the application to delete the configuration template from.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to delete the configuration template from.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to delete the configuration template from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationTemplateRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to delete.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to delete.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to delete.
     * </p>
     * 
     * @return The name of the configuration template to delete.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template to delete.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfigurationTemplateRequest == false)
            return false;
        DeleteConfigurationTemplateRequest other = (DeleteConfigurationTemplateRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConfigurationTemplateRequest clone() {
        return (DeleteConfigurationTemplateRequest) super.clone();
    }

}
