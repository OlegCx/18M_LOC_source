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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetCoreDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoreDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the core definition. */
    private String coreDefinitionId;
    /**
     * The ID of the core definition version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the version is
     * the last one that was associated with a core definition, the value also maps to the ''LatestVersion'' property of
     * the corresponding ''DefinitionInformation'' object.
     */
    private String coreDefinitionVersionId;

    /**
     * The ID of the core definition.
     * 
     * @param coreDefinitionId
     *        The ID of the core definition.
     */

    public void setCoreDefinitionId(String coreDefinitionId) {
        this.coreDefinitionId = coreDefinitionId;
    }

    /**
     * The ID of the core definition.
     * 
     * @return The ID of the core definition.
     */

    public String getCoreDefinitionId() {
        return this.coreDefinitionId;
    }

    /**
     * The ID of the core definition.
     * 
     * @param coreDefinitionId
     *        The ID of the core definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDefinitionVersionRequest withCoreDefinitionId(String coreDefinitionId) {
        setCoreDefinitionId(coreDefinitionId);
        return this;
    }

    /**
     * The ID of the core definition version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the version is
     * the last one that was associated with a core definition, the value also maps to the ''LatestVersion'' property of
     * the corresponding ''DefinitionInformation'' object.
     * 
     * @param coreDefinitionVersionId
     *        The ID of the core definition version. This value maps to the ''Version'' property of the corresponding
     *        ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the
     *        version is the last one that was associated with a core definition, the value also maps to the
     *        ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
     */

    public void setCoreDefinitionVersionId(String coreDefinitionVersionId) {
        this.coreDefinitionVersionId = coreDefinitionVersionId;
    }

    /**
     * The ID of the core definition version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the version is
     * the last one that was associated with a core definition, the value also maps to the ''LatestVersion'' property of
     * the corresponding ''DefinitionInformation'' object.
     * 
     * @return The ID of the core definition version. This value maps to the ''Version'' property of the corresponding
     *         ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the
     *         version is the last one that was associated with a core definition, the value also maps to the
     *         ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
     */

    public String getCoreDefinitionVersionId() {
        return this.coreDefinitionVersionId;
    }

    /**
     * The ID of the core definition version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the version is
     * the last one that was associated with a core definition, the value also maps to the ''LatestVersion'' property of
     * the corresponding ''DefinitionInformation'' object.
     * 
     * @param coreDefinitionVersionId
     *        The ID of the core definition version. This value maps to the ''Version'' property of the corresponding
     *        ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the
     *        version is the last one that was associated with a core definition, the value also maps to the
     *        ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDefinitionVersionRequest withCoreDefinitionVersionId(String coreDefinitionVersionId) {
        setCoreDefinitionVersionId(coreDefinitionVersionId);
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
        if (getCoreDefinitionId() != null)
            sb.append("CoreDefinitionId: ").append(getCoreDefinitionId()).append(",");
        if (getCoreDefinitionVersionId() != null)
            sb.append("CoreDefinitionVersionId: ").append(getCoreDefinitionVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCoreDefinitionVersionRequest == false)
            return false;
        GetCoreDefinitionVersionRequest other = (GetCoreDefinitionVersionRequest) obj;
        if (other.getCoreDefinitionId() == null ^ this.getCoreDefinitionId() == null)
            return false;
        if (other.getCoreDefinitionId() != null && other.getCoreDefinitionId().equals(this.getCoreDefinitionId()) == false)
            return false;
        if (other.getCoreDefinitionVersionId() == null ^ this.getCoreDefinitionVersionId() == null)
            return false;
        if (other.getCoreDefinitionVersionId() != null && other.getCoreDefinitionVersionId().equals(this.getCoreDefinitionVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreDefinitionId() == null) ? 0 : getCoreDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getCoreDefinitionVersionId() == null) ? 0 : getCoreDefinitionVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetCoreDefinitionVersionRequest clone() {
        return (GetCoreDefinitionVersionRequest) super.clone();
    }

}
