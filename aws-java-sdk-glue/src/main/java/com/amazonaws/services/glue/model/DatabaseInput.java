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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure used to create or update a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DatabaseInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the database.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createTableDefaultPermissions;
    /**
     * <p>
     * A <code>DatabaseIdentifier</code> structure that describes a target database for resource linking.
     * </p>
     */
    private DatabaseIdentifier targetDatabase;

    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     * 
     * @param name
     *        The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     * 
     * @return The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     * 
     * @param name
     *        The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * 
     * @param description
     *        A description of the database.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * 
     * @return A description of the database.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * 
     * @param description
     *        A description of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * 
     * @param locationUri
     *        The location of the database (for example, an HDFS path).
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * 
     * @return The location of the database (for example, an HDFS path).
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * 
     * @param locationUri
     *        The location of the database (for example, an HDFS path).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * 
     * @return These key-value pairs define parameters and properties of the database.</p>
     *         <p>
     *         These key-value pairs define parameters and properties of the database.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define parameters and properties of the database.</p>
     *        <p>
     *        These key-value pairs define parameters and properties of the database.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define parameters and properties of the database.</p>
     *        <p>
     *        These key-value pairs define parameters and properties of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see DatabaseInput#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     * 
     * @return Creates a set of default permissions on the table for principals.
     */

    public java.util.List<PrincipalPermissions> getCreateTableDefaultPermissions() {
        return createTableDefaultPermissions;
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        Creates a set of default permissions on the table for principals.
     */

    public void setCreateTableDefaultPermissions(java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        if (createTableDefaultPermissions == null) {
            this.createTableDefaultPermissions = null;
            return;
        }

        this.createTableDefaultPermissions = new java.util.ArrayList<PrincipalPermissions>(createTableDefaultPermissions);
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateTableDefaultPermissions(java.util.Collection)} or
     * {@link #withCreateTableDefaultPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        Creates a set of default permissions on the table for principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withCreateTableDefaultPermissions(PrincipalPermissions... createTableDefaultPermissions) {
        if (this.createTableDefaultPermissions == null) {
            setCreateTableDefaultPermissions(new java.util.ArrayList<PrincipalPermissions>(createTableDefaultPermissions.length));
        }
        for (PrincipalPermissions ele : createTableDefaultPermissions) {
            this.createTableDefaultPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        Creates a set of default permissions on the table for principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withCreateTableDefaultPermissions(java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        setCreateTableDefaultPermissions(createTableDefaultPermissions);
        return this;
    }

    /**
     * <p>
     * A <code>DatabaseIdentifier</code> structure that describes a target database for resource linking.
     * </p>
     * 
     * @param targetDatabase
     *        A <code>DatabaseIdentifier</code> structure that describes a target database for resource linking.
     */

    public void setTargetDatabase(DatabaseIdentifier targetDatabase) {
        this.targetDatabase = targetDatabase;
    }

    /**
     * <p>
     * A <code>DatabaseIdentifier</code> structure that describes a target database for resource linking.
     * </p>
     * 
     * @return A <code>DatabaseIdentifier</code> structure that describes a target database for resource linking.
     */

    public DatabaseIdentifier getTargetDatabase() {
        return this.targetDatabase;
    }

    /**
     * <p>
     * A <code>DatabaseIdentifier</code> structure that describes a target database for resource linking.
     * </p>
     * 
     * @param targetDatabase
     *        A <code>DatabaseIdentifier</code> structure that describes a target database for resource linking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInput withTargetDatabase(DatabaseIdentifier targetDatabase) {
        setTargetDatabase(targetDatabase);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCreateTableDefaultPermissions() != null)
            sb.append("CreateTableDefaultPermissions: ").append(getCreateTableDefaultPermissions()).append(",");
        if (getTargetDatabase() != null)
            sb.append("TargetDatabase: ").append(getTargetDatabase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseInput == false)
            return false;
        DatabaseInput other = (DatabaseInput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCreateTableDefaultPermissions() == null ^ this.getCreateTableDefaultPermissions() == null)
            return false;
        if (other.getCreateTableDefaultPermissions() != null
                && other.getCreateTableDefaultPermissions().equals(this.getCreateTableDefaultPermissions()) == false)
            return false;
        if (other.getTargetDatabase() == null ^ this.getTargetDatabase() == null)
            return false;
        if (other.getTargetDatabase() != null && other.getTargetDatabase().equals(this.getTargetDatabase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCreateTableDefaultPermissions() == null) ? 0 : getCreateTableDefaultPermissions().hashCode());
        hashCode = prime * hashCode + ((getTargetDatabase() == null) ? 0 : getTargetDatabase().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseInput clone() {
        try {
            return (DatabaseInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DatabaseInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
