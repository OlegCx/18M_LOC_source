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

/**
 * <p>
 * A framework supported by the platform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/PlatformFramework" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformFramework implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the framework.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the framework.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the framework.
     * </p>
     * 
     * @param name
     *        The name of the framework.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the framework.
     * </p>
     * 
     * @return The name of the framework.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the framework.
     * </p>
     * 
     * @param name
     *        The name of the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformFramework withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the framework.
     * </p>
     * 
     * @param version
     *        The version of the framework.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the framework.
     * </p>
     * 
     * @return The version of the framework.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the framework.
     * </p>
     * 
     * @param version
     *        The version of the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformFramework withVersion(String version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformFramework == false)
            return false;
        PlatformFramework other = (PlatformFramework) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public PlatformFramework clone() {
        try {
            return (PlatformFramework) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
