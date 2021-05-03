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
package com.amazonaws.services.simpleemailv2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.simpleemailv2.model.*;

/**
 * Interface for accessing Amazon SES V2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simpleemailv2.AbstractAmazonSimpleEmailServiceV2} instead.
 * </p>
 * <p>
 * <fullname>Amazon SES API v2</fullname>
 * <p>
 * Welcome to the Amazon SES API v2 Reference. This guide provides information about the Amazon SES API v2, including
 * supported operations, data types, parameters, and schemas.
 * </p>
 * <p>
 * <a href="https://aws.amazon.com/pinpoint">Amazon SES</a> is an AWS service that you can use to send email messages to
 * your customers.
 * </p>
 * <p>
 * If you're new to Amazon SES API v2, you might find it helpful to also review the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/">Amazon Simple Email Service Developer Guide</a>. The
 * <i>Amazon SES Developer Guide</i> provides information and code samples that demonstrate how to use Amazon SES API v2
 * features programmatically.
 * </p>
 * <p>
 * The Amazon SES API v2 is available in several AWS Regions and it provides an endpoint for each of these Regions. For
 * a list of all the Regions and endpoints where the API is currently available, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region">AWS Service Endpoints</a> in the <i>Amazon
 * Web Services General Reference</i>. To learn more about AWS Regions, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>Amazon Web
 * Services General Reference</i>.
 * </p>
 * <p>
 * In each Region, AWS maintains multiple Availability Zones. These Availability Zones are physically isolated from each
 * other, but are united by private, low-latency, high-throughput, and highly redundant network connections. These
 * Availability Zones enable us to provide very high levels of availability and redundancy, while also minimizing
 * latency. To learn more about the number of Availability Zones that are available in each Region, see <a
 * href="http://aws.amazon.com/about-aws/global-infrastructure/">AWS Global Infrastructure</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSimpleEmailServiceV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "email";

    /**
     * <p>
     * Create a configuration set. <i>Configuration sets</i> are groups of rules that you can apply to the emails that
     * you send. You apply a configuration set to an email by specifying the name of the configuration set when you call
     * the Amazon SES API v2. When you apply a configuration set to an email, all of the rules in that configuration set
     * are applied to the email.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        A request to create a configuration set.
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest);

    /**
     * <p>
     * Create an event destination. <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and
     * complaints. <i>Event destinations</i> are places that you can send information about these events to. For
     * example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints,
     * or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * <p>
     * A single configuration set can include more than one event destination.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        A request to add an event destination to a configuration set.
     * @return Result of the CreateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.CreateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Creates a contact, which is an end-user who is receiving the email, and adds them to a contact list.
     * </p>
     * 
     * @param createContactRequest
     * @return Result of the CreateContact operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @sample AmazonSimpleEmailServiceV2.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateContact" target="_top">AWS API
     *      Documentation</a>
     */
    CreateContactResult createContact(CreateContactRequest createContactRequest);

    /**
     * <p>
     * Creates a contact list.
     * </p>
     * 
     * @param createContactListRequest
     * @return Result of the CreateContactList operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @sample AmazonSimpleEmailServiceV2.CreateContactList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateContactList" target="_top">AWS API
     *      Documentation</a>
     */
    CreateContactListResult createContactList(CreateContactListRequest createContactListRequest);

    /**
     * <p>
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createCustomVerificationEmailTemplateRequest
     *        Represents a request to create a custom verification email template.
     * @return Result of the CreateCustomVerificationEmailTemplate operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @sample AmazonSimpleEmailServiceV2.CreateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomVerificationEmailTemplateResult createCustomVerificationEmailTemplate(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
     * associated with your AWS account. You can associate a pool with a configuration set. When you send an email that
     * uses that configuration set, the message is sent from one of the addresses in the associated pool.
     * </p>
     * 
     * @param createDedicatedIpPoolRequest
     *        A request to create a new dedicated IP pool.
     * @return Result of the CreateDedicatedIpPool operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest createDedicatedIpPoolRequest);

    /**
     * <p>
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
     * messages will be handled by various email providers around the world. When you perform a predictive inbox
     * placement test, you provide a sample message that contains the content that you plan to send to your customers.
     * Amazon SES then sends that message to special email addresses spread across several major email providers. After
     * about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code> operation to
     * view the results of the test.
     * </p>
     * 
     * @param createDeliverabilityTestReportRequest
     *        A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you
     *        predict how your messages will be handled by various email providers around the world. When you perform a
     *        predictive inbox placement test, you provide a sample message that contains the content that you plan to
     *        send to your customers. We send that message to special email addresses spread across several major email
     *        providers around the world. The test takes about 24 hours to complete. When the test is complete, you can
     *        use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
     * @return Result of the CreateDeliverabilityTestReport operation returned by the service.
     * @throws AccountSuspendedException
     *         The message can't be sent because the account's ability to send email has been permanently restricted.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeliverabilityTestReportResult createDeliverabilityTestReport(CreateDeliverabilityTestReportRequest createDeliverabilityTestReportRequest);

    /**
     * <p>
     * Starts the process of verifying an email identity. An <i>identity</i> is an email address or domain that you use
     * when you send email. Before you can use an identity to send email, you first have to verify it. By verifying an
     * identity, you demonstrate that you're the owner of the identity, and that you've given Amazon SES API v2
     * permission to send email from the identity.
     * </p>
     * <p>
     * When you verify an email address, Amazon SES sends an email to the address. Your email address is verified as
     * soon as you follow the link in the verification email.
     * </p>
     * <p>
     * When you verify a domain without specifying the <code>DkimSigningAttributes</code> object, this operation
     * provides a set of DKIM tokens. You can convert these tokens into CNAME records, which you then add to the DNS
     * configuration for your domain. Your domain is verified when Amazon SES detects these records in the DNS
     * configuration for your domain. This verification method is known as <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * Alternatively, you can perform the verification process by providing your own public-private key pair. This
     * verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your call to the
     * <code>CreateEmailIdentity</code> operation has to include the <code>DkimSigningAttributes</code> object. When you
     * specify this object, you provide a selector (a component of the DNS record name that identifies the public key
     * that you want to use for DKIM authentication) and a private key.
     * </p>
     * <p>
     * When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens.
     * You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon SES
     * detects these records in the DNS configuration for your domain. For some DNS providers, it can take 72 hours or
     * more to complete the domain verification process.
     * </p>
     * <p>
     * Additionally, you can associate an existing configuration set with the email identity that you're verifying.
     * </p>
     * 
     * @param createEmailIdentityRequest
     *        A request to begin the verification process for an email identity (an email address or domain).
     * @return Result of the CreateEmailIdentity operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEmailIdentityResult createEmailIdentity(CreateEmailIdentityRequest createEmailIdentityRequest);

    /**
     * <p>
     * Creates the specified sending authorization policy for the given identity (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createEmailIdentityPolicyRequest
     *        Represents a request to create a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href=
     *        "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Result of the CreateEmailIdentityPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.CreateEmailIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailIdentityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEmailIdentityPolicyResult createEmailIdentityPolicy(CreateEmailIdentityPolicyRequest createEmailIdentityPolicyRequest);

    /**
     * <p>
     * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createEmailTemplateRequest
     *        Represents a request to create an email template. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateEmailTemplate operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @sample AmazonSimpleEmailServiceV2.CreateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEmailTemplateResult createEmailTemplate(CreateEmailTemplateRequest createEmailTemplateRequest);

    /**
     * <p>
     * Creates an import job for a data destination.
     * </p>
     * 
     * @param createImportJobRequest
     *        Represents a request to create an import job from a data source for a data destination.
     * @return Result of the CreateImportJob operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateImportJobResult createImportJob(CreateImportJobRequest createImportJobRequest);

    /**
     * <p>
     * Delete an existing configuration set.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        A request to delete a configuration set.
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

    /**
     * <p>
     * Delete an event destination.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        A request to delete an event destination from a configuration set.
     * @return Result of the DeleteConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.DeleteConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Removes a contact from a contact list.
     * </p>
     * 
     * @param deleteContactRequest
     * @return Result of the DeleteContact operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteContact" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteContactResult deleteContact(DeleteContactRequest deleteContactRequest);

    /**
     * <p>
     * Deletes a contact list and all of the contacts on that list.
     * </p>
     * 
     * @param deleteContactListRequest
     * @return Result of the DeleteContactList operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.DeleteContactList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteContactList" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteContactListResult deleteContactList(DeleteContactListRequest deleteContactListRequest);

    /**
     * <p>
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/es/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteCustomVerificationEmailTemplateRequest
     *        Represents a request to delete an existing custom verification email template.
     * @return Result of the DeleteCustomVerificationEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.DeleteCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomVerificationEmailTemplateResult deleteCustomVerificationEmailTemplate(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Delete a dedicated IP pool.
     * </p>
     * 
     * @param deleteDedicatedIpPoolRequest
     *        A request to delete a dedicated IP pool.
     * @return Result of the DeleteDedicatedIpPool operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDedicatedIpPoolResult deleteDedicatedIpPool(DeleteDedicatedIpPoolRequest deleteDedicatedIpPoolRequest);

    /**
     * <p>
     * Deletes an email identity. An identity can be either an email address or a domain name.
     * </p>
     * 
     * @param deleteEmailIdentityRequest
     *        A request to delete an existing email identity. When you delete an identity, you lose the ability to send
     *        email from that identity. You can restore your ability to send email by completing the verification
     *        process for the identity again.
     * @return Result of the DeleteEmailIdentity operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEmailIdentityResult deleteEmailIdentity(DeleteEmailIdentityRequest deleteEmailIdentityRequest);

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This
     * API returns successfully even if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteEmailIdentityPolicyRequest
     *        Represents a request to delete a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href=
     *        "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Result of the DeleteEmailIdentityPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.DeleteEmailIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailIdentityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEmailIdentityPolicyResult deleteEmailIdentityPolicy(DeleteEmailIdentityPolicyRequest deleteEmailIdentityPolicyRequest);

    /**
     * <p>
     * Deletes an email template.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteEmailTemplateRequest
     *        Represents a request to delete an email template. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.DeleteEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEmailTemplateResult deleteEmailTemplate(DeleteEmailTemplateRequest deleteEmailTemplateRequest);

    /**
     * <p>
     * Removes an email address from the suppression list for your account.
     * </p>
     * 
     * @param deleteSuppressedDestinationRequest
     *        A request to remove an email address from the suppression list for your account.
     * @return Result of the DeleteSuppressedDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.DeleteSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteSuppressedDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSuppressedDestinationResult deleteSuppressedDestination(DeleteSuppressedDestinationRequest deleteSuppressedDestinationRequest);

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon SES account in the current AWS
     * Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon SES account.
     * @return Result of the GetAccount operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountResult getAccount(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * </p>
     * 
     * @param getBlacklistReportsRequest
     *        A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * @return Result of the GetBlacklistReports operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetBlacklistReports" target="_top">AWS API
     *      Documentation</a>
     */
    GetBlacklistReportsResult getBlacklistReports(GetBlacklistReportsRequest getBlacklistReportsRequest);

    /**
     * <p>
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
     * whether or not it's enabled for sending email, and more.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param getConfigurationSetRequest
     *        A request to obtain information about a configuration set.
     * @return Result of the GetConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetConfigurationSetResult getConfigurationSet(GetConfigurationSetRequest getConfigurationSetRequest);

    /**
     * <p>
     * Retrieve a list of event destinations that are associated with a configuration set.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param getConfigurationSetEventDestinationsRequest
     *        A request to obtain information about the event destinations for a configuration set.
     * @return Result of the GetConfigurationSetEventDestinations operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetConfigurationSetEventDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfigurationSetEventDestinationsResult getConfigurationSetEventDestinations(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest);

    /**
     * <p>
     * Returns a contact from a contact list.
     * </p>
     * 
     * @param getContactRequest
     * @return Result of the GetContact operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetContact" target="_top">AWS API
     *      Documentation</a>
     */
    GetContactResult getContact(GetContactRequest getContactRequest);

    /**
     * <p>
     * Returns contact list metadata. It does not return any information about the contacts present in the list.
     * </p>
     * 
     * @param getContactListRequest
     * @return Result of the GetContactList operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetContactList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetContactList" target="_top">AWS API
     *      Documentation</a>
     */
    GetContactListResult getContactList(GetContactListRequest getContactListRequest);

    /**
     * <p>
     * Returns the custom email verification template for the template name you specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getCustomVerificationEmailTemplateRequest
     *        Represents a request to retrieve an existing custom verification email template.
     * @return Result of the GetCustomVerificationEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetCustomVerificationEmailTemplateResult getCustomVerificationEmailTemplate(
            GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated
     * with, as well information about the automatic warm-up process for the address.
     * </p>
     * 
     * @param getDedicatedIpRequest
     *        A request to obtain more information about a dedicated IP address.
     * @return Result of the GetDedicatedIp operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIp" target="_top">AWS API
     *      Documentation</a>
     */
    GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest getDedicatedIpRequest);

    /**
     * <p>
     * List the dedicated IP addresses that are associated with your AWS account.
     * </p>
     * 
     * @param getDedicatedIpsRequest
     *        A request to obtain more information about dedicated IP pools.
     * @return Result of the GetDedicatedIps operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIps" target="_top">AWS API
     *      Documentation</a>
     */
    GetDedicatedIpsResult getDedicatedIps(GetDedicatedIpsRequest getDedicatedIpsRequest);

    /**
     * <p>
     * Retrieve information about the status of the Deliverability dashboard for your account. When the Deliverability
     * dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you
     * use to send email. You also gain the ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param getDeliverabilityDashboardOptionsRequest
     *        Retrieve information about the status of the Deliverability dashboard for your AWS account. When the
     *        Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for
     *        your domains. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
     * @return Result of the GetDeliverabilityDashboardOptions operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityDashboardOptions"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeliverabilityDashboardOptionsResult getDeliverabilityDashboardOptions(GetDeliverabilityDashboardOptionsRequest getDeliverabilityDashboardOptionsRequest);

    /**
     * <p>
     * Retrieve the results of a predictive inbox placement test.
     * </p>
     * 
     * @param getDeliverabilityTestReportRequest
     *        A request to retrieve the results of a predictive inbox placement test.
     * @return Result of the GetDeliverabilityTestReport operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeliverabilityTestReportResult getDeliverabilityTestReport(GetDeliverabilityTestReportRequest getDeliverabilityTestReportRequest);

    /**
     * <p>
     * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the
     * campaign sent email by using a domain that the Deliverability dashboard is enabled for.
     * </p>
     * 
     * @param getDomainDeliverabilityCampaignRequest
     *        Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only
     *        if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (
     *        <code>PutDeliverabilityDashboardOption</code> operation).
     * @return Result of the GetDomainDeliverabilityCampaign operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.GetDomainDeliverabilityCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainDeliverabilityCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    GetDomainDeliverabilityCampaignResult getDomainDeliverabilityCampaign(GetDomainDeliverabilityCampaignRequest getDomainDeliverabilityCampaignRequest);

    /**
     * <p>
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     * </p>
     * 
     * @param getDomainStatisticsReportRequest
     *        A request to obtain deliverability metrics for a domain.
     * @return Result of the GetDomainStatisticsReport operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainStatisticsReport"
     *      target="_top">AWS API Documentation</a>
     */
    GetDomainStatisticsReportResult getDomainStatisticsReport(GetDomainStatisticsReportRequest getDomainStatisticsReportRequest);

    /**
     * <p>
     * Provides information about a specific identity, including the identity's verification status, sending
     * authorization policies, its DKIM authentication status, and its custom Mail-From settings.
     * </p>
     * 
     * @param getEmailIdentityRequest
     *        A request to return details about an email identity.
     * @return Result of the GetEmailIdentity operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    GetEmailIdentityResult getEmailIdentity(GetEmailIdentityRequest getEmailIdentityRequest);

    /**
     * <p>
     * Returns the requested sending authorization policies for the given identity (an email address or a domain). The
     * policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a
     * time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getEmailIdentityPoliciesRequest
     *        A request to return the policies of an email identity.
     * @return Result of the GetEmailIdentityPolicies operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetEmailIdentityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailIdentityPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    GetEmailIdentityPoliciesResult getEmailIdentityPolicies(GetEmailIdentityPoliciesRequest getEmailIdentityPoliciesRequest);

    /**
     * <p>
     * Displays the template object (which includes the subject line, HTML part and text part) for the template you
     * specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getEmailTemplateRequest
     *        Represents a request to display the template object (which includes the subject line, HTML part and text
     *        part) for the template you specify.
     * @return Result of the GetEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    GetEmailTemplateResult getEmailTemplate(GetEmailTemplateRequest getEmailTemplateRequest);

    /**
     * <p>
     * Provides information about an import job.
     * </p>
     * 
     * @param getImportJobRequest
     *        Represents a request for information about an import job using the import job ID.
     * @return Result of the GetImportJob operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportJobResult getImportJob(GetImportJobRequest getImportJobRequest);

    /**
     * <p>
     * Retrieves information about a specific email address that's on the suppression list for your account.
     * </p>
     * 
     * @param getSuppressedDestinationRequest
     *        A request to retrieve information about an email address that's on the suppression list for your account.
     * @return Result of the GetSuppressedDestination operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.GetSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    GetSuppressedDestinationResult getSuppressedDestination(GetSuppressedDestinationRequest getSuppressedDestinationRequest);

    /**
     * <p>
     * List all of the configuration sets associated with your account in the current region.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        A request to obtain a list of configuration sets for your Amazon SES account in the current AWS Region.
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest listConfigurationSetsRequest);

    /**
     * <p>
     * Lists all of the contact lists available.
     * </p>
     * 
     * @param listContactListsRequest
     * @return Result of the ListContactLists operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.ListContactLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListContactLists" target="_top">AWS API
     *      Documentation</a>
     */
    ListContactListsResult listContactLists(ListContactListsRequest listContactListsRequest);

    /**
     * <p>
     * Lists the contacts present in a specific contact list.
     * </p>
     * 
     * @param listContactsRequest
     * @return Result of the ListContacts operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    ListContactsResult listContacts(ListContactsRequest listContactsRequest);

    /**
     * <p>
     * Lists the existing custom verification email templates for your account in the current AWS Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listCustomVerificationEmailTemplatesRequest
     *        Represents a request to list the existing custom verification email templates for your account.
     * @return Result of the ListCustomVerificationEmailTemplates operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListCustomVerificationEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListCustomVerificationEmailTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomVerificationEmailTemplatesResult listCustomVerificationEmailTemplates(
            ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest);

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your AWS account in the current Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @return Result of the ListDedicatedIpPools operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDedicatedIpPools" target="_top">AWS API
     *      Documentation</a>
     */
    ListDedicatedIpPoolsResult listDedicatedIpPools(ListDedicatedIpPoolsRequest listDedicatedIpPoolsRequest);

    /**
     * <p>
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For
     * predictive inbox placement tests that are complete, you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results.
     * </p>
     * 
     * @param listDeliverabilityTestReportsRequest
     *        A request to list all of the predictive inbox placement tests that you've performed.
     * @return Result of the ListDeliverabilityTestReports operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDeliverabilityTestReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeliverabilityTestReportsResult listDeliverabilityTestReports(ListDeliverabilityTestReportsRequest listDeliverabilityTestReportsRequest);

    /**
     * <p>
     * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified
     * time range. This data is available for a domain only if you enabled the Deliverability dashboard for the domain.
     * </p>
     * 
     * @param listDomainDeliverabilityCampaignsRequest
     *        Retrieve deliverability data for all the campaigns that used a specific domain to send email during a
     *        specified time range. This data is available for a domain only if you enabled the Deliverability
     *        dashboard.
     * @return Result of the ListDomainDeliverabilityCampaigns operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.ListDomainDeliverabilityCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDomainDeliverabilityCampaigns"
     *      target="_top">AWS API Documentation</a>
     */
    ListDomainDeliverabilityCampaignsResult listDomainDeliverabilityCampaigns(ListDomainDeliverabilityCampaignsRequest listDomainDeliverabilityCampaignsRequest);

    /**
     * <p>
     * Returns a list of all of the email identities that are associated with your AWS account. An identity can be
     * either an email address or a domain. This operation returns identities that are verified as well as those that
     * aren't. This operation returns identities that are associated with Amazon SES and Amazon Pinpoint.
     * </p>
     * 
     * @param listEmailIdentitiesRequest
     *        A request to list all of the email identities associated with your AWS account. This list includes
     *        identities that you've already verified, identities that are unverified, and identities that were verified
     *        in the past, but are no longer verified.
     * @return Result of the ListEmailIdentities operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListEmailIdentities" target="_top">AWS API
     *      Documentation</a>
     */
    ListEmailIdentitiesResult listEmailIdentities(ListEmailIdentitiesRequest listEmailIdentitiesRequest);

    /**
     * <p>
     * Lists the email templates present in your Amazon SES account in the current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listEmailTemplatesRequest
     *        Represents a request to list the email templates present in your Amazon SES account in the current AWS
     *        Region. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the ListEmailTemplates operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListEmailTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    ListEmailTemplatesResult listEmailTemplates(ListEmailTemplatesRequest listEmailTemplatesRequest);

    /**
     * <p>
     * Lists all of the import jobs.
     * </p>
     * 
     * @param listImportJobsRequest
     *        Represents a request to list all of the import jobs for a data destination within the specified maximum
     *        number of import jobs.
     * @return Result of the ListImportJobs operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListImportJobsResult listImportJobs(ListImportJobsRequest listImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of email addresses that are on the suppression list for your account.
     * </p>
     * 
     * @param listSuppressedDestinationsRequest
     *        A request to obtain a list of email destinations that are on the suppression list for your account.
     * @return Result of the ListSuppressedDestinations operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws InvalidNextTokenException
     *         The specified request includes an invalid or expired token.
     * @sample AmazonSimpleEmailServiceV2.ListSuppressedDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListSuppressedDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    ListSuppressedDestinationsResult listSuppressedDestinations(ListSuppressedDestinationsRequest listSuppressedDestinationsRequest);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     * </p>
     * 
     * @param putAccountDedicatedIpWarmupAttributesRequest
     *        A request to enable or disable the automatic IP address warm-up feature.
     * @return Result of the PutAccountDedicatedIpWarmupAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutAccountDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutAccountDedicatedIpWarmupAttributesResult putAccountDedicatedIpWarmupAttributes(
            PutAccountDedicatedIpWarmupAttributesRequest putAccountDedicatedIpWarmupAttributesRequest);

    /**
     * <p>
     * Update your Amazon SES account details.
     * </p>
     * 
     * @param putAccountDetailsRequest
     *        A request to submit new account details.
     * @return Result of the PutAccountDetails operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConflictException
     *         If there is already an ongoing account details update under review.
     * @sample AmazonSimpleEmailServiceV2.PutAccountDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountDetails" target="_top">AWS API
     *      Documentation</a>
     */
    PutAccountDetailsResult putAccountDetails(PutAccountDetailsRequest putAccountDetailsRequest);

    /**
     * <p>
     * Enable or disable the ability of your account to send email.
     * </p>
     * 
     * @param putAccountSendingAttributesRequest
     *        A request to change the ability of your account to send email.
     * @return Result of the PutAccountSendingAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSendingAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutAccountSendingAttributesResult putAccountSendingAttributes(PutAccountSendingAttributesRequest putAccountSendingAttributesRequest);

    /**
     * <p>
     * Change the settings for the account-level suppression list.
     * </p>
     * 
     * @param putAccountSuppressionAttributesRequest
     *        A request to change your account's suppression preferences.
     * @return Result of the PutAccountSuppressionAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutAccountSuppressionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSuppressionAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutAccountSuppressionAttributesResult putAccountSuppressionAttributes(PutAccountSuppressionAttributesRequest putAccountSuppressionAttributesRequest);

    /**
     * <p>
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of
     * dedicated IP addresses for sending specific types of email.
     * </p>
     * 
     * @param putConfigurationSetDeliveryOptionsRequest
     *        A request to associate a configuration set with a dedicated IP pool.
     * @return Result of the PutConfigurationSetDeliveryOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetDeliveryOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetDeliveryOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetDeliveryOptionsResult putConfigurationSetDeliveryOptions(
            PutConfigurationSetDeliveryOptionsRequest putConfigurationSetDeliveryOptionsRequest);

    /**
     * <p>
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set
     * in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetReputationOptionsRequest
     *        A request to enable or disable tracking of reputation metrics for a configuration set.
     * @return Result of the PutConfigurationSetReputationOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetReputationOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetReputationOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetReputationOptionsResult putConfigurationSetReputationOptions(
            PutConfigurationSetReputationOptionsRequest putConfigurationSetReputationOptionsRequest);

    /**
     * <p>
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetSendingOptionsRequest
     *        A request to enable or disable the ability of Amazon SES to send emails that use a specific configuration
     *        set.
     * @return Result of the PutConfigurationSetSendingOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSendingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetSendingOptionsResult putConfigurationSetSendingOptions(PutConfigurationSetSendingOptionsRequest putConfigurationSetSendingOptionsRequest);

    /**
     * <p>
     * Specify the account suppression list preferences for a configuration set.
     * </p>
     * 
     * @param putConfigurationSetSuppressionOptionsRequest
     *        A request to change the account suppression list preferences for a specific configuration set.
     * @return Result of the PutConfigurationSetSuppressionOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetSuppressionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSuppressionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetSuppressionOptionsResult putConfigurationSetSuppressionOptions(
            PutConfigurationSetSuppressionOptionsRequest putConfigurationSetSuppressionOptionsRequest);

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send.
     * </p>
     * 
     * @param putConfigurationSetTrackingOptionsRequest
     *        A request to add a custom domain for tracking open and click events to a configuration set.
     * @return Result of the PutConfigurationSetTrackingOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetTrackingOptionsResult putConfigurationSetTrackingOptions(
            PutConfigurationSetTrackingOptionsRequest putConfigurationSetTrackingOptionsRequest);

    /**
     * <p>
     * Move a dedicated IP address to an existing dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * The dedicated IP address that you specify must already exist, and must be associated with your AWS account.
     * </p>
     * <p>
     * The dedicated IP pool you specify must already exist. You can create a new pool by using the
     * <code>CreateDedicatedIpPool</code> operation.
     * </p>
     * </note>
     * 
     * @param putDedicatedIpInPoolRequest
     *        A request to move a dedicated IP address to a dedicated IP pool.
     * @return Result of the PutDedicatedIpInPool operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpInPool" target="_top">AWS API
     *      Documentation</a>
     */
    PutDedicatedIpInPoolResult putDedicatedIpInPool(PutDedicatedIpInPoolRequest putDedicatedIpInPoolRequest);

    /**
     * <p/>
     * 
     * @param putDedicatedIpWarmupAttributesRequest
     *        A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you
     *        want to resume the warm-up process for an existing IP address.
     * @return Result of the PutDedicatedIpWarmupAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutDedicatedIpWarmupAttributesResult putDedicatedIpWarmupAttributes(PutDedicatedIpWarmupAttributesRequest putDedicatedIpWarmupAttributesRequest);

    /**
     * <p>
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to
     * reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the
     * ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param putDeliverabilityDashboardOptionRequest
     *        Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain
     *        access to reputation, deliverability, and other metrics for the domains that you use to send email using
     *        Amazon SES API v2. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
     * @return Result of the PutDeliverabilityDashboardOption operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDeliverabilityDashboardOption"
     *      target="_top">AWS API Documentation</a>
     */
    PutDeliverabilityDashboardOptionResult putDeliverabilityDashboardOption(PutDeliverabilityDashboardOptionRequest putDeliverabilityDashboardOptionRequest);

    /**
     * <p>
     * Used to associate a configuration set with an email identity.
     * </p>
     * 
     * @param putEmailIdentityConfigurationSetAttributesRequest
     *        A request to associate a configuration set with an email identity.
     * @return Result of the PutEmailIdentityConfigurationSetAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityConfigurationSetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityConfigurationSetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityConfigurationSetAttributesResult putEmailIdentityConfigurationSetAttributes(
            PutEmailIdentityConfigurationSetAttributesRequest putEmailIdentityConfigurationSetAttributesRequest);

    /**
     * <p>
     * Used to enable or disable DKIM authentication for an email identity.
     * </p>
     * 
     * @param putEmailIdentityDkimAttributesRequest
     *        A request to enable or disable DKIM signing of email that you send from an email identity.
     * @return Result of the PutEmailIdentityDkimAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityDkimAttributesResult putEmailIdentityDkimAttributes(PutEmailIdentityDkimAttributesRequest putEmailIdentityDkimAttributesRequest);

    /**
     * <p>
     * Used to configure or change the DKIM authentication settings for an email domain identity. You can use this
     * operation to do any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using Easy DKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using Easy DKIM to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using BYODKIM to using Easy DKIM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putEmailIdentityDkimSigningAttributesRequest
     *        A request to change the DKIM attributes for an email identity.
     * @return Result of the PutEmailIdentityDkimSigningAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityDkimSigningAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimSigningAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityDkimSigningAttributesResult putEmailIdentityDkimSigningAttributes(
            PutEmailIdentityDkimSigningAttributesRequest putEmailIdentityDkimSigningAttributesRequest);

    /**
     * <p>
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an
     * identity is used to send an email that results in a bounce or complaint event.
     * </p>
     * <p>
     * If the value is <code>true</code>, you receive email notifications when bounce or complaint events occur. These
     * notifications are sent to the address that you specified in the <code>Return-Path</code> header of the original
     * email.
     * </p>
     * <p>
     * You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for
     * receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an
     * email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param putEmailIdentityFeedbackAttributesRequest
     *        A request to set the attributes that control how bounce and complaint events are processed.
     * @return Result of the PutEmailIdentityFeedbackAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityFeedbackAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityFeedbackAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityFeedbackAttributesResult putEmailIdentityFeedbackAttributes(
            PutEmailIdentityFeedbackAttributesRequest putEmailIdentityFeedbackAttributesRequest);

    /**
     * <p>
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     * </p>
     * 
     * @param putEmailIdentityMailFromAttributesRequest
     *        A request to configure the custom MAIL FROM domain for a verified identity.
     * @return Result of the PutEmailIdentityMailFromAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityMailFromAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityMailFromAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityMailFromAttributesResult putEmailIdentityMailFromAttributes(
            PutEmailIdentityMailFromAttributesRequest putEmailIdentityMailFromAttributesRequest);

    /**
     * <p>
     * Adds an email address to the suppression list for your account.
     * </p>
     * 
     * @param putSuppressedDestinationRequest
     *        A request to add an email destination to the suppression list for your account.
     * @return Result of the PutSuppressedDestination operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.PutSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    PutSuppressedDestinationResult putSuppressedDestination(PutSuppressedDestinationRequest putSuppressedDestinationRequest);

    /**
     * <p>
     * Composes an email message to multiple destinations.
     * </p>
     * 
     * @param sendBulkEmailRequest
     *        Represents a request to send email messages to multiple destinations using Amazon SES. For more
     *        information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SendBulkEmail operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws AccountSuspendedException
     *         The message can't be sent because the account's ability to send email has been permanently restricted.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.SendBulkEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendBulkEmail" target="_top">AWS API
     *      Documentation</a>
     */
    SendBulkEmailResult sendBulkEmail(SendBulkEmailRequest sendBulkEmailRequest);

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and
     * attempts to verify it. As a result of executing this operation, a customized verification email is sent to the
     * specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email template. For more information about
     * creating and using custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendCustomVerificationEmailRequest
     *        Represents a request to send a custom verification email to a specified recipient.
     * @return Result of the SendCustomVerificationEmail operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.SendCustomVerificationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendCustomVerificationEmail"
     *      target="_top">AWS API Documentation</a>
     */
    SendCustomVerificationEmailResult sendCustomVerificationEmail(SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest);

    /**
     * <p>
     * Sends an email message. You can use the Amazon SES API v2 to send two types of messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Simple</b> – A standard email message. When you create this type of message, you specify the sender, the
     * recipient, and the message body, and Amazon SES assembles the message for you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of
     * the message headers, as well as the message body. You can use this message type to send messages that contain
     * attachments. The message that you specify has to be a valid MIME message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Templated</b> – A message that contains personalization tags. When you send this type of email, Amazon SES API
     * v2 automatically replaces the tags with values that you specify.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        Represents a request to send a single formatted email using Amazon SES. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SendEmail operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws AccountSuspendedException
     *         The message can't be sent because the account's ability to send email has been permanently restricted.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    SendEmailResult sendEmail(SendEmailRequest sendEmailRequest);

    /**
     * <p>
     * Add one or more tags (keys and values) to a specified resource. A <i>tag</i> is a label that you optionally
     * define and associate with a resource. Tags can help you categorize and manage resources in different ways, such
     * as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderEmailTemplateRequest
     *        &gt;Represents a request to create a preview of the MIME content of an email when provided with a template
     *        and a set of replacement data.
     * @return Result of the TestRenderEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.TestRenderEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/TestRenderEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    TestRenderEmailTemplateResult testRenderEmailTemplate(TestRenderEmailTemplateRequest testRenderEmailTemplateRequest);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update the configuration of an event destination for a configuration set.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        A request to change the settings for an event destination for a configuration set.
     * @return Result of the UpdateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.UpdateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Updates a contact's preferences for a list. It is not necessary to specify all existing topic preferences in the
     * TopicPreferences object, just the ones that need updating.
     * </p>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateContactResult updateContact(UpdateContactRequest updateContactRequest);

    /**
     * <p>
     * Updates contact list metadata. This operation does a complete replacement.
     * </p>
     * 
     * @param updateContactListRequest
     * @return Result of the UpdateContactList operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.UpdateContactList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateContactList" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateContactListResult updateContactList(UpdateContactListRequest updateContactListRequest);

    /**
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateCustomVerificationEmailTemplateRequest
     *        Represents a request to update an existing custom verification email template.
     * @return Result of the UpdateCustomVerificationEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.UpdateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCustomVerificationEmailTemplateResult updateCustomVerificationEmailTemplate(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Updates the specified sending authorization policy for the given identity (an email address or a domain). This
     * API returns successfully even if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateEmailIdentityPolicyRequest
     *        Represents a request to update a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href=
     *        "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Result of the UpdateEmailIdentityPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.UpdateEmailIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateEmailIdentityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEmailIdentityPolicyResult updateEmailIdentityPolicy(UpdateEmailIdentityPolicyRequest updateEmailIdentityPolicyRequest);

    /**
     * <p>
     * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateEmailTemplateRequest
     *        Represents a request to update an email template. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the UpdateEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.UpdateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEmailTemplateResult updateEmailTemplate(UpdateEmailTemplateRequest updateEmailTemplateRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
