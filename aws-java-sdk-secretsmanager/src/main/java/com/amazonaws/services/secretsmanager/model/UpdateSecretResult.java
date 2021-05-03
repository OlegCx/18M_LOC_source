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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the secret that was updated.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret that was updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique
     * identifier of the new version.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The ARN of the secret that was updated.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     * 
     * @param aRN
     *        The ARN of the secret that was updated.</p> <note>
     *        <p>
     *        Secrets Manager automatically adds several random characters to the name at the end of the ARN when you
     *        initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that
     *        if you create a new secret with the same name as an old secret that you previously deleted, then users
     *        with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are
     *        different.
     *        </p>
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the secret that was updated.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     * 
     * @return The ARN of the secret that was updated.</p> <note>
     *         <p>
     *         Secrets Manager automatically adds several random characters to the name at the end of the ARN when you
     *         initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that
     *         if you create a new secret with the same name as an old secret that you previously deleted, then users
     *         with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs
     *         are different.
     *         </p>
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the secret that was updated.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     * 
     * @param aRN
     *        The ARN of the secret that was updated.</p> <note>
     *        <p>
     *        Secrets Manager automatically adds several random characters to the name at the end of the ARN when you
     *        initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that
     *        if you create a new secret with the same name as an old secret that you previously deleted, then users
     *        with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are
     *        different.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret that was updated.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret that was updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret that was updated.
     * </p>
     * 
     * @return The friendly name of the secret that was updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret that was updated.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique
     * identifier of the new version.
     * </p>
     * 
     * @param versionId
     *        If a new version of the secret was created by this operation, then <code>VersionId</code> contains the
     *        unique identifier of the new version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique
     * identifier of the new version.
     * </p>
     * 
     * @return If a new version of the secret was created by this operation, then <code>VersionId</code> contains the
     *         unique identifier of the new version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique
     * identifier of the new version.
     * </p>
     * 
     * @param versionId
     *        If a new version of the secret was created by this operation, then <code>VersionId</code> contains the
     *        unique identifier of the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretResult withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecretResult == false)
            return false;
        UpdateSecretResult other = (UpdateSecretResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecretResult clone() {
        try {
            return (UpdateSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
