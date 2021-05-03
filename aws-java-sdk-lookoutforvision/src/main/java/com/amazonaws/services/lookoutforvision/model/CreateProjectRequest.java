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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateProject</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateProject</code>. In this case, safely retry your call to <code>CreateProject</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateProject</code>. An idempotency token is active for 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name for the project.
     * </p>
     * 
     * @param projectName
     *        The name for the project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name for the project.
     * </p>
     * 
     * @return The name for the project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name for the project.
     * </p>
     * 
     * @param projectName
     *        The name for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateProject</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateProject</code>. In this case, safely retry your call to <code>CreateProject</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateProject</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>CreateProject</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>CreateProject</code>. In this case, safely retry your call to
     *        <code>CreateProject</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>CreateProject</code>. An idempotency token is
     *        active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateProject</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateProject</code>. In this case, safely retry your call to <code>CreateProject</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateProject</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @return ClientToken is an idempotency token that ensures a call to <code>CreateProject</code> completes only
     *         once. You choose the value to pass. For example, An issue, such as an network outage, might prevent you
     *         from getting a response from <code>CreateProject</code>. In this case, safely retry your call to
     *         <code>CreateProject</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *         the other input parameters are not the same as in the first request. Using a different value for
     *         <code>ClientToken</code> is considered a new call to <code>CreateProject</code>. An idempotency token is
     *         active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateProject</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateProject</code>. In this case, safely retry your call to <code>CreateProject</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateProject</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>CreateProject</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>CreateProject</code>. In this case, safely retry your call to
     *        <code>CreateProject</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>CreateProject</code>. An idempotency token is
     *        active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
