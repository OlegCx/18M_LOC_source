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
 * Represents a player in matchmaking. When starting a matchmaking request, a player has a player ID, attributes, and
 * may have latency data. Team information is added after a match has been successfully completed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Player" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Player implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a player
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * A collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must
     * match the <i>playerAttributes</i> used in a matchmaking rule set. Example:
     * <code>"PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}</code>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> playerAttributes;
    /**
     * <p>
     * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
     * </p>
     */
    private String team;
    /**
     * <p>
     * A set of values, expressed in milliseconds, that indicates the amount of latency that a player experiences when
     * connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in Regions for
     * which latency is reported.
     * </p>
     * <p>
     * If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If
     * no latency is reported in this scenario, FlexMatch assumes that no Regions are available to the player and the
     * ticket is not matchable.
     * </p>
     */
    private java.util.Map<String, Integer> latencyInMs;

    /**
     * <p>
     * A unique identifier for a player
     * </p>
     * 
     * @param playerId
     *        A unique identifier for a player
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * A unique identifier for a player
     * </p>
     * 
     * @return A unique identifier for a player
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * A unique identifier for a player
     * </p>
     * 
     * @param playerId
     *        A unique identifier for a player
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Player withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * A collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must
     * match the <i>playerAttributes</i> used in a matchmaking rule set. Example:
     * <code>"PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}</code>.
     * </p>
     * 
     * @return A collection of key:value pairs containing player information for use in matchmaking. Player attribute
     *         keys must match the <i>playerAttributes</i> used in a matchmaking rule set. Example:
     *         <code>"PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}</code>.
     */

    public java.util.Map<String, AttributeValue> getPlayerAttributes() {
        return playerAttributes;
    }

    /**
     * <p>
     * A collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must
     * match the <i>playerAttributes</i> used in a matchmaking rule set. Example:
     * <code>"PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}</code>.
     * </p>
     * 
     * @param playerAttributes
     *        A collection of key:value pairs containing player information for use in matchmaking. Player attribute
     *        keys must match the <i>playerAttributes</i> used in a matchmaking rule set. Example:
     *        <code>"PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}</code>.
     */

    public void setPlayerAttributes(java.util.Map<String, AttributeValue> playerAttributes) {
        this.playerAttributes = playerAttributes;
    }

    /**
     * <p>
     * A collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must
     * match the <i>playerAttributes</i> used in a matchmaking rule set. Example:
     * <code>"PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}</code>.
     * </p>
     * 
     * @param playerAttributes
     *        A collection of key:value pairs containing player information for use in matchmaking. Player attribute
     *        keys must match the <i>playerAttributes</i> used in a matchmaking rule set. Example:
     *        <code>"PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Player withPlayerAttributes(java.util.Map<String, AttributeValue> playerAttributes) {
        setPlayerAttributes(playerAttributes);
        return this;
    }

    /**
     * Add a single PlayerAttributes entry
     *
     * @see Player#withPlayerAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Player addPlayerAttributesEntry(String key, AttributeValue value) {
        if (null == this.playerAttributes) {
            this.playerAttributes = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.playerAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.playerAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PlayerAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Player clearPlayerAttributesEntries() {
        this.playerAttributes = null;
        return this;
    }

    /**
     * <p>
     * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
     * </p>
     * 
     * @param team
     *        Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule
     *        set.
     */

    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * <p>
     * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
     * </p>
     * 
     * @return Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule
     *         set.
     */

    public String getTeam() {
        return this.team;
    }

    /**
     * <p>
     * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
     * </p>
     * 
     * @param team
     *        Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Player withTeam(String team) {
        setTeam(team);
        return this;
    }

    /**
     * <p>
     * A set of values, expressed in milliseconds, that indicates the amount of latency that a player experiences when
     * connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in Regions for
     * which latency is reported.
     * </p>
     * <p>
     * If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If
     * no latency is reported in this scenario, FlexMatch assumes that no Regions are available to the player and the
     * ticket is not matchable.
     * </p>
     * 
     * @return A set of values, expressed in milliseconds, that indicates the amount of latency that a player
     *         experiences when connected to AWS Regions. If this property is present, FlexMatch considers placing the
     *         match only in Regions for which latency is reported. </p>
     *         <p>
     *         If a matchmaker has a rule that evaluates player latency, players must report latency in order to be
     *         matched. If no latency is reported in this scenario, FlexMatch assumes that no Regions are available to
     *         the player and the ticket is not matchable.
     */

    public java.util.Map<String, Integer> getLatencyInMs() {
        return latencyInMs;
    }

    /**
     * <p>
     * A set of values, expressed in milliseconds, that indicates the amount of latency that a player experiences when
     * connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in Regions for
     * which latency is reported.
     * </p>
     * <p>
     * If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If
     * no latency is reported in this scenario, FlexMatch assumes that no Regions are available to the player and the
     * ticket is not matchable.
     * </p>
     * 
     * @param latencyInMs
     *        A set of values, expressed in milliseconds, that indicates the amount of latency that a player experiences
     *        when connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in
     *        Regions for which latency is reported. </p>
     *        <p>
     *        If a matchmaker has a rule that evaluates player latency, players must report latency in order to be
     *        matched. If no latency is reported in this scenario, FlexMatch assumes that no Regions are available to
     *        the player and the ticket is not matchable.
     */

    public void setLatencyInMs(java.util.Map<String, Integer> latencyInMs) {
        this.latencyInMs = latencyInMs;
    }

    /**
     * <p>
     * A set of values, expressed in milliseconds, that indicates the amount of latency that a player experiences when
     * connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in Regions for
     * which latency is reported.
     * </p>
     * <p>
     * If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If
     * no latency is reported in this scenario, FlexMatch assumes that no Regions are available to the player and the
     * ticket is not matchable.
     * </p>
     * 
     * @param latencyInMs
     *        A set of values, expressed in milliseconds, that indicates the amount of latency that a player experiences
     *        when connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in
     *        Regions for which latency is reported. </p>
     *        <p>
     *        If a matchmaker has a rule that evaluates player latency, players must report latency in order to be
     *        matched. If no latency is reported in this scenario, FlexMatch assumes that no Regions are available to
     *        the player and the ticket is not matchable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Player withLatencyInMs(java.util.Map<String, Integer> latencyInMs) {
        setLatencyInMs(latencyInMs);
        return this;
    }

    /**
     * Add a single LatencyInMs entry
     *
     * @see Player#withLatencyInMs
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Player addLatencyInMsEntry(String key, Integer value) {
        if (null == this.latencyInMs) {
            this.latencyInMs = new java.util.HashMap<String, Integer>();
        }
        if (this.latencyInMs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.latencyInMs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LatencyInMs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Player clearLatencyInMsEntries() {
        this.latencyInMs = null;
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
        if (getPlayerId() != null)
            sb.append("PlayerId: ").append(getPlayerId()).append(",");
        if (getPlayerAttributes() != null)
            sb.append("PlayerAttributes: ").append(getPlayerAttributes()).append(",");
        if (getTeam() != null)
            sb.append("Team: ").append(getTeam()).append(",");
        if (getLatencyInMs() != null)
            sb.append("LatencyInMs: ").append(getLatencyInMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Player == false)
            return false;
        Player other = (Player) obj;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getPlayerAttributes() == null ^ this.getPlayerAttributes() == null)
            return false;
        if (other.getPlayerAttributes() != null && other.getPlayerAttributes().equals(this.getPlayerAttributes()) == false)
            return false;
        if (other.getTeam() == null ^ this.getTeam() == null)
            return false;
        if (other.getTeam() != null && other.getTeam().equals(this.getTeam()) == false)
            return false;
        if (other.getLatencyInMs() == null ^ this.getLatencyInMs() == null)
            return false;
        if (other.getLatencyInMs() != null && other.getLatencyInMs().equals(this.getLatencyInMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime * hashCode + ((getPlayerAttributes() == null) ? 0 : getPlayerAttributes().hashCode());
        hashCode = prime * hashCode + ((getTeam() == null) ? 0 : getTeam().hashCode());
        hashCode = prime * hashCode + ((getLatencyInMs() == null) ? 0 : getLatencyInMs().hashCode());
        return hashCode;
    }

    @Override
    public Player clone() {
        try {
            return (Player) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.PlayerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
