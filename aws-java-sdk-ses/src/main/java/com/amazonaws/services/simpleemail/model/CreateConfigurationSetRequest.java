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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to create a configuration set. Configuration sets enable you to publish email sending events.
 * For information about using configuration sets, see the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A data structure that contains the name of the configuration set.
     * </p>
     */
    private ConfigurationSet configurationSet;

    /**
     * <p>
     * A data structure that contains the name of the configuration set.
     * </p>
     * 
     * @param configurationSet
     *        A data structure that contains the name of the configuration set.
     */

    public void setConfigurationSet(ConfigurationSet configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * A data structure that contains the name of the configuration set.
     * </p>
     * 
     * @return A data structure that contains the name of the configuration set.
     */

    public ConfigurationSet getConfigurationSet() {
        return this.configurationSet;
    }

    /**
     * <p>
     * A data structure that contains the name of the configuration set.
     * </p>
     * 
     * @param configurationSet
     *        A data structure that contains the name of the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationSetRequest withConfigurationSet(ConfigurationSet configurationSet) {
        setConfigurationSet(configurationSet);
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
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: ").append(getConfigurationSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationSetRequest == false)
            return false;
        CreateConfigurationSetRequest other = (CreateConfigurationSetRequest) obj;
        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigurationSetRequest clone() {
        return (CreateConfigurationSetRequest) super.clone();
    }

}
