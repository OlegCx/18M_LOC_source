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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRobotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot to be described.
     * </p>
     */
    private String robot;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot to be described.
     * </p>
     * 
     * @param robot
     *        The Amazon Resource Name (ARN) of the robot to be described.
     */

    public void setRobot(String robot) {
        this.robot = robot;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot to be described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the robot to be described.
     */

    public String getRobot() {
        return this.robot;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot to be described.
     * </p>
     * 
     * @param robot
     *        The Amazon Resource Name (ARN) of the robot to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRobotRequest withRobot(String robot) {
        setRobot(robot);
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
        if (getRobot() != null)
            sb.append("Robot: ").append(getRobot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRobotRequest == false)
            return false;
        DescribeRobotRequest other = (DescribeRobotRequest) obj;
        if (other.getRobot() == null ^ this.getRobot() == null)
            return false;
        if (other.getRobot() != null && other.getRobot().equals(this.getRobot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRobot() == null) ? 0 : getRobot().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRobotRequest clone() {
        return (DescribeRobotRequest) super.clone();
    }

}
