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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For example, a
     * pizza ordering bot might support an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     */
    private java.util.List<Intent> intents;
    /**
     * <p>
     * Set to <code>true</code> to enable access to natural language understanding improvements.
     * </p>
     * <p>
     * When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     * <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     * </p>
     * <p>
     * You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the parameter
     * to <code>true</code>, your bot has access to accuracy improvements.
     * </p>
     * <p>
     * The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default. In
     * these Regions setting the parameter to <code>false</code> throws a <code>ValidationException</code> exception.
     * </p>
     */
    private Boolean enableModelImprovements;
    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * You must set the <code>enableModelImprovements</code> parameter to <code>true</code> to use confidence scores in
     * the following regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     */
    private Double nluIntentConfidenceThreshold;
    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how
     * many times Amazon Lex should repeat the clarification prompt, use the <code>maxAttempts</code> field. If Amazon
     * Lex still doesn't understand, it sends the message in the <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the correct response from the user. for
     * example, for a bot that orders pizza and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the number of
     * times defined in the <code>maxAttempts</code> field. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception in
     * three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For example, in
     * response to a follow-up prompt that says "Would you like anything else today?" the user says "Yes." Amazon Lex
     * will return a 400 Bad Request exception because it does not have a clarification prompt to send to the user to
     * get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an <code>ElicitIntent</code> dialog type. Since Amazon
     * Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation, you send an <code>ElicitIntent</code>
     * dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a
     * 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     */
    private Prompt clarificationPrompt;
    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times.
     * After that, Amazon Lex sends the message defined in <code>abortStatement</code> to the user, and then cancels the
     * conversation. To set the number of retries, use the <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the
     * user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex
     * tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code> might be one of the intents. This intent
     * might require the <code>CrustType</code> slot. You specify the <code>valueElicitationPrompt</code> field when you
     * create the <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback intent is
     * used instead. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     */
    private Statement abortStatement;
    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time specified. If no conversation occurs during this
     * time, the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through placing an
     * order. If the user doesn't complete the order within the specified time, Amazon Lex discards the slot information
     * that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in a <code>PutBot</code> operation request,
     * Amazon Lex uses the default value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale
     * configured for the voice must match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices in Amazon Polly</a> in the <i>Amazon
     * Polly Developer Guide</i>.
     * </p>
     */
    private String voiceId;
    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the checksum of the most recent revision of
     * the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum does
     * not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so that it
     * can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     */
    private String processBehavior;
    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the
     * bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     */
    private Boolean childDirected;
    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't
     * specify <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     */
    private Boolean detectSentiment;
    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling the
     * <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default is
     * <code>false</code>.
     * </p>
     */
    private Boolean createVersion;
    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     * <code>PutBot</code> operation to update the tags on a bot. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the bot. The name is <i>not</i> case sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     * 
     * @return The name of the bot. The name is <i>not</i> case sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the bot. The name is <i>not</i> case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @return A description of the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For example, a
     * pizza ordering bot might support an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     * 
     * @return An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For
     *         example, a pizza ordering bot might support an OrderPizza intent. For more information, see
     *         <a>how-it-works</a>.
     */

    public java.util.List<Intent> getIntents() {
        return intents;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For example, a
     * pizza ordering bot might support an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For
     *        example, a pizza ordering bot might support an OrderPizza intent. For more information, see
     *        <a>how-it-works</a>.
     */

    public void setIntents(java.util.Collection<Intent> intents) {
        if (intents == null) {
            this.intents = null;
            return;
        }

        this.intents = new java.util.ArrayList<Intent>(intents);
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For example, a
     * pizza ordering bot might support an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntents(java.util.Collection)} or {@link #withIntents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For
     *        example, a pizza ordering bot might support an OrderPizza intent. For more information, see
     *        <a>how-it-works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withIntents(Intent... intents) {
        if (this.intents == null) {
            setIntents(new java.util.ArrayList<Intent>(intents.length));
        }
        for (Intent ele : intents) {
            this.intents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For example, a
     * pizza ordering bot might support an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. Each intent represents a command that a user can express. For
     *        example, a pizza ordering bot might support an OrderPizza intent. For more information, see
     *        <a>how-it-works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withIntents(java.util.Collection<Intent> intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable access to natural language understanding improvements.
     * </p>
     * <p>
     * When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     * <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     * </p>
     * <p>
     * You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the parameter
     * to <code>true</code>, your bot has access to accuracy improvements.
     * </p>
     * <p>
     * The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default. In
     * these Regions setting the parameter to <code>false</code> throws a <code>ValidationException</code> exception.
     * </p>
     * 
     * @param enableModelImprovements
     *        Set to <code>true</code> to enable access to natural language understanding improvements. </p>
     *        <p>
     *        When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     *        <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information,
     *        see <a href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     *        </p>
     *        <p>
     *        You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the
     *        parameter to <code>true</code>, your bot has access to accuracy improvements.
     *        </p>
     *        <p>
     *        The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (us-east-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (us-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Sydney) (ap-southeast-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EU (Ireland) (eu-west-1)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by
     *        default. In these Regions setting the parameter to <code>false</code> throws a
     *        <code>ValidationException</code> exception.
     */

    public void setEnableModelImprovements(Boolean enableModelImprovements) {
        this.enableModelImprovements = enableModelImprovements;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable access to natural language understanding improvements.
     * </p>
     * <p>
     * When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     * <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     * </p>
     * <p>
     * You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the parameter
     * to <code>true</code>, your bot has access to accuracy improvements.
     * </p>
     * <p>
     * The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default. In
     * these Regions setting the parameter to <code>false</code> throws a <code>ValidationException</code> exception.
     * </p>
     * 
     * @return Set to <code>true</code> to enable access to natural language understanding improvements. </p>
     *         <p>
     *         When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     *         <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information,
     *         see <a href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     *         </p>
     *         <p>
     *         You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the
     *         parameter to <code>true</code>, your bot has access to accuracy improvements.
     *         </p>
     *         <p>
     *         The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code>
     *         are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia) (us-east-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon) (us-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Sydney) (ap-southeast-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EU (Ireland) (eu-west-1)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by
     *         default. In these Regions setting the parameter to <code>false</code> throws a
     *         <code>ValidationException</code> exception.
     */

    public Boolean getEnableModelImprovements() {
        return this.enableModelImprovements;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable access to natural language understanding improvements.
     * </p>
     * <p>
     * When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     * <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     * </p>
     * <p>
     * You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the parameter
     * to <code>true</code>, your bot has access to accuracy improvements.
     * </p>
     * <p>
     * The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default. In
     * these Regions setting the parameter to <code>false</code> throws a <code>ValidationException</code> exception.
     * </p>
     * 
     * @param enableModelImprovements
     *        Set to <code>true</code> to enable access to natural language understanding improvements. </p>
     *        <p>
     *        When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     *        <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information,
     *        see <a href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     *        </p>
     *        <p>
     *        You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the
     *        parameter to <code>true</code>, your bot has access to accuracy improvements.
     *        </p>
     *        <p>
     *        The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (us-east-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (us-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Sydney) (ap-southeast-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EU (Ireland) (eu-west-1)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by
     *        default. In these Regions setting the parameter to <code>false</code> throws a
     *        <code>ValidationException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withEnableModelImprovements(Boolean enableModelImprovements) {
        setEnableModelImprovements(enableModelImprovements);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable access to natural language understanding improvements.
     * </p>
     * <p>
     * When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     * <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     * </p>
     * <p>
     * You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the parameter
     * to <code>true</code>, your bot has access to accuracy improvements.
     * </p>
     * <p>
     * The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default. In
     * these Regions setting the parameter to <code>false</code> throws a <code>ValidationException</code> exception.
     * </p>
     * 
     * @return Set to <code>true</code> to enable access to natural language understanding improvements. </p>
     *         <p>
     *         When you set the <code>enableModelImprovements</code> parameter to <code>true</code> you can use the
     *         <code>nluIntentConfidenceThreshold</code> parameter to configure confidence scores. For more information,
     *         see <a href="https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html">Confidence Scores</a>.
     *         </p>
     *         <p>
     *         You can only set the <code>enableModelImprovements</code> parameter in certain Regions. If you set the
     *         parameter to <code>true</code>, your bot has access to accuracy improvements.
     *         </p>
     *         <p>
     *         The Regions where you can set the <code>enableModelImprovements</code> parameter to <code>true</code>
     *         are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia) (us-east-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon) (us-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Sydney) (ap-southeast-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EU (Ireland) (eu-west-1)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by
     *         default. In these Regions setting the parameter to <code>false</code> throws a
     *         <code>ValidationException</code> exception.
     */

    public Boolean isEnableModelImprovements() {
        return this.enableModelImprovements;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * You must set the <code>enableModelImprovements</code> parameter to <code>true</code> to use confidence scores in
     * the following regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     * 
     * @param nluIntentConfidenceThreshold
     *        Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> response.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot.</p>
     *        <p>
     *        You must set the <code>enableModelImprovements</code> parameter to <code>true</code> to use confidence
     *        scores in the following regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (us-east-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (us-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Sydney) (ap-southeast-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EU (Ireland) (eu-west-1)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by
     *        default.
     *        </p>
     *        <p>
     *        For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *        <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *        confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the
     *        <code>PostText</code> operation would be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AMAZON.FallbackIntent
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentC
     *        </p>
     *        </li>
     */

    public void setNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * You must set the <code>enableModelImprovements</code> parameter to <code>true</code> to use confidence scores in
     * the following regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *         <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> response.
     *         <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *         are configured for the bot.</p>
     *         <p>
     *         You must set the <code>enableModelImprovements</code> parameter to <code>true</code> to use confidence
     *         scores in the following regions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia) (us-east-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon) (us-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Sydney) (ap-southeast-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EU (Ireland) (eu-west-1)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by
     *         default.
     *         </p>
     *         <p>
     *         For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *         <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *         confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the
     *         <code>PostText</code> operation would be:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AMAZON.FallbackIntent
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IntentA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IntentB
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IntentC
     *         </p>
     *         </li>
     */

    public Double getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * You must set the <code>enableModelImprovements</code> parameter to <code>true</code> to use confidence scores in
     * the following regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (ap-southeast-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * EU (Ireland) (eu-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by default.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     * 
     * @param nluIntentConfidenceThreshold
     *        Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> response.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot.</p>
     *        <p>
     *        You must set the <code>enableModelImprovements</code> parameter to <code>true</code> to use confidence
     *        scores in the following regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (us-east-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (us-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Sydney) (ap-southeast-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EU (Ireland) (eu-west-1)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In other Regions, the <code>enableModelImprovements</code> parameter is set to <code>true</code> by
     *        default.
     *        </p>
     *        <p>
     *        For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *        <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *        confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the
     *        <code>PostText</code> operation would be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AMAZON.FallbackIntent
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        setNluIntentConfidenceThreshold(nluIntentConfidenceThreshold);
        return this;
    }

    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how
     * many times Amazon Lex should repeat the clarification prompt, use the <code>maxAttempts</code> field. If Amazon
     * Lex still doesn't understand, it sends the message in the <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the correct response from the user. for
     * example, for a bot that orders pizza and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the number of
     * times defined in the <code>maxAttempts</code> field. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception in
     * three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For example, in
     * response to a follow-up prompt that says "Would you like anything else today?" the user says "Yes." Amazon Lex
     * will return a 400 Bad Request exception because it does not have a clarification prompt to send to the user to
     * get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an <code>ElicitIntent</code> dialog type. Since Amazon
     * Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation, you send an <code>ElicitIntent</code>
     * dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a
     * 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clarificationPrompt
     *        When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To
     *        specify how many times Amazon Lex should repeat the clarification prompt, use the <code>maxAttempts</code>
     *        field. If Amazon Lex still doesn't understand, it sends the message in the <code>abortStatement</code>
     *        field. </p>
     *        <p>
     *        When you create a clarification prompt, make sure that it suggests the correct response from the user. for
     *        example, for a bot that orders pizza and drinks, you might create this clarification prompt:
     *        "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     *        </p>
     *        <p>
     *        If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the
     *        number of times defined in the <code>maxAttempts</code> field. For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     *        </p>
     *        <p>
     *        If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception
     *        in three cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For
     *        example, in response to a follow-up prompt that says "Would you like anything else today?" the user says
     *        "Yes." Amazon Lex will return a 400 Bad Request exception because it does not have a clarification prompt
     *        to send to the user to get an intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Lambda function - When using a Lambda function, you return an <code>ElicitIntent</code> dialog type. Since
     *        Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad
     *        Request exception.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PutSession operation - When using the <code>PutSession</code> operation, you send an
     *        <code>ElicitIntent</code> dialog type. Since Amazon Lex does not have a clarification prompt to get an
     *        intent from the user, it returns a 400 Bad Request exception.
     *        </p>
     *        </li>
     */

    public void setClarificationPrompt(Prompt clarificationPrompt) {
        this.clarificationPrompt = clarificationPrompt;
    }

    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how
     * many times Amazon Lex should repeat the clarification prompt, use the <code>maxAttempts</code> field. If Amazon
     * Lex still doesn't understand, it sends the message in the <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the correct response from the user. for
     * example, for a bot that orders pizza and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the number of
     * times defined in the <code>maxAttempts</code> field. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception in
     * three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For example, in
     * response to a follow-up prompt that says "Would you like anything else today?" the user says "Yes." Amazon Lex
     * will return a 400 Bad Request exception because it does not have a clarification prompt to send to the user to
     * get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an <code>ElicitIntent</code> dialog type. Since Amazon
     * Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation, you send an <code>ElicitIntent</code>
     * dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a
     * 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     * 
     * @return When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To
     *         specify how many times Amazon Lex should repeat the clarification prompt, use the
     *         <code>maxAttempts</code> field. If Amazon Lex still doesn't understand, it sends the message in the
     *         <code>abortStatement</code> field. </p>
     *         <p>
     *         When you create a clarification prompt, make sure that it suggests the correct response from the user.
     *         for example, for a bot that orders pizza and drinks, you might create this clarification prompt:
     *         "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     *         </p>
     *         <p>
     *         If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the
     *         number of times defined in the <code>maxAttempts</code> field. For more information, see <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html">
     *         AMAZON.FallbackIntent</a>.
     *         </p>
     *         <p>
     *         If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception
     *         in three cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For
     *         example, in response to a follow-up prompt that says "Would you like anything else today?" the user says
     *         "Yes." Amazon Lex will return a 400 Bad Request exception because it does not have a clarification prompt
     *         to send to the user to get an intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Lambda function - When using a Lambda function, you return an <code>ElicitIntent</code> dialog type.
     *         Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a 400
     *         Bad Request exception.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PutSession operation - When using the <code>PutSession</code> operation, you send an
     *         <code>ElicitIntent</code> dialog type. Since Amazon Lex does not have a clarification prompt to get an
     *         intent from the user, it returns a 400 Bad Request exception.
     *         </p>
     *         </li>
     */

    public Prompt getClarificationPrompt() {
        return this.clarificationPrompt;
    }

    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how
     * many times Amazon Lex should repeat the clarification prompt, use the <code>maxAttempts</code> field. If Amazon
     * Lex still doesn't understand, it sends the message in the <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the correct response from the user. for
     * example, for a bot that orders pizza and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the number of
     * times defined in the <code>maxAttempts</code> field. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception in
     * three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For example, in
     * response to a follow-up prompt that says "Would you like anything else today?" the user says "Yes." Amazon Lex
     * will return a 400 Bad Request exception because it does not have a clarification prompt to send to the user to
     * get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an <code>ElicitIntent</code> dialog type. Since Amazon
     * Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation, you send an <code>ElicitIntent</code>
     * dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a
     * 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clarificationPrompt
     *        When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To
     *        specify how many times Amazon Lex should repeat the clarification prompt, use the <code>maxAttempts</code>
     *        field. If Amazon Lex still doesn't understand, it sends the message in the <code>abortStatement</code>
     *        field. </p>
     *        <p>
     *        When you create a clarification prompt, make sure that it suggests the correct response from the user. for
     *        example, for a bot that orders pizza and drinks, you might create this clarification prompt:
     *        "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     *        </p>
     *        <p>
     *        If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the
     *        number of times defined in the <code>maxAttempts</code> field. For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     *        </p>
     *        <p>
     *        If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception
     *        in three cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For
     *        example, in response to a follow-up prompt that says "Would you like anything else today?" the user says
     *        "Yes." Amazon Lex will return a 400 Bad Request exception because it does not have a clarification prompt
     *        to send to the user to get an intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Lambda function - When using a Lambda function, you return an <code>ElicitIntent</code> dialog type. Since
     *        Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad
     *        Request exception.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PutSession operation - When using the <code>PutSession</code> operation, you send an
     *        <code>ElicitIntent</code> dialog type. Since Amazon Lex does not have a clarification prompt to get an
     *        intent from the user, it returns a 400 Bad Request exception.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withClarificationPrompt(Prompt clarificationPrompt) {
        setClarificationPrompt(clarificationPrompt);
        return this;
    }

    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times.
     * After that, Amazon Lex sends the message defined in <code>abortStatement</code> to the user, and then cancels the
     * conversation. To set the number of retries, use the <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the
     * user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex
     * tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code> might be one of the intents. This intent
     * might require the <code>CrustType</code> slot. You specify the <code>valueElicitationPrompt</code> field when you
     * create the <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback intent is
     * used instead. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     * 
     * @param abortStatement
     *        When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few
     *        times. After that, Amazon Lex sends the message defined in <code>abortStatement</code> to the user, and
     *        then cancels the conversation. To set the number of retries, use the <code>valueElicitationPrompt</code>
     *        field for the slot type. </p>
     *        <p>
     *        For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If
     *        the user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.),
     *        Amazon Lex tries to elicit a correct response a few more times.
     *        </p>
     *        <p>
     *        For example, in a pizza ordering application, <code>OrderPizza</code> might be one of the intents. This
     *        intent might require the <code>CrustType</code> slot. You specify the <code>valueElicitationPrompt</code>
     *        field when you create the <code>CrustType</code> slot.
     *        </p>
     *        <p>
     *        If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback
     *        intent is used instead. For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     */

    public void setAbortStatement(Statement abortStatement) {
        this.abortStatement = abortStatement;
    }

    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times.
     * After that, Amazon Lex sends the message defined in <code>abortStatement</code> to the user, and then cancels the
     * conversation. To set the number of retries, use the <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the
     * user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex
     * tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code> might be one of the intents. This intent
     * might require the <code>CrustType</code> slot. You specify the <code>valueElicitationPrompt</code> field when you
     * create the <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback intent is
     * used instead. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     * 
     * @return When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few
     *         times. After that, Amazon Lex sends the message defined in <code>abortStatement</code> to the user, and
     *         then cancels the conversation. To set the number of retries, use the <code>valueElicitationPrompt</code>
     *         field for the slot type. </p>
     *         <p>
     *         For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If
     *         the user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.),
     *         Amazon Lex tries to elicit a correct response a few more times.
     *         </p>
     *         <p>
     *         For example, in a pizza ordering application, <code>OrderPizza</code> might be one of the intents. This
     *         intent might require the <code>CrustType</code> slot. You specify the <code>valueElicitationPrompt</code>
     *         field when you create the <code>CrustType</code> slot.
     *         </p>
     *         <p>
     *         If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback
     *         intent is used instead. For more information, see <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html">
     *         AMAZON.FallbackIntent</a>.
     */

    public Statement getAbortStatement() {
        return this.abortStatement;
    }

    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times.
     * After that, Amazon Lex sends the message defined in <code>abortStatement</code> to the user, and then cancels the
     * conversation. To set the number of retries, use the <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the
     * user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex
     * tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code> might be one of the intents. This intent
     * might require the <code>CrustType</code> slot. You specify the <code>valueElicitationPrompt</code> field when you
     * create the <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback intent is
     * used instead. For more information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * </p>
     * 
     * @param abortStatement
     *        When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few
     *        times. After that, Amazon Lex sends the message defined in <code>abortStatement</code> to the user, and
     *        then cancels the conversation. To set the number of retries, use the <code>valueElicitationPrompt</code>
     *        field for the slot type. </p>
     *        <p>
     *        For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If
     *        the user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.),
     *        Amazon Lex tries to elicit a correct response a few more times.
     *        </p>
     *        <p>
     *        For example, in a pizza ordering application, <code>OrderPizza</code> might be one of the intents. This
     *        intent might require the <code>CrustType</code> slot. You specify the <code>valueElicitationPrompt</code>
     *        field when you create the <code>CrustType</code> slot.
     *        </p>
     *        <p>
     *        If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback
     *        intent is used instead. For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"> AMAZON.FallbackIntent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withAbortStatement(Statement abortStatement) {
        setAbortStatement(abortStatement);
        return this;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time specified. If no conversation occurs during this
     * time, the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through placing an
     * order. If the user doesn't complete the order within the specified time, Amazon Lex discards the slot information
     * that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in a <code>PutBot</code> operation request,
     * Amazon Lex uses the default value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.</p>
     *        <p>
     *        A user interaction session remains active for the amount of time specified. If no conversation occurs
     *        during this time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *        </p>
     *        <p>
     *        For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through
     *        placing an order. If the user doesn't complete the order within the specified time, Amazon Lex discards
     *        the slot information that it gathered, and the user must start over.
     *        </p>
     *        <p>
     *        If you don't include the <code>idleSessionTTLInSeconds</code> element in a <code>PutBot</code> operation
     *        request, Amazon Lex uses the default value. This is also true if the request replaces an existing bot.
     *        </p>
     *        <p>
     *        The default is 300 seconds (5 minutes).
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time specified. If no conversation occurs during this
     * time, the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through placing an
     * order. If the user doesn't complete the order within the specified time, Amazon Lex discards the slot information
     * that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in a <code>PutBot</code> operation request,
     * Amazon Lex uses the default value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     * 
     * @return The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.</p>
     *         <p>
     *         A user interaction session remains active for the amount of time specified. If no conversation occurs
     *         during this time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *         </p>
     *         <p>
     *         For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through
     *         placing an order. If the user doesn't complete the order within the specified time, Amazon Lex discards
     *         the slot information that it gathered, and the user must start over.
     *         </p>
     *         <p>
     *         If you don't include the <code>idleSessionTTLInSeconds</code> element in a <code>PutBot</code> operation
     *         request, Amazon Lex uses the default value. This is also true if the request replaces an existing bot.
     *         </p>
     *         <p>
     *         The default is 300 seconds (5 minutes).
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time specified. If no conversation occurs during this
     * time, the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through placing an
     * order. If the user doesn't complete the order within the specified time, Amazon Lex discards the slot information
     * that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in a <code>PutBot</code> operation request,
     * Amazon Lex uses the default value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.</p>
     *        <p>
     *        A user interaction session remains active for the amount of time specified. If no conversation occurs
     *        during this time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *        </p>
     *        <p>
     *        For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through
     *        placing an order. If the user doesn't complete the order within the specified time, Amazon Lex discards
     *        the slot information that it gathered, and the user must start over.
     *        </p>
     *        <p>
     *        If you don't include the <code>idleSessionTTLInSeconds</code> element in a <code>PutBot</code> operation
     *        request, Amazon Lex uses the default value. This is also true if the request replaces an existing bot.
     *        </p>
     *        <p>
     *        The default is 300 seconds (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale
     * configured for the voice must match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices in Amazon Polly</a> in the <i>Amazon
     * Polly Developer Guide</i>.
     * </p>
     * 
     * @param voiceId
     *        The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale
     *        configured for the voice must match the locale of the bot. For more information, see <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices in Amazon Polly</a> in the
     *        <i>Amazon Polly Developer Guide</i>.
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale
     * configured for the voice must match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices in Amazon Polly</a> in the <i>Amazon
     * Polly Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The
     *         locale configured for the voice must match the locale of the bot. For more information, see <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices in Amazon Polly</a> in the
     *         <i>Amazon Polly Developer Guide</i>.
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale
     * configured for the voice must match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices in Amazon Polly</a> in the <i>Amazon
     * Polly Developer Guide</i>.
     * </p>
     * 
     * @param voiceId
     *        The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale
     *        configured for the voice must match the locale of the bot. For more information, see <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices in Amazon Polly</a> in the
     *        <i>Amazon Polly Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withVoiceId(String voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the checksum of the most recent revision of
     * the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum does
     * not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new bot, leave the <code>checksum</code> field blank. If you specify a checksum you get
     *        a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a bot, set the <code>checksum</code> field to the checksum of the most recent
     *        revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if
     *        the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the checksum of the most recent revision of
     * the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum does
     * not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     * 
     * @return Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *         <p>
     *         When you create a new bot, leave the <code>checksum</code> field blank. If you specify a checksum you get
     *         a <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a bot, set the <code>checksum</code> field to the checksum of the most recent
     *         revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or
     *         if the checksum does not match the <code>$LATEST</code> version, you get a
     *         <code>PreconditionFailedException</code> exception.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the checksum of the most recent revision of
     * the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum does
     * not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new bot, leave the <code>checksum</code> field blank. If you specify a checksum you get
     *        a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a bot, set the <code>checksum</code> field to the checksum of the most recent
     *        revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if
     *        the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so that it
     * can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * 
     * @param processBehavior
     *        If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so
     *        that it can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't
     *        build it. </p>
     *        <p>
     *        If you don't specify this value, the default value is <code>BUILD</code>.
     * @see ProcessBehavior
     */

    public void setProcessBehavior(String processBehavior) {
        this.processBehavior = processBehavior;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so that it
     * can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * 
     * @return If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so
     *         that it can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't
     *         build it. </p>
     *         <p>
     *         If you don't specify this value, the default value is <code>BUILD</code>.
     * @see ProcessBehavior
     */

    public String getProcessBehavior() {
        return this.processBehavior;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so that it
     * can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * 
     * @param processBehavior
     *        If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so
     *        that it can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't
     *        build it. </p>
     *        <p>
     *        If you don't specify this value, the default value is <code>BUILD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessBehavior
     */

    public PutBotRequest withProcessBehavior(String processBehavior) {
        setProcessBehavior(processBehavior);
        return this;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so that it
     * can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * 
     * @param processBehavior
     *        If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so
     *        that it can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't
     *        build it. </p>
     *        <p>
     *        If you don't specify this value, the default value is <code>BUILD</code>.
     * @see ProcessBehavior
     */

    public void setProcessBehavior(ProcessBehavior processBehavior) {
        withProcessBehavior(processBehavior);
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so that it
     * can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * 
     * @param processBehavior
     *        If you set the <code>processBehavior</code> element to <code>BUILD</code>, Amazon Lex builds the bot so
     *        that it can be run. If you set the element to <code>SAVE</code> Amazon Lex saves the bot, but doesn't
     *        build it. </p>
     *        <p>
     *        If you don't specify this value, the default value is <code>BUILD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessBehavior
     */

    public PutBotRequest withProcessBehavior(ProcessBehavior processBehavior) {
        this.processBehavior = processBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the
     * bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of
     *        the bot. </p>
     *        <p>
     *        The default is <code>en-US</code>.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the
     * bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * 
     * @return Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of
     *         the bot. </p>
     *         <p>
     *         The default is <code>en-US</code>.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the
     * bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of
     *        the bot. </p>
     *        <p>
     *        The default is <code>en-US</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public PutBotRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the
     * bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of
     *        the bot. </p>
     *        <p>
     *        The default is <code>en-US</code>.
     * @see Locale
     */

    public void setLocale(Locale locale) {
        withLocale(locale);
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the
     * bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of
     *        the bot. </p>
     *        <p>
     *        The default is <code>en-US</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public PutBotRequest withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @param childDirected
     *        For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *        use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *        whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *        (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *        specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *        Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *        or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *        <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *        website, program, or other application that is directed or targeted, in whole or in part, to children
     *        under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *        field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or
     *        other application that is directed or targeted, in whole or in part, to children under age 13 and subject
     *        to COPPA.</p>
     *        <p>
     *        If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or
     *        in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA.
     *        For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *        applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *        href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     */

    public void setChildDirected(Boolean childDirected) {
        this.childDirected = childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @return For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *         use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *         whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *         specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *         Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *         or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *         website, program, or other application that is directed or targeted, in whole or in part, to children
     *         under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *         field that does not accurately reflect whether your use of Amazon Lex is related to a website, program,
     *         or other application that is directed or targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.</p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other application that is directed in whole
     *         or in part, to children under age 13, you must obtain any required verifiable parental consent under
     *         COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *         applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     */

    public Boolean getChildDirected() {
        return this.childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @param childDirected
     *        For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *        use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *        whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *        (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *        specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *        Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *        or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *        <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *        website, program, or other application that is directed or targeted, in whole or in part, to children
     *        under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *        field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or
     *        other application that is directed or targeted, in whole or in part, to children under age 13 and subject
     *        to COPPA.</p>
     *        <p>
     *        If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or
     *        in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA.
     *        For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *        applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *        href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withChildDirected(Boolean childDirected) {
        setChildDirected(childDirected);
        return this;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @return For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *         use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *         whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *         specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *         Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *         or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *         website, program, or other application that is directed or targeted, in whole or in part, to children
     *         under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *         field that does not accurately reflect whether your use of Amazon Lex is related to a website, program,
     *         or other application that is directed or targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.</p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other application that is directed in whole
     *         or in part, to children under age 13, you must obtain any required verifiable parental consent under
     *         COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *         applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     */

    public Boolean isChildDirected() {
        return this.childDirected;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't
     * specify <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     * 
     * @param detectSentiment
     *        When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If you
     *        don't specify <code>detectSentiment</code>, the default is <code>false</code>.
     */

    public void setDetectSentiment(Boolean detectSentiment) {
        this.detectSentiment = detectSentiment;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't
     * specify <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     * 
     * @return When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If
     *         you don't specify <code>detectSentiment</code>, the default is <code>false</code>.
     */

    public Boolean getDetectSentiment() {
        return this.detectSentiment;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't
     * specify <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     * 
     * @param detectSentiment
     *        When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If you
     *        don't specify <code>detectSentiment</code>, the default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withDetectSentiment(Boolean detectSentiment) {
        setDetectSentiment(detectSentiment);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't
     * specify <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     * 
     * @return When set to <code>true</code> user utterances are sent to Amazon Comprehend for sentiment analysis. If
     *         you don't specify <code>detectSentiment</code>, the default is <code>false</code>.
     */

    public Boolean isDetectSentiment() {
        return this.detectSentiment;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling the
     * <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default is
     * <code>false</code>.
     * </p>
     * 
     * @param createVersion
     *        When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling
     *        the <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default
     *        is <code>false</code>.
     */

    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling the
     * <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default is
     * <code>false</code>.
     * </p>
     * 
     * @return When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling
     *         the <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default
     *         is <code>false</code>.
     */

    public Boolean getCreateVersion() {
        return this.createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling the
     * <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default is
     * <code>false</code>.
     * </p>
     * 
     * @param createVersion
     *        When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling
     *        the <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default
     *        is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withCreateVersion(Boolean createVersion) {
        setCreateVersion(createVersion);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling the
     * <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default is
     * <code>false</code>.
     * </p>
     * 
     * @return When set to <code>true</code> a new numbered version of the bot is created. This is the same as calling
     *         the <code>CreateBotVersion</code> operation. If you don't specify <code>createVersion</code>, the default
     *         is <code>false</code>.
     */

    public Boolean isCreateVersion() {
        return this.createVersion;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     * <code>PutBot</code> operation to update the tags on a bot. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     * 
     * @return A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     *         <code>PutBot</code> operation to update the tags on a bot. To update tags, use the
     *         <code>TagResource</code> operation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     * <code>PutBot</code> operation to update the tags on a bot. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     *        <code>PutBot</code> operation to update the tags on a bot. To update tags, use the
     *        <code>TagResource</code> operation.
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
     * A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     * <code>PutBot</code> operation to update the tags on a bot. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     *        <code>PutBot</code> operation to update the tags on a bot. To update tags, use the
     *        <code>TagResource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withTags(Tag... tags) {
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
     * A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     * <code>PutBot</code> operation to update the tags on a bot. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the
     *        <code>PutBot</code> operation to update the tags on a bot. To update tags, use the
     *        <code>TagResource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getIntents() != null)
            sb.append("Intents: ").append(getIntents()).append(",");
        if (getEnableModelImprovements() != null)
            sb.append("EnableModelImprovements: ").append(getEnableModelImprovements()).append(",");
        if (getNluIntentConfidenceThreshold() != null)
            sb.append("NluIntentConfidenceThreshold: ").append(getNluIntentConfidenceThreshold()).append(",");
        if (getClarificationPrompt() != null)
            sb.append("ClarificationPrompt: ").append(getClarificationPrompt()).append(",");
        if (getAbortStatement() != null)
            sb.append("AbortStatement: ").append(getAbortStatement()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getProcessBehavior() != null)
            sb.append("ProcessBehavior: ").append(getProcessBehavior()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getChildDirected() != null)
            sb.append("ChildDirected: ").append(getChildDirected()).append(",");
        if (getDetectSentiment() != null)
            sb.append("DetectSentiment: ").append(getDetectSentiment()).append(",");
        if (getCreateVersion() != null)
            sb.append("CreateVersion: ").append(getCreateVersion()).append(",");
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

        if (obj instanceof PutBotRequest == false)
            return false;
        PutBotRequest other = (PutBotRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntents() == null ^ this.getIntents() == null)
            return false;
        if (other.getIntents() != null && other.getIntents().equals(this.getIntents()) == false)
            return false;
        if (other.getEnableModelImprovements() == null ^ this.getEnableModelImprovements() == null)
            return false;
        if (other.getEnableModelImprovements() != null && other.getEnableModelImprovements().equals(this.getEnableModelImprovements()) == false)
            return false;
        if (other.getNluIntentConfidenceThreshold() == null ^ this.getNluIntentConfidenceThreshold() == null)
            return false;
        if (other.getNluIntentConfidenceThreshold() != null && other.getNluIntentConfidenceThreshold().equals(this.getNluIntentConfidenceThreshold()) == false)
            return false;
        if (other.getClarificationPrompt() == null ^ this.getClarificationPrompt() == null)
            return false;
        if (other.getClarificationPrompt() != null && other.getClarificationPrompt().equals(this.getClarificationPrompt()) == false)
            return false;
        if (other.getAbortStatement() == null ^ this.getAbortStatement() == null)
            return false;
        if (other.getAbortStatement() != null && other.getAbortStatement().equals(this.getAbortStatement()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getProcessBehavior() == null ^ this.getProcessBehavior() == null)
            return false;
        if (other.getProcessBehavior() != null && other.getProcessBehavior().equals(this.getProcessBehavior()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getChildDirected() == null ^ this.getChildDirected() == null)
            return false;
        if (other.getChildDirected() != null && other.getChildDirected().equals(this.getChildDirected()) == false)
            return false;
        if (other.getDetectSentiment() == null ^ this.getDetectSentiment() == null)
            return false;
        if (other.getDetectSentiment() != null && other.getDetectSentiment().equals(this.getDetectSentiment()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null && other.getCreateVersion().equals(this.getCreateVersion()) == false)
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
        hashCode = prime * hashCode + ((getIntents() == null) ? 0 : getIntents().hashCode());
        hashCode = prime * hashCode + ((getEnableModelImprovements() == null) ? 0 : getEnableModelImprovements().hashCode());
        hashCode = prime * hashCode + ((getNluIntentConfidenceThreshold() == null) ? 0 : getNluIntentConfidenceThreshold().hashCode());
        hashCode = prime * hashCode + ((getClarificationPrompt() == null) ? 0 : getClarificationPrompt().hashCode());
        hashCode = prime * hashCode + ((getAbortStatement() == null) ? 0 : getAbortStatement().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getProcessBehavior() == null) ? 0 : getProcessBehavior().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getChildDirected() == null) ? 0 : getChildDirected().hashCode());
        hashCode = prime * hashCode + ((getDetectSentiment() == null) ? 0 : getDetectSentiment().hashCode());
        hashCode = prime * hashCode + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutBotRequest clone() {
        return (PutBotRequest) super.clone();
    }

}
