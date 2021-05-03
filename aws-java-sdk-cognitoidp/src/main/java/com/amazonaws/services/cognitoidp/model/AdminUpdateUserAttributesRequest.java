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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to update the user's attributes as an administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateUserAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminUpdateUserAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to update user attributes.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The user name of the user for whom you want to update user attributes.
     * </p>
     */
    private String username;
    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;
    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminUpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminUpdateUserAttributes request. In your function code in
     * AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The user pool ID for the user pool where you want to update user attributes.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to update user attributes.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update user attributes.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to update user attributes.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update user attributes.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to update user attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateUserAttributesRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The user name of the user for whom you want to update user attributes.
     * </p>
     * 
     * @param username
     *        The user name of the user for whom you want to update user attributes.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to update user attributes.
     * </p>
     * 
     * @return The user name of the user for whom you want to update user attributes.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to update user attributes.
     * </p>
     * 
     * @param username
     *        The user name of the user for whom you want to update user attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateUserAttributesRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @return An array of name-value pairs representing user attributes.</p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     */

    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     */

    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributes(java.util.Collection)} or {@link #withUserAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateUserAttributesRequest withUserAttributes(AttributeType... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<AttributeType>(userAttributes.length));
        }
        for (AttributeType ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateUserAttributesRequest withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminUpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminUpdateUserAttributes request. In your function code in
     * AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *         triggers. </p>
     *         <p>
     *         You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *         AdminUpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the
     *         <i>custom message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which
     *         the function receives as input. This payload contains a <code>clientMetadata</code> attribute, which
     *         provides the data that you assigned to the ClientMetadata parameter in your AdminUpdateUserAttributes
     *         request. In your function code in AWS Lambda, you can process the <code>clientMetadata</code> value to
     *         enhance your workflow for your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Take the following limitations into consideration when you use the ClientMetadata parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda
     *         triggers that are assigned to a user pool to support custom workflows. If your user pool configuration
     *         does not include triggers, the ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *         information.
     *         </p>
     *         </li>
     *         </ul>
     */

    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminUpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminUpdateUserAttributes request. In your function code in
     * AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers. </p>
     *        <p>
     *        You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *        AdminUpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the
     *        <i>custom message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which
     *        the function receives as input. This payload contains a <code>clientMetadata</code> attribute, which
     *        provides the data that you assigned to the ClientMetadata parameter in your AdminUpdateUserAttributes
     *        request. In your function code in AWS Lambda, you can process the <code>clientMetadata</code> value to
     *        enhance your workflow for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Take the following limitations into consideration when you use the ClientMetadata parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers
     *        that are assigned to a user pool to support custom workflows. If your user pool configuration does not
     *        include triggers, the ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *        information.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminUpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminUpdateUserAttributes request. In your function code in
     * AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers. </p>
     *        <p>
     *        You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *        AdminUpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the
     *        <i>custom message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which
     *        the function receives as input. This payload contains a <code>clientMetadata</code> attribute, which
     *        provides the data that you assigned to the ClientMetadata parameter in your AdminUpdateUserAttributes
     *        request. In your function code in AWS Lambda, you can process the <code>clientMetadata</code> value to
     *        enhance your workflow for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Take the following limitations into consideration when you use the ClientMetadata parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers
     *        that are assigned to a user pool to support custom workflows. If your user pool configuration does not
     *        include triggers, the ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *        information.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateUserAttributesRequest withClientMetadata(java.util.Map<String, String> clientMetadata) {
        setClientMetadata(clientMetadata);
        return this;
    }

    /**
     * Add a single ClientMetadata entry
     *
     * @see AdminUpdateUserAttributesRequest#withClientMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateUserAttributesRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateUserAttributesRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: ").append(getUserAttributes()).append(",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: ").append(getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminUpdateUserAttributesRequest == false)
            return false;
        AdminUpdateUserAttributesRequest other = (AdminUpdateUserAttributesRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public AdminUpdateUserAttributesRequest clone() {
        return (AdminUpdateUserAttributesRequest) super.clone();
    }

}
