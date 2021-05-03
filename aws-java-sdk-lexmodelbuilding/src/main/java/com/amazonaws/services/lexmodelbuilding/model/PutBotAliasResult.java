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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBotAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date
     * are the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The checksum for the current version of the alias.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the alias.
     * </p>
     */
    private ConversationLogsResponse conversationLogs;
    /**
     * <p>
     * A list of tags associated with a bot.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @param name
     *        The name of the alias.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @return The name of the alias.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @param name
     *        The name of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @return A description of the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the alias points to.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     * 
     * @return The version of the bot that the alias points to.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the alias points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * 
     * @param botName
     *        The name of the bot that the alias points to.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * 
     * @return The name of the bot that the alias points to.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * 
     * @param botName
     *        The name of the bot that the alias points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date
     * are the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the bot alias was updated. When you create a resource, the creation date and the last
     *        updated date are the same.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date
     * are the same.
     * </p>
     * 
     * @return The date that the bot alias was updated. When you create a resource, the creation date and the last
     *         updated date are the same.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date
     * are the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the bot alias was updated. When you create a resource, the creation date and the last
     *        updated date are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the bot alias was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     * 
     * @return The date that the bot alias was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the bot alias was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The checksum for the current version of the alias.
     * </p>
     * 
     * @param checksum
     *        The checksum for the current version of the alias.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The checksum for the current version of the alias.
     * </p>
     * 
     * @return The checksum for the current version of the alias.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The checksum for the current version of the alias.
     * </p>
     * 
     * @param checksum
     *        The checksum for the current version of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the alias.
     * </p>
     * 
     * @param conversationLogs
     *        The settings that determine how Amazon Lex uses conversation logs for the alias.
     */

    public void setConversationLogs(ConversationLogsResponse conversationLogs) {
        this.conversationLogs = conversationLogs;
    }

    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the alias.
     * </p>
     * 
     * @return The settings that determine how Amazon Lex uses conversation logs for the alias.
     */

    public ConversationLogsResponse getConversationLogs() {
        return this.conversationLogs;
    }

    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the alias.
     * </p>
     * 
     * @param conversationLogs
     *        The settings that determine how Amazon Lex uses conversation logs for the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withConversationLogs(ConversationLogsResponse conversationLogs) {
        setConversationLogs(conversationLogs);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a bot.
     * </p>
     * 
     * @return A list of tags associated with a bot.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with a bot.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a bot.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags associated with a bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a bot.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getConversationLogs() != null)
            sb.append("ConversationLogs: ").append(getConversationLogs()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBotAliasResult == false)
            return false;
        PutBotAliasResult other = (PutBotAliasResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getConversationLogs() == null ^ this.getConversationLogs() == null)
            return false;
        if (other.getConversationLogs() != null && other.getConversationLogs().equals(this.getConversationLogs()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getConversationLogs() == null) ? 0 : getConversationLogs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutBotAliasResult clone() {
        try {
            return (PutBotAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
