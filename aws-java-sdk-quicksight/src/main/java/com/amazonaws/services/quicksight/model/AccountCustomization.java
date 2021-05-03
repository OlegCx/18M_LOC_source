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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon QuickSight customizations associated with your AWS account or a QuickSight namespace in a specific AWS
 * Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AccountCustomization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountCustomization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default theme for this QuickSight subscription.
     * </p>
     */
    private String defaultTheme;

    /**
     * <p>
     * The default theme for this QuickSight subscription.
     * </p>
     * 
     * @param defaultTheme
     *        The default theme for this QuickSight subscription.
     */

    public void setDefaultTheme(String defaultTheme) {
        this.defaultTheme = defaultTheme;
    }

    /**
     * <p>
     * The default theme for this QuickSight subscription.
     * </p>
     * 
     * @return The default theme for this QuickSight subscription.
     */

    public String getDefaultTheme() {
        return this.defaultTheme;
    }

    /**
     * <p>
     * The default theme for this QuickSight subscription.
     * </p>
     * 
     * @param defaultTheme
     *        The default theme for this QuickSight subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountCustomization withDefaultTheme(String defaultTheme) {
        setDefaultTheme(defaultTheme);
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
        if (getDefaultTheme() != null)
            sb.append("DefaultTheme: ").append(getDefaultTheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountCustomization == false)
            return false;
        AccountCustomization other = (AccountCustomization) obj;
        if (other.getDefaultTheme() == null ^ this.getDefaultTheme() == null)
            return false;
        if (other.getDefaultTheme() != null && other.getDefaultTheme().equals(this.getDefaultTheme()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultTheme() == null) ? 0 : getDefaultTheme().hashCode());
        return hashCode;
    }

    @Override
    public AccountCustomization clone() {
        try {
            return (AccountCustomization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AccountCustomizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
