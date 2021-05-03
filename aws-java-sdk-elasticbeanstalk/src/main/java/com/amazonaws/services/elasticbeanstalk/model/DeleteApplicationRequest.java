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
 * Request to delete an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to delete.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * When set to true, running environments will be terminated before deleting the application.
     * </p>
     */
    private Boolean terminateEnvByForce;

    /**
     * Default constructor for DeleteApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DeleteApplicationRequest() {
    }

    /**
     * Constructs a new DeleteApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application to delete.
     */
    public DeleteApplicationRequest(String applicationName) {
        setApplicationName(applicationName);
    }

    /**
     * <p>
     * The name of the application to delete.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to delete.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to delete.
     * </p>
     * 
     * @return The name of the application to delete.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to delete.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting the application.
     * </p>
     * 
     * @param terminateEnvByForce
     *        When set to true, running environments will be terminated before deleting the application.
     */

    public void setTerminateEnvByForce(Boolean terminateEnvByForce) {
        this.terminateEnvByForce = terminateEnvByForce;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting the application.
     * </p>
     * 
     * @return When set to true, running environments will be terminated before deleting the application.
     */

    public Boolean getTerminateEnvByForce() {
        return this.terminateEnvByForce;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting the application.
     * </p>
     * 
     * @param terminateEnvByForce
     *        When set to true, running environments will be terminated before deleting the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationRequest withTerminateEnvByForce(Boolean terminateEnvByForce) {
        setTerminateEnvByForce(terminateEnvByForce);
        return this;
    }

    /**
     * <p>
     * When set to true, running environments will be terminated before deleting the application.
     * </p>
     * 
     * @return When set to true, running environments will be terminated before deleting the application.
     */

    public Boolean isTerminateEnvByForce() {
        return this.terminateEnvByForce;
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
        if (getTerminateEnvByForce() != null)
            sb.append("TerminateEnvByForce: ").append(getTerminateEnvByForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationRequest == false)
            return false;
        DeleteApplicationRequest other = (DeleteApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTerminateEnvByForce() == null ^ this.getTerminateEnvByForce() == null)
            return false;
        if (other.getTerminateEnvByForce() != null && other.getTerminateEnvByForce().equals(this.getTerminateEnvByForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getTerminateEnvByForce() == null) ? 0 : getTerminateEnvByForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationRequest clone() {
        return (DeleteApplicationRequest) super.clone();
    }

}
