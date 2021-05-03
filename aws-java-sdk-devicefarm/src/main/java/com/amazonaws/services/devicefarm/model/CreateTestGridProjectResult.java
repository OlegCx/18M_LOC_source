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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateTestGridProject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestGridProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the Selenium testing project that was created.
     * </p>
     */
    private TestGridProject testGridProject;

    /**
     * <p>
     * ARN of the Selenium testing project that was created.
     * </p>
     * 
     * @param testGridProject
     *        ARN of the Selenium testing project that was created.
     */

    public void setTestGridProject(TestGridProject testGridProject) {
        this.testGridProject = testGridProject;
    }

    /**
     * <p>
     * ARN of the Selenium testing project that was created.
     * </p>
     * 
     * @return ARN of the Selenium testing project that was created.
     */

    public TestGridProject getTestGridProject() {
        return this.testGridProject;
    }

    /**
     * <p>
     * ARN of the Selenium testing project that was created.
     * </p>
     * 
     * @param testGridProject
     *        ARN of the Selenium testing project that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestGridProjectResult withTestGridProject(TestGridProject testGridProject) {
        setTestGridProject(testGridProject);
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
        if (getTestGridProject() != null)
            sb.append("TestGridProject: ").append(getTestGridProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTestGridProjectResult == false)
            return false;
        CreateTestGridProjectResult other = (CreateTestGridProjectResult) obj;
        if (other.getTestGridProject() == null ^ this.getTestGridProject() == null)
            return false;
        if (other.getTestGridProject() != null && other.getTestGridProject().equals(this.getTestGridProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestGridProject() == null) ? 0 : getTestGridProject().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestGridProjectResult clone() {
        try {
            return (CreateTestGridProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
