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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information for connecting to a Microsoft SharePoint data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SharePointConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharePointConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     */
    private String sharePointVersion;
    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     * </p>
     */
    private java.util.List<String> urls;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>. For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the index;
     * otherwise, <code>FALSE</code>.
     * </p>
     */
    private Boolean crawlAttachments;
    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need to be
     * updated in the index. Depending on the size of the SharePoint change log, it may take longer for Amazon Kendra to
     * use the change log than it takes it to determine the changed documents using the Amazon Kendra document crawler.
     * </p>
     */
    private Boolean useChangeLog;
    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;

    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to custom
     * fields in the Amazon Kendra index. You must first create the index fields using the <code>UpdateIndex</code>
     * operation before you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;
    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     */
    private String documentTitleFieldName;
    /**
     * <p>
     * A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     * <code>False</code>).
     * </p>
     */
    private Boolean disableLocalGroups;

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * 
     * @param sharePointVersion
     *        The version of Microsoft SharePoint that you are using as a data source.
     * @see SharePointVersion
     */

    public void setSharePointVersion(String sharePointVersion) {
        this.sharePointVersion = sharePointVersion;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * 
     * @return The version of Microsoft SharePoint that you are using as a data source.
     * @see SharePointVersion
     */

    public String getSharePointVersion() {
        return this.sharePointVersion;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * 
     * @param sharePointVersion
     *        The version of Microsoft SharePoint that you are using as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointVersion
     */

    public SharePointConfiguration withSharePointVersion(String sharePointVersion) {
        setSharePointVersion(sharePointVersion);
        return this;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * 
     * @param sharePointVersion
     *        The version of Microsoft SharePoint that you are using as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointVersion
     */

    public SharePointConfiguration withSharePointVersion(SharePointVersion sharePointVersion) {
        this.sharePointVersion = sharePointVersion.toString();
        return this;
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     * </p>
     * 
     * @return The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     */

    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     * </p>
     * 
     * @param urls
     *        The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     */

    public void setUrls(java.util.Collection<String> urls) {
        if (urls == null) {
            this.urls = null;
            return;
        }

        this.urls = new java.util.ArrayList<String>(urls);
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrls(java.util.Collection)} or {@link #withUrls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param urls
     *        The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withUrls(String... urls) {
        if (this.urls == null) {
            setUrls(new java.util.ArrayList<String>(urls.length));
        }
        for (String ele : urls) {
            this.urls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     * </p>
     * 
     * @param urls
     *        The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withUrls(java.util.Collection<String> urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>. For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     *        user/password pair. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft
     *        SharePoint Data Source</a>. For more information about AWS Secrets Manager, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager
     *        </a> in the <i>AWS Secrets Manager</i> user guide.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>. For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     *         user/password pair. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft
     *         SharePoint Data Source</a>. For more information about AWS Secrets Manager, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets
     *         Manager </a> in the <i>AWS Secrets Manager</i> user guide.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>. For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     *        user/password pair. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft
     *        SharePoint Data Source</a>. For more information about AWS Secrets Manager, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager
     *        </a> in the <i>AWS Secrets Manager</i> user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the index;
     * otherwise, <code>FALSE</code>.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the
     *        index; otherwise, <code>FALSE</code>.
     */

    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the index;
     * otherwise, <code>FALSE</code>.
     * </p>
     * 
     * @return <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the
     *         index; otherwise, <code>FALSE</code>.
     */

    public Boolean getCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the index;
     * otherwise, <code>FALSE</code>.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the
     *        index; otherwise, <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        setCrawlAttachments(crawlAttachments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the index;
     * otherwise, <code>FALSE</code>.
     * </p>
     * 
     * @return <code>TRUE</code> to include attachments to documents stored in your Microsoft SharePoint site in the
     *         index; otherwise, <code>FALSE</code>.
     */

    public Boolean isCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need to be
     * updated in the index. Depending on the size of the SharePoint change log, it may take longer for Amazon Kendra to
     * use the change log than it takes it to determine the changed documents using the Amazon Kendra document crawler.
     * </p>
     * 
     * @param useChangeLog
     *        Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need
     *        to be updated in the index. Depending on the size of the SharePoint change log, it may take longer for
     *        Amazon Kendra to use the change log than it takes it to determine the changed documents using the Amazon
     *        Kendra document crawler.
     */

    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need to be
     * updated in the index. Depending on the size of the SharePoint change log, it may take longer for Amazon Kendra to
     * use the change log than it takes it to determine the changed documents using the Amazon Kendra document crawler.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need
     *         to be updated in the index. Depending on the size of the SharePoint change log, it may take longer for
     *         Amazon Kendra to use the change log than it takes it to determine the changed documents using the Amazon
     *         Kendra document crawler.
     */

    public Boolean getUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need to be
     * updated in the index. Depending on the size of the SharePoint change log, it may take longer for Amazon Kendra to
     * use the change log than it takes it to determine the changed documents using the Amazon Kendra document crawler.
     * </p>
     * 
     * @param useChangeLog
     *        Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need
     *        to be updated in the index. Depending on the size of the SharePoint change log, it may take longer for
     *        Amazon Kendra to use the change log than it takes it to determine the changed documents using the Amazon
     *        Kendra document crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withUseChangeLog(Boolean useChangeLog) {
        setUseChangeLog(useChangeLog);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need to be
     * updated in the index. Depending on the size of the SharePoint change log, it may take longer for Amazon Kendra to
     * use the change log than it takes it to determine the changed documents using the Amazon Kendra document crawler.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to use the Microsoft SharePoint change log to determine the documents that need
     *         to be updated in the index. Depending on the size of the SharePoint change log, it may take longer for
     *         Amazon Kendra to use the change log than it takes it to determine the changed documents using the Amazon
     *         Kendra document crawler.
     */

    public Boolean isUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * 
     * @return A list of regular expression patterns. Documents that match the patterns are included in the index.
     *         Documents that don't match the patterns are excluded from the index. If a document matches both an
     *         inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *         <p>
     *         The regex is applied to the display URL of the SharePoint document.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns. Documents that match the patterns are included in the index.
     *        Documents that don't match the patterns are excluded from the index. If a document matches both an
     *        inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the display URL of the SharePoint document.
     */

    public void setInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        if (inclusionPatterns == null) {
            this.inclusionPatterns = null;
            return;
        }

        this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns. Documents that match the patterns are included in the index.
     *        Documents that don't match the patterns are excluded from the index. If a document matches both an
     *        inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withInclusionPatterns(String... inclusionPatterns) {
        if (this.inclusionPatterns == null) {
            setInclusionPatterns(new java.util.ArrayList<String>(inclusionPatterns.length));
        }
        for (String ele : inclusionPatterns) {
            this.inclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns. Documents that match the patterns are included in the index.
     *        Documents that don't match the patterns are excluded from the index. If a document matches both an
     *        inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * 
     * @return A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *         Documents that don't match the patterns are included in the index. If a document matches both an
     *         exclusion pattern and an inclusion pattern, the document is not included in the index.</p>
     *         <p>
     *         The regex is applied to the display URL of the SharePoint document.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *        Documents that don't match the patterns are included in the index. If a document matches both an exclusion
     *        pattern and an inclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the display URL of the SharePoint document.
     */

    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *        Documents that don't match the patterns are included in the index. If a document matches both an exclusion
     *        pattern and an inclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (this.exclusionPatterns == null) {
            setExclusionPatterns(new java.util.ArrayList<String>(exclusionPatterns.length));
        }
        for (String ele : exclusionPatterns) {
            this.exclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *        Documents that don't match the patterns are included in the index. If a document matches both an exclusion
     *        pattern and an inclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * @param vpcConfiguration
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * @return
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * @param vpcConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to custom
     * fields in the Amazon Kendra index. You must first create the index fields using the <code>UpdateIndex</code>
     * operation before you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to
     *         custom fields in the Amazon Kendra index. You must first create the index fields using the
     *         <code>UpdateIndex</code> operation before you map SharePoint attributes. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to custom
     * fields in the Amazon Kendra index. You must first create the index fields using the <code>UpdateIndex</code>
     * operation before you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to
     *        custom fields in the Amazon Kendra index. You must first create the index fields using the
     *        <code>UpdateIndex</code> operation before you map SharePoint attributes. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     */

    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to custom
     * fields in the Amazon Kendra index. You must first create the index fields using the <code>UpdateIndex</code>
     * operation before you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to
     *        custom fields in the Amazon Kendra index. You must first create the index fields using the
     *        <code>UpdateIndex</code> operation before you map SharePoint attributes. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (this.fieldMappings == null) {
            setFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fieldMappings) {
            this.fieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to custom
     * fields in the Amazon Kendra index. You must first create the index fields using the <code>UpdateIndex</code>
     * operation before you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Microsoft SharePoint attributes to
     *        custom fields in the Amazon Kendra index. You must first create the index fields using the
     *        <code>UpdateIndex</code> operation before you map SharePoint attributes. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping Data Source Fields</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The Microsoft SharePoint attribute field that contains the title of the document.
     */

    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     * 
     * @return The Microsoft SharePoint attribute field that contains the title of the document.
     */

    public String getDocumentTitleFieldName() {
        return this.documentTitleFieldName;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The Microsoft SharePoint attribute field that contains the title of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withDocumentTitleFieldName(String documentTitleFieldName) {
        setDocumentTitleFieldName(documentTitleFieldName);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     * <code>False</code>).
     * </p>
     * 
     * @param disableLocalGroups
     *        A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     *        <code>False</code>).
     */

    public void setDisableLocalGroups(Boolean disableLocalGroups) {
        this.disableLocalGroups = disableLocalGroups;
    }

    /**
     * <p>
     * A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     * <code>False</code>).
     * </p>
     * 
     * @return A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     *         <code>False</code>).
     */

    public Boolean getDisableLocalGroups() {
        return this.disableLocalGroups;
    }

    /**
     * <p>
     * A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     * <code>False</code>).
     * </p>
     * 
     * @param disableLocalGroups
     *        A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     *        <code>False</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withDisableLocalGroups(Boolean disableLocalGroups) {
        setDisableLocalGroups(disableLocalGroups);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     * <code>False</code>).
     * </p>
     * 
     * @return A Boolean value that specifies whether local groups are disabled (<code>True</code>) or enabled (
     *         <code>False</code>).
     */

    public Boolean isDisableLocalGroups() {
        return this.disableLocalGroups;
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
        if (getSharePointVersion() != null)
            sb.append("SharePointVersion: ").append(getSharePointVersion()).append(",");
        if (getUrls() != null)
            sb.append("Urls: ").append(getUrls()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: ").append(getCrawlAttachments()).append(",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: ").append(getUseChangeLog()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings()).append(",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: ").append(getDocumentTitleFieldName()).append(",");
        if (getDisableLocalGroups() != null)
            sb.append("DisableLocalGroups: ").append(getDisableLocalGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharePointConfiguration == false)
            return false;
        SharePointConfiguration other = (SharePointConfiguration) obj;
        if (other.getSharePointVersion() == null ^ this.getSharePointVersion() == null)
            return false;
        if (other.getSharePointVersion() != null && other.getSharePointVersion().equals(this.getSharePointVersion()) == false)
            return false;
        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getUseChangeLog() == null ^ this.getUseChangeLog() == null)
            return false;
        if (other.getUseChangeLog() != null && other.getUseChangeLog().equals(this.getUseChangeLog()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getDisableLocalGroups() == null ^ this.getDisableLocalGroups() == null)
            return false;
        if (other.getDisableLocalGroups() != null && other.getDisableLocalGroups().equals(this.getDisableLocalGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSharePointVersion() == null) ? 0 : getSharePointVersion().hashCode());
        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime * hashCode + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName().hashCode());
        hashCode = prime * hashCode + ((getDisableLocalGroups() == null) ? 0 : getDisableLocalGroups().hashCode());
        return hashCode;
    }

    @Override
    public SharePointConfiguration clone() {
        try {
            return (SharePointConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SharePointConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
