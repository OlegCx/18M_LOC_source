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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/GetSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     */
    private String botAlias;
    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * A string used to filter the intents returned in the <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their <code>checkpointLabel</code> field set to that string are
     * returned.
     * </p>
     */
    private String checkpointLabelFilter;

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     * 
     * @param botName
     *        The name of the bot that contains the session data.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     * 
     * @return The name of the bot that contains the session data.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     * 
     * @param botName
     *        The name of the bot that contains the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     * 
     * @param botAlias
     *        The alias in use for the bot that contains the session data.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     * 
     * @return The alias in use for the bot that contains the session data.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     * 
     * @param botAlias
     *        The alias in use for the bot that contains the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionRequest withBotAlias(String botAlias) {
        setBotAlias(botAlias);
        return this;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot.
     * </p>
     * 
     * @param userId
     *        The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your
     *        bot.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot.
     * </p>
     * 
     * @return The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your
     *         bot.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot.
     * </p>
     * 
     * @param userId
     *        The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your
     *        bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * A string used to filter the intents returned in the <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their <code>checkpointLabel</code> field set to that string are
     * returned.
     * </p>
     * 
     * @param checkpointLabelFilter
     *        A string used to filter the intents returned in the <code>recentIntentSummaryView</code> structure. </p>
     *        <p>
     *        When you specify a filter, only intents with their <code>checkpointLabel</code> field set to that string
     *        are returned.
     */

    public void setCheckpointLabelFilter(String checkpointLabelFilter) {
        this.checkpointLabelFilter = checkpointLabelFilter;
    }

    /**
     * <p>
     * A string used to filter the intents returned in the <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their <code>checkpointLabel</code> field set to that string are
     * returned.
     * </p>
     * 
     * @return A string used to filter the intents returned in the <code>recentIntentSummaryView</code> structure. </p>
     *         <p>
     *         When you specify a filter, only intents with their <code>checkpointLabel</code> field set to that string
     *         are returned.
     */

    public String getCheckpointLabelFilter() {
        return this.checkpointLabelFilter;
    }

    /**
     * <p>
     * A string used to filter the intents returned in the <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their <code>checkpointLabel</code> field set to that string are
     * returned.
     * </p>
     * 
     * @param checkpointLabelFilter
     *        A string used to filter the intents returned in the <code>recentIntentSummaryView</code> structure. </p>
     *        <p>
     *        When you specify a filter, only intents with their <code>checkpointLabel</code> field set to that string
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionRequest withCheckpointLabelFilter(String checkpointLabelFilter) {
        setCheckpointLabelFilter(checkpointLabelFilter);
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getBotAlias() != null)
            sb.append("BotAlias: ").append(getBotAlias()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getCheckpointLabelFilter() != null)
            sb.append("CheckpointLabelFilter: ").append(getCheckpointLabelFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionRequest == false)
            return false;
        GetSessionRequest other = (GetSessionRequest) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getCheckpointLabelFilter() == null ^ this.getCheckpointLabelFilter() == null)
            return false;
        if (other.getCheckpointLabelFilter() != null && other.getCheckpointLabelFilter().equals(this.getCheckpointLabelFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getCheckpointLabelFilter() == null) ? 0 : getCheckpointLabelFilter().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionRequest clone() {
        return (GetSessionRequest) super.clone();
    }

}
