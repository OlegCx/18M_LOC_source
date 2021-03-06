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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionDependencies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackageVersionDependenciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A format that specifies the type of the package that contains the returned dependencies. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     */
    private String format;
    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     */
    private String namespace;
    /**
     * <p>
     * The name of the package that contains the returned package versions dependencies.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The version of the package that is specified in the request.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     */
    private String versionRevision;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     * <code>PackageDependency</code> </a> objects.
     * </p>
     */
    private java.util.List<PackageDependency> dependencies;

    /**
     * <p>
     * A format that specifies the type of the package that contains the returned dependencies. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        A format that specifies the type of the package that contains the returned dependencies. The valid values
     *        are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A format that specifies the type of the package that contains the returned dependencies. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A format that specifies the type of the package that contains the returned dependencies. The valid values
     *         are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>npm</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pypi</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maven</code>
     *         </p>
     *         </li>
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A format that specifies the type of the package that contains the returned dependencies. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        A format that specifies the type of the package that contains the returned dependencies. The valid values
     *        are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackageVersionDependenciesResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package that contains the returned dependencies. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        A format that specifies the type of the package that contains the returned dependencies. The valid values
     *        are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackageVersionDependenciesResult withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm package is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *        </p>
     *        </li>
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The namespace of the package. The package component that specifies its namespace depends on its type. For
     *         example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The namespace of a Maven package is its <code>groupId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of an npm package is its <code>scope</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *         </p>
     *         </li>
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm package is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesResult withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package that contains the returned package versions dependencies.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the returned package versions dependencies.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the returned package versions dependencies.
     * </p>
     * 
     * @return The name of the package that contains the returned package versions dependencies.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the returned package versions dependencies.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the returned package versions dependencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesResult withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The version of the package that is specified in the request.
     * </p>
     * 
     * @param version
     *        The version of the package that is specified in the request.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the package that is specified in the request.
     * </p>
     * 
     * @return The version of the package that is specified in the request.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the package that is specified in the request.
     * </p>
     * 
     * @param version
     *        The version of the package that is specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     * 
     * @param versionRevision
     *        The current revision associated with the package version.
     */

    public void setVersionRevision(String versionRevision) {
        this.versionRevision = versionRevision;
    }

    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     * 
     * @return The current revision associated with the package version.
     */

    public String getVersionRevision() {
        return this.versionRevision;
    }

    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     * 
     * @param versionRevision
     *        The current revision associated with the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesResult withVersionRevision(String versionRevision) {
        setVersionRevision(versionRevision);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     * <code>PackageDependency</code> </a> objects.
     * </p>
     * 
     * @return The returned list of <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     *         <code>PackageDependency</code> </a> objects.
     */

    public java.util.List<PackageDependency> getDependencies() {
        return dependencies;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     * <code>PackageDependency</code> </a> objects.
     * </p>
     * 
     * @param dependencies
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     *        <code>PackageDependency</code> </a> objects.
     */

    public void setDependencies(java.util.Collection<PackageDependency> dependencies) {
        if (dependencies == null) {
            this.dependencies = null;
            return;
        }

        this.dependencies = new java.util.ArrayList<PackageDependency>(dependencies);
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     * <code>PackageDependency</code> </a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependencies(java.util.Collection)} or {@link #withDependencies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependencies
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     *        <code>PackageDependency</code> </a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesResult withDependencies(PackageDependency... dependencies) {
        if (this.dependencies == null) {
            setDependencies(new java.util.ArrayList<PackageDependency>(dependencies.length));
        }
        for (PackageDependency ele : dependencies) {
            this.dependencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     * <code>PackageDependency</code> </a> objects.
     * </p>
     * 
     * @param dependencies
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html">
     *        <code>PackageDependency</code> </a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesResult withDependencies(java.util.Collection<PackageDependency> dependencies) {
        setDependencies(dependencies);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVersionRevision() != null)
            sb.append("VersionRevision: ").append(getVersionRevision()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDependencies() != null)
            sb.append("Dependencies: ").append(getDependencies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPackageVersionDependenciesResult == false)
            return false;
        ListPackageVersionDependenciesResult other = (ListPackageVersionDependenciesResult) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPackage() == null ^ this.getPackage() == null)
            return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionRevision() == null ^ this.getVersionRevision() == null)
            return false;
        if (other.getVersionRevision() != null && other.getVersionRevision().equals(this.getVersionRevision()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDependencies() == null ^ this.getDependencies() == null)
            return false;
        if (other.getDependencies() != null && other.getDependencies().equals(this.getDependencies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionRevision() == null) ? 0 : getVersionRevision().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDependencies() == null) ? 0 : getDependencies().hashCode());
        return hashCode;
    }

    @Override
    public ListPackageVersionDependenciesResult clone() {
        try {
            return (ListPackageVersionDependenciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
