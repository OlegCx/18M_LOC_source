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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PutSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;
    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the conversation.
     * </p>
     */
    private DialogAction dialogAction;
    /**
     * <p>
     * A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label on an
     * intent and modify attributes of intents. You can also use it to remove or add intent summary objects to the list.
     * </p>
     * <p>
     * An intent that you modify or add to the list must make sense for the bot. For example, the intent name must be
     * valid for the bot. You must provide valid values for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>intentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * slot names
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElict</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the contents
     * of the new summary view replaces the old summary view. For example, if a <code>GetSession</code> request returns
     * three intents in the summary view and you call <code>PutSession</code> with one intent in the summary view, the
     * next call to <code>GetSession</code> will only return one intent.
     * </p>
     */
    private java.util.List<IntentSummary> recentIntentSummaryView;
    /**
     * <p>
     * The message that Amazon Lex returns in the response can be either text or speech based depending on the value of
     * this field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech in the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as <code>audio/pcm</code> in 16-bit, little endian
     * format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String accept;
    /**
     * <p>
     * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request,
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     */
    private java.util.List<ActiveContext> activeContexts;

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

    public PutSessionRequest withBotName(String botName) {
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

    public PutSessionRequest withBotAlias(String botAlias) {
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

    public PutSessionRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @return Map of key/value pairs representing the session-specific context information. It contains application
     *         information passed between Amazon Lex and a client application.
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing the session-specific context information. It contains application
     *        information passed between Amazon Lex and a client application.
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing the session-specific context information. It contains application
     *        information passed between Amazon Lex and a client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * Add a single SessionAttributes entry
     *
     * @see PutSessionRequest#withSessionAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest addSessionAttributesEntry(String key, String value) {
        if (null == this.sessionAttributes) {
            this.sessionAttributes = new java.util.HashMap<String, String>();
        }
        if (this.sessionAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sessionAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SessionAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest clearSessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the conversation.
     * </p>
     * 
     * @param dialogAction
     *        Sets the next action that the bot should take to fulfill the conversation.
     */

    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the conversation.
     * </p>
     * 
     * @return Sets the next action that the bot should take to fulfill the conversation.
     */

    public DialogAction getDialogAction() {
        return this.dialogAction;
    }

    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the conversation.
     * </p>
     * 
     * @param dialogAction
     *        Sets the next action that the bot should take to fulfill the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withDialogAction(DialogAction dialogAction) {
        setDialogAction(dialogAction);
        return this;
    }

    /**
     * <p>
     * A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label on an
     * intent and modify attributes of intents. You can also use it to remove or add intent summary objects to the list.
     * </p>
     * <p>
     * An intent that you modify or add to the list must make sense for the bot. For example, the intent name must be
     * valid for the bot. You must provide valid values for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>intentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * slot names
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElict</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the contents
     * of the new summary view replaces the old summary view. For example, if a <code>GetSession</code> request returns
     * three intents in the summary view and you call <code>PutSession</code> with one intent in the summary view, the
     * next call to <code>GetSession</code> will only return one intent.
     * </p>
     * 
     * @return A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint
     *         label on an intent and modify attributes of intents. You can also use it to remove or add intent summary
     *         objects to the list.</p>
     *         <p>
     *         An intent that you modify or add to the list must make sense for the bot. For example, the intent name
     *         must be valid for the bot. You must provide valid values for:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>intentName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         slot names
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>slotToElict</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the
     *         contents of the new summary view replaces the old summary view. For example, if a <code>GetSession</code>
     *         request returns three intents in the summary view and you call <code>PutSession</code> with one intent in
     *         the summary view, the next call to <code>GetSession</code> will only return one intent.
     */

    public java.util.List<IntentSummary> getRecentIntentSummaryView() {
        return recentIntentSummaryView;
    }

    /**
     * <p>
     * A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label on an
     * intent and modify attributes of intents. You can also use it to remove or add intent summary objects to the list.
     * </p>
     * <p>
     * An intent that you modify or add to the list must make sense for the bot. For example, the intent name must be
     * valid for the bot. You must provide valid values for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>intentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * slot names
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElict</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the contents
     * of the new summary view replaces the old summary view. For example, if a <code>GetSession</code> request returns
     * three intents in the summary view and you call <code>PutSession</code> with one intent in the summary view, the
     * next call to <code>GetSession</code> will only return one intent.
     * </p>
     * 
     * @param recentIntentSummaryView
     *        A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label
     *        on an intent and modify attributes of intents. You can also use it to remove or add intent summary objects
     *        to the list.</p>
     *        <p>
     *        An intent that you modify or add to the list must make sense for the bot. For example, the intent name
     *        must be valid for the bot. You must provide valid values for:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>intentName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        slot names
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>slotToElict</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the
     *        contents of the new summary view replaces the old summary view. For example, if a <code>GetSession</code>
     *        request returns three intents in the summary view and you call <code>PutSession</code> with one intent in
     *        the summary view, the next call to <code>GetSession</code> will only return one intent.
     */

    public void setRecentIntentSummaryView(java.util.Collection<IntentSummary> recentIntentSummaryView) {
        if (recentIntentSummaryView == null) {
            this.recentIntentSummaryView = null;
            return;
        }

        this.recentIntentSummaryView = new java.util.ArrayList<IntentSummary>(recentIntentSummaryView);
    }

    /**
     * <p>
     * A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label on an
     * intent and modify attributes of intents. You can also use it to remove or add intent summary objects to the list.
     * </p>
     * <p>
     * An intent that you modify or add to the list must make sense for the bot. For example, the intent name must be
     * valid for the bot. You must provide valid values for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>intentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * slot names
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElict</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the contents
     * of the new summary view replaces the old summary view. For example, if a <code>GetSession</code> request returns
     * three intents in the summary view and you call <code>PutSession</code> with one intent in the summary view, the
     * next call to <code>GetSession</code> will only return one intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecentIntentSummaryView(java.util.Collection)} or
     * {@link #withRecentIntentSummaryView(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recentIntentSummaryView
     *        A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label
     *        on an intent and modify attributes of intents. You can also use it to remove or add intent summary objects
     *        to the list.</p>
     *        <p>
     *        An intent that you modify or add to the list must make sense for the bot. For example, the intent name
     *        must be valid for the bot. You must provide valid values for:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>intentName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        slot names
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>slotToElict</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the
     *        contents of the new summary view replaces the old summary view. For example, if a <code>GetSession</code>
     *        request returns three intents in the summary view and you call <code>PutSession</code> with one intent in
     *        the summary view, the next call to <code>GetSession</code> will only return one intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withRecentIntentSummaryView(IntentSummary... recentIntentSummaryView) {
        if (this.recentIntentSummaryView == null) {
            setRecentIntentSummaryView(new java.util.ArrayList<IntentSummary>(recentIntentSummaryView.length));
        }
        for (IntentSummary ele : recentIntentSummaryView) {
            this.recentIntentSummaryView.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label on an
     * intent and modify attributes of intents. You can also use it to remove or add intent summary objects to the list.
     * </p>
     * <p>
     * An intent that you modify or add to the list must make sense for the bot. For example, the intent name must be
     * valid for the bot. You must provide valid values for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>intentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * slot names
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElict</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the contents
     * of the new summary view replaces the old summary view. For example, if a <code>GetSession</code> request returns
     * three intents in the summary view and you call <code>PutSession</code> with one intent in the summary view, the
     * next call to <code>GetSession</code> will only return one intent.
     * </p>
     * 
     * @param recentIntentSummaryView
     *        A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label
     *        on an intent and modify attributes of intents. You can also use it to remove or add intent summary objects
     *        to the list.</p>
     *        <p>
     *        An intent that you modify or add to the list must make sense for the bot. For example, the intent name
     *        must be valid for the bot. You must provide valid values for:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>intentName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        slot names
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>slotToElict</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you send the <code>recentIntentSummaryView</code> parameter in a <code>PutSession</code> request, the
     *        contents of the new summary view replaces the old summary view. For example, if a <code>GetSession</code>
     *        request returns three intents in the summary view and you call <code>PutSession</code> with one intent in
     *        the summary view, the next call to <code>GetSession</code> will only return one intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withRecentIntentSummaryView(java.util.Collection<IntentSummary> recentIntentSummaryView) {
        setRecentIntentSummaryView(recentIntentSummaryView);
        return this;
    }

    /**
     * <p>
     * The message that Amazon Lex returns in the response can be either text or speech based depending on the value of
     * this field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech in the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as <code>audio/pcm</code> in 16-bit, little endian
     * format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param accept
     *        The message that Amazon Lex returns in the response can be either text or speech based depending on the
     *        value of this field.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *        Amazon Polly to generate the speech in the configuration that you specify. For example, if you specify
     *        <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>audio/pcm</code>, the speech is returned as <code>audio/pcm</code> in 16-bit, little
     *        endian format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following are the accepted values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/mpeg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/ogg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/pcm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/*</code> (defaults to mpeg)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>text/plain; charset=utf-8</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The message that Amazon Lex returns in the response can be either text or speech based depending on the value of
     * this field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech in the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as <code>audio/pcm</code> in 16-bit, little endian
     * format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The message that Amazon Lex returns in the response can be either text or speech based depending on the
     *         value of this field.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *         Amazon Polly to generate the speech in the configuration that you specify. For example, if you specify
     *         <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value is <code>audio/pcm</code>, the speech is returned as <code>audio/pcm</code> in 16-bit,
     *         little endian format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The following are the accepted values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>audio/mpeg</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/ogg</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/pcm</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/*</code> (defaults to mpeg)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>text/plain; charset=utf-8</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * The message that Amazon Lex returns in the response can be either text or speech based depending on the value of
     * this field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech in the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as <code>audio/pcm</code> in 16-bit, little endian
     * format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param accept
     *        The message that Amazon Lex returns in the response can be either text or speech based depending on the
     *        value of this field.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *        Amazon Polly to generate the speech in the configuration that you specify. For example, if you specify
     *        <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>audio/pcm</code>, the speech is returned as <code>audio/pcm</code> in 16-bit, little
     *        endian format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following are the accepted values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/mpeg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/ogg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/pcm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/*</code> (defaults to mpeg)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>text/plain; charset=utf-8</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request,
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     * 
     * @return A list of contexts active for the request. A context can be activated when a previous intent is
     *         fulfilled, or by including the context in the request,</p>
     *         <p>
     *         If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the
     *         session. If you specify an empty list, all contexts for the session are cleared.
     */

    public java.util.List<ActiveContext> getActiveContexts() {
        return activeContexts;
    }

    /**
     * <p>
     * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request,
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     * 
     * @param activeContexts
     *        A list of contexts active for the request. A context can be activated when a previous intent is fulfilled,
     *        or by including the context in the request,</p>
     *        <p>
     *        If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session.
     *        If you specify an empty list, all contexts for the session are cleared.
     */

    public void setActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        if (activeContexts == null) {
            this.activeContexts = null;
            return;
        }

        this.activeContexts = new java.util.ArrayList<ActiveContext>(activeContexts);
    }

    /**
     * <p>
     * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request,
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveContexts(java.util.Collection)} or {@link #withActiveContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param activeContexts
     *        A list of contexts active for the request. A context can be activated when a previous intent is fulfilled,
     *        or by including the context in the request,</p>
     *        <p>
     *        If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session.
     *        If you specify an empty list, all contexts for the session are cleared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withActiveContexts(ActiveContext... activeContexts) {
        if (this.activeContexts == null) {
            setActiveContexts(new java.util.ArrayList<ActiveContext>(activeContexts.length));
        }
        for (ActiveContext ele : activeContexts) {
            this.activeContexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request,
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     * 
     * @param activeContexts
     *        A list of contexts active for the request. A context can be activated when a previous intent is fulfilled,
     *        or by including the context in the request,</p>
     *        <p>
     *        If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session.
     *        If you specify an empty list, all contexts for the session are cleared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        setActiveContexts(activeContexts);
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
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getDialogAction() != null)
            sb.append("DialogAction: ").append(getDialogAction()).append(",");
        if (getRecentIntentSummaryView() != null)
            sb.append("RecentIntentSummaryView: ").append(getRecentIntentSummaryView()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getActiveContexts() != null)
            sb.append("ActiveContexts: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSessionRequest == false)
            return false;
        PutSessionRequest other = (PutSessionRequest) obj;
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
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getDialogAction() == null ^ this.getDialogAction() == null)
            return false;
        if (other.getDialogAction() != null && other.getDialogAction().equals(this.getDialogAction()) == false)
            return false;
        if (other.getRecentIntentSummaryView() == null ^ this.getRecentIntentSummaryView() == null)
            return false;
        if (other.getRecentIntentSummaryView() != null && other.getRecentIntentSummaryView().equals(this.getRecentIntentSummaryView()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getActiveContexts() == null ^ this.getActiveContexts() == null)
            return false;
        if (other.getActiveContexts() != null && other.getActiveContexts().equals(this.getActiveContexts()) == false)
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
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getDialogAction() == null) ? 0 : getDialogAction().hashCode());
        hashCode = prime * hashCode + ((getRecentIntentSummaryView() == null) ? 0 : getRecentIntentSummaryView().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getActiveContexts() == null) ? 0 : getActiveContexts().hashCode());
        return hashCode;
    }

    @Override
    public PutSessionRequest clone() {
        return (PutSessionRequest) super.clone();
    }

}
