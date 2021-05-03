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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the alarms to retrieve information about.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmNames;
    /**
     * <p>
     * An alarm name prefix. If you specify this parameter, you receive information about all alarms that have names
     * that start with this prefix.
     * </p>
     * <p>
     * If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     */
    private String alarmNamePrefix;
    /**
     * <p>
     * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you
     * omit this parameter, only metric alarms are returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmTypes;
    /**
     * <p>
     * If you use this parameter and specify the name of a composite alarm, the operation returns information about the
     * "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the
     * <code>AlarmRule</code> field of the composite alarm that you specify in <code>ChildrenOfAlarmName</code>.
     * Information about the composite alarm that you name in <code>ChildrenOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ChildrenOfAlarmName</code>, you cannot specify any other parameters in the request except
     * for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the <code>Alarm Name</code>, <code>ARN</code>, <code>StateValue</code> (OK/ALARM/INSUFFICIENT_DATA), and
     * <code>StateUpdatedTimestamp</code> information are returned by this operation when you use this parameter. To get
     * complete information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the
     * parent alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     */
    private String childrenOfAlarmName;
    /**
     * <p>
     * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information
     * about the "parent" alarms of the alarm you specify. These are the composite alarms that have
     * <code>AlarmRule</code> parameters that reference the alarm named in <code>ParentsOfAlarmName</code>. Information
     * about the alarm that you specify in <code>ParentsOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ParentsOfAlarmName</code>, you cannot specify any other parameters in the request except for
     * <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete
     * information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the parent
     * alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     */
    private String parentsOfAlarmName;
    /**
     * <p>
     * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
     * </p>
     */
    private String stateValue;
    /**
     * <p>
     * Use this parameter to filter the results of the operation to only those alarms that use a certain alarm action.
     * For example, you could specify the ARN of an SNS topic to find all alarms that send notifications to that topic.
     * </p>
     */
    private String actionPrefix;
    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the alarms to retrieve information about.
     * </p>
     * 
     * @return The names of the alarms to retrieve information about.
     */

    public java.util.List<String> getAlarmNames() {
        if (alarmNames == null) {
            alarmNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmNames;
    }

    /**
     * <p>
     * The names of the alarms to retrieve information about.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms to retrieve information about.
     */

    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }

        this.alarmNames = new com.amazonaws.internal.SdkInternalList<String>(alarmNames);
    }

    /**
     * <p>
     * The names of the alarms to retrieve information about.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmNames(java.util.Collection)} or {@link #withAlarmNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms to retrieve information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withAlarmNames(String... alarmNames) {
        if (this.alarmNames == null) {
            setAlarmNames(new com.amazonaws.internal.SdkInternalList<String>(alarmNames.length));
        }
        for (String ele : alarmNames) {
            this.alarmNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the alarms to retrieve information about.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms to retrieve information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withAlarmNames(java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
        return this;
    }

    /**
     * <p>
     * An alarm name prefix. If you specify this parameter, you receive information about all alarms that have names
     * that start with this prefix.
     * </p>
     * <p>
     * If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     * 
     * @param alarmNamePrefix
     *        An alarm name prefix. If you specify this parameter, you receive information about all alarms that have
     *        names that start with this prefix.</p>
     *        <p>
     *        If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     */

    public void setAlarmNamePrefix(String alarmNamePrefix) {
        this.alarmNamePrefix = alarmNamePrefix;
    }

    /**
     * <p>
     * An alarm name prefix. If you specify this parameter, you receive information about all alarms that have names
     * that start with this prefix.
     * </p>
     * <p>
     * If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     * 
     * @return An alarm name prefix. If you specify this parameter, you receive information about all alarms that have
     *         names that start with this prefix.</p>
     *         <p>
     *         If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     */

    public String getAlarmNamePrefix() {
        return this.alarmNamePrefix;
    }

    /**
     * <p>
     * An alarm name prefix. If you specify this parameter, you receive information about all alarms that have names
     * that start with this prefix.
     * </p>
     * <p>
     * If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     * 
     * @param alarmNamePrefix
     *        An alarm name prefix. If you specify this parameter, you receive information about all alarms that have
     *        names that start with this prefix.</p>
     *        <p>
     *        If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withAlarmNamePrefix(String alarmNamePrefix) {
        setAlarmNamePrefix(alarmNamePrefix);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you
     * omit this parameter, only metric alarms are returned.
     * </p>
     * 
     * @return Use this parameter to specify whether you want the operation to return metric alarms or composite alarms.
     *         If you omit this parameter, only metric alarms are returned.
     * @see AlarmType
     */

    public java.util.List<String> getAlarmTypes() {
        if (alarmTypes == null) {
            alarmTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmTypes;
    }

    /**
     * <p>
     * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you
     * omit this parameter, only metric alarms are returned.
     * </p>
     * 
     * @param alarmTypes
     *        Use this parameter to specify whether you want the operation to return metric alarms or composite alarms.
     *        If you omit this parameter, only metric alarms are returned.
     * @see AlarmType
     */

    public void setAlarmTypes(java.util.Collection<String> alarmTypes) {
        if (alarmTypes == null) {
            this.alarmTypes = null;
            return;
        }

        this.alarmTypes = new com.amazonaws.internal.SdkInternalList<String>(alarmTypes);
    }

    /**
     * <p>
     * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you
     * omit this parameter, only metric alarms are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmTypes(java.util.Collection)} or {@link #withAlarmTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmTypes
     *        Use this parameter to specify whether you want the operation to return metric alarms or composite alarms.
     *        If you omit this parameter, only metric alarms are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public DescribeAlarmsRequest withAlarmTypes(String... alarmTypes) {
        if (this.alarmTypes == null) {
            setAlarmTypes(new com.amazonaws.internal.SdkInternalList<String>(alarmTypes.length));
        }
        for (String ele : alarmTypes) {
            this.alarmTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you
     * omit this parameter, only metric alarms are returned.
     * </p>
     * 
     * @param alarmTypes
     *        Use this parameter to specify whether you want the operation to return metric alarms or composite alarms.
     *        If you omit this parameter, only metric alarms are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public DescribeAlarmsRequest withAlarmTypes(java.util.Collection<String> alarmTypes) {
        setAlarmTypes(alarmTypes);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you
     * omit this parameter, only metric alarms are returned.
     * </p>
     * 
     * @param alarmTypes
     *        Use this parameter to specify whether you want the operation to return metric alarms or composite alarms.
     *        If you omit this parameter, only metric alarms are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public DescribeAlarmsRequest withAlarmTypes(AlarmType... alarmTypes) {
        com.amazonaws.internal.SdkInternalList<String> alarmTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(alarmTypes.length);
        for (AlarmType value : alarmTypes) {
            alarmTypesCopy.add(value.toString());
        }
        if (getAlarmTypes() == null) {
            setAlarmTypes(alarmTypesCopy);
        } else {
            getAlarmTypes().addAll(alarmTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * If you use this parameter and specify the name of a composite alarm, the operation returns information about the
     * "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the
     * <code>AlarmRule</code> field of the composite alarm that you specify in <code>ChildrenOfAlarmName</code>.
     * Information about the composite alarm that you name in <code>ChildrenOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ChildrenOfAlarmName</code>, you cannot specify any other parameters in the request except
     * for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the <code>Alarm Name</code>, <code>ARN</code>, <code>StateValue</code> (OK/ALARM/INSUFFICIENT_DATA), and
     * <code>StateUpdatedTimestamp</code> information are returned by this operation when you use this parameter. To get
     * complete information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the
     * parent alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     * 
     * @param childrenOfAlarmName
     *        If you use this parameter and specify the name of a composite alarm, the operation returns information
     *        about the "children" alarms of the alarm you specify. These are the metric alarms and composite alarms
     *        referenced in the <code>AlarmRule</code> field of the composite alarm that you specify in
     *        <code>ChildrenOfAlarmName</code>. Information about the composite alarm that you name in
     *        <code>ChildrenOfAlarmName</code> is not returned.</p>
     *        <p>
     *        If you specify <code>ChildrenOfAlarmName</code>, you cannot specify any other parameters in the request
     *        except for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation
     *        error.
     *        </p>
     *        <note>
     *        <p>
     *        Only the <code>Alarm Name</code>, <code>ARN</code>, <code>StateValue</code> (OK/ALARM/INSUFFICIENT_DATA),
     *        and <code>StateUpdatedTimestamp</code> information are returned by this operation when you use this
     *        parameter. To get complete information about these alarms, perform another <code>DescribeAlarms</code>
     *        operation and specify the parent alarm names in the <code>AlarmNames</code> parameter.
     *        </p>
     */

    public void setChildrenOfAlarmName(String childrenOfAlarmName) {
        this.childrenOfAlarmName = childrenOfAlarmName;
    }

    /**
     * <p>
     * If you use this parameter and specify the name of a composite alarm, the operation returns information about the
     * "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the
     * <code>AlarmRule</code> field of the composite alarm that you specify in <code>ChildrenOfAlarmName</code>.
     * Information about the composite alarm that you name in <code>ChildrenOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ChildrenOfAlarmName</code>, you cannot specify any other parameters in the request except
     * for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the <code>Alarm Name</code>, <code>ARN</code>, <code>StateValue</code> (OK/ALARM/INSUFFICIENT_DATA), and
     * <code>StateUpdatedTimestamp</code> information are returned by this operation when you use this parameter. To get
     * complete information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the
     * parent alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     * 
     * @return If you use this parameter and specify the name of a composite alarm, the operation returns information
     *         about the "children" alarms of the alarm you specify. These are the metric alarms and composite alarms
     *         referenced in the <code>AlarmRule</code> field of the composite alarm that you specify in
     *         <code>ChildrenOfAlarmName</code>. Information about the composite alarm that you name in
     *         <code>ChildrenOfAlarmName</code> is not returned.</p>
     *         <p>
     *         If you specify <code>ChildrenOfAlarmName</code>, you cannot specify any other parameters in the request
     *         except for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation
     *         error.
     *         </p>
     *         <note>
     *         <p>
     *         Only the <code>Alarm Name</code>, <code>ARN</code>, <code>StateValue</code> (OK/ALARM/INSUFFICIENT_DATA),
     *         and <code>StateUpdatedTimestamp</code> information are returned by this operation when you use this
     *         parameter. To get complete information about these alarms, perform another <code>DescribeAlarms</code>
     *         operation and specify the parent alarm names in the <code>AlarmNames</code> parameter.
     *         </p>
     */

    public String getChildrenOfAlarmName() {
        return this.childrenOfAlarmName;
    }

    /**
     * <p>
     * If you use this parameter and specify the name of a composite alarm, the operation returns information about the
     * "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the
     * <code>AlarmRule</code> field of the composite alarm that you specify in <code>ChildrenOfAlarmName</code>.
     * Information about the composite alarm that you name in <code>ChildrenOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ChildrenOfAlarmName</code>, you cannot specify any other parameters in the request except
     * for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the <code>Alarm Name</code>, <code>ARN</code>, <code>StateValue</code> (OK/ALARM/INSUFFICIENT_DATA), and
     * <code>StateUpdatedTimestamp</code> information are returned by this operation when you use this parameter. To get
     * complete information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the
     * parent alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     * 
     * @param childrenOfAlarmName
     *        If you use this parameter and specify the name of a composite alarm, the operation returns information
     *        about the "children" alarms of the alarm you specify. These are the metric alarms and composite alarms
     *        referenced in the <code>AlarmRule</code> field of the composite alarm that you specify in
     *        <code>ChildrenOfAlarmName</code>. Information about the composite alarm that you name in
     *        <code>ChildrenOfAlarmName</code> is not returned.</p>
     *        <p>
     *        If you specify <code>ChildrenOfAlarmName</code>, you cannot specify any other parameters in the request
     *        except for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation
     *        error.
     *        </p>
     *        <note>
     *        <p>
     *        Only the <code>Alarm Name</code>, <code>ARN</code>, <code>StateValue</code> (OK/ALARM/INSUFFICIENT_DATA),
     *        and <code>StateUpdatedTimestamp</code> information are returned by this operation when you use this
     *        parameter. To get complete information about these alarms, perform another <code>DescribeAlarms</code>
     *        operation and specify the parent alarm names in the <code>AlarmNames</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withChildrenOfAlarmName(String childrenOfAlarmName) {
        setChildrenOfAlarmName(childrenOfAlarmName);
        return this;
    }

    /**
     * <p>
     * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information
     * about the "parent" alarms of the alarm you specify. These are the composite alarms that have
     * <code>AlarmRule</code> parameters that reference the alarm named in <code>ParentsOfAlarmName</code>. Information
     * about the alarm that you specify in <code>ParentsOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ParentsOfAlarmName</code>, you cannot specify any other parameters in the request except for
     * <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete
     * information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the parent
     * alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     * 
     * @param parentsOfAlarmName
     *        If you use this parameter and specify the name of a metric or composite alarm, the operation returns
     *        information about the "parent" alarms of the alarm you specify. These are the composite alarms that have
     *        <code>AlarmRule</code> parameters that reference the alarm named in <code>ParentsOfAlarmName</code>.
     *        Information about the alarm that you specify in <code>ParentsOfAlarmName</code> is not returned.</p>
     *        <p>
     *        If you specify <code>ParentsOfAlarmName</code>, you cannot specify any other parameters in the request
     *        except for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation
     *        error.
     *        </p>
     *        <note>
     *        <p>
     *        Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete
     *        information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the
     *        parent alarm names in the <code>AlarmNames</code> parameter.
     *        </p>
     */

    public void setParentsOfAlarmName(String parentsOfAlarmName) {
        this.parentsOfAlarmName = parentsOfAlarmName;
    }

    /**
     * <p>
     * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information
     * about the "parent" alarms of the alarm you specify. These are the composite alarms that have
     * <code>AlarmRule</code> parameters that reference the alarm named in <code>ParentsOfAlarmName</code>. Information
     * about the alarm that you specify in <code>ParentsOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ParentsOfAlarmName</code>, you cannot specify any other parameters in the request except for
     * <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete
     * information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the parent
     * alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     * 
     * @return If you use this parameter and specify the name of a metric or composite alarm, the operation returns
     *         information about the "parent" alarms of the alarm you specify. These are the composite alarms that have
     *         <code>AlarmRule</code> parameters that reference the alarm named in <code>ParentsOfAlarmName</code>.
     *         Information about the alarm that you specify in <code>ParentsOfAlarmName</code> is not returned.</p>
     *         <p>
     *         If you specify <code>ParentsOfAlarmName</code>, you cannot specify any other parameters in the request
     *         except for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation
     *         error.
     *         </p>
     *         <note>
     *         <p>
     *         Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete
     *         information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the
     *         parent alarm names in the <code>AlarmNames</code> parameter.
     *         </p>
     */

    public String getParentsOfAlarmName() {
        return this.parentsOfAlarmName;
    }

    /**
     * <p>
     * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information
     * about the "parent" alarms of the alarm you specify. These are the composite alarms that have
     * <code>AlarmRule</code> parameters that reference the alarm named in <code>ParentsOfAlarmName</code>. Information
     * about the alarm that you specify in <code>ParentsOfAlarmName</code> is not returned.
     * </p>
     * <p>
     * If you specify <code>ParentsOfAlarmName</code>, you cannot specify any other parameters in the request except for
     * <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation error.
     * </p>
     * <note>
     * <p>
     * Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete
     * information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the parent
     * alarm names in the <code>AlarmNames</code> parameter.
     * </p>
     * </note>
     * 
     * @param parentsOfAlarmName
     *        If you use this parameter and specify the name of a metric or composite alarm, the operation returns
     *        information about the "parent" alarms of the alarm you specify. These are the composite alarms that have
     *        <code>AlarmRule</code> parameters that reference the alarm named in <code>ParentsOfAlarmName</code>.
     *        Information about the alarm that you specify in <code>ParentsOfAlarmName</code> is not returned.</p>
     *        <p>
     *        If you specify <code>ParentsOfAlarmName</code>, you cannot specify any other parameters in the request
     *        except for <code>MaxRecords</code> and <code>NextToken</code>. If you do so, you receive a validation
     *        error.
     *        </p>
     *        <note>
     *        <p>
     *        Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete
     *        information about these alarms, perform another <code>DescribeAlarms</code> operation and specify the
     *        parent alarm names in the <code>AlarmNames</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withParentsOfAlarmName(String parentsOfAlarmName) {
        setParentsOfAlarmName(parentsOfAlarmName);
        return this;
    }

    /**
     * <p>
     * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
     * </p>
     * 
     * @param stateValue
     *        Specify this parameter to receive information only about alarms that are currently in the state that you
     *        specify.
     * @see StateValue
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
     * </p>
     * 
     * @return Specify this parameter to receive information only about alarms that are currently in the state that you
     *         specify.
     * @see StateValue
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
     * </p>
     * 
     * @param stateValue
     *        Specify this parameter to receive information only about alarms that are currently in the state that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public DescribeAlarmsRequest withStateValue(String stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
     * </p>
     * 
     * @param stateValue
     *        Specify this parameter to receive information only about alarms that are currently in the state that you
     *        specify.
     * @see StateValue
     */

    public void setStateValue(StateValue stateValue) {
        withStateValue(stateValue);
    }

    /**
     * <p>
     * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
     * </p>
     * 
     * @param stateValue
     *        Specify this parameter to receive information only about alarms that are currently in the state that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public DescribeAlarmsRequest withStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter to filter the results of the operation to only those alarms that use a certain alarm action.
     * For example, you could specify the ARN of an SNS topic to find all alarms that send notifications to that topic.
     * </p>
     * 
     * @param actionPrefix
     *        Use this parameter to filter the results of the operation to only those alarms that use a certain alarm
     *        action. For example, you could specify the ARN of an SNS topic to find all alarms that send notifications
     *        to that topic.
     */

    public void setActionPrefix(String actionPrefix) {
        this.actionPrefix = actionPrefix;
    }

    /**
     * <p>
     * Use this parameter to filter the results of the operation to only those alarms that use a certain alarm action.
     * For example, you could specify the ARN of an SNS topic to find all alarms that send notifications to that topic.
     * </p>
     * 
     * @return Use this parameter to filter the results of the operation to only those alarms that use a certain alarm
     *         action. For example, you could specify the ARN of an SNS topic to find all alarms that send notifications
     *         to that topic.
     */

    public String getActionPrefix() {
        return this.actionPrefix;
    }

    /**
     * <p>
     * Use this parameter to filter the results of the operation to only those alarms that use a certain alarm action.
     * For example, you could specify the ARN of an SNS topic to find all alarms that send notifications to that topic.
     * </p>
     * 
     * @param actionPrefix
     *        Use this parameter to filter the results of the operation to only those alarms that use a certain alarm
     *        action. For example, you could specify the ARN of an SNS topic to find all alarms that send notifications
     *        to that topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withActionPrefix(String actionPrefix) {
        setActionPrefix(actionPrefix);
        return this;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm descriptions to retrieve.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @return The maximum number of alarm descriptions to retrieve.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm descriptions to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned by a previous call to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAlarmNames() != null)
            sb.append("AlarmNames: ").append(getAlarmNames()).append(",");
        if (getAlarmNamePrefix() != null)
            sb.append("AlarmNamePrefix: ").append(getAlarmNamePrefix()).append(",");
        if (getAlarmTypes() != null)
            sb.append("AlarmTypes: ").append(getAlarmTypes()).append(",");
        if (getChildrenOfAlarmName() != null)
            sb.append("ChildrenOfAlarmName: ").append(getChildrenOfAlarmName()).append(",");
        if (getParentsOfAlarmName() != null)
            sb.append("ParentsOfAlarmName: ").append(getParentsOfAlarmName()).append(",");
        if (getStateValue() != null)
            sb.append("StateValue: ").append(getStateValue()).append(",");
        if (getActionPrefix() != null)
            sb.append("ActionPrefix: ").append(getActionPrefix()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmsRequest == false)
            return false;
        DescribeAlarmsRequest other = (DescribeAlarmsRequest) obj;
        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        if (other.getAlarmNamePrefix() == null ^ this.getAlarmNamePrefix() == null)
            return false;
        if (other.getAlarmNamePrefix() != null && other.getAlarmNamePrefix().equals(this.getAlarmNamePrefix()) == false)
            return false;
        if (other.getAlarmTypes() == null ^ this.getAlarmTypes() == null)
            return false;
        if (other.getAlarmTypes() != null && other.getAlarmTypes().equals(this.getAlarmTypes()) == false)
            return false;
        if (other.getChildrenOfAlarmName() == null ^ this.getChildrenOfAlarmName() == null)
            return false;
        if (other.getChildrenOfAlarmName() != null && other.getChildrenOfAlarmName().equals(this.getChildrenOfAlarmName()) == false)
            return false;
        if (other.getParentsOfAlarmName() == null ^ this.getParentsOfAlarmName() == null)
            return false;
        if (other.getParentsOfAlarmName() != null && other.getParentsOfAlarmName().equals(this.getParentsOfAlarmName()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        if (other.getActionPrefix() == null ^ this.getActionPrefix() == null)
            return false;
        if (other.getActionPrefix() != null && other.getActionPrefix().equals(this.getActionPrefix()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        hashCode = prime * hashCode + ((getAlarmNamePrefix() == null) ? 0 : getAlarmNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getAlarmTypes() == null) ? 0 : getAlarmTypes().hashCode());
        hashCode = prime * hashCode + ((getChildrenOfAlarmName() == null) ? 0 : getChildrenOfAlarmName().hashCode());
        hashCode = prime * hashCode + ((getParentsOfAlarmName() == null) ? 0 : getParentsOfAlarmName().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        hashCode = prime * hashCode + ((getActionPrefix() == null) ? 0 : getActionPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmsRequest clone() {
        return (DescribeAlarmsRequest) super.clone();
    }

}
