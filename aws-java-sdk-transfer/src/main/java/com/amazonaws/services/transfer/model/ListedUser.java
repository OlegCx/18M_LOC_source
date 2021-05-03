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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns properties of the user that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by
     * their ARN.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it to
     * <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     */
    private String homeDirectoryType;
    /**
     * <p>
     * Specifies the role that is in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM)
     * entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf. It allows
     * the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3
     * bucket.
     * </p>
     */
    private String role;
    /**
     * <p>
     * Specifies the number of SSH public keys stored for the user you specified.
     * </p>
     */
    private Integer sshPublicKeyCount;
    /**
     * <p>
     * Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
     * </p>
     * 
     * @param arn
     *        Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
     * </p>
     * 
     * @return Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
     * </p>
     * 
     * @param arn
     *        Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by
     * their ARN.
     * </p>
     * 
     * @param homeDirectory
     *        Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify
     *        by their ARN.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by
     * their ARN.
     * </p>
     * 
     * @return Specifies the location that files are written to or read from an Amazon S3 bucket for the user you
     *         specify by their ARN.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by
     * their ARN.
     * </p>
     * 
     * @param homeDirectory
     *        Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify
     *        by their ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it to
     * <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it
     *        to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer
     *        protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     *        <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * @see HomeDirectoryType
     */

    public void setHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
    }

    /**
     * <p>
     * Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it to
     * <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @return Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it
     *         to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer
     *         protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     *         <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * @see HomeDirectoryType
     */

    public String getHomeDirectoryType() {
        return this.homeDirectoryType;
    }

    /**
     * <p>
     * Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it to
     * <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it
     *        to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer
     *        protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     *        <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public ListedUser withHomeDirectoryType(String homeDirectoryType) {
        setHomeDirectoryType(homeDirectoryType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it to
     * <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it
     *        to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their file transfer
     *        protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     *        <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public ListedUser withHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the role that is in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM)
     * entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf. It allows
     * the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3
     * bucket.
     * </p>
     * 
     * @param role
     *        Specifies the role that is in use by this user. A <i>role</i> is an AWS Identity and Access Management
     *        (IAM) entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf.
     *        It allows the server to inherit the trust relationship that enables that user to perform file operations
     *        to their Amazon S3 bucket.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Specifies the role that is in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM)
     * entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf. It allows
     * the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3
     * bucket.
     * </p>
     * 
     * @return Specifies the role that is in use by this user. A <i>role</i> is an AWS Identity and Access Management
     *         (IAM) entity that, in this case, allows a file transfer protocol-enabled server to act on a user's
     *         behalf. It allows the server to inherit the trust relationship that enables that user to perform file
     *         operations to their Amazon S3 bucket.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * Specifies the role that is in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM)
     * entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf. It allows
     * the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3
     * bucket.
     * </p>
     * 
     * @param role
     *        Specifies the role that is in use by this user. A <i>role</i> is an AWS Identity and Access Management
     *        (IAM) entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf.
     *        It allows the server to inherit the trust relationship that enables that user to perform file operations
     *        to their Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Specifies the number of SSH public keys stored for the user you specified.
     * </p>
     * 
     * @param sshPublicKeyCount
     *        Specifies the number of SSH public keys stored for the user you specified.
     */

    public void setSshPublicKeyCount(Integer sshPublicKeyCount) {
        this.sshPublicKeyCount = sshPublicKeyCount;
    }

    /**
     * <p>
     * Specifies the number of SSH public keys stored for the user you specified.
     * </p>
     * 
     * @return Specifies the number of SSH public keys stored for the user you specified.
     */

    public Integer getSshPublicKeyCount() {
        return this.sshPublicKeyCount;
    }

    /**
     * <p>
     * Specifies the number of SSH public keys stored for the user you specified.
     * </p>
     * 
     * @param sshPublicKeyCount
     *        Specifies the number of SSH public keys stored for the user you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withSshPublicKeyCount(Integer sshPublicKeyCount) {
        setSshPublicKeyCount(sshPublicKeyCount);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     * 
     * @param userName
     *        Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     * 
     * @return Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     * 
     * @param userName
     *        Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withUserName(String userName) {
        setUserName(userName);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getHomeDirectory() != null)
            sb.append("HomeDirectory: ").append(getHomeDirectory()).append(",");
        if (getHomeDirectoryType() != null)
            sb.append("HomeDirectoryType: ").append(getHomeDirectoryType()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSshPublicKeyCount() != null)
            sb.append("SshPublicKeyCount: ").append(getSshPublicKeyCount()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedUser == false)
            return false;
        ListedUser other = (ListedUser) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getHomeDirectoryType() == null ^ this.getHomeDirectoryType() == null)
            return false;
        if (other.getHomeDirectoryType() != null && other.getHomeDirectoryType().equals(this.getHomeDirectoryType()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSshPublicKeyCount() == null ^ this.getSshPublicKeyCount() == null)
            return false;
        if (other.getSshPublicKeyCount() != null && other.getSshPublicKeyCount().equals(this.getSshPublicKeyCount()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectoryType() == null) ? 0 : getHomeDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKeyCount() == null) ? 0 : getSshPublicKeyCount().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public ListedUser clone() {
        try {
            return (ListedUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
