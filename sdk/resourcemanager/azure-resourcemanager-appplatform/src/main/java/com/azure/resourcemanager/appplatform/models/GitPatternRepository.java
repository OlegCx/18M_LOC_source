// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Git repository property payload. */
@Fluent
public final class GitPatternRepository {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GitPatternRepository.class);

    /*
     * Name of the repository
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Collection of pattern of the repository
     */
    @JsonProperty(value = "pattern")
    private List<String> pattern;

    /*
     * URI of the repository
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * Label of the repository
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * Searching path of the repository
     */
    @JsonProperty(value = "searchPaths")
    private List<String> searchPaths;

    /*
     * Username of git repository basic auth.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Password of git repository basic auth.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Public sshKey of git repository.
     */
    @JsonProperty(value = "hostKey")
    private String hostKey;

    /*
     * SshKey algorithm of git repository.
     */
    @JsonProperty(value = "hostKeyAlgorithm")
    private String hostKeyAlgorithm;

    /*
     * Private sshKey algorithm of git repository.
     */
    @JsonProperty(value = "privateKey")
    private String privateKey;

    /*
     * Strict host key checking or not.
     */
    @JsonProperty(value = "strictHostKeyChecking")
    private Boolean strictHostKeyChecking;

    /**
     * Get the name property: Name of the repository.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the repository.
     *
     * @param name the name value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the pattern property: Collection of pattern of the repository.
     *
     * @return the pattern value.
     */
    public List<String> pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: Collection of pattern of the repository.
     *
     * @param pattern the pattern value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withPattern(List<String> pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the uri property: URI of the repository.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: URI of the repository.
     *
     * @param uri the uri value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the label property: Label of the repository.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: Label of the repository.
     *
     * @param label the label value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the searchPaths property: Searching path of the repository.
     *
     * @return the searchPaths value.
     */
    public List<String> searchPaths() {
        return this.searchPaths;
    }

    /**
     * Set the searchPaths property: Searching path of the repository.
     *
     * @param searchPaths the searchPaths value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withSearchPaths(List<String> searchPaths) {
        this.searchPaths = searchPaths;
        return this;
    }

    /**
     * Get the username property: Username of git repository basic auth.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username of git repository basic auth.
     *
     * @param username the username value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password of git repository basic auth.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password of git repository basic auth.
     *
     * @param password the password value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the hostKey property: Public sshKey of git repository.
     *
     * @return the hostKey value.
     */
    public String hostKey() {
        return this.hostKey;
    }

    /**
     * Set the hostKey property: Public sshKey of git repository.
     *
     * @param hostKey the hostKey value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withHostKey(String hostKey) {
        this.hostKey = hostKey;
        return this;
    }

    /**
     * Get the hostKeyAlgorithm property: SshKey algorithm of git repository.
     *
     * @return the hostKeyAlgorithm value.
     */
    public String hostKeyAlgorithm() {
        return this.hostKeyAlgorithm;
    }

    /**
     * Set the hostKeyAlgorithm property: SshKey algorithm of git repository.
     *
     * @param hostKeyAlgorithm the hostKeyAlgorithm value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withHostKeyAlgorithm(String hostKeyAlgorithm) {
        this.hostKeyAlgorithm = hostKeyAlgorithm;
        return this;
    }

    /**
     * Get the privateKey property: Private sshKey algorithm of git repository.
     *
     * @return the privateKey value.
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: Private sshKey algorithm of git repository.
     *
     * @param privateKey the privateKey value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the strictHostKeyChecking property: Strict host key checking or not.
     *
     * @return the strictHostKeyChecking value.
     */
    public Boolean strictHostKeyChecking() {
        return this.strictHostKeyChecking;
    }

    /**
     * Set the strictHostKeyChecking property: Strict host key checking or not.
     *
     * @param strictHostKeyChecking the strictHostKeyChecking value to set.
     * @return the GitPatternRepository object itself.
     */
    public GitPatternRepository withStrictHostKeyChecking(Boolean strictHostKeyChecking) {
        this.strictHostKeyChecking = strictHostKeyChecking;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model GitPatternRepository"));
        }
        if (uri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property uri in model GitPatternRepository"));
        }
    }
}