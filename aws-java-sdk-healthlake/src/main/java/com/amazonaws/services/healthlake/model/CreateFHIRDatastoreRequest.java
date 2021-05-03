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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFHIRDatastoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user generated name for the Data Store.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * The FHIR version of the Data Store. The only supported version is R4.
     * </p>
     */
    private String datastoreTypeVersion;
    /**
     * <p>
     * Optional parameter to preload data upon creation of the Data Store. Currently, the only supported preloaded data
     * is synthetic data generated from Synthea.
     * </p>
     */
    private PreloadDataConfig preloadDataConfig;
    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The user generated name for the Data Store.
     * </p>
     * 
     * @param datastoreName
     *        The user generated name for the Data Store.
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * The user generated name for the Data Store.
     * </p>
     * 
     * @return The user generated name for the Data Store.
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * The user generated name for the Data Store.
     * </p>
     * 
     * @param datastoreName
     *        The user generated name for the Data Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFHIRDatastoreRequest withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * The FHIR version of the Data Store. The only supported version is R4.
     * </p>
     * 
     * @param datastoreTypeVersion
     *        The FHIR version of the Data Store. The only supported version is R4.
     * @see FHIRVersion
     */

    public void setDatastoreTypeVersion(String datastoreTypeVersion) {
        this.datastoreTypeVersion = datastoreTypeVersion;
    }

    /**
     * <p>
     * The FHIR version of the Data Store. The only supported version is R4.
     * </p>
     * 
     * @return The FHIR version of the Data Store. The only supported version is R4.
     * @see FHIRVersion
     */

    public String getDatastoreTypeVersion() {
        return this.datastoreTypeVersion;
    }

    /**
     * <p>
     * The FHIR version of the Data Store. The only supported version is R4.
     * </p>
     * 
     * @param datastoreTypeVersion
     *        The FHIR version of the Data Store. The only supported version is R4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FHIRVersion
     */

    public CreateFHIRDatastoreRequest withDatastoreTypeVersion(String datastoreTypeVersion) {
        setDatastoreTypeVersion(datastoreTypeVersion);
        return this;
    }

    /**
     * <p>
     * The FHIR version of the Data Store. The only supported version is R4.
     * </p>
     * 
     * @param datastoreTypeVersion
     *        The FHIR version of the Data Store. The only supported version is R4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FHIRVersion
     */

    public CreateFHIRDatastoreRequest withDatastoreTypeVersion(FHIRVersion datastoreTypeVersion) {
        this.datastoreTypeVersion = datastoreTypeVersion.toString();
        return this;
    }

    /**
     * <p>
     * Optional parameter to preload data upon creation of the Data Store. Currently, the only supported preloaded data
     * is synthetic data generated from Synthea.
     * </p>
     * 
     * @param preloadDataConfig
     *        Optional parameter to preload data upon creation of the Data Store. Currently, the only supported
     *        preloaded data is synthetic data generated from Synthea.
     */

    public void setPreloadDataConfig(PreloadDataConfig preloadDataConfig) {
        this.preloadDataConfig = preloadDataConfig;
    }

    /**
     * <p>
     * Optional parameter to preload data upon creation of the Data Store. Currently, the only supported preloaded data
     * is synthetic data generated from Synthea.
     * </p>
     * 
     * @return Optional parameter to preload data upon creation of the Data Store. Currently, the only supported
     *         preloaded data is synthetic data generated from Synthea.
     */

    public PreloadDataConfig getPreloadDataConfig() {
        return this.preloadDataConfig;
    }

    /**
     * <p>
     * Optional parameter to preload data upon creation of the Data Store. Currently, the only supported preloaded data
     * is synthetic data generated from Synthea.
     * </p>
     * 
     * @param preloadDataConfig
     *        Optional parameter to preload data upon creation of the Data Store. Currently, the only supported
     *        preloaded data is synthetic data generated from Synthea.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFHIRDatastoreRequest withPreloadDataConfig(PreloadDataConfig preloadDataConfig) {
        setPreloadDataConfig(preloadDataConfig);
        return this;
    }

    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @param clientToken
     *        Optional user provided token used for ensuring idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @return Optional user provided token used for ensuring idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @param clientToken
     *        Optional user provided token used for ensuring idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFHIRDatastoreRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getDatastoreName() != null)
            sb.append("DatastoreName: ").append(getDatastoreName()).append(",");
        if (getDatastoreTypeVersion() != null)
            sb.append("DatastoreTypeVersion: ").append(getDatastoreTypeVersion()).append(",");
        if (getPreloadDataConfig() != null)
            sb.append("PreloadDataConfig: ").append(getPreloadDataConfig()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFHIRDatastoreRequest == false)
            return false;
        CreateFHIRDatastoreRequest other = (CreateFHIRDatastoreRequest) obj;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getDatastoreTypeVersion() == null ^ this.getDatastoreTypeVersion() == null)
            return false;
        if (other.getDatastoreTypeVersion() != null && other.getDatastoreTypeVersion().equals(this.getDatastoreTypeVersion()) == false)
            return false;
        if (other.getPreloadDataConfig() == null ^ this.getPreloadDataConfig() == null)
            return false;
        if (other.getPreloadDataConfig() != null && other.getPreloadDataConfig().equals(this.getPreloadDataConfig()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getDatastoreTypeVersion() == null) ? 0 : getDatastoreTypeVersion().hashCode());
        hashCode = prime * hashCode + ((getPreloadDataConfig() == null) ? 0 : getPreloadDataConfig().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateFHIRDatastoreRequest clone() {
        return (CreateFHIRDatastoreRequest) super.clone();
    }

}
