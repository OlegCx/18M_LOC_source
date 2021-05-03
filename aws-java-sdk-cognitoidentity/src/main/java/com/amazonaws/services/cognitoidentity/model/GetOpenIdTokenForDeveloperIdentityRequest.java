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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdTokenForDeveloperIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpenIdTokenForDeveloperIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair represents a
     * user from a public provider or developer provider. If the user is from a developer provider, the name-value pair
     * will follow the syntax <code>"developer_provider_name": "developer_user_identifier"</code>. The developer
     * provider is the "domain" by which Cognito will refer to your users; you provided this domain while
     * creating/updating the identity pool. The developer user identifier is an identifier from your backend that
     * uniquely identifies a user. When you create an identity pool, you can specify the supported logins.
     * </p>
     */
    private java.util.Map<String, String> logins;
    /**
     * <p>
     * Use this operation to configure attribute mappings for custom providers.
     * </p>
     */
    private java.util.Map<String, String> principalTags;
    /**
     * <p>
     * The expiration time of the token, in seconds. You can specify a custom expiration time for the token so that you
     * can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can exchange the
     * token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one hour. The maximum token
     * duration you can set is 24 hours. You should take care in setting the expiration time for a token, as there are
     * significant security implications: an attacker could use a leaked token to access your AWS resources for the
     * token's duration.
     * </p>
     * <note>
     * <p>
     * Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.
     * </p>
     * </note>
     */
    private Long tokenDuration;

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @return A unique identifier in the format REGION:GUID.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair represents a
     * user from a public provider or developer provider. If the user is from a developer provider, the name-value pair
     * will follow the syntax <code>"developer_provider_name": "developer_user_identifier"</code>. The developer
     * provider is the "domain" by which Cognito will refer to your users; you provided this domain while
     * creating/updating the identity pool. The developer user identifier is an identifier from your backend that
     * uniquely identifies a user. When you create an identity pool, you can specify the supported logins.
     * </p>
     * 
     * @return A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair
     *         represents a user from a public provider or developer provider. If the user is from a developer provider,
     *         the name-value pair will follow the syntax
     *         <code>"developer_provider_name": "developer_user_identifier"</code>. The developer provider is the
     *         "domain" by which Cognito will refer to your users; you provided this domain while creating/updating the
     *         identity pool. The developer user identifier is an identifier from your backend that uniquely identifies
     *         a user. When you create an identity pool, you can specify the supported logins.
     */

    public java.util.Map<String, String> getLogins() {
        return logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair represents a
     * user from a public provider or developer provider. If the user is from a developer provider, the name-value pair
     * will follow the syntax <code>"developer_provider_name": "developer_user_identifier"</code>. The developer
     * provider is the "domain" by which Cognito will refer to your users; you provided this domain while
     * creating/updating the identity pool. The developer user identifier is an identifier from your backend that
     * uniquely identifies a user. When you create an identity pool, you can specify the supported logins.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair
     *        represents a user from a public provider or developer provider. If the user is from a developer provider,
     *        the name-value pair will follow the syntax
     *        <code>"developer_provider_name": "developer_user_identifier"</code>. The developer provider is the
     *        "domain" by which Cognito will refer to your users; you provided this domain while creating/updating the
     *        identity pool. The developer user identifier is an identifier from your backend that uniquely identifies a
     *        user. When you create an identity pool, you can specify the supported logins.
     */

    public void setLogins(java.util.Map<String, String> logins) {
        this.logins = logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair represents a
     * user from a public provider or developer provider. If the user is from a developer provider, the name-value pair
     * will follow the syntax <code>"developer_provider_name": "developer_user_identifier"</code>. The developer
     * provider is the "domain" by which Cognito will refer to your users; you provided this domain while
     * creating/updating the identity pool. The developer user identifier is an identifier from your backend that
     * uniquely identifies a user. When you create an identity pool, you can specify the supported logins.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair
     *        represents a user from a public provider or developer provider. If the user is from a developer provider,
     *        the name-value pair will follow the syntax
     *        <code>"developer_provider_name": "developer_user_identifier"</code>. The developer provider is the
     *        "domain" by which Cognito will refer to your users; you provided this domain while creating/updating the
     *        identity pool. The developer user identifier is an identifier from your backend that uniquely identifies a
     *        user. When you create an identity pool, you can specify the supported logins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest withLogins(java.util.Map<String, String> logins) {
        setLogins(logins);
        return this;
    }

    /**
     * Add a single Logins entry
     *
     * @see GetOpenIdTokenForDeveloperIdentityRequest#withLogins
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String, String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }

    /**
     * <p>
     * Use this operation to configure attribute mappings for custom providers.
     * </p>
     * 
     * @return Use this operation to configure attribute mappings for custom providers.
     */

    public java.util.Map<String, String> getPrincipalTags() {
        return principalTags;
    }

    /**
     * <p>
     * Use this operation to configure attribute mappings for custom providers.
     * </p>
     * 
     * @param principalTags
     *        Use this operation to configure attribute mappings for custom providers.
     */

    public void setPrincipalTags(java.util.Map<String, String> principalTags) {
        this.principalTags = principalTags;
    }

    /**
     * <p>
     * Use this operation to configure attribute mappings for custom providers.
     * </p>
     * 
     * @param principalTags
     *        Use this operation to configure attribute mappings for custom providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest withPrincipalTags(java.util.Map<String, String> principalTags) {
        setPrincipalTags(principalTags);
        return this;
    }

    /**
     * Add a single PrincipalTags entry
     *
     * @see GetOpenIdTokenForDeveloperIdentityRequest#withPrincipalTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest addPrincipalTagsEntry(String key, String value) {
        if (null == this.principalTags) {
            this.principalTags = new java.util.HashMap<String, String>();
        }
        if (this.principalTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.principalTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PrincipalTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest clearPrincipalTagsEntries() {
        this.principalTags = null;
        return this;
    }

    /**
     * <p>
     * The expiration time of the token, in seconds. You can specify a custom expiration time for the token so that you
     * can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can exchange the
     * token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one hour. The maximum token
     * duration you can set is 24 hours. You should take care in setting the expiration time for a token, as there are
     * significant security implications: an attacker could use a leaked token to access your AWS resources for the
     * token's duration.
     * </p>
     * <note>
     * <p>
     * Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.
     * </p>
     * </note>
     * 
     * @param tokenDuration
     *        The expiration time of the token, in seconds. You can specify a custom expiration time for the token so
     *        that you can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can
     *        exchange the token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one
     *        hour. The maximum token duration you can set is 24 hours. You should take care in setting the expiration
     *        time for a token, as there are significant security implications: an attacker could use a leaked token to
     *        access your AWS resources for the token's duration.</p> <note>
     *        <p>
     *        Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.
     *        </p>
     */

    public void setTokenDuration(Long tokenDuration) {
        this.tokenDuration = tokenDuration;
    }

    /**
     * <p>
     * The expiration time of the token, in seconds. You can specify a custom expiration time for the token so that you
     * can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can exchange the
     * token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one hour. The maximum token
     * duration you can set is 24 hours. You should take care in setting the expiration time for a token, as there are
     * significant security implications: an attacker could use a leaked token to access your AWS resources for the
     * token's duration.
     * </p>
     * <note>
     * <p>
     * Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.
     * </p>
     * </note>
     * 
     * @return The expiration time of the token, in seconds. You can specify a custom expiration time for the token so
     *         that you can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You
     *         can exchange the token with Amazon STS for temporary AWS credentials, which are valid for a maximum of
     *         one hour. The maximum token duration you can set is 24 hours. You should take care in setting the
     *         expiration time for a token, as there are significant security implications: an attacker could use a
     *         leaked token to access your AWS resources for the token's duration.</p> <note>
     *         <p>
     *         Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.
     *         </p>
     */

    public Long getTokenDuration() {
        return this.tokenDuration;
    }

    /**
     * <p>
     * The expiration time of the token, in seconds. You can specify a custom expiration time for the token so that you
     * can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can exchange the
     * token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one hour. The maximum token
     * duration you can set is 24 hours. You should take care in setting the expiration time for a token, as there are
     * significant security implications: an attacker could use a leaked token to access your AWS resources for the
     * token's duration.
     * </p>
     * <note>
     * <p>
     * Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.
     * </p>
     * </note>
     * 
     * @param tokenDuration
     *        The expiration time of the token, in seconds. You can specify a custom expiration time for the token so
     *        that you can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can
     *        exchange the token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one
     *        hour. The maximum token duration you can set is 24 hours. You should take care in setting the expiration
     *        time for a token, as there are significant security implications: an attacker could use a leaked token to
     *        access your AWS resources for the token's duration.</p> <note>
     *        <p>
     *        Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenForDeveloperIdentityRequest withTokenDuration(Long tokenDuration) {
        setTokenDuration(tokenDuration);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getLogins() != null)
            sb.append("Logins: ").append(getLogins()).append(",");
        if (getPrincipalTags() != null)
            sb.append("PrincipalTags: ").append(getPrincipalTags()).append(",");
        if (getTokenDuration() != null)
            sb.append("TokenDuration: ").append(getTokenDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIdTokenForDeveloperIdentityRequest == false)
            return false;
        GetOpenIdTokenForDeveloperIdentityRequest other = (GetOpenIdTokenForDeveloperIdentityRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getLogins() == null ^ this.getLogins() == null)
            return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false)
            return false;
        if (other.getPrincipalTags() == null ^ this.getPrincipalTags() == null)
            return false;
        if (other.getPrincipalTags() != null && other.getPrincipalTags().equals(this.getPrincipalTags()) == false)
            return false;
        if (other.getTokenDuration() == null ^ this.getTokenDuration() == null)
            return false;
        if (other.getTokenDuration() != null && other.getTokenDuration().equals(this.getTokenDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode());
        hashCode = prime * hashCode + ((getPrincipalTags() == null) ? 0 : getPrincipalTags().hashCode());
        hashCode = prime * hashCode + ((getTokenDuration() == null) ? 0 : getTokenDuration().hashCode());
        return hashCode;
    }

    @Override
    public GetOpenIdTokenForDeveloperIdentityRequest clone() {
        return (GetOpenIdTokenForDeveloperIdentityRequest) super.clone();
    }

}
