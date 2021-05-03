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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties describing a game session.
 * </p>
 * <p>
 * A game session in ACTIVE status can host players. When a game session ends, its status is set to
 * <code>TERMINATED</code>.
 * </p>
 * <p>
 * Once the session ends, the game session object is retained for 30 days. This means you can reuse idempotency token
 * values after this time. Game session logs are retained for 14 days.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
 * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> | <a>StartGameSessionPlacement</a>
 * | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a href=
 * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
 * >All APIs by task</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the game session. A game session ARN has the following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * .
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the fleet that the game session is running on.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet that this game session is running on.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date terminationTime;
    /**
     * <p>
     * Number of players currently in the game session.
     * </p>
     */
    private Integer currentPlayerSessionCount;
    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     * sessions.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the game
     * session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session. You can search
     * for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;
    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     */
    private String playerSessionCreationPolicy;
    /**
     * <p>
     * A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that
     * limits the number of game sessions a player can create.
     * </p>
     */
    private String creatorId;
    /**
     * <p>
     * A set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session.
     * </p>
     */
    private String gameSessionData;
    /**
     * <p>
     * Information about the matchmaking process that was used to create the game session. It is in JSON syntax,
     * formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned
     * to the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-server.html#match-server-data">Match
     * Data</a>. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are
     * added during a successful backfill (see <a>StartMatchBackfill</a>).
     * </p>
     */
    private String matchmakerData;
    /**
     * <p>
     * The fleet location where the game session is running. This value might specify the fleet's home Region or a
     * remote location. Location is expressed as an AWS Region code such as <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the game session. A game session ARN has the following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * .
     * </p>
     * 
     * @param gameSessionId
     *        A unique identifier for the game session. A game session ARN has the following format:
     *        <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     *        .
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * A unique identifier for the game session. A game session ARN has the following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * .
     * </p>
     * 
     * @return A unique identifier for the game session. A game session ARN has the following format:
     *         <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     *         .
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * A unique identifier for the game session. A game session ARN has the following format:
     * <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     * .
     * </p>
     * 
     * @param gameSessionId
     *        A unique identifier for the game session. A game session ARN has the following format:
     *        <code>arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
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

    public GameSession withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the game session is running on.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the game session is running on.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the game session is running on.
     * </p>
     * 
     * @return A unique identifier for the fleet that the game session is running on.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the game session is running on.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the game session is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet that this game session is running on.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift fleet that this game session is running on.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet that this game session is running on.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *         GameLift fleet that this game session is running on.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift fleet that this game session is running on.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift fleet that this game session is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param terminationTime
     *        A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setTerminationTime(java.util.Date terminationTime) {
        this.terminationTime = terminationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time
     *         as milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getTerminationTime() {
        return this.terminationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param terminationTime
     *        A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withTerminationTime(java.util.Date terminationTime) {
        setTerminationTime(terminationTime);
        return this;
    }

    /**
     * <p>
     * Number of players currently in the game session.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        Number of players currently in the game session.
     */

    public void setCurrentPlayerSessionCount(Integer currentPlayerSessionCount) {
        this.currentPlayerSessionCount = currentPlayerSessionCount;
    }

    /**
     * <p>
     * Number of players currently in the game session.
     * </p>
     * 
     * @return Number of players currently in the game session.
     */

    public Integer getCurrentPlayerSessionCount() {
        return this.currentPlayerSessionCount;
    }

    /**
     * <p>
     * Number of players currently in the game session.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        Number of players currently in the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withCurrentPlayerSessionCount(Integer currentPlayerSessionCount) {
        setCurrentPlayerSessionCount(currentPlayerSessionCount);
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

    public GameSession withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     * sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     *        sessions.
     * @see GameSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     * sessions.
     * </p>
     * 
     * @return Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     *         sessions.
     * @see GameSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     * sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     *        sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameSessionStatus
     */

    public GameSession withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     * sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     *        sessions.
     * @see GameSessionStatus
     */

    public void setStatus(GameSessionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     * sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must have an <code>ACTIVE</code> status to have player
     *        sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameSessionStatus
     */

    public GameSession withStatus(GameSessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the game
     * session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
     * </p>
     * 
     * @param statusReason
     *        Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the
     *        game session was hosted on a spot instance that was reclaimed, causing the active game session to be
     *        terminated.
     * @see GameSessionStatusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the game
     * session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
     * </p>
     * 
     * @return Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the
     *         game session was hosted on a spot instance that was reclaimed, causing the active game session to be
     *         terminated.
     * @see GameSessionStatusReason
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the game
     * session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
     * </p>
     * 
     * @param statusReason
     *        Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the
     *        game session was hosted on a spot instance that was reclaimed, causing the active game session to be
     *        terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameSessionStatusReason
     */

    public GameSession withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the game
     * session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
     * </p>
     * 
     * @param statusReason
     *        Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the
     *        game session was hosted on a spot instance that was reclaimed, causing the active game session to be
     *        terminated.
     * @see GameSessionStatusReason
     */

    public void setStatusReason(GameSessionStatusReason statusReason) {
        withStatusReason(statusReason);
    }

    /**
     * <p>
     * Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the game
     * session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
     * </p>
     * 
     * @param statusReason
     *        Provides additional information about game session status. <code>INTERRUPTED</code> indicates that the
     *        game session was hosted on a spot instance that was reclaimed, causing the active game session to be
     *        terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameSessionStatusReason
     */

    public GameSession withStatusReason(GameSessionStatusReason statusReason) {
        this.statusReason = statusReason.toString();
        return this;
    }

    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session. You can search
     * for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     * </p>
     * 
     * @return A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *         to a game server process in the <a>GameSession</a> object with a request to start a new game session. You
     *         can search for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a
     * game server process in the <a>GameSession</a> object with a request to start a new game session. You can search
     * for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     * </p>
     * 
     * @param gameProperties
     *        A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *        to a game server process in the <a>GameSession</a> object with a request to start a new game session. You
     *        can search for active game sessions based on this custom data with <a>SearchGameSessions</a>.
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
     * game server process in the <a>GameSession</a> object with a request to start a new game session. You can search
     * for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameProperties(java.util.Collection)} or {@link #withGameProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gameProperties
     *        A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *        to a game server process in the <a>GameSession</a> object with a request to start a new game session. You
     *        can search for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withGameProperties(GameProperty... gameProperties) {
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
     * game server process in the <a>GameSession</a> object with a request to start a new game session. You can search
     * for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     * </p>
     * 
     * @param gameProperties
     *        A set of custom properties for a game session, formatted as key:value pairs. These properties are passed
     *        to a game server process in the <a>GameSession</a> object with a request to start a new game session. You
     *        can search for active game sessions based on this custom data with <a>SearchGameSessions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withGameProperties(java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
        return this;
    }

    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address
     *        and port number.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @return The IP address of the game session. To connect to a GameLift game server, an app needs both the IP
     *         address and port number.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address
     *        and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @param dnsName
     *        The DNS identifier assigned to the instance that is running the game session. Values have the following
     *        format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *        >Amazon EC2 Instance IP Addressing</a>.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *        the IP address.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @return The DNS identifier assigned to the instance that is running the game session. Values have the following
     *         format:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *         >Amazon EC2 Instance IP Addressing</a>.)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *         the IP address.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @param dnsName
     *        The DNS identifier assigned to the instance that is running the game session. Values have the following
     *        format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *        >Amazon EC2 Instance IP Addressing</a>.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *        the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param port
     *        The port number for the game session. To connect to a GameLift game server, an app needs both the IP
     *        address and port number.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @return The port number for the game session. To connect to a GameLift game server, an app needs both the IP
     *         address and port number.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param port
     *        The port number for the game session. To connect to a GameLift game server, an app needs both the IP
     *        address and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new players.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(String playerSessionCreationPolicy) {
        this.playerSessionCreationPolicy = playerSessionCreationPolicy;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @return Indicates whether or not the game session is accepting new players.
     * @see PlayerSessionCreationPolicy
     */

    public String getPlayerSessionCreationPolicy() {
        return this.playerSessionCreationPolicy;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new players.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlayerSessionCreationPolicy
     */

    public GameSession withPlayerSessionCreationPolicy(String playerSessionCreationPolicy) {
        setPlayerSessionCreationPolicy(playerSessionCreationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new players.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(PlayerSessionCreationPolicy playerSessionCreationPolicy) {
        withPlayerSessionCreationPolicy(playerSessionCreationPolicy);
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new players.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlayerSessionCreationPolicy
     */

    public GameSession withPlayerSessionCreationPolicy(PlayerSessionCreationPolicy playerSessionCreationPolicy) {
        this.playerSessionCreationPolicy = playerSessionCreationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that
     * limits the number of game sessions a player can create.
     * </p>
     * 
     * @param creatorId
     *        A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists),
     *        that limits the number of game sessions a player can create.
     */

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * <p>
     * A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that
     * limits the number of game sessions a player can create.
     * </p>
     * 
     * @return A unique identifier for a player. This ID is used to enforce a resource protection policy (if one
     *         exists), that limits the number of game sessions a player can create.
     */

    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * <p>
     * A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that
     * limits the number of game sessions a player can create.
     * </p>
     * 
     * @param creatorId
     *        A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists),
     *        that limits the number of game sessions a player can create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withCreatorId(String creatorId) {
        setCreatorId(creatorId);
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

    public GameSession withGameSessionData(String gameSessionData) {
        setGameSessionData(gameSessionData);
        return this;
    }

    /**
     * <p>
     * Information about the matchmaking process that was used to create the game session. It is in JSON syntax,
     * formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned
     * to the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-server.html#match-server-data">Match
     * Data</a>. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are
     * added during a successful backfill (see <a>StartMatchBackfill</a>).
     * </p>
     * 
     * @param matchmakerData
     *        Information about the matchmaking process that was used to create the game session. It is in JSON syntax,
     *        formatted as a string. In addition the matchmaking configuration used, it contains data on all players
     *        assigned to the match, including player attributes and team assignments. For more details on matchmaker
     *        data, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-server.html#match-server-data"
     *        >Match Data</a>. Matchmaker data is useful when requesting match backfills, and is updated whenever new
     *        players are added during a successful backfill (see <a>StartMatchBackfill</a>).
     */

    public void setMatchmakerData(String matchmakerData) {
        this.matchmakerData = matchmakerData;
    }

    /**
     * <p>
     * Information about the matchmaking process that was used to create the game session. It is in JSON syntax,
     * formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned
     * to the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-server.html#match-server-data">Match
     * Data</a>. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are
     * added during a successful backfill (see <a>StartMatchBackfill</a>).
     * </p>
     * 
     * @return Information about the matchmaking process that was used to create the game session. It is in JSON syntax,
     *         formatted as a string. In addition the matchmaking configuration used, it contains data on all players
     *         assigned to the match, including player attributes and team assignments. For more details on matchmaker
     *         data, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-server.html#match-server-data"
     *         >Match Data</a>. Matchmaker data is useful when requesting match backfills, and is updated whenever new
     *         players are added during a successful backfill (see <a>StartMatchBackfill</a>).
     */

    public String getMatchmakerData() {
        return this.matchmakerData;
    }

    /**
     * <p>
     * Information about the matchmaking process that was used to create the game session. It is in JSON syntax,
     * formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned
     * to the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-server.html#match-server-data">Match
     * Data</a>. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are
     * added during a successful backfill (see <a>StartMatchBackfill</a>).
     * </p>
     * 
     * @param matchmakerData
     *        Information about the matchmaking process that was used to create the game session. It is in JSON syntax,
     *        formatted as a string. In addition the matchmaking configuration used, it contains data on all players
     *        assigned to the match, including player attributes and team assignments. For more details on matchmaker
     *        data, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-server.html#match-server-data"
     *        >Match Data</a>. Matchmaker data is useful when requesting match backfills, and is updated whenever new
     *        players are added during a successful backfill (see <a>StartMatchBackfill</a>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withMatchmakerData(String matchmakerData) {
        setMatchmakerData(matchmakerData);
        return this;
    }

    /**
     * <p>
     * The fleet location where the game session is running. This value might specify the fleet's home Region or a
     * remote location. Location is expressed as an AWS Region code such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location where the game session is running. This value might specify the fleet's home Region or
     *        a remote location. Location is expressed as an AWS Region code such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fleet location where the game session is running. This value might specify the fleet's home Region or a
     * remote location. Location is expressed as an AWS Region code such as <code>us-west-2</code>.
     * </p>
     * 
     * @return The fleet location where the game session is running. This value might specify the fleet's home Region or
     *         a remote location. Location is expressed as an AWS Region code such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fleet location where the game session is running. This value might specify the fleet's home Region or a
     * remote location. Location is expressed as an AWS Region code such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location where the game session is running. This value might specify the fleet's home Region or
     *        a remote location. Location is expressed as an AWS Region code such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSession withLocation(String location) {
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
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTerminationTime() != null)
            sb.append("TerminationTime: ").append(getTerminationTime()).append(",");
        if (getCurrentPlayerSessionCount() != null)
            sb.append("CurrentPlayerSessionCount: ").append(getCurrentPlayerSessionCount()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getGameProperties() != null)
            sb.append("GameProperties: ").append(getGameProperties()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getPlayerSessionCreationPolicy() != null)
            sb.append("PlayerSessionCreationPolicy: ").append(getPlayerSessionCreationPolicy()).append(",");
        if (getCreatorId() != null)
            sb.append("CreatorId: ").append(getCreatorId()).append(",");
        if (getGameSessionData() != null)
            sb.append("GameSessionData: ").append(getGameSessionData()).append(",");
        if (getMatchmakerData() != null)
            sb.append("MatchmakerData: ").append(getMatchmakerData()).append(",");
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

        if (obj instanceof GameSession == false)
            return false;
        GameSession other = (GameSession) obj;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTerminationTime() == null ^ this.getTerminationTime() == null)
            return false;
        if (other.getTerminationTime() != null && other.getTerminationTime().equals(this.getTerminationTime()) == false)
            return false;
        if (other.getCurrentPlayerSessionCount() == null ^ this.getCurrentPlayerSessionCount() == null)
            return false;
        if (other.getCurrentPlayerSessionCount() != null && other.getCurrentPlayerSessionCount().equals(this.getCurrentPlayerSessionCount()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null && other.getMaximumPlayerSessionCount().equals(this.getMaximumPlayerSessionCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getGameProperties() == null ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getPlayerSessionCreationPolicy() == null ^ this.getPlayerSessionCreationPolicy() == null)
            return false;
        if (other.getPlayerSessionCreationPolicy() != null && other.getPlayerSessionCreationPolicy().equals(this.getPlayerSessionCreationPolicy()) == false)
            return false;
        if (other.getCreatorId() == null ^ this.getCreatorId() == null)
            return false;
        if (other.getCreatorId() != null && other.getCreatorId().equals(this.getCreatorId()) == false)
            return false;
        if (other.getGameSessionData() == null ^ this.getGameSessionData() == null)
            return false;
        if (other.getGameSessionData() != null && other.getGameSessionData().equals(this.getGameSessionData()) == false)
            return false;
        if (other.getMatchmakerData() == null ^ this.getMatchmakerData() == null)
            return false;
        if (other.getMatchmakerData() != null && other.getMatchmakerData().equals(this.getMatchmakerData()) == false)
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

        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationTime() == null) ? 0 : getTerminationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentPlayerSessionCount() == null) ? 0 : getCurrentPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getGameProperties() == null) ? 0 : getGameProperties().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getPlayerSessionCreationPolicy() == null) ? 0 : getPlayerSessionCreationPolicy().hashCode());
        hashCode = prime * hashCode + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionData() == null) ? 0 : getGameSessionData().hashCode());
        hashCode = prime * hashCode + ((getMatchmakerData() == null) ? 0 : getMatchmakerData().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public GameSession clone() {
        try {
            return (GameSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
