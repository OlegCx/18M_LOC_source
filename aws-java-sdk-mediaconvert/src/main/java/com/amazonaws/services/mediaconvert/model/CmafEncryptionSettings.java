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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for CMAF encryption
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CmafEncryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafEncryptionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     */
    private String constantInitializationVector;
    /**
     * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC
     * subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     */
    private String encryptionMethod;
    /**
     * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization
     * vector in the HLS and DASH manifests.
     */
    private String initializationVectorInManifest;
    /**
     * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key
     * provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
     */
    private SpekeKeyProviderCmaf spekeKeyProvider;
    /** Use these settings to set up encryption with a static key provider. */
    private StaticKeyProvider staticKeyProvider;
    /**
     * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For
     * more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     */
    private String type;

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     * 
     * @param constantInitializationVector
     *        This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not
     *        set then the Initialization Vector will follow the segment number by default.
     */

    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     * 
     * @return This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not
     *         set then the Initialization Vector will follow the segment number by default.
     */

    public String getConstantInitializationVector() {
        return this.constantInitializationVector;
    }

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then
     * the Initialization Vector will follow the segment number by default.
     * 
     * @param constantInitializationVector
     *        This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not
     *        set then the Initialization Vector will follow the segment number by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryptionSettings withConstantInitializationVector(String constantInitializationVector) {
        setConstantInitializationVector(constantInitializationVector);
        return this;
    }

    /**
     * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC
     * subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * 
     * @param encryptionMethod
     *        Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose
     *        AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * @see CmafEncryptionType
     */

    public void setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    /**
     * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC
     * subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * 
     * @return Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose
     *         AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * @see CmafEncryptionType
     */

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    /**
     * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC
     * subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * 
     * @param encryptionMethod
     *        Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose
     *        AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafEncryptionType
     */

    public CmafEncryptionSettings withEncryptionMethod(String encryptionMethod) {
        setEncryptionMethod(encryptionMethod);
        return this;
    }

    /**
     * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC
     * subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * 
     * @param encryptionMethod
     *        Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose
     *        AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafEncryptionType
     */

    public CmafEncryptionSettings withEncryptionMethod(CmafEncryptionType encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
        return this;
    }

    /**
     * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization
     * vector in the HLS and DASH manifests.
     * 
     * @param initializationVectorInManifest
     *        When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption
     *        initialization vector in the HLS and DASH manifests.
     * @see CmafInitializationVectorInManifest
     */

    public void setInitializationVectorInManifest(String initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest;
    }

    /**
     * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization
     * vector in the HLS and DASH manifests.
     * 
     * @return When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption
     *         initialization vector in the HLS and DASH manifests.
     * @see CmafInitializationVectorInManifest
     */

    public String getInitializationVectorInManifest() {
        return this.initializationVectorInManifest;
    }

    /**
     * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization
     * vector in the HLS and DASH manifests.
     * 
     * @param initializationVectorInManifest
     *        When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption
     *        initialization vector in the HLS and DASH manifests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafInitializationVectorInManifest
     */

    public CmafEncryptionSettings withInitializationVectorInManifest(String initializationVectorInManifest) {
        setInitializationVectorInManifest(initializationVectorInManifest);
        return this;
    }

    /**
     * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization
     * vector in the HLS and DASH manifests.
     * 
     * @param initializationVectorInManifest
     *        When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption
     *        initialization vector in the HLS and DASH manifests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafInitializationVectorInManifest
     */

    public CmafEncryptionSettings withInitializationVectorInManifest(CmafInitializationVectorInManifest initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest.toString();
        return this;
    }

    /**
     * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key
     * provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
     * 
     * @param spekeKeyProvider
     *        If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key
     *        provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings
     *        instead.
     */

    public void setSpekeKeyProvider(SpekeKeyProviderCmaf spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key
     * provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
     * 
     * @return If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant
     *         key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider
     *         settings instead.
     */

    public SpekeKeyProviderCmaf getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    /**
     * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key
     * provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
     * 
     * @param spekeKeyProvider
     *        If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key
     *        provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings
     *        instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryptionSettings withSpekeKeyProvider(SpekeKeyProviderCmaf spekeKeyProvider) {
        setSpekeKeyProvider(spekeKeyProvider);
        return this;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     * 
     * @param staticKeyProvider
     *        Use these settings to set up encryption with a static key provider.
     */

    public void setStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        this.staticKeyProvider = staticKeyProvider;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     * 
     * @return Use these settings to set up encryption with a static key provider.
     */

    public StaticKeyProvider getStaticKeyProvider() {
        return this.staticKeyProvider;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     * 
     * @param staticKeyProvider
     *        Use these settings to set up encryption with a static key provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryptionSettings withStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        setStaticKeyProvider(staticKeyProvider);
        return this;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For
     * more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * 
     * @param type
     *        Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard.
     *        For more information about SPEKE, see
     *        https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * @see CmafKeyProviderType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For
     * more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * 
     * @return Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard.
     *         For more information about SPEKE, see
     *         https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * @see CmafKeyProviderType
     */

    public String getType() {
        return this.type;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For
     * more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * 
     * @param type
     *        Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard.
     *        For more information about SPEKE, see
     *        https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafKeyProviderType
     */

    public CmafEncryptionSettings withType(String type) {
        setType(type);
        return this;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For
     * more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * 
     * @param type
     *        Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard.
     *        For more information about SPEKE, see
     *        https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafKeyProviderType
     */

    public CmafEncryptionSettings withType(CmafKeyProviderType type) {
        this.type = type.toString();
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
        if (getConstantInitializationVector() != null)
            sb.append("ConstantInitializationVector: ").append(getConstantInitializationVector()).append(",");
        if (getEncryptionMethod() != null)
            sb.append("EncryptionMethod: ").append(getEncryptionMethod()).append(",");
        if (getInitializationVectorInManifest() != null)
            sb.append("InitializationVectorInManifest: ").append(getInitializationVectorInManifest()).append(",");
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: ").append(getSpekeKeyProvider()).append(",");
        if (getStaticKeyProvider() != null)
            sb.append("StaticKeyProvider: ").append(getStaticKeyProvider()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafEncryptionSettings == false)
            return false;
        CmafEncryptionSettings other = (CmafEncryptionSettings) obj;
        if (other.getConstantInitializationVector() == null ^ this.getConstantInitializationVector() == null)
            return false;
        if (other.getConstantInitializationVector() != null && other.getConstantInitializationVector().equals(this.getConstantInitializationVector()) == false)
            return false;
        if (other.getEncryptionMethod() == null ^ this.getEncryptionMethod() == null)
            return false;
        if (other.getEncryptionMethod() != null && other.getEncryptionMethod().equals(this.getEncryptionMethod()) == false)
            return false;
        if (other.getInitializationVectorInManifest() == null ^ this.getInitializationVectorInManifest() == null)
            return false;
        if (other.getInitializationVectorInManifest() != null
                && other.getInitializationVectorInManifest().equals(this.getInitializationVectorInManifest()) == false)
            return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        if (other.getStaticKeyProvider() == null ^ this.getStaticKeyProvider() == null)
            return false;
        if (other.getStaticKeyProvider() != null && other.getStaticKeyProvider().equals(this.getStaticKeyProvider()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstantInitializationVector() == null) ? 0 : getConstantInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMethod() == null) ? 0 : getEncryptionMethod().hashCode());
        hashCode = prime * hashCode + ((getInitializationVectorInManifest() == null) ? 0 : getInitializationVectorInManifest().hashCode());
        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        hashCode = prime * hashCode + ((getStaticKeyProvider() == null) ? 0 : getStaticKeyProvider().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CmafEncryptionSettings clone() {
        try {
            return (CmafEncryptionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CmafEncryptionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
