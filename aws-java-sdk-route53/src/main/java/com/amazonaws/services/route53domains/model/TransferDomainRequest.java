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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The TransferDomain request includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/TransferDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransferDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com, must be a
     * TLD that Route 53 supports. For a list of supported TLDs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code> in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String domainName;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String idnLangCode;
    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are registered for a minimum of one year.
     * The maximum period depends on the top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer durationInYears;
    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Nameserver> nameservers;
    /**
     * <p>
     * The authorization code for the domain. You get this value from the current registrar.
     * </p>
     */
    private String authCode;
    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect
     * after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     */
    private ContactDetail adminContact;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     */
    private ContactDetail registrantContact;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     */
    private ContactDetail techContact;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the admin contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean privacyProtectAdminContact;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the registrant contact (domain owner).
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean privacyProtectRegistrantContact;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the technical contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean privacyProtectTechContact;

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com, must be a
     * TLD that Route 53 supports. For a list of supported TLDs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code> in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainName
     *        The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com,
     *        must be a TLD that Route 53 supports. For a list of supported TLDs, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *        Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        The domain name can contain only the following characters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Letters a through z. Domain names are not case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Numbers 0 through 9.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Hyphen (-). You can't specify a hyphen at the beginning or end of a label.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Period (.) to separate the labels in the name, such as the <code>.</code> in <code>example.com</code>.
     *        </p>
     *        </li>
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com, must be a
     * TLD that Route 53 supports. For a list of supported TLDs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code> in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com,
     *         must be a TLD that Route 53 supports. For a list of supported TLDs, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *         Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *         <p>
     *         The domain name can contain only the following characters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Letters a through z. Domain names are not case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Numbers 0 through 9.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Hyphen (-). You can't specify a hyphen at the beginning or end of a label.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Period (.) to separate the labels in the name, such as the <code>.</code> in <code>example.com</code>.
     *         </p>
     *         </li>
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com, must be a
     * TLD that Route 53 supports. For a list of supported TLDs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code> in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainName
     *        The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com,
     *        must be a TLD that Route 53 supports. For a list of supported TLDs, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *        Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        The domain name can contain only the following characters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Letters a through z. Domain names are not case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Numbers 0 through 9.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Hyphen (-). You can't specify a hyphen at the beginning or end of a label.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Period (.) to separate the labels in the name, such as the <code>.</code> in <code>example.com</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param idnLangCode
     *        Reserved for future use.
     */

    public void setIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getIdnLangCode() {
        return this.idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param idnLangCode
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withIdnLangCode(String idnLangCode) {
        setIdnLangCode(idnLangCode);
        return this;
    }

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are registered for a minimum of one year.
     * The maximum period depends on the top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param durationInYears
     *        The number of years that you want to register the domain for. Domains are registered for a minimum of one
     *        year. The maximum period depends on the top-level domain.</p>
     *        <p>
     *        Default: 1
     */

    public void setDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are registered for a minimum of one year.
     * The maximum period depends on the top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @return The number of years that you want to register the domain for. Domains are registered for a minimum of one
     *         year. The maximum period depends on the top-level domain.</p>
     *         <p>
     *         Default: 1
     */

    public Integer getDurationInYears() {
        return this.durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are registered for a minimum of one year.
     * The maximum period depends on the top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param durationInYears
     *        The number of years that you want to register the domain for. Domains are registered for a minimum of one
     *        year. The maximum period depends on the top-level domain.</p>
     *        <p>
     *        Default: 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withDurationInYears(Integer durationInYears) {
        setDurationInYears(durationInYears);
        return this;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * 
     * @return Contains details for the host and glue IP addresses.
     */

    public java.util.List<Nameserver> getNameservers() {
        if (nameservers == null) {
            nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>();
        }
        return nameservers;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * 
     * @param nameservers
     *        Contains details for the host and glue IP addresses.
     */

    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }

        this.nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers);
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameservers(java.util.Collection)} or {@link #withNameservers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameservers
     *        Contains details for the host and glue IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withNameservers(Nameserver... nameservers) {
        if (this.nameservers == null) {
            setNameservers(new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers.length));
        }
        for (Nameserver ele : nameservers) {
            this.nameservers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * 
     * @param nameservers
     *        Contains details for the host and glue IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withNameservers(java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
        return this;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the current registrar.
     * </p>
     * 
     * @param authCode
     *        The authorization code for the domain. You get this value from the current registrar.
     */

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the current registrar.
     * </p>
     * 
     * @return The authorization code for the domain. You get this value from the current registrar.
     */

    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the current registrar.
     * </p>
     * 
     * @param authCode
     *        The authorization code for the domain. You get this value from the current registrar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withAuthCode(String authCode) {
        setAuthCode(authCode);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect
     * after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes
     *        effect after the account is charged.</p>
     *        <p>
     *        Default: true
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect
     * after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @return Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes
     *         effect after the account is charged.</p>
     *         <p>
     *         Default: true
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect
     * after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes
     *        effect after the account is charged.</p>
     *        <p>
     *        Default: true
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withAutoRenew(Boolean autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect
     * after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @return Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes
     *         effect after the account is charged.</p>
     *         <p>
     *         Default: true
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @param adminContact
     *        Provides detailed contact information.
     */

    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @return Provides detailed contact information.
     */

    public ContactDetail getAdminContact() {
        return this.adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @param adminContact
     *        Provides detailed contact information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withAdminContact(ContactDetail adminContact) {
        setAdminContact(adminContact);
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @param registrantContact
     *        Provides detailed contact information.
     */

    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @return Provides detailed contact information.
     */

    public ContactDetail getRegistrantContact() {
        return this.registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @param registrantContact
     *        Provides detailed contact information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withRegistrantContact(ContactDetail registrantContact) {
        setRegistrantContact(registrantContact);
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @param techContact
     *        Provides detailed contact information.
     */

    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @return Provides detailed contact information.
     */

    public ContactDetail getTechContact() {
        return this.techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * 
     * @param techContact
     *        Provides detailed contact information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withTechContact(ContactDetail techContact) {
        setTechContact(techContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the admin contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param privacyProtectAdminContact
     *        Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *        WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *        domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *        WHOIS queries return the information that you entered for the admin contact.</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setPrivacyProtectAdminContact(Boolean privacyProtectAdminContact) {
        this.privacyProtectAdminContact = privacyProtectAdminContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the admin contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *         WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *         domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *         WHOIS queries return the information that you entered for the admin contact.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getPrivacyProtectAdminContact() {
        return this.privacyProtectAdminContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the admin contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param privacyProtectAdminContact
     *        Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *        WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *        domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *        WHOIS queries return the information that you entered for the admin contact.</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withPrivacyProtectAdminContact(Boolean privacyProtectAdminContact) {
        setPrivacyProtectAdminContact(privacyProtectAdminContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the admin contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *         WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *         domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *         WHOIS queries return the information that you entered for the admin contact.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isPrivacyProtectAdminContact() {
        return this.privacyProtectAdminContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the registrant contact (domain owner).
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param privacyProtectRegistrantContact
     *        Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *        WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *        domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *        WHOIS queries return the information that you entered for the registrant contact (domain owner).</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setPrivacyProtectRegistrantContact(Boolean privacyProtectRegistrantContact) {
        this.privacyProtectRegistrantContact = privacyProtectRegistrantContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the registrant contact (domain owner).
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *         WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *         domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *         WHOIS queries return the information that you entered for the registrant contact (domain owner).</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getPrivacyProtectRegistrantContact() {
        return this.privacyProtectRegistrantContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the registrant contact (domain owner).
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param privacyProtectRegistrantContact
     *        Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *        WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *        domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *        WHOIS queries return the information that you entered for the registrant contact (domain owner).</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withPrivacyProtectRegistrantContact(Boolean privacyProtectRegistrantContact) {
        setPrivacyProtectRegistrantContact(privacyProtectRegistrantContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the registrant contact (domain owner).
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *         WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *         domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *         WHOIS queries return the information that you entered for the registrant contact (domain owner).</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isPrivacyProtectRegistrantContact() {
        return this.privacyProtectRegistrantContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the technical contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param privacyProtectTechContact
     *        Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *        WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *        domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *        WHOIS queries return the information that you entered for the technical contact.</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setPrivacyProtectTechContact(Boolean privacyProtectTechContact) {
        this.privacyProtectTechContact = privacyProtectTechContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the technical contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *         WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *         domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *         WHOIS queries return the information that you entered for the technical contact.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getPrivacyProtectTechContact() {
        return this.privacyProtectTechContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the technical contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param privacyProtectTechContact
     *        Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *        WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *        domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *        WHOIS queries return the information that you entered for the technical contact.</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainRequest withPrivacyProtectTechContact(Boolean privacyProtectTechContact) {
        setPrivacyProtectTechContact(privacyProtectTechContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>, WHOIS
     * ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or
     * for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>, WHOIS queries return
     * the information that you entered for the technical contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify <code>true</code>,
     *         WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org
     *         domains) or for our registrar associate, Gandi (for all other TLDs). If you specify <code>false</code>,
     *         WHOIS queries return the information that you entered for the technical contact.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isPrivacyProtectTechContact() {
        return this.privacyProtectTechContact;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getIdnLangCode() != null)
            sb.append("IdnLangCode: ").append(getIdnLangCode()).append(",");
        if (getDurationInYears() != null)
            sb.append("DurationInYears: ").append(getDurationInYears()).append(",");
        if (getNameservers() != null)
            sb.append("Nameservers: ").append(getNameservers()).append(",");
        if (getAuthCode() != null)
            sb.append("AuthCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: ").append(getAutoRenew()).append(",");
        if (getAdminContact() != null)
            sb.append("AdminContact: ").append("***Sensitive Data Redacted***").append(",");
        if (getRegistrantContact() != null)
            sb.append("RegistrantContact: ").append("***Sensitive Data Redacted***").append(",");
        if (getTechContact() != null)
            sb.append("TechContact: ").append("***Sensitive Data Redacted***").append(",");
        if (getPrivacyProtectAdminContact() != null)
            sb.append("PrivacyProtectAdminContact: ").append(getPrivacyProtectAdminContact()).append(",");
        if (getPrivacyProtectRegistrantContact() != null)
            sb.append("PrivacyProtectRegistrantContact: ").append(getPrivacyProtectRegistrantContact()).append(",");
        if (getPrivacyProtectTechContact() != null)
            sb.append("PrivacyProtectTechContact: ").append(getPrivacyProtectTechContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainRequest == false)
            return false;
        TransferDomainRequest other = (TransferDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getIdnLangCode() == null ^ this.getIdnLangCode() == null)
            return false;
        if (other.getIdnLangCode() != null && other.getIdnLangCode().equals(this.getIdnLangCode()) == false)
            return false;
        if (other.getDurationInYears() == null ^ this.getDurationInYears() == null)
            return false;
        if (other.getDurationInYears() != null && other.getDurationInYears().equals(this.getDurationInYears()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null && other.getAuthCode().equals(this.getAuthCode()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getAdminContact() == null ^ this.getAdminContact() == null)
            return false;
        if (other.getAdminContact() != null && other.getAdminContact().equals(this.getAdminContact()) == false)
            return false;
        if (other.getRegistrantContact() == null ^ this.getRegistrantContact() == null)
            return false;
        if (other.getRegistrantContact() != null && other.getRegistrantContact().equals(this.getRegistrantContact()) == false)
            return false;
        if (other.getTechContact() == null ^ this.getTechContact() == null)
            return false;
        if (other.getTechContact() != null && other.getTechContact().equals(this.getTechContact()) == false)
            return false;
        if (other.getPrivacyProtectAdminContact() == null ^ this.getPrivacyProtectAdminContact() == null)
            return false;
        if (other.getPrivacyProtectAdminContact() != null && other.getPrivacyProtectAdminContact().equals(this.getPrivacyProtectAdminContact()) == false)
            return false;
        if (other.getPrivacyProtectRegistrantContact() == null ^ this.getPrivacyProtectRegistrantContact() == null)
            return false;
        if (other.getPrivacyProtectRegistrantContact() != null
                && other.getPrivacyProtectRegistrantContact().equals(this.getPrivacyProtectRegistrantContact()) == false)
            return false;
        if (other.getPrivacyProtectTechContact() == null ^ this.getPrivacyProtectTechContact() == null)
            return false;
        if (other.getPrivacyProtectTechContact() != null && other.getPrivacyProtectTechContact().equals(this.getPrivacyProtectTechContact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getIdnLangCode() == null) ? 0 : getIdnLangCode().hashCode());
        hashCode = prime * hashCode + ((getDurationInYears() == null) ? 0 : getDurationInYears().hashCode());
        hashCode = prime * hashCode + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        hashCode = prime * hashCode + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getAdminContact() == null) ? 0 : getAdminContact().hashCode());
        hashCode = prime * hashCode + ((getRegistrantContact() == null) ? 0 : getRegistrantContact().hashCode());
        hashCode = prime * hashCode + ((getTechContact() == null) ? 0 : getTechContact().hashCode());
        hashCode = prime * hashCode + ((getPrivacyProtectAdminContact() == null) ? 0 : getPrivacyProtectAdminContact().hashCode());
        hashCode = prime * hashCode + ((getPrivacyProtectRegistrantContact() == null) ? 0 : getPrivacyProtectRegistrantContact().hashCode());
        hashCode = prime * hashCode + ((getPrivacyProtectTechContact() == null) ? 0 : getPrivacyProtectTechContact().hashCode());
        return hashCode;
    }

    @Override
    public TransferDomainRequest clone() {
        return (TransferDomainRequest) super.clone();
    }

}
