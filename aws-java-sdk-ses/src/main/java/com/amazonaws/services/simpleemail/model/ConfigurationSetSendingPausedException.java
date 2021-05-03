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

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that email sending is disabled for the configuration set.
 * </p>
 * <p>
 * You can enable or disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationSetSendingPausedException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the configuration set for which email sending is disabled.
     * </p>
     */
    private String configurationSetName;

    /**
     * Constructs a new ConfigurationSetSendingPausedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConfigurationSetSendingPausedException(String message) {
        super(message);
    }

    /**
     * <p>
     * The name of the configuration set for which email sending is disabled.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set for which email sending is disabled.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set for which email sending is disabled.
     * </p>
     * 
     * @return The name of the configuration set for which email sending is disabled.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set for which email sending is disabled.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set for which email sending is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSetSendingPausedException withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

}
