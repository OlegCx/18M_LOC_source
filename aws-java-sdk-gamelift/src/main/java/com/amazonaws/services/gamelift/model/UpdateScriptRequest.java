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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateScript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScriptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the Realtime script to update. You can use either the script ID or ARN value.
     * </p>
     */
    private String scriptId;
    /**
     * <p>
     * A descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     */
    private S3Location storageLocation;
    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     */
    private java.nio.ByteBuffer zipFile;

    /**
     * <p>
     * A unique identifier for the Realtime script to update. You can use either the script ID or ARN value.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for the Realtime script to update. You can use either the script ID or ARN value.
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script to update. You can use either the script ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the Realtime script to update. You can use either the script ID or ARN value.
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script to update. You can use either the script ID or ARN value.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for the Realtime script to update. You can use either the script ID or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScriptRequest withScriptId(String scriptId) {
        setScriptId(scriptId);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a script. Script names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with a script. Script names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a script. Script names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScriptRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @param version
     *        Version information that is associated with a build or script. Version strings do not need to be unique.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @return Version information that is associated with a build or script. Version strings do not need to be unique.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @param version
     *        Version information that is associated with a build or script. Version strings do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScriptRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     * 
     * @param storageLocation
     *        The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The
     *        storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN
     *        that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same
     *        Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of
     *        the zip file; if you have S3 object versioning turned on, you can use the <code>ObjectVersion</code>
     *        parameter to specify an earlier version.
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     * 
     * @return The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The
     *         storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN
     *         that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same
     *         Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of
     *         the zip file; if you have S3 object versioning turned on, you can use the <code>ObjectVersion</code>
     *         parameter to specify an earlier version.
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     * 
     * @param storageLocation
     *        The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The
     *        storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN
     *        that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same
     *        Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of
     *        the zip file; if you have S3 object versioning turned on, you can use the <code>ObjectVersion</code>
     *        parameter to specify an earlier version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScriptRequest withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFile
     *        A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one
     *        or multiple files. Maximum size of a zip file is 5 MB.</p>
     *        <p>
     *        When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be
     *        prepended with the string "fileb://" to indicate that the file data is a binary object. For example:
     *        <code>--zip-file fileb://myRealtimeScript.zip</code>.
     */

    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one
     *         or multiple files. Maximum size of a zip file is 5 MB.</p>
     *         <p>
     *         When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be
     *         prepended with the string "fileb://" to indicate that the file data is a binary object. For example:
     *         <code>--zip-file fileb://myRealtimeScript.zip</code>.
     */

    public java.nio.ByteBuffer getZipFile() {
        return this.zipFile;
    }

    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFile
     *        A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one
     *        or multiple files. Maximum size of a zip file is 5 MB.</p>
     *        <p>
     *        When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be
     *        prepended with the string "fileb://" to indicate that the file data is a binary object. For example:
     *        <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScriptRequest withZipFile(java.nio.ByteBuffer zipFile) {
        setZipFile(zipFile);
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
        if (getScriptId() != null)
            sb.append("ScriptId: ").append(getScriptId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation()).append(",");
        if (getZipFile() != null)
            sb.append("ZipFile: ").append(getZipFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScriptRequest == false)
            return false;
        UpdateScriptRequest other = (UpdateScriptRequest) obj;
        if (other.getScriptId() == null ^ this.getScriptId() == null)
            return false;
        if (other.getScriptId() != null && other.getScriptId().equals(this.getScriptId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScriptRequest clone() {
        return (UpdateScriptRequest) super.clone();
    }

}
