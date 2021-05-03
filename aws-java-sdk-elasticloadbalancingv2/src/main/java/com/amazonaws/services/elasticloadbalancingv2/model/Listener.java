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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/Listener" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Listener implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * [HTTPS or TLS listener] The default certificate for the listener.
     * </p>
     */
    private java.util.List<Certificate> certificates;
    /**
     * <p>
     * [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
     * </p>
     */
    private String sslPolicy;
    /**
     * <p>
     * The default actions for the listener.
     * </p>
     */
    private java.util.List<Action> defaultActions;
    /**
     * <p>
     * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     * </p>
     */
    private java.util.List<String> alpnPolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the load balancer.
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param port
     *        The port on which the load balancer is listening.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @return The port on which the load balancer is listening.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param port
     *        The port on which the load balancer is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @see ProtocolEnum
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @return The protocol for connections from clients to the load balancer.
     * @see ProtocolEnum
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public Listener withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @see ProtocolEnum
     */

    public void setProtocol(ProtocolEnum protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public Listener withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * [HTTPS or TLS listener] The default certificate for the listener.
     * </p>
     * 
     * @return [HTTPS or TLS listener] The default certificate for the listener.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * [HTTPS or TLS listener] The default certificate for the listener.
     * </p>
     * 
     * @param certificates
     *        [HTTPS or TLS listener] The default certificate for the listener.
     */

    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<Certificate>(certificates);
    }

    /**
     * <p>
     * [HTTPS or TLS listener] The default certificate for the listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        [HTTPS or TLS listener] The default certificate for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withCertificates(Certificate... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<Certificate>(certificates.length));
        }
        for (Certificate ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [HTTPS or TLS listener] The default certificate for the listener.
     * </p>
     * 
     * @param certificates
     *        [HTTPS or TLS listener] The default certificate for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
     * </p>
     * 
     * @param sslPolicy
     *        [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
     */

    public void setSslPolicy(String sslPolicy) {
        this.sslPolicy = sslPolicy;
    }

    /**
     * <p>
     * [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
     * </p>
     * 
     * @return [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
     */

    public String getSslPolicy() {
        return this.sslPolicy;
    }

    /**
     * <p>
     * [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
     * </p>
     * 
     * @param sslPolicy
     *        [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withSslPolicy(String sslPolicy) {
        setSslPolicy(sslPolicy);
        return this;
    }

    /**
     * <p>
     * The default actions for the listener.
     * </p>
     * 
     * @return The default actions for the listener.
     */

    public java.util.List<Action> getDefaultActions() {
        return defaultActions;
    }

    /**
     * <p>
     * The default actions for the listener.
     * </p>
     * 
     * @param defaultActions
     *        The default actions for the listener.
     */

    public void setDefaultActions(java.util.Collection<Action> defaultActions) {
        if (defaultActions == null) {
            this.defaultActions = null;
            return;
        }

        this.defaultActions = new java.util.ArrayList<Action>(defaultActions);
    }

    /**
     * <p>
     * The default actions for the listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultActions(java.util.Collection)} or {@link #withDefaultActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param defaultActions
     *        The default actions for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withDefaultActions(Action... defaultActions) {
        if (this.defaultActions == null) {
            setDefaultActions(new java.util.ArrayList<Action>(defaultActions.length));
        }
        for (Action ele : defaultActions) {
            this.defaultActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The default actions for the listener.
     * </p>
     * 
     * @param defaultActions
     *        The default actions for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withDefaultActions(java.util.Collection<Action> defaultActions) {
        setDefaultActions(defaultActions);
        return this;
    }

    /**
     * <p>
     * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     * </p>
     * 
     * @return [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     */

    public java.util.List<String> getAlpnPolicy() {
        return alpnPolicy;
    }

    /**
     * <p>
     * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     */

    public void setAlpnPolicy(java.util.Collection<String> alpnPolicy) {
        if (alpnPolicy == null) {
            this.alpnPolicy = null;
            return;
        }

        this.alpnPolicy = new java.util.ArrayList<String>(alpnPolicy);
    }

    /**
     * <p>
     * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlpnPolicy(java.util.Collection)} or {@link #withAlpnPolicy(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withAlpnPolicy(String... alpnPolicy) {
        if (this.alpnPolicy == null) {
            setAlpnPolicy(new java.util.ArrayList<String>(alpnPolicy.length));
        }
        for (String ele : alpnPolicy) {
            this.alpnPolicy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withAlpnPolicy(java.util.Collection<String> alpnPolicy) {
        setAlpnPolicy(alpnPolicy);
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates()).append(",");
        if (getSslPolicy() != null)
            sb.append("SslPolicy: ").append(getSslPolicy()).append(",");
        if (getDefaultActions() != null)
            sb.append("DefaultActions: ").append(getDefaultActions()).append(",");
        if (getAlpnPolicy() != null)
            sb.append("AlpnPolicy: ").append(getAlpnPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Listener == false)
            return false;
        Listener other = (Listener) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getSslPolicy() == null ^ this.getSslPolicy() == null)
            return false;
        if (other.getSslPolicy() != null && other.getSslPolicy().equals(this.getSslPolicy()) == false)
            return false;
        if (other.getDefaultActions() == null ^ this.getDefaultActions() == null)
            return false;
        if (other.getDefaultActions() != null && other.getDefaultActions().equals(this.getDefaultActions()) == false)
            return false;
        if (other.getAlpnPolicy() == null ^ this.getAlpnPolicy() == null)
            return false;
        if (other.getAlpnPolicy() != null && other.getAlpnPolicy().equals(this.getAlpnPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getSslPolicy() == null) ? 0 : getSslPolicy().hashCode());
        hashCode = prime * hashCode + ((getDefaultActions() == null) ? 0 : getDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getAlpnPolicy() == null) ? 0 : getAlpnPolicy().hashCode());
        return hashCode;
    }

    @Override
    public Listener clone() {
        try {
            return (Listener) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
