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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSmsTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The unique identifier for the version of the message template to update, retrieve information about, or delete.
     * To retrieve identifiers and other information for all the versions of a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     * <p>
     * If specified, this value must match the identifier for an existing template version. If specified for an update
     * operation, this value must match the identifier for the latest existing version of the template. This restriction
     * helps ensure that race conditions don't occur.
     * </p>
     * <p>
     * If you don't specify a value for this parameter, Amazon Pinpoint does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a get operation, retrieves information about the active version of the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the
     * create-new-version parameter isn't used or is set to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a delete operation, deletes the template, including all versions of the template.
     * </p>
     * </li>
     * </ul>
     */
    private String version;

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @param templateName
     *        The name of the message template. A template name must start with an alphanumeric character and can
     *        contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *        hyphens (-). Template names are case sensitive.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @return The name of the message template. A template name must start with an alphanumeric character and can
     *         contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *         hyphens (-). Template names are case sensitive.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @param templateName
     *        The name of the message template. A template name must start with an alphanumeric character and can
     *        contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *        hyphens (-). Template names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSmsTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to update, retrieve information about, or delete.
     * To retrieve identifiers and other information for all the versions of a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     * <p>
     * If specified, this value must match the identifier for an existing template version. If specified for an update
     * operation, this value must match the identifier for the latest existing version of the template. This restriction
     * helps ensure that race conditions don't occur.
     * </p>
     * <p>
     * If you don't specify a value for this parameter, Amazon Pinpoint does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a get operation, retrieves information about the active version of the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the
     * create-new-version parameter isn't used or is set to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a delete operation, deletes the template, including all versions of the template.
     * </p>
     * </li>
     * </ul>
     * 
     * @param version
     *        The unique identifier for the version of the message template to update, retrieve information about, or
     *        delete. To retrieve identifiers and other information for all the versions of a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If specified, this value must match the identifier for an existing template version. If specified for an
     *        update operation, this value must match the identifier for the latest existing version of the template.
     *        This restriction helps ensure that race conditions don't occur.
     *        </p>
     *        <p>
     *        If you don't specify a value for this parameter, Amazon Pinpoint does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a get operation, retrieves information about the active version of the template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an update operation, saves the updates to (overwrites) the latest existing version of the template, if
     *        the create-new-version parameter isn't used or is set to false.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a delete operation, deletes the template, including all versions of the template.
     *        </p>
     *        </li>
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to update, retrieve information about, or delete.
     * To retrieve identifiers and other information for all the versions of a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     * <p>
     * If specified, this value must match the identifier for an existing template version. If specified for an update
     * operation, this value must match the identifier for the latest existing version of the template. This restriction
     * helps ensure that race conditions don't occur.
     * </p>
     * <p>
     * If you don't specify a value for this parameter, Amazon Pinpoint does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a get operation, retrieves information about the active version of the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the
     * create-new-version parameter isn't used or is set to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a delete operation, deletes the template, including all versions of the template.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier for the version of the message template to update, retrieve information about, or
     *         delete. To retrieve identifiers and other information for all the versions of a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *         <p>
     *         If specified, this value must match the identifier for an existing template version. If specified for an
     *         update operation, this value must match the identifier for the latest existing version of the template.
     *         This restriction helps ensure that race conditions don't occur.
     *         </p>
     *         <p>
     *         If you don't specify a value for this parameter, Amazon Pinpoint does the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a get operation, retrieves information about the active version of the template.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an update operation, saves the updates to (overwrites) the latest existing version of the template,
     *         if the create-new-version parameter isn't used or is set to false.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For a delete operation, deletes the template, including all versions of the template.
     *         </p>
     *         </li>
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to update, retrieve information about, or delete.
     * To retrieve identifiers and other information for all the versions of a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     * <p>
     * If specified, this value must match the identifier for an existing template version. If specified for an update
     * operation, this value must match the identifier for the latest existing version of the template. This restriction
     * helps ensure that race conditions don't occur.
     * </p>
     * <p>
     * If you don't specify a value for this parameter, Amazon Pinpoint does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a get operation, retrieves information about the active version of the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the
     * create-new-version parameter isn't used or is set to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a delete operation, deletes the template, including all versions of the template.
     * </p>
     * </li>
     * </ul>
     * 
     * @param version
     *        The unique identifier for the version of the message template to update, retrieve information about, or
     *        delete. To retrieve identifiers and other information for all the versions of a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If specified, this value must match the identifier for an existing template version. If specified for an
     *        update operation, this value must match the identifier for the latest existing version of the template.
     *        This restriction helps ensure that race conditions don't occur.
     *        </p>
     *        <p>
     *        If you don't specify a value for this parameter, Amazon Pinpoint does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a get operation, retrieves information about the active version of the template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an update operation, saves the updates to (overwrites) the latest existing version of the template, if
     *        the create-new-version parameter isn't used or is set to false.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a delete operation, deletes the template, including all versions of the template.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSmsTemplateRequest withVersion(String version) {
        setVersion(version);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSmsTemplateRequest == false)
            return false;
        GetSmsTemplateRequest other = (GetSmsTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetSmsTemplateRequest clone() {
        return (GetSmsTemplateRequest) super.clone();
    }

}
