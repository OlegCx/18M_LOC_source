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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestIdentityProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestIdentityProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A system-assigned identifier for a specific server. That server's user authentication method is tested with a
     * user name and password.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     */
    private String serverProtocol;
    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     */
    private String sourceIp;
    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     */
    private String userPassword;

    /**
     * <p>
     * A system-assigned identifier for a specific server. That server's user authentication method is tested with a
     * user name and password.
     * </p>
     * 
     * @param serverId
     *        A system-assigned identifier for a specific server. That server's user authentication method is tested
     *        with a user name and password.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned identifier for a specific server. That server's user authentication method is tested with a
     * user name and password.
     * </p>
     * 
     * @return A system-assigned identifier for a specific server. That server's user authentication method is tested
     *         with a user name and password.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned identifier for a specific server. That server's user authentication method is tested with a
     * user name and password.
     * </p>
     * 
     * @param serverId
     *        A system-assigned identifier for a specific server. That server's user authentication method is tested
     *        with a user name and password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestIdentityProviderRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * 
     * @param serverProtocol
     *        The type of file transfer protocol to be tested.</p>
     *        <p>
     *        The available protocols are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Secure Shell (SSH) File Transfer Protocol (SFTP)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        File Transfer Protocol Secure (FTPS)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        File Transfer Protocol (FTP)
     *        </p>
     *        </li>
     * @see Protocol
     */

    public void setServerProtocol(String serverProtocol) {
        this.serverProtocol = serverProtocol;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of file transfer protocol to be tested.</p>
     *         <p>
     *         The available protocols are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Secure Shell (SSH) File Transfer Protocol (SFTP)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         File Transfer Protocol Secure (FTPS)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         File Transfer Protocol (FTP)
     *         </p>
     *         </li>
     * @see Protocol
     */

    public String getServerProtocol() {
        return this.serverProtocol;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * 
     * @param serverProtocol
     *        The type of file transfer protocol to be tested.</p>
     *        <p>
     *        The available protocols are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Secure Shell (SSH) File Transfer Protocol (SFTP)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        File Transfer Protocol Secure (FTPS)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        File Transfer Protocol (FTP)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public TestIdentityProviderRequest withServerProtocol(String serverProtocol) {
        setServerProtocol(serverProtocol);
        return this;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * 
     * @param serverProtocol
     *        The type of file transfer protocol to be tested.</p>
     *        <p>
     *        The available protocols are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Secure Shell (SSH) File Transfer Protocol (SFTP)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        File Transfer Protocol Secure (FTPS)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        File Transfer Protocol (FTP)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public TestIdentityProviderRequest withServerProtocol(Protocol serverProtocol) {
        this.serverProtocol = serverProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     * 
     * @param sourceIp
     *        The source IP address of the user account to be tested.
     */

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     * 
     * @return The source IP address of the user account to be tested.
     */

    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     * 
     * @param sourceIp
     *        The source IP address of the user account to be tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestIdentityProviderRequest withSourceIp(String sourceIp) {
        setSourceIp(sourceIp);
        return this;
    }

    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     * 
     * @param userName
     *        The name of the user account to be tested.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     * 
     * @return The name of the user account to be tested.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     * 
     * @param userName
     *        The name of the user account to be tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestIdentityProviderRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     * 
     * @param userPassword
     *        The password of the user account to be tested.
     */

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     * 
     * @return The password of the user account to be tested.
     */

    public String getUserPassword() {
        return this.userPassword;
    }

    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     * 
     * @param userPassword
     *        The password of the user account to be tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestIdentityProviderRequest withUserPassword(String userPassword) {
        setUserPassword(userPassword);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getServerProtocol() != null)
            sb.append("ServerProtocol: ").append(getServerProtocol()).append(",");
        if (getSourceIp() != null)
            sb.append("SourceIp: ").append(getSourceIp()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getUserPassword() != null)
            sb.append("UserPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestIdentityProviderRequest == false)
            return false;
        TestIdentityProviderRequest other = (TestIdentityProviderRequest) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getServerProtocol() == null ^ this.getServerProtocol() == null)
            return false;
        if (other.getServerProtocol() != null && other.getServerProtocol().equals(this.getServerProtocol()) == false)
            return false;
        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserPassword() == null ^ this.getUserPassword() == null)
            return false;
        if (other.getUserPassword() != null && other.getUserPassword().equals(this.getUserPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getServerProtocol() == null) ? 0 : getServerProtocol().hashCode());
        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        return hashCode;
    }

    @Override
    public TestIdentityProviderRequest clone() {
        return (TestIdentityProviderRequest) super.clone();
    }

}
