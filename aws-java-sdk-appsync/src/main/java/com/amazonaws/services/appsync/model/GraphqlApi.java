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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a GraphQL API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GraphqlApi implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The authentication type.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     */
    private LogConfig logConfig;
    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     */
    private UserPoolConfig userPoolConfig;
    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     */
    private OpenIDConnectConfig openIDConnectConfig;
    /**
     * <p>
     * The ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The URIs.
     * </p>
     */
    private java.util.Map<String, String> uris;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     */
    private java.util.List<AdditionalAuthenticationProvider> additionalAuthenticationProviders;
    /**
     * <p>
     * A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     * </p>
     */
    private Boolean xrayEnabled;
    /**
     * <p>
     * The ARN of the AWS Web Application Firewall (WAF) ACL associated with this <code>GraphqlApi</code>, if one
     * exists.
     * </p>
     */
    private String wafWebAclArn;

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param name
     *        The API name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @return The API name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param name
     *        The API name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @return The authentication type.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public GraphqlApi withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public GraphqlApi withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     */

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @return The Amazon CloudWatch Logs configuration.
     */

    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withLogConfig(LogConfig logConfig) {
        setLogConfig(logConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     */

    public void setUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @return The Amazon Cognito user pool configuration.
     */

    public UserPoolConfig getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withUserPoolConfig(UserPoolConfig userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
        return this;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration.
     */

    public void setOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @return The OpenID Connect configuration.
     */

    public OpenIDConnectConfig getOpenIDConnectConfig() {
        return this.openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        setOpenIDConnectConfig(openIDConnectConfig);
        return this;
    }

    /**
     * <p>
     * The ARN.
     * </p>
     * 
     * @param arn
     *        The ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN.
     * </p>
     * 
     * @return The ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN.
     * </p>
     * 
     * @param arn
     *        The ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The URIs.
     * </p>
     * 
     * @return The URIs.
     */

    public java.util.Map<String, String> getUris() {
        return uris;
    }

    /**
     * <p>
     * The URIs.
     * </p>
     * 
     * @param uris
     *        The URIs.
     */

    public void setUris(java.util.Map<String, String> uris) {
        this.uris = uris;
    }

    /**
     * <p>
     * The URIs.
     * </p>
     * 
     * @param uris
     *        The URIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withUris(java.util.Map<String, String> uris) {
        setUris(uris);
        return this;
    }

    /**
     * Add a single Uris entry
     *
     * @see GraphqlApi#withUris
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi addUrisEntry(String key, String value) {
        if (null == this.uris) {
            this.uris = new java.util.HashMap<String, String>();
        }
        if (this.uris.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.uris.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Uris.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi clearUrisEntries() {
        this.uris = null;
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GraphqlApi#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @return A list of additional authentication providers for the <code>GraphqlApi</code> API.
     */

    public java.util.List<AdditionalAuthenticationProvider> getAdditionalAuthenticationProviders() {
        return additionalAuthenticationProviders;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     */

    public void setAdditionalAuthenticationProviders(java.util.Collection<AdditionalAuthenticationProvider> additionalAuthenticationProviders) {
        if (additionalAuthenticationProviders == null) {
            this.additionalAuthenticationProviders = null;
            return;
        }

        this.additionalAuthenticationProviders = new java.util.ArrayList<AdditionalAuthenticationProvider>(additionalAuthenticationProviders);
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAuthenticationProviders(java.util.Collection)} or
     * {@link #withAdditionalAuthenticationProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withAdditionalAuthenticationProviders(AdditionalAuthenticationProvider... additionalAuthenticationProviders) {
        if (this.additionalAuthenticationProviders == null) {
            setAdditionalAuthenticationProviders(new java.util.ArrayList<AdditionalAuthenticationProvider>(additionalAuthenticationProviders.length));
        }
        for (AdditionalAuthenticationProvider ele : additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withAdditionalAuthenticationProviders(java.util.Collection<AdditionalAuthenticationProvider> additionalAuthenticationProviders) {
        setAdditionalAuthenticationProviders(additionalAuthenticationProviders);
        return this;
    }

    /**
     * <p>
     * A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @param xrayEnabled
     *        A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     */

    public void setXrayEnabled(Boolean xrayEnabled) {
        this.xrayEnabled = xrayEnabled;
    }

    /**
     * <p>
     * A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @return A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     */

    public Boolean getXrayEnabled() {
        return this.xrayEnabled;
    }

    /**
     * <p>
     * A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @param xrayEnabled
     *        A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withXrayEnabled(Boolean xrayEnabled) {
        setXrayEnabled(xrayEnabled);
        return this;
    }

    /**
     * <p>
     * A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @return A flag representing whether X-Ray tracing is enabled for this <code>GraphqlApi</code>.
     */

    public Boolean isXrayEnabled() {
        return this.xrayEnabled;
    }

    /**
     * <p>
     * The ARN of the AWS Web Application Firewall (WAF) ACL associated with this <code>GraphqlApi</code>, if one
     * exists.
     * </p>
     * 
     * @param wafWebAclArn
     *        The ARN of the AWS Web Application Firewall (WAF) ACL associated with this <code>GraphqlApi</code>, if one
     *        exists.
     */

    public void setWafWebAclArn(String wafWebAclArn) {
        this.wafWebAclArn = wafWebAclArn;
    }

    /**
     * <p>
     * The ARN of the AWS Web Application Firewall (WAF) ACL associated with this <code>GraphqlApi</code>, if one
     * exists.
     * </p>
     * 
     * @return The ARN of the AWS Web Application Firewall (WAF) ACL associated with this <code>GraphqlApi</code>, if
     *         one exists.
     */

    public String getWafWebAclArn() {
        return this.wafWebAclArn;
    }

    /**
     * <p>
     * The ARN of the AWS Web Application Firewall (WAF) ACL associated with this <code>GraphqlApi</code>, if one
     * exists.
     * </p>
     * 
     * @param wafWebAclArn
     *        The ARN of the AWS Web Application Firewall (WAF) ACL associated with this <code>GraphqlApi</code>, if one
     *        exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withWafWebAclArn(String wafWebAclArn) {
        setWafWebAclArn(wafWebAclArn);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getLogConfig() != null)
            sb.append("LogConfig: ").append(getLogConfig()).append(",");
        if (getUserPoolConfig() != null)
            sb.append("UserPoolConfig: ").append(getUserPoolConfig()).append(",");
        if (getOpenIDConnectConfig() != null)
            sb.append("OpenIDConnectConfig: ").append(getOpenIDConnectConfig()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getUris() != null)
            sb.append("Uris: ").append(getUris()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAdditionalAuthenticationProviders() != null)
            sb.append("AdditionalAuthenticationProviders: ").append(getAdditionalAuthenticationProviders()).append(",");
        if (getXrayEnabled() != null)
            sb.append("XrayEnabled: ").append(getXrayEnabled()).append(",");
        if (getWafWebAclArn() != null)
            sb.append("WafWebAclArn: ").append(getWafWebAclArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GraphqlApi == false)
            return false;
        GraphqlApi other = (GraphqlApi) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getLogConfig() == null ^ this.getLogConfig() == null)
            return false;
        if (other.getLogConfig() != null && other.getLogConfig().equals(this.getLogConfig()) == false)
            return false;
        if (other.getUserPoolConfig() == null ^ this.getUserPoolConfig() == null)
            return false;
        if (other.getUserPoolConfig() != null && other.getUserPoolConfig().equals(this.getUserPoolConfig()) == false)
            return false;
        if (other.getOpenIDConnectConfig() == null ^ this.getOpenIDConnectConfig() == null)
            return false;
        if (other.getOpenIDConnectConfig() != null && other.getOpenIDConnectConfig().equals(this.getOpenIDConnectConfig()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUris() == null ^ this.getUris() == null)
            return false;
        if (other.getUris() != null && other.getUris().equals(this.getUris()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAdditionalAuthenticationProviders() == null ^ this.getAdditionalAuthenticationProviders() == null)
            return false;
        if (other.getAdditionalAuthenticationProviders() != null
                && other.getAdditionalAuthenticationProviders().equals(this.getAdditionalAuthenticationProviders()) == false)
            return false;
        if (other.getXrayEnabled() == null ^ this.getXrayEnabled() == null)
            return false;
        if (other.getXrayEnabled() != null && other.getXrayEnabled().equals(this.getXrayEnabled()) == false)
            return false;
        if (other.getWafWebAclArn() == null ^ this.getWafWebAclArn() == null)
            return false;
        if (other.getWafWebAclArn() != null && other.getWafWebAclArn().equals(this.getWafWebAclArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getLogConfig() == null) ? 0 : getLogConfig().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getOpenIDConnectConfig() == null) ? 0 : getOpenIDConnectConfig().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUris() == null) ? 0 : getUris().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAuthenticationProviders() == null) ? 0 : getAdditionalAuthenticationProviders().hashCode());
        hashCode = prime * hashCode + ((getXrayEnabled() == null) ? 0 : getXrayEnabled().hashCode());
        hashCode = prime * hashCode + ((getWafWebAclArn() == null) ? 0 : getWafWebAclArn().hashCode());
        return hashCode;
    }

    @Override
    public GraphqlApi clone() {
        try {
            return (GraphqlApi) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.GraphqlApiMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
