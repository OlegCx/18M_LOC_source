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

/**
 * <p>
 * Represents the returned data in response to a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGameSessionQueueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes the newly created game session queue.
     * </p>
     */
    private GameSessionQueue gameSessionQueue;

    /**
     * <p>
     * An object that describes the newly created game session queue.
     * </p>
     * 
     * @param gameSessionQueue
     *        An object that describes the newly created game session queue.
     */

    public void setGameSessionQueue(GameSessionQueue gameSessionQueue) {
        this.gameSessionQueue = gameSessionQueue;
    }

    /**
     * <p>
     * An object that describes the newly created game session queue.
     * </p>
     * 
     * @return An object that describes the newly created game session queue.
     */

    public GameSessionQueue getGameSessionQueue() {
        return this.gameSessionQueue;
    }

    /**
     * <p>
     * An object that describes the newly created game session queue.
     * </p>
     * 
     * @param gameSessionQueue
     *        An object that describes the newly created game session queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueResult withGameSessionQueue(GameSessionQueue gameSessionQueue) {
        setGameSessionQueue(gameSessionQueue);
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
        if (getGameSessionQueue() != null)
            sb.append("GameSessionQueue: ").append(getGameSessionQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGameSessionQueueResult == false)
            return false;
        CreateGameSessionQueueResult other = (CreateGameSessionQueueResult) obj;
        if (other.getGameSessionQueue() == null ^ this.getGameSessionQueue() == null)
            return false;
        if (other.getGameSessionQueue() != null && other.getGameSessionQueue().equals(this.getGameSessionQueue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSessionQueue() == null) ? 0 : getGameSessionQueue().hashCode());
        return hashCode;
    }

    @Override
    public CreateGameSessionQueueResult clone() {
        try {
            return (CreateGameSessionQueueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
