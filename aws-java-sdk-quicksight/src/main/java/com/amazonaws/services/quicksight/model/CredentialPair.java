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
 * The combination of user name and password that are used as credentials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CredentialPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CredentialPair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * User name.
     * </p>
     */
    private String username;
    /**
     * <p>
     * Password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * A set of alternate data source parameters that you want to share for these credentials. The credentials are
     * applied in tandem with the data source parameters when you copy a data source by using a create or update
     * request. The API operation compares the <code>DataSourceParameters</code> structure that's in the request with
     * the structures in the <code>AlternateDataSourceParameters</code> allow list. If the structures are an exact
     * match, the request is allowed to use the new data source with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the <code>DataSourceParameters</code> originally used
     * with these <code>Credentials</code> is automatically allowed.
     * </p>
     */
    private java.util.List<DataSourceParameters> alternateDataSourceParameters;

    /**
     * <p>
     * User name.
     * </p>
     * 
     * @param username
     *        User name.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * User name.
     * </p>
     * 
     * @return User name.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * User name.
     * </p>
     * 
     * @param username
     *        User name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialPair withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * Password.
     * </p>
     * 
     * @param password
     *        Password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Password.
     * </p>
     * 
     * @return Password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * Password.
     * </p>
     * 
     * @param password
     *        Password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialPair withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for these credentials. The credentials are
     * applied in tandem with the data source parameters when you copy a data source by using a create or update
     * request. The API operation compares the <code>DataSourceParameters</code> structure that's in the request with
     * the structures in the <code>AlternateDataSourceParameters</code> allow list. If the structures are an exact
     * match, the request is allowed to use the new data source with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the <code>DataSourceParameters</code> originally used
     * with these <code>Credentials</code> is automatically allowed.
     * </p>
     * 
     * @return A set of alternate data source parameters that you want to share for these credentials. The credentials
     *         are applied in tandem with the data source parameters when you copy a data source by using a create or
     *         update request. The API operation compares the <code>DataSourceParameters</code> structure that's in the
     *         request with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *         structures are an exact match, the request is allowed to use the new data source with the existing
     *         credentials. If the <code>AlternateDataSourceParameters</code> list is null, the
     *         <code>DataSourceParameters</code> originally used with these <code>Credentials</code> is automatically
     *         allowed.
     */

    public java.util.List<DataSourceParameters> getAlternateDataSourceParameters() {
        return alternateDataSourceParameters;
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for these credentials. The credentials are
     * applied in tandem with the data source parameters when you copy a data source by using a create or update
     * request. The API operation compares the <code>DataSourceParameters</code> structure that's in the request with
     * the structures in the <code>AlternateDataSourceParameters</code> allow list. If the structures are an exact
     * match, the request is allowed to use the new data source with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the <code>DataSourceParameters</code> originally used
     * with these <code>Credentials</code> is automatically allowed.
     * </p>
     * 
     * @param alternateDataSourceParameters
     *        A set of alternate data source parameters that you want to share for these credentials. The credentials
     *        are applied in tandem with the data source parameters when you copy a data source by using a create or
     *        update request. The API operation compares the <code>DataSourceParameters</code> structure that's in the
     *        request with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *        structures are an exact match, the request is allowed to use the new data source with the existing
     *        credentials. If the <code>AlternateDataSourceParameters</code> list is null, the
     *        <code>DataSourceParameters</code> originally used with these <code>Credentials</code> is automatically
     *        allowed.
     */

    public void setAlternateDataSourceParameters(java.util.Collection<DataSourceParameters> alternateDataSourceParameters) {
        if (alternateDataSourceParameters == null) {
            this.alternateDataSourceParameters = null;
            return;
        }

        this.alternateDataSourceParameters = new java.util.ArrayList<DataSourceParameters>(alternateDataSourceParameters);
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for these credentials. The credentials are
     * applied in tandem with the data source parameters when you copy a data source by using a create or update
     * request. The API operation compares the <code>DataSourceParameters</code> structure that's in the request with
     * the structures in the <code>AlternateDataSourceParameters</code> allow list. If the structures are an exact
     * match, the request is allowed to use the new data source with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the <code>DataSourceParameters</code> originally used
     * with these <code>Credentials</code> is automatically allowed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlternateDataSourceParameters(java.util.Collection)} or
     * {@link #withAlternateDataSourceParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param alternateDataSourceParameters
     *        A set of alternate data source parameters that you want to share for these credentials. The credentials
     *        are applied in tandem with the data source parameters when you copy a data source by using a create or
     *        update request. The API operation compares the <code>DataSourceParameters</code> structure that's in the
     *        request with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *        structures are an exact match, the request is allowed to use the new data source with the existing
     *        credentials. If the <code>AlternateDataSourceParameters</code> list is null, the
     *        <code>DataSourceParameters</code> originally used with these <code>Credentials</code> is automatically
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialPair withAlternateDataSourceParameters(DataSourceParameters... alternateDataSourceParameters) {
        if (this.alternateDataSourceParameters == null) {
            setAlternateDataSourceParameters(new java.util.ArrayList<DataSourceParameters>(alternateDataSourceParameters.length));
        }
        for (DataSourceParameters ele : alternateDataSourceParameters) {
            this.alternateDataSourceParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for these credentials. The credentials are
     * applied in tandem with the data source parameters when you copy a data source by using a create or update
     * request. The API operation compares the <code>DataSourceParameters</code> structure that's in the request with
     * the structures in the <code>AlternateDataSourceParameters</code> allow list. If the structures are an exact
     * match, the request is allowed to use the new data source with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the <code>DataSourceParameters</code> originally used
     * with these <code>Credentials</code> is automatically allowed.
     * </p>
     * 
     * @param alternateDataSourceParameters
     *        A set of alternate data source parameters that you want to share for these credentials. The credentials
     *        are applied in tandem with the data source parameters when you copy a data source by using a create or
     *        update request. The API operation compares the <code>DataSourceParameters</code> structure that's in the
     *        request with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *        structures are an exact match, the request is allowed to use the new data source with the existing
     *        credentials. If the <code>AlternateDataSourceParameters</code> list is null, the
     *        <code>DataSourceParameters</code> originally used with these <code>Credentials</code> is automatically
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialPair withAlternateDataSourceParameters(java.util.Collection<DataSourceParameters> alternateDataSourceParameters) {
        setAlternateDataSourceParameters(alternateDataSourceParameters);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getAlternateDataSourceParameters() != null)
            sb.append("AlternateDataSourceParameters: ").append(getAlternateDataSourceParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CredentialPair == false)
            return false;
        CredentialPair other = (CredentialPair) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getAlternateDataSourceParameters() == null ^ this.getAlternateDataSourceParameters() == null)
            return false;
        if (other.getAlternateDataSourceParameters() != null
                && other.getAlternateDataSourceParameters().equals(this.getAlternateDataSourceParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getAlternateDataSourceParameters() == null) ? 0 : getAlternateDataSourceParameters().hashCode());
        return hashCode;
    }

    @Override
    public CredentialPair clone() {
        try {
            return (CredentialPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CredentialPairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
