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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An app or a set of one or more tests to upload or that have been uploaded.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Upload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Upload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The upload's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The upload's file name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When the upload was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The upload's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The upload's status.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * INITIALIZED
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The presigned Amazon S3 URL that was used to store a file using a PUT request.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and
     * is displayed in the AWS Device Farm console after the associated app is uploaded.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The upload's content type (for example, <code>application/octet-stream</code>).
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * A message about the upload's result.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The upload's category. Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: An upload managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: An upload managed by the AWS Device Farm customer.
     * </p>
     * </li>
     * </ul>
     */
    private String category;

    /**
     * <p>
     * The upload's ARN.
     * </p>
     * 
     * @param arn
     *        The upload's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The upload's ARN.
     * </p>
     * 
     * @return The upload's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The upload's ARN.
     * </p>
     * 
     * @param arn
     *        The upload's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The upload's file name.
     * </p>
     * 
     * @param name
     *        The upload's file name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The upload's file name.
     * </p>
     * 
     * @return The upload's file name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The upload's file name.
     * </p>
     * 
     * @param name
     *        The upload's file name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the upload was created.
     * </p>
     * 
     * @param created
     *        When the upload was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * When the upload was created.
     * </p>
     * 
     * @return When the upload was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * When the upload was created.
     * </p>
     * 
     * @param created
     *        When the upload was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The upload's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The upload's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEB_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXTERNAL_DATA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_SPEC
     *        </p>
     *        </li>
     * @see UploadType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The upload's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC
     * </p>
     * </li>
     * </ul>
     * 
     * @return The upload's type.</p>
     *         <p>
     *         Must be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ANDROID_APP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IOS_APP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         WEB_APP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EXTERNAL_DATA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_JUNIT_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_TESTNG_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_PYTHON_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_NODE_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_RUBY_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_PYTHON_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_NODE_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_RUBY_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CALABASH_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTRUMENTATION_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UIAUTOMATION_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UIAUTOMATOR_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_UI_TEST_PACKAGE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_JUNIT_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_TESTNG_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_PYTHON_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_NODE_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_RUBY_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_PYTHON_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_NODE_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_RUBY_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTRUMENTATION_TEST_SPEC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_UI_TEST_SPEC
     *         </p>
     *         </li>
     * @see UploadType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The upload's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The upload's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEB_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXTERNAL_DATA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_SPEC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadType
     */

    public Upload withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The upload's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The upload's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEB_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXTERNAL_DATA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_SPEC
     *        </p>
     *        </li>
     * @see UploadType
     */

    public void setType(UploadType type) {
        withType(type);
    }

    /**
     * <p>
     * The upload's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The upload's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEB_APP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXTERNAL_DATA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_PACKAGE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_SPEC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_SPEC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadType
     */

    public Upload withType(UploadType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The upload's status.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * INITIALIZED
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The upload's status.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INITIALIZED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCEEDED
     *        </p>
     *        </li>
     * @see UploadStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The upload's status.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * INITIALIZED
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The upload's status.</p>
     *         <p>
     *         Must be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INITIALIZED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PROCESSING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SUCCEEDED
     *         </p>
     *         </li>
     * @see UploadStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The upload's status.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * INITIALIZED
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The upload's status.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INITIALIZED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCEEDED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadStatus
     */

    public Upload withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The upload's status.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * INITIALIZED
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The upload's status.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INITIALIZED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCEEDED
     *        </p>
     *        </li>
     * @see UploadStatus
     */

    public void setStatus(UploadStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The upload's status.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * INITIALIZED
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The upload's status.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INITIALIZED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCEEDED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadStatus
     */

    public Upload withStatus(UploadStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The presigned Amazon S3 URL that was used to store a file using a PUT request.
     * </p>
     * 
     * @param url
     *        The presigned Amazon S3 URL that was used to store a file using a PUT request.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The presigned Amazon S3 URL that was used to store a file using a PUT request.
     * </p>
     * 
     * @return The presigned Amazon S3 URL that was used to store a file using a PUT request.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The presigned Amazon S3 URL that was used to store a file using a PUT request.
     * </p>
     * 
     * @param url
     *        The presigned Amazon S3 URL that was used to store a file using a PUT request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and
     * is displayed in the AWS Device Farm console after the associated app is uploaded.
     * </p>
     * 
     * @param metadata
     *        The upload's metadata. For example, for Android, this contains information that is parsed from the
     *        manifest and is displayed in the AWS Device Farm console after the associated app is uploaded.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and
     * is displayed in the AWS Device Farm console after the associated app is uploaded.
     * </p>
     * 
     * @return The upload's metadata. For example, for Android, this contains information that is parsed from the
     *         manifest and is displayed in the AWS Device Farm console after the associated app is uploaded.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and
     * is displayed in the AWS Device Farm console after the associated app is uploaded.
     * </p>
     * 
     * @param metadata
     *        The upload's metadata. For example, for Android, this contains information that is parsed from the
     *        manifest and is displayed in the AWS Device Farm console after the associated app is uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The upload's content type (for example, <code>application/octet-stream</code>).
     * </p>
     * 
     * @param contentType
     *        The upload's content type (for example, <code>application/octet-stream</code>).
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The upload's content type (for example, <code>application/octet-stream</code>).
     * </p>
     * 
     * @return The upload's content type (for example, <code>application/octet-stream</code>).
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The upload's content type (for example, <code>application/octet-stream</code>).
     * </p>
     * 
     * @param contentType
     *        The upload's content type (for example, <code>application/octet-stream</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * A message about the upload's result.
     * </p>
     * 
     * @param message
     *        A message about the upload's result.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the upload's result.
     * </p>
     * 
     * @return A message about the upload's result.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the upload's result.
     * </p>
     * 
     * @param message
     *        A message about the upload's result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The upload's category. Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: An upload managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: An upload managed by the AWS Device Farm customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The upload's category. Allowed values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: An upload managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: An upload managed by the AWS Device Farm customer.
     *        </p>
     *        </li>
     * @see UploadCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The upload's category. Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: An upload managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: An upload managed by the AWS Device Farm customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The upload's category. Allowed values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CURATED: An upload managed by AWS Device Farm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRIVATE: An upload managed by the AWS Device Farm customer.
     *         </p>
     *         </li>
     * @see UploadCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The upload's category. Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: An upload managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: An upload managed by the AWS Device Farm customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The upload's category. Allowed values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: An upload managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: An upload managed by the AWS Device Farm customer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadCategory
     */

    public Upload withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The upload's category. Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: An upload managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: An upload managed by the AWS Device Farm customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The upload's category. Allowed values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: An upload managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: An upload managed by the AWS Device Farm customer.
     *        </p>
     *        </li>
     * @see UploadCategory
     */

    public void setCategory(UploadCategory category) {
        withCategory(category);
    }

    /**
     * <p>
     * The upload's category. Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: An upload managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: An upload managed by the AWS Device Farm customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The upload's category. Allowed values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: An upload managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: An upload managed by the AWS Device Farm customer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadCategory
     */

    public Upload withCategory(UploadCategory category) {
        this.category = category.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Upload == false)
            return false;
        Upload other = (Upload) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        return hashCode;
    }

    @Override
    public Upload clone() {
        try {
            return (Upload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.UploadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
