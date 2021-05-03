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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for a robot application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RobotApplicationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RobotApplicationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the robot application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The version of the robot application.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * Information about a robot software suite (ROS distribution).
     * </p>
     */
    private RobotSoftwareSuite robotSoftwareSuite;

    /**
     * <p>
     * The name of the robot application.
     * </p>
     * 
     * @param name
     *        The name of the robot application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the robot application.
     * </p>
     * 
     * @return The name of the robot application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the robot application.
     * </p>
     * 
     * @param name
     *        The name of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the robot.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the robot.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @param version
     *        The version of the robot application.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @return The version of the robot application.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @param version
     *        The version of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationSummary withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the robot application was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the robot application was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the robot application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * Information about a robot software suite (ROS distribution).
     * </p>
     * 
     * @param robotSoftwareSuite
     *        Information about a robot software suite (ROS distribution).
     */

    public void setRobotSoftwareSuite(RobotSoftwareSuite robotSoftwareSuite) {
        this.robotSoftwareSuite = robotSoftwareSuite;
    }

    /**
     * <p>
     * Information about a robot software suite (ROS distribution).
     * </p>
     * 
     * @return Information about a robot software suite (ROS distribution).
     */

    public RobotSoftwareSuite getRobotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }

    /**
     * <p>
     * Information about a robot software suite (ROS distribution).
     * </p>
     * 
     * @param robotSoftwareSuite
     *        Information about a robot software suite (ROS distribution).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationSummary withRobotSoftwareSuite(RobotSoftwareSuite robotSoftwareSuite) {
        setRobotSoftwareSuite(robotSoftwareSuite);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getRobotSoftwareSuite() != null)
            sb.append("RobotSoftwareSuite: ").append(getRobotSoftwareSuite());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RobotApplicationSummary == false)
            return false;
        RobotApplicationSummary other = (RobotApplicationSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getRobotSoftwareSuite() == null ^ this.getRobotSoftwareSuite() == null)
            return false;
        if (other.getRobotSoftwareSuite() != null && other.getRobotSoftwareSuite().equals(this.getRobotSoftwareSuite()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getRobotSoftwareSuite() == null) ? 0 : getRobotSoftwareSuite().hashCode());
        return hashCode;
    }

    @Override
    public RobotApplicationSummary clone() {
        try {
            return (RobotApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.RobotApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
