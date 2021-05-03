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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGameSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to create a game session in. You can use either the fleet ID or ARN value. Each
     * request must reference either a fleet ID or alias ID, but not both.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to create a game session in. You can use either the
     * alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;
    /**
     * <p>
     * A unique identifier for a player or entity creating the game session. This parameter is required when requesting
     * a new game session on a fleet with a resource creation limit policy. This type of policy limits the number of
     * concurrent active game sessions that one player can create within a certain time span. GameLift uses the
     * CreatorId to evaluate the new request against the policy.
     * </p>
     */
    private String creatorId;
    /**
     * <p>
     * <i>This parameter is no longer preferred. Please use <code>IdempotencyToken</code> instead.</i> Custom string
     * that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided,
     * this string is included in the new game session's ID.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Custom string that uniquely identifies the new game session request. This is useful for ensuring that game
     * session requests with the same idempotency token are processed only once. Subsequent requests with the same
     * string return the original <code>GameSession</code> object, with an updated status. Maximum token length is 48
     * characters. If provided, this string is included in the new game session's ID. A game session ARN has the
     * following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * . Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained
     * for this time period and then deleted.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * A set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     */
    private String gameSessionData;
    /**
     * <p>
     * A fleet's remote location to place the new game session in. If this parameter is not set, the new game session is
     * placed in the fleet's home Region. Specify a remote location with an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet to create a game session in. You can use either the fleet ID or ARN value. Each
     * request must reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to create a game session in. You can use either the fleet ID or ARN
     *        value. Each request must reference either a fleet ID or alias ID, but not both.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to create a game session in. You can use either the fleet ID or ARN value. Each
     * request must reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @return A unique identifier for the fleet to create a game session in. You can use either the fleet ID or ARN
     *         value. Each request must reference either a fleet ID or alias ID, but not both.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to create a game session in. You can use either the fleet ID or ARN value. Each
     * request must reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to create a game session in. You can use either the fleet ID or ARN
     *        value. Each request must reference either a fleet ID or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to create a game session in. You can use either the
     * alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        A unique identifier for the alias associated with the fleet to create a game session in. You can use
     *        either the alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to create a game session in. You can use either the
     * alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @return A unique identifier for the alias associated with the fleet to create a game session in. You can use
     *         either the alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not
     *         both.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to create a game session in. You can use either the
     * alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        A unique identifier for the alias associated with the fleet to create a game session in. You can use
     *        either the alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        The maximum number of players that can be connected simultaneously to the game session.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @return The maximum number of players that can be connected simultaneously to the game session.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        The maximum number of players that can be connected simultaneously to the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a game session. Session names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     * 
     * @return A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *         to a game server process in the <a>GameSession</a> object with a request to start a new game session.
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     * 
     * @param gameProperties
     *        A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *        to a game server process in the <a>GameSession</a> object with a request to start a new game session.
     */

    public void setGameProperties(java.util.Collection<GameProperty> gameProperties) {
        if (gameProperties == null) {
            this.gameProperties = null;
            return;
        }

        this.gameProperties = new java.util.ArrayList<GameProperty>(gameProperties);
    }

    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameProperties(java.util.Collection)} or {@link #withGameProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gameProperties
     *        A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *        to a game server process in the <a>GameSession</a> object with a request to start a new game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withGameProperties(GameProperty... gameProperties) {
        if (this.gameProperties == null) {
            setGameProperties(new java.util.ArrayList<GameProperty>(gameProperties.length));
        }
        for (GameProperty ele : gameProperties) {
            this.gameProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     * 
     * @param gameProperties
     *        A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *        to a game server process in the <a>GameSession</a> object with a request to start a new game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withGameProperties(java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a player or entity creating the game session. This parameter is required when requesting
     * a new game session on a fleet with a resource creation limit policy. This type of policy limits the number of
     * concurrent active game sessions that one player can create within a certain time span. GameLift uses the
     * CreatorId to evaluate the new request against the policy.
     * </p>
     * 
     * @param creatorId
     *        A unique identifier for a player or entity creating the game session. This parameter is required when
     *        requesting a new game session on a fleet with a resource creation limit policy. This type of policy limits
     *        the number of concurrent active game sessions that one player can create within a certain time span.
     *        GameLift uses the CreatorId to evaluate the new request against the policy.
     */

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * <p>
     * A unique identifier for a player or entity creating the game session. This parameter is required when requesting
     * a new game session on a fleet with a resource creation limit policy. This type of policy limits the number of
     * concurrent active game sessions that one player can create within a certain time span. GameLift uses the
     * CreatorId to evaluate the new request against the policy.
     * </p>
     * 
     * @return A unique identifier for a player or entity creating the game session. This parameter is required when
     *         requesting a new game session on a fleet with a resource creation limit policy. This type of policy
     *         limits the number of concurrent active game sessions that one player can create within a certain time
     *         span. GameLift uses the CreatorId to evaluate the new request against the policy.
     */

    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * <p>
     * A unique identifier for a player or entity creating the game session. This parameter is required when requesting
     * a new game session on a fleet with a resource creation limit policy. This type of policy limits the number of
     * concurrent active game sessions that one player can create within a certain time span. GameLift uses the
     * CreatorId to evaluate the new request against the policy.
     * </p>
     * 
     * @param creatorId
     *        A unique identifier for a player or entity creating the game session. This parameter is required when
     *        requesting a new game session on a fleet with a resource creation limit policy. This type of policy limits
     *        the number of concurrent active game sessions that one player can create within a certain time span.
     *        GameLift uses the CreatorId to evaluate the new request against the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withCreatorId(String creatorId) {
        setCreatorId(creatorId);
        return this;
    }

    /**
     * <p>
     * <i>This parameter is no longer preferred. Please use <code>IdempotencyToken</code> instead.</i> Custom string
     * that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided,
     * this string is included in the new game session's ID.
     * </p>
     * 
     * @param gameSessionId
     *        <i>This parameter is no longer preferred. Please use <code>IdempotencyToken</code> instead.</i> Custom
     *        string that uniquely identifies a request for a new game session. Maximum token length is 48 characters.
     *        If provided, this string is included in the new game session's ID.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * <i>This parameter is no longer preferred. Please use <code>IdempotencyToken</code> instead.</i> Custom string
     * that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided,
     * this string is included in the new game session's ID.
     * </p>
     * 
     * @return <i>This parameter is no longer preferred. Please use <code>IdempotencyToken</code> instead.</i> Custom
     *         string that uniquely identifies a request for a new game session. Maximum token length is 48 characters.
     *         If provided, this string is included in the new game session's ID.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * <i>This parameter is no longer preferred. Please use <code>IdempotencyToken</code> instead.</i> Custom string
     * that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided,
     * this string is included in the new game session's ID.
     * </p>
     * 
     * @param gameSessionId
     *        <i>This parameter is no longer preferred. Please use <code>IdempotencyToken</code> instead.</i> Custom
     *        string that uniquely identifies a request for a new game session. Maximum token length is 48 characters.
     *        If provided, this string is included in the new game session's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Custom string that uniquely identifies the new game session request. This is useful for ensuring that game
     * session requests with the same idempotency token are processed only once. Subsequent requests with the same
     * string return the original <code>GameSession</code> object, with an updated status. Maximum token length is 48
     * characters. If provided, this string is included in the new game session's ID. A game session ARN has the
     * following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * . Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained
     * for this time period and then deleted.
     * </p>
     * 
     * @param idempotencyToken
     *        Custom string that uniquely identifies the new game session request. This is useful for ensuring that game
     *        session requests with the same idempotency token are processed only once. Subsequent requests with the
     *        same string return the original <code>GameSession</code> object, with an updated status. Maximum token
     *        length is 48 characters. If provided, this string is included in the new game session's ID. A game session
     *        ARN has the following format:
     *        <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     *        . Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are
     *        retained for this time period and then deleted.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * Custom string that uniquely identifies the new game session request. This is useful for ensuring that game
     * session requests with the same idempotency token are processed only once. Subsequent requests with the same
     * string return the original <code>GameSession</code> object, with an updated status. Maximum token length is 48
     * characters. If provided, this string is included in the new game session's ID. A game session ARN has the
     * following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * . Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained
     * for this time period and then deleted.
     * </p>
     * 
     * @return Custom string that uniquely identifies the new game session request. This is useful for ensuring that
     *         game session requests with the same idempotency token are processed only once. Subsequent requests with
     *         the same string return the original <code>GameSession</code> object, with an updated status. Maximum
     *         token length is 48 characters. If provided, this string is included in the new game session's ID. A game
     *         session ARN has the following format:
     *         <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     *         . Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are
     *         retained for this time period and then deleted.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * Custom string that uniquely identifies the new game session request. This is useful for ensuring that game
     * session requests with the same idempotency token are processed only once. Subsequent requests with the same
     * string return the original <code>GameSession</code> object, with an updated status. Maximum token length is 48
     * characters. If provided, this string is included in the new game session's ID. A game session ARN has the
     * following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * . Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained
     * for this time period and then deleted.
     * </p>
     * 
     * @param idempotencyToken
     *        Custom string that uniquely identifies the new game session request. This is useful for ensuring that game
     *        session requests with the same idempotency token are processed only once. Subsequent requests with the
     *        same string return the original <code>GameSession</code> object, with an updated status. Maximum token
     *        length is 48 characters. If provided, this string is included in the new game session's ID. A game session
     *        ARN has the following format:
     *        <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     *        . Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are
     *        retained for this time period and then deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * A set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     * 
     * @param gameSessionData
     *        A set of custom game session properties, formatted as a single string value. This data is passed to a game
     *        server process in the <a>GameSession</a> object with a request to start a new game session.
     */

    public void setGameSessionData(String gameSessionData) {
        this.gameSessionData = gameSessionData;
    }

    /**
     * <p>
     * A set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     * 
     * @return A set of custom game session properties, formatted as a single string value. This data is passed to a
     *         game server process in the <a>GameSession</a> object with a request to start a new game session.
     */

    public String getGameSessionData() {
        return this.gameSessionData;
    }

    /**
     * <p>
     * A set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     * 
     * @param gameSessionData
     *        A set of custom game session properties, formatted as a single string value. This data is passed to a game
     *        server process in the <a>GameSession</a> object with a request to start a new game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withGameSessionData(String gameSessionData) {
        setGameSessionData(gameSessionData);
        return this;
    }

    /**
     * <p>
     * A fleet's remote location to place the new game session in. If this parameter is not set, the new game session is
     * placed in the fleet's home Region. Specify a remote location with an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        A fleet's remote location to place the new game session in. If this parameter is not set, the new game
     *        session is placed in the fleet's home Region. Specify a remote location with an AWS Region code such as
     *        <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A fleet's remote location to place the new game session in. If this parameter is not set, the new game session is
     * placed in the fleet's home Region. Specify a remote location with an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return A fleet's remote location to place the new game session in. If this parameter is not set, the new game
     *         session is placed in the fleet's home Region. Specify a remote location with an AWS Region code such as
     *         <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A fleet's remote location to place the new game session in. If this parameter is not set, the new game session is
     * placed in the fleet's home Region. Specify a remote location with an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        A fleet's remote location to place the new game session in. If this parameter is not set, the new game
     *        session is placed in the fleet's home Region. Specify a remote location with an AWS Region code such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionRequest withLocation(String location) {
        setLocation(location);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getGameProperties() != null)
            sb.append("GameProperties: ").append(getGameProperties()).append(",");
        if (getCreatorId() != null)
            sb.append("CreatorId: ").append(getCreatorId()).append(",");
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getGameSessionData() != null)
            sb.append("GameSessionData: ").append(getGameSessionData()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGameSessionRequest == false)
            return false;
        CreateGameSessionRequest other = (CreateGameSessionRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null && other.getMaximumPlayerSessionCount().equals(this.getMaximumPlayerSessionCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGameProperties() == null ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        if (other.getCreatorId() == null ^ this.getCreatorId() == null)
            return false;
        if (other.getCreatorId() != null && other.getCreatorId().equals(this.getCreatorId()) == false)
            return false;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getGameSessionData() == null ^ this.getGameSessionData() == null)
            return false;
        if (other.getGameSessionData() != null && other.getGameSessionData().equals(this.getGameSessionData()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGameProperties() == null) ? 0 : getGameProperties().hashCode());
        hashCode = prime * hashCode + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getGameSessionData() == null) ? 0 : getGameSessionData().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateGameSessionRequest clone() {
        return (CreateGameSessionRequest) super.clone();
    }

}
