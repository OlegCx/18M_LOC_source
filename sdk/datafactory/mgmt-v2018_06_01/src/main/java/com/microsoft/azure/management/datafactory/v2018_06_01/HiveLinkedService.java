/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Hive Server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HiveLinkedService.class)
@JsonTypeName("Hive")
@JsonFlatten
public class HiveLinkedService extends LinkedServiceInner {
    /**
     * IP address or host name of the Hive server, separated by ';' for
     * multiple hosts (only when serviceDiscoveryMode is enable).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The TCP port that the Hive server uses to listen for client connections.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * The type of Hive server. Possible values include: 'HiveServer1',
     * 'HiveServer2', 'HiveThriftServer'.
     */
    @JsonProperty(value = "typeProperties.serverType")
    private HiveServerType serverType;

    /**
     * The transport protocol to use in the Thrift layer. Possible values
     * include: 'Binary', 'SASL', 'HTTP '.
     */
    @JsonProperty(value = "typeProperties.thriftTransportProtocol")
    private HiveThriftTransportProtocol thriftTransportProtocol;

    /**
     * The authentication method used to access the Hive server. Possible
     * values include: 'Anonymous', 'Username', 'UsernameAndPassword',
     * 'WindowsAzureHDInsightService'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private HiveAuthenticationType authenticationType;

    /**
     * true to indicate using the ZooKeeper service, false not.
     */
    @JsonProperty(value = "typeProperties.serviceDiscoveryMode")
    private Object serviceDiscoveryMode;

    /**
     * The namespace on ZooKeeper under which Hive Server 2 nodes are added.
     */
    @JsonProperty(value = "typeProperties.zooKeeperNameSpace")
    private Object zooKeeperNameSpace;

    /**
     * Specifies whether the driver uses native HiveQL queries,or converts them
     * into an equivalent form in HiveQL.
     */
    @JsonProperty(value = "typeProperties.useNativeQuery")
    private Object useNativeQuery;

    /**
     * The user name that you use to access Hive Server.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * The password corresponding to the user name that you provided in the
     * Username field.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The partial URL corresponding to the Hive server.
     */
    @JsonProperty(value = "typeProperties.httpPath")
    private Object httpPath;

    /**
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false.
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /**
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /**
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value
     * is false.
     */
    @JsonProperty(value = "typeProperties.allowHostNameCNMismatch")
    private Object allowHostNameCNMismatch;

    /**
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false.
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get iP address or host name of the Hive server, separated by ';' for multiple hosts (only when serviceDiscoveryMode is enable).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set iP address or host name of the Hive server, separated by ';' for multiple hosts (only when serviceDiscoveryMode is enable).
     *
     * @param host the host value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the TCP port that the Hive server uses to listen for client connections.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the TCP port that the Hive server uses to listen for client connections.
     *
     * @param port the port value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the type of Hive server. Possible values include: 'HiveServer1', 'HiveServer2', 'HiveThriftServer'.
     *
     * @return the serverType value
     */
    public HiveServerType serverType() {
        return this.serverType;
    }

    /**
     * Set the type of Hive server. Possible values include: 'HiveServer1', 'HiveServer2', 'HiveThriftServer'.
     *
     * @param serverType the serverType value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withServerType(HiveServerType serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * Get the transport protocol to use in the Thrift layer. Possible values include: 'Binary', 'SASL', 'HTTP '.
     *
     * @return the thriftTransportProtocol value
     */
    public HiveThriftTransportProtocol thriftTransportProtocol() {
        return this.thriftTransportProtocol;
    }

    /**
     * Set the transport protocol to use in the Thrift layer. Possible values include: 'Binary', 'SASL', 'HTTP '.
     *
     * @param thriftTransportProtocol the thriftTransportProtocol value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withThriftTransportProtocol(HiveThriftTransportProtocol thriftTransportProtocol) {
        this.thriftTransportProtocol = thriftTransportProtocol;
        return this;
    }

    /**
     * Get the authentication method used to access the Hive server. Possible values include: 'Anonymous', 'Username', 'UsernameAndPassword', 'WindowsAzureHDInsightService'.
     *
     * @return the authenticationType value
     */
    public HiveAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication method used to access the Hive server. Possible values include: 'Anonymous', 'Username', 'UsernameAndPassword', 'WindowsAzureHDInsightService'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withAuthenticationType(HiveAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get true to indicate using the ZooKeeper service, false not.
     *
     * @return the serviceDiscoveryMode value
     */
    public Object serviceDiscoveryMode() {
        return this.serviceDiscoveryMode;
    }

    /**
     * Set true to indicate using the ZooKeeper service, false not.
     *
     * @param serviceDiscoveryMode the serviceDiscoveryMode value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withServiceDiscoveryMode(Object serviceDiscoveryMode) {
        this.serviceDiscoveryMode = serviceDiscoveryMode;
        return this;
    }

    /**
     * Get the namespace on ZooKeeper under which Hive Server 2 nodes are added.
     *
     * @return the zooKeeperNameSpace value
     */
    public Object zooKeeperNameSpace() {
        return this.zooKeeperNameSpace;
    }

    /**
     * Set the namespace on ZooKeeper under which Hive Server 2 nodes are added.
     *
     * @param zooKeeperNameSpace the zooKeeperNameSpace value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withZooKeeperNameSpace(Object zooKeeperNameSpace) {
        this.zooKeeperNameSpace = zooKeeperNameSpace;
        return this;
    }

    /**
     * Get specifies whether the driver uses native HiveQL queries,or converts them into an equivalent form in HiveQL.
     *
     * @return the useNativeQuery value
     */
    public Object useNativeQuery() {
        return this.useNativeQuery;
    }

    /**
     * Set specifies whether the driver uses native HiveQL queries,or converts them into an equivalent form in HiveQL.
     *
     * @param useNativeQuery the useNativeQuery value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withUseNativeQuery(Object useNativeQuery) {
        this.useNativeQuery = useNativeQuery;
        return this;
    }

    /**
     * Get the user name that you use to access Hive Server.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the user name that you use to access Hive Server.
     *
     * @param username the username value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password corresponding to the user name that you provided in the Username field.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password corresponding to the user name that you provided in the Username field.
     *
     * @param password the password value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the partial URL corresponding to the Hive server.
     *
     * @return the httpPath value
     */
    public Object httpPath() {
        return this.httpPath;
    }

    /**
     * Set the partial URL corresponding to the Hive server.
     *
     * @param httpPath the httpPath value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withHttpPath(Object httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get specifies whether the connections to the server are encrypted using SSL. The default value is false.
     *
     * @return the enableSsl value
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set specifies whether the connections to the server are encrypted using SSL. The default value is false.
     *
     * @param enableSsl the enableSsl value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostNameCNMismatch value
     */
    public Object allowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch;
    }

    /**
     * Set specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostNameCNMismatch the allowHostNameCNMismatch value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withAllowHostNameCNMismatch(Object allowHostNameCNMismatch) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        return this;
    }

    /**
     * Get specifies whether to allow self-signed certificates from the server. The default value is false.
     *
     * @return the allowSelfSignedServerCert value
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set specifies whether to allow self-signed certificates from the server. The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}