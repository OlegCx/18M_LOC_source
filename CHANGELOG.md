# __1.11.1009__ __2021-04-30__
## __AWS Marketplace Catalog Service__
  - ### Features
    - Allows user defined names for Changes in a ChangeSet. Users can use ChangeNames to reference properties in another Change within a ChangeSet. This feature allows users to make changes to an entity when the entity identifier is not yet available while constructing the StartChangeSet request.

## __AWS RoboMaker__
  - ### Features
    - Adds ROS2 Foxy as a supported Robot Software Suite Version and Gazebo 11 as a supported Simulation Software Suite Version

## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports CloudFront Functions, a native feature of CloudFront that enables you to write lightweight functions in JavaScript for high-scale, latency-sensitive CDN customizations.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces GetMatches and MergeProfiles APIs to fetch and merge duplicate profiles

## __Amazon Forecast Service__
  - ### Features
    - Added new DeleteResourceTree operation that helps in deleting all the child resources of a given resource including the given resource.

## __Amazon Personalize__
  - ### Features
    - Update URL for dataset export job documentation.

# __1.11.1008__ __2021-04-29__
## __AWS Organizations__
  - ### Features
    - Minor text updates for AWS Organizations API Reference

## __Amazon Chime__
  - ### Features
    - Increase AppInstanceUserId length to 64 characters

## __Amazon EC2 Container Service__
  - ### Features
    - Add support for EphemeralStorage on TaskDefinition and TaskOverride

## __Amazon Macie 2__
  - ### Features
    - The Amazon Macie API now provides S3 bucket metadata that indicates whether a bucket policy requires server-side encryption of objects when objects are uploaded to the bucket.

# __1.11.1007__ __2021-04-28__
## __AWS CloudFormation__
  - ### Features
    - Add CallAs parameter to GetTemplateSummary to enable use with StackSets delegated administrator integration

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage now offers the option to place your Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) encoder metadata in every video segment instead of in the init fragment for DASH and CMAF endpoints.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise interpolation API will get interpolated values for an asset property per specified time interval during a period of time.

## __Amazon Connect Service__
  - ### Features
    - Updated max number of tags that can be attached from 200 to 50. MaxContacts is now an optional parameter for the UpdateQueueMaxContact API.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio is a virtual studio service that empowers visual effects, animation, and interactive content teams to create content securely within a scalable, private cloud service.

# __1.11.1006__ __2021-04-27__
## __AWS Audit Manager__
  - ### Features
    - This release restricts using backslashes in control, assessment, and framework names. The controlSetName field of the UpdateAssessmentFrameworkControlSet API now allows strings without backslashes.

# __1.11.1005__ __2021-04-26__
## __AWS Elemental MediaConvert__
  - ### Features
    - Documentation updates for mediaconvert

## __AWS Glue__
  - ### Features
    - Adding Kafka Client Auth Related Parameters

## __AWS IoT Wireless__
  - ### Features
    - Add a new optional field MessageType to support Sidewalk devices in SendDataToWirelessDevice API

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Include KMS Key Details in Repository Association APIs to enable usage of customer managed KMS Keys.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding support for Red Hat Enterprise Linux with HA for Reserved Instances.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release updates existing Amazon EKS input validation so customers will see an InvalidParameterException instead of a ParamValidationError when they enter 0 for minSize and/or desiredSize. It also adds LaunchTemplate information to update responses and a new "CUSTOM" value for AMIType.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Data Analytics now supports custom application maintenance configuration using UpdateApplicationMaintenanceConfiguration API for Apache Flink applications. Customers will have visibility when their application is under maintenance status using 'MAINTENANCE' application status.

## __Amazon Personalize__
  - ### Features
    - Added support for exporting data imported into an Amazon Personalize dataset to a specified data source (Amazon S3 bucket).

# __1.11.1004__ __2021-04-23__
## __AWS Elemental MediaPackage__
  - ### Features
    - Add support for Widevine DRM on CMAF origin endpoints. Both Widevine and FairPlay DRMs can now be used simultaneously, with CBCS encryption.

## __Amazon Simple Notification Service__
  - ### Features
    - Amazon SNS adds two new attributes, TemplateId and EntityId, for using sender IDs to send SMS messages to destinations in India.

# __1.11.1003__ __2021-04-22__
## __AWS SecurityHub__
  - ### Features
    - Replaced the term "master" with "administrator". Added new actions to replace AcceptInvitation, GetMasterAccount, and DisassociateFromMasterAccount. In Member, replaced MasterId with AdministratorId.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon ElastiCache__
  - ### Features
    - This release introduces log delivery of Redis slow log from Amazon ElastiCache.

## __Amazon Forecast Service__
  - ### Features
    - This release adds EstimatedTimeRemaining minutes field to the DescribeDatasetImportJob, DescribePredictor, DescribeForecast API response which denotes the time remaining to complete the job IN_PROGRESS.

# __1.11.1002__ __2021-04-21__
## __AWS CloudFormation__
  - ### Features
    - Added support for creating and updating stack sets with self-managed permissions from templates that reference macros.

## __AWS Ground Station__
  - ### Features
    - Support new S3 Recording Config allowing customers to write downlink data directly to S3.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now enables users to override index-level boosting configurations for each query.

## __Amazon Detective__
  - ### Features
    - Added parameters to track the data volume in bytes for a member account. Deprecated the existing parameters that tracked the volume as a percentage of the allowed volume for a behavior graph. Changes reflected in MemberDetails object.

## __Amazon Redshift__
  - ### Features
    - Add operations: AddPartner, DescribePartners, DeletePartner, and UpdatePartnerStatus to support tracking integration status with data partners.

# __1.11.1001__ __2021-04-19__
## __AWS Cost Explorer Service__
  - ### Features
    - Adding support for Sagemaker savings plans in GetSavingsPlansPurchaseRecommendation API

## __AWS Savings Plans__
  - ### Features
    - Added support for Amazon SageMaker in Machine Learning Savings Plans

# __1.11.1000__ __2021-04-15__
## __AWS Database Migration Service__
  - ### Features
    - AWS DMS added support of TLS for Kafka endpoint. Added Describe endpoint setting API for DMS endpoints.

## __AWS Security Token Service__
  - ### Features
    - STS now supports assume role with Web Identity using JWT token length upto 20000 characters

# __1.11.999__ __2021-04-14__
## __AWS CodeStar connections__
  - ### Features
    - This release adds tagging support for CodeStar Connections Host resources

## __AWS Config__
  - ### Features
    - Add exception for DeleteRemediationConfiguration and DescribeRemediationExecutionStatus

## __AWS MediaConnect__
  - ### Features
    - For flows that use Listener protocols, you can now easily locate an output's outbound IP address for a private internet. Additionally, MediaConnect now supports the Waiters feature that makes it easier to poll for the status of a flow until it reaches its desired state.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

# __1.11.998__ __2021-04-13__
## __AWS Comprehend Medical__
  - ### Features
    - The InferICD10CM API now returns TIME_EXPRESSION entities that refer to medical conditions.

## __AWS Security Token Service__
  - ### Features
    - This release adds the SourceIdentity parameter that can be set when assuming a role.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Amazon Lightsail.

## __Amazon Redshift__
  - ### Features
    - Added support to enable AQUA in Amazon Redshift clusters.

## __Amazon Relational Database Service__
  - ### Features
    - Clarify that enabling or disabling automated backups causes a brief downtime, not an outage.

# __1.11.997__ __2021-04-12__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to set the access permissions for build artifacts, project artifacts, and log files that are uploaded to an Amazon S3 bucket that is owned by another account.

## __Amazon FSx__
  - ### Features
    - Support for cross-region and cross-account backup copies

# __1.11.996__ __2021-04-09__
## __AWS Shield__
  - ### Features
    - CreateProtection now throws InvalidParameterException instead of InternalErrorException when system tags (tag with keys prefixed with "aws:") are passed in.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add paginator support to DescribeStoreImageTasks and update documentation.

## __Amazon Redshift__
  - ### Features
    - Add support for case sensitive table level restore

# __1.11.995__ __2021-04-08__
## __AWS Resource Access Manager__
  - ### Features
    - Documentation updates for AWS RAM resource sharing

## __AWS RoboMaker__
  - ### Features
    - This release allows RoboMaker customers to specify custom tools to run with their simulation job

## __Amazon AppStream__
  - ### Features
    - This release provides support for image updates

## __Amazon Connect Customer Profiles__
  - ### Features
    - Documentation updates for Put-Integration API

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Documentation updates for archived.kinesisvideo

## __Amazon Lookout for Equipment__
  - ### Features
    - This release introduces support for Amazon Lookout for Equipment.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling announces Warm Pools that help applications to scale out faster by pre-initializing EC2 instances and save money by requiring fewer continuously running instances

# __1.11.994__ __2021-04-07__
## __AWS Storage Gateway__
  - ### Features
    - File Gateway APIs now support FSx for Windows as a cloud storage.

## __Access Analyzer__
  - ### Features
    - IAM Access Analyzer now analyzes your CloudTrail events to identify actions and services that have been used by an IAM entity (user or role) and generates an IAM policy that is based on that activity.

## __Amazon ElastiCache__
  - ### Features
    - This release adds tagging support for all AWS ElastiCache resources except Global Replication Groups.

## __Amazon Interactive Video Service__
  - ### Features
    - This release adds support for the Auto-Record to S3 feature. Amazon IVS now enables you to save your live video to Amazon S3.

## __Application Migration Service__
  - ### Features
    - Add new service - Application Migration Service.

# __1.11.993__ __2021-04-06__
## __AWS Cloud9__
  - ### Features
    - Documentation updates for Cloud9

## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive VPC outputs update to include Availability Zones, Security groups, Elastic Network Interfaces, and Subnet Ids in channel response

## __AWS Kinesis Video__
  - ### Features
    - Update Netty to `4.1.61.Final`.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for storing EBS-backed AMIs in S3 and restoring them from S3 to enable cross-partition copying of AMIs

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Supports removing a label or labels from a parameter, enables ScheduledEndTime and ChangeDetails for StartChangeRequestExecution API, supports critical/security/other noncompliant count for patch API.

# __1.11.992__ __2021-04-05__
## __AWS Audit Manager__
  - ### Features
    - AWS Audit Manager has updated the GetAssessment API operation to include a new response field called userRole. The userRole field indicates the role information and IAM ARN of the API caller.

## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now support HTML5 Motion Graphics overlay

## __Amazon Appflow__
  - ### Features
    - Added destination properties for Zendesk.

# __1.11.991__ __2021-04-02__
## __AWS Elemental MediaPackage__
  - ### Features
    - SPEKE v2 is an upgrade to the existing SPEKE API to support multiple encryption keys, based on an encryption contract selected by the customer.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for Block Device Mappings for container image builds, and adds distribution configuration support for EC2 launch templates in AMI builds.

# __1.11.990__ __2021-04-01__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert now supports HLS ingest, sidecar WebVTT ingest, Teletext color & style passthrough to TTML subtitles, TTML to WebVTT subtitle conversion with style, & DRC profiles in AC3 audio.

## __AWS WAFV2__
  - ### Features
    - Added support for ScopeDownStatement for ManagedRuleGroups, Labels, LabelMatchStatement, and LoggingFilter. For more information on these features, see the AWS WAF Developer Guide.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra's ServiceNow data source now supports OAuth 2.0 authentication and knowledge article filtering via a ServiceNow query.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - VPC Flow Logs Service adds a new API, GetFlowLogsIntegrationTemplate, which generates CloudFormation templates for Athena. For more info, see https://docs.aws.amazon.com/console/vpc/flow-logs/athena

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports the ja-JP locale

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports base64-encoded message and input transcript fields.

## __Amazon Lightsail__
  - ### Features
    - - This release adds support for state detail for Amazon Lightsail container services.

## __Amazon Route 53 Resolver__
  - ### Features
    - Route 53 Resolver DNS Firewall is a firewall service that allows you to filter and regulate outbound DNS traffic for your VPCs.

## __Firewall Management Service__
  - ### Features
    - Added Firewall Manager policy support for AWS Route 53 Resolver DNS Firewall.

# __1.11.989__ __2021-03-31__
## __AWS Batch__
  - ### Features
    - AWS Batch adds support for Amazon EFS File System

## __AWS Cloud9__
  - ### Features
    - Add ImageId input parameter to CreateEnvironmentEC2 endpoint. New parameter enables creation of environments with different AMIs.

## __AWS CloudFormation__
  - ### Features
    - 1. Added a new parameter "RegionConcurrencyType" in OperationPreferences. 2. Changed the name of "AccountUrl" to "AccountsUrl" in "DeploymentTargets" parameter.

## __AWS Data Pipeline__
  - ### Features
    - Minor documentation updates and link updates.

## __AWS Direct Connect__
  - ### Features
    - This release adds MACsec support to AWS Direct Connect

## __AWS IoT__
  - ### Features
    - Added ability to prefix search on attribute value for ListThings API.

## __AWS IoT Wireless__
  - ### Features
    - Add Sidewalk support to APIs: GetWirelessDevice, ListWirelessDevices, GetWirelessDeviceStatistics. Add Gateway connection status in GetWirelessGatewayStatistics API.

## __AWS Price List Service__
  - ### Features
    - Minor documentation and link updates.

## __Amazon CloudHSM__
  - ### Features
    - Minor documentation and link updates.

## __Amazon Cognito Sync__
  - ### Features
    - Minor documentation updates and link updates.

## __Amazon Comprehend__
  - ### Features
    - Support for customer managed KMS encryption of Comprehend custom models

## __Amazon Detective__
  - ### Features
    - Added the ability to assign tag values to Detective behavior graphs. Tag values can be used for attribute-based access control, and for cost allocation for billing.

## __Amazon Machine Learning__
  - ### Features
    - Minor documentation updates and link updates.

## __Amazon Redshift__
  - ### Features
    - Enable customers to share access to their Redshift clusters from other VPCs (including VPCs from other accounts).

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports creating custom language models in the following languages: British English (en-GB), Australian English (en-AU), Indian Hindi (hi-IN), and US Spanish (es-US).

## __Amazon WorkMail__
  - ### Features
    - This release adds support for mobile device access rules management in Amazon WorkMail.

# __1.11.988__ __2021-03-30__
## __AWS Config__
  - ### Features
    - Adding new APIs to support ConformancePack Compliance CI in Aggregators

## __AWS EC2 Instance Connect__
  - ### Features
    - Adding support to push SSH keys to the EC2 serial console in order to allow an SSH connection to your Amazon EC2 instance's serial port.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new dataset features: 1) support for specifying a database connection as a dataset input 2) support for dynamic datasets that accept configurable parameters in S3 path.

## __Amazon CloudWatch__
  - ### Features
    - SDK update for new Metric Streams feature

## __Amazon Elastic Compute Cloud__
  - ### Features
    - ReplaceRootVolume feature enables customers to replace the EBS root volume of a running instance to a previously known state. Add support to grant account-level access to the EC2 serial console

## __Amazon Fraud Detector__
  - ### Features
    - This release adds support for Batch Predictions in Amazon Fraud Detector.

## __Amazon Pinpoint__
  - ### Features
    - Added support for journey pause/resume, journey updatable import segment and journey quiet time wait.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot now supports 1) feature importance reports for AutoML jobs and 2) PartialFailures for AutoML jobs

# __1.11.987__ __2021-03-29__
## __AWS Glue__
  - ### Features
    - Allow Dots in Registry and Schema Names for CreateRegistry, CreateSchema; Fixed issue when duplicate keys are present and not returned as part of QuerySchemaVersionMetadata.

## __AWS Identity and Access Management__
  - ### Features
    - AWS Identity and Access Management GetAccessKeyLastUsed API will throw a custom error if customer public key is not found for access keys.

## __AWS WAFV2__
  - ### Features
    - Added custom request handling and custom response support in rule actions and default action; Added the option to inspect the web request body as parsed and filtered JSON.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release adds support for Event Subscriptions to DocumentDB.

## __Amazon Location Service__
  - ### Features
    - Amazon Location added support for specifying pricing plan information on resources in alignment with our cost model.

# __1.11.986__ __2021-03-26__
## __AWS IoT Wireless__
  - ### Features
    - Support tag-on-create for WirelessDevice.

## __Amazon CloudWatch Events__
  - ### Features
    - Add support for SageMaker Model Builder Pipelines Targets to EventBridge

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release adds an optional parameter named FlowDefinition in PutIntegrationRequest.

## __Amazon EventBridge__
  - ### Features
    - Add support for SageMaker Model Builder Pipelines Targets to EventBridge

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports tagging words that match your vocabulary filter for batch transcription.

# __1.11.984__ __2021-03-25__
## __Amazon Lookout for Metrics__
  - ### Features
    - Allowing uppercase alphabets for RDS and Redshift database names.

# __1.11.983__ __2021-03-25__
## __AWS Elemental MediaLive__
  - ### Features
    - EML now supports handling HDR10 and HLG 2020 color space from a Link input.

## __Alexa For Business__
  - ### Features
    - Added support for enabling and disabling data retention in the CreateProfile and UpdateProfile APIs and retrieving the state of data retention for a profile in the GetProfile API.

## __Amazon Lookout for Metrics__
  - ### Features
    - Amazon Lookout for Metrics is now generally available. You can use Lookout for Metrics to monitor your data for anomalies. For more information, see the Amazon Lookout for Metrics Developer Guide.

## __Amazon Rekognition__
  - ### Features
    - "This release introduces AWS tagging support for Amazon Rekognition collections, stream processors, and Custom Label models."

## __Amazon SageMaker Service__
  - ### Features
    - This feature allows customer to specify the environment variables in their CreateTrainingJob requests.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS

# __1.11.982__ __2021-03-24__
## __AWS Greengrass__
  - ### Features
    - Updated the parameters to make name required for CreateGroup API.

## __AWS S3 Control__
  - ### Features
    - Documentation updates for s3-control

## __Amazon Elastic Compute Cloud__
  - ### Features
    - maximumEfaInterfaces added to DescribeInstanceTypes API

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release allows SSM Explorer customers to enable OpsData sources across their organization when creating a resource data sync.

# __1.11.981__ __2021-03-23__
## __AWS Cost Explorer Service__
  - ### Features
    - You can now create cost categories with inherited value rules and specify default values for any uncategorized costs.

## __AWS Fault Injection Simulator__
  - ### Features
    - Updated maximum allowed size of action parameter from 64 to 1024

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for IAM operations and descriptions.

## __Amazon DynamoDB__
  - ### Features
    - Change Standard mode max retry count for DynamoDB which was 2 to match DynamoDB's Standard retry count which is 10.

## __Amazon GameLift__
  - ### Features
    - GameLift adds support for using event notifications to monitor game session placements. Specify an SNS topic or use CloudWatch Events to track activity for a game session queue.

## __Amazon Redshift__
  - ### Features
    - Removed APIs to control AQUA on clusters.

# __1.11.980__ __2021-03-22__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for UEFI boot on selected AMD- and Intel-based EC2 instances.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for publishing sensitive data findings to AWS Security Hub and specifying which categories of findings to publish to Security Hub.

## __Amazon Redshift__
  - ### Features
    - Added support to enable AQUA in Amazon Redshift clusters.

## __CodeArtifact__
  - ### Features
    - Documentation updates for CodeArtifact

# __1.11.979__ __2021-03-19__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - X2gd instances are the next generation of memory-optimized instances powered by AWS-designed, Arm-based AWS Graviton2 processors.

## __Amazon SageMaker Service__
  - ### Features
    - Adding authentication support for pulling images stored in private Docker registries to build containers for real-time inference.

# __1.11.978__ __2021-03-18__
## __AWS Kinesis Video__
  - ### Features
    - Upgrade Netty to `4.1.60.Final`

## __AWS S3 Control__
  - ### Features
    - S3 Object Lambda is a new S3 feature that enables users to apply their own custom code to process the output of a standard S3 GET request by automatically invoking a Lambda function with a GET request

## __AWS SecurityHub__
  - ### Features
    - New object for separate provider and customer values. New objects track S3 Public Access Block configuration and identify sensitive data. BatchImportFinding requests are limited to 100 findings.

## __Amazon Redshift__
  - ### Features
    - Add new fields for additional information about VPC endpoint for clusters with reallocation enabled, and a new field for total storage capacity for all clusters.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Object Lambda is a new S3 feature that enables users to apply their own custom code to process the output of a standard S3 GET request by automatically invoking a Lambda function with a GET request

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling Instance Refresh now supports phased deployments.

# __1.11.977__ __2021-03-17__
## __AWS Batch__
  - ### Features
    - Making serviceRole an optional parameter when creating a compute environment. If serviceRole is not provided then Service Linked Role will be created (or reused if it already exists).

## __Amazon SageMaker Service__
  - ### Features
    - Support new target device ml_eia2 in SageMaker CreateCompilationJob API

# __1.11.976__ __2021-03-16__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS Lambda__
  - ### Features
    - Allow empty list for function response types

## __AWS MediaConnect__
  - ### Features
    - This release adds support for the SRT-listener protocol on sources and outputs.

## __AWS MediaTailor__
  - ### Features
    - MediaTailor channel assembly is a new manifest-only service that allows you to assemble linear streams using your existing VOD content.

## __Access Analyzer__
  - ### Features
    - This release adds support for the ValidatePolicy API. IAM Access Analyzer is adding over 100 policy checks and actionable recommendations that help you validate your policies during authoring.

## __Amazon GameLift__
  - ### Features
    - GameLift expands to six new AWS Regions, adds support for multi-location fleets to streamline management of hosting resources, and lets you customize more of the game session placement process.

## __AmazonMWAA__
  - ### Features
    - This release adds UPDATE_FAILED and UNAVAILABLE MWAA environment states.

# __1.11.975__ __2021-03-15__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy can now detect instances running an outdated revision of your application and automatically update them with the latest revision.

## __AWS Fault Injection Simulator__
  - ### Features
    - Initial release of AWS Fault Injection Simulator, a managed service that enables you to perform fault injection experiments on your AWS workloads

## __AWS SDK for Java__
  - ### Features
    - Add retry mode in user-agent.

## __Amazon EC2 Container Service__
  - ### Features
    - This is for ecs exec feature release which includes two new APIs - execute-command and update-cluster and an AWS CLI customization for execute-command API

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now specify Resource Group to target Capacity Reservations in their EMR clusters with instance fleets using allocation strategy.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - AWS Transcribe now supports real-time transcription for Chinese (zh-CN) and confidence scores in the transcription output.

# __1.11.974__ __2021-03-12__
## __AWS Cost and Usage Report Service__
  - ### Features
    - - Added optional billingViewArn field for OSG.

## __AWS MediaTailor__
  - ### Features
    - MediaTailor channel assembly is a new manifest-only service that allows you to assemble linear streams using your existing VOD content.

## __Amazon WorkSpaces__
  - ### Features
    - Adds API support for WorkSpaces bundle management operations.

# __1.11.973__ __2021-03-11__
## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive supports the ability to apply a canned ACL to output sent to an AWS S3 bucket; supports ability to specify position for EBU-TT and TTML output captions converted from Teletext source.

## __AWS Network Firewall__
  - ### Features
    - Correct the documentation about how you can provide rule group rules

## __AWS WAFV2__
  - ### Features
    - Correct the documentation about JSON body parsing behavior and IP set update behavior

## __Amazon Comprehend__
  - ### Features
    - ContainsPiiEntities API analyzes the input text for the presence of personally identifiable information(PII) and returns the labels of identified PII entity types such as name, address etc.

# __1.11.972__ __2021-03-10__
## __AWS Backup__
  - ### Features
    - Added support for enabling continuous backups.

## __Access Analyzer__
  - ### Features
    - This release adds support to preview IAM Access Analyzer findings for a resource before deploying resource permission changes.

## __Amazon Simple Storage Service__
  - ### Features
    - Adding ID element to the CORSRule schema

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager support for tagging OpsMetadata.

# __1.11.971__ __2021-03-09__
## __AWS IoT Wireless__
  - ### Features
    - Add max value to Seq in SendDataToWirelessDevice API"

## __Amazon CodeGuru Profiler__
  - ### Features
    - Update documentation to include Python. Add ConflictException for DeleteProfilingGroup. Add FrameMetricValue.

## __Amazon Elastic File System__
  - ### Features
    - AWS EFS is introducing one-zone file systems.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Proxy endpoints.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling now supports setting a local time zone for cron expressions in scheduled actions, removing the need to adjust for Daylight Saving Time (DST)

# __1.11.970__ __2021-03-08__
## __AWS Lambda__
  - ### Features
    - Documentation updates for Lambda. Constraint updates to AddLayerVersionPermission's Action and OrganizationId parameters, and AddPermission's Principal and SourceAccount parameters.

## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now specify how EC2 On-Demand Capacity Reservations are used in their EMR clusters with instance fleets using allocation strategy.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Increase the maximum HLS and MPEG-DASH manifest size from 1,000 to 5,000 fragments.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Documentation updates

## __Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling for capacity-optimized-prioritized SpotAllocationStrategy

# __1.11.969__ __2021-03-05__
## __AWS CodePipeline__
  - ### Features
    - Updated the parameters to make actionType required for UpdateActionType

## __AWS Elemental MediaLive__
  - ### Features
    - Medialive now supports the ability to transfer AWS Elemental Link devices to another region.

## __AWS License Manager__
  - ### Features
    - License Manager Automated Discovery now supports Exclusion Filters.

## __AWS Network Firewall__
  - ### Features
    - Added a new UpdateToken output field to the PerObjectStatus as part of firewall sync state. This is added to track which version of the object the firewall is in sync or pending synchronization.

## __AWS Shield__
  - ### Features
    - Add support for tagging of Shield protection and protection group resources.

## __Amazon Appflow__
  - ### Features
    - Documentation updates for arn:aws:trebuchet:::service:v1:decb008d-e0d8-44a4-b93c-092f0355d523

## __Amazon Athena__
  - ### Features
    - Adds APIs to create, list, update, and delete prepared SQL statements that have optional placeholder parameters. A prepared statement can use different values for these parameters each time it is run.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Expands EC2/Spot Fleet capacity-optimized allocation strategy to allow users to prioritize instance pools. Fleet attempts to fulfill priorities on a best-effort basis but optimizes for capacity first.

# __1.11.968__ __2021-03-04__
## __AWS Cloud Map__
  - ### Features
    - Supports creating API-only services under DNS namespace.  Add namespace syntax validation.

## __Amazon CloudWatch Events__
  - ### Features
    - Introducing support for EventBridge Api Destinations - any HTTP APIs as Targets, with managed authorization via EventBridge Connections.

## __Amazon EventBridge__
  - ### Features
    - Introducing support for EventBridge Api Destinations - any HTTP APIs as Targets, with managed authorization via EventBridge Connections.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds the ResolvedOutputS3Uri to the DescribeFeatureGroup API to indicate the S3 prefix where offline data is stored in a feature group

## __AmazonMWAA__
  - ### Features
    - This release introduces a new MinWorker parameter to the CreateEnvironment and UpdateEnvironment APIs. MinWorker allows the users to set a minimum worker count for worker auto-scaling operations.

# __1.11.967__ __2021-03-03__
## __AWS Certificate Manager__
  - ### Features
    - Adds 2 new APIs to add and retrieve account configuration in AWS Certificate Manager.

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now supports Session Manager debugging for batch builds.

## __AWS SDK for Java__
  - ### Features
    - Add `AP_NORTHEAST_3` region.

## __AWS Secrets Manager__
  - ### Features
    - Added support for multi-Region secrets APIs ReplicateSecretToRegions, RemoveRegionsFromReplication, and StopReplicationToReplica

## __AWS Well-Architected Tool__
  - ### Features
    - This release supports tagging on AWS Well-Architected workloads.

## __Amazon CloudWatch Events__
  - ### Features
    - Adds TraceHeader to PutEventsRequestEntry to support AWS X-Ray trace-ids on events generated using the PutEvents operation.

## __Amazon Elasticsearch Service__
  - ### Features
    - AWS ElasticSearch Feature : Support for adding tags in elastic search domain during domain creation

## __Amazon Forecast Service__
  - ### Features
    - Added new StopResource operation that stops Amazon Forecast resource jobs that are in progress.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

# __1.11.966__ __2021-03-02__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS DataSync__
  - ### Features
    - Additional API Support to update NFS/SMB/ObjectStorage locations

## __AWS Direct Connect__
  - ### Features
    - Doc only update for AWS Direct Connect that fixes several customer-reported issues

## __AWS IoT Wireless__
  - ### Features
    - Add ARN & Tags for PartnerAccount related APIs and WirelessGatewayTaskDefinition related APIs

## __Amazon EventBridge__
  - ### Features
    - Adds TraceHeader to PutEventsRequestEntry to support AWS X-Ray trace-ids on events generated using the PutEvents operation.

## __Amazon Managed Blockchain__
  - ### Features
    - Updates for Ethereum general availability release.

# __1.11.965__ __2021-03-01__
## __AWS CodePipeline__
  - ### Features
    - Added a new field to the ListPipelines API to allow maximum search results of 1000

## __Alexa For Business__
  - ### Features
    - Added support for optional tags in CreateAddressBook, CreateConferenceProvider, CreateContact, CreateGatewayGroup, CreateNetworkProfile and RegisterAVSDevice APIs.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code AdmissionRequestDenied for Addons in EKS

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add Support for Patch Manger Baseline Override parameter.

# __1.11.964__ __2021-02-26__
## __AWS Single Sign-On Admin__
  - ### Features
    - Relax constraint on List* API pagination tokens to include underscore character

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports adding KMS envelope encryption to existing clusters to enhance security for secrets

## __Amazon Elastic MapReduce__
  - ### Features
    - Added UpdateStudio API that allows updating a few attributes of an EMR Studio.

## __Amazon Simple Storage Service__
  - ### Features
    - Add RequestPayer to GetObjectTagging and PutObjectTagging.

# __1.11.963__ __2021-02-25__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new dataset features: 1) support for specifying the file format for a dataset, and 2) support for specifying whether the first row of a CSV or Excel file contains a header.

## __AWS Transfer Family__
  - ### Features
    - Corrected the upper limit for TestIdentityProvider input lengths to 1024 characters

## __Amazon Detective__
  - ### Features
    - Changed "master account" to "administrator account." A new AdministratorId field replaces the deprecated MasterId field. Added an option to disable email notifications for member account invitations.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __EC2 Image Builder__
  - ### Features
    - This release introduces a new API (ListImagePackages) for listing packages installed on an image, and adds support for GP3 volume types, and for specifying a time zone in an image pipeline schedule.

# __1.11.962__ __2021-02-24__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - AWS Elemental MediaPackage provides access logs that capture detailed information about requests sent to a customer's MediaPackage VOD packaging group.

## __Amazon Appflow__
  - ### Features
    - # Adding 'Amazon Honeycode' , 'Amazon Lookout for Metrics' and  'Amazon Connect Customer Profiles' as Destinations.

## __Amazon Elastic Container Registry Public__
  - ### Features
    - This release adds support for AWS tags on Amazon ECR Public repositories.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports Auto-Tune, which monitors performance metrics and automatically optimizes domains

# __1.11.961__ __2021-02-23__
## __AWS Glue__
  - ### Features
    - Updating the page size for Glue catalog getter APIs.

## __AWS IoT Events__
  - ### Features
    - This release adds an Analyze feature to AWS IoT Events that lets customers analyze their detector models for runtime issues.

## __AWS S3 Control__
  - ### Features
    - Documentation updates for s3-control

## __Amazon Connect Service__
  - ### Features
    - Documentation updates for AWS Connect (MediaConcurrency Limit).

## __Amazon Pinpoint__
  - ### Features
    - Enables AWS Pinpoint customers to use Entity Id and Template Id when sending SMS message. These parameters can be obtained from the regulatory body of the country where you are trying to send the SMS.

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight Row Level Security

## __Auto Scaling__
  - ### Features
    - Adds a new optional IncludeDeletedGroups parameter to the DescribeScalingActivities API.

## __Redshift Data API Service__
  - ### Features
    - This release adds an additional parameter 'ConnectedDatabase' into ListSchemasRequest, ListTablesRequest and DescribeTableRequest to support the metadata sharing across databases.

# __1.11.960__ __2021-02-22__
## __Amazon SageMaker Runtime__
  - ### Features
    - SageMaker Runtime now supports a new TargetContainerHostname header to invoke a model in a specific container if the endpoint hosts multiple containers and is configured to use direct invocation.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports core dump for SageMaker Endpoints and direct invocation of a single container in a SageMaker Endpoint that hosts multiple containers.

# __1.11.959__ __2021-02-19__
## __Amazon Relational Database Service__
  - ### Features
    - Added awsBackupRecoveryPointArn in ModifyDBInstanceRequest and in the response of ModifyDBInstance.

# __1.11.958__ __2021-02-18__
## __AWS CloudFormation__
  - ### Features
    - Adding the 'callAs' parameter to all CloudFormation StackSets APIs except getTemplateSummary to support creating and managing service-managed StackSets with AWS Organizations Delegated Administrators

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to specify a separate bucket owner as part of the S3 destination in a report group.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for health

## __Amazon SageMaker Service__
  - ### Features
    - This release adds expires-in-seconds parameter to the CreatePresignedDomainUrl API for support of a configurable TTL.

# __1.11.957__ __2021-02-17__
## __AWS Config__
  - ### Features
    - Added INSUFFICIENT_DATA in ConformancePackComplianceType.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release includes a new filter for describe-vpc-endpoint-services.

## __Amazon Lookout for Vision__
  - ### Features
    - This release for Amazon Lookout for Vision includes documentation updates and a correction to the Status field returned in the response from StartModel and StopModel.

# __1.11.956__ __2021-02-16__
## __AWS CodeBuild__
  - ### Features
    - This release provides per-project limits for the number of concurrent builds

## __Amazon DevOps Guru__
  - ### Features
    - Amazon DevOps Guru is GA ready. This API update added a describeFeedback Api allows users to view submitted insight feedback. The release date is 02/16/2021

# __1.11.955__ __2021-02-15__
## __AWS Config__
  - ### Features
    - Added option to provide KMS key to AWS Config DeliveryChannel

## __AWS Elemental MediaLive__
  - ### Features
    - AWS MediaLive now supports Automatic-Input-Failover for CDI Inputs.

## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports specifying aliases for dynamic variables. This allows use cases such as binding multiple origin domains to a single MediaTailor playback configuration.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - The ListFragments and GetMediaForFragmentList APIs now support StreamName or StreamARN as input parameters.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Amazon Pinpoint__
  - ### Features
    - Lets customers use origination number when specifying SMS message configuration for Campaigns and Journeys.

## __Amazon WorkMail Message Flow__
  - ### Features
    - This release allows customers to update email messages as they flow in and out of Amazon WorkMail

## __Redshift Data API Service__
  - ### Features
    - This release enables fine grant access control in ListStatements, GetStatementResult, CancelStatement and DescribeStatement.

# __1.11.954__ __2021-02-12__
## __AWS AppSync__
  - ### Features
    - Approve release for appsync local on pipeline resolver

## __AWS CodePipeline__
  - ### Features
    - The release provides new GetActionType and UpdateActionType APIs for viewing and editing action types in CodePipeline.

## __AWS Identity and Access Management__
  - ### Features
    - AWS Identity and Access Management now supports tagging for the following resources: customer managed policies, identity providers, instance profiles, server certificates, and virtual MFA devices.

## __AWS WAFV2__
  - ### Features
    - Added the option to inspect the web request body as parsed and filtered JSON (new FieldToMatch type JsonBody), in addition to the existing option to inspect the web request body as plain text.

## __Amazon Detective__
  - ### Features
    - The API definition now indicates that the format for timestamps is an ISO 8601 date-time string

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports OpenId Connect (OIDC) compatible identity providers as a user authentication option

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API replaces the term master account with the term administrator account, including deprecating APIs that use the previous term and adding APIs that use the new term.

## __Amazon Personalize Events__
  - ### Features
    - Increased maximum char size of PutUsers and PutItems properties.

## __Amazon Relational Database Service__
  - ### Features
    - EngineMode in the response of DescribeDBClusterSnapshots. SupportedEngineModes, SupportsParallelQuery and SupportsGlobalDatabases in ValidUpgradeTarget of DBEngineVersions in DescribeDBEngineVersions.

## __Elastic Load Balancing__
  - ### Features
    - Adds a target group attribute for application-based stickiness for Application Load Balancers and an update to the client IP preservation attribute for Network Load Balancers.

# __1.11.953__ __2021-02-11__
## __AWS Glue DataBrew__
  - ### Features
    - This release adds support for profile job sampling, which determines the number of rows on which the profile job will be executed.

## __Amazon Relational Database Service__
  - ### Features
    - Adding support for RDS Aurora Global Database Failover

# __1.11.952__ __2021-02-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for WMA audio only ingest, SMPTE-TT text and image caption ingest, and MPEG-2 video in MXF OP1a outputs.

## __AWS S3__
  - ### Features
    - Add `us-iso-east-1`, `us-isob-east-1`, `us-iso-west-1` regions to Regions enum

## __AWS SDK for Java__
  - ### Features
    - Add `us-iso-east-1`, `us-isob-east-1`, `us-iso-west-1` regions to Regions enum

## __Amazon GameLift__
  - ### Features
    - GameLift FleetIQ users can now use AMD instance families in supported Regions. In addition, FlexMatch matchmaking notification now supports SNS FIFO topics.

## __Amazon QLDB Session__
  - ### Features
    - This release adds CapacityExceededException to the AWS QLDBSession API.

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports Python's paginators for Exploration APIs.

## __Amazon SageMaker Service__
  - ### Features
    - Add a new optional FrameworkVersion field to Sagemaker Neo CreateCompilationJob API

# __1.11.951__ __2021-02-08__
## __AWS CloudTrail__
  - ### Features
    - ConflictException is now thrown when certain operations are called on resources before CloudTrail has time to load the resources. Two new exceptions have been added to the PutInsightSelectors API.

## __AWS Data Exchange__
  - ### Features
    - This release introduces the new ExportRevision job type, which allows for the export of an entire revision.

## __AWS Global Accelerator__
  - ### Features
    - Global Accelerator now supports bringing your own IP addresses for custom routing accelerators

## __AWS IoT SiteWise__
  - ### Features
    - Recall CreatePresignedPortalUrl API

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Interactive Video Service__
  - ### Features
    - Fixed an issue where StreamStartTime could not be unmarshalled from response. Changed DeleteChannel and DeleteStreamKey response codes to 204.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for specifying a time range in queries for usage data.

## __Elastic Load Balancing__
  - ### Features
    - Adds a target group attribute for application-based stickiness for Application Load Balancers.

# __1.11.950__ __2021-02-05__
## __AWS Organizations__
  - ### Features
    - Added support for a few additional exception codes for some AWS Organizations APIs.

## __Amazon Macie__
  - ### Features
    - Documentation updates for Amazon Macie Classic. We replaced the term "master account" with the term "administrator account." An administrator account is used to centrally manage multiple accounts.

## __Elastic Load Balancing__
  - ### Features
    - Adds a target group attribute for client IP preservation for Network Load Balancers.

# __1.11.949__ __2021-02-04__
## __Amazon Appflow__
  - ### Features
    - Adding schedule offset as an input for scheduled flows in CreateFlow API. Also, adding data pull start time and data pull end time for DescribeFlowExecutionRecords API response.

## __Amazon Athena__
  - ### Features
    - Adds the Athena ListEngineVersions action and the EngineVersion data type. ListEngineVersions returns the available Athena engine versions, including Auto, as a list of EngineVersion objects.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Provide support for EBS Local Snapshots on AWS Outpost in Data Lifecycle Manager (DLM).

## __Amazon EMR Containers__
  - ### Features
    - This release is to correct the timestamp format to ISO8601 for the date parameters in the describe and list API response objects of Job Run and Virtual Clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS Outposts now supports EBS local snapshots on Outposts that allows customers to store snapshots of EBS volumes and AMIs locally on S3 on Outposts.

## __Amazon QuickSight__
  - ### Features
    - API release for field folders feature.

# __1.11.948__ __2021-02-03__
## __AWS Audit Manager__
  - ### Features
    - This release adds AccessDeniedException to GetServicesInScope API.

## __AWS CodeBuild__
  - ### Features
    - Documentation updates for codebuild

## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS Cost Explorer Service__
  - ### Features
    - Clarify valid values for the filter parameter for certain APIs.

## __AWS Glue DataBrew__
  - ### Features
    - This release adds the DescribeJobRun API to allow customers retrieve details of a given job run

## __AWS IoT SiteWise__
  - ### Features
    - Update AccessPolicy API input to support IAM role for IAM mode. Iam role is added as part of accessPolicyIdentity.

## __AWS Lambda__
  - ### Features
    - Support for creating Lambda Functions using 'nodejs14.x'

## __AWS SecurityHub__
  - ### Features
    - Added a ProductArn parameter to DescribeProducts. ProductArn is used to identify the integration to return details for.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Public IP now supports API for setting PTR records on Elastic IP address.

## __Amazon WorkMail__
  - ### Features
    - Increased maximum length of ipRanges values for Access Control Rules from 10 to 1024.

# __1.11.947__ __2021-02-02__
## __AWS App Mesh__
  - ### Features
    - App Mesh now supports mutual TLS with two-way peer authentication. You can specify client certificates, server-side TLS validation, and matching of Subject Alternative Names.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports Image Media Playlists on HLS outputs, version 0.4 (trick-mode).

## __AWS IoT Wireless__
  - ### Features
    - Add enum value MqttTopic for Destination ExpressionType, add LoRaWANNetworkServerCertificateId for GetWirelessGatewayCertificate API

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations.

## __AWS RDS DataService__
  - ### Features
    - With the Data API, you can now use UUID and JSON data types as input to your database. Also with the Data API, you can now have a LONG type value returned from your database as a STRING value.

## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now supports Delete Object Tagging

## __Amazon Location Service__
  - ### Features
    - Doc only update for Amazon Location Maps that fixes a customer related issue regarding MapConfiguration

## __Amazon Lookout for Vision__
  - ### Features
    - This release includes the General Availability (GA) SDK for Amazon Lookout for Vision. New for GA is tagging support for Amazon Lookout for Vision models.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for Route 53

## __Amazon S3__
  - ### Features
    - Amazon S3 now supports AWS PrivateLink, providing direct access to S3 via a private endpoint within your virtual private network.

## __Application Auto Scaling__
  - ### Features
    - With this release, scheduled actions of Application Auto Scaling can be created in the local time zone and automatically adjusted according to daylight saving changes.

# __1.11.946__ __2021-01-29__
## __AWS Elemental MediaLive__
  - ### Features
    - "AWS Elemental MediaLive now supports output to a private VPC. When this property is specified, the output will egress from a user specified VPC."

## __Amazon Connect Service__
  - ### Features
    - Added API to manage queues or get hours of operation for a queue programmatically, which can be used to create new/update queues, or take actions when skills are outside of their hours of operation.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for using object prefixes to refine the scope of a classification job.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe Streaming Medical now supports Protected Health Information (PHI) identification which enables you to identify PHI entities based on HIPAA Privacy Rule.

# __1.11.945__ __2021-01-28__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for specifying a custom delimiter for input CSV datasets and for CSV job outputs.

## __AWS IoT__
  - ### Features
    - Documentation updates for IoT DeleteOTAUpdate API

## __AWS RoboMaker__
  - ### Features
    - This release allows Robomaker customers to specify configuration for uploading logs and artifacts generated by their simulation jobs.

## __AWS Well-Architected Tool__
  - ### Features
    - Documentation updates for AWS Well-Architected Tool

## __Amazon CloudWatch__
  - ### Features
    - Update to SDK to support label time zones in CloudWatch GetMetricData

## __Amazon Managed Blockchain__
  - ### Features
    - This release supports tagging on Amazon Managed Blockchain resources.

# __1.11.944__ __2021-01-27__
## __Access Analyzer__
  - ### Features
    - This release adds Secrets Manager secrets as a supported resource in IAM Access Analyzer to help you identify secrets that can be accessed from outside your account or AWS organization.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release makes Uri a required parameter in GetIntegrationRequest and DeleteIntegrationRequest.

## __Amazon ElastiCache__
  - ### Features
    - Add support to pass ParameterGroup name as part updating Engine Version of Global Datastore.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service adds support for node-to-node encryption and encryption at rest for existing domains running Elasticsearch version 6.7 and above

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Amazon Simple Email Service__
  - ### Features
    - This release includes the ability to assign a configuration set to an email identity (a domain or email address), which allows the settings from the configuration set to be applied to the identity.

# __1.11.943__ __2021-01-26__
## __AWS Backup__
  - ### Features
    - Documentation updates for AWS Backup

# __1.11.942__ __2021-01-22__
## __AWS IoT Greengrass V2__
  - ### Features
    - Documentation updates that improve clarity and fix broken links.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introducing startDate field for CapacityReservation object for the date and time which the reservation started and adding reserved parameter for ModifyCapacityReservation.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Amazon Lex V2 APIs for model building.

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for Amazon Lex V2 APIs for runtime, including Streaming APIs for conversation management.

## __Amazon Redshift__
  - ### Features
    - Update VPC endpoint field names.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for Amazon RDS

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for the ListDocumentFilters API action.

# __1.11.941__ __2021-01-21__
## __AWS Resource Groups Tagging API__
  - ### Features
    - This release adds a new parameter ResourceARNList to Resource Groups Tagging api GetResources api to allow customers retrieve tag data for specific resources.

## __AWS SecurityHub__
  - ### Features
    - This release of ASFF adds a new Action object and a new resource details object - AwsSsmPatchCompliance. It also adds several new attributes for the AwsEc2NetworkInterface resource type.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update all the brokers in the cluster to the specified type.

# __1.11.940__ __2021-01-19__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - ACM Private CA is launching additional certificate templates and API parameters. This allows customers to create custom certificates for their identity and secure communication use cases.

## __Amazon Chime__
  - ### Features
    - Add support for specifying ChimeBearer header as part of the request for Amazon Chime SDK messaging APIs. Documentation updates.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support to include task definition metadata information such as registeredAt, deregisteredAt, registeredBy as part of DescribeTaskDefinition API.

# __1.11.939__ __2021-01-15__
## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

# __1.11.938__ __2021-01-14__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now supports restoring objects from the S3 Intelligent-Tiering Archive Access and Deep Archive Access tiers.

## __Amazon Cognito Identity__
  - ### Features
    - Add Attributes For Access Control support for Amazon Cognito Identity Pools to facilitate access to AWS resources based on attributes from social and corporate identity providers

## __Amazon Pinpoint__
  - ### Features
    - Customers can create segments using 5 new filters. Filters can check for the presence of a substring in attributes and can perform time-based comparisons formatted as ISO_INSTANT datetimes.

## __Amazon SageMaker Service__
  - ### Features
    - This feature allows customers to enable/disable model caching on Multi-Model endpoints.

# __1.11.937__ __2021-01-13__
## __Amazon Fraud Detector__
  - ### Features
    - Added support for cancelling a model version that is TRAINING_IN_PROGRESS.

## __Amazon Personalize__
  - ### Features
    - Miscellaneous updates and improvements to the documentation

# __1.11.936__ __2021-01-12__
## __AWS Audit Manager__
  - ### Features
    - This release introduces tag support for assessment frameworks. You can now add, remove, and get tags from existing frameworks, and specify the tags to apply when creating a custom framework.

## __Amazon AppStream__
  - ### Features
    - Adds support for the Smart Card Redirection feature

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Lightsail__
  - ### Features
    - This release adds IPv6 support for Amazon Lightsail instances, container services, CDN distributions, and load balancers.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager adds pagination support for DescribeDocumentPermission API

# __1.11.935__ __2021-01-11__
## __AWS Key Management Service__
  - ### Features
    - Adds support for filtering grants by grant ID and grantee principal in ListGrants requests to AWS KMS.

## __Amazon Relational Database Service__
  - ### Features
    - This releases adds support for Major Version Upgrades on Aurora MySQL Global Clusters. Customers will be able to upgrade their whole Aurora MySQL Global Cluster to a new major engine version.

# __1.11.934__ __2021-01-07__
## __AWS CodePipeline__
  - ### Features
    - Adding cancelled status and summary for executions aborted by pipeline updates.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for I-Frame-only HLS manifest generation in CMAF outputs.

## __Amazon DevOps Guru__
  - ### Features
    - Add resourceHours field in GetAccountHealth API to show total number of resource hours AWS Dev Ops Guru has done work for in the last hour.

# __1.11.933__ __2021-01-06__
## __AWS Auto Scaling Plans__
  - ### Features
    - Documentation updates for AWS Auto Scaling

## __AWS Transfer Family__
  - ### Features
    - This release adds support for Amazon EFS, so customers can transfer files over SFTP, FTPS and FTP in and out of Amazon S3 as well as Amazon EFS.

## __Auto Scaling__
  - ### Features
    - This update increases the number of instance types that can be added to the overrides within an mixed instances group configuration.

# __1.11.932__ __2021-01-05__
## __AWS Cost Explorer Service__
  - ### Features
    - - ### Features    - Add new GetCostcategories API - Support filter for GetDimensions, GetTags and GetCostcategories api - Support sortBy metrics for GetDimensions, GetTags and GetCostcategories api

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __1.11.931__ __2021-01-04__
## __Amazon CloudSearch__
  - ### Features
    - This release adds support for new Amazon CloudSearch instances.

## __Amazon HealthLake__
  - ### Features
    - Amazon HealthLake now supports exporting data from FHIR Data Stores in Preview.

# __1.11.930__ __2020-12-31__
## __AWS Service Catalog__
  - ### Features
    - Enhanced Service Catalog DescribeProvisioningParameters API to return new parameter constraints, i.e., MinLength, MaxLength, MinValue, MaxValue, ConstraintDescription and AllowedPattern

# __1.11.929__ __2020-12-30__
## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

# __1.11.928__ __2020-12-29__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - This release adds a new parameter "CsrExtensions" in the "CertificateAuthorityConfiguration" data structure, which allows customers to add the addition of KU and SIA into the CA CSR.

## __AmazonApiGatewayV2__
  - ### Features
    - Amazon API Gateway now supports data mapping for HTTP APIs which allows customers to modify HTTP Request before sending it to their integration and HTTP Response before sending it to the invoker.

# __1.11.927__ __2020-12-28__
## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront has deprecated the CreateStreamingDistribution and CreateStreamingDistributionWithTags APIs as part of discontinuing support for Real-Time Messaging Protocol (RTMP) distributions.

# __1.11.926__ __2020-12-23__
## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate optimization recommendations for lambda functions.

## __AWS Database Migration Service__
  - ### Features
    - AWS DMS launches support for AWS Secrets Manager to manage Oracle ASM Database credentials

## __AWS Resource Groups__
  - ### Features
    - Add operation `PutGroupConfiguration`. Support dedicated hosts and add `Pending` in operations `Un/GroupResources`. Add `Resources` in `ListGroupResources` and deprecate `ResourceIdentifiers`.

# __1.11.925__ __2020-12-22__
## __AWS Cost Explorer Service__
  - ### Features
    - This release adds additional metadata that may be applicable to the Rightsizing Recommendations.

## __AWS Glue__
  - ### Features
    - AWS Glue Find Matches machine learning transforms now support column importance scores.

## __AWS IoT Wireless__
  - ### Features
    - Adding the ability to use Fingerprint in GetPartnerAccount and ListPartnerAccounts API responses to protect sensitive customer account information.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed an issue to correctly use Apache Xerces when parsing to all applicable XML documents.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for quick connects. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Relational Database Service__
  - ### Features
    - Adds customer-owned IP address (CoIP) support to Amazon RDS on AWS Outposts.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - SSM Maintenance Window support for registering/updating maintenance window tasks without targets.

# __1.11.924__ __2020-12-21__
## __AWS Batch__
  - ### Features
    - Documentation updates for batch

## __AWS Config__
  - ### Features
    - AWS Config adds support to save advanced queries. New API operations - GetStoredQuery, PutStoredQuery, ListStoredQueries, DeleteStoredQuery

## __AWS Database Migration Service__
  - ### Features
    - AWS DMS launches support for AWS Secrets Manager to manage source and target database credentials.

## __AWS Glue__
  - ### Features
    - Add 4 connection properties: SECRET_ID, CONNECTOR_URL, CONNECTOR_TYPE, CONNECTOR_CLASS_NAME. Add two connection types: MARKETPLACE, CUSTOM

## __AWS Outposts__
  - ### Features
    - In this release, AWS Outposts adds support for three new APIs: TagResource, UntagResource, and ListTagsForResource. Customers can now manage tags for their resources through the SDK.

## __AWS SecurityHub__
  - ### Features
    - Finding providers can now use BatchImportFindings to update Confidence, Criticality, RelatedFindings, Severity, and Types.

## __AWS Service Catalog App Registry__
  - ### Features
    - New API `SyncResouce` to update AppRegistry system tags.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds three new APIs: StartAttachmentUpload, CompleteAttachmentUpload, and GetAttachment. For Amazon Connect Chat, you can use these APIs to share files in chat conversations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds Tag On Create feature support for the AllocateAddress API.

## __Amazon Managed Blockchain__
  - ### Features
    - Added support for provisioning and managing public Ethereum nodes on main and test networks supporting secure access using Sigv4 and standard open-source Ethereum APIs.

## __Amazon QLDB Session__
  - ### Features
    - Adds "TimingInformation" to all SendCommand API results and "IOUsage" to ExecuteStatementResult, FetchPageResult and CommitTransactionResult.

## __Amazon Simple Storage Service__
  - ### Features
    - Format GetObject's Expires header to be an http-date instead of iso8601

## __Service Quotas__
  - ### Features
    - Added the ability to tag applied quotas.

# __1.11.923__ __2020-12-18__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - EBS io2 volumes now supports Multi-Attach

## __Amazon Personalize Runtime__
  - ### Features
    - Updated FilterValues regex pattern to align with Filter Expression.

## __Amazon Relational Database Service__
  - ### Features
    - Adds IAM DB authentication information to the PendingModifiedValues output of the DescribeDBInstances API. Adds ClusterPendingModifiedValues information to the output of the DescribeDBClusters API.

# __1.11.922__ __2020-12-17__
## __AWS Config__
  - ### Features
    - Adding PutExternalEvaluation API which grants permission to deliver evaluation result to AWS Config

## __AWS Key Management Service__
  - ### Features
    - Added CreationDate and LastUpdatedDate timestamps to ListAliases API response

## __AWS Service Catalog__
  - ### Features
    - Support TagOptions sharing with Service Catalog portfolio sharing.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Provide Cross-account copy event based policy support in DataLifecycleManager (DLM)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6gn instances are powered by AWS Graviton2 processors and offer 100 Gbps networking bandwidth. These instances deliver up to 40% better price-performance benefit versus comparable x86-based instances

## __Amazon Route 53__
  - ### Features
    - This release adds support for DNSSEC signing in Amazon Route 53.

## __Amazon Route 53 Resolver__
  - ### Features
    - Route 53 Resolver adds support for enabling resolver DNSSEC validation in virtual private cloud (VPC).

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds queue attributes to enable high throughput FIFO.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for building and distributing container images within EC2 Image Builder.

# __1.11.921__ __2020-12-16__
## __AWS Cost Explorer Service__
  - ### Features
    - This release updates the "MonitorArnList" from a list of String to be a list of Arn for both CreateAnomalySubscription and UpdateAnomalySubscription APIs

## __AWS Step Functions__
  - ### Features
    - Adds support for new additions to ASL including more choice state comparators and result selectors

## __AWS Well-Architected Tool__
  - ### Features
    - This is the first release of AWS Well-Architected Tool API support, use to review your workload and compare against the latest AWS architectural best practices.

## __Amazon Location Service__
  - ### Features
    - Initial release of Amazon Location Service. A new geospatial service providing capabilities to render maps, geocode/reverse geocode, track device locations, and detect geofence entry/exit events.

## __Amazon Prometheus Service__
  - ### Features
    - Documentation updates for Amazon Managed Service for Prometheus

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports connecting to federated data sources of Athena

# __1.11.920__ __2020-12-15__
## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds Kafka Action that allows sending data to Apache Kafka clusters inside a VPC. AWS IoT Device Defender adds custom metrics and machine-learning based anomaly detection.

## __AWS IoT Analytics__
  - ### Features
    - FileFormatConfiguration enables data store to save data in JSON or Parquet format. S3Paths enables you to specify the S3 objects that save your channel messages when you reprocess the pipeline.

## __AWS IoT Core Device Advisor__
  - ### Features
    - AWS IoT Core Device Advisor is fully managed test capability for IoT devices. Device manufacturers can use Device Advisor to test their IoT devices for reliable and secure connectivity with AWS IoT.

## __AWS IoT Fleet Hub__
  - ### Features
    - AWS IoT Fleet Hub, a new feature of AWS IoT Device Management that provides a web application for monitoring and managing device fleets connected to AWS IoT at scale.

## __AWS IoT Greengrass V2__
  - ### Features
    - AWS IoT Greengrass V2 is a new major version of AWS IoT Greengrass. This release adds several updates such as modular components, continuous deployments, and improved ease of use.

## __AWS IoT Wireless__
  - ### Features
    - AWS IoT for LoRaWAN enables customers to setup a private LoRaWAN network by connecting their LoRaWAN devices and gateways to the AWS cloud without managing a LoRaWAN Network Server.

## __AWS Lambda__
  - ### Features
    - Added support for Apache Kafka as a event source. Added support for TumblingWindowInSeconds for streams event source mappings. Added support for FunctionResponseTypes for streams event source mappings

## __Amazon Prometheus Service__
  - ### Features
    - (New Service) Amazon Managed Service for Prometheus is a fully managed Prometheus-compatible monitoring service that makes it easy to monitor containerized applications securely and at scale.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding support for Change Manager API content

# __1.11.919__ __2020-12-14__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for custom routing accelerators

## __Amazon DevOps Guru__
  - ### Features
    - Documentation updates for DevOps Guru.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add c5n.metal to ec2 instance types list

# __1.11.918__ __2020-12-11__
## __AWS CloudTrail__
  - ### Features
    - CloudTrailInvalidClientTokenIdException is now thrown when a call results in the InvalidClientTokenId error code. The Name parameter of the AdvancedEventSelector data type is now optional.

## __AWS IoT SiteWise__
  - ### Features
    - Added the ListAssetRelationships operation and support for composite asset models, which represent structured sets of properties within asset models.

## __AWS Performance Insights__
  - ### Features
    - You can group DB load according to the dimension groups for database, application, and session type. Amazon RDS also supports the dimensions db.name, db.application.name, and db.session_type.name.

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon GuardDuty__
  - ### Features
    - Documentation updates for GuardDuty

## __Auto Scaling__
  - ### Features
    - Documentation updates and corrections for Amazon EC2 Auto Scaling API Reference and SDKs.

# __1.11.917__ __2020-12-10__
## __AWS Network Manager__
  - ### Features
    - This release adds API support for Transit Gateway Connect integration into AWS Network Manager.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports adding synonyms to an index through the new Thesaurus resource.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - TGW connect simplifies connectivity of SD-WAN appliances; IGMP support for TGW multicast; VPC Reachability Analyzer for VPC resources connectivity analysis.

# __1.11.916__ __2020-12-09__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for custom routing accelerators

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G4ad instances powered by AMD Radeon Pro V520 GPUs and AMD 2nd Generation EPYC processors

## __Amazon Redshift__
  - ### Features
    - Add support for availability zone relocation feature.

# __1.11.915__ __2020-12-08__
## __AWS Audit Manager__
  - ### Features
    - AWS Audit Manager helps you continuously audit your AWS usage to simplify how you manage risk and compliance. This update releases the first version of the AWS Audit Manager APIs and SDK.

## __AWSKendraFrontendService__
  - ### Features
    - 1. Amazon Kendra connector for Google Drive repositories 2. Amazon Kendra's relevance ranking models are regularly tuned for each customer by capturing end-user search patterns and feedback.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for configuring cross-region and cross-account replication of your Amazon ECR images.

## __Amazon EMR Containers__
  - ### Features
    - This release adds support for Amazon EMR on EKS, a simple way to run Spark on Kubernetes.

## __Amazon Forecast Service__
  - ### Features
    - This release adds support for the Amazon Forecast Weather Index which can increase forecasting accuracy by automatically including weather forecasts in demand forecasts.

## __Amazon HealthLake__
  - ### Features
    - This release introduces Amazon HealthLake (preview), a HIPAA-eligible service that enables healthcare and life sciences customers to store, transform, query, and analyze health data in the AWS Cloud.

## __Amazon QuickSight__
  - ### Features
    - Added new parameters for join optimization.

## __Amazon SageMaker Runtime__
  - ### Features
    - This feature allows customers to invoke their endpoint with an inference ID. If used and data capture for the endpoint is enabled, this ID will be captured along with request data.

## __Amazon SageMaker Service__
  - ### Features
    - This feature helps you monitor model performance characteristics such as accuracy, identify undesired bias in your ML models, and explain model decisions better with explainability drift detection.

## __Amazon Sagemaker Edge Manager__
  - ### Features
    - Amazon SageMaker Edge Manager makes it easy to optimize, secure, monitor, and maintain  machine learning (ML) models across fleets of edge devices such as smart cameras, smart speakers, and robots.

# __1.11.914__ __2020-12-07__
## __AWS Database Migration Service__
  - ### Features
    - Added PreserveTransaction setting to preserve order of CDC for S3 as target. Added CsvNoSupValue setting to replace empty value for columns not included in the supplemental log for S3 as target.

## __AWS Service Catalog App Registry__
  - ### Features
    - AWS Service Catalog AppRegistry now supports adding, removing, and listing tags on resources after they are created.

# __1.11.913__ __2020-12-04__
## __AWS Directory Service__
  - ### Features
    - Documentation updates for ds - updated descriptions

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports black video and audio silence as new conditions to trigger automatic input failover.

## __AWS Lambda__
  - ### Features
    - Added the additional enum InvalidImage to StateReasonCode and LastUpdateStatusReasonCode fields.

## __AWS License Manager__
  - ### Features
    - Automated Discovery now has support for custom tags, and detects software uninstalls.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces tag-on-create capability for the CreateImage API. A user can now specify tags that will be applied to the new resources (image, snapshots or both), during creation time.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Amazon RDS Cross-Region Automated Backups, the ability to setup automatic replication of snapshots and transaction logs from a primary AWS Region to a secondary AWS Region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Patch Manager MAC OS Support and OpsMetadata Store APIs to store operational metadata for an Application.

## __Amazon WorkSpaces__
  - ### Features
    - Update the import-workspace-image API to have "BYOL_REGULAR_WSP" as a valid input string for ingestion-process.

## __Managed Streaming for Kafka__
  - ### Features
    - Adding HEALING to ClusterState.

# __1.11.912__ __2020-12-03__
## __AWS Batch__
  - ### Features
    - This release adds support for customer to run Batch Jobs on ECS Fargate, the serverless compute engine built for containers on AWS. Customer can also propagate Job and Job Definition Tags to ECS Task.

## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate optimization recommendations for EBS volumes that are attached to instances.

## __AWS License Manager__
  - ### Features
    - AWS License Manager enables managed entitlements for AWS customers and Software Vendors (ISV). You can track and distribute license entitlements from AWS Marketplace and supported ISVs.

## __AmplifyBackend__
  - ### Features
    - Regular documentation updates.

# __1.11.911__ __2020-12-01__
## __Amazon Connect Customer Profiles__
  - ### Features
    - This is the first release of Amazon Connect Customer Profiles, a unified customer profile for your Amazon Connect contact center.

  - ### Bugfixes
    - Removed 'AmazonProfileClient', which was released with the incorrect name.

# __1.11.910__ __2020-12-01__
## __AWS Directory Service__
  - ### Features
    - Adding client authentication feature for AWS AD Connector

## __AWS Lambda__
  - ### Features
    - This release includes support for a new feature: Container images support in AWS Lambda. This adds APIs for deploying functions as container images. AWS Lambda now supports memory up to 10240MB.

## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service (in preview release) enables you to configure and reuse connections to external applications.

## __Amazon Connect Contact Lens__
  - ### Features
    - Contact Lens for Amazon Connect analyzes conversations, both real-time and post-call. The ListRealtimeContactAnalysisSegments API returns a list of analysis segments for a real-time analysis session.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This is the first release of Amazon Connect Customer Profiles, a unified customer profile for your Amazon Connect contact center.

## __Amazon Connect Service__
  - ### Features
    - This release adds an Amazon Connect API that provides the ability to create tasks, and a set of APIs (in preview) to configure AppIntegrations associations with Amazon Connect instances.

## __Amazon DevOps Guru__
  - ### Features
    - (New Service) Amazon DevOps Guru is available in public preview. It's a fully managed service that uses machine learning to analyze your operational solutions to help you find and troubleshoot issues.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for: EBS gp3 volumes; and D3/D3en/R5b/M5zn instances powered by Intel Cascade Lake CPUs

## __Amazon Elastic Container Registry Public__
  - ### Features
    - Supports Amazon Elastic Container Registry (Amazon ECR) Public, a fully managed registry that makes it easy for a developer to publicly share container software worldwide for anyone to download.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now allows you to define and manage the lifecycle for Kubernetes add-ons for your clusters. This release adds support for the AWS VPC CNI (vpc-cni).

## __Amazon Honeycode__
  - ### Features
    - Introducing APIs to read and write directly from Honeycode tables. Use APIs to pull table and column metadata, then use the read and write APIs to programmatically read and write from the tables.

## __Amazon Lookout for Vision__
  - ### Features
    - This release introduces support for Amazon Lookout for Vision.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - This release adds support for Amazon SageMaker Feature Store, which makes it easy for customers to create, version, share, and manage curated data for machine learning (ML) development.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Pipelines for ML workflows. Amazon SageMaker Feature Store, a fully managed repository for ML features.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 adds support for multiple-destination replication, option to sync replica modifications;  S3 Bucket Keys to reduce cost of S3 SSE with AWS KMS

## __AmplifyBackend__
  - ### Features
    - (New Service) The Amplify Admin UI offers an accessible way to develop app backends and manage app content. We recommend that you use the Amplify Admin UI to manage the backend of your Amplify app.

# __1.11.909__ __2020-12-01__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces Amazon EC2 Mac1 instances, a new Amazon EC2 instance family built on Apple Mac mini computers, powered by AWS Nitro System, and support running macOS workloads on Amazon EC2

# __1.11.908__ __2020-11-24__
## __AWS Batch__
  - ### Features
    - Add Ec2Configuration in ComputeEnvironment.ComputeResources. Use in CreateComputeEnvironment API to enable AmazonLinux2 support.

## __AWS CloudFormation__
  - ### Features
    - Adds support for the new Modules feature for CloudFormation. A module encapsulates one or more resources and their respective configurations for reuse across your organization.

## __AWS CloudTrail__
  - ### Features
    - CloudTrail now includes advanced event selectors, which give you finer-grained control over the events that are logged to your trail.

## __AWS CodeBuild__
  - ### Features
    - Adding GetReportGroupTrend API for Test Reports.

## __AWS Elastic Beanstalk__
  - ### Features
    - Updates the Integer constraint of DescribeEnvironmentManagedActionHistory's MaxItems parameter to [1, 100].

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for Vorbis and Opus audio in OGG/OGA containers.

## __AWS IoT SiteWise__
  - ### Features
    - This release adds support for customer managed customer master key (CMK) based encryption in IoT SiteWise.

## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for Synchronous Express Workflows

## __Amazon Appflow__
  - ### Features
    - Upsolver as a destination connector and documentation update.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds ability to configure Cognito User Pools with third party sms and email providers for sending notifications to users.

## __Amazon Comprehend__
  - ### Features
    - Support Comprehend events detection APIs

## __Amazon FSx__
  - ### Features
    - This release adds the capability to increase storage capacity of Amazon FSx for Lustre file systems, providing the flexibility to meet evolving storage needs over time.

## __Amazon GameLift__
  - ### Features
    - GameLift FlexMatch is now available as a standalone matchmaking solution. FlexMatch now provides customizable matchmaking for games hosted peer-to-peer, on-premises, or on cloud compute primitives.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports es-419, de-DE locales

## __Amazon QuickSight__
  - ### Features
    - Support for embedding without user registration. New enum EmbeddingIdentityType. A potential breaking change. Affects code that refers IdentityType enum type directly instead of literal string value.

## __Amazon Timestream Write__
  - ### Features
    - Adds support of upserts for idempotent updates to Timestream.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe Medical streaming added medical specialties and HTTP/2 support. Amazon Transcribe streaming supports additional languages. Both support OGG/OPUS and FLAC codecs for streaming.

## __AmazonMWAA__
  - ### Features
    - (New Service) Amazon MWAA is a managed service for Apache Airflow that makes it easy for data engineers and data scientists to execute data processing workflows in the cloud.

# __1.11.907__ __2020-11-23__
## __AWS CodeStar connections__
  - ### Features
    - Added support for the UpdateHost API.

## __AWS Glue__
  - ### Features
    - Feature1 - Glue crawler adds data lineage configuration option. Feature2 - AWS Glue Data Catalog adds APIs for PartitionIndex creation and deletion as part of Enhancement Partition Management feature.

## __AWS IoT__
  - ### Features
    - This release enables users to identify different file types in the over-the-air update (OTA) functionality using fileType parameter for CreateOTAUpdate API

## __AWS Lambda__
  - ### Features
    - This release includes support for new feature: Code Signing for AWS Lambda. This adds new resources and APIs to configure Lambda functions to accept and verify signed code artifacts at deployment.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now provides the ability for license administrators to be able to associate license configurations to AMIs shared with their AWS account

## __AWS Outposts__
  - ### Features
    - Support specifying tags during the creation of the Outpost resource. Tags are now returned in the response body of Outpost APIs.

## __AWS SecurityHub__
  - ### Features
    - Updated the account management API to support the integration with AWS Organizations. Added new methods to allow users to view and manage the delegated administrator account for Security Hub.

## __AWS Signer__
  - ### Features
    - AWS Signer is launching code-signing for AWS Lambda. Now customers can cryptographically sign Lambda code to ensure trust, integrity, and functionality.

## __AWS Single Sign-On Admin__
  - ### Features
    - AWS Single Sign-On now enables attribute-based access control for workforce identities to simplify permissions in AWS

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Add Detected Workload to ApplicationComponent which shows the workloads that installed in the component

## __Amazon DynamoDB__
  - ### Features
    - With this release, you can capture data changes in any Amazon DynamoDB table as an Amazon Kinesis data stream. You also can use PartiQL (SQL-compatible language) to manipulate data in DynamoDB tables.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for updating capacity providers, specifying custom instance warmup periods for capacity providers, and using deployment circuit breaker for your ECS Services.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Multiple Private DNS names to DescribeVpcEndpointServices response.

## __Amazon Elastic MapReduce__
  - ### Features
    - Add API support for EMR Studio, a new notebook-first IDE for data scientists and data engineers with single sign-on, Jupyter notebooks, automated infrastructure provisioning, and job diagnosis.

## __Amazon Forecast Service__
  - ### Features
    - Releasing the set of PredictorBacktestExportJob APIs which allow customers to export backtest values and item-level metrics data from Predictor training.

## __Amazon Timestream Query__
  - ### Features
    - Amazon Timestream now supports "QueryStatus" in Query API which has information about cumulative bytes scanned, metered, as well as progress percentage for the query.

## __Amazon Translate__
  - ### Features
    - This update adds new operations to create and manage parallel data in Amazon Translate. Parallel data is a resource that you can use to run Active Custom Translation jobs.

## __Auto Scaling__
  - ### Features
    - Documentation updates and corrections for Amazon EC2 Auto Scaling API Reference and SDKs.

## __CodeArtifact__
  - ### Features
    - Add support for the NuGet package format.

## __Managed Streaming for Kafka__
  - ### Features
    - Adding MAINTENANCE and REBOOTING_BROKER to Cluster states.

# __1.11.906__ __2020-11-20__
## __AWS App Mesh__
  - ### Features
    - This release makes tag value a required attribute of the tag's key-value pair.

## __AWS CloudHSM V2__
  - ### Features
    - Added managed backup retention, a feature that enables customers to retain backups for a configurable period after which CloudHSM service will automatically delete them.

## __AWS Service Catalog App Registry__
  - ### Features
    - AWS Service Catalog AppRegistry Documentation update

## __Amazon Chime__
  - ### Features
    - The Amazon Chime SDK for messaging provides the building blocks needed to build chat and other real-time collaboration features.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - This release supports tagging repository association resources in Amazon CodeGuru Reviewer.

## __Amazon Cognito Identity__
  - ### Features
    - Added SDK pagination support for ListIdentityPools

## __Amazon Connect Service__
  - ### Features
    - This release adds a set of Amazon Connect APIs to programmatically control instance creation, modification, description and deletion.

## __Amazon Macie 2__
  - ### Features
    - The Amazon Macie API now provides S3 bucket metadata that indicates whether any one-time or recurring classification jobs are configured to analyze data in a bucket.

## __Amazon Simple Storage Service__
  - ### Features
    - Add new documentation regarding automatically generated Content-MD5 headers when using the SDK or CLI.

## __Managed Streaming for Kafka__
  - ### Features
    - This release adds support for PER TOPIC PER PARTITION monitoring on AWS MSK clusters.

# __1.11.905__ __2020-11-19__
## __AWS Cost Explorer Service__
  - ### Features
    - Additional metadata that may be applicable to the recommendation.

## __AWS Directory Service__
  - ### Features
    - Adding multi-region replication feature for AWS Managed Microsoft AD

## __AWS Elemental MediaLive__
  - ### Features
    - The AWS Elemental MediaLive APIs and SDKs now support the ability to see the software update status on Link devices

## __AWS Glue__
  - ### Features
    - Adding support for Glue Schema Registry. The AWS Glue Schema Registry is a new feature that allows you to centrally discover, control, and evolve data stream schemas.

## __AWS Lambda__
  - ### Features
    - Added the starting position and starting position timestamp to ESM Configuration. Now customers will be able to view these fields for their ESM.

## __Amazon CloudWatch Events__
  - ### Features
    - EventBridge now supports Resource-based policy authorization on event buses. This enables cross-account PutEvents API calls, creating cross-account rules, and simplifies permission management.

## __Amazon EventBridge__
  - ### Features
    - EventBridge now supports Resource-based policy authorization on event buses. This enables cross-account PutEvents API calls, creating cross-account rules, and simplifies permission management.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Data Analytics now supports building and running streaming applications using Apache Flink 1.11 and provides a way to access the Apache Flink dashboard for supported Flink versions.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex supports managing input and output contexts as well as default values for slots.

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports the ability to view and manage active contexts associated with a user session.

## __Amazon Redshift__
  - ### Features
    - Amazon Redshift support for returning ClusterNamespaceArn in describeClusters

## __Auto Scaling__
  - ### Features
    - You can now create Auto Scaling groups with multiple launch templates using a mixed instances policy, making it easy to deploy an AMI with an architecture that is different from the rest of the group.

# __1.11.904__ __2020-11-18__
## __AWS Backup__
  - ### Features
    - AWS Backup now supports cross-account backup, enabling AWS customers to securely copy their backups across their AWS accounts within their AWS organizations.

## __AWS CloudFormation__
  - ### Features
    - This release adds ChangeSets support for Nested Stacks. ChangeSets offer a preview of how proposed changes to a stack might impact existing resources or create new ones.

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild - Adding Status field for Report Group

## __AWS Outposts__
  - ### Features
    - Mark the Name parameter in CreateOutpost as required.

## __AWS S3 Control__
  - ### Features
    - AWS S3 Storage Lens provides visibility into your storage usage and activity trends at the organization or account level, with aggregations by Region, storage class, bucket, and prefix.

## __Amazon ElastiCache__
  - ### Features
    - Adding Memcached 1.6 to parameter family

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Fleet adds support of DeleteFleets API for instant type fleets. Now you can delete an instant type fleet and terminate all associated instances with a single API call.

# __1.11.903__ __2020-11-17__
## __AWS Network Firewall__
  - ### Features
    - (New Service) AWS Network Firewall is a managed network layer firewall service that makes it easy to secure your virtual private cloud (VPC) networks and block malicious traffic.

## __AWS SDK for Java__
  - ### Bugfixes
    - Upgraded Jackson-databind dependency to 2.6.7.4

## __Amazon Chime__
  - ### Features
    - This release adds CRUD APIs for Amazon Chime SipMediaApplications and SipRules. It also adds the API for creating outbound PSTN calls for Amazon Chime meetings.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for user hierarchy group and user hierarchy structure. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Macie 2__
  - ### Features
    - The Amazon Macie API now has a lastRunErrorStatus property to indicate if account- or bucket-level errors occurred during the run of a one-time classification job or the latest run of a recurring job.

## __Amazon Relational Database Service__
  - ### Features
    - Support copy-db-snapshot in the one region on cross clusters and local cluster for RDSonVmware. Add target-custom-availability-zone parameter to specify where a snapshot should be copied.

## __Firewall Management Service__
  - ### Features
    - Added Firewall Manager policy support for AWS Network Firewall resources.

# __1.11.902__ __2020-11-16__
## __AWS CodePipeline__
  - ### Features
    - We show details about inbound executions and id of action executions in GetPipelineState API. We also add ConflictException to StartPipelineExecution, RetryStageExecution, StopPipelineExecution APIs.

## __AWS Database Migration Service__
  - ### Features
    - Adding MoveReplicationTask feature to move replication tasks between instances

## __AWS IoT Secure Tunneling__
  - ### Features
    - Support using multiple data streams per tunnel using the Secure Tunneling multiplexing feature.

## __AWS IoT SiteWise__
  - ### Features
    - This release supports Unicode characters for string operations in formulae computes in SiteWise. For more information, search for SiteWise in Amazon What's new or refer the SiteWise documentation.

## __AWS Service Catalog__
  - ### Features
    - Support import of CloudFormation stacks into Service Catalog provisioned products.

## __Amazon QuickSight__
  - ### Features
    - Adding new parameters for dashboard persistence

## __Amazon SNS__
  - ### Bugfixes
    - Fix `SnsMessageManager` to use proper certificate name for HKG and BAH region.

## __Amazon SageMaker Service__
  - ### Features
    - This feature enables customers to encrypt their Amazon SageMaker Studio storage volumes with customer master keys (CMKs) managed by them in AWS Key Management Service (KMS).

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

## __Synthetics__
  - ### Features
    - AWS Synthetics now supports Environment Variables  to assign runtime parameters in the canary scripts.

# __1.11.901__ __2020-11-13__
## __AWS Shield__
  - ### Features
    - This release adds APIs for two new features: 1) Allow customers to bundle resources into protection groups and treat as a single unit. 2) Provide per-account event summaries to all AWS customers.

## __Amazon Textract__
  - ### Features
    - AWS Textract now allows customers to specify their own KMS key to be used for asynchronous jobs output results, AWS Textract now also recognizes handwritten text from English documents.

## __Elastic Load Balancing__
  - ### Features
    - Adds dualstack support for Network Load Balancers (TCP/TLS only), an attribute for WAF fail open for Application Load Balancers, and an attribute for connection draining for Network Load Balancers.

# __1.11.900__ __2020-11-12__
## __AWS IoT__
  - ### Features
    - This release adds a batchMode parameter to the IotEvents, IotAnalytics, and Firehose actions which allows customers to send an array of messages to the corresponding services

## __AWS RoboMaker__
  - ### Features
    - This release introduces Robomaker Worldforge TagsOnCreate which allows customers to tag worlds as they are being generated by providing the tags while configuring a world generation job.

## __AWS Service Catalog App Registry__
  - ### Features
    - AWS Service Catalog AppRegistry provides a repository of your applications, their resources, and the application metadata that you use within your enterprise.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports es-ES, it-IT, fr-FR and fr-CA locales

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Amazon Lightsail container services. You can now create a Lightsail container service, and deploy Docker images to it.

## __Amazon Personalize Runtime__
  - ### Features
    - Adds support to use dynamic filters with Personalize.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new Australian English female voice - Olivia. Olivia is available as Neural voice only.

# __1.11.899__ __2020-11-11__
## __AWS Amplify__
  - ### Features
    - Whereas previously custom headers were set via the app's buildspec, custom headers can now be set directly on the Amplify app for both ci/cd and manual deploy apps.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for Automated ABR encoding and improved the reliability of embedded captions in accelerated outputs.

## __AWS Glue DataBrew__
  - ### Features
    - This is the initial SDK release for AWS Glue DataBrew. DataBrew is a visual data preparation tool that enables users to clean and normalize data without writing any code.

## __AWS Service Catalog__
  - ### Features
    - Adding support to remove a Provisioned Product launch role via UpdateProvisionedProductProperties

## __Amazon Forecast Service__
  - ### Features
    - Providing support of custom quantiles in CreatePredictor API.

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports Column-level security and connecting to Oracle data source.

# __1.11.898__ __2020-11-10__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Gateway Load Balancer VPC endpoints and VPC endpoint services

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add SessionId as a filter for DescribeSessions API

## __Auto Scaling__
  - ### Features
    - Documentation updates and corrections for Amazon EC2 Auto Scaling API Reference and SDKs.

## __Elastic Load Balancing__
  - ### Features
    - Added support for Gateway Load Balancers, which make it easy to deploy, scale, and run third-party virtual networking appliances.

# __1.11.897__ __2020-11-09__
## __AWS DataSync__
  - ### Features
    - DataSync now enables customers to adjust the network bandwidth used by a running AWS DataSync task.

## __AWS IoT Analytics__
  - ### Features
    - AWS IoT Analytics now supports Late Data Notifications for datasets, dataset content creation using previous version IDs, and includes the LastMessageArrivalTime attribute for channels and datastores.

## __AWS Storage Gateway__
  - ### Features
    - Added bandwidth rate limit schedule for Tape and Volume Gateways

## __Amazon DynamoDB__
  - ### Features
    - This release adds supports for exporting Amazon DynamoDB table data to Amazon S3 to perform analytics at any scale.

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides native support for specifying Amazon FSx for Windows File Server file systems as volumes in your Amazon ECS task definitions.

## __Amazon Elasticsearch Service__
  - ### Features
    - Adding support for package versioning in Amazon Elasticsearch Service

## __Amazon FSx__
  - ### Features
    - This release adds support for creating DNS aliases for Amazon FSx for Windows File Server, and using AWS Backup to automate scheduled, policy-driven backup plans for Amazon FSx file systems.

## __Amazon Macie 2__
  - ### Features
    - Sensitive data findings in Amazon Macie now include enhanced location data for Apache Avro object containers and Apache Parquet files.

## __Amazon S3__
  - ### Features
    - S3 Intelligent-Tiering adds support for Archive and Deep Archive Access tiers; S3 Replication adds replication metrics and failure notifications, brings feature parity for delete marker replication.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Intelligent-Tiering adds support for Archive and Deep Archive Access tiers; S3 Replication adds replication metrics and failure notifications, brings feature parity for delete marker replication

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - add a new filter to allow customer to filter automation executions by using resource-group which used for execute automation

# __1.11.896__ __2020-11-06__
## __AWS Elemental MediaLive__
  - ### Features
    - Support for SCTE35 ad markers in OnCuePoint style in RTMP outputs.

## __AWS IoT SiteWise__
  - ### Features
    - Remove the CreatePresignedPortalUrl API

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Amazon Data Lifecycle Manager now supports the creation and retention of EBS-backed Amazon Machine Images

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Network card support with four new attributes: NetworkCardIndex, NetworkPerformance, DefaultNetworkCardIndex, and MaximumNetworkInterfaces, added to the DescribeInstanceTypes API.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for Systems Manager

# __1.11.895__ __2020-11-05__
## __AWS App Mesh__
  - ### Features
    - This release adds circuit breaking capabilities to your mesh with connection pooling and outlier detection support.

## __AWS Lambda__
  - ### Features
    - Support Amazon MQ as an Event Source.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports providing user context in your query requests, Tokens can be JSON or JWT format. This release also introduces support for Confluence cloud datasources.

## __Amazon CloudWatch Events__
  - ### Features
    - With this release, customers can now reprocess past events by storing the events published on event bus in an encrypted archive.

## __Amazon DynamoDB__
  - ### Features
    - This release adds a new ReplicaStatus INACCESSIBLE_ENCRYPTION_CREDENTIALS for the Table description, indicating when a key used to encrypt a regional replica table is not accessible.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now provides the ability to define a custom endpoint for your domain and link an SSL certificate from ACM, making it easier to refer to Kibana and the domain endpoint.

## __Amazon EventBridge__
  - ### Features
    - With this release, customers can now reprocess past events by storing the events published on event bus in an encrypted archive.

## __Amazon Fraud Detector__
  - ### Features
    - Added support for deleting resources like Variables, ExternalModels, Outcomes, Models, ModelVersions, Labels, EventTypes and EntityTypes. Updated DeleteEvent operation to catch missing exceptions.

## __Amazon Relational Database Service__
  - ### Features
    - Supports a new parameter to set the max allocated storage in gigabytes for the CreateDBInstanceReadReplica API.

# __1.11.894__ __2020-11-04__
## __AWS IoT__
  - ### Features
    - Updated API documentation and added paginator for AWS Iot Registry ListThingPrincipals API.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog API ListPortfolioAccess can now support a maximum PageSize of 100.

## __AWS X-Ray__
  - ### Features
    - Releasing new APIs GetInsightSummaries, GetInsightEvents, GetInsight, GetInsightImpactGraph and updating GetTimeSeriesServiceStatistics API for AWS X-Ray Insights feature

## __AWSMarketplace Metering__
  - ### Features
    - Adding Vendor Tagging Support in MeterUsage and BatchMeterUsage API.

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for Client Connect Handler for AWS Client VPN. Fleet supports launching replacement instances in response to Capacity Rebalance recommendation.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports native SAML authentication that seamlessly integrates with the customers' existing SAML 2.0 Identity Provider (IdP).

## __Amazon Transcribe Streaming Service__
  - ### Features
    - With this release, Amazon Transcribe now supports real-time transcription from audio sources in Italian (it-IT) and German(de-DE).

## __AmazonMQ__
  - ### Features
    - Amazon MQ introduces support for RabbitMQ, a popular message-broker with native support for AMQP 0.9.1. You can now create fully-managed RabbitMQ brokers in the cloud.

## __Auto Scaling__
  - ### Features
    - Capacity Rebalance helps you manage and maintain workload availability during Spot interruptions by proactively augmenting your Auto Scaling group with a new instance before interrupting an old one.

# __1.11.893__ __2020-11-02__
## __AWS SDK for Java__
  - ### Features
    - Upgrade Apache version to `4.5.13`.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for the following features: 1. P4d instances based on NVIDIA A100 GPUs.  2. NetworkCardIndex attribute to support multiple network cards.

# __1.11.892__ __2020-10-30__
## __AWS Database Migration Service__
  - ### Features
    - Adding DocDbSettings to support DocumentDB as a source.

## __AWS Elemental MediaLive__
  - ### Features
    - Support for HLS discontinuity tags in the child manifests. Support for incomplete segment behavior in the media output. Support for automatic input failover condition settings.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for AWS ElastiCache

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds an eqExactMatch operator for filtering findings. With this operator you can increase the precision of your finding filters and suppression rules.

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS

## __Braket__
  - ### Features
    - This release supports tagging for Amazon Braket quantum-task resources. It also supports tag-based access control for quantum-task APIs.

## __EC2 Image Builder__
  - ### Features
    - This feature increases the number of accounts that can be added to the Launch permissions within an Image Builder Distribution configuration.

# __1.11.891__ __2020-10-29__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Documentation updates for marketplacecommerceanalytics to specify four data sets which are deprecated.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for access based enumeration on SMB file shares, file share visibility on SMB file shares, and file upload notifications for all file shares

## __Amazon API Gateway__
  - ### Features
    - Support disabling the default execute-api endpoint for REST APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support for Appliance mode on Transit Gateway that simplifies deployment of stateful network appliances. Added support for AWS Client VPN Self-Service Portal.

## __Amazon Simple Email Service__
  - ### Features
    - This release enables customers to manage their own contact lists and end-user subscription preferences.

## __CodeArtifact__
  - ### Features
    - Add support for tagging of CodeArtifact domain and repository resources.

## __Elastic Load Balancing__
  - ### Features
    - Application Load Balancer (ALB) now supports the gRPC protocol-version. With this release, customers can use ALB to route and load balance gRPC traffic between gRPC enabled clients and microservices.

# __1.11.890__ __2020-10-28__
## __AWS IoT__
  - ### Features
    - This release adds support for GG-Managed Job Namespace

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS Nitro Enclaves general availability. Added support to RunInstances for creating enclave-enabled EC2 instances. New APIs to associate an ACM certificate with an IAM role, for enclave consumption.

## __Amazon WorkMail__
  - ### Features
    - Documentation update for Amazon WorkMail

# __1.11.889__ __2020-10-27__
## __AWS Glue__
  - ### Features
    - AWS Glue machine learning transforms now support encryption-at-rest for labels and trained models.

# __1.11.888__ __2020-10-26__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports indexing data from Confluence Server.

## __Amazon Neptune__
  - ### Features
    - This feature enables custom endpoints for Amazon Neptune clusters. Custom endpoints simplify connection management when clusters contain instances with different capacities and configuration settings.

## __Amazon SageMaker Service__
  - ### Features
    - This release enables customers to bring custom images for use with SageMaker Studio notebooks.

# __1.11.887__ __2020-10-23__
## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports ad marker passthrough for HLS. Use AdMarkerPassthrough to pass EXT-X-CUE-IN, EXT-X-CUE-OUT, and EXT-X-SPLICEPOINT-SCTE35 from origin manifests into personalized manifests.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

## __Amazon QuickSight__
  - ### Features
    - Support description on columns.

# __1.11.886__ __2020-10-22__
## __AWS Service Catalog__
  - ### Features
    - Documentation updates for servicecatalog

## __Access Analyzer__
  - ### Features
    - API Documentation updates for IAM Access Analyzer.

## __Amazon Appflow__
  - ### Features
    - Salesforce connector creation with customer provided client id and client secret, incremental pull configuration, salesforce upsert write operations and execution ID when on-demand flows are executed.

## __Amazon Simple Notification Service__
  - ### Features
    - SNS now supports a new class of topics: FIFO (First-In-First-Out). FIFO topics provide strictly-ordered, deduplicated, filterable, encryptable, many-to-many messaging at scale.

# __1.11.885__ __2020-10-21__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for specifying port overrides on AWS Global Accelerator endpoint groups.

## __AWS Glue__
  - ### Features
    - AWS Glue crawlers now support incremental crawls for the Amazon Simple Storage Service (Amazon S3) data source.

## __AWS Organizations__
  - ### Features
    - AWS Organizations renamed the 'master account' to 'management account'.

## __AWSKendraFrontendService__
  - ### Features
    - This release adds custom data sources: a new data source type that gives you full control of the documents added, modified or deleted during a data source sync while providing run history metrics.

## __Amazon CloudFront__
  - ### Features
    - CloudFront adds support for managing the public keys for signed URLs and signed cookies directly in CloudFront (it no longer requires the AWS root account).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - instance-storage-info nvmeSupport added to DescribeInstanceTypes API

# __1.11.884__ __2020-10-20__
## __AWS AppSync__
  - ### Features
    - Documentation updates to AppSync to correct several typos.

## __AWS Batch__
  - ### Features
    - Adding evaluateOnExit to job retry strategies.

## __AWS Elastic Beanstalk__
  - ### Features
    - EnvironmentStatus enum update to include Aborting, LinkingFrom and LinkingTo

# __1.11.883__ __2020-10-19__
## __AWS Backup__
  - ### Features
    - Documentation updates for Cryo

## __AWS Service Catalog__
  - ### Features
    - An Admin can now update the launch role associated with a Provisioned Product. Admins and End Users can now view the launch role associated with a Provisioned Product.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for Origin Shield.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Documentation updates for docdb

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release now supports Common Vulnerabilities and Exposure (CVE) Ids for missing packages via the DescribeInstancePatches API.

# __1.11.882__ __2020-10-16__
## __AWS Elemental MediaLive__
  - ### Features
    - The AWS Elemental MediaLive APIs and SDKs now support the ability to transfer the ownership of MediaLive Link devices across AWS accounts.

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations.

# __1.11.881__ __2020-10-15__
## __AWS Budgets__
  - ### Features
    - This release introduces AWS Budgets Actions, allowing you to define an explicit response(or set of responses)  to take when your budget exceeds it's action threshold.

## __AWS Cost Explorer Service__
  - ### Features
    - This release improves email validation for subscriptions on the SDK endpoints.

## __AWS Database Migration Service__
  - ### Features
    - When creating Endpoints, Replication Instances, and Replication Tasks, the feature provides you the option to specify friendly name to the resources.

## __AWS Glue__
  - ### Features
    - API Documentation updates for Glue Get-Plan API

## __AWS Ground Station__
  - ### Features
    - Adds error message attribute to DescribeContact DataflowDetails

## __AWS IoT__
  - ### Features
    - Add new variable, lastStatusChangeDate, to DescribeDomainConfiguration  API

## __AWS Transfer Family__
  - ### Features
    - Add support to associate VPC Security Groups at server creation.

## __AWS X-Ray__
  - ### Features
    - Enhancing CreateGroup, UpdateGroup, GetGroup and GetGroups APIs to support configuring X-Ray Insights Notifications. Adding TraceLimit information into X-Ray BatchGetTraces API response.

## __Access Analyzer__
  - ### Features
    - This release adds support for the ApplyArchiveRule api in IAM Access Analyzer.  The ApplyArchiveRule api allows users to apply an archive rule retroactively to existing findings in an analyzer.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for pausing and resuming classification jobs. Also, sensitive data findings now include location data for up to 15 occurrences of sensitive data.

## __Amazon Rekognition__
  - ### Features
    - This SDK Release introduces new API (DetectProtectiveEquipment) for Amazon Rekognition. This release also adds ServiceQuotaExceeded exception to Amazon Rekognition IndexFaces API.

## __Amazon Relational Database Service__
  - ### Features
    - Return tags for all resources in the output of DescribeDBInstances, DescribeDBSnapshots, DescribeDBClusters, and DescribeDBClusterSnapshots API operations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release now supports searching for available packages from Amazon Linux and Amazon Linux 2 via the DescribeAvailablePatches API.

## __Amazon WorkMail__
  - ### Features
    - Add CreateOrganization and DeleteOrganization API operations.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for WorkSpaces

# __1.11.880__ __2020-10-09__
## __AWS Amplify__
  - ### Features
    - Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval - enabling can make code changes can take up to 10 minutes to roll out.

## __AWS Elemental MediaLive__
  - ### Features
    - WAV audio output. Extracting ancillary captions in MP4 file inputs. Priority on channels feeding a multiplex (higher priority channels will tend to have higher video quality).

## __AWS Service Catalog__
  - ### Features
    - This new API takes either a ProvisonedProductId or a ProvisionedProductName, along with a list of 1 or more output keys and responds with the (key,value) pairs of those outputs.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release introduces a new Amazon EKS error code: "ClusterUnreachable"

## __Amazon Import/Export Snowball__
  - ### Features
    - We added new APIs to allow customers to better manage their device shipping. You can check if your shipping label expired, generate a new label, and tell us that you received or shipped your job.

# __1.11.879__ __2020-10-08__
## __AWS Cost Explorer Service__
  - ### Features
    - You can now create hierarchical cost categories by choosing "Cost Category" as a dimension. You can also track the status of your cost category updates to your cost and usage information.

## __Amazon CloudWatch Events__
  - ### Features
    - Amazon EventBridge (formerly called CloudWatch Events) adds support for target Dead-letter Queues and custom retry policies.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS EC2 RevokeSecurityGroupIngress and RevokeSecurityGroupEgress APIs will return IpPermissions which do not match with any existing IpPermissions for security groups in default VPC and EC2-Classic.

## __Amazon EventBridge__
  - ### Features
    - Amazon EventBridge adds support for target Dead Letter Queues (DLQs) and custom retry policies.

## __Amazon Rekognition__
  - ### Features
    - This release provides location information for the manifest validation files.

## __Amazon Relational Database Service__
  - ### Features
    - Supports a new parameter to set the max allocated storage in gigabytes for restore database instance from S3 and restore database instance to a point in time APIs.

## __Amazon SageMaker Service__
  - ### Features
    - This release enables Sagemaker customers to convert Tensorflow and PyTorch models to CoreML (ML Model) format.

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for SNS.

# __1.11.878__ __2020-10-07__
## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze EC2 instance-level EBS read and write operations, and throughput when generating recommendations for your EC2 instances and Auto Scaling groups.

## __AWS Cost Explorer Service__
  - ### Features
    - Enables Rightsizing Recommendations to analyze and present EC2 instance-level EBS metrics when generating recommendations. Returns AccessDeniedException if the account is not opted into Rightsizing

## __AWS Elemental MediaPackage__
  - ### Features
    - AWS Elemental MediaPackage provides access logs that capture detailed information about requests sent to a customer's MediaPackage channel.

## __Amazon ElastiCache__
  - ### Features
    - This release introduces User and UserGroup to allow customers to have access control list of the Redis resources for AWS ElastiCache. This release also adds support for Outposts  for AWS ElastiCache.

# __1.11.877__ __2020-10-06__
## __AWS Database Migration Service__
  - ### Features
    - Added new S3 endpoint settings to allow partitioning CDC data by date for S3 as target. Exposed some Extra Connection Attributes as endpoint settings for relational databases as target.

## __AWS Marketplace Catalog Service__
  - ### Features
    - AWS Marketplace Catalog now supports FailureCode for change workflows to help differentiate client errors and server faults.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports returning additional information about local gateway virtual interfaces, and virtual interface groups.

## __Amazon Kinesis Analytics__
  - ### Features
    - Amazon Kinesis Analytics now supports StopApplication with 'force' option

# __1.11.876__ __2020-10-05__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for AVC-I and VC3 encoding in the MXF OP1a container, Nielsen non-linear watermarking, and InSync FrameFormer frame rate conversion.

## __AWS Glue__
  - ### Features
    - AWS Glue crawlers now support Amazon DocumentDB (with MongoDB compatibility) and MongoDB collections. You can choose to crawl the entire data set or only a small sample to reduce crawl time.

## __Amazon DynamoDB__
  - ### Features
    - This release adds a new ReplicaStatus REGION DISABLED for the Table description. This state indicates that the AWS Region for the replica is inaccessible because the AWS Region is disabled.

## __Amazon DynamoDB Streams__
  - ### Features
    - Documentation updates for streams.dynamodb

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for launching Amazon SageMaker Studio in your VPC. Use AppNetworkAccessType in CreateDomain API to disable access to public internet and restrict the network traffic to VPC.

# __1.11.875__ __2020-10-02__
## __AWS Batch__
  - ### Features
    - Support tagging for Batch resources (compute environment, job queue, job definition and job) and tag based access control on Batch APIs

## __AWS Cloud Map__
  - ### Features
    - Added support for optional parameters for DiscoverInstances API in AWS Cloud Map

## __Amazon Personalize Events__
  - ### Features
    - Adds new APIs to write item and user records to Datasets.

## __Amazon Relational Database Service__
  - ### Features
    - Adds the NCHAR Character Set ID parameter to the CreateDbInstance API for RDS Oracle.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Object Ownership is a new S3 feature that enables bucket owners to automatically assume ownership of objects that are uploaded to their buckets by other AWS Accounts.

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for tagging listeners, rules, and target groups on creation. This release also supported tagging operations through tagging api's for listeners and rules.

# __1.11.874__ __2020-10-01__
## __AWS AppSync__
  - ### Features
    - Exposes the wafWebAclArn field on GraphQL api records. The wafWebAclArn field contains the amazon resource name of a WAF Web ACL if the AWS AppSync API is associated with one.

## __AWS Glue__
  - ### Features
    - Adding additional optional map parameter to get-plan api

## __AWS WAFV2__
  - ### Features
    - AWS WAF is now available for AWS AppSync GraphQL APIs. AWS WAF protects against malicious attacks with AWS Managed Rules or your own custom rules. For more information see the AWS WAF Developer Guide.

## __Amazon Elastic MapReduce__
  - ### Features
    - Documentation updates for elasticmapreduce

## __Amazon QuickSight__
  - ### Features
    - QuickSight now supports connecting to AWS Timestream data source

## __Managed Streaming for Kafka__
  - ### Features
    - Added support for Enabling Zookeeper Encryption in Transit for AWS MSK.

# __1.11.873__ __2020-09-30__
## __AWS DataSync__
  - ### Features
    - This release enables customers to create s3 location for S3 bucket's located on an AWS Outpost.

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect.

## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds Timestream action. The Timestream rule action lets you stream time-series data from IoT sensors and applications to Amazon Timestream databases for time series analysis.

## __AWS MediaConnect__
  - ### Features
    - MediaConnect now supports reservations to provide a discounted rate for a specific outbound bandwidth over a period of time.

## __AWS S3 Control__
  - ### Features
    - Amazon S3 on Outposts expands object storage to on-premises AWS Outposts environments, enabling you to store and retrieve objects using S3 APIs and features.

## __AWS SecurityHub__
  - ### Features
    - Added several new resource details objects. Added additional details for CloudFront distributions, IAM roles, and IAM access keys. Added a new ResourceRole attribute for resources.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now use EC2 placement group to influence the placement of master nodes in a high-availability (HA) cluster across distinct underlying hardware to improve cluster availability.

## __Amazon Pinpoint__
  - ### Features
    - Amazon Pinpoint - Features - Customers can start a journey based on an event being triggered by an endpoint or user.

## __Amazon S3 on Outposts__
  - ### Features
    - Amazon S3 on Outposts expands object storage to on-premises AWS Outposts environments, enabling you to store and retrieve objects using S3 APIs and features.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 on Outposts expands object storage to on-premises AWS Outposts environments, enabling you to store and retrieve objects using S3 APIs and features.

## __Application Auto Scaling__
  - ### Features
    - This release extends Auto Scaling support for cluster storage of Managed Streaming for Kafka. Auto Scaling monitors and automatically expands storage capacity when a critical usage threshold is met.

## __EC2 Image Builder__
  - ### Features
    - EC2 Image Builder adds support for copying AMIs created by Image Builder to accounts specific to each Region.

# __1.11.872__ __2020-09-29__
## __Amazon Connect Service__
  - ### Features
    - Update TagResource API documentation to include Contact Flows and Routing Profiles as supported resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Client to Client routing for AWS Client VPN.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Simple update to description of ComplianceItemStatus.

## __Amazon Timestream Query__
  - ### Features
    - (New Service) Amazon Timestream is a fast, scalable, fully managed, purpose-built time series database that makes it easy to store and analyze trillions of time series data points per day.

## __Amazon Timestream Write__
  - ### Features
    - (New Service) Amazon Timestream is a fast, scalable, fully managed, purpose-built time series database that makes it easy to store and analyze trillions of time series data points per day.

## __Schemas__
  - ### Features
    - Added support for schemas of type JSONSchemaDraft4. Added ExportSchema API that converts schemas in AWS Events registry and Discovered schemas from OpenApi3  to JSONSchemaDraft4.

# __1.11.871__ __2020-09-28__
## __Amazon Relational Database Service__
  - ### Features
    - This release adds the InsufficientAvailableIPsInSubnetFault error for RDS Proxy.

## __Application Auto Scaling__
  - ### Features
    - This release extends Application Auto Scaling support to AWS Comprehend Entity Recognizer endpoint, allowing automatic updates to provisioned Inference Units to maintain targeted utilization level.

# __1.11.870__ __2020-09-25__
## __AWS Batch__
  - ### Features
    - Support custom logging, executionRole, secrets, and linuxParameters (initProcessEnabled, maxSwap, swappiness, sharedMemorySize, and tmpfs). Also, add new context keys for awslogs.

## __AWS Config__
  - ### Features
    - Make the delivery-s3-bucket as an optional parameter for conformance packs and organizational conformance packs

## __AWS Security Token Service__
  - ### Features
    - Documentation update for AssumeRole error

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Documentation updates for docdb

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports returning additional information about local gateway resources, such as the local gateway route table.

## __Amazon Fraud Detector__
  - ### Features
    - Increased maximum length of eventVariables values for GetEventPrediction from 256 to 1024.

# __1.11.869__ __2020-09-24__
## __AWS Amplify__
  - ### Features
    - Allow Oauth Token in CreateApp call to be a maximum of 1000 characters instead of 100

## __AWS Savings Plans__
  - ### Features
    - Introducing Queued SavingsPlans that will enable customers to queue their purchase request of Savings Plans for future dates.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports configuring your cluster's service CIDR during cluster creation.

## __Amazon Textract__
  - ### Features
    - AWS Textract now supports output results for asynchronous jobs to customer specified s3 bucket.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports WebM, OGG, AMR and AMR-WB as input formats. You can also specify an output key as a location within your S3 buckets to store the output of your transcription jobs.

## __Synthetics__
  - ### Features
    - AWS Synthetics now supports AWS X-Ray Active Tracing feature. RunConfig is now an optional parameter with timeout updated from (60 - 900 seconds) to (3 - 840 seconds).

# __1.11.868__ __2020-09-23__
## __AWS Backup__
  - ### Features
    - This release allows customers to enable or disable advanced backup settings in backup plan. As part of this feature AWS Backup added support for  Windows VSS backup option for EC2 resources.

## __AWS Cost Explorer Service__
  - ### Features
    - This release provides access to Cost Anomaly Detection Public Preview APIs. Cost Anomaly Detection finds cost anomalies based on your historical cost and usage using Machine Learning models.

## __Amazon QuickSight__
  - ### Features
    - Added Sheet information to DescribeDashboard, DescribeTemplate and DescribeAnalysis API response.

## __Amazon Translate__
  - ### Features
    - Improvements to DeleteTerminology API.

# __1.11.867__ __2020-09-22__
## __AWS SDK for Java__
  - ### Bugfixes
    - This change makes the `FileStoreTlsKeyManagersProvider` and `SystemPropertyTlsKeyManagersProvider` respect the `ssl.KeyManagerFactory.algorithm` when instantiating the `KeyManagerFactory` rather than always using the hardcoded value of `SunX509`.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend integrates with Amazon SageMaker GroundTruth to allow its customers to annotate their datasets using GroundTruth and train their models using Comprehend Custom APIs.

## __Amazon DynamoDB Streams__
  - ### Features
    - Documentation updates for streams.dynamodb

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports es-US locales

## __Amazon WorkMail__
  - ### Features
    - Adding support for Mailbox Export APIs

# __1.11.866__ __2020-09-21__
## __AWS Glue__
  - ### Features
    - Adding support to update multiple partitions of a table in a single request

## __AWS IoT SiteWise__
  - ### Features
    - This release supports IAM mode for SiteWise Monitor portals

## __AWS Resource Groups__
  - ### Features
    - Documentation updates and corrections for Resource Groups API Reference and SDKs.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for the Resource Groups Tagging API.

## __Amazon CloudWatch Events__
  - ### Features
    - Add support for Redshift Data API Targets

## __Amazon EventBridge__
  - ### Features
    - Add support for Redshift Data API Targets

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for the RDS DescribeExportTasks API

## __Amazon S3__
  - ### Bugfixes
    - Adds an alwaysCalculateMultipartMd5 option to instruct TransferManager to calculate MD5 digest for parts in multipart uploads. This is useful for uploading objects to a bucket configured with Object Locking, which requires MD5 to be set.

# __1.11.865__ __2020-09-18__
## __AWS CodeStar connections__
  - ### Features
    - New integration with the GitHub provider type.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports batch operations, which allow users to start, stop, and delete multiple MediaLive resources with a single request.

## __AWS SDK for Java__
  - ### Features
    - The EC2 instance metadata endpoint can now be overridden using the 'AWS_EC2_METADATA_SERVICE_ENDPOINT' environment variable. This environment variable behaves exactly like the existing 'com.amazonaws.sdk.ec2MetadataServiceEndpointOverride' system property.

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates for AWS SSO APIs.

# __1.11.864__ __2020-09-17__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports additional file formats and metadata for FAQs.

## __Amazon API Gateway__
  - ### Features
    - Adds support for mutual TLS authentication for public regional REST Apis

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports detecting Personally Identifiable Information (PII) entities in a document.

## __Amazon Elasticsearch Service__
  - ### Features
    - Adds support for data plane audit logging in Amazon Elasticsearch Service.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe now supports channel identification in real-time streaming, which enables you to transcribe multi-channel streaming audio.

## __AmazonApiGatewayV2__
  - ### Features
    - Adds support for mutual TLS authentication and disableAPIExecuteEndpoint for public regional HTTP Apis

# __1.11.863__ __2020-09-16__
## __AWS Greengrass__
  - ### Features
    - This release includes the ability to set run-time configuration for a Greengrass core. The Telemetry feature, also included in this release, can be configured via run-time configuration per core.

## __AWS Service Catalog__
  - ### Features
    - Enhance DescribeProvisionedProduct API to allow useProvisionedProduct Name as Input, so customer can provide ProvisionedProduct Name instead of ProvisionedProduct Id to describe a ProvisionedProduct.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for contact flows and routing profiles. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Customers can now provide multiple schedules within a single Data Lifecycle Manager (DLM) policy. Each schedule supports tagging, Fast Snapshot Restore (FSR) and cross region copy individually.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The ComplianceItemEntry Status description was updated to address Windows patches that aren't applicable.

# __1.11.862__ __2020-09-15__
## __AWS Budgets__
  - ### Features
    - Documentation updates for Daily Cost and Usage budgets

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports CDI (Cloud Digital Interface) inputs which enable uncompressed video from applications on Elastic Cloud Compute (EC2), AWS Media Services, and from AWS partners

## __AWS Organizations__
  - ### Features
    - AWS Organizations now enables you to add tags to the AWS accounts, organizational units, organization root, and policies in your organization.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now returns confidence scores for 'document' query responses.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - T4g instances are powered by AWS Graviton2 processors

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Ground Truth: Added support for a new Streaming feature which helps to continuously feed data and receive labels in real time. This release adds a new input and output SNS data channel.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports automatic language identification, which enables you to transcribe audio files without needing to know the language in advance.

## __Managed Streaming for Kafka__
  - ### Features
    - Added new API's to support SASL SCRAM Authentication with MSK Clusters.

# __1.11.861__ __2020-09-14__
## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for AWS X-Ray.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Updated API documentation and added paginators for DescribeCertificates, DescribeDBClusterParameterGroups, DescribeDBClusterParameters, DescribeDBClusterSnapshots and DescribePendingMaintenanceActions

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for the T4G instance family to the EC2 ModifyDefaultCreditSpecification and GetDefaultCreditSpecification APIs.

## __Amazon Managed Blockchain__
  - ### Features
    - Introducing support for Hyperledger Fabric 1.4. When using framework version 1.4, the state database may optionally be specified when creating peer nodes (defaults to CouchDB).

# __1.11.860__ __2020-09-11__
## __Amazon WorkSpaces__
  - ### Features
    - Adds API support for WorkSpaces Cross-Region Redirection feature.

# __1.11.859__ __2020-09-10__
## __AWS Single Sign-On Admin__
  - ### Features
    - This is an initial release of AWS Single Sign-On (SSO) Access Management APIs. This release adds support for SSO operations which could be used for managing access to AWS accounts.

## __Amazon CloudFront__
  - ### Features
    - Cloudfront adds support for Brotli. You can enable brotli caching and compression support by enabling it in your Cache Policy.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Pinpoint__
  - ### Features
    - Update SMS message model description to clearly indicate that the MediaUrl field is reserved for future use and is not supported by Pinpoint as of today.

## __Amazon Simple Storage Service__
  - ### Features
    - Bucket owner verification feature added. This feature introduces the x-amz-expected-bucket-owner and x-amz-source-expected-bucket-owner headers.

# __1.11.858__ __2020-09-09__
## __AWS Glue__
  - ### Features
    - Adding support for partitionIndexes to improve GetPartitions performance.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics is adding new AUTOSCALING application status for applications during auto scaling and also adding FlinkRunConfigurationDescription in the ApplicationDetails.

## __Redshift Data API Service__
  - ### Features
    - The Amazon Redshift Data API is generally available. This release enables querying Amazon Redshift data and listing various database objects.

# __1.11.857__ __2020-09-08__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild - Support keyword search for test cases in DecribeTestCases API . Allow deletion of reports in the report group, before deletion of report group using the deleteReports flag.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex supports en-AU locale

## __Amazon QuickSight__
  - ### Features
    - Adds tagging support for QuickSight customization resources.  A user can now specify a list of tags when creating a customization resource and use a customization ARN in QuickSight's tagging APIs.

## __AmazonApiGatewayV2__
  - ### Features
    - You can now secure HTTP APIs using Lambda authorizers and IAM authorizers. These options enable you to make flexible auth decisions using a Lambda function, or using IAM policies, respectively.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for Application Load Balancers on Outposts.

# __1.11.856__ __2020-09-04__
## __AWS X-Ray__
  - ### Features
    - Enhancing CreateGroup, UpdateGroup, GetGroup and GetGroups APIs to support configuring X-Ray Insights

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation-only updates for AWS Systems Manager

## __Amazon WorkSpaces__
  - ### Features
    - Adding support for Microsoft Office 2016 and Microsoft Office 2019 in BYOL Images

# __1.11.855__ __2020-09-03__
## __AWS Elemental MediaPackage__
  - ### Features
    - Enables inserting a UTCTiming XML tag in the output manifest of a DASH endpoint which a media player will use to help with time synchronization.

## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for payloads up to 256KB for Standard and Express workflows

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now returns confidence scores for both 'answer' and 'question and answer' query responses.

## __Amazon GuardDuty__
  - ### Features
    - GuardDuty findings triggered by failed events now include the error code name within the AwsApiCallAction section.

# __1.11.854__ __2020-09-02__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new transit gateway attachment state and resource type.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces additional statistics for the size and count of Amazon S3 objects that Macie can analyze as part of a classification job.

# __1.11.853__ __2020-09-01__
## __AWS SecurityHub__
  - ### Features
    - Added a PatchSummary object for security findings. The PatchSummary object provides details about the patch compliance status of an instance.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Add support for repository analysis based code reviews

# __1.11.852__ __2020-08-31__
## __AWS Backup__
  - ### Features
    - Documentation updates for Cryo

## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports real-time logging for CloudFront distributions. CloudFront real-time logs are more detailed, configurable, and are available in real time.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 and Spot Fleet now support modification of launch template configs for a running fleet enabling instance type, instance weight, AZ, and AMI updates without losing the current fleet ID.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for SQS.

# __1.11.851__ __2020-08-28__
## __AWS Cost and Usage Report Service__
  - ### Features
    - This release add MONTHLY as the new supported TimeUnit for ReportDefinition.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fix endpoint discovery cache entries to now be removed from the cache after a fixed TTL to stop the cache filling up over time when credentials are frequently changed. Endpoint discovery cache entries will no longer refresh in background, an active call will be required to replace the timed-out cache entry.

## __Amazon CloudFront__
  - ### Features
    - You can now manage CloudFront's additional, real-time metrics with the CloudFront API.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds support for ICMP, port -1, in Block Public Access Exceptions and API access for EMR Notebooks execution. You can now non-interactively execute EMR Notebooks and pass input parameters.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for Route 53

# __1.11.850__ __2020-08-27__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for WebM DASH outputs as well as H.264 4:2:2 10-bit output in MOV and MP4.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduces support to initiate Internet Key Exchange (IKE) negotiations for VPN connections from AWS. A user can now send the initial IKE message to their Customer Gateway (CGW) from VPN endpoints.

## __Amazon GameLift__
  - ### Features
    - GameLift FleetIQ as a standalone feature is now generally available. FleetIQ makes low-cost Spot instances viable for game hosting. Use GameLift FleetIQ with your EC2 Auto Scaling groups.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for Amazon Redshift.

# __1.11.849__ __2020-08-26__
## __Amazon Appflow__
  - ### Features
    - Amazon AppFlow is a fully managed integration service that securely transfers data between AWS services and SaaS applications. This update releases the first version of Amazon AppFlow APIs and SDK.

## __Amazon Route 53 Resolver__
  - ### Features
    - Route 53 Resolver adds support for resolver query logs

# __1.11.848__ __2020-08-24__
## __AWS Database Migration Service__
  - ### Features
    - Added new endpoint settings to include columns with Null and Empty value when using Kinesis and Kafka as target. Added a new endpoint setting to set maximum message size when using Kafka as target.

## __AWS IoT SiteWise__
  - ### Features
    - Add traversalDirection to ListAssociatedAssetsRequest and add portal status to ListPortalsResponse

## __AWS Kinesis Video__
  - ### Features
    - Upgrade Netty version to '4.1.48.Final'

## __AWS X-Ray__
  - ### Features
    - AWS X-Ray now supports tagging on sampling rules and groups.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for CloudWatch Logs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release enables customers to use VPC prefix lists in their transit gateway route tables, and it adds support for Provisioned IOPS SSD (io2) EBS volumes.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add string length constraints to OpsDataAttributeName and OpsFilterValue.

## __Managed Streaming for Kafka__
  - ### Features
    - Add UpdateConfiguration and DeleteConfiguration operations.

# __1.11.847__ __2020-08-20__
## __Amazon Chime__
  - ### Features
    - Documentation updates for chime

## __Amazon FSx__
  - ### Features
    - Documentation updates for Amazon FSx

## __AmazonApiGatewayV2__
  - ### Features
    - Customers can now create Amazon API Gateway HTTP APIs that route requests to AWS AppConfig, Amazon EventBridge, Amazon Kinesis Data Streams, Amazon SQS, and AWS Step Functions.

# __1.11.846__ __2020-08-19__
## __AWS Lake Formation__
  - ### Features
    - Adding additional field in ListPermissions API response to return RAM resource share ARN if a resource were shared through AWS RAM service.

## __AWS Organizations__
  - ### Features
    - Minor documentation updates for AWS Organizations

## __AWS Service Catalog__
  - ### Features
    - Enhance SearchProvisionedProducts API to allow queries using productName and provisioningArtifactName. Added lastProvisioningRecordId and lastSuccessfulRecordId to Read ProvisionedProduct APIs

## __AWS Storage Gateway__
  - ### Features
    - Added WORM, tape retention lock, and custom pool features for virtual tapes.

## __Amazon Interactive Video Service__
  - ### Features
    - Amazon Interactive Video Service (IVS) now offers customers the ability to create private channels, allowing customers to restrict their streams by channel or viewer.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe and Amazon Transcribe Medical now enable you to identify different speakers in your real-time streams with speaker identification.

# __1.11.845__ __2020-08-18__
## __AWS CodeBuild__
  - ### Features
    - Documentation updates for codebuild

## __AWS DataSync__
  - ### Features
    - DataSync support for filters as input arguments to the ListTasks and ListLocations API calls.

## __AWS SSO Identity Store__
  - ### Features
    - AWS Single Sign-On (SSO) Identity Store service provides an interface to retrieve all of your users and groups. It enables entitlement management per user or group for AWS SSO and other IDPs.

## __AWS SecurityHub__
  - ### Features
    - New details for DynamoDB tables, Elastic IP addresses, IAM policies and users, RDS DB clusters and snapshots, and Secrets Manager secrets. Added details for AWS KMS keys and RDS DB instances.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Adding the option to use a service linked role to publish events to Pinpoint.

## __Amazon Simple Email Service__
  - ### Features
    - This release includes new APIs to allow customers to add or remove email addresses from their account-level suppression list in bulk.

# __1.11.844__ __2020-08-18__
## __AWS Certificate Manager__
  - ### Features
    - ACM provides support for the new Private CA feature Cross-account CA sharing. ACM users can issue certificates signed by a private CA belonging to another account where the CA was shared with them.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - ACM Private CA is launching cross-account support. This allows customers to share their private CAs with other accounts, AWS Organizations, and organizational units to issue end-entity certificates.

## __AWS RoboMaker__
  - ### Features
    - This release introduces RoboMaker Simulation WorldForge, a capability that automatically generates one or more simulation worlds.

## __Amazon EC2 Container Registry__
  - ### Features
    - This feature adds support for pushing and pulling Open Container Initiative (OCI) artifacts.

## __Amazon Kinesis__
  - ### Features
    - Introducing ShardFilter for ListShards API to filter the shards using a position in the stream, and ChildShards support for GetRecords and SubscribeToShard API to discover children shards on shard end

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight now supports programmatic creation and management of analyses with new APIs.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for HTTP Desync Mitigation in Application Load Balancers.

# __1.11.842__ __2020-08-14__
## __AWS License Manager__
  - ### Features
    - This release includes ability to enforce license assignment rules with EC2 Dedicated Hosts.

## __Amazon AppStream__
  - ### Features
    - Adds support for the Desktop View feature

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New C5ad instances featuring AMD's 2nd Generation EPYC processors, offering up to 96 vCPUs, 192 GiB of instance memory, 3.8 TB of NVMe based SSD instance storage, and 20 Gbps in Network bandwidth

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports 1) creating real-time inference endpoints using model container images from Docker registries in customers' VPC 2) AUC(Area under the curve) as AutoPilot objective metric

## __Braket__
  - ### Features
    - Fixing bug in our SDK model where device status and device type had been flipped.

# __1.11.841__ __2020-08-13__
## __AWS AppSync__
  - ### Features
    - Documentation update for AWS AppSync support for Direct Lambda Resolvers.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Adding ability to customize expiry for Refresh, Access and ID tokens.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added MapCustomerOwnedIpOnLaunch and CustomerOwnedIpv4Pool to ModifySubnetAttribute to allow CoIP auto assign. Fields are returned in DescribeSubnets and DescribeNetworkInterfaces responses.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding support for customer provided EC2 launch templates and AMIs to EKS Managed Nodegroups. Also adds support for Arm-based instances to EKS Managed Nodegroups.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

## __Amazon Relational Database Service__
  - ### Features
    - This release allows customers to specify a replica mode when creating or modifying a Read Replica, for DB engines which support this feature.

## __Braket__
  - ### Features
    - Amazon Braket general availability with Device and Quantum Task operations.

# __1.11.840__ __2020-08-13__
## __AWS Cloud9__
  - ### Features
    - Add ConnectionType input parameter to CreateEnvironmentEC2 endpoint. New parameter enables creation of environments with SSM connection.

## __AWS IoT__
  - ### Features
    - Audit finding suppressions: Device Defender enables customers to turn off non-compliant findings for specific resources on a per check basis.

## __AWS Lambda__
  - ### Features
    - Support for creating Lambda Functions using 'java8.al2' and 'provided.al2'

## __AWS Transfer Family__
  - ### Features
    - Adds security policies to control cryptographic algorithms advertised by your server, additional characters in usernames and length increase, and FIPS compliant endpoints in the US and Canada regions.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend Custom Entity Recognition now supports Spanish, German, French, Italian and Portuguese and up to 25 entity types per model.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduces support for IPv6-in-IPv4 IPsec tunnels. A user can now send traffic from their on-premise IPv6 network to AWS VPCs that have IPv6 support enabled.

## __Amazon FSx__
  - ### Features
    - This release adds the capability to create persistent file systems for throughput-intensive workloads using Hard Disk Drive (HDD) storage and an optional read-only Solid-State Drive (SSD) cache.

## __Amazon WorkSpaces__
  - ### Features
    - Adds optional EnableWorkDocs property to WorkspaceCreationProperties in the ModifyWorkspaceCreationProperties API

# __1.11.839__ __2020-08-11__
## __AWS Lambda__
  - ### Features
    - Support Managed Streaming for Kafka as an Event Source. Support retry until record expiration for Kinesis and Dynamodb streams event source mappings.

## __AWS Organizations__
  - ### Features
    - Minor documentation update for AWS Organizations

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release rolls back the EC2 On-Demand Capacity Reservations (ODCRs) release 1.11.831 published on 2020-07-30, which was deployed in error.

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for in-region CopyObject and UploadPartCopy through S3 Access Points

# __1.11.838__ __2020-08-10__
## __AWS Glue__
  - ### Features
    - Starting today, you can further control orchestration of your ETL workloads in AWS Glue by specifying the maximum number of concurrent runs for a Glue workflow.

## __AWS Savings Plans__
  - ### Features
    - Updates to the list of services supported by this API.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Remove CoIP Auto-Assign feature references.

# __1.11.837__ __2020-08-07__
## __AWS Glue__
  - ### Features
    - AWS Glue now adds support for Network connection type enabling you to access resources inside your VPC using Glue crawlers and Glue ETL jobs.

## __AWS Organizations__
  - ### Features
    - Documentation updates for some new error reasons.

## __AWS Server Migration Service__
  - ### Features
    - In this release, AWS Server Migration Service (SMS) has added new features: 1. APIs to work with application and instance level validation 2. Import application catalog from AWS Application Discovery Service 3. For an application you can start on-demand replication

## __Amazon S3 Encryption Client__
  - ### Features
    - Updates to the Amazon S3 Encryption Client - This change includes fixes for issues that were reported by Sophie Schmieg from the Google ISE team, and for issues that were discovered by AWS Cryptography.

## __Amazon Simple Storage Service__
  - ### Features
    - Updates Amazon S3 API reference documentation. 

# __1.11.836__ __2020-08-06__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports Wavelength resources, including carrier gateways, and carrier IP addresses.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex supports the option to enable accuracy improvements and specify an intent classification confidence score threshold.

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex supports intent classification confidence scores along with a list of the top five intents.

## __Amazon Personalize__
  - ### Features
    - Add 'exploration' functionality

## __Amazon Personalize Events__
  - ### Features
    - Adds support implicit and explicit impression input

## __Amazon Personalize Runtime__
  - ### Features
    - Adds support for implicit impressions

# __1.11.835__ __2020-08-05__
## __AWS AppSync__
  - ### Features
    - AWS AppSync releases support for Direct Lambda Resolvers.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for the Resource Group Tagging API namespace.

## __Amazon FSx__
  - ### Features
    - Documentation updates for StorageCapacity input value format.

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for SNS.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports custom language models, which can improve transcription accuracy for your specific use case.

# __1.11.834__ __2020-08-04__
## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for health

# __1.11.833__ __2020-08-03__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds a waiter for CommandExecuted and paginators for various other APIs.

# __1.11.832__ __2020-07-31__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Updates to the list of services supported by this API.

## __AWS Storage Gateway__
  - ### Features
    - Add support for gateway VM deprecation dates

## __AWS WAFV2__
  - ### Features
    - Add ManagedByFirewallManager flag to the logging configuration, which indicates whether AWS Firewall Manager controls the configuration.

## __Amazon Chime__
  - ### Features
    - This release increases the CreateMeetingWithAttendee max attendee limit to 10.

## __Amazon Personalize Runtime__
  - ### Features
    - Adds support to use filters with Personalized Ranking recipe

# __1.11.831__ __2020-07-30__
## __AWS CodeBuild__
  - ### Features
    - Adding support for BuildBatch, and CodeCoverage APIs. BuildBatch allows you to model your project environment in source, and helps start multiple builds with a single API call. CodeCoverage allows you to track your code coverage using AWS CodeBuild. 

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Resource Groups__
  - ### Features
    - Improved documentation for Resource Groups API operations.

## __AWS Service Catalog__
  - ### Features
    - This release adds support for ProvisionProduct, UpdateProvisionedProduct & DescribeProvisioningParameters by product name, provisioning artifact name and path name. In addition DescribeProvisioningParameters now returns a list of provisioning artifact outputs.

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 On-Demand Capacity Reservations now adds support to bring your own licenses (BYOL) of Windows operating system to launch EC2 instances. 

## __Amazon GuardDuty__
  - ### Features
    - GuardDuty can now provide detailed cost metrics broken down by account, data source, and S3 resources, based on the past 30 days of usage.  This new feature also supports viewing cost metrics for all member accounts as a GuardDuty master.

## __Amazon Simple Email Service__
  - ### Features
    - This release makes more API operations available to customers in version 2 of the Amazon SES API. With these additions, customers can now access sending authorization, custom verification email, and template API operations.  With this release, Amazon SES is also providing new and updated APIs to allow customers to request production access.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to reboot brokers within a cluster. 

# __1.11.830__ __2020-07-29__
## __AWS Cloud Map__
  - ### Features
    - Added new attribute AWS_EC2_INSTANCE_ID for RegisterInstance API 

## __AWS Resource Groups__
  - ### Features
    - Resource Groups released a new feature that enables you to create a group with an associated configuration that specifies how other AWS services interact with the group. There are two new operations `GroupResources` and `UngroupResources` to work on a group with a configuration. In this release, you can associate EC2 Capacity Reservations with a resource group. Resource Groups also added a new request parameter `Group` to replace `GroupName` for all existing operations.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for encrypting the contents of your Amazon ECR repository with customer master keys (CMKs) stored in AWS Key Management Service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding support to target EC2 On-Demand Capacity Reservations within an AWS Resource Group to launch EC2 instances.

## __Amazon GuardDuty__
  - ### Features
    - GuardDuty now supports S3 Data Events as a configurable data source type. This feature expands GuardDuty's monitoring scope to include S3 data plane operations, such as GetObject and PutObject. This data source is optional and can be enabled or disabled at anytime. Accounts already using GuardDuty must first enable the new feature to use it; new accounts will be enabled by default. GuardDuty masters can configure this data source for individual member accounts and GuardDuty masters associated through AWS Organizations can automatically enable the data source in member accounts.

## __Amazon Kinesis Firehose__
  - ### Features
    - This release includes a new Kinesis Data Firehose feature that supports data delivery to Https endpoint and to partners. You can now use Kinesis Data Firehose to ingest real-time data and deliver to Https endpoint and partners in a serverless, reliable, and salable manner.

# __1.11.829__ __2020-07-28__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports several new features: EBU-TT-D captions in Microsoft Smooth outputs; interlaced video in HEVC outputs; video noise reduction (using temporal filtering) in HEVC outputs.

## __AWS SecurityHub__
  - ### Features
    - Added UpdateSecurityHubConfiguration API. Security Hub now allows customers to choose whether to automatically enable new controls that are added to an existing standard that the customer enabled. For example, if you enabled Foundational Security Best Practices for an account, you can automatically enable new controls as we add them to that standard. By default, new controls are enabled.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduces support for tag-on-create capability for the following APIs: CreateVpnConnection, CreateVpnGateway, and CreateCustomerGateway. A user can now add tags while creating these resources. For further detail, please see AWS Tagging Strategies.

## __Amazon Interactive Video Service__
  - ### Features
    - Added a new error code, PendingVerification, to differentiate between errors caused by insufficient IAM permissions and errors caused by account verification.

## __Amazon Relational Database Service__
  - ### Features
    - Adds reporting of manual cluster snapshot quota to DescribeAccountAttributes API

## __Auto Scaling__
  - ### Features
    - Now you can enable Instance Metadata Service Version 2 (IMDSv2) or disable the instance metadata endpoint with Launch Configurations.

## __EC2 Image Builder__
  - ### Features
    - This release updates distribution configurations to allow periods in AMI names.

# __1.11.828__ __2020-07-27__
## __AWS DataSync__
  - ### Features
    - Today AWS DataSync releases support for self-managed object storage Locations and the new TransferMode Option.

## __AWS Database Migration Service__
  - ### Features
    - Basic endpoint settings for relational databases, Preflight validation API.

## __AWS Glue__
  - ### Features
    - Add ability to manually resume workflows in AWS Glue providing customers further control over the orchestration of ETL workloads.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - m6gd, c6gd, r6gd instances are powered by AWS Graviton2 processors and support local NVMe instance storage

## __Amazon Fraud Detector__
  - ### Features
    - Moved the eventTypeName attribute for PutExternalModel API to inputConfiguration. Model ID's no longer allow hyphens.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Assorted doc ticket-fix updates for Systems Manager.

# __1.11.827__ __2020-07-24__
## __AWS Elemental MediaPackage__
  - ### Features
    - The release adds daterange as a new ad marker option. This option enables MediaPackage to insert EXT-X-DATERANGE tags in HLS and CMAF manifests. The EXT-X-DATERANGE tag is used to signal ad and program transition events.

## __AWS MediaConnect__
  - ### Features
    - You can now disable an entitlement to stop streaming content to the subscriber's flow temporarily. When you are ready to allow content to start streaming to the subscriber's flow again, you can enable the entitlement.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports sorting query results based on document attributes. Amazon Kendra also introduced an option to enclose table and column names with double quotes for database data sources. 

## __Amazon CloudWatch__
  - ### Features
    - AWS CloudWatch ListMetrics now supports an optional parameter (RecentlyActive) to filter results by only metrics that have received new datapoints in the past 3 hours. This enables more targeted metric data retrieval through the Get APIs

## __Amazon FSx__
  - ### Features
    - Documentation update for FSx for Lustre

## __Amazon Fraud Detector__
  - ### Features
    - GetPrediction has been replaced with GetEventPrediction. PutExternalModel has been simplified to accept a role ARN.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces additional criteria for sorting and filtering query results for account quotas and usage statistics.

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Ground Truth:Added support for OIDC (OpenID Connect) to authenticate workers via their own identity provider instead of through Amazon Cognito. This release adds new APIs (CreateWorkforce, DeleteWorkforce, and ListWorkforces) to SageMaker Ground Truth service.  Sagemaker Neo: Added support for detailed target device description by using TargetPlatform fields - OS, architecture, and accelerator. Added support for additional compilation parameters by using JSON field CompilerOptions.  Sagemaker Search: SageMaker Search supports transform job details in trial components.

## __AmazonMQ__
  - ### Features
    - Amazon MQ now supports LDAP (Lightweight Directory Access Protocol), providing authentication and authorization of Amazon MQ users via a customer designated LDAP server.

# __1.11.826__ __2020-07-23__
## __AWS Config__
  - ### Features
    - Adding service linked configuration aggregation support along with new enums for config resource coverage

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect

## __AWS Glue__
  - ### Features
    - Added new ConnectionProperties: "KAFKA_SSL_ENABLED" (to toggle SSL connections) and "KAFKA_CUSTOM_CERT" (import CA certificate file)

## __Amazon FSx__
  - ### Features
    - Adds support for AutoImport, a new FSx for Lustre feature that allows customers to configure their FSx file system to automatically update its contents when new objects are added to S3 or existing objects are overwritten.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Amazon Lightsail content delivery network (CDN) distributions and SSL/TLS certificates.

## __Amazon WorkSpaces__
  - ### Features
    - Added UpdateWorkspaceImagePermission API to share Amazon WorkSpaces images across AWS accounts.

# __1.11.825__ __2020-07-22__
## __AWS Elemental MediaLive__
  - ### Features
    - The AWS Elemental MediaLive APIs and SDKs now support the ability to get thumbnails for MediaLive devices that are attached or not attached to a channel. Previously, this thumbnail feature was available only on the console.

## __Amazon QuickSight__
  - ### Features
    - New API operations - GetSessionEmbedUrl, CreateNamespace, DescribeNamespace, ListNamespaces, DeleteNamespace, DescribeAccountSettings, UpdateAccountSettings, CreateAccountCustomization, DescribeAccountCustomization, UpdateAccountCustomization, DeleteAccountCustomization. Modified API operations to support custom permissions restrictions - RegisterUser, UpdateUser, UpdateDashboardPermissions

# __1.11.824__ __2020-07-21__
## __Amazon CodeGuru Profiler__
  - ### Features
    - Amazon CodeGuru Profiler now supports resource tagging APIs, tags-on-create and tag-based access control features. You can now tag profiling groups for better resource and access control management.

# __1.11.823__ __2020-07-20__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild adds support for Session Manager and Windows 2019 Environment type

## __AWS Ground Station__
  - ### Features
    - Adds optional MTU property to DataflowEndpoint and adds contact source and destination details to DescribeContact response.

## __Amazon CloudFront__
  - ### Features
    - CloudFront adds support for cache policies and origin request policies. With these new policies, you can now more granularly control the query string, header, and cookie values that are included in the cache key and in requests that CloudFront sends to your origin.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for tag-on-create for CreateVpcPeeringConnection and CreateRouteTable. You can now specify tags when creating any of these resources. For more information about tagging, see AWS Tagging Strategies. Add poolArn to the response of DescribeCoipPools.

## __Amazon Fraud Detector__
  - ### Features
    - Introduced flexible model training dataset requirements for Online Fraud Insights so that customers can choose any two inputs to train a model instead of being required to use 'email' and 'IP address' at minimum. Added support for resource ARNs, resource tags, resource-based IAM policies and identity-based policies that limit access to a resource based on tags. Added support for customer-managed customer master key (CMK) data encryption. Added new Event Type, Entity Type, and Label APIs. An event type defines the structure for an event sent to Amazon Fraud Detector, including the variables sent as part of the event, the entity performing the event, and the labels that classify the event. Introduced the GetEventPrediction API.

## __Amazon Relational Database Service__
  - ### Features
    - Add a new SupportsParallelQuery output field to DescribeDBEngineVersions. This field shows whether the engine version supports parallelquery. Add a new SupportsGlobalDatabases output field to DescribeDBEngineVersions and DescribeOrderableDBInstanceOptions. This field shows whether global database is supported by engine version or the combination of engine version and instance class.

## __Firewall Management Service__
  - ### Features
    - Added managed policies for auditing security group rules, including the use of managed application and protocol lists.

# __1.11.822__ __2020-07-17__
## __AWS AppSync__
  - ### Features
    - Documentation update to Cachingconfig.cachingKeys to include $context.source as a valid value.

## __AWS Elastic Beanstalk__
  - ### Features
    - Add waiters for `EnvironmentExists`, `EnvironmentUpdated`, and `EnvironmentTerminated`. Add paginators for `DescribeEnvironmentManagedActionHistory` and `ListPlatformVersions`.

## __Amazon Connect Service__
  - ### Features
    - This release adds a set of Amazon Connect APIs to programmatically control call recording with start, stop, pause and resume functions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API includes miscellaneous updates and improvements to the documentation.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __1.11.821__ __2020-07-15__
## __Amazon Interactive Video Service__
  - ### Features
    - Introducing Amazon Interactive Video Service - a managed live streaming solution that is quick and easy to set up, and ideal for creating interactive video experiences.

# __1.11.820__ __2020-07-09__
## __AWS Amplify__
  - ### Features
    - Documentation update to the introduction text to specify that this is the Amplify Console API.

## __AWS App Mesh__
  - ### Features
    - AppMesh now supports Ingress which allows resources outside a mesh to communicate to resources that are inside the mesh. See https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_gateways.html

## __AWS CloudHSM V2__
  - ### Features
    - Documentation updates for cloudhsmv2

## __AWS Secrets Manager__
  - ### Features
    - Adds support for filters on the ListSecrets API to allow filtering results by name, tag key, tag value, or description.  Adds support for the BlockPublicPolicy option on the PutResourcePolicy API to block resource policies which grant a wide range of IAM principals access to secrets. Adds support for the ValidateResourcePolicy API to validate resource policies for syntax and prevent lockout error scenarios and wide access to secrets. 

## __AWS WAFV2__
  - ### Features
    - Added the option to use IP addresses from an HTTP header that you specify, instead of using the web request origin. Available for IP set matching, geo matching, and rate-based rule count aggregation.

## __Alexa For Business__
  - ### Features
    - Added support for registering an AVS device directly to a room using RegisterAVSDevice with a room ARN

## __Amazon CloudWatch Events__
  - ### Features
    - Amazon CloudWatch Events/EventBridge adds support for API Gateway as a target.

## __Amazon Comprehend__
  - ### Features
    - AWS Comprehend now supports Real-time Analysis with Custom Entity Recognition. 

## __Amazon Elastic Block Store__
  - ### Features
    - This release introduces the following set of actions for the EBS direct APIs: 1. StartSnapshot, which creates a new Amazon EBS snapshot. 2. PutSnapshotBlock, which writes a block of data to a snapshot. 3. CompleteSnapshot, which seals and completes a snapshot after blocks of data have been written to it.

## __Amazon EventBridge__
  - ### Features
    - Amazon EventBridge adds support for API Gateway as a target.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds the DeleteHumanTaskUi API to Amazon Augmented AI

## __Amazon Simple Notification Service__
  - ### Features
    - This release adds support for SMS origination number as an attribute in the MessageAttributes parameter for the SNS Publish API.

# __1.11.819__ __2020-07-08__
## __AWS Cost Explorer Service__
  - ### Features
    - Customers can now see Instance Name alongside each rightsizing recommendation.

## __AWS Organizations__
  - ### Features
    - We have launched a self-service option to make it easier for customers to manage the use of their content by AI services. Certain AI services (Amazon CodeGuru Profiler, Amazon Comprehend, Amazon Lex, Amazon Polly, Amazon Rekognition, Amazon Textract, Amazon Transcribe, and Amazon Translate) may use content to improve the service. Customers have been able to opt out of this use by contacting AWS Support, and now they can opt out on a self-service basis by setting an Organizations policy for all or an individual AI service listed above. Please refer to the technical documentation in the online AWS Organizations User Guide for more details.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Spot now enables customers to tag their Spot Instances Requests on creation.

## __Amazon Forecast Service__
  - ### Features
    - With this release, Amazon Forecast now supports the ability to add a tag to any resource via the launch of three new APIs: TagResouce, UntagResource and ListTagsForResource. A tag is a simple label consisting of a customer-defined key and an optional value allowing for easier resource management.

# __1.11.818__ __2020-07-07__
## __AWS Glue__
  - ### Features
    - AWS Glue Data Catalog supports cross account sharing of tables through AWS Lake Formation

## __AWS Lake Formation__
  - ### Features
    -  AWS Lake Formation supports sharing tables with other AWS accounts and organizations

## __AWS Storage Gateway__
  - ### Features
    - Adding support for file-system driven directory refresh, Case Sensitivity toggle for SMB File Shares, and S3 Prefixes and custom File Share names

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for a new security policy, TLSv1.2_2019.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeAvailabilityZones now returns additional data about Availability Zones and Local Zones.

## __Amazon Elastic File System__
  - ### Features
    - This release adds support for automatic backups of Amazon EFS file systems to further simplify backup management. 

# __1.11.817__ __2020-07-06__
## __AWS IoT SiteWise__
  - ### Features
    - This release supports optional start date and end date parameters for the GetAssetPropertyValueHistory API.

## __Amazon QuickSight__
  - ### Features
    - Add Theme APIs and update Dashboard APIs to support theme overrides.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Amazon RDS on AWS Outposts.

# __1.11.816__ __2020-07-02__
## __Amazon Connect Service__
  - ### Features
    - Documentation updates for Amazon Connect.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

# __1.11.815__ __2020-07-01__
## __AWS AppSync__
  - ### Features
    - AWS AppSync supports new 12xlarge instance for server-side API caching

## __AWS CodeBuild__
  - ### Features
    - Support build status config in project source

## __AWS SecurityHub__
  - ### Features
    - This release adds additional details for findings. There are now finding details for auto scaling groups, EC2 volumes, and EC2 VPCs. You can identify detected vulnerabilities and provide related network paths.

## __Amazon Chime__
  - ### Features
    - This release supports third party emergency call routing configuration for Amazon Chime Voice Connectors.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the exceptions KMSKeyNotAccessibleFault and InvalidDBClusterStateFault to the Amazon RDS ModifyDBInstance API.

## __EC2 Image Builder__
  - ### Features
    - EC2 Image Builder adds support for encrypted AMI distribution.

# __1.11.814__ __2020-06-30__
## __AWS Comprehend Medical__
  - ### Features
    - This release adds the relationships between MedicalCondition and Anatomy in DetectEntitiesV2 API.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Release GitHub Enterprise Server source provider integration

## __Amazon EC2 Container Registry__
  - ### Features
    - Add a new parameter (ImageDigest) and a new exception (ImageDigestDoesNotMatchException) to PutImage API to support pushing image by digest.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for tag-on-create for CreateVpc, CreateEgressOnlyInternetGateway, CreateSecurityGroup, CreateSubnet, CreateNetworkInterface, CreateNetworkAcl, CreateDhcpOptions and CreateInternetGateway. You can now specify tags when creating any of these resources. For more information about tagging, see AWS Tagging Strategies.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where AmazonS3Client.listNextBatchOfVersions would not use the configured request-level credentials, progress listener, metric collector, execution timeout or request timeout.

# __1.11.813__ __2020-06-29__
## __AWS CodeStar connections__
  - ### Features
    - Updated and new APIs in support of hosts for connections to installed provider types. New integration with the GitHub Enterprise Server provider type.

## __Amazon CodeGuru Profiler__
  - ### Features
    - Amazon CodeGuru Profiler is now generally available. The Profiler helps developers to optimize their software, troubleshoot issues in production, and identify their most expensive lines of code. As part of general availability, we are launching: Profiling of AWS Lambda functions, Anomaly detection in CPU profiles, Color My Code on flame graphs, Expanding presence to 10 AWS regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Virtual Private Cloud (VPC) customers can now create and manage their own Prefix Lists to simplify VPC configurations.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling.

# __1.11.812__ __2020-06-26__
## __AWS CloudFormation__
  - ### Features
    - ListStackInstances and DescribeStackInstance now return a new `StackInstanceStatus` object that contains `DetailedStatus` values: a disambiguation of the more generic `Status` value. ListStackInstances output can now be filtered on `DetailedStatus` using the new `Filters` parameter.

## __AWS Database Migration Service__
  - ### Features
    - This release contains miscellaneous API documentation updates for AWS DMS in response to several customer reported issues.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Don't require Authorization for InitiateAuth and RespondToAuthChallenge.

## __Amazon QuickSight__
  - ### Features
    - Added support for cross-region DataSource credentials copying.

## __Amazon SageMaker Service__
  - ### Features
    - The new 'ModelClientConfig' parameter being added for CreateTransformJob and DescribeTransformJob api actions enable customers to configure model invocation related parameters such as timeout and retry.

# __1.11.811__ __2020-06-25__
## __AWS Glue__
  - ### Features
    - This release adds new APIs to support column level statistics in AWS Glue Data Catalog

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for tag-on-create for Host Reservations in Dedicated Hosts. You can now specify tags when you create a Host Reservation for a Dedicated Host. For more information about tagging, see AWS Tagging Strategies.

# __1.11.810__ __2020-06-24__
## __AWS Amplify__
  - ### Features
    - This release of AWS Amplify Console introduces support for automatically creating custom subdomains for branches based on user-defined glob patterns, as well as automatically cleaning up Amplify branches when their corresponding git branches are deleted.

## __AWS Backup__
  - ### Features
    - Customers can now manage and monitor their backups in a policied manner across their AWS accounts, via an integration between AWS Backup and AWS Organizations

## __AWS CodeCommit__
  - ### Features
    - This release introduces support for reactions to CodeCommit comments. Users will be able to select from a pre-defined list of emojis to express their reaction to any comments.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __AWS Organizations__
  - ### Features
    - This release adds support for a new backup policy type for AWS Organizations.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR customers can now set allocation strategies for On-Demand and Spot instances in their EMR clusters with instance fleets. These allocation strategies use real-time capacity insights to provision clusters faster and make the most efficient use of available spare capacity to allocate Spot instances to reduce interruptions. 

## __Amazon FSx__
  - ### Features
    - This release adds the capability to take highly-durable, incremental backups of your FSx for Lustre persistent file systems. This capability makes it easy to further protect your file system data and to meet business and regulatory compliance requirements.

## __Amazon Honeycode__
  - ### Features
    - Introducing Amazon Honeycode - a fully managed service that allows you to quickly build mobile and web apps for teams without programming.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling.

# __1.11.809__ __2020-06-23__
## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of Bumper.

## __AWS Organizations__
  - ### Features
    - Added a new error message to support the requirement for a Business License on AWS accounts in China to create an organization.

# __1.11.808__ __2020-06-22__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds Tag On Create feature support for the ImportImage, ImportSnapshot, ExportImage and CreateInstanceExportTask APIs.

## __Amazon Elastic MapReduce__
  - ### Features
    - Adding support for MaximumCoreCapacityUnits parameter for EMR Managed Scaling. It allows users to control how many units/nodes are added to the CORE group/fleet. Remaining units/nodes are added to the TASK groups/fleet in the cluster.

## __Amazon Rekognition__
  - ### Features
    - This update adds the ability to detect black frames, end credits, shots, and color bars in stored videos

## __Amazon Relational Database Service__
  - ### Features
    - Added paginators for various APIs.

## __Amazon Simple Queue Service__
  - ### Features
    - AWS SQS adds pagination support for ListQueues and ListDeadLetterSourceQueues APIs

# __1.11.807__ __2020-06-19__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports Input Prepare schedule actions. This feature improves existing input switching by allowing users to prepare an input prior to switching to it.

## __AWS OpsWorks CM__
  - ### Features
    - Documentation updates for AWS OpsWorks CM.

## __Amazon ElastiCache__
  - ### Features
    - Documentation updates for elasticache

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support to tag elastic-gpu on the RunInstances api

# __1.11.806__ __2020-06-18__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for NexGuard FileMarker SDK, which allows NexGuard partners to watermark proprietary content in mezzanine and OTT streaming contexts.

## __AWS Support__
  - ### Features
    - Documentation updates for support

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for meteringmarketplace

## __Amazon Relational Database Service__
  - ### Features
    - Adding support for global write forwarding on secondary clusters in an Aurora global database.

## __Amazon Route 53__
  - ### Features
    - Added a new ListHostedZonesByVPC API for customers to list all the private hosted zones that a specified VPC is associated with.

## __Amazon Simple Email Service__
  - ### Features
    - You can now configure Amazon SES to send event notifications when the delivery of an email is delayed because of a temporary issue. For example, you can receive a notification if the recipient's inbox is full, or if there's a temporary problem with the receiving email server.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added offset support for specifying the number of days to wait after the date and time specified by a CRON expression before running the maintenance window.

# __1.11.805__ __2020-06-17__
## __AWS App Mesh__
  - ### Features
    - Adds support for route and virtual node listener timeouts.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - nvmeSupport added to DescribeInstanceTypes API

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snowcone is a portable, rugged and secure device for edge computing and data transfer. You can use Snowcone to collect, process, and move data to AWS, either offline by shipping the device to AWS or online by using AWS DataSync. With 2 CPUs and 4 GB RAM of compute and 8 TB of storage, Snowcone can run edge computing workloads and store data securely. Snowcone's small size (8.94" x 5.85" x 3.25" / 227 mm x 148.6 mm x 82.65 mm) allows you to set it next to machinery in a factory. Snowcone weighs about 4.5 lbs. (2 kg), so you can carry one in a backpack, use it with battery-based operation, and use the Wi-Fi interface to gather sensor data. Snowcone supports a file interface with NFS support. 

## __Amazon Macie 2__
  - ### Features
    - This is a documentation-only update to the Amazon Macie API. This update contains miscellaneous editorial improvements to various API descriptions.

## __Amazon Route 53__
  - ### Features
    - Add PriorRequestNotComplete exception to AssociateVPCWithHostedZone API

# __1.11.804__ __2020-06-16__
## __AWS Data Exchange__
  - ### Features
    - This release fixes a bug in the AWS Data Exchange Python and NodeJS SDKs. The 'KmsKeyArn' field in the create-job API was configured to be required instead of optional. We updated this field to be optional in this release.

## __AWS Lambda__
  - ### Features
    - Adds support for using Amazon Elastic File System (persistent storage) with AWS Lambda. This enables customers to share data across function invocations, read large reference data files, and write function output to a persistent and shared store.

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new US English child voice - Kevin. Kevin is available as Neural voice only.

## __Amazon QLDB__
  - ### Features
    - Documentation updates for Amazon QLDB

## __Auto Scaling__
  - ### Features
    - Introducing instance refresh, a feature that helps you update all instances in an Auto Scaling group in a rolling fashion (for example, to apply a new AMI or instance type). You can control the pace of the refresh by defining the percentage of the group that must remain running/healthy during the replacement process and the time for new instances to warm up between replacements.

# __1.11.803__ __2020-06-15__
## __AWS IoT__
  - ### Features
    - Added support for job executions rollout configuration, job abort configuration, and job executions timeout configuration for AWS IoT Over-the-Air (OTA) Update Feature.

## __Alexa For Business__
  - ### Features
    - Adding support for optional tags in CreateBusinessReportSchedule, CreateProfile and CreateSkillGroup APIs

## __Amazon AppConfig__
  - ### Features
    - This release adds a hosted configuration source provider. Customers can now store their application configurations directly in AppConfig, without the need for an external configuration source.

## __Amazon Chime__
  - ### Features
    - feature: Chime: This release introduces the ability to create an AWS Chime SDK meeting with attendees.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Updated all AuthParameters to be sensitive.

# __1.11.802__ __2020-06-12__
## __AWS CloudFormation__
  - ### Features
    - The following parameters now return the organization root ID or organizational unit (OU) IDs that you specified for DeploymentTargets: the OrganizationalUnitIds parameter on StackSet and the OrganizationalUnitId parameter on StackInstance, StackInstanceSummary, and StackSetOperationResultSummary

## __AWS Glue__
  - ### Features
    - You can now choose to crawl the entire table or just a sample of records in DynamoDB when using AWS Glue crawlers. Additionally, you can also specify a scanning rate for crawling DynamoDB tables.

## __AWS Storage Gateway__
  - ### Features
    - Display EndpointType in DescribeGatewayInformation

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

# __1.11.801__ __2020-06-11__
## __AWS IoT Data Plane__
  - ### Features
    - As part of this release, we are introducing a new feature called named shadow, which extends the capability of AWS IoT Device Shadow to support multiple shadows for a single IoT device. With this release, customers can store different device state data into different shadows, and as a result access only the required state data when needed and reduce individual shadow size.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for deleting capacity providers.

## __Amazon Lex Model Building Service__
  - ### Features
    - This change adds the built-in AMAZON.KendraSearchIntent that enables integration with Amazon Kendra.

## __EC2 Image Builder__
  - ### Features
    - EC2 Image Builder now supports specifying a custom working directory for your build and test workflows. In addition, Image Builder now supports defining tags that are applied to ephemeral resources created by EC2 Image Builder as part of the image creation workflow. 

# __1.11.800__ __2020-06-10__
## __AWS Compute Optimizer__
  - ### Features
    - Compute Optimizer supports exporting recommendations to Amazon S3.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog Documentation Update for Integration with AWS Organizations Delegated Administrator feature

## __AWS Shield__
  - ### Features
    - Corrections to the supported format for contact phone numbers and to the description for the create subscription action.

## __Amazon AppConfig__
  - ### Features
    - This release allows customers to choose from a list of predefined deployment strategies while starting deployments.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Reducing the schedule name of DLM Lifecycle policy from 500 to 120 characters. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New C6g instances powered by AWS Graviton2 processors and ideal for running advanced, compute-intensive workloads; New R6g instances powered by AWS Graviton2 processors and ideal for running memory-intensive workloads.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for lightsail

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API removes support for the ArchiveFindings and UnarchiveFindings operations. This release also adds UNKNOWN as an encryption type for S3 bucket metadata.

## __CodeArtifact__
  - ### Features
    - Added support for AWS CodeArtifact.

# __1.11.799__ __2020-06-09__
## __AWS Transfer Family__
  - ### Features
    - This release updates the API so customers can test use of Source IP to allow, deny or limit access to data in their S3 buckets after integrating their identity provider.

# __1.11.798__ __2020-06-08__
## __AWS Cloud Map__
  - ### Features
    - Added support for tagging Service and Namespace type resources  in Cloud Map

## __AWS SDK for Java__
  - ### Bugfixes
    - Change the log level to warn when fetching credential fails. See [#2351](https://github.com/aws/aws-sdk-java/issues/2351)

## __AWS Shield__
  - ### Features
    - This release adds the option for customers to identify a contact name and method that the DDoS Response Team can proactively engage when a Route 53 Health Check that is associated with a Shield protected resource fails.

# __1.11.797__ __2020-06-05__
## __AWS Elastic Beanstalk__
  - ### Features
    - These API changes enable an IAM user to associate an operations role with an Elastic Beanstalk environment, so that the IAM user can call Elastic Beanstalk actions without having access to underlying downstream AWS services that these actions call.

## __AWS Service Catalog__
  - ### Features
    - This release adds support for DescribeProduct and DescribeProductAsAdmin by product name, DescribeProvisioningArtifact by product name or provisioning artifact name, returning launch paths as part of DescribeProduct output and adds maximum length for provisioning artifact name and provisioning artifact description.

## __Amazon API Gateway__
  - ### Features
    - Amazon API Gateway now allows customers of REST APIs to skip trust chain validation for backend server certificates for HTTP and VPC Link Integration. This feature enables customers to configure their REST APIs to integrate with backends that are secured with certificates vended from private certificate authorities (CA) or certificates that are self-signed.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for configurable origin connection attempts and origin connection timeout.

## __Amazon Personalize__
  - ### Features
    - [Personalize] Adds ability to create and apply filters.

## __Amazon Personalize Runtime__
  - ### Features
    - [Personalize] Adds ability to apply filter to real-time recommendations

## __Amazon Pinpoint__
  - ### Features
    - This release enables additional functionality for the Amazon Pinpoint journeys feature. With this release, you can send messages through additional channels, including SMS, push notifications, and custom channels.

## __Amazon SageMaker Runtime__
  - ### Features
    - You can now specify the production variant to send the inference request to, when invoking a SageMaker Endpoint that is running two or more variants.

# __1.11.796__ __2020-06-04__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - You can now restrict direct access to AWS Elemental MediaPackage by securing requests for VOD content using CDN authorization. With CDN authorization, content requests require a specific HTTP header and authorization code.

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for meteringmarketplace

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New C5a instances, the latest generation of EC2's compute-optimized instances featuring AMD's 2nd Generation EPYC processors. C5a instances offer up to 96 vCPUs, 192 GiB of instance memory, 20 Gbps in Network bandwidth; New G4dn.metal bare metal instance with 8 NVIDIA T4 GPUs.

## __Amazon Lightsail__
  - ### Features
    - This release adds the BurstCapacityPercentage and BurstCapacityTime instance metrics, which allow you to track the burst capacity available to your instance.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - SSM State Manager support for executing an association only at specified CRON schedule after creating/updating an association.

# __1.11.795__ __2020-06-03__
## __AWS Direct Connect__
  - ### Features
    - This release supports the virtual interface failover test, which allows you to verify that traffic routes over redundant virtual interfaces when you bring your primary virtual interface out of service.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for the encoding of VP8 or VP9 video in WebM container with Vorbis or Opus audio.

## __AWS Glue__
  - ### Features
    - Adding databaseName in the response for GetUserDefinedFunctions() API.

## __AWS Identity and Access Management__
  - ### Features
    - GenerateServiceLastAccessedDetails will now return ActionLastAccessed details for certain S3 control plane actions

## __Amazon ElastiCache__
  - ### Features
    - This release improves the Multi-AZ feature in ElastiCache by adding a separate flag and proper validations.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now offers support for cross-cluster search, enabling you to perform searches, aggregations, and visualizations across multiple Amazon Elasticsearch Service domains with a single query or from a single Kibana interface. New feature includes the ability to setup connection, required to perform cross-cluster search, between domains using an approval workflow.

# __1.11.794__ __2020-06-02__
## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty findings now include S3 bucket details under the resource section if an S3 Bucket was one of the affected resources

# __1.11.793__ __2020-06-01__
## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (AWS KMS): If the GenerateDataKeyPair or GenerateDataKeyPairWithoutPlaintext APIs are called on a CMK in a custom key store (origin == AWS_CLOUDHSM), they return an UnsupportedOperationException. If a call to UpdateAlias causes a customer to exceed the Alias resource quota, the UpdateAlias API returns a LimitExceededException.

## __AWS SDK for Java__
  - ### Bugfixes
    - Do not purge IMDS credentials if async credential refresh fails.
    - Fall back to cached credentials when calling IMDS fails after the refresh threshold has passed (assuming credentials have not expired).

## __Amazon Athena__
  - ### Features
    - This release adds support for connecting Athena to your own Apache Hive Metastores in addition to the AWS Glue Data Catalog. For more information, please see https://docs.aws.amazon.com/athena/latest/ug/connect-to-data-source-hive.html

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR now supports encrypting log files with AWS Key Management Service (KMS) customer managed keys.

## __Amazon FSx__
  - ### Features
    - New capabilities to update storage capacity and throughput capacity of your file systems, providing the flexibility to grow file storage and to scale up or down the available performance as needed to meet evolving storage needs over time.

## __Amazon SageMaker Service__
  - ### Features
    - We are releasing HumanTaskUiArn as a new parameter in CreateLabelingJob and RenderUiTemplate which can take an ARN for a system managed UI to render a task. 

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink now supports resource tagging for fleets.

# __1.11.792__ __2020-05-28__
## __AWS Marketplace Catalog Service__
  - ### Features
    - AWS Marketplace Catalog now supports accessing initial change payloads with DescribeChangeSet operation.

## __Amazon QLDB Session__
  - ### Features
    - Documentation updates for Amazon QLDB Session

## __Amazon WorkMail__
  - ### Features
    - This release adds support for Amazon WorkMail organization-level retention policies.

## __Managed Streaming for Kafka__
  - ### Features
    - New APIs for upgrading the Apache Kafka version of a cluster and to find out compatible upgrade paths

# __1.11.791__ __2020-05-27__
## __Amazon GuardDuty__
  - ### Features
    - Documentation updates for GuardDuty

## __Elastic Load Balancing__
  - ### Features
    - This release added support for HTTP/2 ALPN preference lists for Network Load Balancers

# __1.11.790__ __2020-05-26__
## __Amazon Data Lifecycle Manager__
  - ### Features
    - Allowing cron expression in the DLM policy creation schedule. 

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now allows you to use resource based policies to manage access to operations performed on ElastiCache resources. Also, Amazon ElastiCache now exposes ARN (Amazon Resource Names) for ElastiCache resources such as Cache Clusters and Parameter Groups. ARNs can be used to apply IAM policies to ElastiCache resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - ebsOptimizedInfo, efaSupported and supportedVirtualizationTypes added to DescribeInstanceTypes API

## __Amazon Macie__
  - ### Features
    - This is a documentation-only update to the Amazon Macie Classic API. This update corrects out-of-date references to the service name.

## __Amazon QuickSight__
  - ### Features
    - Add DataSetArns to QuickSight DescribeDashboard API response.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The AWS Systems Manager GetOpsSummary API action now supports multiple OpsResultAttributes in the request. Currently, this feature only supports OpsResultAttributes with the following TypeNames: [AWS:EC2InstanceComputeOptimizer] or [AWS:EC2InstanceInformation, AWS:EC2InstanceComputeOptimizer]. These TypeNames can be used along with either or both of the following: [AWS:EC2InstanceRecommendation, AWS:RecommendationSource]

# __1.11.789__ __2020-05-22__
## __AWS IoT SiteWise__
  - ### Features
    - This release adds support for the standard deviation auto-computed aggregate and improved support for portal logo images in SiteWise.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling

# __1.11.788__ __2020-05-21__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds support for tagging with report groups

## __Amazon Elastic Compute Cloud__
  - ### Features
    - From this release onwards ProvisionByoipCidr publicly supports IPv6. Updated ProvisionByoipCidr API to support tags for public IPv4 and IPv6 pools. Added NetworkBorderGroup to the DescribePublicIpv4Pools response.

## __Amazon Simple Storage Service__
  - ### Features
    - Deprecates unusable input members bound to Content-MD5 header. Updates example and documentation.

## __Synthetics__
  - ### Features
    - AWS CloudWatch Synthetics now supports configuration of allocated memory for a canary.

# __1.11.787__ __2020-05-20__
## __AWS App Mesh__
  - ### Features
    - List APIs for all resources now contain additional information: when a resource was created, last updated, and its current version number.

## __AWS Backup__
  - ### Features
    - This release allows customers to enable or disable AWS Backup support for an AWS resource type. This release also includes new APIs, update-region-settings and describe-region-settings, which can be used to opt in to a specific resource type. For all current AWS Backup customers, the default settings enable support for EBS, EC2, StorageGateway, EFS, DDB and RDS resource types. 

## __AWS CodeDeploy__
  - ### Features
    - Amazon ECS customers using application and network load balancers can use CodeDeploy BlueGreen hook to invoke a CloudFormation stack update. With this update you can view CloudFormation deployment and target details via existing APIs and use your stack Id to list or delete all deployments associated with the stack.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports the ability to ingest the content that is streaming from an AWS Elemental Link device: https://aws.amazon.com/medialive/features/link/. This release also adds support for SMPTE-2038 and input state waiters.

## __AWS SDK for Java__
  - ### Features
    - Add a public constructor in `WebIdentityTokenCredentialProvider` so that it can be used in other 3rd libraries that expect public constructors. See [#2121](https://github.com/aws/aws-sdk-java/issues/2121)

## __AWS SecurityHub__
  - ### Features
    - For findings related to controls, the finding information now includes the reason behind the current status of the control. A new field for the findings original severity allows finding providers to use the severity values from the system they use to assign severity.

## __Amazon Chime__
  - ### Features
    - Amazon Chime enterprise account administrators can now set custom retention policies on chat data in the Amazon Chime application.

## __Amazon S3__
  - ### Bugfixes
    - Fixed the signing region determination logic for endpoints with known suffixes. For example, "s3.dualstack.cn-north-1.amazonaws.com.cn" will now have a region of "cn-north-1", not "dualstack".

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds support for vocabulary filtering in streaming with which you can filter unwanted words from the real-time transcription results. Visit https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html  to learn more.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __1.11.786__ __2020-05-19__
## __AWS Health APIs and Notifications__
  - ### Features
    - Feature: Health: AWS Health added a new field to differentiate Public events from Account-Specific events in the API request and response. Visit https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html to learn more.

## __AWS SDK for Java__
  - ### Features
    - Added support for endpoint discovery in async client implementations for services that support endpoint discovery. This feature was already available for sync clients.

## __Amazon Chime__
  - ### Features
    - You can now receive Voice Connector call events through SNS or SQS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Federated Authentication via SAML-2.0 in AWS ClientVPN.

## __Amazon Transcribe Service__
  - ### Features
    - Documentation updates for Amazon Transcribe.

# __1.11.785__ __2020-05-18__
## __Amazon Chime__
  - ### Features
    - Amazon Chime now supports redacting chat messages.

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for dynamodb 

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for specifying environment files to add environment variables to your containers.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release changes the RunInstances CLI and SDK's so that if you do not specify a client token, a randomly generated token is used for the request to ensure idempotency.

## __Amazon Macie 2__
  - ### Features
    - Documentation updates for Amazon Macie

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports Amazon Kinesis data streams. You can now emit QLDB journal data, via the new QLDB Streams feature, directly to Amazon Kinesis supporting event processing and analytics among related use cases.

# __1.11.784__ __2020-05-15__
## __AWS CloudFormation__
  - ### Features
    - This release adds support for the following features: 1. DescribeType and ListTypeVersions APIs now output a field IsDefaultVersion, indicating if a version is the default version for its type; 2. Add StackRollbackComplete waiter feature to wait until stack status is UPDATE_ROLLBACK_COMPLETE; 3. Add paginators in DescribeAccountLimits, ListChangeSets, ListStackInstances, ListStackSetOperationResults, ListStackSetOperations, ListStackSets APIs.

## __AWS Glue__
  - ### Features
    - Starting today, you can stop the execution of Glue workflows that are running. AWS Glue workflows are directed acyclic graphs (DAGs) of Glue triggers, crawlers and jobs. Using a workflow, you can design a complex multi-job extract, transform, and load (ETL) activity that AWS Glue can execute and track as single entity. 

## __AWS Security Token Service__
  - ### Features
    - API updates for STS

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for specifying an image manifest media type when pushing a manifest to Amazon ECR.

# __1.11.783__ __2020-05-14__
## __AWS S3__
  - ### Features
    - Add `eu-south-1` region to Region enum

## __AWS SDK for Java__
  - ### Features
    - Add `eu-south-1` region to Regions enum

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now supports adding AWS resource tags for associations between VPCs and local gateways, at creation time.

## __EC2 Image Builder__
  - ### Features
    - This release adds a new parameter (SupportedOsVersions) to the Components API. This parameter lists the OS versions supported by a component.

# __1.11.782__ __2020-05-13__
## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now supports auto-update of ElastiCache clusters after the "recommended apply by date" of  service update has passed. ElastiCache will use your maintenance window to schedule the auto-update of applicable clusters. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Self-Service-Updates.html and https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Self-Service-Updates.html

## __Amazon Macie 2__
  - ### Features
    - This release introduces a new major version of the Amazon Macie API. You can use this version of the API to develop tools and applications that interact with the new Amazon Macie.

# __1.11.781__ __2020-05-12__
## __AWS IoT SiteWise__
  - ### Features
    - Documentation updates for iot-bifrost

## __Amazon WorkMail__
  - ### Features
    - Minor API fixes and updates to the documentation.

# __1.11.780__ __2020-05-11__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra is now generally available. As part of general availability, we are launching * Developer edition * Ability to scale your Amazon Kendra index with capacity units * Support for new connectors * Support for new tagging API's * Support for Deleting data source * Metrics for data source sync operations * Metrics for query & storage utilization

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Add Bitbucket integration APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - M6g instances are our next-generation general purpose instances powered by AWS Graviton2 processors

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where cancelling or waiting on a transfer manager upload too quickly after its initiation could result in inconsistent behavior.

# __1.11.779__ __2020-05-08__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for resourcegroupstaggingapi

## __Amazon GuardDuty__
  - ### Features
    - Documentation updates for GuardDuty

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new parameter (EnableInterContainerTrafficEncryption) to CreateProcessingJob API to allow for enabling inter-container traffic encryption on processing jobs.

# __1.11.778__ __2020-05-07__
## __AWS CodeBuild__
  - ### Features
    - Add COMMIT_MESSAGE enum for webhook filter types

## __Amazon AppConfig__
  - ### Features
    - The description of the AWS AppConfig GetConfiguration API action was amended to include important information about calling ClientConfigurationVersion when you configure clients to call GetConfiguration.

## __Amazon CloudWatch Logs__
  - ### Features
    - Amazon CloudWatch Logs now offers the ability to interact with Logs Insights queries via the new PutQueryDefinition, DescribeQueryDefinitions, and DeleteQueryDefinition APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now adds warnings to identify issues when creating a launch template or launch template version.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for the following options in instance public ports: Specify source IP addresses, specify ICMP protocol like PING, and enable/disable the Lightsail browser-based SSH and RDP clients' access to your instance.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the EU (Milan) Region (eu-south-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating patch baselines for Oracle Linux and Debian

# __1.11.777__ __2020-05-06__
## __AWS CodeStar connections__
  - ### Features
    - Added support for tagging resources in AWS CodeStar Connections

## __AWS Comprehend Medical__
  - ### Features
    - New Batch Ontology APIs for ICD-10 and RxNorm will provide batch capability of linking the information extracted by Comprehend Medical to medical ontologies. The new ontology linking APIs make it easy to detect medications and medical conditions in unstructured clinical text and link them to RxNorm and ICD-10-CM codes respectively. This new feature can help you reduce the cost, time and effort of processing large amounts of unstructured medical text with high accuracy.

# __1.11.776__ __2020-05-05__
## __AWS Support__
  - ### Features
    - Documentation updates for support

## __Amazon Elastic Compute Cloud__
  - ### Features
    - With this release, you can call ModifySubnetAttribute with two new parameters: MapCustomerOwnedIpOnLaunch and CustomerOwnedIpv4Pool, to map a customerOwnedIpv4Pool to a subnet. You will also see these two new fields in the DescribeSubnets response. If your subnet has a customerOwnedIpv4Pool mapped, your network interface will get an auto assigned customerOwnedIpv4 address when placed onto an instance.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Parameter Store launches new data type to support aliases in EC2 APIs

# __1.11.775__ __2020-05-04__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now supports Object Lock.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

## __Amazon Elastic Compute Cloud__
  - ### Features
    - With this release, you can include enriched metadata in Amazon Virtual Private Cloud (Amazon VPC) flow logs published to Amazon CloudWatch Logs or Amazon Simple Storage Service (S3). Prior to this, custom format VPC flow logs enriched with additional metadata could be published only to S3. With this launch, we are also adding additional metadata fields that provide insights about the location such as AWS Region, AWS Availability Zone, AWS Local Zone, AWS Wavelength Zone, or AWS Outpost where the network interface where flow logs are captured exists. 

# __1.11.774__ __2020-05-01__
## __Amazon Elastic File System__
  - ### Features
    - Change the TagKeys argument for UntagResource to a URL parameter to address an issue with the Java and .NET SDKs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added TimeoutSeconds as part of ListCommands API response.

# __1.11.773__ __2020-04-30__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for including AFD signaling in MXF wrapper.

## __AWS IoT__
  - ### Features
    - AWS IoT Core released Fleet Provisioning for scalable onboarding of IoT devices to the cloud. This release includes support for customer's Lambda functions to validate devices during onboarding. Fleet Provisioning also allows devices to send Certificate Signing Requests (CSR) to AWS IoT Core for signing and getting a unique certificate. Lastly,  AWS IoT Core added a feature to register the same certificate for multiple accounts in the same region without needing to register the certificate authority (CA).

## __AWS IoT Events__
  - ### Features
    - Doc only update to correct APIs and related descriptions

## __AWS Lambda__
  - ### Features
    - Documentation updates for Lambda

## __AWS Storage Gateway__
  - ### Features
    - Adding support for S3_INTELLIGENT_TIERING as a storage class option

## __Schemas__
  - ### Features
    - Add support for resource policies for Amazon EventBridge Schema Registry, which is now generally available.

# __1.11.772__ __2020-04-29__
## __AWS Cloud Map__
  - ### Features
    - Documentation updates for servicediscovery

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise is a managed service that makes it easy to collect, store, organize and monitor data from industrial equipment at scale. You can use AWS IoT SiteWise to model your physical assets, processes and facilities, quickly compute common industrial performance metrics, and create fully managed web applications to help analyze industrial equipment data, prevent costly equipment issues, and reduce production inefficiencies.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fix an issue where the SDK fails to update the estimated clock skew and causes `Time is too skewed to adjust` error to be thrown. See [#2305](https://github.com/aws/aws-sdk-java/issues/2305)

## __AWS WAF__
  - ### Features
    - This release add migration API for AWS WAF Classic ("waf" and "waf-regional"). The migration API will parse through your web ACL and generate a CloudFormation template into your S3 bucket. Deploying this template will create equivalent web ACL under new AWS WAF ("wafv2").

## __AWS WAF Regional__
  - ### Features
    - This release add migration API for AWS WAF Classic ("waf" and "waf-regional"). The migration API will parse through your web ACL and generate a CloudFormation template into your S3 bucket. Deploying this template will create equivalent web ACL under new AWS WAF ("wafv2").

## __Amazon Transcribe Service__
  - ### Features
    - With this release, you can now use Amazon Transcribe to create medical custom vocabularies and use them in both medical real-time streaming and medical batch transcription jobs.

# __1.11.771__ __2020-04-28__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports several new features: enhanced VQ for H.264 (AVC) output encodes; passthrough of timed metadata and of Nielsen ID3 metadata in fMP4 containers in HLS outputs; the ability to generate a SCTE-35 sparse track without additional segmentation, in Microsoft Smooth outputs;  the ability to select the audio from a TS input by specifying the audio track; and conversion of HDR colorspace in the input to an SDR colorspace in the output.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for multi-architecture images also known as a manifest list

## __Amazon Kinesis Video Streams__
  - ### Features
    - Add "GET_CLIP" to the list of supported API names for the GetDataEndpoint API.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Add support for the GetClip API for retrieving media from a video stream in the MP4 format.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Africa (Cape Town) Region (af-south-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - SSM State Manager support for adding list association filter for Resource Group and manual mode of managing compliance for an association. 

# __1.11.770__ __2020-04-27__
## __AWS Data Exchange__
  - ### Features
    - This release introduces AWS Data Exchange support for configurable encryption parameters when exporting data sets to Amazon S3. 

## __AWS Database Migration Service__
  - ### Features
    - Adding minimum replication engine version for describe-endpoint-types api.

## __Access Analyzer__
  - ### Features
    - This release adds support for inclusion of S3 Access Point policies in IAM Access Analyzer evaluation of S3 bucket access. IAM Access Analyzer now reports findings for buckets shared through access points and identifies the access point that permits access.

## __Amazon SageMaker Service__
  - ### Features
    - Change to the input, ResourceSpec, changing EnvironmentArn to SageMakerImageArn. This affects the following preview APIs: CreateDomain, DescribeDomain, UpdateDomain, CreateUserProfile, DescribeUserProfile, UpdateUserProfile, CreateApp and DescribeApp.

# __1.11.769__ __2020-04-24__
## __AWS IoT__
  - ### Features
    - This release adds a new exception type to the AWS IoT SetV2LoggingLevel API.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Enable 1hour frequency in the schedule creation for Data LifeCycle Manager.

## __Amazon Elastic  Inference__
  - ### Features
    - This feature allows customers to describe the accelerator types and offerings on any region where Elastic Inference is available.

# __1.11.768__ __2020-04-23__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds tagging support for PackagingGroups, PackagingConfigurations, and Assets

## __AWS Resource Access Manager__
  - ### Features
    - AWS Resource Access Manager (RAM) provides a new ListResourceTypes action. This action lets you list the resource types that can be shared using AWS RAM.

## __AWS S3__
  - ### Features
    - Add `af-south-1` region to Region enum

## __AWS SDK for Java__
  - ### Features
    - Add `af-south-1` region to Regions enum

## __AWS Storage Gateway__
  - ### Features
    - Added AutomaticTapeCreation APIs

## __AWS Transfer Family__
  - ### Features
    - This release adds support for transfers over FTPS and FTP in and out of Amazon S3, which makes it easy to migrate File Transfer Protocol over SSL (FTPS) and FTP workloads to AWS, in addition to the existing support for Secure File Transfer Protocol (SFTP).

## __Amazon Kinesis Firehose__
  - ### Features
    - You can now deliver streaming data to an Amazon Elasticsearch Service domain in an Amazon VPC. You can now compress streaming data delivered to S3 using Hadoop-Snappy in addition to Gzip, Zip and Snappy formats.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API enhances support for sending campaigns through custom channels to locations such as AWS Lambda functions or web applications. Campaigns can now use CustomDeliveryConfiguration and CampaignCustomMessage to configure custom channel settings for a campaign.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for AWS Local Zones, including a new optional parameter AvailabilityZoneGroup for the DescribeOrderableDBInstanceOptions operation.

## __Application Auto Scaling__
  - ### Features
    - This release supports Auto Scaling in Amazon Keyspaces for Apache Cassandra.

# __1.11.767__ __2020-04-22__
## __Amazon CodeGuru Reviewer__
  - ### Features
    - Add support for code review and recommendation feedback APIs.

## __Amazon Elasticsearch Service__
  - ### Features
    - This change adds a new field 'OptionalDeployment' to ServiceSoftwareOptions to indicate whether a service software update is optional or mandatory. If True, it indicates that the update is optional, and the service software is not automatically updated. If False, the service software is automatically updated after AutomatedUpdateDate.

## __Amazon Redshift__
  - ### Features
    - Amazon Redshift support for usage limits

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Adding ServiceUnavailableException as one of the expected exceptions

## __Firewall Management Service__
  - ### Features
    - This release is to support AWS Firewall Manager policy with Organizational Unit scope. 

# __1.11.766__ __2020-04-21__
## __AWS Cost Explorer Service__
  - ### Features
    - Cost Explorer Rightsizing Recommendations integrates with Compute Optimizer and begins offering across instance family rightsizing recommendations, adding to existing support for within instance family rightsizing recommendations. 

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds support for configuring a managed scaling policy for an Amazon EMR cluster. This enables automatic resizing of a cluster to optimize for job execution speed and reduced cluster cost.

## __Amazon GuardDuty__
  - ### Features
    - AWS GuardDuty now supports using AWS Organizations delegated administrators to create and manage GuardDuty master and member accounts.  The feature also allows GuardDuty to be automatically enabled on associated organization accounts.

## __Amazon Route 53 Domains__
  - ### Features
    - You can now programmatically transfer domains between AWS accounts without having to contact AWS Support

# __1.11.765__ __2020-04-20__
## __AWS Cost Explorer Service__
  - ### Features
    - Cost Categories API is now General Available with new dimensions and operations support. You can map costs by account name, service, and charge type dimensions as well as use contains, starts with, and ends with operations. Cost Categories can also be used in RI and SP coverage reports.

## __AWS Glue__
  - ### Features
    - Added a new ConnectionType "KAFKA" and a ConnectionProperty "KAFKA_BOOTSTRAP_SERVERS" to support Kafka connection.

## __AWS IoT Events__
  - ### Features
    - API update that allows users to add AWS Iot SiteWise actions while creating Detector Model in AWS Iot Events

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug where the `TransferManager` was not copying the request override credentials provider to new requests it creates for `upload()`, `download()` and `copy()`.

## __AmazonApiGatewayV2__
  - ### Features
    - You can now export an OpenAPI 3.0 compliant API definition file for Amazon API Gateway HTTP APIs using the Export API.

## __Synthetics__
  - ### Features
    - Introducing CloudWatch Synthetics. This is the first public release of CloudWatch Synthetics.

# __1.11.764__ __2020-04-17__
## __AWS OpsWorks CM__
  - ### Features
    - Documentation updates for opsworkscm

## __Amazon Fraud Detector__
  - ### Features
    - Added support for a new rule engine execution mode. Customers will be able to configure their detector versions to evaluate all rules and return outcomes from all 'matched' rules in the GetPrediction API response. Added support for deleting Detectors (DeleteDetector) and Rule Versions (DeleteRuleVersion).

# __1.11.763__ __2020-04-16__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert now allows you to specify your input captions frame rate for SCC captions sources.

## __AWS Glue__
  - ### Features
    - This release adds support for querying GetUserDefinedFunctions API without databaseName.

## __AWS IoT Events__
  - ### Features
    - API update that allows users to customize event action payloads, and adds support for Amazon DynamoDB actions.

## __AWS Lambda__
  - ### Features
    - Sample code for AWS Lambda operations

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of Avail Suppression.

## __AWS Migration Hub__
  - ### Features
    - Adding ThrottlingException

## __AWS SecurityHub__
  - ### Features
    - Added a new BatchUpdateFindings action, which allows customers to update selected information about their findings. Security Hub customers use BatchUpdateFindings to track their investigation into a finding. BatchUpdateFindings is intended to replace the UpdateFindings action, which is deprecated.

## __Amazon Augmented AI Runtime__
  - ### Features
    - This release updates Amazon Augmented AI ListHumanLoops and StartHumanLoop APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now supports adding AWS resource tags for placement groups and key pairs, at creation time. The CreatePlacementGroup API will now return placement group information when created successfully. The DeleteKeyPair API now supports deletion by resource ID.

## __Amazon Import/Export Snowball__
  - ### Features
    - An update to the Snowball Edge Storage Optimized device has been launched. Like the previous version, it has 80 TB of capacity for data transfer. Now it has 40 vCPUs, 80 GiB, and a 1 TiB SATA SSD of memory for EC2 compatible compute. The 80 TB of capacity can also be used for EBS-like volumes for AMIs.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Proxy with PostgreSQL compatibility.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports running training jobs on ml.g4dn and ml.c5n instance types. Amazon SageMaker supports in "IN" operation for Search now.

## __EC2 Image Builder__
  - ### Features
    - This release includes support for additional OS Versions within EC2 Image Builder.

# __1.11.762__ __2020-04-08__
## __AWS CloudFormation__
  - ### Features
    - The OrganizationalUnitIds parameter on StackSet and the OrganizationalUnitId parameter on StackInstance, StackInstanceSummary, and StackSetOperationResultSummary are now reserved for internal use. No data is returned for this parameter.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK adds support for queue hopping. Jobs can now hop from their original queue to a specified alternate queue, based on the maximum wait time that you specify in the job settings.

## __AWS Migration Hub Config__
  - ### Features
    - Adding ThrottlingException

## __Amazon Chime__
  - ### Features
    - feature: Chime: This release introduces the ability to tag Amazon Chime SDK meeting resources.  You can use tags to organize and identify your resources for cost allocation. 

## __Amazon CodeGuru Profiler__
  - ### Features
    - CodeGuruProfiler adds support for resource based authorization to submit profile data.

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides native support for specifying Amazon EFS file systems as volumes in your Amazon ECS task definitions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides the ability to include tags in EC2 event notifications. 

# __1.11.761__ __2020-04-07__
## __AWS MediaConnect__
  - ### Features
    - You can now send content from your MediaConnect flow to your virtual private cloud (VPC) without going over the public internet.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - API updates for CodeGuruReviewer 

# __1.11.760__ __2020-04-06__
## __AWS Elastic Beanstalk__
  - ### Features
    - This release adds a new action, ListPlatformBranches, and updates two actions, ListPlatformVersions and DescribePlatformVersion, to support the concept of Elastic Beanstalk platform branches.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __Amazon Chime__
  - ### Features
    - Amazon Chime proxy phone sessions let you provide two users with a shared phone number to communicate via voice or text for up to 12 hours without revealing personal phone numbers. When users call or message the provided phone number, they are connected to the other party and their private phone numbers are replaced with the shared number in Caller ID.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for batch transcription jobs within Amazon Transcribe Medical.

# __1.11.759__ __2020-04-03__
## __AWS RoboMaker__
  - ### Features
    - Added support for limiting simulation unit usage, giving more predictable control over simulation cost

## __Amazon Personalize Runtime__
  - ### Features
    - Amazon Personalize: Add new response field "score" to each item returned by GetRecommendations and GetPersonalizedRanking (HRNN-based recipes only)

# __1.11.758__ __2020-04-02__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports Automatic Input Failover. This feature provides resiliency upstream of the channel, before ingest starts.

## __Amazon CloudWatch__
  - ### Features
    - Amazon CloudWatch Contributor Insights adds support for tags and tagging on resource creation. 

## __Amazon GameLift__
  - ### Features
    - Public preview of GameLift FleetIQ as a standalone feature. GameLift FleetIQ makes it possible to use low-cost Spot instances by limiting the chance of interruptions affecting game sessions. FleetIQ is a feature of the managed GameLift service, and can now be used with game hosting in EC2 Auto Scaling groups that you manage in your own account.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS: creating read replicas is now supported for SQL Server DB instances

# __1.11.757__ __2020-04-01__
## __AWS IoT__
  - ### Features
    - This release introduces Dimensions for AWS IoT Device Defender. Dimensions can be used in Security Profiles to collect and monitor fine-grained metrics.

## __AWS MediaConnect__
  - ### Features
    - You can now send content from your virtual private cloud (VPC) to your MediaConnect flow without going over the public internet.

# __1.11.756__ __2020-03-31__
## __AWS Elemental MediaStore__
  - ### Features
    - This release adds support for CloudWatch Metrics. You can now set a policy on your container to dictate which metrics MediaStore sends to CloudWatch.

## __AWS Glue__
  - ### Features
    - Add two enums for MongoDB connection: Added "CONNECTION_URL" to "ConnectionPropertyKey" and added "MONGODB" to "ConnectionType"

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports .NET Core 3.1

## __AWS OpsWorks CM__
  - ### Features
    - Documentation updates for OpsWorks-CM CreateServer values.

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Storage Gateway__
  - ### Features
    - Adding audit logging support for SMB File Shares

## __AWS WAFV2__
  - ### Features
    - Added support for AWS Firewall Manager for WAFv2 and PermissionPolicy APIs for WAFv2.

## __Amazon AppConfig__
  - ### Features
    - This release adds an event log to deployments. In the case of a deployment rollback, the event log details the rollback reason.

## __Amazon Detective__
  - ### Features
    - Removing the notes that Detective is in preview, in preparation for the Detective GA release.

## __Amazon Elastic  Inference__
  - ### Features
    - This release includes improvements for the Amazon Elastic Inference service.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces MMS support for SMS messages.

## __Amazon Rekognition__
  - ### Features
    - This release adds DeleteProject and DeleteProjectVersion APIs to Amazon Rekognition Custom Labels.

## __Firewall Management Service__
  - ### Features
    - This release contains FMS wafv2 support.

# __1.11.755__ __2020-03-30__
## __Access Analyzer__
  - ### Features
    - This release adds support for the creation and management of IAM Access Analyzer analyzers with type organization. An analyzer with type organization continuously monitors all supported resources within the AWS organization and reports findings when they allow access from outside the organization.

# __1.11.754__ __2020-03-27__
## __AWS Global Accelerator__
  - ### Features
    - This update adds an event history to the ListByoipCidr API call. This enables you to see the changes that you've made for an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).

## __AWS Service Catalog__
  - ### Features
    - Added "LocalRoleName" as an acceptable Parameter for Launch type in CreateConstraint and UpdateConstraint APIs

## __AWSKendraFrontendService__
  - ### Features
    - The Amazon Kendra Microsoft SharePoint data source now supports include and exclude regular expressions and change log features. Include and exclude regular expressions enable you to  provide a list of regular expressions to match the display URL of SharePoint documents to either include or exclude documents respectively. When you enable the changelog feature it enables Amazon Kendra to use the SharePoint change log to determine which documents to update in the index.

# __1.11.753__ __2020-03-26__
## __AWS SDK for Java__
  - ### Bugfixes
    - Remove `LimitExceededException` as many services don't treat it as a throttling exception.

## __AWS SecurityHub__
  - ### Features
    - Security Hub has now made it easier to opt out of default standards when you enable Security Hub. We added a new Boolean parameter to EnableSecurityHub called EnableDefaultStandards. If that parameter is true, Security Hub's default standards are enabled. A new Boolean parameter for standards, EnabledByDefault, indicates whether a standard is a default standard. Today, the only default standard is CIS AWS Foundations Benchmark v1.2. Additional default standards will be added in the future.To learn more, visit our documentation on the EnableSecurityHub API action.

## __Amazon FSx__
  - ### Features
    - This release includes two changes: a new lower-cost, storage type called HDD (Hard Disk Drive), and a new generation of the Single-AZ deployment type called Single AZ 2. The HDD storage type can be selected on Multi AZ 1 and Single AZ 2 deployment types.

## __Amazon SageMaker Service__
  - ### Features
    - This release updates Amazon Augmented AI CreateFlowDefinition API and DescribeFlowDefinition response.

# __1.11.752__ __2020-03-25__
## __AWS Cost Explorer Service__
  - ### Features
    - Customers can now receive Savings Plans recommendations at the member (linked) account level.

## __AWS X-Ray__
  - ### Features
    - GetTraceSummaries - Now provides additional root cause attribute ClientImpacting which indicates whether root cause impacted trace client.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Amazon CloudWatch Application Insights for .NET and SQL Server now integrates with Amazon CloudWatch Events (AWS CodeDeploy, AWS Health and Amazon EC2 state changes). This feature enables customers to view events related to problems detected by CloudWatch Application Insights, and reduce mean-time-to-resolution (MTTR).

## __Amazon Detective__
  - ### Features
    - The new ACCEPTED_BUT_DISABLED member account status indicates that a member account that accepted the invitation is blocked from contributing data to the behavior graph. The reason is provided in the new DISABLED_REASON property. The new StartMonitoringMember operation enables a blocked member account.

## __Amazon Elasticsearch Service__
  - ### Features
    - Adding support for customer packages (dictionary files) to Amazon Elasticsearch Service

## __Amazon Managed Blockchain__
  - ### Features
    - Amazon Managed Blockchain now has support to publish Hyperledger Fabric peer node, chaincode, and certificate authority (CA) logs to Amazon CloudWatch Logs.

# __1.11.751__ __2020-03-24__
## __AWS Organizations__
  - ### Features
    - Introduces actions for giving a member account administrative Organizations permissions for an AWS service. You can run this action only for AWS services that support this feature.

## __AWS RDS DataService__
  - ### Features
    - Documentation updates for rds-data

## __Amazon Athena__
  - ### Features
    - Documentation updates for Athena, including QueryExecutionStatus QUEUED and RUNNING states. QUEUED now indicates that the query has been submitted to the service. RUNNING indicates that the query is in execution phase.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error codes: Ec2SubnetInvalidConfiguration and NodeCreationFailure for Nodegroups in EKS

# __1.11.750__ __2020-03-23__
## __AWS S3 Transfer Manager__
  - ### Bugfixes
    - Fix an issue in multipart download where the SDK did not report failed status for individual part download failure. See [#2263](https://github.com/aws/aws-sdk-java/issues/2263).
    - Fix an issue in mutlipart upload where the remaining part futures were not cancelled when multipart upload failed. See [#2267](https://github.com/aws/aws-sdk-java/issues/2267)

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code IamLimitExceeded for Nodegroups in EKS

## __Amazon Route 53__
  - ### Features
    - Documentation updates for Route 53.

## __AmazonApiGatewayV2__
  - ### Features
    - Documentation updates to reflect that the default timeout for integrations is now 30 seconds for HTTP APIs.

# __1.11.749__ __2020-03-20__
## __AWS Service Catalog__
  - ### Features
    - Added "productId" and "portfolioId" to responses from CreateConstraint, UpdateConstraint, ListConstraintsForPortfolio, and DescribeConstraint APIs

# __1.11.748__ __2020-03-19__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager documentation updated on API calls ImportCertificate and ListCertificate. Specific updates included input constraints, private key size for import and next token size for list.

## __AWS Outposts__
  - ### Features
    - Documentation updates for AWS Outposts.

# __1.11.747__ __2020-03-18__
## __AWS MediaConnect__
  - ### Features
    - Feature adds the ability for a flow to have multiple redundant sources that provides resiliency to a source failing. The new APIs added to enable the feature are, AddFlowSources, RemoveFlowSource and UpdateFlow.

## __Amazon Personalize__
  - ### Features
    - [Personalize] Adds support for returning hyperparameter values of the best performing model in a HPO job.

## __Amazon Relational Database Service__
  - ### Features
    - Updated the MaxRecords type in DescribeExportTasks to Integer.

# __1.11.746__ __2020-03-17__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for: AV1 encoding in File Group MP4, DASH and CMAF DASH outputs; PCM/WAV audio output in MPEG2-TS containers; and Opus audio in Webm inputs.

# __1.11.745__ __2020-03-16__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 now supports Batch Operations job tagging.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Additional response field "CompromisedCredentialsDetected" added to AdminListUserAuthEvents.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds the ability to update the task placement strategy and constraints for Amazon ECS services.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now supports Global Datastore for Redis. Global Datastore for Redis offers fully managed, fast, reliable and secure cross-region replication. Using Global Datastore for Redis, you can create cross-region read replica clusters for ElastiCache for Redis to enable low-latency reads and disaster recovery across regions. You can create, modify and describe a Global Datastore, as well as add or remove regions from your Global Datastore and promote a region as primary in Global Datastore.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Resource data sync for AWS Systems Manager Inventory now includes destination data sharing. This feature enables you to synchronize inventory data from multiple AWS accounts into a central Amazon S3 bucket. To use this feature, all AWS accounts must be listed in AWS Organizations.

# __1.11.744__ __2020-03-13__
## __Amazon AppConfig__
  - ### Features
    - This release adds S3 as a configuration source provider.

# __1.11.743__ __2020-03-12__
## __AWS IoT__
  - ### Features
    - As part of this release, we are extending capability of AWS IoT Rules Engine to support IoT Cloudwatch log action. The IoT Cloudwatch log rule action lets you send messages from IoT sensors and applications to Cloudwatch logs for troubleshooting and debugging.

## __AWS SecurityHub__
  - ### Features
    - The AWS Security Finding Format is being augmented with the following changes. 21 new resource types without corresponding details objects are added. Another new resource type, AwsS3Object, has an accompanying details object. Severity.Label is a new string field that indicates the severity of a finding. The available values are: INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL. The new string field Workflow.Status indicates the status of the investigation into a finding. The available values are: NEW, NOTIFIED, RESOLVED, SUPPRESSED.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports tagging for bots, bot aliases and bot channels. 

## __AmazonApiGatewayV2__
  - ### Features
    - Amazon API Gateway HTTP APIs is now generally available. HTTP APIs offer the core functionality of REST API at up to 71% lower price compared to REST API, 60% lower p99 latency, and is significantly easier to use. As part of general availability, we added new features to route requests to private backends such as private ALBs, NLBs, and IP/ports. We also brought over a set of features from REST API such as Stage Variables, and Stage/Route level throttling. Custom domain names can also now be used with both REST And HTTP APIs.

# __1.11.742__ __2020-03-11__
## __Amazon DynamoDB Mapper__
  - ### Bugfixes
    - Add support for DynamoDBMapper transaction update to include additional attribute values provided by an AttributeTransformer.

## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for elasticfilesystem

## __Amazon Redshift__
  - ### Features
    - Amazon Redshift now supports operations to pause and resume a cluster on demand or on a schedule.

# __1.11.741__ __2020-03-10__
## __AWS IoT Events__
  - ### Features
    - API update that adds a new parameter, durationExpression, to SetTimerAction, and deprecates seconds

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Change the disbursement data set to look past 31 days instead until the beginning of the month.

## __AWSServerlessApplicationRepository__
  - ### Features
    - AWS Serverless Application Repository now supports sharing applications privately with AWS Organizations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe's Automatic Content Redaction feature enables you to automatically redact sensitive personally identifiable information (PII) from transcription results. It replaces each instance of an identified PII utterance with a [PII] tag in the transcript.

# __1.11.740__ __2020-03-09__
## __AWS Database Migration Service__
  - ### Features
    - Added new settings for Kinesis target to include detailed transaction info; to capture table DDL details; to use single-line unformatted json, which can be directly queried by AWS Athena if data is streamed into S3 through AWS Kinesis Firehose. Added CdcInsertsAndUpdates in S3 target settings to allow capture ongoing insertions and updates only.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports the ability to configure the Preferred Channel Pipeline for channels contributing to a Multiplex.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon Virtual Private Cloud (VPC) NAT Gateway adds support for tagging on resource creation.

# __1.11.739__ __2020-03-06__
## __AWS App Mesh__
  - ### Features
    - App Mesh now supports sharing a Mesh with other AWS accounts. Customers can use AWS Resource Access Manager to share their Mesh with other accounts in their organization to connection applications within a single service mesh. See https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html for details.

## __AWS RoboMaker__
  - ### Features
    - Added support for streaming a GUI from robot and simulation applications

## __AWS Signer__
  - ### Features
    - This release enables signing image format override in PutSigningProfile requests, adding two more enum fields, JSONEmbedded and JSONDetached. This release also extends the length limit of SigningProfile name from 20 to 64.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides customers with a self-service option to enable Local Zones.

## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty findings now include the OutpostArn if the finding is generated for an AWS Outposts EC2 host.

# __1.11.738__ __2020-03-05__
## __AWS OpsWorks CM__
  - ### Features
    - Updated the Tag regex pattern to align with AWS tagging APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now create AWS Client VPN Endpoints with a specified VPC and Security Group. Additionally, you can modify these attributes when modifying the endpoint. 

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports adding a KMS key to your cluster for envelope encryption of Kubernetes secrets.

## __Amazon GuardDuty__
  - ### Features
    - Add a new finding field for EC2 findings indicating the instance's local IP address involved in the threat.

# __1.11.737__ __2020-03-04__
## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for integrating recommender models with email, push notification, and SMS message templates. You can now use these types of templates to connect to recommender models and add personalized recommendations to messages that you send from campaigns and journeys.

# __1.11.736__ __2020-03-03__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon VPC Flow Logs adds support for tags and tagging on resource creation.

# __1.11.735__ __2020-03-02__
## __AWS Comprehend Medical__
  - ### Features
    - New Time Expression feature, part of DetectEntitiesV2 API will provide temporal relations to existing NERe entities such as Medication, Test, Treatment, Procedure and Medical conditions. 

## __Amazon CloudWatch__
  - ### Features
    - Introducing Amazon CloudWatch Composite Alarms

# __1.11.734__ __2020-02-28__
## __AWS Config__
  - ### Features
    - Correcting list of supported resource types.

# __1.11.733__ __2020-02-28__
## __AWS App Mesh__
  - ### Features
    - App Mesh now supports Transport Layer Security (TLS) between Virtual Nodes in a Mesh. Customers can use managed certificates from an AWS Certificate Manager Private Certificate Authority or bring their own certificates from the local file system to encrypt traffic between their workloads. See https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html for details.

## __AWS Config__
  - ### Features
    - Accepts a structured query language (SQL) SELECT command and an aggregator name, performs the corresponding search on resources aggregated by the aggregator, and returns resource configurations matching the properties.

## __AWS Glue__
  - ### Features
    - AWS Glue adds resource tagging support for Machine Learning Transforms and adds a new API, ListMLTransforms to support tag filtering.  With this feature, customers can use tags in AWS Glue to organize and control access to Machine Learning Transforms. 

## __Access Analyzer__
  - ### Features
    - This release includes improvements and fixes bugs for the IAM Access Analyzer feature.

## __Amazon Augmented AI Runtime__
  - ### Features
    - This release updates Amazon Augmented AI ListHumanLoops API, DescribeHumanLoop response, StartHumanLoop response and type names of SDK fields. 

## __Amazon CodeGuru Profiler__
  - ### Features
    - Documentation updates for Amazon CodeGuru Profiler

## __Amazon QuickSight__
  - ### Features
    - Added SearchDashboards API that allows listing of dashboards that a specific user has access to.

## __Amazon WorkDocs__
  - ### Features
    - Documentation updates for workdocs

## __Elastic Load Balancing__
  - ### Features
    - Added a target group attribute to support sticky sessions for Network Load Balancers.

# __1.11.732__ __2020-02-27__
## __AWS Global Accelerator__
  - ### Features
    - This release adds support for adding tags to accelerators and bringing your own IP address to AWS Global Accelerator (BYOIP).

## __Amazon Lightsail__
  - ### Features
    - Adds support to create notification contacts in Amazon Lightsail, and to create instance, database, and load balancer metric alarms that notify you based on the value of a metric relative to a threshold that you specify.

# __1.11.731__ __2020-02-26__
## __AWS SecurityHub__
  - ### Features
    - Security Hub has added to the DescribeProducts API operation a new response field called IntegrationTypes. The IntegrationTypes field lists the types of actions that a product performs relative to Security Hub such as send findings to Security Hub and receive findings from Security Hub.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release changes the RunInstances CLI and SDK's so that if you do not specify a client token, a randomly generated token is used for the request to ensure idempotency.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker UpdateEndpoint API now supports retained variant properties, e.g., instance count, variant weight. SageMaker ListTrials API filter by TrialComponentName. Make ExperimentConfig name length limits consistent with CreateExperiment, CreateTrial, and CreateTrialComponent APIs.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe's Automatic Content Redaction feature enables you to automatically redact sensitive personally identifiable information (PII) from transcription results. It replaces each instance of an identified PII utterance with a [PII] tag in the transcript.

# __1.11.730__ __2020-02-25__
## __AWS Outposts__
  - ### Features
    - This release adds DeleteSite and DeleteOutpost. 

## __AWS Secrets Manager__
  - ### Features
    - This release increases the maximum allowed size of SecretString or SecretBinary from 10KB to 64KB in the CreateSecret, UpdateSecret, PutSecretValue and GetSecretValue APIs.

## __AWS Step Functions__
  - ### Features
    - This release adds support for CloudWatch Logs for Standard Workflows.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added support for Broker Log delivery to CloudWatch, S3, and Firehose.

# __1.11.729__ __2020-02-24__
## __AWS IoT Events__
  - ### Features
    - Documentation updates for iotcolumbo

## __Amazon CloudWatch Events__
  - ### Features
    - This release allows you to create and manage tags for event buses.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Documentation updates for docdb

## __Amazon EventBridge__
  - ### Features
    - This release allows you to create and manage tags for event buses.

## __Amazon FSx__
  - ### Features
    - Announcing persistent file systems for Amazon FSx for Lustre that are ideal for longer-term storage and workloads, and a new generation of scratch file systems that offer higher burst throughput for spiky workloads.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snowball adds a field for entering your GSTIN when creating AWS Snowball jobs in the Asia Pacific (Mumbai) region. 

# __1.11.728__ __2020-02-21__
## __AWS WAFV2__
  - ### Features
    - Documentation updates for AWS WAF (wafv2) to correct the guidance for associating a web ACL to a CloudFront distribution.

## __Amazon Redshift__
  - ### Features
    - Extend elastic resize to support resizing clusters to different instance types.

## __EC2 Image Builder__
  - ### Features
    - This release of EC2 Image Builder increases the maximum policy document size for Image Builder resource-based policy APIs.

# __1.11.727__ __2020-02-20__
## __AWS Savings Plans__
  - ### Features
    - Added support for AWS Lambda in Compute Savings Plans

## __Amazon AppConfig__
  - ### Features
    - This release adds exponential growth type support for deployment strategies.

## __Amazon Pinpoint__
  - ### Features
    - As of this release of the Amazon Pinpoint API, the Title property is optional for the CampaignEmailMessage object. 

# __1.11.726__ __2020-02-19__
## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Ruby 2.7

## __AWS Service Catalog__
  - ### Features
    - "ListPortfolioAccess" API now has a new optional parameter "OrganizationParentId". When it is provided and if the portfolio with the "PortfolioId" given was shared with an organization or organizational unit with "OrganizationParentId", all accounts in the organization sub-tree under parent which inherit an organizational portfolio share will be listed, rather than all accounts with external shares. To accommodate long lists returned from the new option, the API now supports pagination.

## __Auto Scaling__
  - ### Features
    - Doc update for EC2 Auto Scaling: Add Enabled parameter for PutScalingPolicy

# __1.11.725__ __2020-02-18__
## __Amazon Chime__
  - ### Features
    - Added AudioFallbackUrl to support Chime SDK client.

## __Amazon Relational Database Service__
  - ### Features
    - This release supports Microsoft Active Directory authentication for Amazon Aurora.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports the ability to enable/disable target tracking, step scaling, and simple scaling policies.

# __1.11.724__ __2020-02-17__
## __AWS Cloud9__
  - ### Features
    - AWS Cloud9 now supports the ability to tag Cloud9 development environments. 

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB enables you to restore your DynamoDB backup or table data across AWS Regions such that the restored table is created in a different AWS Region from where the source table or backup resides. You can do cross-region restores between AWS commercial Regions, AWS China Regions, and AWS GovCloud (US) Regions. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Amazon Rekognition__
  - ### Features
    - This update adds the ability to detect text in videos and adds filters to image and video text detection.

# __1.11.723__ __2020-02-14__
## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of Personalization Threshold for HLS and DASH streams.

## __AWS SecurityHub__
  - ### Features
    - Security Hub has released a new DescribeStandards API action. This API action allows a customer to list all of the standards available in an account. For each standard, the list provides the customer with the standard name, description, and ARN. Customers can use the ARN as an input to the BatchEnableStandards API action.  To learn more, visit our API documentation.

## __AWS Shield__
  - ### Features
    - This release adds support for associating Amazon Route 53 health checks to AWS Shield Advanced protected resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now enable Multi-Attach on Provisioned IOPS io1 volumes through the create-volume API.

# __1.11.722__ __2020-02-13__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds support for DASH with multiple media presentation description periods triggered by presence of SCTE-35 ad markers in the manifest.Also adds optional configuration for DASH SegmentTemplateFormat to refer to segments by Number with Duration, Number with Timeline or Time with Timeline and compact the manifest by combining duplicate SegmentTemplate tags.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed a behavioral change in 1.11.709 where invalid regions would cause a NullPointerException instead of an IllegalArgumentException.

# __1.11.721__ __2020-02-12__
## __AWS Directory Service__
  - ### Features
    - Release to add the ExpirationDateTime as an output to ListCertificates so as to ease customers to look into their certificate lifetime and make timely decisions about renewing them.

## __AWS Glue__
  - ### Features
    - Adding ability to add arguments that cannot be overridden to AWS Glue jobs

## __Amazon Chime__
  - ### Features
    - Documentation updates for Amazon Chime

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for tagging public IPv4 pools.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now offers fine-grained access control, which adds multiple capabilities to give tighter control over data. New features include the ability to use roles to define granular permissions for indices, documents, or fields and to extend Kibana with read-only views and secure multi-tenant support.

## __Amazon Neptune__
  - ### Features
    - This launch enables Neptune start-db-cluster and stop-db-cluster. Stopping and starting Amazon Neptune clusters helps you manage costs for development and test environments. You can temporarily stop all the DB instances in your cluster, instead of setting up and tearing down all the DB instances each time that you use the cluster.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for access control rules management  in Amazon WorkMail.

# __1.11.720__ __2020-02-11__
## __AWS CloudFormation__
  - ### Features
    - This release of AWS CloudFormation StackSets allows you to centrally manage deployments to all the accounts in your organization or specific organizational units (OUs) in AWS Organizations. You will also be able to enable automatic deployments to any new accounts added to your organization or OUs. The permissions needed to deploy across accounts will automatically be taken care of by the StackSets service.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Features:This release adds a new setting for a user pool to allow if customer wants their user signup/signin with case insensitive username. The current default setting is case sensitive, and for our next release we will change it to case insensitive.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 Now Supports Tagging Spot Fleet.

# __1.11.719__ __2020-02-10__
## __AWS Key Management Service__
  - ### Features
    - The ConnectCustomKeyStore API now provides a new error code (SUBNET_NOT_FOUND) for customers to better troubleshoot if their "connect-custom-key-store" operation fails.

## __AWS SDK for Java__
  - ### Features
    - Implement `STANDARD` retry mode. Standard retry mode is built on top of legacy mode and has throttled retry enabled for throttling errors apart from transient errors. In addition, timeout(socket timeout or connection timeout) errors would cost more retry capacity compared with legacy mode.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Added clarifying information that Amazon DocumentDB shares operational technology with Amazon RDS and Amazon Neptune.

# __1.11.718__ __2020-02-07__
## __AWS RoboMaker__
  - ### Features
    - This release adds support for simulation job batches

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS: when restoring a DB cluster from a snapshot, must create DB instances

## __EC2 Image Builder__
  - ### Features
    - This version of the SDK includes bug fixes and documentation updates.

# __1.11.717__ __2020-02-06__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports X-Ray

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild adds support for Amazon Elastic File Systems

## __Amazon EC2 Container Registry__
  - ### Features
    - This release contains updated text for the GetAuthorizationToken API.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for EBS direct APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds platform details and billing info to the DescribeImages API.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports AMAZON.AlphaNumeric with regular expressions.

# __1.11.716__ __2020-02-05__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for fine-tuned QVBR quality level.

## __AWS Ground Station__
  - ### Features
    - Adds dataflowEndpointRegion property to DataflowEndpointConfig. The dateCreated, lastUpdated, and tags properties on GetSatellite have been deprecated.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation-only update that adds services to the list of supported services.

## __AWS SDK for Java__
  - ### Bugfixes
    - Applied customized retry policy in `EC2MetadataUtils#getItems` so that it retries transient errors as before. See [#2203](https://github.com/aws/aws-sdk-java/issues/2203)

## __AWS SecurityHub__
  - ### Features
    - Additional resource types are now supported in the AWS Security Finding Format (ASFF). The following new resource types are added, each having an accompanying resource details object with fields for security finding providers to populate: AwsCodeBuildProject, AwsEc2NetworkInterface, AwsEc2SecurityGroup, AwsElasticsearchDomain, AwsLambdaLayerVersion, AwsRdsDbInstance, and AwsWafWebAcl. The following resource types are added without an accompanying details object: AutoscalingAutoscalingGroup, AwsDynamoDbTable, AwsEc2Eip, AwsEc2Snapshot, AwsEc2Volume, AwsRdsDbSnapshot, AwsRedshiftCluster, and AwsS3Object. The number of allowed resources per finding is increased from 10 to 32. A new field is added in the Compliance object, RelatedRequirements. To learn more, visit our documentation on the ASFF.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Updated the maximum number of tags that can be added to a snapshot using DLM to 45.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides support for tagging when you create a VPC endpoint, or VPC endpoint service.

## __Amazon Forecast Query Service__
  - ### Features
    - Documentation updates for Amazon Forecast.

# __1.11.715__ __2020-02-04__
## __AWS IoT__
  - ### Features
    - Updated ThrottlingException documentation to report that the error code is 400, and not 429, to reflect actual system behaviour.

## __AWS Storage Gateway__
  - ### Features
    - Adding KVM as a support hypervisor

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon VPC Flow Logs adds support for 1-minute aggregation intervals.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This feature ensures that an instance is patched up to the available patches on a particular date. It can be enabled by selecting the 'ApproveUntilDate' option as the auto-approval rule while creating the patch baseline. ApproveUntilDate - The cutoff date for auto approval of released patches. Any patches released on or before this date will be installed automatically.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for tagging Amazon WorkMail organizations.

## __Managed Streaming for Kafka__
  - ### Features
    - This release enables AWS MSK customers to list Apache Kafka versions that are supported on AWS MSK clusters. Also includes changes to expose additional details of a cluster's state in DescribeCluster and ListClusters APIs.

# __1.11.714__ __2020-01-24__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports FSx for Windows File Server Locations

## __AWS OpsWorks CM__
  - ### Features
    - AWS OpsWorks for Chef Automate now supports in-place upgrade to Chef Automate 2. Eligible servers can be updated through the management console, CLI and APIs.

## __Amazon EC2__
  - ### Features
    - Adds EC2ThrottledException as a recognized throttling exception to be retried

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides support for tagging Amazon ECS task sets for services using external deployment controllers.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error codes for Nodegroups in EKS

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for WorkSpaces

# __1.11.713__ __2020-01-23__
## __AWS Identity and Access Management__
  - ### Features
    - This release enables the Identity and Access Management policy simulator to simulate permissions boundary policies.

## __Amazon Relational Database Service__
  - ### Features
    - This SDK release introduces APIs that automate the export of Amazon RDS snapshot data to Amazon S3. The new APIs include: StartExportTask, CancelExportTask, DescribeExportTasks. These APIs automate the extraction of data from an RDS snapshot and export it to an Amazon S3 bucket. The data is stored in a compressed, consistent, and query-able format. After the data is exported, you can query it directly using tools such as Amazon Athena or Redshift Spectrum. You can also consume the data as part of a data lake solution. If you archive the data in S3 Infrequent Access or Glacier, you can reduce long term data storage costs by applying data lifecycle policies.

# __1.11.712__ __2020-01-21__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for the AWS Application Discovery Service.

## __AWS CodePipeline__
  - ### Features
    - AWS CodePipeline enables an ability to stop pipeline executions.

## __AWS IoT Events__
  - ### Features
    - Documentation updates for iotcolumbo

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Remove 4 deprecated data sets, change some data sets available dates to 2017-09-15

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add an enum value to the result of DescribeByoipCidrs to support CIDRs that are not publicly advertisable.

# __1.11.711__ __2020-01-20__
## __AWS Key Management Service__
  - ### Features
    - The ConnectCustomKeyStore operation now provides new error codes (USER_LOGGED_IN and USER_NOT_FOUND) for customers to better troubleshoot if their connect custom key store operation fails. Password length validation during CreateCustomKeyStore now also occurs on the client side. 

## __AWS Lambda__
  - ### Features
    - Added reason codes to StateReasonCode (InvalidSubnet, InvalidSecurityGroup) and LastUpdateStatusReasonCode (SubnetOutOfIPAddresses, InvalidSubnet, InvalidSecurityGroup) for functions that connect to a VPC.

## __Alexa For Business__
  - ### Features
    - Add support for CreatedTime and ConnectionStatusUpdatedTime in response of SearchDevices API.

## __Amazon CloudWatch__
  - ### Features
    - Updating DescribeAnomalyDetectors API to return AnomalyDetector Status value in response.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - This release adds support for a list API to retrieve the configuration events logged during periodic updates to an application by Amazon CloudWatch Application Insights. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides support for a preview of bringing your own IPv6 addresses (BYOIP for IPv6) for use in AWS.

# __1.11.710__ __2020-01-17__
## __AWS Batch__
  - ### Features
    - This release ensures INACTIVE job definitions are permanently deleted after 180 days.

## __AWS CloudHSM V2__
  - ### Features
    - This release introduces resource-level and tag-based access control for AWS CloudHSM resources. You can now tag CloudHSM backups, tag CloudHSM clusters on creation, and tag a backup as you copy it to another region.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for MP3 audio only outputs.

## __Amazon EC2 Container Service__
  - ### Features
    - This release provides a public preview for specifying Amazon EFS file systems as volumes in your Amazon ECS task definitions.

## __Amazon Neptune__
  - ### Features
    - This release includes Deletion Protection for Amazon Neptune databases.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

# __1.11.709__ __2020-01-16__
## __AWS Directory Service__
  - ### Features
    - To reduce the number of errors our customers are facing, we have modified the requirements of input parameters for two of Directory Service APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Client VPN now supports Port Configuration for VPN Endpoints, allowing usage of either port 443 or port 1194.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds two new APIs (UpdateWorkforce and DescribeWorkforce) to SageMaker Ground Truth service for workforce IP whitelisting.

# __1.11.708__ __2020-01-15__
## __AWS Organizations__
  - ### Features
    - Updated description for PolicyID parameter and ConstraintViolationException.

## __AWS SDK for Java__
  - ### Bugfixes
    - Updated endpoint-to-region resolution logic to support additional services with non-standard endpoint patterns.

## __AWS SecurityHub__
  - ### Features
    - Add support for DescribeStandardsControls and UpdateStandardsControl. These new Security Hub API operations are used to track and manage whether a compliance standards control is enabled.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - General Update to EC2 Docs and SDKs

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Document updates for Patch Manager 'NoReboot' feature.

# __1.11.707__ __2020-01-14__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for partition placement groups and instance metadata option in Launch Templates

# __1.11.706__ __2020-01-13__
## __AWS Backup__
  - ### Features
    - Cross-region backup is a new AWS Backup feature that allows enterprises to copy backups across multiple AWS services to different regions. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for the StopInstances API. You can now stop and start an Amazon EBS-backed Spot Instance at will, instead of relying on the Stop interruption behavior to stop your Spot Instances when interrupted.

## __Amazon Elastic File System__
  - ### Features
    - This release adds support for managing EFS file system policies and EFS Access Points.

# __1.11.705__ __2020-01-10__
## __AWS Transfer for SFTP__
  - ### Features
    - This release introduces a new endpoint type that allows you to attach Elastic IP addresses from your AWS account with your server's endpoint directly and whitelist access to your server by client's internet IP address(es) using VPC Security Groups.

## __Amazon Chime__
  - ### Features
    - Add shared profile support to new and existing users

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces the ability to tag egress only internet gateways, local gateways, local gateway route tables, local gateway virtual interfaces, local gateway virtual interface groups, local gateway route table VPC association and local gateway route table virtual interface group association. You can use tags to organize and identify your resources for cost allocation. 

## __Amazon Relational Database Service__
  - ### Features
    - This release adds an operation that enables users to override the system-default SSL/TLS certificate for new Amazon RDS DB instances temporarily, or remove the customer override.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker ListTrialComponents API filter by TrialName and ExperimentName.

## __Amazon WorkSpaces__
  - ### Features
    - Added the migrate feature to Amazon WorkSpaces.

# __1.11.704__ __2020-01-09__
## __AWS SDK for Java__
  - ### Bugfixes
    - Increase the priority of the AWS_WEB_IDENTITY_TOKEN_FILE/AWS_ROLE_ARN/AWS_ROLE_SESSION_NAME environment variables when loading credentials so that they are considered before web_identity_token_file/role_arn/role_session_name profile properties. This is consistent with the other AWS SDKs, including the CLI.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for sts

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

# __1.11.703__ __2020-01-08__
## __AWS Cost Explorer Service__
  - ### Features
    - Documentation updates for CreateCostCategoryDefinition and UpdateCostCategoryDefinition API

## __Amazon Translate__
  - ### Features
    - This release adds a new family of APIs for asynchronous batch translation service that provides option to translate large collection of text or HTML documents stored in Amazon S3 folder. This service accepts a batch of up to 5 GB in size per API call with each document not exceeding 1 MB size and the number of documents not exceeding 1 million per batch. See documentation for more information. 

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports tagging, and tag-based access control, of policies.

# __1.11.702__ __2020-01-07__
## __AWS CodeBuild__
  - ### Features
    - Add encryption key override to StartBuild API in AWS CodeBuild.

## __AWS Migration Hub__
  - ### Features
    - ListApplicationStates API provides a list of all application migration states

## __AWS X-Ray__
  - ### Features
    - Documentation updates for xray

# __1.11.701__ __2020-01-06__
## __AWS Elemental MediaPackage__
  - ### Features
    - You can now restrict direct access to AWS Elemental MediaPackage by securing requests for live content using CDN authorization. With CDN authorization, content requests require a specific HTTP header and authorization code.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports Multilabel document classification

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release supports service providers configuring a private DNS name for services other than AWS services and services available in the AWS marketplace. This feature allows consumers to access the service using an existing DNS name without making changes to their applications.

# __1.11.700__ __2020-01-02__
## __AWS Cost Explorer Service__
  - ### Features
    - Documentation updates for GetReservationUtilization for the Cost Explorer API.

## __AWS Kinesis Video__
  - ### Features
    - Update Netty version to `4.1.44.Final`

## __Amazon Cloudwatch Metrics__
  - ### Bugfixes
    - Add `EndpoingConfiguration` setting in `CloudWatchMetricConfig` to allow customers to provide both endpoint and region. See [#2137](https://github.com/aws/aws-sdk-java/issues/2137)

## __Amazon EC2 Container Registry__
  - ### Features
    - Adds waiters for ImageScanComplete and LifecyclePolicyPreviewComplete

## __Amazon Lex Model Building Service__
  - ### Features
    - Documentation updates for Amazon Lex.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Certificate Authority (CA) certificate identifier to managed databases in Amazon Lightsail.

# __1.11.699__ __2019-12-23__
## __AWS Health APIs and Notifications__
  - ### Features
    - With this release, you can now centrally aggregate AWS Health events from all accounts in your AWS organization. Visit AWS Health documentation to learn more about enabling and using this feature: https://docs.aws.amazon.com/health/latest/ug/organizational-view-health.html. 

## __Amazon Detective__
  - ### Features
    - Updated the documentation for Amazon Detective.

## __Amazon FSx__
  - ### Features
    - This release adds a new family of APIs (create-data-repository-task, describe-data-repository-task, and cancel-data-repository-task) that allow users to perform operations between their file system and its linked data repository.

# __1.11.698__ __2019-12-20__
## __AWS Device Farm__
  - ### Features
    - Introduced browser testing support through AWS Device Farm

## __AWS SDK for Java__
  - ### Bugfixes
    - Fix a race condition where the execution timer interrupts the thread at the same time the response is complete or an exception is thrown, leaving thread interrupt flag uncleared, which causes subsequent requests to fail of `AbortedException`.

## __AWS SecurityHub__
  - ### Features
    - Additional resource types are now fully supported in the AWS Security Finding Format (ASFF). These resources include AwsElbv2LoadBalancer, AwsKmsKey, AwsIamRole, AwsSqsQueue, AwsLambdaFunction, AwsSnsTopic, and AwsCloudFrontDistribution. Each of these resource types includes an accompanying resource details object with fields for security finding providers to populate. Updates were made to the AwsIamAccessKey resource details object to include information on principal ID and name. To learn more, visit our documentation on the ASFF.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces the ability to tag key pairs, placement groups, export tasks, import image tasks, import snapshot tasks and export image tasks. You can use tags to organize and identify your resources for cost allocation. 

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports restricting access to the API server public endpoint by applying CIDR blocks

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces versioning support for message templates.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for Amazon Redshift RA3 node types.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds an operation that enables users to specify whether a database is restarted when its SSL/TLS certificate is rotated. Only customers who do not use SSL/TLS should use this operation.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates the attachments support to include AttachmentReference source for Automation documents.

## __Amazon Transcribe Service__
  - ### Features
    - AWS Transcribe now supports vocabulary filtering that allows customers to input words to the service that they don't want to see in the output transcript.

# __1.11.697__ __2019-12-19__
## __AWS CodeStar connections__
  - ### Features
    - Public beta for Bitbucket Cloud support in AWS CodePipeline through integration with AWS CodeStar connections.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - You can now copy snapshots across regions using Data Lifecycle Manager (DLM). You can enable policies which, along with create, can now also copy snapshots to one or more AWS region(s). Copies can be scheduled for up to three regions from a single policy and retention periods are set for each region separately. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - We are updating the supportedRootDevices field to supportedRootDeviceTypes for DescribeInstanceTypes API to ensure that the actual value is returned, correcting a previous error in the model.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift now supports ARNs for all key GameLift resources, tagging for GameLift resource authorization management, and updated documentation that articulates GameLift's resource authorization strategy.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports conversation logs and slot obfuscation.

## __Amazon Personalize Runtime__
  - ### Features
    - Add context map to get-recommendations and get-personalized-ranking request objects to provide contextual metadata at inference time

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release allows customers to add tags to Automation execution, enabling them to sort and filter executions in different ways, such as by resource, purpose, owner, or environment.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe supports job queuing for the StartTranscriptionJob API.

# __1.11.696__ __2019-12-18__
## __AWS OpsWorks CM__
  - ### Features
    - AWS OpsWorks CM now supports tagging, and tag-based access control, of servers and backups.

## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for resourcegroupstaggingapi

## __AWS SDK for Java__
  - ### Features
    - HTTP proxy configuration environment variables are now trimmed of whitespace.
    - HTTP proxy configuration environment variables that are empty are now treated as if they weren't configured.

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for CloudFront

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces the ability to tag Elastic Graphics accelerators. You can use tags to organize and identify your accelerators for cost allocation.

## __Amazon S3__
  - ### Features
    - Adds a zero-arg CopyObjectRequest constructor. Users must still populate all required fields before the request is valid.

## __Amazon Simple Storage Service__
  - ### Features
    - Updates Amazon S3 endpoints allowing you to configure your client to opt-in to using S3 with the us-east-1 regional endpoint, instead of global.

# __1.11.695__ __2019-12-17__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports HLS ID3 segment tagging, HLS redundant manifests for CDNs that support different publishing/viewing endpoints, fragmented MP4 (fMP4), and frame capture intervals specified in milliseconds.

## __AWS IoT__
  - ### Features
    - Added a new Over-the-Air (OTA) Update feature that allows you to use different, or multiple, protocols to transfer an image from the AWS cloud to IoT devices.

## __Amazon DynamoDB__
  - ### Bugfixes
    - Fixed an issue where statically initializing SaveBehavior, ConsistentReads, PaginationLoadingStrategy, DefaultTableNameResolver, DefaultBatchWriteRetryStrategy, DefaultBatchLoadRetryStrategy or NoRetryBatchLoadRetryStrategy before DynamoDBMapperConfig could result in an invalidly-configured DynamoDBMapperConfig.DEFAULT.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics service now supports running Java applications using Flink 1.8.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added support for Cloud Watch Output and Document Version to the Run Command tasks in Maintenance Windows.

# __1.11.694__ __2019-12-16__
## __AWS Comprehend Medical__
  - ### Features
    - New Ontology linking APIs will provides medication concepts normalization and Diagnoses codes from input text. In this release we will provide two APIs -  RxNorm and ICD10-CM. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now configure your EC2 Fleet to preferentially use EC2 Capacity Reservations for launching On-Demand instances, enabling you to fully utilize the available (and unused) Capacity Reservations before launching On-Demand instances on net new capacity.

## __AmazonMQ__
  - ### Features
    - Amazon MQ now supports throughput-optimized message brokers, backed by Amazon EBS.

# __1.11.693__ __2019-12-13__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds support for cross account

## __Amazon Detective__
  - ### Features
    - This is the initial release of Amazon Detective.

## __Amazon Simple Email Service__
  - ### Features
    - Added the ability to use your own public-private key pair to configure DKIM authentication for a domain identity.

# __1.11.692__ __2019-12-12__
## __Access Analyzer__
  - ### Features
    - This release includes improvements and fixes bugs for the IAM Access Analyzer feature.

# __1.11.691__ __2019-12-11__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to attach multiple Elastic Inference Accelerators to a single EC2 instance. It adds support for a Count parameter for each Elastic Inference Accelerator type you specify on the RunInstances and LaunchTemplate APIs.

# __1.11.690__ __2019-12-10__
## __AWSKendraFrontendService__
  - ### Features
    - 1. Adding DocumentTitleFieldName as an optional configuration for SharePoint. 2. updating s3 object pattern to  support all s3 keys.

# __1.11.689__ __2019-12-09__
## __AWS Key Management Service__
  - ### Features
    - The Verify operation now returns KMSInvalidSignatureException on invalid signatures. The Sign and Verify operations now return KMSInvalidStateException when a request is made against a CMK pending deletion.

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds the SSM GetCalendarState API and ChangeCalendar SSM Document type. These features enable the forthcoming Systems Manager Change Calendar feature, which will allow you to schedule events during which actions should (or should not) be performed.

## __Managed Streaming for Kafka__
  - ### Features
    - AWS MSK has added support for Open Monitoring with Prometheus.

# __1.11.688__ __2019-12-04__
## __Amazon Kinesis Video Signaling Channels__
  - ### Features
    - Announcing support for WebRTC in Kinesis Video Streams, as fully managed capability. You can now use simple APIs to enable your connected devices, web, and mobile apps with real-time two-way media streaming capabilities.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Introduces management of signaling channels for Kinesis Video Streams.

## __AmazonApiGatewayV2__
  - ### Features
    - Amazon API Gateway now supports HTTP APIs (beta), enabling customers to quickly build high performance RESTful APIs that are up to 71% cheaper than REST APIs also available from API Gateway. HTTP APIs are optimized for building APIs that proxy to AWS Lambda functions or HTTP backends, making them ideal for serverless workloads. Using HTTP APIs, you can secure your APIs using OIDC and OAuth 2 out of box, quickly build web applications using a simple CORS experience, and get started immediately with automatic deployment and simple create workflows.

# __1.11.687__ __2019-12-03__
## __AWS Lambda__
  - ### Features
    - - Added the ProvisionedConcurrency type and operations. Allocate provisioned concurrency to enable your function to scale up without fluctuations in latency. Use PutProvisionedConcurrencyConfig to configure provisioned concurrency on a version of a function, or on an alias.

## __AWS Step Functions__
  - ### Features
    - This release of the AWS Step Functions SDK introduces support for Express Workflows.

## __Amazon Elastic Block Store__
  - ### Features
    - This release introduces the EBS direct APIs for Snapshots: 1. ListSnapshotBlocks, which lists the block indexes and block tokens for blocks in an Amazon EBS snapshot. 2. ListChangedBlocks, which lists the block indexes and block tokens for blocks that are different between two snapshots of the same volume/snapshot lineage. 3. GetSnapshotBlock, which returns the data in a block of an Amazon EBS snapshot.

## __Amazon Rekognition__
  - ### Features
    - This SDK Release introduces APIs for Amazon Rekognition Custom Labels feature (CreateProjects, CreateProjectVersion,DescribeProjects, DescribeProjectVersions, StartProjectVersion, StopProjectVersion and DetectCustomLabels).  Also new is  AugmentedAI (Human In The Loop) Support for DetectModerationLabels in Amazon Rekognition.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for the Amazon RDS Proxy

## __Amazon SageMaker Service__
  - ### Features
    - You can now use SageMaker Autopilot for automatically training and tuning candidate models using a combination of various feature engineering, ML algorithms, and hyperparameters determined from the user's input data. SageMaker Automatic Model Tuning now supports tuning across multiple algorithms. With Amazon SageMaker Experiments users can create Experiments, ExperimentTrials, and ExperimentTrialComponents to track, organize, and evaluate their ML training jobs. With Amazon SageMaker Debugger, users can easily debug training jobs using a number of pre-built rules provided by Amazon SageMaker, or build custom rules. With Amazon SageMaker Processing, users can run on-demand, distributed, and fully managed jobs for data pre- or post- processing or model evaluation. With Amazon SageMaker Model Monitor, a user can create MonitoringSchedules to automatically monitor endpoints to detect data drift and other issues and get alerted on them. This release also includes the preview version of Amazon SageMaker Studio with Domains, UserProfiles, and Apps. This release also includes the preview version of Amazon Augmented AI to easily implement human review of machine learning predictions by creating FlowDefinitions, HumanTaskUis, and HumanLoops.

## __Application Auto Scaling__
  - ### Features
    - This release supports auto scaling of provisioned concurrency for AWS Lambda.

# __1.11.686__ __2019-12-03__
## __AWS Compute Optimizer__
  - ### Features
    - Initial release of AWS Compute Optimizer. AWS Compute Optimizer recommends optimal AWS Compute resources to reduce costs and improve performance for your workloads.

## __AWS Network Manager__
  - ### Features
    - This is the initial SDK release for AWS Network Manager.

## __AWS Outposts__
  - ### Features
    - This is the initial release for AWS Outposts, a fully managed service that extends AWS infrastructure, services, APIs, and tools to customer sites. AWS Outposts enables you to launch and run EC2 instances and EBS volumes locally at your on-premises location. This release introduces new APIs for creating and viewing Outposts. 

## __AWS S3 Control__
  - ### Features
    - Amazon S3 Access Points is a new S3 feature that simplifies managing data access at scale for shared data sets on Amazon S3. Access Points provide a customizable way to access the objects in a bucket, with a unique hostname and access policy that enforces the specific permissions and network controls for any request made through the access point. This represents a new way of provisioning access to shared data sets.

## __AWSKendraFrontendService__
  - ### Features
    - It is a preview launch of Amazon Kendra. Amazon Kendra is a managed, highly accurate and easy to use enterprise search service that is powered by machine learning.

## __Amazon Augmented AI Runtime__
  - ### Features
    - This release adds support for Amazon Augmented AI, which makes it easy to build workflows for human review of machine learning predictions.

## __Amazon CodeGuru Profiler__
  - ### Features
    - (New Service) Amazon CodeGuru Profiler analyzes application CPU utilization and latency characteristics to show you where you are spending the most cycles in your application. This analysis is presented in an interactive flame graph that helps you easily understand which paths consume the most resources, verify that your application is performing as expected, and uncover areas that can be optimized further.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - This is the preview release of Amazon CodeGuru Reviewer.

## __Amazon EC2 Container Service__
  - ### Features
    - This release supports ECS Capacity Providers, Fargate Spot, and ECS Cluster Auto Scaling.  These features enable new ways for ECS to manage compute capacity used by tasks.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for the following features: 1. An option to enable acceleration for Site-to-Site VPN connections, to improve connection performance by leveraging AWS Global Accelerator; 2. Inf1 instances featuring up to 16 AWS Inferentia chips, custom-built for ML inference applications to deliver low latency and high throughput performance. Use Inf1 instances to run high scale ML inference applications such as image recognition, speech recognition, natural language processing, personalization, and fraud detection at the lowest cost in the cloud. Inf1 instances will soon be available for use with Amazon SageMaker, Amazon EKS and Amazon ECS. To get started, see https://aws.amazon.com/ec2/instance-types/Inf1; 3. The ability to associate route tables with internet gateways and virtual private gateways, and define routes to insert network and security virtual appliances in the path of inbound and outbound traffic. For more information on Amazon VPC Ingress Routing, see https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html#gateway-route-table; 4. AWS Local Zones that place compute, storage, database, and other select services closer to you for applications that require very low latency to your end-users. AWS Local Zones also allow you to seamlessly connect to the full range of services in the AWS Region through the same APIs and tool sets; 5. Launching and viewing EC2 instances and EBS volumes running locally in Outposts. This release also introduces a new local gateway (LGW) with Outposts to enable connectivity between Outposts and local on-premises networks as well as the internet; 6. Peering Transit Gateways between regions simplifying creation of secure and private global networks on AWS; 7. Transit Gateway Multicast, enabling multicast routing within and between VPCs using Transit Gateway as a multicast router.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Introducing Amazon EKS with Fargate. Customers can now use Amazon EKS to launch pods directly onto AWS Fargate, the serverless compute engine built for containers on AWS. 

## __Amazon Elasticsearch Service__
  - ### Features
    - UltraWarm storage provides a cost-effective way to store large amounts of read-only data on Amazon Elasticsearch Service. Rather than attached storage, UltraWarm nodes use Amazon S3 and a sophisticated caching solution to improve performance. For indices that you are not actively writing to and query less frequently, UltraWarm storage offers significantly lower costs per GiB. In Elasticsearch, these warm indices behave just like any other index. You can query them using the same APIs or use them to create dashboards in Kibana.

## __Amazon Fraud Detector__
  - ### Features
    - Amazon Fraud Detector is a fully managed service that makes it easy to identify potentially fraudulent online activities such as online payment fraud and the creation of fake accounts. Amazon Fraud Detector uses your data, machine learning (ML), and more than 20 years of fraud detection expertise from Amazon to automatically identify potentially fraudulent online activity so you can catch more fraud faster.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Access Points is a new S3 feature that simplifies managing data access at scale for shared data sets on Amazon S3. Access Points provide a customizable way to access the objects in a bucket, with a unique hostname and access policy that enforces the specific permissions and network controls for any request made through the access point. This represents a new way of provisioning access to shared data sets.

## __Amazon Textract__
  - ### Features
    - This SDK Release introduces Amazon Augmented AI support for Amazon Textract AnalyzeDocument API. Image byte payloads for synchronous operations have increased from 5 MB to 10 MB.

# __1.11.685__ __2019-12-02__
## __Access Analyzer__
  - ### Features
    - Introducing AWS IAM Access Analyzer, an IAM feature that makes it easy for AWS customers to ensure that their resource-based policies provide only the intended access to resources outside their AWS accounts.

# __1.11.684__ __2019-12-02__
## __AWS License Manager__
  - ### Features
    - AWS License Manager now automates discovery of bring-your-own-license usage across the customers organization. With few simple settings, customers can add bring your own license product information along with licensing rules, which would enable License Manager to automatically track the instances that have the specified products installed. If License Manager detects any violation of licensing rules, it would notify the customers designated license administrator to take corrective action.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS now provides a new BYOL experience for software licenses, such as Windows and SQL Server, that require a dedicated physical server. You can now enjoy the flexibility and cost effectiveness of using your own licenses on Amazon EC2 Dedicated Hosts, but with the simplicity, resiliency, and elasticity of AWS. You can specify your Dedicated Host management preferences, such as host allocation, host capacity utilization, and instance placement in AWS License Manager.  Once set up, AWS takes care of these administrative tasks on your behalf, so that you can seamlessly launch virtual machines (instances) on Dedicated Hosts just like you would launch an EC2 instance with AWS provided licenses.

## __EC2 Image Builder__
  - ### Features
    - This is the first release of EC2 Image Builder, a service that provides a managed experience for automating the creation of EC2 AMIs.

## __Schemas__
  - ### Features
    - This release introduces support for Amazon EventBridge schema registry, making it easy to discover and write code for events in EventBridge.

# __1.11.683__ __2019-11-26__
## __AWS Directory Service__
  - ### Features
    - This release will introduce optional encryption over LDAP network traffic using SSL certificates between customer's self-managed AD and AWS Directory Services instances. The release also provides APIs for Certificate management.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now allows configuration of the Live Pre-Roll feature for HLS and DASH streams.

## __AWS Organizations__
  - ### Features
    - Introduces the DescribeEffectivePolicy action, which returns the contents of the policy that's in effect for the account.

## __AWS RDS DataService__
  - ### Features
    - Type hints to improve handling of some specific parameter types (date/time, decimal etc) for ExecuteStatement and BatchExecuteStatement APIs

## __AWS Resource Groups Tagging API__
  - ### Features
    - You can use tag policies to help standardize on tags across your organization's resources.

## __AWSServerlessApplicationRepository__
  - ### Features
    - AWS Serverless Application Repository now supports verified authors. Verified means that AWS has made a good faith review, as a reasonable and prudent service provider, of the information provided by the requester and has confirmed that the requester's identity is as claimed.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new setting for a user pool to configure which recovery methods a user can use to recover their account via the forgot password operation.

## __Amazon DynamoDB__
  - ### Features
    - 1) Amazon Contributor Insights for Amazon DynamoDB is a diagnostic tool for identifying frequently accessed keys and understanding database traffic trends. 2) Support for displaying new fields when a table's encryption state is Inaccessible or the table have been Archived.

## __Amazon Elastic  Inference__
  - ### Features
    - Amazon Elastic Inference allows customers to attach Elastic Inference Accelerators to Amazon EC2 and Amazon ECS tasks, thus providing low-cost GPU-powered acceleration and reducing the cost of running deep learning inference. This release allows customers to add or remove tags for their Elastic Inference Accelerators.

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight

## __Amazon WorkSpaces__
  - ### Features
    - For the WorkspaceBundle API, added the image identifier and the time of the last update.

# __1.11.682__ __2019-11-25__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds support for test reporting

## __AWS Cost Explorer Service__
  - ### Features
    - This launch provides customers with access to Cost Category Public Beta APIs.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for 8K outputs and support for QuickTime Animation Codec (RLE) inputs.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports the ability to create a multiple program transport stream (MPTS).

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds a domain name to PackagingGroups, representing the fully qualified domain name for Assets created in the group.

## __AWS Greengrass__
  - ### Features
    - IoT Greengrass supports machine learning resources in 'No container' mode.

## __AWS IoT__
  - ### Features
    - This release adds: 1) APIs for fleet provisioning claim and template, 2) endpoint configuration and custom domains, 3) support for enhanced custom authentication, d) support for 4 additional audit checks: Device and CA certificate key quality checks, IoT role alias over-permissive check and IoT role alias access to unused services check, 5) extended capability of AWS IoT Rules Engine to support IoT SiteWise rule action. The IoT SiteWise rule action lets you send messages from IoT sensors and applications to IoT SiteWise asset properties

## __AWS IoT Secure Tunneling__
  - ### Features
    - This release adds support for IoT Secure Tunneling to remote access devices behind restricted firewalls.

## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (KMS) now enables creation and use of asymmetric Customer Master Keys (CMKs) and the generation of asymmetric data key pairs.

## __AWS Lambda__
  - ### Features
    - Added the function state and update status to the output of GetFunctionConfiguration and other actions. Check the state information to ensure that a function is ready before you perform operations on it. Functions take time to become ready when you connect them to a VPC.Added the EventInvokeConfig type and operations to configure error handling options for asynchronous invocation. Use PutFunctionEventInvokeConfig to configure the number of retries and the maximum age of events when you invoke the function asynchronously.Added on-failure and on-success destination settings for asynchronous invocation. Configure destinations to send an invocation record to an SNS topic, an SQS queue, an EventBridge event bus, or a Lambda function.Added error handling options to event source mappings. This enables you to configure the number of retries, configure the maximum age of records, or retry with smaller batches when an error occurs when a function processes a Kinesis or DynamoDB stream.Added the on-failure destination setting to event source mappings. This enables you to send discarded events to an SNS topic or SQS queue when all retries fail or when the maximum record age is exceeded when a function processes a Kinesis or DynamoDB stream.Added the ParallelizationFactor option to event source mappings to increase concurrency per shard when a function processes a Kinesis or DynamoDB stream.

## __AWS Resource Access Manager__
  - ### Features
    - AWS RAM provides new APIs to view the permissions granted to principals in a resource share. This release also creates corresponding resource shares for supported services that use resource policies, as well as an API to promote them to standard shares that can be managed in RAM.

## __AWS WAFV2__
  - ### Features
    - This release introduces new set of APIs ("wafv2") for AWS WAF. Major changes include single set of APIs for creating/updating resources in global and regional scope, and rules are configured directly into web ACL instead of being referenced. The previous APIs ("waf" and "waf-regional") are now referred as AWS WAF Classic. For more information visit: https://docs.aws.amazon.com/waf/latest/APIReference/Welcome.html

## __Alexa For Business__
  - ### Features
    - API update for Alexa for Business: This update enables the use of meeting room configuration that can be applied to a room profile. These settings help improve and measure utilization on Alexa for Business enabled rooms. New features include end meeting reminders, intelligent room release and room utilization analytics report.

## __Amazon AppConfig__
  - ### Features
    - Introducing AWS AppConfig, a new service that enables customers to quickly deploy validated configurations to applications of any size in a controlled and monitored fashion.

## __Amazon Athena__
  - ### Features
    - This release adds additional query lifecycle metrics to the QueryExecutionStatistics object in GetQueryExecution response.

## __Amazon CloudWatch__
  - ### Features
    - This release adds a new feature called "Contributor Insights". "Contributor Insights" supports the following 6 new APIs (PutInsightRule, DeleteInsightRules, EnableInsightRules, DisableInsightRules, DescribeInsightRules and GetInsightRuleReport). 

## __Amazon CloudWatch Application Insights__
  - ### Features
    - CloudWatch Application Insights for .NET and SQL Server includes the follwing features: -Tagging Create and manage tags for your applications.-Custom log pattern matching. Define custom log patterns to be detected and monitored.-Resource-level permissions. Specify applications users can access.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito Userpools now supports Sign in with Apple as an Identity Provider.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports real-time analysis with Custom Classification

## __Amazon Data Lifecycle Manager__
  - ### Features
    - You can now set time based retention policies on Data Lifecycle Manager. With this launch, DLM allows you to set snapshot retention period in the following interval units: days, weeks, months and years.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds two new APIs: 1. ModifyDefaultCreditSpecification, which allows you to set default credit specification at the account level per AWS Region, per burstable performance instance family, so that all new burstable performance instances in the account launch using the new default credit specification. 2. GetDefaultCreditSpecification, which allows you to get current default credit specification per AWS Region, per burstable performance instance family. This release also adds new client exceptions for StartInstances and StopInstances.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics service adds support to configure Java applications to access resources in a VPC. Also releasing support to configure Java applications to set allowNonRestoreState flag through the service APIs.

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex adds "sessionId" attribute to the PostText and PostContent response.

## __Amazon Redshift__
  - ### Features
    - This release contains changes for 1. Redshift Scheduler 2. Update to the DescribeNodeConfigurationOptions to include a new action type recommend-node-config

## __Amazon Relational Database Service__
  - ### Features
    - Cluster Endpoints can now be tagged by using --tags in the create-db-cluster-endpoint API

## __Amazon Simple Email Service__
  - ### Features
    - This release includes support for automatically suppressing email addresses that result in hard bounce or complaint events at the account level, and for managing addresses on this account-level suppression list.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Documents now supports more Document Types: ApplicationConfiguration, ApplicationConfigurationSchema and DeploymentStrategy. This release also extends Document Permissions capabilities and introduces a new Force flag for DeleteDocument API.

## __Application Auto Scaling__
  - ### Features
    - This release supports auto scaling of document classifier endpoints for Comprehend; and supports target tracking based on the average capacity utilization metric for AppStream 2.0 fleets. 

## __Elastic Load Balancing__
  - ### Features
    - This release of Elastic Load Balancing V2 adds new subnet features for Network Load Balancers and a new routing algorithm for Application Load Balancers. 

# __1.11.681__ __2019-11-22__
## __AWS Auto Scaling Plans__
  - ### Features
    - Update default endpoint for AWS Auto Scaling.

## __AWS Certificate Manager__
  - ### Features
    - This release adds support for Tag-Based IAM for AWS Certificate Manager and adding tags to certificates upon creation.

## __AWS CodeBuild__
  - ### Features
    - Add Canonical ARN to LogsLocation.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Includes the submission time of Asset ingestion request in the API response for Create/List/Describe Assets.

## __AWS Security Token Service__
  - ### Features
    - Support tagging for STS sessions and tag based access control for the STS APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds two new APIs (DescribeInstanceTypes and DescribeInstanceTypeOfferings) that give customers access to instance type attributes and regional and zonal offerings.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds support for concurrent step execution and cancelling running steps. Amazon EMR has added a new Outpost ARN field in the ListCluster and DescribeCluster API responses that is populated for clusters launched in an AWS Outpost subnet.

## __Amazon Forecast Service__
  - ### Features
    - This release adds two key updates to existing APIs. 1. Amazon Forecast can now generate forecasts in any quantile using the optional parameter forecastTypes in the CreateForecast API and 2. You can get additional details (metrics and relevant error messages) on your AutoML runs using the DescribePredictor and GetAccuracyMetrics APIs.

## __Amazon Rekognition__
  - ### Features
    - This release adds enhanced face filtering support to the IndexFaces API operation, and introduces face filtering for CompareFaces and SearchFacesByImage API operations.

## __Amazon Simple Notification Service__
  - ### Features
    - Added documentation for the dead-letter queue feature.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add RebootOption and LastNoRebootInstallOperationTime for DescribeInstancePatchStates and DescribeInstancePatchStatesForPatchGroup API

## __Application Auto Scaling__
  - ### Features
    - Update default endpoint for Application Auto Scaling.

# __1.11.680__ __2019-11-21__
## __AWS Amplify__
  - ### Features
    - This release of AWS Amplify Console introduces support for backend environments. Backend environments are containers for AWS deployments. Each environment is a collection of AWS resources.

## __AWS AppSync__
  - ### Features
    - AppSync: AWS AppSync now supports the ability to add, configure, and maintain caching for your AWS AppSync GraphQL API.

## __AWS Config__
  - ### Features
    - AWS Config launches Custom Configuration Items. A new feature which allows customers to publish resource configuration for third-party resources, custom, or on-premises servers.

## __AWS Glue__
  - ### Features
    - This release adds support for Glue 1.0 compatible ML Transforms.

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for the AWS Marketplace Metering Service.

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds 5 new APIs: CreateParticipantConnection, DisconnectParticipant, GetTranscript, SendEvent, and SendMessage. For Amazon Connect chat, you can use them to programmatically perform participant actions on the configured Amazon Connect instance. Learn more here: https://docs.aws.amazon.com/connect-participant/latest/APIReference/Welcome.html

## __Amazon Connect Service__
  - ### Features
    - This release adds a new API: StartChatContact. You can use it to programmatically start a chat on the specified Amazon Connect instance. Learn more here: https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html 

## __Amazon DynamoDB__
  - ### Features
    - With this release, you can convert an existing Amazon DynamoDB table to a global table by adding replicas in other AWS Regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for attaching AWS License Manager Configurations to Amazon Machine Image (AMI) using ImportImage API; and adds support for running different instance sizes on EC2 Dedicated Hosts

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports Sentiment Analysis

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports Sentiment Analysis

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The release contains new API and API changes for AWS Systems Manager Explorer product.

## __Amazon Transcribe Service__
  - ### Features
    - With this release, Amazon Transcribe now supports transcriptions from audio sources in Hebrew (he-IL), Swiss German (de-CH), Japanese (ja-JP), Turkish (tr-TR), Arabic-Gulf (ar-AE), Malay (ms-MY), Telugu (te-IN)

# __1.11.679__ __2019-11-20__
## __AWS Application Discovery Service__
  - ### Features
    - New exception type for use with Migration Hub home region

## __AWS CloudTrail__
  - ### Features
    -  1. This release adds two new APIs, GetInsightSelectors and PutInsightSelectors, which let you configure CloudTrail Insights event delivery on a trail. An Insights event is a new type of event that is generated when CloudTrail detects unusual activity in your AWS account. In this release, only "ApiCallRateInsight" is a supported Insights event type. 2. This release also adds the new "ExcludeManagementEventSource" option to the existing PutEventSelectors API. This field currently supports only AWS Key Management Services.

## __AWS CodeCommit__
  - ### Features
    - This release adds support for creating pull request approval rules and pull request approval rule templates in AWS CodeCommit. This allows developers to block merges of pull requests, contingent on the approval rules being satisfiied.

## __AWS DataSync__
  - ### Features
    - Update to configure task to run periodically on a schedule

## __AWS Elemental MediaStore__
  - ### Features
    - This release fixes a broken link in the SDK documentation.

## __AWS Migration Hub__
  - ### Features
    - New exception type for use with Migration Hub home region

## __AWS Migration Hub Config__
  - ### Features
    - AWS Migration Hub Config Service allows you to get and set the Migration Hub home region for use with AWS Migration Hub and Application Discovery Service

## __AWS Storage Gateway__
  - ### Features
    - The new DescribeAvailabilityMonitorTest API provides the results of the most recent High Availability monitoring test. The new StartAvailabilityMonitorTest API verifies the storage gateway is configured for High Availability monitoring. The new ActiveDirectoryStatus response element has been added to the DescribeSMBSettings and JoinDomain APIs to indicate the status of the gateway after the most recent JoinDomain operation. The new TimeoutInSeconds parameter of the JoinDomain API allows for the configuration of the timeout in which the JoinDomain operation must complete.

## __Amazon Chime__
  - ### Features
    - Adds APIs to create and manage meeting session resources for the Amazon Chime SDK

## __Amazon Data Lifecycle Manager__
  - ### Features
    - DLM now supports Fast Snapshot Restore. You can enable Fast Restore on snapshots created by DLM, provide the AZs and the number of snapshots to be enabled with this capability.

## __Amazon EC2 Container Service__
  - ### Features
    - Added support for CPU and memory task-level overrides on the RunTask and StartTask APIs.  Added location information to Tasks.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release of Amazon Elastic Compute Cloud (Amazon EC2) introduces support for Amazon Elastic Block Store (Amazon EBS) fast snapshot restores.

## __Amazon FSx__
  - ### Features
    - Announcing a Multi-AZ deployment type for Amazon FSx for Windows File Server, providing fully-managed Windows file storage with high availability and redundancy across multiple AWS Availability Zones.

## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, Amazon Kinesis Data Firehose allows server side encryption with customer managed CMKs. Customer managed CMKs ( "Customer Master Keys") are AWS Key Management Service (KMS) keys that are fully managed by the customer. With customer managed CMKs, customers can establish and maintain their key policies, IAM policies, rotating policies and add tags. For more information about AWS KMS and CMKs, please refer to:  https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html. Please refer to the following link to create CMKs: https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight now supports programmatic creation and management of data sources, data sets, dashboards and templates with new APIs. Templates hold dashboard metadata, and can be used to create copies connected to the same or different dataset as required. Also included in this release are APIs for SPICE ingestions, fine-grained access control over AWS resources using AWS Identity and Access Management (IAM) policies, as well AWS tagging. APIs are supported for both Standard and Enterprise Edition, with edition-specific support for specific functionality.

## __Amazon Simple Storage Service__
  - ### Features
    - This release introduces support for Amazon S3 Replication Time Control, a new feature of S3 Replication that provides a predictable replication time backed by a Service Level Agreement. S3 Replication Time Control helps customers meet compliance or business requirements for data replication, and provides visibility into the replication process with new Amazon CloudWatch Metrics.

## __Amazon Transcribe Service__
  - ### Features
    - With this release Amazon Transcribe enables alternative transcriptions so that you can see different interpretations of transcribed audio.

# __1.11.678__ __2019-11-19__
## __AWS CloudFormation__
  - ### Features
    - This release of AWS CloudFormation StackSets enables users to detect drift on a stack set and the stack instances that belong to that stack set.

## __AWS CodeBuild__
  - ### Features
    - Add support for ARM and GPU-enhanced build environments and a new SSD-backed Linux compute type with additional CPU and memory in CodeBuild

## __AWS Config__
  - ### Features
    - AWSConfig launches support for conformance packs. A conformance pack is a new resource type that allows you to package a collection of Config rules and remediation actions into a single entity. You can create and deploy conformance packs into your account or across all accounts in your organization

## __AWS Identity and Access Management__
  - ### Features
    - IAM reports the timestamp when a role's credentials were last used to make an AWS request. This helps you identify unused roles and remove them confidently from your AWS accounts.

## __AWS IoT__
  - ### Features
    - As part of this release, we are extending the capability of AWS IoT Rules Engine to send messages directly to customer's own web services/applications. Customers can now create topic rules with HTTP actions to route messages from IoT Core directly to URL's that they own. Ownership is proved by creating and confirming topic rule destinations.

## __AWS Lambda__
  - ### Features
    - This release provides three new runtimes to support Node.js 12 (initially 12.13.0), Python 3.8 and Java 11.  

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for RunInstances to specify the metadata options for new instances; adds a new API, ModifyInstanceMetadataOptions, which lets you modify the metadata options for a running or stopped instance; and adds support for CreateCustomerGateway to specify a device name.
    - Upgrades to Instance Metadata Service version 2 (IMDS v2). With IMDS v2, a session token is used to make requests for EC2 instance metadata and credentials.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports Instance Weighting and Max Instance Lifetime. Instance Weighting allows specifying the capacity units for each instance type included in the MixedInstancesPolicy and how they would contribute to your application's performance. Max Instance Lifetime allows specifying the maximum length of time that an instance can be in service. If any instances are approaching this limit, Amazon EC2 Auto Scaling gradually replaces them.

## __Elastic Load Balancing__
  - ### Features
    - This release allows forward actions on Application Load Balancers to route requests to multiple target groups, based on the weight you specify for each target group.

# __1.11.677__ __2019-11-18__
## __AWS CloudFormation__
  - ### Features
    - This release introduces APIs for the CloudFormation Registry, a new service to submit and discover resource providers with which you can manage third-party resources natively in CloudFormation.

## __AWS Cost Explorer Service__
  - ### Features
    - add EstimatedOnDemandCostWithCurrentCommitment to GetSavingsPlansPurchaseRecommendationRequest API

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for using and managing message templates for messages that are sent through the voice channel. It also introduces support for specifying default values for message variables in message templates. 

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Runtime now supports a new TargetModel header to invoke a specific model hosted on multi model endpoints.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports multi-model endpoints to host multiple models on an endpoint using a single inference container.

## __Amazon Simple Storage Service__
  - ### Features
    - Added support for S3 Replication for existing objects. This release allows customers who have requested and been granted access to replicate existing S3 objects across buckets.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - The release contains new API and API changes for AWS Systems Manager Explorer product.

# __1.11.676__ __2019-11-15__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for DolbyVision encoding, and SCTE35 & ESAM insertion to DASH ISO EMSG.

## __Amazon Chime__
  - ### Features
    - This release adds support for Chime Room Management APIs

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new option in the User Pool to allow specifying sender's name in the emails sent by Amazon Cognito. This release also adds support to add SES Configuration Set to the emails sent by Amazon Cognito.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now add tags while copying snapshots. Previously, a user had to first copy the snapshot and then add tags to the copied snapshot manually. Moving forward, you can specify the list of tags you wish to be applied to the copied snapshot as a parameter on the Copy Snapshot API. 

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Introducing Amazon EKS managed node groups, a new feature that lets you easily provision worker nodes for Amazon EKS clusters and keep them up to date using the Amazon EKS management console, CLI, and APIs.

## __Amazon Elastic MapReduce__
  - ### Features
    - Access to the cluster ARN makes it easier for you to author resource-level permissions policies in AWS Identity and Access Management. To simplify the process of obtaining the cluster ARN, Amazon EMR has added a new field containing the cluster ARN to all API responses that include the cluster ID.

## __Amazon GuardDuty__
  - ### Features
    - This release includes new operations related to findings export, including: CreatePublishingDestination, UpdatePublishingDestination, DescribePublishingDestination, DeletePublishingDestination and ListPublishingDestinations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager Parameter Store documentation for the enhanced search capability.

## __Amazon WorkSpaces__
  - ### Features
    - Added APIs to register your directories with Amazon WorkSpaces and to modify directory details. 

## __Elastic Load Balancing__
  - ### Features
    - Documentation-only change to the default value of the routing.http.drop_invalid_header_fields.enabled attribute.

# __1.11.675__ __2019-11-14__
## __AWSMarketplace Metering__
  - ### Features
    - Added CustomerNotEntitledException in MeterUsage API for Container use case.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new setting at user pool client to prevent user existence related errors during authentication, confirmation, and password recovery related operations. This release also adds support to enable or disable specific authentication flows for a user pool client.

## __Amazon Connect Service__
  - ### Features
    - This release enhances the existing user management APIs and adds 3 new APIs - TagResource, UntagResource, and ListTagsForResource to support tagging Amazon Connect users, which facilitates more granular access controls for Amazon Connect users within an Amazon Connect instance. You can learn more about the new APIs here: https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html.

## __Amazon Personalize__
  - ### Features
    - Amazon Personalize: Adds ability to get batch recommendations by creating a batch inference job.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updates support for adding attachments to Systems Manager Automation documents

# __1.11.674__ __2019-11-13__
## __AWS Data Exchange__
  - ### Features
    - Introducing AWS Data Exchange, a service that makes it easy for AWS customers to securely create, manage, access, and exchange data sets in the cloud.

## __AWS IoT__
  - ### Features
    - This release adds the custom fields definition support in the index definition for AWS IoT Fleet Indexing Service. Custom fields can be used as an aggregation field to run aggregations with both existing GetStatistics API and newly added GetCardinality, GetPercentiles APIs. GetStatistics will return all statistics (min/max/sum/avg/count...) with this release. For more information, please refer to our latest documentation: https://docs.aws.amazon.com/iot/latest/developerguide/iot-indexing.html

## __Amazon CloudSearch__
  - ### Features
    - Amazon CloudSearch domains let you require that all traffic to the domain arrive over HTTPS. This security feature helps you block clients that send unencrypted requests to the domain.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - You can now add tags to a lifecycle policy in Data Lifecycle Manager (DLM). Tags allow you to categorize your policies in different ways, such as by department, purpose or owner. You can also enable resource level permissions based on tags to set access control on ability to modify or delete a tagged policy.

## __Amazon Simple Email Service__
  - ### Features
    - This is the first release of version 2 of the Amazon SES API. You can use this API to configure your Amazon SES account, and to send email. This API extends the functionality that exists in the previous version of the Amazon SES API.

# __1.11.673__ __2019-11-12__
## __AWS CodePipeline__
  - ### Features
    - AWS CodePipeline now supports the use of variables in action configuration.

## __AWS Marketplace Catalog Service__
  - ### Features
    - This is the first release for the AWS Marketplace Catalog service which allows you to list, describe and manage change requests on your published entities on AWS Marketplace. 

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB enables you to restore your data to a new DynamoDB table using a point-in-time or on-demand backup. You now can modify the settings on the new restored table. Specifically, you can exclude some or all of the local and global secondary indexes from being created with the restored table. In addition, you can change the billing mode and provisioned capacity settings.

## __Amazon Transcribe Service__
  - ### Features
    - With this release, Amazon Transcribe now supports transcriptions from audio sources in Welsh English (en-WL), Scottish English(en-AB), Irish English(en-IE), Farsi(fa-IR), Tamil(ta-IN), Indonesian(id-ID), Portuguese (pt-PT), Dutch(nl-NL).

## __Elastic Load Balancing__
  - ### Features
    - You can configure your Application Load Balancer to either drop invalid header fields or forward them to targets.

# __1.11.672__ __2019-11-11__
## __AWS CloudFormation__
  - ### Features
    - The Resource Import feature enables customers to import existing AWS resources into new or existing CloudFormation Stacks.

## __AWS Cost Explorer Service__
  - ### Features
    - This launch provides customers with access to GetCostAndUsageWithResources API.

# __1.11.671__ __2019-11-08__
## __Amazon Cognito Identity__
  - ### Features
    - This release adds support for disabling classic flow.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release contains ticket fixes for Amazon ECR.

# __1.11.670__ __2019-11-07__
## __AWS SSO OIDC__
  - ### Features
    - This is an initial release of AWS Single Sign-On OAuth device code authorization service.

## __AWS Single Sign-On__
  - ### Features
    - This is an initial release of AWS Single Sign-On (SSO) end-user access. This release adds support for accessing AWS accounts assigned in AWS SSO using short term credentials.

## __Amazon Comprehend__
  - ### Features
    - This release adds new languages (ar, hi, ko, ja, zh, zh-TW) for Amazon Comprehend's DetectSentiment, DetectEntities, DetectKeyPhrases, BatchDetectSentiment, BatchDetectEntities and BatchDetectKeyPhrases APIs

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Session Manager target length increased to 400.

# __1.11.669__ __2019-11-06__
## __AWS Savings Plans__
  - ### Features
    - This is the first release of Savings Plans, a new flexible pricing model that offers low prices on Amazon EC2 and AWS Fargate usage.

# __1.11.668__ __2019-11-06__
## __AWS Budgets__
  - ### Features
    - Documentation updates for budgets to track Savings Plans utilization and coverage

## __AWS CodeBuild__
  - ### Features
    - Add support for Build Number, Secrets Manager and Exported Environment Variables.

## __AWS Cost Explorer Service__
  - ### Features
    - This launch provides customers with access to Savings Plans management APIs.

## __AWS Savings Plans__
  - ### Features
    - This is the first release of Savings Plans, a new flexible pricing model that offers low prices on Amazon EC2 and AWS Fargate usage.

## __AWS Signer__
  - ### Features
    - This release adds support for tagging code-signing profiles in AWS Signer.

## __Amazon Elastic File System__
  - ### Features
    - EFS customers can select a lifecycle policy that automatically moves files that have not been accessed for 7 days into the EFS Infrequent Access (EFS IA) storage class. EFS IA provides price/performance that is cost-optimized for files that are not accessed every day.

# __1.11.667__ __2019-11-05__
## __AWS CodeStar Notifications__
  - ### Features
    - This release adds a notification manager for events in repositories, build projects, deployments, and pipelines. You can now configure rules and receive notifications about events that occur for resources. Each notification includes a status message as well as a link to the resource (repository, build project, deployment application, or pipeline) whose event generated the notification.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for Amazon RDS

# __1.11.666__ __2019-11-04__
## __AWS RoboMaker__
  - ### Features
    - RoboMaker Fleet Management launch a feature to verify your robot is ready to download and install the new robot application using a download condition file, which is a script run on the robot prior to downloading the new deployment. 

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Documentation updates for dax

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for ec2

# __1.11.665__ __2019-11-01__
## __AWS CloudTrail__
  - ### Features
    - This release adds two new APIs, GetTrail and ListTrails, and support for adding tags when you create a trail by using a new TagsList parameter on CreateTrail operations.

## __AWS Database Migration Service__
  - ### Features
    - This release contains task timeline attributes in replication task statistics. This release also adds a note to the documentation for the CdcStartPosition task request parameter. This note describes how to enable the use of native CDC start points for a PostgreSQL source by setting the new slotName extra connection attribute on the source endpoint to the name of an existing logical replication slot.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for using and managing journeys, and querying analytics data for journeys.

# __1.11.664__ __2019-10-31__
## __AWS Amplify__
  - ### Features
    - This release of AWS Amplify Console introduces support for Web Previews. This feature allows user to create ephemeral branch deployments from pull request submissions made to a connected repository.  A pull-request preview deploys every pull request made to your Git repository to a unique preview URL.

## __AWS Support__
  - ### Features
    - The status descriptions for TrustedAdvisorCheckRefreshStatus have been updated

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Inventory now supports a new field 'IntelligentTieringAccessTier' that reports the access tier (frequent or infrequent) of objects stored in Intelligent-Tiering storage class.

# __1.11.663__ __2019-10-30__
## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache for Redis 5.0.5 now allows you to modify authentication tokens by setting and rotating new tokens. You can now modify active tokens while in use, or add brand-new tokens to existing encryption-in-transit enabled clusters that were previously setup without authentication tokens. This is a two-step process that allows you to set and rotate the token without interrupting client requests.

# __1.11.662__ __2019-10-29__
## __AWS Cloud9__
  - ### Features
    - Added CREATING and CREATE_FAILED environment lifecycle statuses.  

## __Amazon AppStream__
  - ### Features
    - Adds support for providing domain names that can embed streaming sessions

# __1.11.661__ __2019-10-28__
## __Amazon Simple Storage Service__
  - ### Features
    - Adding support in SelectObjectContent for scanning a portion of an object specified by a scan range.

# __1.11.660__ __2019-10-28__
## __AWS SDK for Java__
  - ### Features
    - Bumped Jackson databind version from 2.6.7.2 to 2.6.7.3

## __AWS Transfer for SFTP__
  - ### Features
    - This release adds logical directories support to your AWS SFTP server endpoint, so you can now create logical directory structures mapped to Amazon Simple Storage Service (Amazon S3) bucket paths for users created and stored within the service. Amazon S3 bucket names and paths can now be hidden from AWS SFTP users, providing an additional level of privacy to meet security requirements. You can lock down your SFTP users' access to designated folders (commonly referred to as 'chroot'), and simplify complex folder structures for data distribution through SFTP without replicating files across multiple users.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release of Amazon Elastic Container Registry Service (Amazon ECR) introduces support for image scanning. This identifies the software vulnerabilities in the container image based on the Common Vulnerabilities and Exposures (CVE) database.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache adds support for migrating Redis workloads hosted on Amazon EC2 into ElastiCache by syncing the data between the source Redis cluster and target ElastiCache for Redis cluster in real time. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/migrate-to-elasticache.html.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - With this release, Amazon Transcribe Streaming now supports audio sources in Australian English (en-AU).

# __1.11.659__ __2019-10-24__
## __AWS App Mesh__
  - ### Features
    - This release adds support for the gRPC and HTTP/2 protocols.

## __Amazon Chime__
  - ### Features
    - * This release introduces Voice Connector PDX region and defaults previously created Voice Connectors to IAD. You can create Voice Connector Groups and add region specific Voice Connectors to direct telephony traffic across AWS regions in case of regional failures. With this release you can add phone numbers to Voice Connector Groups and can bulk move phone numbers between Voice Connectors, between Voice Connector and Voice Connector Groups and between Voice Connector Groups. Voice Connector now supports additional settings to enable SIP Log capture. This is in addition to the launch of Voice Connector Cloud Watch metrics in this release. This release also supports assigning outbound calling name (CNAM) to AWS account and individual phone numbers assigned to Voice Connectors. * Voice Connector now supports a setting to enable real time audio streaming delivered via Kinesis Audio streams. Please note that recording Amazon Chime Voice Connector calls with this feature maybe be subject to laws or regulations regarding the recording of telephone calls and other electronic communications. AWS Customer and their end users' have the responsibility to comply with all applicable laws regarding the recording, including properly notifying all participants in a recorded session or to a recorded communication that the session or communication is being recorded and obtain their consent.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release updates CreateFpgaImage to support tagging FPGA images on creation

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift offers expanded hardware options for game hosting: Custom game builds can use the Amazon Linux 2 operating system, and fleets for both custom builds and Realtime servers can now use C5, M5, and R5 instance types.

## __Amazon SageMaker Service__
  - ### Features
    - Adds support for the new family of Elastic Inference Accelerators (eia2) for SageMaker Hosting and Notebook Services

# __1.11.658__ __2019-10-23__
## __AWS Security Token Service__
  - ### Features
    - AWS Security Token Service (STS) now supports a regional configuration flag to make the client respect the region without the need for the endpoint parameter. The flag 'regional' can be set as a system property "sts_regional_endpoints" or an environment variable "AWS_STS_REGIONAL_ENDPOINTS". See https://docs.aws.amazon.com/credref/latest/refdocs/setting-global-sts_regional_endpoints.html for more details. 

## __Amazon Connect Service__
  - ### Features
    - This release adds 4 new APIs ListQueues, ListPhoneNumbers, ListContactFlows, and ListHoursOfOperations, which can be used to programmatically list Queues, PhoneNumbers, ContactFlows, and HoursOfOperations configured for an Amazon Connect instance respectively. You can learn more about the new APIs here: https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new female voices: US Spanish - Lupe and Brazilian Portuguese - Camila; both voices are available in Standard and Neural engine.

# __1.11.657__ __2019-10-22__
## __AWS IoT Events__
  - ### Features
    - Add support for new serial evaluation method for events in a detector model.

## __AWS OpsWorks CM__
  - ### Features
    - AWS OpsWorks for Chef Automate (OWCA) now allows customers to use a custom domain and respective certificate, for their AWS OpsWorks For Chef Automate servers. Customers can now provide a CustomDomain, CustomCertificate and CustomPrivateKey in CreateServer API to configure their Chef Automate servers with a custom domain and certificate.

# __1.11.656__ __2019-10-18__
## __Amazon CloudWatch__
  - ### Features
    - New Period parameter added to MetricDataQuery structure.

# __1.11.655__ __2019-10-17__
## __AWS Batch__
  - ### Features
    - Adding support for Compute Environment Allocation Strategies 

## __Amazon Relational Database Service__
  - ### Features
    - Amazon RDS now supports Amazon RDS on VMware with the introduction of APIs related to Custom Availability Zones and Media installation.

# __1.11.654__ __2019-10-16__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - add 2 more values for the supporting sections - age of past due funds + uncollected funds breakdown

## __AWS RoboMaker__
  - ### Features
    - This release adds support for ROS2 Dashing as a beta feature

## __Managed Streaming for Kafka__
  - ### Features
    - AWS MSK has added support for adding brokers to a cluster.

# __1.11.653__ __2019-10-15__
## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Add ON_DISCONTINUITY mode to the GetHLSStreamingSessionURL API

# __1.11.652__ __2019-10-14__
## __AWS SDK for Java__
  - ### Bugfixes
    - DefaultRequest now case-insensitively matches header keys.

## __Amazon Personalize__
  - ### Features
    - AWS Personalize: Adds ability to create a solution version using FULL or UPDATE training mode

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for WorkSpaces

# __1.11.651__ __2019-10-11__
## __AWS Greengrass__
  - ### Features
    - Greengrass OTA service supports Raspbian/Armv6l platforms.

# __1.11.650__ __2019-10-10__
## __AWS IoT Analytics__
  - ### Features
    - Add `completionTime` to API call ListDatasetContents.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New EC2 M5n, M5dn, R5n, R5dn instances with 100 Gbps network performance and Elastic Fabric Adapter (EFA) for ultra low latency; New A1.metal bare metal instance powered by AWS Graviton Processors

## __Amazon Lex Runtime Service__
  - ### Features
    - Amazon Lex now supports Session API checkpoints

## __Firewall Management Service__
  - ### Features
    - Firewall Manager now supports Amazon VPC security groups, making it easier to configure and manage security groups across multiple accounts from a single place.

# __1.11.649__ __2019-10-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for Dolby Atmos encoding, up to 36 outputs, accelerated transcoding with frame capture and preferred acceleration feature.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now allows you to apply available service updates on demand to your Memcached and Redis Cache Clusters. Features included: (1) Access to the list of applicable service updates and their priorities. (2) Service update monitoring and regular status updates. (3) Recommended apply-by-dates for scheduling the service updates. (4) Ability to stop and later re-apply updates. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Self-Service-Updates.html and https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Self-Service-Updates.html

## __Managed Streaming for Kafka__
  - ### Features
    - Updated documentation for Amazon Managed Streaming for Kafka service.

# __1.11.648__ __2019-10-08__
## __AWS DataSync__
  - ### Features
    - Add Sync options to enable/disable TaskQueueing

## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __Amazon EventBridge__
  - ### Features
    - Documentation updates for Amazon EventBridge.

## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, you can use Amazon Kinesis Firehose delivery streams to deliver streaming data to Amazon Elasticsearch Service version 7.x clusters. For technical documentation, look for CreateDeliveryStream operation in Amazon Kinesis Firehose API reference.

# __1.11.647__ __2019-10-07__
## __AWS Direct Connect__
  - ### Features
    - This release adds a service provider field for physical connection creation and provides a list of available partner providers for each Direct Connect location.

## __AWS Glue__
  - ### Features
    - AWS Glue now provides ability to use custom certificates for JDBC Connections.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snowball Edge now allows you to perform an offline update to the software of your Snowball Edge device when your device is not connected to the internet. Previously, updating your Snowball Edge's software required that the device be connected to the internet or be sent back to AWS. Now, you can keep your Snowball Edge software up to date even if your device(s) cannot connect to the internet, or are required to run in an air-gapped environment. To complete offline updates, download the software update from a client machine with connection to the internet using the AWS Command Line Interface (CLI). Then, have the Snowball Edge device download and install the software update using the Snowball Edge device API. For more information about offline updates, visit the Snowball Edge documentation page.

## __Amazon Kinesis Firehose__
  - ### Features
    - Amazon Kinesis Data Firehose now allows delivering data to Elasticsearch clusters set up in a different AWS account than the Firehose AWS account. For technical documentation, look for ElasticsearchDestinationConfiguration in the Amazon Kinesis Firehose API reference.

## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint API introduces support for using and managing message templates.

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release of the Amazon Pinpoint Email API introduces support for using and managing message templates.

# __1.11.646__ __2019-10-04__
## __AWS Elemental MediaPackage__
  - ### Features
    - New Harvest Job APIs to export segment-accurate content windows from MediaPackage Origin Endpoints to S3. See https://docs.aws.amazon.com/mediapackage/latest/ug/harvest-jobs.html for more info

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds ClientMetadata input parameter to multiple Cognito User Pools operations, making this parameter available to the customer configured lambda triggers as applicable. 

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for Systems Manager / StartSession.

# __1.11.645__ __2019-10-03__
## __AWS Device Farm__
  - ### Features
    - Documentation updates for devicefarm

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to purchase regional EC2 RIs on a future date.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports configuring additional options for domain endpoint, such as whether to require HTTPS for all traffic.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __1.11.644__ __2019-10-02__
## __Amazon Lightsail__
  - ### Features
    - This release adds support for the automatic snapshots add-on for instances and block storage disks.

# __1.11.643__ __2019-10-01__
## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release provides support for describe and modify CA certificates.

# __1.11.642__ __2019-09-30__
## __AWS WAF__
  - ### Features
    - Lowering the threshold for Rate Based rule from 2000 to 100.

## __Amazon DynamoDB Mapper__
  - ### Features
    - Adding limited support for optimistic locking on items of TransactionWriteItems API

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for creating a Read Replica with Active Directory domain information. This release updates RDS API to indicate whether an OrderableDBInstanceOption supports Kerberos Authentication.

## __AmazonMQ__
  - ### Features
    - Amazon MQ now includes the ability to scale your brokers by changing the host instance type. See the hostInstanceType property of UpdateBrokerInput (https://docs.aws.amazon.com/amazon-mq/latest/api-reference/brokers-broker-id.html#brokers-broker-id-model-updatebrokerinput), and pendingHostInstanceType property of DescribeBrokerOutput (https://docs.aws.amazon.com/amazon-mq/latest/api-reference/brokers-broker-id.html#brokers-broker-id-model-describebrokeroutput).

# __1.11.641__ __2019-09-27__
## __AWS Amplify__
  - ### Features
    - This release adds access logs APIs and artifact APIs for AWS Amplify Console.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) removes FirelensConfiguration from the DescribeTask output during the FireLens public preview.

## __Amazon S3__
  - ### Bugfixes
    - Fix connection leak when using `TransferManager` to download a presigned URL. Fixes [#2088](https://github.com/aws/aws-sdk-java/issues/2088)

# __1.11.640__ __2019-09-26__
## __AWS CodePipeline__
  - ### Features
    - Documentation updates for CodePipeline

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates the AWS Systems Manager Parameter Store PutParameter and LabelParameterVersion APIs to return the "Tier" of parameter created/updated and the "parameter version" labeled respectively. 

# __1.11.639__ __2019-09-25__
## __AWS Database Migration Service__
  - ### Features
    - This release adds a new DeleteConnection API to delete the connection between a replication instance and an endpoint. It also adds an optional S3 setting to specify the precision of any TIMESTAMP column values written to an S3 object file in .parquet format.

## __AWS Global Accelerator__
  - ### Features
    - API Update for AWS Global Accelerator to support for DNS aliasing.

## __Amazon SageMaker Service__
  - ### Features
    - Enable G4D and R5 instances in SageMaker Hosting Services

# __1.11.638__ __2019-09-24__
## __AWS Comprehend Medical__
  - ### Features
    - Use Amazon Comprehend Medical to analyze medical text stored in the specified Amazon S3 bucket. Use the console to create and manage batch analysis jobs, or use the batch APIs to detect both medical entities and protected health information (PHI). The batch APIs start, stop, list, and retrieve information about batch analysis jobs. This release also includes DetectEntitiesV2 operation which returns the Acuity and Direction entities as attributes instead of types.

## __AWS DataSync__
  - ### Features
    - Added S3StorageClass, OverwriteMode sync option, and ONLY_FILES_TRANSFERRED setting for the VerifyMode sync option.

## __Amazon Transcribe Service__
  - ### Features
    - With this update Amazon Transcribe enables you to provide an AWS KMS key to encrypt your transcription output.

# __1.11.637__ __2019-09-23__
## __AWS RDS DataService__
  - ### Features
    - RDS Data API now supports Amazon Aurora Serverless PostgreSQL databases.

## __Amazon Redshift__
  - ### Features
    - Adds API operation DescribeNodeConfigurationOptions and associated data structures.

# __1.11.636__ __2019-09-20__
## __AWS Greengrass__
  - ### Features
    - Greengrass OTA service now returns the updated software version in the PlatformSoftwareVersion parameter of a CreateSoftwareUpdateJob response

## __Amazon Elastic Compute Cloud__
  - ### Features
    - G4 instances are Amazon EC2 instances based on NVIDIA T4 GPUs and are designed to provide cost-effective machine learning inference for applications, like image classification, object detection, recommender systems, automated speech recognition, and language translation. G4 instances are also a cost-effective platform for building and running graphics-intensive applications, such as remote graphics workstations, video transcoding, photo-realistic design, and game streaming in the cloud. To get started with G4 instances visit https://aws.amazon.com/ec2/instance-types/g4.

## __Amazon Relational Database Service__
  - ### Features
    - Add a new LeaseID output field to DescribeReservedDBInstances, which shows the unique identifier for the lease associated with the reserved DB instance. AWS Support might request the lease ID for an issue related to a reserved DB instance.

## __Amazon WorkSpaces__
  - ### Features
    - Adds the WorkSpaces restore feature

# __1.11.635__ __2019-09-19__
## __AWS Glue__
  - ### Features
    - AWS Glue DevEndpoints now supports GlueVersion, enabling you to choose Apache Spark 2.4.3 (in addition to Apache Spark 2.2.1). In addition to supporting the latest version of Spark, you will also have the ability to choose between Python 2 and Python 3.

## __AWS MediaConnect__
  - ### Features
    - When you grant an entitlement, you can now specify the percentage of the entitlement data transfer that you want the subscriber to be responsible for.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for container image manifest digests. This enables you to identify all tasks launched using a container image pulled from ECR in order to correlate what was built with where it is running.

# __1.11.634__ __2019-09-18__
## __AWS Resource Access Manager__
  - ### Features
    - AWS RAM provides a new ListPendingInvitationResources API action that lists the resources in a resource share that is shared with you but that the invitation is still pending for

## __AWS WAF Regional__
  - ### Features
    - Lowering the threshold for Rate Based rule from 2000 to 100.

## __Amazon API Gateway__
  - ### Features
    - Amazon API Gateway simplifies accessing PRIVATE APIs by allowing you to associate one or more Amazon Virtual Private Cloud (VPC) Endpoints to a private API. API Gateway will create and manage DNS alias records necessary for easily invoking the private APIs. With this feature, you can leverage private APIs in web applications hosted within your VPCs.

# __1.11.633__ __2019-09-17__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __Amazon Athena__
  - ### Features
    - This release adds DataManifestLocation field indicating the location and file name of the data manifest file. Users can get a list of files that the Athena query wrote or intended to write from the manifest file.

## __Amazon Personalize__
  - ### Features
    - [Personalize] Adds trainingHours to solutionVersion properties.

## __Amazon S3__
  - ### Features
    - Adds an implementation of equals & hashcode to HeadBucketRequest

# __1.11.632__ __2019-09-16__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for multi-DRM SPEKE with CMAF outputs, MP3 ingest, and options for improved video quality.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release lets customers add tags to an Amazon EKS cluster. These tags can be used to control access to the EKS API for managing the cluster using IAM. The Amazon EKS TagResource API allows customers to associate tags with their cluster. Customers can list tags for a cluster using the ListTagsForResource API and remove tags from a cluster with the UntagResource API. Note: tags are specific to the EKS cluster resource, they do not propagate to other AWS resources used by the cluster.

# __1.11.631__ __2019-09-12__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports High Efficiency Video Coding (HEVC) for standard-definition (SD), high-definition (HD), and ultra-high-definition (UHD) encoding with HDR support.Encoding with HEVC offers a number of advantages. While UHD video requires an advanced codec beyond H.264 (AVC), high frame rate (HFR) or High Dynamic Range (HDR) content in HD also benefit from HEVC's advancements. In addition, benefits can be achieved with HD and SD content even if HDR and HFR are not needed.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Fix for FleetActivityStatus and FleetStateCode enum

## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Added a DeleteInBackground option to the buffered async client, which causes synchronous delete message calls to be submitted in the background. This improves delete latency at the cost of possibly increasing duplicates if the background deletions fail, and improves efficiency since individual delete calls will be batched together.
    - Added support for "adaptive prefetching" to the buffered async client. This optional feature makes the outgoing receive message calls to SQS proportional to the rate of incoming receive message calls to the client. In particular, this means if incoming calls are stopped, the client will stop making calls to SQS.
    - Added support for attributes when prefetching messages using the buffered async client. The configuration now supports a ReceiveAttributeNames parameter: any incoming receive message calls that request the same list of attributes will be satisfied from the buffers. The default is to not fetch any attributes, which matches previous behaviour.

  - ### Bugfixes
    - Fixed the buffered async client to timeout receive message requests correctly: empty results will be returned according to the WaitTimeSeconds request parameter and the ReceiveMessageWaitTimeSeconds queue attribute. By default requests will wait at least 50 milliseconds before completing, in order to avoid expensive busy-waiting, but the new MinReceiveWaitTimeMs configuration parameter can be used to tune this.

## __Amazon WorkMail Message Flow__
  - ### Features
    - This release allows customers to access email messages as they flow to and from Amazon WorkMail.

## __Elastic Load Balancing__
  - ### Features
    - Documentation updates for elasticloadbalancingv2: This release adds support for TLS SNI on Network Load Balancers 

# __1.11.630__ __2019-09-11__
## __AWS Config__
  - ### Features
    - Adding input validation for the OrganizationConfigRuleName string.

## __AWS MediaConnect__
  - ### Features
    - This release adds support for the RIST protocol on sources and outputs.

## __AWS Step Functions__
  - ### Features
    - Fixing letter case in Map history event details to be small case

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for new data fields and log format in VPC flow logs.

## __Amazon Relational Database Service__
  - ### Features
    - This release allows customers to specify a custom parameter group when creating a Read Replica, for DB engines which support this feature.

## __Amazon Simple Email Service__
  - ### Features
    - Updated API documentation to correct broken links, and to update content based on customer feedback.

# __1.11.629__ __2019-09-10__
## __AWS Storage Gateway__
  - ### Features
    - The CloudWatchLogGroupARN parameter of the UpdateGatewayInformation API allows for configuring the gateway to use a CloudWatch log-group where Storage Gateway health events will be logged. 

# __1.11.628__ __2019-09-09__
## __AWS App Mesh__
  - ### Features
    - This release adds support for http retry policies.

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Add FDP+FPS (monthly_revenue_field_demonstration_usage + monthly_revenue_flexible_payment_schedule)  to Marketplace Commerce Analytics Service

## __AWS RoboMaker__
  - ### Features
    - Support for Connectivity to Simulation. When you need to interact with the applications in your simulation job, you can connect to your robot application or simulation application with port forwarding. When you configure port forwarding, traffic will be forwarded from the simulation job port to the application port. Port forwarding makes it easy to connect with tools such as ROS Bridge and other tools. This can be useful when you want to debug or run custom tools to interact with your applications. 

## __Amazon AppStream__
  - ### Features
    - IamRoleArn support in CreateFleet, UpdateFleet, CreateImageBuilder APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release expands Site-to-Site VPN tunnel options to allow customers to restrict security algorithms and configure timer settings for VPN connections. Customers can specify these new options while creating new VPN connections, or they can modify the tunnel options on existing connections using a new API.

## __Amazon QLDB__
  - ### Features
    - (New Service) Amazon QLDB is a fully managed ledger database that provides a transparent, immutable, and cryptographically verifiable transaction log owned by a central trusted authority. Amazon QLDB is a new class of serverless database that eliminates the need to engage in the complex development effort of building your own ledger-like applications and it automatically scales to support the demands of your application. Introduces Amazon QLDB API operations needed for managing Amazon QLDB ledgers. This includes the ability to manage Amazon QLDB ledgers, cryptographically verify documents, and export the journal in a ledger.

## __Amazon QLDB Session__
  - ### Features
    - (New Service) Amazon QLDB is a fully managed ledger database that provides a transparent, immutable, and cryptographically verifiable transaction log owned by a central trusted authority. Amazon QLDB is a new class of serverless database that eliminates the need to engage in the complex development effort of building your own ledger-like applications and it automatically scales to support the demands of your application. Introduces Amazon QLDB API operations needed for interacting with data in Amazon QLDB ledgers.

# __1.11.627__ __2019-09-06__
## __Amazon Kinesis Analytics__
  - ### Features
    - Documentation updates for kinesisanalytics

# __1.11.626__ __2019-09-05__
## __AWS Config__
  - ### Features
    - AWS Config now includes the option for marking RemediationConfigurations as automatic, removing the need to call the StartRemediationExecution API. Manual control over resource execution rate is also included, and RemediationConfigurations are now ARN addressable. Exceptions to exclude account resources from being remediated can be configured with the new PutRemediationExceptions, DescribeRemediationExceptions, and DeleteRemediationExceptions APIs.

# __1.11.625__ __2019-09-04__
## __AWS Step Functions__
  - ### Features
    - Added support for new history events

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS DescribeCluster API returns a new OIDC issuer field that can be used to create OIDC identity provider for IAM for Service Accounts feature.

## __Amazon Transcribe Service__
  - ### Features
    - MediaFormat is now optional for StartTranscriptionJob API.

# __1.11.624__ __2019-09-03__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates for resourcegroupstaggingapi

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for attaching Amazon Elastic Inference accelerators to your containers. This enables you to run deep learning inference workloads with hardware acceleration in a more efficient way.

## __Amazon GameLift__
  - ### Features
    - You can now make use of PKI resources to provide more secure connections between your game clients and servers.  To learn more, please refer to the public Amazon GameLift documentation.

# __1.11.623__ __2019-08-30__
## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for modifying the cluster settings for existing clusters, which enables you to toggle whether Container Insights is enabled or not. Support is also introduced for custom log routing using the ECS FireLens integration.

## __AmazonApiGatewayManagementApi__
  - ### Features
    - You can use getConnection to return information about the connection (when it is connected, IP address, etc) and deleteConnection to disconnect the given connection

## __AmazonMQ__
  - ### Features
    - Adds support for updating security groups selection of an Amazon MQ broker.

# __1.11.622__ __2019-08-29__
## __AWS CodePipeline__
  - ### Features
    - Introducing pipeline execution trigger details in ListPipelineExecutions API.

## __AWS Lambda__
  - ### Features
    - Adds a "MaximumBatchingWindowInSeconds" parameter to event source mapping api's. Usable by Dynamodb and Kinesis event sources.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for including Docker container IDs in the API response when describing and stopping tasks. This enables customers to easily map containers to the tasks they are associated with.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache for Redis now supports encryption at rest using customer managed customer master keys (CMKs) in AWS Key Management Service (KMS). Amazon ElastiCache now supports cluster names upto 40 characters for replicationGoups and upto 50 characters for cacheClusters.

## __Application Auto Scaling__
  - ### Features
    - With the current release, you can suspend and later resume any of the following scaling actions in Application Auto Scaling: scheduled scaling actions, dynamic scaling in actions, dynamic scaling out actions.

# __1.11.621__ __2019-08-28__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds the ability to send a job to an on-demand queue while simulating the performance of a job sent to a reserved queue. Use this setting to estimate the number of reserved transcoding slots (RTS) you need for a reserved queue.

## __AWS Global Accelerator__
  - ### Features
    - API Update for AWS Global Accelerator Client IP Preservation

## __Amazon Simple Queue Service__
  - ### Features
    - Added support for message system attributes, which currently lets you send AWS X-Ray trace IDs through Amazon SQS.

# __1.11.620__ __2019-08-27__
## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

# __1.11.619__ __2019-08-26__
## __AWS SecurityHub__
  - ### Features
    - This release resolves an issue with the DescribeHub action, changes the MasterId and InvitationId parameters for AcceptInvitation to Required, and changes the AccountIds parameter for DeleteInvitations and DeclineInvitations to Required.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This feature adds "default tier" to the AWS Systems Manager Parameter Store for parameter creation and update. AWS customers can now set the "default tier" to one of the following values: Standard (default), Advanced or Intelligent-Tiering.  This allows customers to create advanced parameters or parameters in corresponding tiers with one setting rather than code change to specify parameter tiers.

# __1.11.618__ __2019-08-23__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Adds optional Constant Initialization Vector (IV) to HLS Encryption for MediaPackage VOD.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release of EC2 VM Import Export adds support for exporting Amazon Machine Image(AMI)s to a VM file

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Russian (ru-RU) and Chinese (zh-CN).

# __1.11.617__ __2019-08-22__
## __AWS DataSync__
  - ### Features
    - This release adds support for SMB location type.

## __Amazon Relational Database Service__
  - ### Features
    - This release allows users to enable RDS Data API while creating Aurora Serverless databases. 

# __1.11.616__ __2019-08-21__
## __Amazon ElastiCache__
  - ### Features
    - ElastiCache extends support for Scale down for Redis Cluster-mode enabled and disabled replication groups 

## __Amazon Forecast Query Service__
  - ### Features
    - Amazon Forecast is a fully managed machine learning service that makes it easy for customers to generate accurate forecasts using their historical time-series data

## __Amazon Forecast Service__
  - ### Features
    - Amazon Forecast is a fully managed machine learning service that makes it easy for customers to generate accurate forecasts using their historical time-series data

## __Amazon Personalize Runtime__
  - ### Features
    - Increased limits on number of items recommended and reranked: The maximum number of results returned from getRecommendations API has been increased to 200. The maximum number of items which can be reranked via getPersonalizedRanking API has been increased to 200.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports Amazon EFS and Amazon FSx for Lustre file systems as data sources for training machine learning models. Amazon SageMaker now supports running training jobs on ml.p3dn.24xlarge instance type. This instance type is offered as a limited private preview for certain SageMaker customers. If you are interested in joining the private preview, please reach out to the SageMaker Product Management team via AWS Support."

## __Amazon Simple Queue Service__
  - ### Features
    - This release provides a way to add metadata tags to a queue when it is created. You can use tags to organize and identify your Amazon SQS queues for cost allocation.

# __1.11.615__ __2019-08-20__
## __AWS Transfer for SFTP__
  - ### Features
    - New field in response of TestIdentityProvider

## __Alexa For Business__
  - ### Features
    - Adding support for optional locale input in CreateProfile and UpdateProfile APIs

## __Amazon AppStream__
  - ### Features
    - Includes API updates to support streaming through VPC endpoints for image builders and stacks.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker introduces Managed Spot Training. Increases the maximum number of metric definitions to 40 for SageMaker Training and Hyperparameter Tuning Jobs. SageMaker Neo adds support for Acer aiSage and Qualcomm QCS605 and QCS603. 

# __1.11.614__ __2019-08-19__
## __AWS App Mesh__
  - ### Features
    - Fix for HttpMethod enum

## __AWS Cost and Usage Report Service__
  - ### Features
    - New IAM permission required for editing AWS Cost and Usage Reports - Starting today, you can allow or deny IAM users permission to edit Cost & Usage Reports through the API and the Billing and Cost Management console. To allow users to edit Cost & Usage Reports, ensure that they have 'cur: ModifyReportDefinition' permission. Refer to the technical documentation (https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_cur_ModifyReportDefinition.html) for additional details.

# __1.11.613__ __2019-08-16__
## __AWS RoboMaker__
  - ### Features
    - Two feature release: 1. AWS RoboMaker introduces log-based simulation. Log-based simulation allows you to play back pre-recorded log data such as sensor streams for testing robotic functions like localization, mapping, and object detection. Use the AWS RoboMaker SDK to test your robotic applications.  2.  AWS RoboMaker allow customer to setup a robot deployment timeout when CreateDeploymentJob.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for controlling the usage of swap space on a per-container basis for Linux containers.

## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR  has introduced an account level configuration called Block Public Access that allows you to block clusters with ports open to traffic from public IP sources (i.e. 0.0.0.0/0 for IPv4 and ::/0 for IPv6) from launching.  Individual ports or port ranges can be added as exceptions to allow public access.

# __1.11.612__ __2019-08-15__
## __AWS App Mesh__
  - ### Features
    - This release adds support for http header based routing and route prioritization.

## __AWS CodeCommit__
  - ### Features
    - This release adds an API, BatchGetCommits, that allows retrieval of metadata for multiple commits in an AWS CodeCommit repository.

## __AWS Glue__
  - ### Features
    - GetJobBookmarks API is withdrawn.

## __AWS Storage Gateway__
  - ### Features
    - CreateSnapshotFromVolumeRecoveryPoint API supports new parameter: Tags (to be attached to the created resource)

## __Amazon Athena__
  - ### Features
    - This release adds support for querying S3 Requester Pays buckets. Users can enable this feature through their Workgroup settings.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds an option to use private certificates from AWS Certificate Manager (ACM) to authenticate a Site-to-Site VPN connection's tunnel endpoints and customer gateway device. 

# __1.11.611__ __2019-08-14__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new API called SendDiagnosticInterrupt, which allows you to send diagnostic interrupts to your EC2 instance.

# __1.11.610__ __2019-08-13__
## __AWS AppSync__
  - ### Features
    - Adds a configuration option for AppSync GraphQL APIs

## __AWS SDK for Java__
  - ### Bugfixes
    - Fix a bug where `ClientConfiguration#getProxyPassword()` and `ClientConfiguration#getProxyUsername()` can fail with a `NullPointException` if `HTTP_PROXY` or `HTTPS_PROXY` is set and does not contain a user info part. Fixes [#2070](https://github.com/aws/aws-sdk-java/issues/2070).

# __1.11.609__ __2019-08-12__
## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Rekognition__
  - ### Features
    - Adding new Emotion, Fear

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports a new Spot allocation strategy "capacity-optimized" that fulfills your request using Spot Instance pools that are optimally chosen based on the available Spot capacity.

# __1.11.608__ __2019-08-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added support for multi-DRM SPEKE with CMAF outputs, MP3 ingest, and options for improved video quality. 

## __AWS IoT__
  - ### Features
    - This release adds Quality of Service (QoS) support for AWS IoT rules engine republish action.

## __AWS SDK for Java__
  - ### Features
    - Enable TLS client authentication by allowing customers to specify a `KeyManagersProvider` within `ClientConfiguration`. The `KeyManager`s provided will be used when the remote server wants to authenticate the client.

## __Amazon GuardDuty__
  - ### Features
    - New "evidence" field in the finding model to provide evidence information explaining why the finding has been triggered. Currently only threat-intelligence findings have this field. Some documentation updates.

## __Amazon Lex Runtime Service__
  - ### Features
    - Manage Amazon Lex session state using APIs on the client

## __Amazon Redshift__
  - ### Features
    - Add expectedNextSnapshotScheduleTime and expectedNextSnapshotScheduleTimeStatus to redshift cluster object.

# __1.11.607__ __2019-08-08__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild adds CloudFormation support for SourceCredential

## __AWS Glue__
  - ### Features
    - You can now use AWS Glue to find matching records across dataset even without identifiers to join on by using the new FindMatches ML Transform. Find related products, places, suppliers, customers, and more by teaching a custom machine learning transformation that you can use to identify matching matching records as part of your analysis, data cleaning, or master data management project by adding the FindMatches transformation to your Glue ETL Jobs. If your problem is more along the lines of deduplication, you can use the FindMatches in much the same way to identify customers who have signed up more than ones, products that have accidentally been added to your product catalog more than once, and so forth. Using the FindMatches MLTransform, you can teach a Transform your definition of a duplicate through examples, and it will use machine learning to identify other potential duplicates in your dataset. As with data integration, you can then use your new Transform in your deduplication projects by adding the FindMatches transformation to your Glue ETL Jobs. This release also contains additional APIs that support AWS Lake Formation.

## __AWS Lake Formation__
  - ### Features
    - Lake Formation: (New Service) AWS Lake Formation is a fully managed service that makes it easier for customers to build, secure and manage data lakes.  AWS Lake Formation simplifies and automates many of the complex manual steps usually required to create data lakes including collecting, cleaning and cataloging data and securely making that data available for analytics and machine learning.

## __AWS OpsWorks CM__
  - ### Features
    - This release adds support for Chef Automate 2 specific engine attributes.

# __1.11.606__ __2019-08-07__
## __Amazon CloudWatch Application Insights__
  - ### Features
    - CloudWatch Application Insights for .NET and SQL Server now provides integration with AWS Systems Manager OpsCenter. This integration allows you to view and resolve problems and operational issues detected for selected applications.

# __1.11.605__ __2019-08-06__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch

# __1.11.604__ __2019-08-05__
## __AWS DataSync__
  - ### Features
    - Support VPC endpoints.

## __AWS IoT__
  - ### Features
    - In this release, AWS IoT Device Defender introduces audit mitigation actions that can be applied to audit findings to help mitigate security issues.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 now supports a new Spot allocation strategy "Capacity-optimized" that fulfills your request using Spot Instance pools that are optimally chosen based on the available Spot capacity.

# __1.11.603__ __2019-08-02__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed a performance regression that increased the time to call the `getProxyHost()`, `getProxyPort()`, `getProxyUsername()` and `getProxyPassword()` methods of `ClientConfiguration`.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for sts

# __1.11.602__ __2019-07-30__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert adds support for specifying priority (-50 to 50) on jobs submitted to on demand or reserved queues

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds support for Neural text-to-speech engine.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Middle East (Bahrain) Region (me-south-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

# __1.11.601__ __2019-07-29__
## __AWS CodeCommit__
  - ### Features
    - This release supports better exception handling for merges.

# __1.11.600__ __2019-07-26__
## __AWS Batch__
  - ### Features
    - AWS Batch now supports SDK auto-pagination and Job-level docker devices.

## __AWS Cost Explorer Service__
  - ### Features
    - Adds support for resource optimization recommendations.

## __AWS Glue__
  - ### Features
    - This release provides GetJobBookmark and GetJobBookmarks APIs. These APIs enable users to look at specific versions or all versions of the JobBookmark for a specific job. This release also enables resetting the job bookmark to a specific run via an enhancement of the ResetJobBookmark API.

## __AWS Greengrass__
  - ### Features
    - Greengrass OTA service supports openwrt/aarch64 and openwrt/armv7l platforms.

## __AWS MediaConnect__
  - ### Features
    - This release adds support for the Zixi pull protocol on outputs.

## __Amazon CloudWatch Logs__
  - ### Features
    - Allow for specifying multiple log groups in an Insights query, and deprecate storedByte field for LogStreams and interleaved field for FilterLogEventsRequest.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now create EC2 Capacity Reservations using Availability Zone ID or Availability Zone name. You can view usage of Amazon EC2 Capacity Reservations per AWS account.

# __1.11.599__ __2019-07-25__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added several features including support for: audio normalization using ITU BS.1770-3, 1770-4 algorithms, extension of job progress indicators, input cropping rectangle & output position rectangle filters per input, and dual SCC caption mapping to additional codecs and containers. 

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive is adding Input Clipping, Immediate Mode Input Switching, and Dynamic Inputs.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for immutable image tags.

# __1.11.598__ __2019-07-24__
## __AWS Glue__
  - ### Features
    - This release provides GlueVersion option for Job APIs and WorkerType option for DevEndpoint APIs. Job APIs enable users to pick specific GlueVersion for a specific job and pin the job to a specific runtime environment. DevEndpoint APIs enable users to pick different WorkerType for memory intensive workload.

## __AWS Security Token Service__
  - ### Features
    - New STS GetAccessKeyInfo API operation that returns the account identifier for the specified access key ID.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces support for split tunnel with AWS Client VPN, and also adds support for opt-in Regions in DescribeRegions API. In addition, customers can now also tag Launch Templates on creation.

## __Amazon Pinpoint__
  - ### Features
    - This release adds support for programmatic access to many of the same campaign metrics that are displayed on the Amazon Pinpoint console. You can now use the Amazon Pinpoint API to monitor and assess performance data for campaigns, and integrate metrics data with other reporting tools. We update the metrics data continuously, resulting in a data latency timeframe that is limited to approximately two hours.

# __1.11.597__ __2019-07-23__
## __AWS Secrets Manager__
  - ### Features
    - This release increases the maximum allowed size of SecretString or SecretBinary from 7KB to 10KB in the CreateSecret, UpdateSecret, PutSecretValue and GetSecretValue APIs. This release also increases the maximum allowed size of ResourcePolicy from 4KB to 20KB in the GetResourcePolicy and PutResourcePolicy APIs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - You can now use Maintenance Windows to select a resource group as the target. By selecting a resource group as the target of a Maintenance Window, customers can perform routine tasks across different resources such as Amazon Elastic Compute Cloud (AmazonEC2) instances, Amazon Elastic Block Store (Amazon EBS) volumes, and Amazon Simple Storage Service(Amazon S3) buckets within the same recurring time window.

# __1.11.596__ __2019-07-22__
## __AWS SDK for Java__
  - ### Features
    - Update Apache http client version to `4.5.9`.

  - ### Bugfixes
    - Disable apache normalization to handle breaking change introduced in apache httpclient `4.5.7`. See [aws/aws-sdk-java[[#1919](https://github.com/aws/aws-sdk-java/issues/1919)](https://github.com/aws/aws-sdk-java-v2/issues/1919)](https://github.com/aws/aws-sdk-java/issues/1919) for more information.

## __AWS Shield__
  - ### Features
    - Adding new VectorType (HTTP_Reflection) and related top contributor types to describe WordPress Pingback DDoS attacks.

## __AmazonMQ__
  - ### Features
    - Adds support for AWS Key Management Service (KMS) to offer server-side encryption. You can now select your own customer managed CMK, or use an AWS managed CMK in your KMS  account.

# __1.11.595__ __2019-07-19__
## __AWS IoT Events__
  - ### Features
    - Adds support for IoT Events, Lambda, SQS and Kinesis Firehose actions.

## __Amazon Simple Queue Service__
  - ### Features
    - This release updates the information about the availability of FIFO queues and includes miscellaneous fixes.

# __1.11.594__ __2019-07-18__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports multiple entities for custom entity recognition

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for cluster settings. Cluster settings specify whether CloudWatch Container Insights is enabled or disabled for the cluster.

## __Amazon ElastiCache__
  - ### Features
    - Updates for Elasticache

# __1.11.593__ __2019-07-17__
## __AWS Config__
  - ### Features
    - This release adds more granularity to the status of an OrganizationConfigRule by adding a new status. It also adds an exception when organization access is denied.

## __AWS Database Migration Service__
  - ### Features
    - S3 endpoint settings update: 1) Option to append operation column to full-load files. 2) Option to add a commit timestamp column to full-load and cdc files. Updated DescribeAccountAttributes to include UniqueAccountIdentifier.

## __Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling

# __1.11.592__ __2019-07-12__
## __AWS Identity and Access Management__
  - ### Features
    - Removed exception that was indicated but never thrown for IAM GetAccessKeyLastUsed API

## __AWS RoboMaker__
  - ### Features
    - Added Melodic as a supported Robot Software Suite Version

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports M5, C5, and R5 instance types.

## __AmazonApiGatewayV2__
  - ### Features
    - Bug fix (Add tags field to Update Stage , Api and DomainName Responses )

# __1.11.591__ __2019-07-11__
## __Amazon CloudWatch Events__
  - ### Features
    - Adds APIs for partner event sources, partner event buses, and custom event buses. These new features are managed in the EventBridge service.

## __Amazon EventBridge__
  - ### Features
    - Amazon EventBridge is a serverless event bus service that makes it easy to connect your applications with data from a variety of sources, including AWS services, partner applications, and your own applications.

# __1.11.590__ __2019-07-10__
## __AWS Service Catalog__
  - ### Features
    - This release adds support for Parameters in ExecuteProvisionedProductServiceAction and adds functionality to get the default parameter values for a Self-Service Action execution against a Provisioned Product via DescribeServiceActionExecutionParameters

## __Amazon Glacier__
  - ### Features
    - Documentation updates for glacier

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight now supports embedding dashboards for all non-federated QuickSight users. This includes IAM users, AD users and users from the QuickSight user pool. The get-dashboard-embed-url API accepts QUICKSIGHT as identity type with a user ARN to authenticate the embeddable dashboard viewer as a non-federated user.

# __1.11.589__ __2019-07-09__
## __AWS Amplify__
  - ### Features
    - This release adds webhook APIs and manual deployment APIs for AWS Amplify Console.

## __AWS Config__
  - ### Features
    - AWS Config now supports a new set of APIs to manage AWS Config rules across your organization in AWS Organizations. Using this capability, you can centrally create, update, and delete AWS Config rules across all accounts in your organization. This capability is particularly useful if you have a need to deploy a common set of AWS Config rules across all accounts. You can also specify accounts where AWS Config rules should not be created. In addition, you can use these APIs from the master account in AWS Organizations to enforce governance by ensuring that the underlying AWS Config rules are not modifiable by your organization member accounts.These APIs work for both managed and custom AWS Config rules. For more information, see Enabling AWS Config Rules Across all Accounts in Your Organization in the AWS Config Developer Guide.The new APIs are available in all commercial AWS Regions where AWS Config and AWS Organizations are supported. For the full list of supported Regions, see AWS Regions and Endpoints in the AWS General Reference. To learn more about AWS Config, visit the AWS Config webpage. To learn more about AWS Organizations, visit the AWS Organizations webpage.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fix for Github issue #2035 - Waiters now use a cached threadpool ExecutorService instead of a fixed threadpool. This will reduce overall resource consumption for typical use-cases, and eliminate inappropriate thread blocking behavior for heavy use.

## __AWS WAF__
  - ### Features
    - Updated SDK APIs to add tags to WAF Resources: WebACL, Rule, Rulegroup and RateBasedRule. Tags can also be added during creation of these resources.

## __AWS WAF Regional__
  - ### Features
    - Updated SDK APIs to add tags to WAF Resources: WebACL, Rule, Rulegroup and RateBasedRule. Tags can also be added during creation of these resources.

## __Amazon CloudWatch__
  - ### Features
    - This release adds three new APIs (PutAnomalyDetector, DeleteAnomalyDetector, and DescribeAnomalyDetectors) to support the new feature, CloudWatch Anomaly Detection. In addition, PutMetricAlarm and DescribeAlarms APIs are updated to support management of Anomaly Detection based alarms.

## __Amazon Elastic File System__
  - ### Features
    - EFS customers can now enable Lifecycle Management for all file systems. You can also now select from one of four Lifecycle Management policies (14, 30, 60 and 90 days), to automatically move files that have not been accessed for the period of time defined by the policy, from the EFS Standard storage class to the EFS Infrequent Access (IA) storage class. EFS IA provides price/performance that is cost-optimized for files that are not accessed every day.

## __Amazon GameLift__
  - ### Features
    - GameLift FlexMatch now supports matchmaking of up to 200 players per game session, and FlexMatch can now automatically backfill your game sessions whenever there is an open slot.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Add "GET_DASH_STREAMING_SESSION_URL" as an API name to the GetDataEndpoint API.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Adds support for the GetDASHStreamingSessionURL API. Also adds support for the Live Replay playback mode of the GetHLSStreamingSessionURL API.

# __1.11.588__ __2019-07-08__
## __AWS Cost Explorer Service__
  - ### Features
    - This release introduces a new operation called GetUsageForecast, which allows you to programmatically access AWS Cost Explorer's forecasting engine on usage data (running hours, data transfer, etc).

# __1.11.587__ __2019-07-03__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - AssignPrivateIpAddresses response includes two new fields: AssignedPrivateIpAddresses, NetworkInterfaceId

## __Amazon Relational Database Service__
  - ### Features
    - This release supports Cross-Account Cloning for Amazon Aurora clusters.

## __Amazon Simple Storage Service__
  - ### Features
    - Add S3 x-amz-server-side-encryption-context support.

## __Amazon Simple Workflow Service__
  - ### Features
    - This release adds APIs that allow adding and removing tags to a SWF domain, and viewing tags for a domain. It also enables adding tags when creating a domain.

# __1.11.586__ __2019-07-02__
## __AWS Elemental MediaStore__
  - ### Features
    - This release adds support for tagging, untagging, and listing tags for AWS Elemental MediaStore containers.

## __Amazon AppStream__
  - ### Features
    - Adding ImageBuilderName in Fleet API and Documentation updates for AppStream. 

# __1.11.585__ __2019-07-01__
## __AWS Organizations__
  - ### Features
    - Specifying the tag key and tag value is required for tagging requests.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release provides support for cluster delete protection and the ability to stop and start clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for specifying a maximum hourly price for all On-Demand and Spot instances in both Spot Fleet and EC2 Fleet.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for RDS DB Cluster major version upgrade 

# __1.11.584__ __2019-06-28__
## __Alexa For Business__
  - ### Features
    - This release allows developers and customers to add SIP addresses and international phone numbers to contacts.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch 8xlarge and 16xlarge instance sizes on the general purpose M5 and memory optimized R5 instance types.

## __Amazon Redshift__
  - ### Features
    - ClusterAvailabilityStatus: The availability status of the cluster for queries. Possible values are the following: Available, Unavailable, Maintenance, Modifying, Failed.

## __Amazon WorkSpaces__
  - ### Features
    - Minor API fixes for WorkSpaces.

# __1.11.583__ __2019-06-27__
## __AWS Direct Connect__
  - ### Features
    - Tags will now be included in the API responses of all supported resources (Virtual interfaces, Connections, Interconnects and LAGs). You can also add tags while creating these resources.

## __AWS EC2 Instance Connect__
  - ### Features
    - Amazon EC2 Instance Connect is a simple and secure way to connect to your instances using Secure Shell (SSH). With EC2 Instance Connect, you can control SSH access to your instances using AWS Identity and Access Management (IAM) policies as well as audit connection requests with AWS CloudTrail events. In addition, you can leverage your existing SSH keys or further enhance your security posture by generating one-time use SSH keys each time an authorized user connects.

## __Amazon Pinpoint__
  - ### Features
    - This release includes editorial updates for the Amazon Pinpoint API documentation.

## __Amazon WorkSpaces__
  - ### Features
    - Added support for the WorkSpaces restore feature and copying WorkSpaces Images across AWS Regions.

# __1.11.582__ __2019-06-26__
## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for dynamodb

# __1.11.581__ __2019-06-26__
## __AWS CodeCommit__
  - ### Features
    - This release supports better exception handling for merges.

## __AmazonApiGatewayV2__
  - ### Features
    - You can now perform tag operations on ApiGatewayV2 Resources (typically associated with WebSocket APIs)

# __1.11.580__ __2019-06-25__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Starting today, you can use Traffic Mirroring  to copy network traffic from an elastic network interface of Amazon EC2 instances and then send it to out-of-band security and monitoring appliances for content inspection, threat monitoring, and troubleshooting. These appliances can be deployed as individual instances, or as a fleet of instances behind a Network Load Balancer with a User Datagram Protocol (UDP) listener. Traffic Mirroring supports filters and packet truncation, so that you only extract the traffic of interest to monitor by using monitoring tools of your choice.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Changing Amazon EKS full service name to Amazon Elastic Kubernetes Service.

# __1.11.579__ __2019-06-24__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Updated service APIs and documentation.

## __AWS SecurityHub__
  - ### Features
    - This release includes a new Tags parameter for the EnableSecurityHub operation, and the following new operations: DescribeHub, CreateActionTarget, DeleteActionTarget, DescribeActionTargets, UpdateActionTarget, TagResource, UntagResource, and ListTagsforResource. It removes the operation ListProductSubscribers, and makes Title and Description required attributes of AwsSecurityFinding.

## __Amazon API Gateway__
  - ### Features
    - Customers can pick different security policies (TLS version + cipher suite) for custom domains in API Gateway

## __Amazon CloudWatch Application Insights__
  - ### Features
    - CloudWatch Application Insights detects errors and exceptions from logs, including .NET custom application logs, SQL Server logs, IIS logs, and more, and uses a combination of built-in rules and machine learning, such as dynamic baselining, to identify common problems. You can then easily drill into specific issues with CloudWatch Automatic Dashboards that are dynamically generated. These dashboards contain the most recent alarms, a summary of relevant metrics, and log snippets to help you identify root cause.

## __Amazon FSx__
  - ### Features
    - Starting today, you can join your Amazon FSx for Windows File Server file systems to your organization's self-managed Microsoft Active Directory while creating the file system. You can also perform in-place updates of file systems to keep your Active Directory configuration up to date.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager now supports deleting a specific version of a SSM Document.

## __AmazonApiGatewayV2__
  - ### Features
    - Customers can get information about security policies set on custom domain resources in API Gateway

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for UDP on Network Load Balancers

## __Service Quotas__
  - ### Features
    - Service Quotas enables you to view and manage your quotas for AWS services from a central location.

# __1.11.578__ __2019-06-21__
## __AWS Device Farm__
  - ### Features
    - This release includes updated documentation about the default timeout value for test runs and remote access sessions. This release also includes miscellaneous bug fixes for the documentation.

## __AWS Elemental MediaPackage__
  - ### Features
    - Added two new origin endpoint fields for configuring which SCTE-35 messages are treated as advertisements.

## __AWS Identity and Access Management__
  - ### Features
    - We are making it easier for you to manage your permission guardrails i.e. service control policies by enabling you to retrieve the last timestamp when an AWS service was accessed within an account or AWS Organizations entity.

# __1.11.577__ __2019-06-20__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - ACM Private CA is launching Root CAs and hierarchy management, a new feature that expands the scope of ACM Private CA from supporting only subordinate issuing CAs, to now include a full CA hierarchy that includes root CAs - the cryptographic root of trust for an organization.

## __AWS Glue__
  - ### Features
    - Starting today, you can now use workflows in AWS Glue to author directed acyclic graphs (DAGs) of Glue triggers, crawlers and jobs. Workflows enable orchestration of your ETL workloads by building dependencies between Glue entities (triggers, crawlers and jobs).  You can visually track status of the different nodes in the workflows on the console making it easier to monitor progress and troubleshoot issues. Also, you can share parameters across entities in the workflow.

## __AWS Health APIs and Notifications__
  - ### Features
    - API improvements for the AWS Health service.

## __AWS IoT Events Data__
  - ### Features
    - "The colon character ':' is now permitted in Detector Model 'key' parameter values.

## __AWS OpsWorks__
  - ### Features
    - Documentation updates for OpsWorks Stacks.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for RDS storage autoscaling

# __1.11.576__ __2019-06-19__
## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Changing Amazon EKS full service name to Amazon Elastic Kubernetes Service.

# __1.11.575__ __2019-06-18__
## __AWS Resource Groups Tagging API__
  - ### Features
    - You can use tag policies to help standardize on tags across your organization's resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch new 12xlarge, 24xlarge, and metal instance sizes on the Amazon EC2 compute optimized C5 instance types featuring 2nd Gen Intel Xeon Scalable Processors.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug in `TransferManager` that can cause threads in the threadpool to get stuck if an exception occurs in `downloadDirectory` while the downloads are being initiated.

# __1.11.574__ __2019-06-17__
## __AWS RoboMaker__
  - ### Features
    - Add the ServiceUnavailableException (503) into CreateSimulationJob API.

## __AWS Service Catalog__
  - ### Features
    - Restrict concurrent calls by a single customer account for CreatePortfolioShare and DeletePortfolioShare when sharing/unsharing to an Organization.

## __Amazon Neptune__
  - ### Features
    - This release adds a feature to configure Amazon Neptune to publish audit logs to Amazon CloudWatch Logs.

# __1.11.573__ __2019-06-14__
## __Amazon AppStream__
  - ### Features
    - Added 2 new values(WINDOWS_SERVER_2016, WINDOWS_SERVER_2019) for PlatformType enum.

## __Amazon CloudFront__
  - ### Features
    - A new datatype in the CloudFront API, AliasICPRecordal, provides the ICP recordal status for CNAMEs associated with distributions. AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they have added to CloudFront. The status value is returned in the CloudFront response; you cannot configure it yourself. The status is set to APPROVED for all CNAMEs (aliases) in regions outside of China.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Correction to enumerations in EC2 client.

## __Amazon Personalize__
  - ### Features
    - Documentation updates for Amazon Personalize.

# __1.11.572__ __2019-06-13__
## __AWS App Mesh__
  - ### Features
    - This release adds support for AWS Cloud Map as a service discovery method for virtual nodes.

## __Amazon ElastiCache__
  - ### Features
    - This release is to add support for reader endpoint for cluster-mode disabled Amazon ElastiCache for Redis clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - G4 instances are Amazon EC2 instances based on NVIDIA T4 GPUs and are designed to provide cost-effective machine learning inference for applications, like image classification, object detection, recommender systems, automated speech recognition, and language translation. G4 instances are also a cost-effective platform for building and running graphics-intensive applications, such as remote graphics workstations, video transcoding, photo-realistic design, and game streaming in the cloud. To get started with G4 instances visit https://aws.amazon.com/ec2/instance-types/g4.

## __Amazon GuardDuty__
  - ### Features
    - Support for tagging functionality in Create and Get operations for Detector, IP Set, Threat Intel Set, and Finding Filter resources and 3 new tagging APIs: ListTagsForResource, TagResource, and UntagResource.

# __1.11.571__ __2019-06-12__
## __AWS Service Catalog__
  - ### Features
    - This release adds a new field named Guidance to update provisioning artifact, this field can be set by the administrator to provide guidance to end users about which provisioning artifacts to use.

# __1.11.570__ __2019-06-11__
## __Amazon SageMaker Service__
  - ### Features
    - The default TaskTimeLimitInSeconds of labeling job is increased to 8 hours. Batch Transform introduces a new DataProcessing field which supports input and output filtering and data joining. Training job increases the max allowed input channels from 8 to 20.

# __1.11.569__ __2019-06-10__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild adds support for source version on project level.

## __AWS CodeCommit__
  - ### Features
    - This release adds two merge strategies for merging pull requests: squash and three-way. It also adds functionality for resolving merge conflicts, testing merge outcomes, and for merging branches using one of the three supported merge strategies.

## __Amazon Personalize__
  - ### Features
    - Amazon Personalize is a machine learning service that makes it easy for developers to create individualized recommendations for customers using their applications.

## __Amazon Personalize Events__
  - ### Features
    - Introducing Amazon Personalize  - a machine learning service that makes it easy for developers to create individualized recommendations for customers using their applications.

## __Amazon Personalize Runtime__
  - ### Features
    - Amazon Personalize is a machine learning service that makes it easy for developers to create individualized recommendations for customers using their applications.

# __1.11.568__ __2019-06-07__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds DNS entries and NLB ARNs to describe-vpc-endpoint-connections API response. Adds owner ID to describe-vpc-endpoints and create-vpc-endpoint API responses.

# __1.11.567__ __2019-06-06__
## __AWS MediaConnect__
  - ### Features
    - This release adds support for encrypting entitlements using Secure Packager and Encoder Key Exchange (SPEKE).

## __AWS Organizations__
  - ### Features
    - You can tag and untag accounts in your organization and view tags on an account in your organization.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for dynamodb

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for launching container instances using supported Amazon EC2 instance types that have increased elastic network interface density. Using these instance types and opting in to the awsvpcTrunking account setting provides increased elastic network interface (ENI) density on newly launched container instances which allows you to place more tasks on each container instance.

## __Amazon GuardDuty__
  - ### Features
    - Improve FindingCriteria Condition field names, support long-typed conditions and deprecate old Condition field names.

## __Amazon Simple Email Service__
  - ### Features
    - You can now specify whether the Amazon Simple Email Service must deliver email over a connection that is encrypted using Transport Layer Security (TLS).

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - OpsCenter is a new Systems Manager capability that allows you to view, diagnose, and remediate, operational issues, aka OpsItems, related to various AWS resources by bringing together contextually relevant investigation information. New APIs to create, update, describe, and get OpsItems as well as OpsItems summary API. 

# __1.11.566__ __2019-06-05__
## __AWS Glue__
  - ### Features
    - Support specifying python version for Python shell jobs. A new parameter PythonVersion is added to the JobCommand data type.

# __1.11.565__ __2019-06-04__
## __AWS Identity and Access Management__
  - ### Features
    - This release adds validation for policy path field. This field is now restricted to be max 512 characters.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now supports AWS PrivateLink, enabling you to administer and use gateways without needing to use public IP addresses or a NAT/Internet Gateway, while avoiding traffic from going over the internet.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now allows you to apply available service updates on demand. Features included: (1) Access to the list of applicable service updates and their priorities. (2) Service update monitoring and regular status updates. (3) Recommended apply-by-dates for scheduling the service updates, which is critical if your cluster is in ElastiCache-supported compliance programs. (4) Ability to stop and later re-apply updates. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Self-Service-Updates.html

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Host Recovery feature which automatically restarts instances on to a new replacement host if failures are detected on Dedicated Host.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for s3

# __1.11.564__ __2019-06-03__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 I3en instances are the new storage-optimized instances offering up to 60 TB NVMe SSD instance storage and up to 100 Gbps of network bandwidth.

## __Amazon Relational Database Service__
  - ### Features
    - Amazon RDS Data API is generally available. Removing beta notes in the documentation.

# __1.11.563__ __2019-05-30__
## __AWS CodeCommit__
  - ### Features
    - This release adds APIs that allow adding and removing tags to a repository, and viewing tags for a repository. It also enables adding tags when creating a repository.

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics adds the option to use your own S3 bucket to store channel and data store resources. Previously, only service-managed storage was used.

## __AWS IoT Events__
  - ### Features
    - The AWS IoT Events service allows customers to monitor their IoT devices and sensors to detect failures or changes in operation and to trigger actions when these events occur

## __AWS IoT Events Data__
  - ### Features
    - The AWS IoT Events service allows customers to monitor their IoT devices and sensors to detect failures or changes in operation and to trigger actions when these events occur

## __AWS RDS DataService__
  - ### Features
    - The RDS Data API is generally available for the MySQL-compatible edition of Amazon Aurora Serverless in the US East (N. Virginia and Ohio), US West (Oregon), EU (Ireland), and Asia Pacific (Tokyo) regions. This service enables you to easily access Aurora Serverless clusters with web services-based applications including AWS Lambda and AWS AppSync. The new APIs included in this SDK release are ExecuteStatement, BatchExecuteStatement, BeginTransaction, CommitTransaction, and RollbackTransaction. The ExecuteSql API is deprecated; instead use ExecuteStatement which provides additional functionality including transaction support.

## __AWS SDK for Java__
  - ### Bugfixes
    - Improved exception messages in credential providers to exclude detailed parse errors that may contain sensitive information.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog ListStackInstancesForProvisionedProduct API enables customers to get details of a provisioned product with type "CFN_STACKSET". By passing the provisioned product id, the API will list account, region and status of each stack instances that are associated with this provisioned product.

## __Amazon Pinpoint Email Service__
  - ### Features
    - You can now specify whether the Amazon Pinpoint Email service must deliver email over a connection that is encrypted using Transport Layer Security (TLS).

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Activity Streams for database clusters.

## __Managed Streaming for Kafka__
  - ### Features
    - Updated APIs for Amazon MSK to enable new features such as encryption in transit, client authentication, and scaling storage.

# __1.11.562__ __2019-05-29__
## __AWS IoT Things Graph__
  - ### Features
    - Initial release.

## __AWS SecurityHub__
  - ### Features
    - This update adds the ListProductSubscribers API, DescribeProducts API, removes CONTAINS as a comparison value for the StringFilter, and only allows use of EQUALS instead of CONTAINS in MapFilter.  

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Customers can now simultaneously take snapshots of multiple EBS volumes attached to an EC2 instance. With this new capability, snapshots guarantee crash-consistency across multiple volumes by preserving the order of IO operations. This new feature is fully integrated with Amazon Data Lifecycle Manager (DLM) allowing customers to automatically manage snapshots by creating lifecycle policies. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Customers can now simultaneously take snapshots of multiple EBS volumes attached to an EC2 instance. With this new capability, snapshots guarantee crash-consistency across multiple volumes by preserving the order of IO operations. This new feature is fully integrated with Amazon Data Lifecycle Manager (DLM) allowing customers to automatically manage snapshots by creating lifecycle policies. 

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager - Documentation updates

# __1.11.561__ __2019-05-28__
## __AWS Ground Station__
  - ### Features
    - AWS Ground Station is a fully managed service that enables you to control satellite communications, downlink and process satellite data, and scale your satellite operations efficiently and cost-effectively without having to build or manage your own ground station infrastructure.

## __AWS RoboMaker__
  - ### Features
    - Added support for an additional robot software suite (Gazebo 9) and for cancelling deployment jobs.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for iam

## __AWS Storage Gateway__
  - ### Features
    - Introduce AssignTapePool operation to allow customers to migrate tapes between pools.

## __AWS WAF__
  - ### Features
    - Documentation updates for waf

## __Amazon Chime__
  - ### Features
    - This release adds the ability to search and order toll free phone numbers for Voice Connectors.

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release adds support for programmatic access to Deliverability dashboard subscriptions and the deliverability data provided by the Deliverability dashboard for domains and IP addresses. The data includes placement metrics for campaigns that use subscribed domains to send email.

## __Amazon Relational Database Service__
  - ### Features
    - Add a new output field Status to DBEngineVersion which shows the status of the engine version (either available or deprecated). Add a new parameter IncludeAll to DescribeDBEngineVersions to make it possible to return both available and deprecated engine versions. These changes enable a user to create a Read Replica of an DB instance on a deprecated engine version.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Modern Standard Arabic (ar-SA).

# __1.11.560__ __2019-05-24__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy now supports tagging for the application and deployment group resources.

## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - MediaStore - This release adds support for chunked transfer of objects, which reduces latency by making an object available for downloading while it is still being uploaded.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for OpsWorks for Chef Automate; attribute values updated for Chef Automate 2.0 release.

# __1.11.559__ __2019-05-23__
## __AWS WAF Regional__
  - ### Features
    - Documentation updates for waf-regional

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New APIs to enable EBS encryption by default feature. Once EBS encryption by default is enabled in a region within the account, all new EBS volumes and snapshot copies are always encrypted

# __1.11.558__ __2019-05-22__
## __AWS Budgets__
  - ### Features
    - Added new datatype PlannedBudgetLimits to Budget model, and updated examples for AWS Budgets API for UpdateBudget, CreateBudget, DescribeBudget, and DescribeBudgets

## __AWS Device Farm__
  - ### Features
    - This release introduces support for tagging, tag-based access control, and resource-based access control.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog UpdateProvisionedProductProperties API enables customers to manage provisioned product ownership. Administrators can now update the user associated to a provisioned product to another user within the same account allowing the new user to describe, update, terminate and execute service actions in that Service Catalog resource. New owner will also be able to list and describe all past records executed for that provisioned product.

## __Amazon API Gateway__
  - ### Features
    - This release adds support for tagging of Amazon API Gateway resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds idempotency support for associate, create route and authorization APIs for AWS Client VPN Endpoints.

## __Amazon Elastic File System__
  - ### Features
    - AWS EFS documentation updated to reflect the minimum required value for ProvisionedThroughputInMibps is 1 from the previously documented 0. The service has always required a minimum value of 1, therefor service behavior is not changed. 

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. This release introduces new APIs to associate and manage website authorization providers with Amazon WorkLink fleets.

# __1.11.557__ __2019-05-21__
## __AWS DataSync__
  - ### Features
    - Documentation update and refine pagination token on Datasync List API's

## __Alexa For Business__
  - ### Features
    - This release contains API changes to allow customers to create and manage Network Profiles for their Shared devices

# __1.11.556__ __2019-05-20__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - AWS Elemental MediaPackage now supports Video-on-Demand (VOD) workflows.  These new features allow you to easily deliver a vast library of source video Assets stored in your own S3 buckets using a small set of simple to set up Packaging Configurations and Packaging Groups.

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for meteringmarketplace

## __Managed Streaming for Kafka__
  - ### Features
    - Updated APIs for the Managed Streaming for Kafka service that let customers create clusters with custom Kafka configuration. 

# __1.11.555__ __2019-05-17__
## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing subscriptions to AppStream 2.0 usage reports and configuring idle disconnect timeouts on AppStream 2.0 fleets.

# __1.11.554__ __2019-05-16__
## __AWS Elemental MediaLive__
  - ### Features
    - Added channel state waiters to MediaLive.

## __Amazon Simple Storage Service__
  - ### Features
    - This release updates the Amazon S3 PUT Bucket replication API to include a new optional field named token, which allows you to add a replication configuration to an S3 bucket that has Object Lock enabled.

# __1.11.553__ __2019-05-15__
## __AWS CodePipeline__
  - ### Features
    - This feature includes new APIs to add, edit, remove and view tags for pipeline, custom action type and webhook resources. You can also add tags while creating these resources.

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds optional configuration for DASH SegmentTemplateFormat to refer to segments by Number with Duration, rather than Number or Time with SegmentTimeline.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding tagging support for VPC Endpoints and VPC Endpoint Services.

## __Amazon Relational Database Service__
  - ### Features
    - In the RDS API and CLI documentation, corrections to the descriptions for Boolean parameters to avoid references to TRUE and FALSE. The RDS CLI does not allow TRUE and FALSE values values for Boolean parameters.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Indian English (en-IN) and Hindi (hi-IN).

# __1.11.552__ __2019-05-14__
## __AWS Storage Gateway__
  - ### Features
    - Add Tags parameter to CreateSnapshot and UpdateSnapshotSchedule APIs, used for creating tags on create for one off snapshots and scheduled snapshots.

## __Amazon Chime__
  - ### Features
    - Amazon Chime private bots GA release.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend now supports Virtual Private Cloud for Asynchronous Batch Processing jobs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Pagination support for ec2.DescribeSubnets, ec2.DescribeDhcpOptions 

# __1.11.551__ __2019-05-13__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now enables exclude and include filters to control what files and directories will be copied as part of a task execution.

## __AWS IoT Analytics__
  - ### Features
    - ContentDeliveryRule to support sending dataset to S3 and glue

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Node.js v10

# __1.11.550__ __2019-05-10__
## __AWS Glue__
  - ### Features
    - AWS Glue now supports specifying existing catalog tables for a crawler to examine as a data source. A new parameter CatalogTargets is added to the CrawlerTargets data type. 

## __AWS Security Token Service__
  - ### Features
    - AWS Security Token Service (STS) now supports passing IAM Managed Policy ARNs as session policies when you programmatically create temporary sessions for a role or federated user. The Managed Policy ARNs can be passed via the PolicyArns parameter, which is now available in the AssumeRole, AssumeRoleWithWebIdentity, AssumeRoleWithSAML, and GetFederationToken APIs. The session policies referenced by the PolicyArn parameter will only further restrict the existing permissions of an IAM User or Role for individual sessions.

# __1.11.549__ __2019-05-08__
## __AWS IoT 1-Click Projects Service__
  - ### Features
    - Added automatic pagination support for ListProjects and ListPlacements APIs.

## __AWS Service Catalog__
  - ### Features
    - Adds "Parameters" field in UpdateConstraint API, which will allow Admin user to update "Parameters" in created Constraints.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Documentation update for Amazon EKS to clarify allowed parameters in update-cluster-config.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics APIs now support tagging on applications.

## __Amazon SageMaker Service__
  - ### Features
    - Workteams now supports notification configurations. Neo now supports Jetson Nano as a target device and NumberOfHumanWorkersPerDataObject is now included in the ListLabelingJobsForWorkteam response.

# __1.11.548__ __2019-05-07__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports the ability to add additional authentication providers to your AWS AppSync GraphQL API as well as the ability to retrieve directives configured against fields or object type definitions during schema introspection.

## __AWS Storage Gateway__
  - ### Features
    - Add optional field AdminUserList to CreateSMBFileShare and UpdateSMBFileShare APIs.

## __Alexa For Business__
  - ### Features
    - This release adds an API allowing authorized users to delete a shared device's history of voice recordings and associated response data.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Patch Manager adds support for Microsoft Application Patching.

# __1.11.547__ __2019-05-06__
## __AWS CodePipeline__
  - ### Features
    - Documentation updates for codepipeline

## __AWS Config__
  - ### Features
    - AWS Config now supports tagging on PutConfigRule, PutConfigurationAggregator and PutAggregationAuthorization APIs.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for sts

# __1.11.546__ __2019-05-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - DASH output groups using DRM encryption can now enable a playback device compatibility mode to correct problems with playback on older devices. 

## __AWS Elemental MediaLive__
  - ### Features
    - You can now switch the channel mode of your channels from standard to single pipeline and from single pipeline to standard. In order to switch a channel from single pipeline to standard all inputs attached to the channel must support two encoder pipelines.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release of Amazon Cognito User Pools introduces the new AdminSetUserPassword API that allows administrators of a user pool to change a user's password. The new password can be temporary or permanent.

## __Amazon WorkMail__
  - ### Features
    - Amazon WorkMail is releasing two new actions: 'GetMailboxDetails' and 'UpdateMailboxQuota'. They add insight into how much space is used by a given mailbox (size) and what its limit is (quota). A mailbox quota can be updated, but lowering the value will not influence WorkMail per user charges. For a closer look at the actions please visit https://docs.aws.amazon.com/workmail/latest/APIReference/API_Operations.html

# __1.11.545__ __2019-05-02__
## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (KMS) can return an INTERNAL_ERROR connection error code if it cannot connect a custom key store to its AWS CloudHSM cluster. INTERNAL_ERROR is one of several connection error codes that help you to diagnose and fix a problem with your custom key store.

## __Alexa For Business__
  - ### Features
    - This release allows developers and customers to send text and audio announcements to rooms.

# __1.11.544__ __2019-05-01__
## __AWS X-Ray__
  - ### Features
    - AWS X-Ray now includes Analytics, an interactive approach to analyzing user request paths (i.e., traces). Analytics will allow you to easily understand how your application and its underlying services are performing. With X-Ray Analytics, you can quickly detect application issues, pinpoint the root cause of the issue, determine the severity of the issues, and identify which end users were impacted. With AWS X-Ray Analytics you can explore, analyze, and visualize traces, allowing you to find increases in response time to user requests or increases in error rates. Metadata around peak periods, including frequency and actual times of occurrence, can be investigated by applying filters with a few clicks. You can then drill down on specific errors, faults, and response time root causes and view the associated traces. 

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces additional task definition parameters that enable you to define secret options for Docker log configuration, a per-container list contains secrets stored in AWS Systems Manager Parameter Store or AWS Secrets Manager.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds an API for the modification of a VPN Connection, enabling migration from a Virtual Private Gateway (VGW) to a Transit Gateway (TGW), while preserving the VPN endpoint IP addresses on the AWS side as well as the tunnel options.

# __1.11.543__ __2019-04-30__
## __AWS CodePipeline__
  - ### Features
    - This release contains an update to the PipelineContext object that includes the Pipeline ARN, and the Pipeline Execution Id. The ActionContext object is also updated to include the Action Execution Id.

## __AWS Direct Connect__
  - ### Features
    - This release adds support for AWS Direct Connect customers to use AWS Transit Gateway with AWS Direct Connect gateway to route traffic between on-premise networks and their VPCs.

## __AWS S3 Control__
  - ### Features
    - Add support for Amazon S3 Batch Operations.

## __AWS Service Catalog__
  - ### Features
    - Admin users can now associate/disassociate aws budgets with a portfolio or product in Service Catalog. End users can see the association by listing it or as part of the describe portfolio/product output. A new optional boolean parameter, "DisableTemplateValidation", is added to ProvisioningArtifactProperties data type. The purpose of the parameter is to enable or disable the CloudFormation template validtion when creating a product or a provisioning artifact.

## __Amazon Managed Blockchain__
  - ### Features
    - (New Service) Amazon Managed Blockchain is a fully managed service that makes it easy to create and manage scalable blockchain networks using popular open source frameworks.

## __Amazon Neptune__
  - ### Features
    - Adds a feature to allow customers to specify a custom parameter group when restoring a database cluster.

# __1.11.542__ __2019-04-29__
## __AWS Transfer for SFTP__
  - ### Features
    - This release adds support for per-server host-key management. You can now specify the SSH RSA private key used by your SFTP server.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for Elastic Fabric Adapter (EFA) ENIs. 

# __1.11.541__ __2019-04-26__
## __AWS Identity and Access Management__
  - ### Features
    - AWS Security Token Service (STS) enables you to request session tokens from the global STS endpoint that work in all AWS Regions. You can configure the global STS endpoint to vend session tokens that are compatible with all AWS Regions using the new IAM SetSecurityTokenServicePreferences API. 

## __Amazon Simple Notification Service__
  - ### Features
    - With this release AWS SNS adds tagging support for Topics.

# __1.11.540__ __2019-04-25__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports the GetLayerVersionByArn API.

## __Amazon DynamoDB__
  - ### Features
    - This update allows you to tag Amazon DynamoDB tables when you create them. Tags are labels you can attach to AWS resources to make them easier to manage, search, and filter. 

## __Amazon GameLift__
  - ### Features
    - This release introduces the new Realtime Servers feature, giving game developers a lightweight yet flexible solution that eliminates the need to build a fully custom game server. The AWS SDK updates provide support for scripts, which are used to configure and customize Realtime Servers.

## __Amazon Inspector__
  - ### Features
    - AWS Inspector - Improve the ListFindings API response time and decreases the maximum number of agentIDs from 500 to 99.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for workspaces

# __1.11.539__ __2019-04-24__
## __AWS CloudFormation__
  - ### Features
    - Documentation updates for cloudformation

## __AWS MediaConnect__
  - ### Features
    - Adds support for ListEntitlements pagination.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now includes a new parameter to support origin servers that produce single-period DASH manifests.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now supports Access Control Lists (ACLs) on File Gateway SMB shares, enabling you to apply fine grained access controls for Active Directory users and groups.

## __Alexa For Business__
  - ### Features
    - This release adds support for the Alexa for Business gateway and gateway group APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the new Amazon EC2 general purpose burstable instance types T3a that feature AMD EPYC processors.

## __Amazon Relational Database Service__
  - ### Features
    - A new parameter "feature-name" is added to the add-role and remove-role db cluster APIs. The value for the parameter is optional for Aurora MySQL compatible database clusters, but mandatory for Aurora PostgresQL. You can find the valid list of values using describe db engine versions API.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Asia Pacific (Hong Kong) Region (ap-east-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to allow customers to configure parameters to use either the standard-parameter tier (the default tier) or the advanced-parameter tier. It allows customers to create parameters with larger values and attach parameter policies to an Advanced Parameter. 

## __Amazon Textract__
  - ### Features
    - This release adds support for checkbox also known as SELECTION_ELEMENT in Amazon Textract.

# __1.11.538__ __2019-04-19__
## __AWS Resource Groups__
  - ### Features
    - The AWS Resource Groups service increased the query size limit to 4096 bytes.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Spanish Spanish (es-ES).

## __Amazon WorkSpaces__
  - ### Features
    - Added a new reserved field.

# __1.11.537__ __2019-04-18__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's DescribeImportTasks and BatchDeleteImportData APIs now return additional statuses for error reporting.

## __AWS Organizations__
  - ### Features
    - AWS Organizations is now available in the AWS GovCloud (US) Regions, and we added a new API action for creating accounts in those Regions. For more information, see CreateGovCloudAccount in the AWS Organizations API Reference. 

## __Amazon Cognito Identity Provider__
  - ### Features
    - Document updates for Amazon Cognito Identity Provider.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the TimeoutAction parameter to the ScalingConfiguration of an Aurora Serverless DB cluster. You can now configure the behavior when an auto-scaling capacity change can't find a scaling point.

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. This release introduces new APIs to link and manage internal websites and web apps with Amazon WorkLink fleets. 

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for workspaces

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon Kafka - Added tagging APIs

# __1.11.536__ __2019-04-17__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for requester-managed Interface VPC Endpoints (powered by AWS PrivateLink). The feature prevents VPC endpoint owners from accidentally deleting or otherwise mismanaging the VPC endpoints of some AWS VPC endpoint services.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds Arabic language support with new female voice - "Zeina"

# __1.11.535__ __2019-04-16__
## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __AWS Storage Gateway__
  - ### Features
    - This change allows you to select either a weekly or monthly maintenance window for your volume or tape gateway. It also allows you to tag your tape and volume resources on creation by adding a Tag value on calls to the respective api endpoints.

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds support for the new email configuration in Amazon Cognito User Pools. You can now specify whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES email configuration.

## __Amazon Redshift__
  - ### Features
    - DescribeResize can now return percent of data transferred from source cluster to target cluster for a classic resize.

## __AmazonMQ__
  - ### Features
    - This release adds the ability to retrieve information about broker engines and broker instance options. See Broker Engine Types and Broker Instance Options in the Amazon MQ REST API Reference.

# __1.11.534__ __2019-04-05__
## __AWS Elemental MediaConvert__
  - ### Features
    - Rectify incorrect modelling of DisassociateCertificate method

## __AWS Elemental MediaLive__
  - ### Features
    - Today AWS Elemental MediaLive (https://aws.amazon.com/medialive/) adds the option to create "Single Pipeline" channels, which offers a lower-cost option compared to Standard channels. MediaLive Single Pipeline channels have a single encoding pipeline rather than the redundant dual Availability Zone (AZ) pipelines that MediaLive provides with a "Standard" channel.

## __AWS Glue__
  - ### Features
    - AWS Glue now supports workerType choices in the CreateJob, UpdateJob, and StartJobRun APIs, to be used for memory-intensive jobs.

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - Documentation updates for 1-Click: improved descriptions of resource tagging APIs.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend provides confusion matrix for custom document classifier.

# __1.11.533__ __2019-04-04__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Added support to enable or disable publishing Kubernetes cluster logs in AWS CloudWatch

# __1.11.532__ __2019-04-03__
## __AWS Batch__
  - ### Features
    - Support for GPU resource requirement in RegisterJobDefinition and SubmitJob

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend  adds tagging support for document-classifiers and entity-recognizers.

# __1.11.531__ __2019-04-02__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __AWS SecurityHub__
  - ### Features
    - This update includes 3 additional error codes: AccessDeniedException, InvalidAccessException, and ResourceConflictException. This update also removes the error code ResourceNotFoundException from the GetFindings, GetInvitationsCount, ListInvitations, and ListMembers operations. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add paginators.

# __1.11.530__ __2019-04-01__
## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds the ability to modify instance group configurations on a running cluster through the new "configurations" field in the ModifyInstanceGroups API.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - March 2019 documentation updates for Systems Manager.

# __1.11.529__ __2019-03-29__
## __AWS Greengrass__
  - ### Features
    - Greengrass APIs now support tagging operations on resources

## __Amazon CloudWatch__
  - ### Features
    - Added 3 new APIs, and one additional parameter to PutMetricAlarm API, to support tagging of CloudWatch Alarms.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend supports encryption of output results of analysis jobs and volume data on the storage volume attached to the compute instance that processes the analysis job.

# __1.11.528__ __2019-03-28__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds a new output locking mode synchronized to the Unix epoch.

## __AWS Service Catalog__
  - ### Features
    - Adds "Tags" field in UpdateProvisionedProduct API. The product should have a new RESOURCE_UPDATE Constraint with TagUpdateOnProvisionedProduct field set to ALLOWED for it to work. See API docs for CreateConstraint for more information

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release adds support for using the Amazon Pinpoint Email API to tag the following types of Amazon Pinpoint resources: configuration sets; dedicated IP pools; deliverability dashboard reports; and, email identities. A tag is a label that you optionally define and associate with these types of resources. Tags can help you categorize and manage these resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags. For more information, see the Amazon Pinpoint Email API Reference.

## __Amazon WorkSpaces__
  - ### Features
    - Amazon WorkSpaces adds tagging support for WorkSpaces Images, WorkSpaces directories, WorkSpaces bundles and IP Access control groups.

# __1.11.527__ __2019-03-27__
## __AWS App Mesh__
  - ### Features
    - This release includes AWS Tagging integration for App Mesh, VirtualNode access logging, TCP routing, and Mesh-wide external traffic egress control. See https://docs.aws.amazon.com/app-mesh/latest/APIReference/Welcome.html for more details.

## __AWS Storage Gateway__
  - ### Features
    - This change allows you to select a pool for archiving virtual tapes. Pools are associated with S3 storage classes. You can now choose to archive virtual tapes in either S3 Glacier or S3 Glacier Deep Archive storage class. CreateTapes API now takes a new PoolId parameter which can either be GLACIER or DEEP_ARCHIVE. Tapes created with this parameter will be archived in the corresponding storage class.

## __AWS Transfer for SFTP__
  - ### Features
    -  This release adds PrivateLink support to your AWS SFTP server endpoint, enabling the customer to access their SFTP server within a VPC, without having to traverse the internet. Customers can now can create a server and specify an option whether they want the endpoint to be hosted as public or in their VPC, and with the in VPC option, SFTP clients and users can access the server only from the customer's VPC or from their on-premises environments using DX or VPN. This release also relaxes the SFTP user name requirements to allow underscores and hyphens.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for external deployment controllers for ECS services with the launch of task set management APIs. Task sets are a new primitive for controlled management of application deployments within a single ECS service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the new Amazon EC2 R5ad and M5ad instances that feature local NVMe attached SSD instance storage (up to 3600 GB). M5ad and R5ad feature AMD EPYC processors that offer a 10% cost savings over the M5d and R5d EC2 instances.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Glacier Deep Archive provides secure, durable object storage class for long term data archival. This SDK release provides API support for this new storage class.

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for routing based on HTTP headers, methods, query string or query parameters and source IP addresses in Application Load Balancer.

# __1.11.526__ __2019-03-26__
## __AWS Glue__
  - ### Features
    - This new feature will now allow customers to add a customized csv classifier with classifier API. They can specify a custom delimiter, quote symbol and control other behavior they'd like crawlers to have while recognizing csv files

## __Amazon WorkMail__
  - ### Features
    - Documentation updates for Amazon WorkMail.

# __1.11.525__ __2019-03-25__
## __AWS Direct Connect__
  - ### Features
    - Direct Connect gateway enables you to establish connectivity between your on-premise networks and Amazon Virtual Private Clouds (VPCs) in any commercial AWS Region (except in China) using AWS Direct Connect connections at any AWS Direct Connect location. This release enables multi-account support for Direct Connect gateway, with multi-account support for Direct Connect gateway, you can associate up to ten VPCs from any AWS account with a Direct Connect gateway. The AWS accounts owning VPCs and the Direct Connect gateway must belong to the same AWS payer account ID. This release also enables Direct Connect Gateway owners to allocate allowed prefixes from each associated VPCs.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds support for detailed job progress status and S3 server-side output encryption. In addition, the anti-alias filter will now be automatically applied to all outputs

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - This release adds tagging support for AWS IoT 1-Click Device resources. Use these APIs to add, remove, or list tags on Devices, and leverage the tags for various authorization and billing scenarios. This release also adds the ARN property for DescribeDevice response object.

## __AWS IoT Analytics__
  - ### Features
    - This change allows you to specify the number of versions of IoT Analytics data set content to be retained. Previously, the number of versions was managed implicitly via the setting of the data set's retention period.

## __AWS RoboMaker__
  - ### Features
    - Added additional progress metadata fields for robot deployments

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - With this release Amazon Transcribe enhances the custom vocabulary feature to improve accuracy by providing customization on pronunciations and output formatting. 

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now allows customer to centrally enable AWS Shield Advanced DDoS protection for their entire AWS infrastructure, across accounts and applications.

# __1.11.524__ __2019-03-22__
## __AWS IoT 1-Click Projects Service__
  - ### Features
    - This release adds tagging support for AWS IoT 1-Click Project resources. Use these APIs to add, remove, or list tags on Projects, and leverage the tags for various authorization and billing scenarios. This release also adds the ARN property to projects for DescribeProject and ListProject responses.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in German (de-DE) and Korean (ko-KR).

# __1.11.523__ __2019-03-21__
## __AWS IoT__
  - ### Features
    - This release adds the GetStatistics API for the AWS IoT Fleet Indexing Service, which allows customers to query for statistics about registered devices that match a search query. This release only supports the count statistics. For more information about this API, see https://docs.aws.amazon.com/iot/latest/apireference/API_GetStatistics.html

## __AWS SDK for Java__
  - ### Features
    - Allow enabling client-side configuration using environment variables, system properties or profile file in the deprecated default client constructor.

## __Amazon CloudWatch Events__
  - ### Features
    - Added 3 new APIs, and one additional parameter to the PutRule API, to support tagging of CloudWatch Events rules.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds tags and tag-based access control support to Amazon Cognito User Pools.

## __Amazon Lightsail__
  - ### Features
    - This release adds the DeleteKnownHostKeys API, which enables Lightsail's browser-based SSH or RDP clients to connect to the instance after a host key mismatch.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling

# __1.11.522__ __2019-03-20__
## __AWS CodePipeline__
  - ### Features
    - Add support for viewing details of each action execution belonging to past and latest pipeline executions that have occurred in customer's pipeline. The details include start/updated times, action execution results, input/output artifacts information, etc. Customers also have the option to add pipelineExecutionId in the input to filter the results down to a single pipeline execution.

## __AWSMarketplace Metering__
  - ### Features
    - This release increases AWS Marketplace Metering Service maximum usage quantity to 2147483647 and makes parameters usage quantity and dryrun optional.

## __Amazon Cognito Identity__
  - ### Features
    - This release adds tags and tag-based access control support to Amazon Cognito Identity Pools (Federated Identities). 

# __1.11.521__ __2019-03-19__
## __AWS Config__
  - ### Features
    - AWS Config adds a new API called SelectResourceConfig to run advanced queries based on resource configuration properties.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Added support to control private/public access to the Kubernetes API-server endpoint

# __1.11.520__ __2019-03-18__
## __AWS Database Migration Service__
  - ### Features
    - S3 Endpoint Settings added support for 1) Migrating to Amazon S3 as a target in Parquet format 2) Encrypting S3 objects after migration with custom KMS Server-Side encryption. Redshift Endpoint Settings added support for encrypting intermediate S3 objects during migration with custom KMS Server-Side encryption. 

## __Amazon Chime__
  - ### Features
    - This release adds support for the Amazon Chime Business Calling and Voice Connector features.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeFpgaImages API now returns a new DataRetentionSupport attribute to indicate if the AFI meets the requirements to support DRAM data retention. DataRetentionSupport is a read-only attribute.

# __1.11.519__ __2019-03-14__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager has added a new API action, RenewCertificate. RenewCertificate causes ACM to force the renewal of any private certificate which has been exported.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Certificate Manager (ACM) Private CA allows customers to manage permissions on their CAs. Customers can grant or deny AWS Certificate Manager permission to renew exported private certificates.

## __AWS Config__
  - ### Features
    - AWS Config - add ability to tag, untag and list tags for ConfigRule, ConfigurationAggregator and AggregationAuthorization resource types. Tags can be used for various scenarios including tag based authorization.

## __AWS IoT__
  - ### Features
    - In this release, AWS IoT introduces support for tagging OTA Update and Stream resources. For more information about tagging, see the AWS IoT Developer Guide.

## __Amazon CloudWatch__
  - ### Features
    - New Messages parameter for the output of GetMetricData, to support new metric search functionality.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds tagging support for Dedicated Host Reservations.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports random search and hyperparameter scaling.

# __1.11.518__ __2019-03-13__
## __AWS Config__
  - ### Features
    - Config released Remediation APIs allowing Remediation of Config Rules

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

# __1.11.517__ __2019-03-12__
## __AWSServerlessApplicationRepository__
  - ### Features
    - The AWS Serverless Application Repository now supports associating a ZIP source code archive with versions of an application.

# __1.11.516__ __2019-03-11__
## __AWS Cost Explorer Service__
  - ### Features
    - The only change in this release is to make TimePeriod a required parameter in GetCostAndUsageRequest.

## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk added support for tagging, and tag-based access control, of all Elastic Beanstalk resources.

## __AWS Glue__
  - ### Features
    - CreateDevEndpoint and UpdateDevEndpoint now support Arguments to configure the DevEndpoint. 

## __AWS IoT__
  - ### Features
    - Documentation updates for iot

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight user and group operation results now include group principal IDs and user principal IDs. This release also adds "DeleteUserByPrincipalId", which deletes users given their principal ID. The update also improves role session name validation.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition

# __1.11.515__ __2019-03-08__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild also now supports Git Submodules.  CodeBuild now supports opting out of Encryption for S3 Build Logs.  By default these logs are encrypted.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker notebook instances now support enabling or disabling root access for notebook users. SageMaker Neo now supports rk3399 and rk3288 as compilation target devices.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for s3

# __1.11.514__ __2019-03-07__
## __AWS App Mesh__
  - ### Features
    - This release includes a new version of the AWS App Mesh APIs. You can read more about the new APIs here: https://docs.aws.amazon.com/app-mesh/latest/APIReference/Welcome.html.

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds a MediaPackage output group, simplifying configuration of outputs to AWS Elemental MediaPackage.

## __AWS Greengrass__
  - ### Features
    - Greengrass group UID and GID settings can now be configured to use a provided default via FunctionDefaultConfig. If configured, all Lambda processes in your deployed Greengrass group will by default start with the provided UID and/or GID, rather than by default starting with UID "ggc_user" and GID "ggc_group" as they would if not configured. Individual Lambdas can also be configured to override the defaults if desired via each object in the Functions list of your FunctionDefinitionVersion.

## __AWS SDK for Java__
  - ### Features
    - Add JVM Vendor name to User Agent String

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces additional task definition parameters that enable you to define dependencies for container startup and shutdown, a per-container start and stop timeout value, as well as an AWS App Mesh proxy configuration which eases the integration between Amazon ECS and AWS App Mesh.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift-hosted instances can now securely access resources on other AWS services using IAM roles. See more details at https://aws.amazon.com/releasenotes/amazon-gamelift/.

## __Amazon Relational Database Service__
  - ### Features
    - You can configure your Aurora database cluster to automatically copy tags on the cluster to any automated or manual database cluster snapshots that are created from the cluster. This allows you to easily set metadata on your snapshots to match the parent cluster, including access policies. You may enable or disable this functionality while creating a new cluster, or by modifying an existing database cluster.

## __Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling

# __1.11.513__ __2019-03-06__
## __AWS Direct Connect__
  - ### Features
    - Exposed a new available port speeds field in the DescribeLocation api call.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds pagination support for ec2.DescribeVpcs, ec2.DescribeInternetGateways and ec2.DescribeNetworkAcls APIs

## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for elasticfilesystem adding new examples for EFS Lifecycle Management feature.

# __1.11.512__ __2019-03-05__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for pausing and unpausing one or both pipelines at scheduled times.

## __AWS Storage Gateway__
  - ### Features
    - ActivateGateway, CreateNFSFileShare and CreateSMBFileShare APIs support a new parameter: Tags (to be attached to the created resource). Output for DescribeNFSFileShare, DescribeSMBFileShare and DescribeGatewayInformation APIs now also list the Tags associated with the resource. Minimum length of a KMSKey is now 7 characters.

## __Amazon Textract__
  - ### Features
    - This release is intended ONLY for customers that are officially part of the Amazon Textract Preview program.  If you are not officially part of the Amazon Textract program THIS WILL NOT WORK.  Our two main regions for Amazon Textract Preview are N. Virginia and Dublin.  Also some members have been added to Oregon and Ohio.  If you are outside of any of these AWS regions, Amazon Textract Preview definitely will not work. If you would like to be part of the Amazon Textract program, you can officially request sign up here - https://pages.awscloud.com/textract-preview.html. To set expectations appropriately, we are aiming to admit new preview participants once a week until General Availability.

# __1.11.511__ __2019-03-04__
## __AWS Elemental MediaPackage__
  - ### Features
    - This release adds support for user-defined tagging of MediaPackage resources. Users may now call operations to list, add and remove tags from channels and origin-endpoints. Users can also specify tags to be attached to these resources during their creation. Describe and list operations on these resources will now additionally return any tags associated with them.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to support service settings for AWS customers.  A service setting is a key-value pair that defines how a user interacts with or uses an AWS service, and is typically created and consumed by the AWS service team. AWS customers can read a service setting via GetServiceSetting API and update the setting via UpdateServiceSetting API or ResetServiceSetting API, which are introduced in this release. For example, if an AWS service charges money to the account based on a feature or service usage, then the AWS service team might create a setting with the default value of "false".   This means the user can't use this feature unless they update the setting to "true" and  intentionally opt in for a paid feature.

# __1.11.510__ __2019-03-01__
## __AWS Auto Scaling Plans__
  - ### Features
    - Documentation updates for autoscaling-plans

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for modifying instance event start time which allows users to reschedule EC2 events.

# __1.11.509__ __2019-02-28__
## __Alexa For Business__
  - ### Features
    - This release adds the PutInvitationConfiguration API to configure the user invitation email template with custom attributes, and the GetInvitationConfiguration API to retrieve the configured values.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager State Manager now supports associations using documents shared by other AWS accounts.

## __AmazonApiGatewayV2__
  - ### Features
    - Marking certain properties as explicitly required and fixing an issue with the GetApiMappings operation for ApiMapping resources.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

# __1.11.508__ __2019-02-27__
## __AWS WAF__
  - ### Features
    - Documentation updates for waf

## __AWS WAF Regional__
  - ### Features
    - Documentation updates for waf-regional

# __1.11.507__ __2019-02-26__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for discovery

## __AWS Cost and Usage Report Service__
  - ### Features
    - Adding support for Athena and new report preferences to the Cost and Usage Report API.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added several features including support for: auto-rotation or user-specified rotation of 0, 90, 180, or 270 degrees; multiple output groups with DRM; ESAM XML documents to specify ad insertion points; Offline Apple HLS FairPlay content protection. 

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for opsworkscm

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Resource Groups__
  - ### Features
    - Documentation updates for Resource Groups API; updating description of Tag API.

## __Amazon Pinpoint__
  - ### Features
    - This release adds support for the Amazon Resource Groups Tagging API to Amazon Pinpoint, which means that you can now add and manage tags for Amazon Pinpoint projects (apps), campaigns, and segments. A tag is a label that you optionally define and associate with Amazon Pinpoint resource. Tags can help you categorize and manage these types of resources in different ways, such as by purpose, owner, environment, or other criteria. For example, you can use tags to apply policies or automation, or to identify resources that are subject to certain compliance requirements. A project, campaign, or segment can have as many as 50 tags. For more information about using and managing tags in Amazon Pinpoint, see the Amazon Pinpoint Developer Guide at https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html. For more information about the Amazon Resource Group Tagging API, see the Amazon Resource Group Tagging API Reference at https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html.

# __1.11.506__ __2019-02-25__
## __AWS Cost Explorer Service__
  - ### Features
    - Added metrics to normalized units.

## __AWS Elemental MediaStore__
  - ### Features
    - This release adds support for access logging, which provides detailed records for the requests that are made to objects in a container.

## __Auto Scaling__
  - ### Features
    - Added support for passing an empty SpotMaxPrice parameter to remove a value previously set when updating an Amazon EC2 Auto Scaling group.

## __Elastic Load Balancing__
  - ### Features
    - This release enables you to use the existing client secret when modifying a rule with an action of type authenticate-oidc.

# __1.11.505__ __2019-02-22__
## __AWS Cloud9__
  - ### Features
    - Adding EnvironmentLifecycle to the Environment data type.

## __AWS Glue__
  - ### Features
    - AWS Glue adds support for assigning AWS resource tags to jobs, triggers, development endpoints, and crawlers. Each tag consists of a key and an optional value, both of which you define. With this capacity, customers can use tags in AWS Glue to easily organize and identify your resources, create cost allocation reports, and control access to resources. 

## __AWS Step Functions__
  - ### Features
    - This release adds support for tag-on-create. You can now add tags when you create AWS Step Functions activity and state machine resources. For more information about tagging, see AWS Tagging Strategies.

## __Amazon Athena__
  - ### Features
    - This release adds tagging support for Workgroups to Amazon Athena. Use these APIs to add, remove, or list tags on Workgroups, and leverage the tags for various authorization and billing scenarios.

# __1.11.504__ __2019-02-21__
## __AWS CodeBuild__
  - ### Features
    - Add support for CodeBuild local caching feature

## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __AWS Transfer for SFTP__
  - ### Features
    - Bug fix: increased the max length allowed for request parameter NextToken when paginating List operations

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Kinesis Video Streams__
  - ### Features
    - Documentation updates for Kinesis Video Streams

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - In this release, HLS playback of KVS streams can be configured to output MPEG TS fragments using the ContainerFormat parameter. HLS playback of KVS streams can also be configured to include the EXT-X-PROGRAM-DATE-TIME field using the DisplayFragmentTimestamp parameter.

## __Amazon WorkDocs__
  - ### Features
    - Documentation updates for workdocs

# __1.11.503__ __2019-02-20__
## __AWS CodeCommit__
  - ### Features
    - This release adds an API for adding / updating / deleting / copying / moving / setting file modes for one or more files directly to an AWS CodeCommit repository without requiring a Git client.

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for VPC inputs, allowing you to push content from your Amazon VPC directly to MediaLive.

# __1.11.502__ __2019-02-19__
## __AWS Directory Service__
  - ### Features
    - This release adds support for tags during directory creation (CreateDirectory, CreateMicrosoftAd, ConnectDirectory).

## __AWS IoT__
  - ### Features
    - AWS IoT - AWS IoT Device Defender adds support for configuring behaviors in a security profile with statistical thresholds. Device Defender also adds support for configuring multiple data-point evaluations before a violation is either created or cleared.

## __Amazon Elastic File System__
  - ### Features
    - Amazon EFS now supports adding tags to file system resources as part of the CreateFileSystem API . Using this capability, customers can now more easily enforce tag-based authorization for EFS file system resources.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager now supports adding tags when creating Activations, Patch Baselines, Documents, Parameters, and Maintenance Windows

# __1.11.501__ __2019-02-18__
## __AWS Secrets Manager__
  - ### Features
    - This release increases the maximum allowed size of SecretString or SecretBinary from 4KB to 7KB in the CreateSecret, UpdateSecret, PutSecretValue and GetSecretValue APIs.

## __Amazon Athena__
  - ### Features
    - This release adds support for Workgroups to Amazon Athena. Use Workgroups to isolate users, teams, applications or workloads in the same account, control costs by setting up query limits and creating Amazon SNS alarms, and publish query-related metrics to Amazon CloudWatch. 

# __1.11.500__ __2019-02-15__
## __AWS IoT__
  - ### Features
    - In this release, IoT Device Defender introduces support for tagging Scheduled Audit resources.

## __Amazon Chime__
  - ### Features
    - Documentation updates for Amazon Chime

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __1.11.499__ __2019-02-14__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds tagging and ARN support for AWS Client VPN Endpoints.You can now run bare metal workloads on EC2 M5 and M5d instances. m5.metal and m5d.metal instances are powered by custom Intel Xeon Scalable Processors with a sustained all core frequency of up to 3.1 GHz. m5.metal and m5d.metal offer 96 vCPUs and 384 GiB of memory. With m5d.metal, you also have access to 3.6 TB of NVMe SSD-backed instance storage. m5.metal and m5d.metal instances deliver 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking, as well as 14 Gbps of bandwidth to EBS.You can now run bare metal workloads on EC2 z1d instances. z1d.metal instances are powered by custom Intel Xeon Scalable Processors with a sustained all core frequency of up to 4.0 GHz. z1d.metal offers 48 vCPUs, 384 GiB of memory, and 1.8 TB of NVMe SSD-backed instance storage. z1d.metal instances deliver 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking, as well as 14 Gbps of bandwidth to EBS.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Adds support for Tag-On-Create for Kinesis Video Streams. A list of tags associated with the stream can be created at the same time as the stream creation.

# __1.11.498__ __2019-02-13__
## __AWS MediaTailor__
  - ### Features
    - This release adds support for tagging AWS Elemental MediaTailor resources.

## __AWS SDK for Java__
  - ### Bugfixes
    - Adjust for clock skew, even if the service only reports 401/403 status code with no clock-skew specific error code. This can prevent a rare edge-case where the request clock can get stuck on a bad time during partial-service clock skew problems because the service is not reporting an explicit clock skew problem.

## __Amazon Elastic File System__
  - ### Features
    - Customers can now use the EFS Infrequent Access (IA) storage class to more cost-effectively store larger amounts of data in their file systems. EFS IA is cost-optimized storage for files that are not accessed every day. You can create a new file system and enable Lifecycle Management to automatically move files that have not been accessed for 30 days from the Standard storage class to the IA storage class.

## __Amazon Rekognition__
  - ### Features
    - GetContentModeration now returns the version of the moderation detection model used to detect unsafe content.

# __1.11.497__ __2019-02-12__
## __AWS Lambda__
  - ### Features
    - Documentation updates for AWS Lambda

# __1.11.496__ __2019-02-11__
## __AWS CodeBuild__
  - ### Features
    - Add customized webhook filter support

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds optional configuration for DASH to compact the manifest by combining duplicate SegmentTemplate tags. Adds optional configuration for DASH SegmentTemplate format to refer to segments by "Number" (default) or by "Time".

## __Amazon AppStream__
  - ### Features
    - This update enables customers to find the start time, max expiration time, and connection status associated with AppStream streaming session.

# __1.11.495__ __2019-02-08__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for the AWS Application Discovery Service.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - This release is to correct the timestamp format to ISO8601 for the DateCreated and DateModified files in the GetLifecyclePolicy response object.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS introduces the PutAccountSettingDefault API, an API that allows a user to set the default ARN/ID format opt-in status for all the roles and users in the account. Previously, setting the account's default opt-in status required the use of the root user with the PutAccountSetting API.

# __1.11.494__ __2019-02-07__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds tagging of channels, inputs, and input security groups.

## __AWS RoboMaker__
  - ### Features
    - Added support for tagging and tag-based access control for AWS RoboMaker resources. Also, DescribeSimulationJob now includes a new failureReason field to help debug simulation job failures

## __Amazon Elasticsearch Service__
  - ### Features
    - Feature: Support for three Availability Zone deployments

## __Amazon GameLift__
  - ### Features
    - This release delivers a new API action for deleting unused matchmaking rule sets. More details are available at https://aws.amazon.com/releasenotes/?tag=releasenotes%23keywords%23amazon-gamelift.

# __1.11.493__ __2019-02-06__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add Linux with SQL Server Standard, Linux with SQL Server Web, and Linux with SQL Server Enterprise to the list of allowed instance platforms for On-Demand Capacity Reservations.

## __Amazon FSx__
  - ### Features
    - New optional ExportPath parameter added to the CreateFileSystemLustreConfiguration object for user-defined export paths. Used with the CreateFileSystem action when creating an Amazon FSx for Lustre file system.

# __1.11.492__ __2019-02-05__
## __AWS Service Catalog__
  - ### Features
    - Service Catalog Documentation Update for ProvisionedProductDetail

## __AWS Shield__
  - ### Features
    - The DescribeProtection request now accepts resource ARN as valid parameter.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - ec2.DescribeVpcPeeringConnections pagination support

# __1.11.491__ __2019-02-04__
## __AWS CodeCommit__
  - ### Features
    - This release supports a more graceful handling of the error case when a repository is not associated with a pull request ID in a merge request in AWS CodeCommit.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for GPU workloads by enabling you to create clusters with GPU-enabled container instances.

## __Amazon WorkSpaces__
  - ### Features
    - This release sets ClientProperties as a required parameter.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

# __1.11.490__ __2019-01-25__
## __AWS CodeCommit__
  - ### Features
    - The PutFile API will now throw new exception FilePathConflictsWithSubmodulePathException when a submodule exists at the input file path; PutFile API will also throw FolderContentSizeLimitExceededException when the total size of any folder on the path exceeds the limit as a result of the operation.

## __AWS Device Farm__
  - ### Features
    - Introduces a new rule in Device Pools - "Availability". Customers can now ensure they pick devices that are available (i.e., not being used by other customers).

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for Frame Capture output groups and for I-frame only manifests (playlists) in HLS output groups.

## __AWS MediaConnect__
  - ### Features
    - This release adds support for tagging, untagging, and listing tags for existing AWS Elemental MediaConnect resources.

# __1.11.489__ __2019-01-24__
## __AWS CodeBuild__
  - ### Features
    - This release adds support for cross-account ECR images and private registry authentication. 

## __AWS SDK for Java__
  - ### Features
    - Added support for 'credential_process' profile attribute: https://docs.aws.amazon.com/cli/latest/topic/config-vars.html#sourcing-credentials-from-external-processes

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for CloudWatch Logs

## __Amazon EC2 Container Registry__
  - ### Features
    - Amazon ECR updated the default endpoint URL to support AWS Private Link.

## __Amazon Pinpoint SMS and Voice Service__
  - ### Features
    - Added the ListConfigurationSets operation, which returns a list of the configuration sets that are associated with your account.

## __Amazon Relational Database Service__
  - ### Features
    - The Amazon RDS API allows you to add or remove Identity and Access Management (IAM) role associated with a specific feature name with an RDS database instance. This helps with capabilities such as invoking Lambda functions from within a trigger in the database, load data from Amazon S3 and so on

## __Elastic Load Balancing__
  - ### Features
    - Elastic Load Balancing now supports TLS termination on Network Load Balancers. With this launch, you can offload the decryption/encryption of TLS traffic from your application servers to the Network Load Balancer. This enables you to run your backend servers optimally and keep your workloads secure. Additionally, Network Load Balancers preserve the source IP of the clients to the back-end applications, while terminating TLS on the load balancer.  When TLS is enabled on an NLB, Access Logs can be enabled for the load balancer, and log entries will be emitted for all TLS connections.

# __1.11.488__ __2019-01-23__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Added TagOnCreate parameter to the CreateCertificateAuthority operation, updated the Tag regex pattern to align with AWS tagging APIs, and added RevokeCertificate limit.

## __Amazon WorkLink__
  - ### Features
    - This is the initial SDK release for Amazon WorkLink. Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. With Amazon WorkLink, employees can access internal websites as seamlessly as they access any other website. IT administrators can manage users, devices, and domains by enforcing their own security and access policies via the AWS Console or the AWS SDK.

## __AmazonApiGatewayManagementApi__
  - ### Features
    - Fixes a typo in the 'max' constraint.

# __1.11.487__ __2019-01-21__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's import APIs allow you to import information about your on-premises servers and applications into ADS so that you can track the status of your migrations through the Migration Hub console.

## __AWS Database Migration Service__
  - ### Features
    - Update for DMS TestConnectionSucceeds waiter

## __Amazon AppStream__
  - ### Features
    - This API update includes support for tagging Stack, Fleet, and ImageBuilder resources at creation time.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager State Manager now supports configuration management of all AWS resources through integration with Automation. 

## __Firewall Management Service__
  - ### Features
    - This release provides support for cleaning up web ACLs during Firewall Management policy deletion. You can now enable the DeleteAllPolicyResources flag and it will delete all system-generated web ACLs.

# __1.11.486__ __2019-01-18__
## __AWS Glue__
  - ### Features
    - AllocatedCapacity field is being deprecated and replaced with MaxCapacity field

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adjust EC2's available instance types.

# __1.11.485__ __2019-01-17__
## __AWS Lambda__
  - ### Features
    - Documentation updates for AWS Lambda

## __Amazon Lightsail__
  - ### Features
    - This release adds functionality to the CreateDiskSnapshot API that allows users to snapshot instance root volumes. It also adds various documentation updates.

## __Amazon Pinpoint__
  - ### Features
    - This release updates the PutEvents operation. AppPackageName, AppTitle, AppVersionCode, SdkName fields will now be accepted as a part of the event when submitting events.

## __Amazon Rekognition__
  - ### Features
    - GetLabelDetection now returns bounding box information for common objects and a hierarchical taxonomy of detected labels. The version of the model used for video label detection is also returned. DetectModerationLabels now returns the version of the model used for detecting unsafe content.

# __1.11.484__ __2019-01-16__
## __AWS Backup__
  - ### Features
    - AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and auditing

## __AWS Cost Explorer Service__
  - ### Features
    - Removed Tags from the list of GroupBy dimensions available for GetReservationCoverage.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now integrates with AWS Backup, a centralized backup service that makes it easy for customers to configure and audit the AWS resources they want to backup, automate backup scheduling, set retention policies, and monitor all recent backup and restore activity. AWS Backup provides a fully managed, policy-based backup solution, simplifying your backup management, and helping you meet your business and regulatory backup compliance requirements. For more information, see the Amazon DynamoDB Developer Guide.

# __1.11.483__ __2019-01-14__
## __AWS Elemental MediaConvert__
  - ### Features
    - IMF decode from a Composition Playlist for IMF specializations App [#2](https://github.com/aws/aws-sdk-java/issues/2) and App [#2](https://github.com/aws/aws-sdk-java/issues/2)e; up to 99 input clippings; caption channel selection for MXF; and updated rate control for CBR jobs. Added support for acceleration in preview

## __AWS Storage Gateway__
  - ### Features
    - JoinDomain API supports two more  parameters: organizational unit(OU) and domain controllers.  Two new APIs are introduced: DetachVolume and AttachVolume.

# __1.11.482__ __2019-01-11__
## __AWS RDS DataService__
  - ### Features
    - Documentation updates for RDS Data API.

## __Amazon Elastic MapReduce__
  - ### Features
    - Documentation updates for Amazon EMR

# __1.11.481__ __2019-01-10__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __AWS IoT__
  - ### Features
    - This release adds tagging support for rules of AWS IoT Rules Engine. Tags enable you to categorize your rules in different ways, for example, by purpose, owner, or environment. For more information about tagging, see AWS Tagging Strategies (https://aws.amazon.com/answers/account-management/aws-tagging-strategies/). For technical documentation, look for the tagging operations in the AWS IoT Core API reference or User Guide (https://docs.aws.amazon.com/iot/latest/developerguide/tagging-iot.html).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Spot: a) CreateFleet support for Single AvailabilityZone requests and b) support for paginated DescribeSpotInstanceRequests.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Training Jobs now support Inter-Container traffic encryption.

# __1.11.480__ __2019-01-09__
## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Amazon DocumentDB (with MongoDB compatibility) is a fast, reliable, and fully-managed database service. Amazon DocumentDB makes it easy for developers to set up, run, and scale MongoDB-compatible databases in the cloud.

## __Amazon Redshift__
  - ### Features
    - DescribeSnapshotSchedules returns a list of snapshot schedules. With this release, this API will have a list of clusters and number of clusters associated with the schedule.

# __1.11.479__ __2019-01-07__
## __AWS App Mesh__
  - ### Features
    - AWS App Mesh now supports active health checks. You can specify TCP or HTTP health checks with custom thresholds and intervals on your VirtualNode definitions. See the AWS App Mesh HealthCheckPolicy documentation for more information.

# __1.11.478__ __2019-01-04__
## __AWS Device Farm__
  - ### Features
    - "This release provides support for running Appium Node.js and Appium Ruby tests on AWS Device Farm.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS tagging feature.

# __1.11.477__ __2019-01-03__
## __AWS IoT Analytics__
  - ### Features
    - ListDatasetContents now has a filter to limit results by date scheduled.

# __1.11.476__ __2019-01-02__
## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for opsworkscm

# __1.11.475__ __2018-12-21__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - This release marks the introduction of waiters in ACM PCA, which allow you to control the progression of your code based on the presence or state of certain resources. Waiters can be implemented in the DescribeCertificateAuthorityAuditReport, GetCertificate, and GetCertificateAuthorityCsr API operations.

## __AWS Step Functions__
  - ### Features
    - This release adds support for cost allocation tagging. You can now create, delete, and list tags for AWS Step Functions activity and state machine resources. For more information about tagging, see AWS Tagging Strategies.

## __Amazon DynamoDB__
  - ### Features
    - Added provisionedThroughPut exception on the request level for transaction APIs.

## __Amazon Pinpoint SMS and Voice Service__
  - ### Features
    - Configuration sets can now use Amazon SNS as an event destination.

# __1.11.474__ __2018-12-20__
## __AWS Elemental MediaLive__
  - ### Features
    - This release provides support for ID3 tags and video quality setting for subgop_length.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now has API support for updating the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool.

## __Amazon Comprehend__
  - ### Features
    - This SDK release adds functionality to stop training Custom Document Classifier or Custom Entity Recognizer in Amazon Comprehend.

## __Amazon Kinesis Firehose__
  - ### Features
    - Support for specifying customized s3 keys and supplying a separate prefix for failed-records

## __Amazon Transcribe Service__
  - ### Features
    - With this release, Amazon Transcribe now supports transcriptions from audio sources in Italian (it-IT).

# __1.11.473__ __2018-12-19__
## __AWS WAF__
  - ### Features
    - This release adds rule-level control for rule group. If a rule group contains a rule that blocks legitimate traffic, previously you had to override the entire rule group to COUNT in order to allow the traffic. You can now use the UpdateWebACL API to exclude specific rules within a rule group. Excluding rules changes the action for the individual rules to COUNT. Excluded rules will be recorded in the new "excludedRules" attribute of the WAF logs.

## __AWS WAF Regional__
  - ### Features
    - This release adds rule-level control for rule group. If a rule group contains a rule that blocks legitimate traffic, previously you had to override the entire rule group to COUNT in order to allow the traffic. You can now use the UpdateWebACL API to exclude specific rules within a rule group. Excluding rules changes the action for the individual rules to COUNT. Excluded rules will be recorded in the new "excludedRules" attribute of the WAF logs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for specifying partition as a strategy for EC2 Placement Groups. This new strategy allows one to launch instances into partitions that do not share certain underlying hardware between partitions, to assist with building and deploying highly available replicated applications. 

## __Amazon SageMaker Service__
  - ### Features
    - Batch Transform Jobs now supports TFRecord as a Split Type. ListCompilationJobs API action now supports SortOrder and SortBy inputs.

# __1.11.472__ __2018-12-18__
## __AWS Elastic Beanstalk__
  - ### Features
    - This release adds a new resource that Elastic Beanstalk will soon support, EC2 launch template, to environment resource descriptions.

## __AWS Global Accelerator__
  - ### Features
    - Documentation updates for Ubiquity

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Client VPN, is a client-based VPN service. With Client VPN, you can securely access resources in AWS as well as access resources in on-premises from any location using OpenVPN based devices. With Client VPN, you can set network based firewall rules that can restrict access to networks based on Active Directory groups.

## __Amazon S3__
  - ### Features
    - Optimize S3 TransferManager parallel download performance by making parts writing to the destination file directly in parallel.

## __AmazonApiGatewayManagementApi__
  - ### Features
    - This is the initial SDK release for the Amazon API Gateway Management API, which allows you to directly manage runtime aspects of your APIs. This release makes it easy to send data directly to clients connected to your WebSocket-based APIs.

## __AmazonApiGatewayV2__
  - ### Features
    - This is the initial SDK release for the Amazon API Gateway v2 APIs. This SDK will allow you to manage and configure APIs in Amazon API Gateway; this first release provides the capabilities that allow you to programmatically setup and manage WebSocket APIs end to end. 

# __1.11.471__ __2018-12-17__
## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for ECR repository tagging.

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight's RegisterUser API now generates a user invitation URL when registering a user with the QuickSight identity type. This URL can then be used by the registered QuickSight user to complete the user registration process. This release also corrects some HTTP return status codes.

# __1.11.470__ __2018-12-14__
## __AWS CloudFormation__
  - ### Features
    - Documentation updates for cloudformation

## __Alexa For Business__
  - ### Features
    - Released new APIs for managing private skill access to Enrolled Users.  These API's are the equivalent of the A4B console for Private Skills checkbox "Available for Users".

## __Amazon Redshift__
  - ### Features
    - Documentation updates for Amazon Redshift

# __1.11.469__ __2018-12-13__
## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release adds new operations for the Amazon Pinpoint Deliverability Dashboard. You can use the Deliverability Dashboard to view response and inbox placement metrics for the domains that you use to send email. You can also perform tests on individual email messages to determine how often your messages are delivered to the inbox on several major email providers.

# __1.11.468__ __2018-12-12__
## __AWS Glue__
  - ### Features
    - API Update for Glue: this update enables encryption of password inside connection objects stored in AWS Glue Data Catalog using DataCatalogEncryptionSettings.  In addition, a new "HidePassword" flag is added to GetConnection and GetConnections to return connections without passwords.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Added support for updating kubernetes version of Amazon EKS clusters.

## __Amazon Route 53__
  - ### Features
    - You can now specify a new region, eu-north-1 (in Stockholm, Sweden), as a region for latency-based or geoproximity routing.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports early stopping of training jobs. With early stopping, training jobs that are unlikely to generate good models will be automatically stopped during a Hyperparameter Tuning Job.

# __1.11.467__ __2018-12-11__
## __AWS Elemental MediaStore__
  - ### Features
    - This release adds Delete Object Lifecycling to AWS MediaStore Containers.

## __Amazon Connect Service__
  - ### Features
    - This update adds the GetContactAttributes operation to retrieve the attributes associated with a contact.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS.

# __1.11.466__ __2018-12-07__
## __AWS Identity and Access Management__
  - ### Features
    - We are making it easier for you to manage your AWS Identity and Access Management (IAM) policy permissions by enabling you to retrieve the last timestamp when an IAM entity (e.g., user, role, or a group) accessed an AWS service. This feature also allows you to audit service access for your entities.

## __AWS Service Catalog__
  - ### Features
    - Documentation updates for servicecatalog.

## __Alexa For Business__
  - ### Features
    - Alexa for Business now allows IT administrators to create ad-hoc or scheduled usage reports, which help customers understand how Alexa is used in their workplace. To learn how to create usage reports, see https://docs.aws.amazon.com/a4b/latest/ag/creating-reports.html

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the larger-sized P3dn.24xlarge instance that features NVIDIA Tesla V100s with double the GPU memory, 100Gbps networking and local NVMe storage.

# __1.11.465__ __2018-12-06__
## __AWS CodeBuild__
  - ### Features
    - Support personal access tokens for GitHub source and app passwords for Bitbucket source

## __AWS Elemental MediaLive__
  - ### Features
    - This release enables the AWS Elemental MediaConnect input type in AWS Elemental MediaLive. This can then be used to automatically create and manage AWS Elemental MediaConnect Flow Outputs when you create a channel using those inputs.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for Amazon RDS

## __Elastic Load Balancing__
  - ### Features
    - This release allows Application Load Balancers to route traffic to Lambda functions, in addition to instances and IP addresses.

# __1.11.464__ __2018-12-05__
## __AWS Cost Explorer Service__
  - ### Features
    - Add normalized unit support for both GetReservationUtilization and GetReservationCoverage API.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now includes a new parameter to control the Location tag of DASH manifests.

## __AmazonMQ__
  - ### Features
    - This release adds support for cost allocation tagging. You can now create, delete, and list tags for AmazonMQ resources. For more information about tagging, see AWS Tagging Strategies.

# __1.11.463__ __2018-12-04__
## __AWS Health APIs and Notifications__
  - ### Features
    - AWS Health API DescribeAffectedEntities operation now includes a field that returns the URL of the affected entity.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Inventory reports can now be generated in Parquet format by setting the Destination Format to be 'Parquet'.

# __1.11.462__ __2018-12-03__
## __AWS Device Farm__
  - ### Features
    - Customers can now schedule runs without a need to create a Device Pool. They also get realtime information on public device availability.

## __AWS Elemental MediaConvert__
  - ### Features
    - Documentation updates for mediaconvert

## __AWS Service Catalog__
  - ### Features
    - Documentation updates for servicecatalog

## __AWS Storage Gateway__
  - ### Features
    - API list-local-disks returns a list of the gateway's local disks. This release adds a field DiskAttributeList to these disks.

# __1.11.461__ __2018-11-29__
## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Lambda Layers and Ruby as a runtime. Lambda Layers are a new type of artifact that contains arbitrary code and data, and may be referenced by zero, one, or more functions at the same time.  You can also now develop your AWS Lambda function code using the Ruby programming language.

## __AWS Step Functions__
  - ### Features
    - AWS Step Functions is now integrated with eight additional AWS services: Amazon ECS, AWS Fargate, Amazon DynamoDB, Amazon SNS, Amazon SQS, AWS Batch, AWS Glue, and Amazon SageMaker. To learn more, please see https://docs.aws.amazon.com/step-functions/index.html

## __AWS X-Ray__
  - ### Features
    - GetTraceSummaries - Now provides additional information regarding your application traces such as Availability Zone, Instance ID, Resource ARN details, Revision, Entry Point, Root Cause Exceptions and Root Causes for Fault, Error and Response Time.

## __AWSServerlessApplicationRepository__
  - ### Features
    - AWS Serverless Application Repository now supports nested applications. You can nest individual applications as components of a larger application to make it easy to assemble and deploy new serverless architectures. 

## __Amazon CloudWatch Events__
  - ### Features
    - Support for Managed Rules (rules that are created and maintained by the AWS services in your account) is added.

## __Amazon Simple Storage Service__
  - ### Features
    - Fixed issue with ObjectLockRetainUntilDate in S3 PutObject

## __Elastic Load Balancing__
  - ### Features
    - This release allows Application Load Balancers to route traffic to Lambda functions, in addition to instances and IP addresses.

## __Managed Streaming for Kafka__
  - ### Features
    - This is the initial SDK release for Amazon Managed Streaming for Kafka (Amazon MSK). Amazon MSK is a service that you can use to easily build, monitor, and manage Apache Kafka clusters in the cloud.

# __1.11.460__ __2018-11-28__
## __AWS App Mesh__
  - ### Features
    - AWS App Mesh is a service mesh that makes it easy to monitor and control communications between microservices of an application. AWS App Mesh APIs are available for preview in eu-west-1, us-east-1, us-east-2, and us-west-2 regions.

## __AWS Cloud Map__
  - ### Features
    - AWS Cloud Map lets you define friendly names for your cloud resources so that your applications can quickly and dynamically discover them. When a resource becomes available (for example, an Amazon EC2 instance running a web server), you can register a Cloud Map service instance. Then your application can discover service instances by submitting DNS queries or API calls.

## __AWS License Manager__
  - ### Features
    - AWS License Manager makes it easier to manage licenses in AWS and on premises when customers run applications using existing licenses from a variety of software vendors including Microsoft, SAP, Oracle, and IBM. AWS License Manager automatically tracks and controls license usage once administrators have created and enforced rules that emulate the terms of their licensing agreements. The capabilities of AWS License Manager are available through SDK and Tools, besides the management console and CLI.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds the following updates: 1. You can now hibernate and resume Amazon-EBS backed instances using the StopInstances and StartInstances APIs. For more information about using this feature and supported instance types and operating systems, visit the user guide. 2. Amazon Elastic Inference accelerators are resources that you can attach to current generation EC2 instances to accelerate your deep learning inference workloads. With Amazon Elastic Inference, you can configure the right amount of inference acceleration to your deep learning application without being constrained by fixed hardware configurations and limited GPU selection. 3. AWS License Manager makes it easier to manage licenses in AWS and on premises when customers run applications using existing licenses from a variety of software vendors including Microsoft, SAP, Oracle, and IBM.

## __Amazon Lightsail__
  - ### Features
    - This update adds the following features: 1. Copy instance and disk snapshots within the same AWS Region or from one region to another in Amazon Lightsail. 2. Export Lightsail instance and disk snapshots to Amazon Elastic Compute Cloud (Amazon EC2). 3. Create an Amazon EC2 instance from an exported Lightsail instance snapshot using AWS CloudFormation stacks. 4. Apply tags to filter your Lightsail resources, or organize your costs, or control access.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now has Algorithm and Model Package entities that can be used to create Training Jobs, Hyperparameter Tuning Jobs and hosted Models. Subscribed Marketplace products can be used on SageMaker to create Training Jobs, Hyperparameter Tuning Jobs and Models. Notebook Instances and Endpoints can leverage Elastic Inference accelerator types for on-demand GPU computing. Model optimizations can be performed with Compilation Jobs. Labeling Jobs can be created and supported by a Workforce. Models can now contain up to 5 containers allowing for inference pipelines within Endpoints. Code Repositories (such as Git) can be linked with SageMaker and loaded into Notebook Instances. Network isolation is now possible on Models, Training Jobs, and Hyperparameter Tuning Jobs, which restricts inbound/outbound network calls for the container. However, containers can talk to their peers in distributed training mode within the same security group. A Public Beta Search API was added that currently supports Training Jobs.

# __1.11.459__ __2018-11-28__
## __AWS SecurityHub__
  - ### Features
    - AWS Security Hub is a security and compliance center that correlates AWS security findings and performs automated compliance checks

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now supports the following features: DynamoDB on-demand and transactions. DynamoDB on-demand is a flexible new billing option for DynamoDB capable of serving thousands of requests per second without capacity planning. DynamoDB on-demand offers simple pay-per-request pricing for read and write requests so that you only pay for what you use, making it easy to balance costs and performance. Transactions simplify the developer experience of making coordinated, all-or-nothing changes to multiple items both within and across tables. The new transactional APIs provide atomicity, consistency, isolation, and durability (ACID) in DynamoDB, helping developers support sophisticated workflows and business logic that requires adding, updating, or deleting multiple items using native, server-side transactions. For more information, see the Amazon DynamoDB Developer Guide.

## __Amazon FSx__
  - ### Features
    - Amazon FSx provides fully-managed third-party file systems optimized for a variety of enterprise and compute-intensive workloads.

## __Amazon Relational Database Service__
  - ### Features
    - Amazon Aurora Global Database. This release introduces support for Global Database, a feature that allows a single Amazon Aurora database to span multiple AWS regions. Customers can use the feature to replicate data with no impact on database performance, enable fast local reads with low latency in each region, and improve disaster recovery from region-wide outages. You can create, modify and describe an Aurora Global Database, as well as add or remove regions from your Global Database.

# __1.11.458__ __2018-11-27__
## __AWS CodeDeploy__
  - ### Features
    - Support for Amazon ECS service deployment - AWS CodeDeploy now supports the deployment of Amazon ECS services. An Amazon ECS deployment uses an Elastic Load Balancer, two Amazon ECS target groups, and a listener to reroute production traffic from your Amazon ECS service's original task set to a new replacement task set. The original task set is terminated when the deployment is complete. Success of a deployment can be validated using Lambda functions that are referenced by the deployment. This provides the opportunity to rollback if necessary. You can use the new ECSService, ECSTarget, and ECSTaskSet data types in the updated SDK to create or retrieve an Amazon ECS deployment.

## __AWS Comprehend Medical__
  - ### Features
    - The first release of Comprehend Medical includes two APIs, detectPHI and detectEntities. DetectPHI extracts PHI from your clinical text, and detectEntities extracts entities such as medication, medical conditions, or anatomy. DetectEntities also extracts attributes (e.g. dosage for medication) and identifies contextual traits (e.g. negation) for each entity.

## __AWS MediaConnect__
  - ### Features
    - This is the initial release for AWS Elemental MediaConnect, an ingest and transport service for live video. This new AWS service allows broadcasters and content owners to send high-value live content into the cloud, securely transmit it to partners for distribution, and replicate it to multiple destinations around the globe.

## __AWSMarketplace Metering__
  - ### Features
    - RegisterUsage operation added to AWS Marketplace Metering Service, allowing sellers to meter and entitle Docker container software use with AWS Marketplace. For details on integrating Docker containers with RegisterUsage see: https://docs.aws.amazon.com/marketplace/latest/userguide/entitlement-and-metering-for-paid-products.html

## __Amazon CloudWatch Logs__
  - ### Features
    - Six new APIs added to support CloudWatch Logs Insights. The APIs are StartQuery, StopQuery, GetQueryResults, GetLogRecord, GetLogGroupFields, and DescribeQueries.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for blue/green deployment feature. Customers can now update their ECS services in a blue/green deployment pattern via using AWS CodeDeploy.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - With VPC sharing, you can now allow multiple accounts in the same AWS Organization to launch their application resources, like EC2 instances, RDS databases, and Redshift clusters into shared, centrally managed VPCs.

## __Amazon Kinesis Analytics__
  - ### Features
    - Improvements to error messages, validations, and more to the Kinesis Data Analytics APIs.

## __Amazon S3__
  - ### Features
    - Add support for multipart upload and copy in `TransferManager` if Object Lock parameters are included in the request when uploading or copying objects.

## __Amazon Translate__
  - ### Features
    - This release includes the new custom terminology feature. Using custom terminology with your translation requests enables you to make sure that your brand names, character names, model names, and other unique content is translated exactly the way you need it, regardless of its context and the Amazon Translate algorithm's decision. See the documentation for more information.

# __1.11.457__ __2018-11-27__
## __AWS Global Accelerator__
  - ### Features
    - AWS Global Accelerator is a network layer service that helps you improve the availability and performance of the applications that you offer to your global customers. Global Accelerator uses the AWS global network to direct internet traffic from your users to your applications running in AWS Regions. Global Accelerator creates a fixed entry point for your applications through static anycast IP addresses, and routes user traffic to the optimal endpoint based on performance, application health and routing policies that you can configure. Global Accelerator supports the following features at launch: static anycast IP addresses, support for TCP and UDP, support for Network Load Balancers, Application Load Balancers and Elastic-IP address endpoints,  continuous health checking, instant regional failover, fault isolating Network Zones, granular traffic controls, and client affinity.

## __AWS Greengrass__
  - ### Features
    - Support Greengrass Connectors and allow Lambda functions to run without Greengrass containers.

## __AWS IoT__
  - ### Features
    - As part of this release, we are extending capability of AWS IoT Rules Engine to support IoT Events rule action. The IoT Events rule action lets you send messages from IoT sensors and applications to IoT Events for pattern recognition and event detection.

## __AWS IoT Analytics__
  - ### Features
    - Added an optional list of dataset content delivery configuration for CreateDataset and UpdateDataset. DescribeDataset will now include the list of delivery configuration, and will be an empty array if none exist.

## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (KMS) now enables customers to create and manage dedicated, single-tenant key stores in addition to the default KMS key store. These are known as custom key stores and are deployed using AWS CloudHSM clusters. Keys that are created in a KMS custom key store can be used like any other customer master key in KMS.

## __AWS Server Migration Service__
  - ### Features
    - In this release, AWS Server Migration Service (SMS) has added multi-server migration support to simplify the application migration process. Customers can migrate all their application-specific servers together as a single unit as opposed to moving individual server one at a time. The new functionality includes - 1. Ability to group on-premises servers into applications and application tiers. 2. Auto-generated CloudFormation Template and Stacks for launching migrated servers into EC2. 3. Ability to run post-launch configuration scripts to configure servers and applications in EC2. In order for SMS to launch servers into your AWS account using CloudFormation Templates, we have also updated the ServerMigrationServiceRole IAM policy to include appropriate permissions. Refer to Server Migration Service documentation for more details. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds the following updates: 1. Transit Gateway helps easily scale connectivity across thousands of Amazon VPCs, AWS accounts, and on-premises networks. 2. Amazon EC2 A1 instance is a new Arm architecture based general purpose instance. 3. You can now launch the new Amazon EC2 compute optimized C5n instances that can utilize up to 100 Gbps of network bandwidth.

## __Amazon Simple Storage Service__
  - ### Features
    - Four new Amazon S3 Glacier features help you reduce your storage costs by making it even easier to build archival applications using the Amazon S3 Glacier storage class. S3 Object Lock enables customers to apply Write Once Read Many (WORM) protection to objects in S3 in order to prevent object deletion for a customer-defined retention period. S3 Inventory now supports fields for reporting on S3 Object Lock. "ObjectLockRetainUntilDate", "ObjectLockMode", and "ObjectLockLegalHoldStatus" are now available as valid optional fields.

# __1.11.456__ __2018-11-26__
## __AWS Amplify__
  - ### Features
    - Release of AWS Amplify: Everything you need to develop & deploy cloud-powered mobile and web apps.

## __AWS DataSync__
  - ### Features
    - AWS DataSync simplifies, automates, and accelerates moving and replicating data between on-premises storage and AWS services over the network.

## __AWS RoboMaker__
  - ### Features
    - (New Service) AWS RoboMaker is a service that makes it easy to develop, simulate, and deploy intelligent robotics applications at scale. 

## __AWS Transfer for SFTP__
  - ### Features
    - AWS Transfer for SFTP is a fully managed service that enables transfer of secure data over the internet into and out of Amazon S3. SFTP is deeply embedded in data exchange workflows across different industries such as financial services, healthcare, advertising, and retail, among others.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS announces the availability of AWS Snowball Edge Compute Optimized to run compute-intensive applications is disconnected and physically harsh environments. It comes with 52 vCPUs, 208GB memory, 8TB NVMe SSD, and 42TB S3-compatible storage to accelerate local processing and is well suited for use cases such as full motion video processing, deep IoT analytics, and continuous machine learning in bandwidth-constrained locations. It features new instances types called SBE-C instances that are available in eight sizes and multiple instances can be run on the device at the same time. Optionally, developers can choose the compute optimized device to include a GPU and use SBE-G instances for accelerating their application performance. 

## __Amazon Simple Storage Service__
  - ### Features
    - The INTELLIGENT_TIERING storage class is designed to optimize storage costs by automatically moving data to the most cost effective storage access tier, without performance impact or operational overhead. This SDK release provides API support for this new storage class.

# __1.11.455__ __2018-11-21__
## __Amazon Rekognition__
  - ### Features
    - This release updates the DetectFaces and IndexFaces operation. When the Attributes input parameter is set to ALL, the face location landmarks includes 5 new landmarks: upperJawlineLeft, midJawlineLeft, chinBottom, midJawlineRight, upperJawlineRight.

# __1.11.454__ __2018-11-20__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports: 1. Pipeline Resolvers - Enables execution of one or more operations against multiple data sources in order, on a single GraphQL field. This allows orchestration of actions by composing code into a single Resolver, or share code across Resolvers.  2. Aurora Serverless Data Source - Built-in resolver for executing GraphQL operations with the new Aurora Serverless Data API, including connection management functionality.

## __AWS Auto Scaling Plans__
  - ### Features
    - In this release, AWS Auto Scaling adds three features: 1) Predictive scaling for EC2 Auto Scaling, which analyzes your application workload history to forecast future capacity requirements, 2) an option to replace existing scaling policies that are associated with the resources in your scaling plan, and 3) an option that allows you to use predictive scaling with or without your plan's dynamic scaling feature.

## __AWS Device Farm__
  - ### Features
    - Disabling device filters

## __AWS Elemental MediaLive__
  - ### Features
    - You can now include the media playlist(s) from both pipelines in the HLS master manifest for seamless failover.

## __AWS RDS DataService__
  - ### Features
    - The RDS Data API Beta is available for the MySQL-compatible edition of Amazon Aurora Serverless in the US East (N. Virginia) Region. This API enables you to easily access Aurora Serverless with web services-based applications including AWS Lambda and AWS AppSync.

## __AWS X-Ray__
  - ### Features
    - Groups build upon X-Ray filter expressions to allow for fine tuning trace summaries and service graph results. You can configure groups by using the AWS X-Ray console or by using the CreateGroup API. The addition of groups has extended the available request fields to the GetServiceGraph API. You can now specify a group name or group ARN to retrieve its service graph.

## __Amazon CloudFront__
  - ### Features
    - With Origin Failover capability in CloudFront, you can setup two origins for your distributions - primary and secondary, such that your content is served from your secondary origin if CloudFront detects that your primary origin is unavailable. These origins can be any combination of AWS origins or non-AWS custom HTTP origins. For example, you can have two Amazon S3 buckets that serve as your origin that you independently upload your content to. If an object that CloudFront requests from your primary bucket is not present or if connection to your primary bucket times-out, CloudFront will request the object from your secondary bucket. So, you can configure CloudFront to trigger a failover in response to either HTTP 4xx or 5xx status codes.

## __Amazon CloudWatch__
  - ### Features
    - Amazon CloudWatch now supports alarms on metric math expressions.

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight is a fully managed, serverless, cloud business intelligence system that allows you to extend data and insights to every user in your organization. The first release of APIs for Amazon QuickSight introduces embedding and user/group management capabilities. The get-dashboard-embed-url API allows you to obtain an authenticated dashboard URL that can be embedded in application domains whitelisted for QuickSight dashboard embedding. User APIs allow you to programmatically expand and manage your QuickSight deployments while group APIs allow easier permissions management for resources within QuickSight.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Distributor helps you securely distribute and install software packages.

# __1.11.453__ __2018-11-19__
## __AWS Batch__
  - ### Features
    - Adding multinode parallel jobs, placement group support for compute environments.

## __AWS CloudFormation__
  - ### Features
    - Use the CAPABILITY_AUTO_EXPAND capability to create or update a stack directly from a stack template that contains macros, without first reviewing the resulting changes in a change set first.

## __AWS CloudTrail__
  - ### Features
    - This release supports creating a trail in CloudTrail that logs events for all AWS accounts in an organization in AWS Organizations. This helps enable you to define a uniform event logging strategy for your organization. An organization trail is applied automatically to each account in the organization and cannot be modified by member accounts. To learn more, please see the AWS CloudTrail User Guide https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html

## __AWS Config__
  - ### Features
    - In this release, AWS Config adds support for aggregating the configuration data of AWS resources into multi-account and multi-region aggregators. AWS Config adds four APIs to query and retrieve aggregated resource configurations. 1) BatchGetAggregateResourceConfig, returns the current configuration items for resources that are present in your AWS Config aggregator. 2) GetAggregateDiscoveredResourceCounts, returns the resource counts across accounts and regions that are present in your AWS Config aggregator. 3) GetAggregateResourceConfig, returns current configuration item that is aggregated for your specific resource in a specific source account and region. 4) ListAggregateDiscoveredResources, accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions.

## __AWS Device Farm__
  - ### Features
    - Customers can now schedule runs without a need to create a Device Pool. They also get realtime information on public device availability.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added several features including support for: SPEKE full document encryption, up to 150 elements for input stitching, input and motion image insertion, AWS CLI path arguments in S3 links including special characters, AFD signaling, additional caption types, and client-side encrypted input files.

## __AWS IoT__
  - ### Features
    - IoT now supports resource tagging and tag based access control for Billing Groups, Thing Groups, Thing Types, Jobs, and Security Profiles. IoT Billing Groups help you group devices to categorize and track your costs. AWS IoT Device Management also introduces three new features: 1. Dynamic thing groups. 2. Jobs dynamic rollouts. 3. Device connectivity indexing. Dynamic thing groups lets you to create a group of devices using a Fleet Indexing query. The devices in your group will be automatically added or removed when they match your specified query criteria. Jobs dynamic rollout allows you to configure an exponentially increasing rate of deployment for device updates and define failure criteria to cancel your job. Device connectivity indexing allows you to index your devices' lifecycle events to discover whether devices are connected or disconnected to AWS IoT.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports python3.7 and  the Kinesis Data Streams (KDS) enhanced fan-out and HTTP/2 data retrieval features for Kinesis event sources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding AvailabilityZoneId to DescribeAvailabilityZones

## __Amazon Lightsail__
  - ### Features
    - Add Managed Database operations to OperationType enum.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds a new parameter to specify VPC security groups for restore from DB snapshot, restore to point int time and create read replica operations. For more information, see Amazon RDS Documentation.

## __Amazon WorkDocs__
  - ### Features
    - With this release, clients can now use the GetResources API to fetch files and folders from the user's SharedWithMe collection. And also through this release, the existing DescribeActivities API has been enhanced to support additional filters such as the ActivityType and the ResourceId.

## __Amazon WorkSpaces__
  - ### Features
    - Added new APIs to Modify and Describe WorkSpaces client properties for users in a directory. With the new APIs, you can enable/disable remember me option in WorkSpaces client for users in a directory.

# __1.11.452__ __2018-11-16__
## __AWS Cost Explorer Service__
  - ### Features
    - This release introduces a new operation called GetCostForecast operation, which allows you to programmatically access AWS Cost Explorer's forecasting engine and is now generally available.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend Custom Entities automatically trains entity recognition models using your entities and noun-based phrases. 

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for additional Docker flags as Task Definition parameters. Customers can now configure their ECS Tasks to use pidMode (pid) and ipcMode (ipc) Docker flags.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Automation now allows you to execute and manage Automation workflows across multiple accounts and regions. 

## __Amazon WorkSpaces__
  - ### Features
    - Added new Bring Your Own License (BYOL) automation APIs. With the new APIs, you can list available management CIDR ranges for dedicated tenancy, enable your account for BYOL, describe BYOL status of your account, and import BYOL images. Added new APIs to also describe and delete WorkSpaces images. 

# __1.11.451__ __2018-11-15__
## __AWS CodeBuild__
  - ### Features
    - Adding queue phase and configurable queue timeout to CodeBuild.

## __AWS Database Migration Service__
  - ### Features
    - Settings structures have been added to our DMS endpoint APIs to support Kinesis and Elasticsearch as targets. We are introducing the ability to configure custom DNS name servers on a replication instance as a beta feature. 

## __AWS Direct Connect__
  - ### Features
    - This release enables DirectConnect customers to have logical redundancy on virtual interfaces within supported DirectConnect locations.

## __AWS Identity and Access Management__
  - ### Features
    - We are making it easier for you to manage your AWS Identity and Access Management (IAM) resources by enabling you to add tags to your IAM principals (users and roles). Adding tags on IAM principals will enable you to write fewer policies for permissions management and make policies easier to comprehend.  Additionally, tags will also make it easier for you to grant access to AWS resources.

## __AWS Resource Access Manager__
  - ### Features
    - This is the initial release of AWS Resource Access Manager (RAM) which provides you the ability to share your resources across AWS accounts or within your AWS Organization. You can now create resources centrally and use AWS RAM to share those resources with other accounts, eliminating the need to provision and manage resources in every account. When you share a resource with another account, that account is granted access. Any policies and permissions in that account apply to the shared resource. 

## __AWS S3 Control__
  - ### Features
    - Add support for new S3 Block Public Access account-level APIs. The Block Public Access settings allow account owners to prevent public access to S3 data via bucket/object ACLs or bucket policies.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend Custom Classification automatically trains classification models using your text and custom labels.

## __Amazon EC2 Container Service__
  - ### Features
    - In this release, Amazon ECS introduces multiple features. First, ECS now supports integration with Systems Manager Parameter Store for injecting runtime secrets. Second, ECS introduces support for resources tagging. Finally, ECS introduces a new ARN and ID Format for its resources, and provides new APIs for opt-in to the new formats. 

## __Amazon Pinpoint__
  - ### Features
    - 1. With Amazon Pinpoint Voice, you can use text-to-speech technology to deliver personalized voice messages to your customers. Amazon Pinpoint Voice is a great way to deliver transactional messages -- such as one-time passwords and identity confirmations -- to customers. 2. Adding support for Campaign Event Triggers. With Campaign Event Triggers you can now schedule campaigns to execute based on incoming event data and target just the source of the event.

## __Amazon Pinpoint SMS and Voice Service__
  - ### Features
    - With Amazon Pinpoint Voice, you can use text-to-speech technology to deliver personalized voice messages to your customers. Amazon Pinpoint Voice is a way to deliver transactional messages -- such as one-time passwords and appointment confirmations to customers.

## __Amazon Redshift__
  - ### Features
    - With this release, Redshift is providing API's for better snapshot management by supporting user defined automated snapshot schedules, retention periods for manual snapshots, and aggregate snapshot actions including batch deleting user snapshots, viewing account level snapshot storage metrics, and better filtering and sorting on the describe-cluster-snapshots API. Automated snapshots can be scheduled to be taken at a custom interval and the schedule created can be reused across clusters. Manual snapshot retention periods can be set at the cluster, snapshot, and cross-region-copy level. The retention period set on a manual snapshot indicates how many days the snapshot will be retained before being automatically deleted.

## __Amazon Relational Database Service__
  - ### Features
    - Introduces DB Instance Automated Backups for the MySQL, MariaDB, PostgreSQL, Oracle and Microsoft SQL Server database engines. You can now retain Amazon RDS automated backups (system snapshots and transaction logs) when you delete a database instance. This allows you to restore a deleted database instance to a specified point in time within the backup retention period even after it has been deleted, protecting you against accidental deletion of data. For more information, see Amazon RDS Documentation.

## __Amazon Route 53 Resolver__
  - ### Features
    - This is the first release of the Amazon Route 53 Resolver API.  Customers now have the ability to create and manage Amazon Route 53 Resolver endpoints and Amazon Route 53 Resolver rules. 

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for new S3 Block Public Access bucket-level APIs. The new Block Public Access settings allow bucket owners to prevent public access to S3 data via bucket/object ACLs or bucket policies.

## __Amazon Transcribe Service__
  - ### Features
    - With this release, Amazon Transcribe now publicly supports transcriptions from audio sources in British English (en-GB), Australian English (en-AU), and Canadian French (fr-CA). Amazon Transcribe now also supports the following languages in Private beta: Germany German (de-DE), Brazil Portuguese (pt-BR), France French (fr-FR).

# __1.11.450__ __2018-11-14__
## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now returns a manifest endpoint prefix for clients to initiate a DASH playback session.

## __AWS Resource Groups__
  - ### Features
    - The AWS Resource Groups service added support for AWS CloudFormation stack-based groups.

## __AWS Service Catalog__
  - ### Features
    - Adds support for Cloudformation StackSets in Service Catalog

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 Fleet now supports a new request type "Instant" that you can use to provision capacity synchronously across instance types & purchase models and CreateFleet will return the instances launched in the API response.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker now makes the final set of metrics published from training jobs available in the DescribeTrainingJob results.  Automatic Model Tuning now supports warm start of hyperparameter tuning jobs.  Notebook instances now support a larger number of instance types to include instances from the ml.t3, ml.m5, ml.c4, ml.c5 families.

## __Amazon Simple Notification Service__
  - ### Features
    - Added an optional request parameter, named Attributes, to the Amazon SNS CreateTopic API action. For more information, see the Amazon SNS API Reference (https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html).

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling now allows users to provision and automatically scale instances across purchase options (Spot, On-Demand, and RIs) and instance types in a single Auto Scaling group (ASG).

# __1.11.449__ __2018-11-13__
## __AWS Budgets__
  - ### Features
    - Doc Update: 1. Available monthly-budgets maximal history data points from 12 to 13.  2. Added 'Amazon Elasticsearch' costfilters support.

## __Amazon Chime__
  - ### Features
    - This release adds support in ListUsers API to filter the list by an email address.

## __Amazon Redshift__
  - ### Features
    - Amazon Redshift provides the option to defer non-mandatory maintenance updates to a later date.

# __1.11.448__ __2018-11-12__
## __AWS Batch__
  - ### Features
    - Adding EC2 Launch Template support in AWS Batch Compute Environments.

## __AWS Budgets__
  - ### Features
    - 1. Added budget performance history, enabling you to see how well your budgets matched your actual costs and usage.                                                                                             2. Added budget performance history, notification state, and last updated time, enabling you to see how well your budgets matched your actual costs and usage, how often your budget alerts triggered, and when your budget was last updated.

## __AWS CloudFormation__
  - ### Features
    - The Drift Detection feature enables customers to detect whether a stack's actual configuration differs, or has drifted, from its expected configuration as defined within AWS CloudFormation.

## __AWS CodePipeline__
  - ### Features
    - Add support for cross-region pipeline with accompanying definitions as needed in the AWS CodePipeline API Guide.

## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, Amazon Kinesis Data Firehose allows you to enable/disable server-side encryption(SSE) for your delivery streams ensuring encryption of data at rest. For technical documentation, look at https://docs.aws.amazon.com/firehose/latest/dev/encryption.html

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new female voices: Italian - Bianca, Castilian Spanish - Lucia and new language: Mexican Spanish with new female voice - Mia.

## __Amazon Relational Database Service__
  - ### Features
    - API Update for RDS: this update enables Custom Endpoints, a new feature compatible with Aurora Mysql, Aurora PostgreSQL and Neptune that allows users to configure a customizable endpoint that will provide access to their instances in a cluster. 

# __1.11.447__ __2018-11-09__
## __AWS Elemental MediaPackage__
  - ### Features
    - As a part of SPEKE DRM encryption, MediaPackage now supports encrypted content keys. You can enable this enhanced content protection in an OriginEndpoint's encryption settings. When this is enabled, MediaPackage indicates to the key server that it requires an encrypted response. To use this, your DRM key provider must support content key encryption. For details on this feature, see the AWS MediaPackage User Guide at https://docs.aws.amazon.com/mediapackage/latest/ug/what-is.html.

# __1.11.446__ __2018-11-08__
## __AWS Elemental MediaLive__
  - ### Features
    - You can now switch a live channel between preconfigured inputs. This means assigned inputs for a running channel can be changed according to a defined schedule. You can also use MP4 files as inputs.

## __Amazon CloudWatch Events__
  - ### Features
    - Documentation updates for events

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Amazon Data Lifecycle Manager adds support for copying EBS volume tags to EBS snapshots. AWS resource tags allow customers to add metadata and apply access policies to your Amazon Elastic Block Store (Amazon EBS) resources. Starting today, customers can use Amazon Data Lifecycle Manager (DLM) to copy tags on EBS volumes to EBS snapshots. This allows customers to easily set snapshot metadata, such as access policies, to match the parent volume. Customers can enable this functionality on new or existing lifecycle policies. They can also choose to disable it at a future date.  

# __1.11.445__ __2018-11-07__
## __AWS Cost Explorer Service__
  - ### Features
    - Enable Payer Accounts to View Linked Account Recommendations. Payer Accounts can specify "LINKED" as scope in the request now. In the response, there is a new filed called AccountId in ReservationPurchaseRecommendationDetail for indicating which account is this recommendation detail belongs to.

## __AWS Database Migration Service__
  - ### Features
    - Update the DMS TestConnectionSucceeds waiter.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - VM Import/Export now supports generating encrypted EBS snapshots, as well as AMIs backed by encrypted EBS snapshots during the import process.

# __1.11.444__ __2018-11-06__
## __AWS CodeBuild__
  - ### Features
    - Documentation updates for codebuild

## __AWS WAF Regional__
  - ### Features
    - You can now use AWS WAF to configure protections for your Amazon API Gateway APIs.  This will enable you to block (or count) undesired traffic to your APIs based on the different AWS WAF rules and conditions you create. For more information about AWS WAF, see the AWS WAF Developer Guide.

## __Amazon API Gateway__
  - ### Features
    - AWS WAF integration with APIGW. Changes for adding webAclArn as a part of  Stage output. When the user calls a get-stage or get-stages, webAclArn will also be returned as a part of the output.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the new Amazon EC2 memory optimized R5a and general purpose M5a instances families that feature AMD EPYC processors.

## __Amazon Pinpoint__
  - ### Features
    - This update adds the ability to send transactional email by using the SendMessage API. Transactional emails are emails that you send directly to specific email addresses. Unlike campaign-based email that you send from Amazon Pinpoint, you don't have to create segments and campaigns in order to send transactional email.

## __Amazon Pinpoint Email Service__
  - ### Features
    - This is the first release of the Amazon Pinpoint Email API. You can use this API to configure and send transactional email from your Amazon Pinpoint account to specific email addresses. Unlike campaign-based email that you send from Amazon Pinpoint, you don't have to create segments and campaigns in order to send transactional email. 

# __1.11.443__ __2018-11-05__
## __AWSServerlessApplicationRepository__
  - ### Features
    - New AWS Serverless Application Repository APIs that support creating and reading a broader set of AWS CloudFormation templates, as well as enhancements to our existing APIs.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Adds waiters for ClusterActive and ClusterDeleted

# __1.11.442__ __2018-11-02__
## __Amazon CloudDirectory__
  - ### Features
    - ListObjectParents API now supports a bool parameter IncludeAllLinksToEachParent, which if set to true, will return a ParentLinks list instead of a Parents map; BatchRead API now supports ListObjectParents operation.

## __Amazon Rekognition__
  - ### Features
    - This release updates the DetectLabels operation. Bounding boxes are now returned for certain objects, a hierarchical taxonomy is now available for labels, and you can now get the version of the detection model used for detection.

# __1.11.441__ __2018-11-01__
## __AWS Service Catalog__
  - ### Features
    - Service Catalog integration with AWS Organizations, enables customers to more easily create and manage a portfolio of IT services across an organization. Administrators can now take advantage of the AWS account structure and account groupings configured in AWS Organizations to share Service Catalog Portfolios increasing agility and reducing risk. With this integration the admin user will leverage the trust relationship that exists within the accounts of the Organization to share portfolios to the entire Organization, a specific Organizational Unit or a specific Account.

# __1.11.440__ __2018-10-31__
## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ResourceType values. The updated list includes AWS Systems Manager AssociationCompliance and PatchCompliance, AWS Shield regional Protection, AWS Config ResourceCompliance, and AWS CodePipeline Pipeline.

## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - The object size limit is increased from 10MB to 25MB and the content type is more permissive.

## __AWS Greengrass__
  - ### Features
    - Greengrass APIs now support bulk deployment operations, and APIs that list definition versions now support pagination.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for AWS Secrets Manager.

# __1.11.439__ __2018-10-30__
## __AWS Database Migration Service__
  - ### Features
    - Add waiters for TestConnectionSucceeds, EndpointDeleted, ReplicationInstanceAvailable, ReplicationInstanceDeleted, ReplicationTaskReady, ReplicationTaskStopped, ReplicationTaskRunning and ReplicationTaskDeleted.

## __Amazon Chime__
  - ### Features
    - This is the initial release for the Amazon Chime AWS SDK. In this release, Amazon Chime adds support for administrative actions on users and accounts. API Documentation is also updated on https://docs.aws.amazon.com/chime/index.html

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the listener connection endpoint for SQL Server Always On to the list of fields returned when performing a describe-db-instances operation.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug in `TransferManager` that caused tags set on a `CopyObjectRequest` to be omitted when it is promoted to a multi-part copy.

# __1.11.438__ __2018-10-26__
## __Alexa For Business__
  - ### Features
    - Documentation updates for AWS Alexa for Business

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker notebook instances can now have a volume size configured.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Compliance Severity feature release for State Manager. Users now have the ability to select compliance severity to their association in state manager console or CLI.

# __1.11.437__ __2018-10-25__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - As part of this release we are introducing EC2 On-Demand Capacity Reservations. With On-Demand Capacity Reservations, customers can reserve the exact EC2 capacity they need, and can keep it only for as long as they need it.

# __1.11.436__ __2018-10-24__
## __AWS CodeStar__
  - ### Features
    - This release lets you create projects from source code and a toolchain definition that you provide.

## __Alexa For Business__
  - ### Features
    - We extended the functionality of the Alexa for Business SDK, including additional support for third-party Alexa built-in devices, managing private and public skills, and conferencing setup.

# __1.11.435__ __2018-10-23__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Provides customers the ability to Bring Your Own IP (BYOIP) prefix.  You can bring part or all of your public IPv4 address range from your on-premises network to your AWS account. You continue to own the address range, but AWS advertises it on the internet.

# __1.11.434__ __2018-10-22__
## __AWS Shield__
  - ### Features
    - AWS Shield Advanced API introduced a new service-specific AccessDeniedException which will be thrown when accessing individual attack information without sufficient permission.

## __Amazon Inspector__
  - ### Features
    - Finding will be decorated with ec2 related metadata

# __1.11.433__ __2018-10-19__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Rate Control feature release for State Manager. Users now have the ability to apply rate control parameters similar to run command to their association in state manager console or CLI.

## __Amazon WorkSpaces__
  - ### Features
    - Added support for PowerPro and GraphicsPro WorkSpaces bundles.

# __1.11.432__ __2018-10-18__
## __AWS Elemental MediaLive__
  - ### Features
    - This release allows you to now turn on Quality-Defined Variable Bitrate (QVBR) encoding for your AWS Elemental MediaLive channels. You can now deliver a consistently high-quality video viewing experience while reducing overall distribution bitrates by using Quality-Defined Variable Bitrate (QVBR) encoding with AWS Elemental MediaLive. QVBR is a video compression technique that automatically adjusts output bitrates to the complexity of source content and only use the bits required to maintain a defined level of quality. This means using QVBR encoding, you can save on distribution cost, while maintaining, or increasing video quality for your viewers.

## __Amazon AppStream__
  - ### Features
    - This API update adds support for creating, managing, and deleting users in the AppStream 2.0 user pool.

## __Amazon Route 53__
  - ### Features
    - This change allows customers to disable health checks.

# __1.11.431__ __2018-10-17__
## __Amazon API Gateway__
  - ### Features
    - Documentation updates for API Gateway

## __Amazon CloudWatch Events__
  - ### Features
    - AWS Events - AWS Organizations Support in Event-Bus Policies. This release introduces a new parameter in the PutPermission API named Condition. Using the Condition parameter, customers can allow one or more AWS Organizations to access their CloudWatch Events Event-Bus resource.

# __1.11.430__ __2018-10-16__
## __AWS Glue__
  - ### Features
    - New Glue APIs for creating, updating, reading and deleting Data Catalog resource-based policies.

## __AWS Resource Groups__
  - ### Features
    - AWS Resource Groups service added a new feature to filter resource groups by resource-type when using the ListGroups operation.

## __Amazon Lightsail__
  - ### Features
    - Adds support for Lightsail managed databases.

# __1.11.429__ __2018-10-15__
## __AWS Lambda__
  - ### Features
    - Documentation updates for lambda

## __AWS Service Catalog__
  - ### Features
    - AWS Service Catalog enables you to reduce administrative maintenance and end-user training while adhering to compliance and security measures. With service actions, you as the administrator can enable end users to perform operational tasks, troubleshoot issues, run approved commands, or request permissions within Service Catalog. Service actions are defined using AWS Systems Manager documents, where you have access to pre-defined actions that implement AWS best practices, such asEC2 stop and reboot, as well as the ability to define custom actions.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds a new parameter to specify the DB instance or cluster parameter group for restore from DB snapshot and restore to point int time operations. For more information, see Amazon RDS Documentation.

# __1.11.428__ __2018-10-12__
## __AWS CloudTrail__
  - ### Features
    - The LookupEvents API now supports two new attribute keys: ReadOnly and AccessKeyId

# __1.11.427__ __2018-10-11__
## __AWS Direct Connect__
  - ### Features
    - This release adds support for Jumbo Frames over AWS Direct Connect. You can now set MTU value when creating new virtual interfaces. This release also includes a new API to modify MTU value of existing virtual interfaces.

## __AWS Elemental MediaConvert__
  - ### Features
    - Added Paginators for all the MediaConvert list operations

## __Amazon Athena__
  - ### Features
    - 1. GetQueryExecution API changes to return statementType of a submitted Athena query.  2. GetQueryResults API changes to return the number of rows added to a table when a CTAS query is executed.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the smaller-sized G3 instance called g3s.xlarge. G3s.xlarge provides 4 vCPU, 30.5 GB RAM and a NVIDIA Tesla M60 GPU. It is ideal for remote workstations, engineering and architectural applications, and 3D visualizations and rendering for visual effects.

## __Amazon Transcribe Service__
  - ### Features
    - With this release, Amazon Transcribe now supports transcriptions from audio sources in British English (en-UK), Australian English (en-AU), and Canadian French (fr-CA).

# __1.11.426__ __2018-10-10__
## __Amazon Comprehend__
  - ### Features
    - This release adds French, Italian, German and Portuguese language support for all existing synchronous and asynchronous APIs

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service now supports customer-scheduled service software updates. When new service software becomes available, you can request an update to your domain and benefit from new features more quickly. If you take no action, we update the service software automatically after a certain time frame.

## __Amazon Transcribe Service__
  - ### Features
    - With this update Amazon Transcribe now supports deleting completed transcription jobs. 

# __1.11.425__ __2018-10-09__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds StartDate, EndDate, and ScheduleTimezone to CreateMaintenanceWindow and UpdateMaintenanceWindow; Adds NextExecutionTime to GetMaintenanceWindow and DescribeMaintenanceWindows; Adds CancelMaintenanceWindowExecution, DescribeMaintenanceWindowSchedule and DescribeMaintenanceWindowsForTarget APIs.

# __1.11.424__ __2018-10-08__
## __AWS IoT__
  - ### Features
    - We are releasing job execution timeout functionalities to customers. Customer now can set job execution timeout on the job level when creating a job. 

## __AWS IoT Jobs Data Plane__
  - ### Features
    - We are releasing job execution timeout functionalities to customers. Device can now set and update their job execution timeout. 

# __1.11.423__ __2018-10-05__
## __AWS Directory Service__
  - ### Features
    - SDK changes to create a new type of trust for active directory

# __1.11.422__ __2018-10-04__
## __AWS CodeBuild__
  - ### Features
    - Add resolved source version field in build output

## __AWS S3 Transfer Manager__
  - ### Bugfixes
    - Fixed the bug where transfer state was not updated to Failed when copy multiparts request failed.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now enables you to specify folders and subfolders when you update your file gateway's view of your S3 objects using the Refresh Cache API.

## __Amazon API Gateway__
  - ### Features
    - Adding support for multi-value parameters in TestInvokeMethod and TestInvokeAuthorizer.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    -  Adds RejectedPatchesAction to baseline to enable stricted validation of the rejected Patches List ; Add InstalledRejected and InstallOverrideList to compliance reporting

# __1.11.421__ __2018-10-02__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon SageMaker Service__
  - ### Features
    - Waiter for SageMaker Batch Transform Jobs.

# __1.11.420__ __2018-10-01__
## __Amazon GuardDuty__
  - ### Features
    - Support optional FindingPublishingFrequency parameter in CreateDetector and UpdateDetector operations, and ClientToken on Create* operations

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition

# __1.11.419__ __2018-09-28__
## __AWS CodeStar__
  - ### Features
    - This release enables tagging CodeStar Projects at creation. The CreateProject API now includes optional tags parameter.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now use EC2 High Memory instances with 6 TiB memory (u-6tb1.metal), 9 TiB memory (u-9tb1.metal), and 12 TiB memory (u-12tb1.metal), which are ideal for running large in-memory databases, including production deployments of SAP HANA. These instances offer 448 logical processors, where each logical processor is a hyperthread on 224 cores. These instance deliver high networking throughput and lower latency with up to 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking. These instances are EBS-Optimized by default, and support encrypted and unencrypted EBS volumes. This instance is only available in host-tenancy. You will need an EC2 Dedicated Host for this instance type to launch an instance.

# __1.11.418__ __2018-09-27__
## __AWS CodeCommit__
  - ### Features
    - This release adds API support for getting the contents of a file, getting the contents of a folder, and for deleting a file in an AWS CodeCommit repository.

## __Amazon API Gateway__
  - ### Features
    - Adding support for OpenAPI 3.0 import and export.

## __AmazonMQ__
  - ### Features
    - Amazon MQ supports ActiveMQ 5.15.6, in addition to 5.15.0. Automatic minor version upgrades can be toggled. Updated the documentation.

# __1.11.417__ __2018-09-26__
## __AWS Glue__
  - ### Features
    - AWS Glue now supports data encryption at rest for ETL jobs and development endpoints. With encryption enabled, when you run ETL jobs, or development endpoints, Glue will use AWS KMS keys to write encrypted data at rest. You can also encrypt the metadata stored in the Glue Data Catalog using keys that you manage with AWS KMS. Additionally, you can use AWS KMS keys to encrypt the logs generated by crawlers and ETL jobs as well as encrypt ETL job bookmarks. Encryption settings for Glue crawlers, ETL jobs, and development endpoints can be configured using the security configurations in Glue. Glue Data Catalog encryption can be enabled via the settings for the Glue Data Catalog.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - This release introduces a new API called ExportServerEngineAttribute to Opsworks-CM. You can use this API call to export engine specific attributes like the UserData script used for unattended bootstrapping of new nodes that connect to the server. 

## __Amazon Relational Database Service__
  - ### Features
    - This release includes Deletion Protection for RDS databases.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS.

# __1.11.416__ __2018-09-25__
## __AWS Directory Service__
  - ### Features
    - API changes related to launch of cross account for Directory Service.

## __Amazon CloudFront__
  - ### Features
    - Documentation updates for cloudfront

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add pagination support for ec2.describe-route-tables API. 

# __1.11.415__ __2018-09-24__
## __Amazon Connect Service__
  - ### Features
    - This update adds the Amazon Connect Metrics API, which lets you get current metric data and historical metric data within 24 hours for the queues in your Amazon Connect instance.

## __Amazon Relational Database Service__
  - ### Features
    -  Adds DB engine version requirements for option group option settings, and specifies if an option setting requires a value.

# __1.11.414__ __2018-09-21__
## __AWS Elemental MediaConvert__
  - ### Features
    - To offer lower prices for predictable, non-urgent workloads, we propose the concept of Reserved Transcode pricing. Reserved Transcode pricing Reserved Transcoding pricing would offer the customer access to a fixed parallel processing capacity for a fixed monthly rate. This capacity would be stated in terms of number of Reserved Transcode Slots (RTSs). One RTS would be able to process one job at a time for a fixed monthly fee.

# __1.11.413__ __2018-09-20__
## __AWS Directory Service__
  - ### Features
    - Added CreateLogSubscription, DeleteLogSubscription, and ListLogSubscriptions APIs for Microsoft AD. Customers can now opt in to have Windows security event logs from the domain controllers forwarded to a log group in their account.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch f1.4xlarge, a new instance size within the existing f1 family which provides two Xilinx Virtex Field Programmable Arrays (FPGAs) for acceleration. FPGA acceleration provide additional performance and time sensitivity for specialized accelerated workloads such as clinical genomics and real-time video processing. F1.4xlarge instances are available in the US East (N. Virginia), US West (Oregon), GovCloud (US), and EU West (Dublin) AWS Regions.

## __Amazon Relational Database Service__
  - ### Features
    - This launch enables RDS start-db-cluster and stop-db-cluster. Stopping and starting Amazon Aurora clusters helps you manage costs for development and test environments. You can temporarily stop all the DB instances in your cluster, instead of setting up and tearing down all the DB instances each time that you use the cluster.

# __1.11.412__ __2018-09-19__
## __AWS Organizations__
  - ### Features
    - Introducing a new exception - AccountOwnerNotVerifiedException which will be returned for InviteAccountToOrganization call for unverified accounts.

## __Amazon CloudWatch__
  - ### Features
    - Amazon CloudWatch adds the ability to request png image snapshots of metric widgets using the GetMetricWidgetImage API.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Cross Region Replication now allows customers to use S3 object tags to filter the scope of replication. By using S3 object tags, customers can identify individual objects for replication across AWS Regions for compliance and data protection. Cross Region Replication for S3 enables automatic and asynchronous replication of objects to another AWS Region, and with this release customers can replicate at a bucket level, prefix level or by using object tags.

# __1.11.411__ __2018-09-18__
## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service adds support for node-to-node encryption for new domains running Elasticsearch version 6.0 and above

## __Amazon Rekognition__
  - ### Features
    - This release updates the Amazon Rekognition IndexFaces API operation. It introduces a QualityFilter parameter that allows you to automatically filter out detected faces that are deemed to be of low quality by Amazon Rekognition. The quality bar is based on a variety of common use cases.  You can filter low-quality detected faces by setting QualityFilter to AUTO, which is also the default setting. To index all detected faces regardless of quality, you can specify NONE.  This release also provides a MaxFaces parameter that is useful when you want to only index the most prominent and largest faces in an image and don't want to index other faces detected in the image, such as smaller faces belonging to people standing in the background.

# __1.11.410__ __2018-09-17__
## __AWS CodeBuild__
  - ### Features
    - Support build logs configuration.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon CloudWatch__
  - ### Features
    - Amazon CloudWatch adds the ability to publish values and counts using PutMetricData

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for additional Docker flags as Task Definition parameters. Customers can now configure their ECS Tasks to use systemControls (sysctl), pseudoTerminal (tty), and interactive (i) Docker flags.

## __Amazon ElastiCache__
  - ### Features
    - ElastiCache for Redis added support for adding and removing read-replicas from any cluster with no cluster downtime, Shard naming: ElastiCache for Redis customers have the option of allowing ElastiCache to create names for their node groups (shards) or generating their own node group names. For more information, see https:// docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_NodeGroupConfiguration.html, ShardsToRetain: When reducing the number of node groups (shards) in an ElastiCache for Redis (cluster mode enabled) you have the option of specifying which node groups to retain or which node groups to remove. For more information, see https:// docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html, ReservationARN: ReservedNode includes an ARN, ReservationARN, member which identifies the reserved node. For more information, see https:// docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ReservedCacheNode.html

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for customers to tag EC2 Dedicated Hosts on creation.

## __Amazon Elastic Transcoder__
  - ### Features
    - Added support for MP2 container

# __1.11.409__ __2018-09-13__
## __Amazon Polly__
  - ### Features
    - Amazon Polly adds Mandarin Chinese language support with new female voice - "Zhiyu"

# __1.11.408__ __2018-09-12__
## __Amazon Connect Service__
  - ### Features
    - This update adds the Amazon Connect Update Contact Attributes API, which lets you update contact attributes for contacts in your Amazon Connect instance.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Pagination Support for DescribeNetworkInterfaces API

## __Amazon Simple Email Service__
  - ### Features
    - Documentation updates for Amazon Simple Email Service

## __Firewall Management Service__
  - ### Features
    - This update of Amazon Fire Wall Manager adds the ability to scope down the policy as well as to get all the member accounts belonging to a certain Fire Wall Manager admin account.

# __1.11.407__ __2018-09-11__
## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for opsworkscm

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Session Manager is a fully managed AWS Systems Manager capability that provides interactive one-click access to Amazon EC2 Linux and Windows instances.

# __1.11.406__ __2018-09-10__
## __AWS CloudHSM V2__
  - ### Features
    - With this release, we are adding 2 new APIs. DeleteBackup deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request. During this 7-day period, the backup will be in state PENDING_DELETION. Backups can be restored using the RestoreBackup API, which will move the backup from state PENDING_DELETION back to ACTIVE.

## __Amazon Redshift__
  - ### Features
    - Adding support to Redshift to change the encryption type after cluster creation completes.

# __1.11.405__ __2018-09-07__
## __AWS Config__
  - ### Features
    - Adding a new field "createdBy" to the ConfigRule data model. The field is populated only if the rule is service linked i.e the rule is created by a service. The field is empty for normal rules created by customer.

## __Amazon CloudWatch Logs__
  - ### Features
    - * Adding a log prefix parameter for filter log events API and minor updates to the documentation

# __1.11.404__ __2018-09-06__
## __AWS CodeCommit__
  - ### Features
    - This release adds additional optional fields to the pull request APIs.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds support for Cost Allocation through tagging and also enables adding, editing, and removal of tags from the MediaConvert console.

## __Amazon API Gateway__
  - ### Features
    - Add support for Active X-Ray with API Gateway

# __1.11.403__ __2018-09-05__
## __Amazon AppStream__
  - ### Features
    - Added support for enabling persistent application settings for a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.

## __Amazon DynamoDB__
  - ### Features
    - New feature for Amazon DynamoDB.

## __Amazon Relational Database Service__
  - ### Features
    - Fix broken links in the RDS CLI Reference to the Aurora User Guide

## __Amazon Simple Storage Service__
  - ### Features
    - Parquet input format support added for the SelectObjectContent API

## __Elastic Load Balancing__
  - ### Features
    - Documentation update for DescribeAccountLimits API to include classic-registered-instances.

# __1.11.402__ __2018-09-04__
## __Amazon Rekognition__
  - ### Features
    - This release introduces a new API called DescribeCollection to Amazon Rekognition. You can use DescribeCollection to get information about an existing face collection. Given the ID for a face collection, DescribeCollection returns the following information: the number of faces indexed into the collection, the version of the face detection model used by the collection, the Amazon Resource Name (ARN) of the collection and the creation date/time of the collection.

## __Amazon Relational Database Service__
  - ### Features
    - Updating cross references for the new Aurora User Guide.

# __1.11.401__ __2018-08-31__
## __AWS WAF__
  - ### Features
    - This change includes support for the WAF FullLogging feature through which Customers will have access to all the logs of requests that are inspected by a WAF WebACL. The new APIs allow Customers to manage association of a WebACL with one or more supported "LogDestination" and redact any request fields from the logs. 

## __AWS WAF Regional__
  - ### Features
    - This change includes support for the WAF FullLogging feature through which Customers will have access to all the logs of requests that are inspected by a WAF WebACL. The new APIs allow Customers to manage association of a WebACL with one or more supported "LogDestination" and redact any request fields from the logs. 

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Amazon EKS DescribeCluster API returns a platformVersion attribute which allows you to identify the features that are currently enabled for your clusters. The Amazon EKS platform version represents capabilities of the cluster control plane, such as which Kubernetes API server flags are enabled, as well as the current Kubernetes patch version. 

# __1.11.400__ __2018-08-30__
## __AWS CodeBuild__
  - ### Features
    - Support multiple sources and artifacts for CodeBuild projects. 

## __Amazon S3__
  - ### Bugfixes
    - Fixed an issue where isDone would not transition to true when a parallel upload failed. See https://github.com/aws/aws-sdk-java/issues/1667.

## __Amazon SageMaker Service__
  - ### Features
    - VolumeKmsKeyId now available in Batch Transform Job 

# __1.11.399__ __2018-08-29__
## __AWS Elemental MediaPackage__
  - ### Features
    - MediaPackage now provides input redundancy. Channels have two ingest endpoints that can receive input from encoders. OriginEndpoints pick one of the inputs receiving content for playback and automatically switch to the other input if the active input stops receiving content. Refer to the User Guide (https://docs.aws.amazon.com/mediapackage/latest/ug/what-is.html) for more details on this feature.

## __AWS Glue__
  - ### Features
    - AWS Glue now supports data encryption at rest for ETL jobs and development endpoints. With encryption enabled, when you run ETL jobs, or development endpoints, Glue will use AWS KMS keys to write encrypted data at rest. You can also encrypt the metadata stored in the Glue Data Catalog using keys that you manage with AWS KMS. Additionally, you can use AWS KMS keys to encrypt the logs generated by crawlers and ETL jobs as well as encrypt ETL job bookmarks. Encryption settings for Glue crawlers, ETL jobs, and development endpoints can be configured using the security configurations in Glue. Glue Data Catalog encryption can be enabled via the settings for the Glue Data Catalog.

## __AWS SDK for Java__
  - ### Features
    - Added `SdkThreadLocals.remove()`, which will clear all thread locals from the SDK for the current thread. https://github.com/aws/aws-sdk-java/pull/1729

## __Amazon SageMaker Runtime__
  - ### Features
    - SageMaker Runtime supports CustomAttributes header which allows customers provide additional information in a request for an inference submitted to a model or in the response about the inference returned by a model hosted at an Amazon SageMaker endpoint.

# __1.11.398__ __2018-08-28__
## __AWS Glue__
  - ### Features
    - New Glue APIs for creating, updating, reading and deleting Data Catalog resource-based policies.

## __AWS X-Ray__
  - ### Features
    - Support for new APIs that enable management of sampling rules.

# __1.11.397__ __2018-08-27__
## __AWS IoT__
  - ### Features
    - This release adds support to create a Stream and Code signing for Amazon FreeRTOS job along with Over-the-air updates.

## __AWS IoT Analytics__
  - ### Features
    - Added new listDatasetContent API that shows you the list of dataset contents for the corresponding versions

## __AWS Signer__
  - ### Features
    - AWS Signer is a new feature that allows Amazon FreeRTOS (AFR) Over The Air (OTA) customers to cryptographically sign code using code-signing certificates managed by AWS Certificate Manager. 

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

# __1.11.396__ __2018-08-24__
## __AWS Glue__
  - ### Features
    - AWS Glue now supports data encryption at rest for ETL jobs and development endpoints. With encryption enabled, when you run ETL jobs, or development endpoints, Glue will use AWS KMS keys to write encrypted data at rest. You can also encrypt the metadata stored in the Glue Data Catalog using keys that you manage with AWS KMS. Additionally, you can use AWS KMS keys to encrypt the logs generated by crawlers and ETL jobs as well as encrypt ETL job bookmarks. Encryption settings for Glue crawlers, ETL jobs, and development endpoints can be configured using the security configurations in Glue. Glue Data Catalog encryption can be enabled via the settings for the Glue Data Catalog.

# __1.11.395__ __2018-08-24__
## __Amazon CloudWatch Events__
  - ### Features
    - Added Fargate and NetworkConfiguration support to EcsParameters.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now has API support for creating custom domains for our hosted UI for User Pools.

# __1.11.394__ __2018-08-23__
## __AWS Elemental MediaLive__
  - ### Features
    - Adds two APIs for working with Channel Schedules: BatchUpdateSchedule and DescribeSchedule. These APIs allow scheduling actions for SCTE-35 message insertion and for static image overlays.

## __AWS IoT__
  - ### Features
    - This release adds support for IoT Thing Group Indexing and Searching functionality.

## __AWS IoT Analytics__
  - ### Features
    - AWS IoT Analytics announces three new features:  (1) Bring Your Custom Container - import your custom authored code containers. (2) Automate Container Execution - lets you automate the execution of containers hosting custom authored analytical code or Jupyter Notebooks to perform continuous analysis. (3) Incremental Data Capture with Customizable Time Windows - enables users to perform analysis on new incremental data captured since the last analysis.

## __AWS SDK for Java__
  - ### Features
    - Add support for setting the protocol/scheme to use when connecting to a proxy via `ClientConfiguration#withProxyProtocol`; previously the client always used `http`. This allows customers to connect to an HTTP proxy over TLS if the proxy supports it. Fixes [#1709](https://github.com/aws/aws-sdk-java/issues/1709)

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex builds bot in two stages. After the first it sets status to READY_BASIC_TESTING. In this state the bot will match user inputs that exactly match the utterances configured for the bot's intents and values in the slot types. 

## __Amazon Rekognition__
  - ### Features
    - This release introduces a new API called DescribeCollection to Amazon Rekognition.  You can use DescribeCollection to get information about an existing face collection. Given the ID for a face collection, DescribeCollection returns the following information: the number of faces indexed into the collection, the version of the face detection model used by the collection, the Amazon Resource Name (ARN) of the collection and the creation date/time of the collection.

# __1.11.393__ __2018-08-22__
## __Amazon Import/Export Snowball__
  - ### Features
    - Snowball job states allow customers to track the status of the Snowball job. We are launching a new Snowball job state "WithSortingFacility"!  When customer returns the Snowball to AWS, the device first goes to a sorting facility before it reaches an AWS data center.  Many customers have requested us to add a new state to reflect the presence of the device at the sorting facility for better tracking. Today when a customer returns  the Snowball, the state first changes from "InTransitToAWS" to "WithAWS". With the addition of new state, the device will move from "InTransitToAWS" to "WithAWSSortingFacility", and then to "WithAWS".  There are no other changes to the API at this time besides adding this new state.

# __1.11.392__ __2018-08-21__
## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk adds the "Privileged" field to the "CPUUtilization" type, to support enhanced health reporting in Windows environments.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Documentation updates for Lifecycle

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for T3 Instance type in EC2. To learn more about T3 instances, please see https://aws.amazon.com/ec2/instance-types/t3/

## __Amazon Relational Database Service__
  - ### Features
    - Adds a paginator for the DescribeDBClusters operation.

# __1.11.391__ __2018-08-20__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's Continuous Export APIs allow you to analyze your on-premises server inventory data, including system performance and network dependencies, in Amazon Athena.

## __AWS CodeBuild__
  - ### Features
    - Release semantic versioning feature for CodeBuild

## __AWS Device Farm__
  - ### Features
    - Support for running tests in a custom environment with live logs/video streaming, full test features parity and reduction in overall test execution time.

## __AWS Elemental MediaConvert__
  - ### Features
    - Added WriteSegmentTimelineInRepresentation option for Dash Outputs
    - This release adds support for a new rate control mode, Quality-Defined Variable Bitrate (QVBR) encoding, includes updates to optimize transcoding performance, and resolves previously reported bugs.
    - This release fixes backward-incompatible changes from a previous release. That previous release changed non-required job settings to required, which prevented jobs and job templates from merging correctly. The current change removes validation of required settings from the SDK and instead centralizes the validation in the service API. For information on required settings, see the Resources chapter of the AWS Elemental MediaConvert API Reference https://docs.aws.amazon.com/mediaconvert/latest/apireference/resources.html

## __AWS Health APIs and Notifications__
  - ### Features
    - Updates the ARN structure vended by AWS Health API. All ARNs will now include the service and type code of the associated event, as vended by DescribeEventTypes.

## __AWS Resource Groups__
  - ### Features
    - AWS Resource Groups service added a new feature to filter group resources by resource-type when using the ListGroupResources operation.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager
    - This release introduces a ForceDeleteWithoutRecovery parameter to the DeleteSecret API enabling customers to force the deletion of a secret without any recovery window

## __Alexa For Business__
  - ### Features
    - Documentation updates for AWS Alexa For Business

## __Amazon CloudFront__
  - ### Features
    - Lambda@Edge Now Provides You Access to the Request Body for HTTP POST/PUT Processing. With this feature, you can now offload more origin logic to the edge and improve end-user latency. Developers typically use Web/HTML forms or Web Beacons/Bugs as a mechanism to collect data from the end users and then process that data at their origins servers. For example, if you are collecting end user behavior data through a web beacon on your website, you can use this feature to access the user behavior data and directly log it to an Amazon Kinesis Firehose endpoint from the Lambda function, thereby simplifying your origin infrastructure.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation Update

## __Amazon DynamoDB__
  - ### Features
    -  Amazon DynamoDB Point-in-time recovery (PITR) provides continuous backups of your table data. DynamoDB now supports the ability to self-restore a deleted PITR enabled table. Now, when a table with PITR enabled is deleted, a system backup is automatically created and retained for 35 days (at no additional cost). System backups allow you to restore the deleted PITR enabled table to the state it was just before the point of deletion. For more information, see the Amazon DynamoDB Developer Guide.
    - Added SSESpecification block to update-table command which allows users to modify table Server-Side Encryption. Added two new fields (SSEType and KMSMasterKeyId) to SSESpecification block used by create-table and update-table commands. Added new SSEDescription Status value UPDATING.

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Add the SSESpecification field to CreateCluster to allow creation of clusters with server-side encryption, and add the SSEDescription field to DescribeClusters to display the status of server-side encryption for a cluster. 
    - DAX CreateClusterRequest is updated to include IamRoleArn as a required request parameter. 

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for Docker volumes and Docker volume drivers. Customers can now configure their ECS Tasks to use Docker volumes, enabling stateful and storage-intensive applications to be deployed on ECS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon VPC Flow Logs adds support for delivering flow logs directly to S3
    - The 'Attribute' parameter DescribeVolumeAttribute request has been marked as required - the API has always required this parameter, but up until now this wasn't reflected appropriately in the SDK.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service adds support for no downtime, in-place upgrade for Elasticsearch version 5.1 and above.

## __Amazon Kinesis__
  - ### Features
    - This update introduces SubscribeToShard and RegisterStreamConsumer APIs which allows for retrieving records on a data stream over HTTP2 with enhanced fan-out capabilities. With this new feature the Java SDK now supports event streaming natively which will allow you to define payload and exception structures on the client over a persistent connection. For more information, see Developing Consumers with Enhanced Fan-Out in the Kinesis Developer Guide.

## __Amazon Pinpoint__
  - ### Features
    - This release includes a new batch API call for Amazon Pinpoint which can be used to update endpoints and submit events. This call will accept events from clients such as mobile devices and AWS SDKs. This call will accept requests which has multiple endpoints and multiple events attached to those endpoints in a single call. This call will update the endpoints attached and will ingest events for those endpoints. The response from this call will be a multipart response per endpoint/per event submitted.

## __Amazon Polly__
  - ### Features
    - Amazon Polly enables female voice Aditi to speak Hindi language

## __Amazon Redshift__
  - ### Features
    - You can now resize your Amazon Redshift cluster quickly. With the new ResizeCluster action, your cluster is available for read and write operations within minutes

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds
    - Launch RDS Aurora Serverless

## __Amazon SageMaker Service__
  - ### Features
    - Added an optional boolean parameter, 'DisassociateLifecycleConfig', to the UpdateNotebookInstance operation. When set to true, the lifecycle configuration associated with the notebook instance will be removed, allowing a new one to be set via a new 'LifecycleConfigName' parameter.
    - SageMaker updated the default endpoint URL to support Private Link via the CLI/SDK.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Automation is launching two new features for Automation Execution Rate Control based on tags and customized parameter maps. With the first feature, customer can target their resources by specifying a Tag with Key/Value. With the second feature, Parameter maps rate control, customers can benefit from customization of input parameters.
    - AWS Systems Manager Inventory now supports groups to quickly see a count of which managed instances are and arent configured to collect one or more Inventory types
    - This release updates AWS Systems Manager APIs to let customers create and use service-linked roles to register and edit Maintenance Window tasks.
    - Two new filters ExecutionStage and DocumentName will be added to ListCommands so that customers will have more approaches to query their commands.

## __Auto Scaling__
  - ### Features
    - Add batch operations for creating/updating and deleting scheduled scaling actions.

# __1.11.390__ __2018-08-17__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's Continuous Export APIs allow you to analyze your on-premises server inventory data, including system performance and network dependencies, in Amazon Athena.

## __AWS CodeBuild__
  - ### Features
    - Release semantic versioning feature for CodeBuild

## __AWS Device Farm__
  - ### Features
    - Support for running tests in a custom environment with live logs/video streaming, full test features parity and reduction in overall test execution time.

## __AWS Elemental MediaConvert__
  - ### Features
    - Added WriteSegmentTimelineInRepresentation option for Dash Outputs
    - This release adds support for a new rate control mode, Quality-Defined Variable Bitrate (QVBR) encoding, includes updates to optimize transcoding performance, and resolves previously reported bugs.

## __AWS Health APIs and Notifications__
  - ### Features
    - Updates the ARN structure vended by AWS Health API. All ARNs will now include the service and type code of the associated event, as vended by DescribeEventTypes.

## __AWS Resource Groups__
  - ### Features
    - AWS Resource Groups service added a new feature to filter group resources by resource-type when using the ListGroupResources operation.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager
    - This release introduces a ForceDeleteWithoutRecovery parameter to the DeleteSecret API enabling customers to force the deletion of a secret without any recovery window

## __Alexa For Business__
  - ### Features
    - Documentation updates for AWS Alexa For Business

## __Amazon CloudFront__
  - ### Features
    - Lambda@Edge Now Provides You Access to the Request Body for HTTP POST/PUT Processing. With this feature, you can now offload more origin logic to the edge and improve end-user latency. Developers typically use Web/HTML forms or Web Beacons/Bugs as a mechanism to collect data from the end users and then process that data at their origins servers. For example, if you are collecting end user behavior data through a web beacon on your website, you can use this feature to access the user behavior data and directly log it to an Amazon Kinesis Firehose endpoint from the Lambda function, thereby simplifying your origin infrastructure.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation Update

## __Amazon DynamoDB__
  - ### Features
    -  Amazon DynamoDB Point-in-time recovery (PITR) provides continuous backups of your table data. DynamoDB now supports the ability to self-restore a deleted PITR enabled table. Now, when a table with PITR enabled is deleted, a system backup is automatically created and retained for 35 days (at no additional cost). System backups allow you to restore the deleted PITR enabled table to the state it was just before the point of deletion. For more information, see the Amazon DynamoDB Developer Guide.

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Add the SSESpecification field to CreateCluster to allow creation of clusters with server-side encryption, and add the SSEDescription field to DescribeClusters to display the status of server-side encryption for a cluster. 
    - DAX CreateClusterRequest is updated to include IamRoleArn as a required request parameter. 

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for Docker volumes and Docker volume drivers. Customers can now configure their ECS Tasks to use Docker volumes, enabling stateful and storage-intensive applications to be deployed on ECS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon VPC Flow Logs adds support for delivering flow logs directly to S3
    - The 'Attribute' parameter DescribeVolumeAttribute request has been marked as required - the API has always required this parameter, but up until now this wasn't reflected appropriately in the SDK.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service adds support for no downtime, in-place upgrade for Elasticsearch version 5.1 and above.

## __Amazon Kinesis__
  - ### Features
    - This update introduces SubscribeToShard and RegisterStreamConsumer APIs which allows for retrieving records on a data stream over HTTP2 with enhanced fan-out capabilities. With this new feature the Java SDK now supports event streaming natively which will allow you to define payload and exception structures on the client over a persistent connection. For more information, see Developing Consumers with Enhanced Fan-Out in the Kinesis Developer Guide.

## __Amazon Pinpoint__
  - ### Features
    - This release includes a new batch API call for Amazon Pinpoint which can be used to update endpoints and submit events. This call will accept events from clients such as mobile devices and AWS SDKs. This call will accept requests which has multiple endpoints and multiple events attached to those endpoints in a single call. This call will update the endpoints attached and will ingest events for those endpoints. The response from this call will be a multipart response per endpoint/per event submitted.

## __Amazon Polly__
  - ### Features
    - Amazon Polly enables female voice Aditi to speak Hindi language

## __Amazon Redshift__
  - ### Features
    - You can now resize your Amazon Redshift cluster quickly. With the new ResizeCluster action, your cluster is available for read and write operations within minutes

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds
    - Launch RDS Aurora Serverless

## __Amazon SageMaker Service__
  - ### Features
    - Added an optional boolean parameter, 'DisassociateLifecycleConfig', to the UpdateNotebookInstance operation. When set to true, the lifecycle configuration associated with the notebook instance will be removed, allowing a new one to be set via a new 'LifecycleConfigName' parameter.
    - SageMaker updated the default endpoint URL to support Private Link via the CLI/SDK.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager Automation is launching two new features for Automation Execution Rate Control based on tags and customized parameter maps. With the first feature, customer can target their resources by specifying a Tag with Key/Value. With the second feature, Parameter maps rate control, customers can benefit from customization of input parameters.
    - AWS Systems Manager Inventory now supports groups to quickly see a count of which managed instances are and arent configured to collect one or more Inventory types
    - This release updates AWS Systems Manager APIs to let customers create and use service-linked roles to register and edit Maintenance Window tasks.
    - Two new filters ExecutionStage and DocumentName will be added to ListCommands so that customers will have more approaches to query their commands.

## __Auto Scaling__
  - ### Features
    - Add batch operations for creating/updating and deleting scheduled scaling actions.

# __1.11.378__ __2018-08-01__
## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now enables you to create stored volumes with AWS KMS support.

## __Amazon Transcribe Service__
  - ### Features
    - With this update Amazon Transcribe now supports channel identification. It transcribes audio from separate channels and combines them into a single transcription. 

# __1.11.377__ __2018-07-31__
## __AWS Elemental MediaConvert__
  - ### Features
    - Fixes an issue with modeled timestamps being labeled with the incorrect format.

## __AWS IoT__
  - ### Features
    - As part of this release we are introducing a new IoT security service, AWS IoT Device Defender, and extending capability of AWS IoT to support Step Functions rule action. The AWS IoT Device Defender is a fully managed service that helps you secure your fleet of IoT devices. For more details on this new service, go to https://aws.amazon.com/iot-device-defender. The Step Functions rule action lets you start an execution of AWS Step Functions state machine from a rule.

## __AWS Key Management Service__
  - ### Features
    - Added a KeyID parameter to the ListAliases operation. This parameter allows users to list only the aliases that refer to a particular AWS KMS customer master key. All other functionality remains intact.

## __Amazon Connect Service__
  - ### Features
    - This update includes the new User Management APIs and the Federation API used for SAML authentication. The User Management APIs let you create and manage users in your Amazon Connect instance programmatically. The Federation API enables authentication between AWS and your existing identity provider using tokens.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon Elasticsearch Service adds support for enabling Elasticsearch error logs, providing you valuable information for troubleshooting your Elasticsearch domains quickly and easily. These logs are published to the Amazon CloudWatch Logs service and can be turned on or off at will.

# __1.11.376__ __2018-07-30__
## __AWS CloudHSM V2__
  - ### Features
    - This update  to the AWS CloudHSM API adds copy-backup-to-region, which allows you to copy a backup of a cluster from one region to another. The copied backup can be used in the destination region to create a new AWS CloudHSM cluster as a clone of the original cluster. 

## __AWS Direct Connect__
  - ### Features
    - 1. awsDeviceV2 field is introduced for Connection/Lag/Interconnect/VirtualInterface/Bgp Objects, while deprecating the awsDevice field for Connection/Lag/Interconnect Objects. 2. region field is introduced for VirtualInterface/Location objects 

## __AWS Glue__
  - ### Features
    - Glue Development Endpoints now support association of multiple SSH public keys with a development endpoint.

## __AWS IoT__
  - ### Features
    - get rid of documentParameters field from CreateJob API

## __Amazon Glacier__
  - ### Features
    - Documentation updates for glacier

## __Amazon SageMaker Service__
  - ### Features
    - Added SecondaryStatusTransitions to DescribeTrainingJob to provide more visibility into SageMaker training job progress and lifecycle.

## __AmazonMQ__
  - ### Features
    - Modified the CreateBroker, UpdateBroker, and DescribeBroker operations to support integration with Amazon CloudWatch Logs. Added a field to indicate the IP address(es) that correspond to wire-level endpoints of broker instances. While a single-instance broker has one IP address, an active/standby broker for high availability has 2 IP addresses. Added fields to indicate the time when resources were created. Updated documentation for Amazon MQ.

# __1.11.375__ __2018-07-26__
## __AWS CodeBuild__
  - ### Features
    - Add artifacts encryptionDisabled and build encryptionKey.

## __AWS Greengrass__
  - ### Features
    - Documentation updates for Greengrass Local Resource Access feature

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This change provides the EC2/Spot customers with two new allocation strategies -- LowestN for Spot instances, and OD priority for on-demand instances.

## __Amazon Inspector__
  - ### Features
    - inspector will return ServiceTemporarilyUnavailableException when service is under stress

## __Amazon Redshift__
  - ### Features
    - When we make a new version of Amazon Redshift available, we update your cluster during its maintenance window. By selecting a maintenance track, you control whether we update your cluster with the most recent approved release, or with the previous release. The two values for maintenance track are current and trailing. If you choose the current track, your cluster is updated with the latest approved release. If you choose the trailing track, your cluster is updated with the release that was approved previously.The new API operation for managing maintenance tracks for a cluster is DescribeClusterTracks. In addition, the following API operations have new MaintenanceTrackName parameters:  Cluster,  PendingModifiedValues,  ModifyCluster,  RestoreFromClusterSnapshot,  CreateCluster,  Snapshot

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to allow customers to attach labels to history parameter records and reference history parameter records via labels.  It also adds Parameter Store integration with AWS Secrets Manager to allow referencing and retrieving AWS Secrets Manager's secrets from Parameter Store.

# __1.11.374__ __2018-07-25__
## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for private registry authentication using AWS Secrets Manager. With private registry authentication, private Docker images can be used in a task definition.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - R5 is the successor to R4 in EC2's memory-optimized instance family. R5d is a variant of R5 that has local NVMe SSD. Z1d instances deliver both high compute and high memory. Z1d instances use custom Intel Xeon Scalable Processors running at up to 4.0 GHz, powered by sustained all-core Turbo Boost. They are available in 6 sizes, with up to 48 vCPUs, 384 GiB of memory, and 1.8 TB of local NVMe storage.

## __Elastic Load Balancing__
  - ### Features
    - We are introducing two new actions in Application Load Balancer. Redirects and Fixed Response. These features will allow you to improve user experience and security posture. By using redirect actions in your Application Load Balancer, you can improve the security of your user requests and by using fixed-response, you can enhance the customer experience by displaying branded error pages during application maintenance or outages.

# __1.11.373__ __2018-07-24__
## __Amazon DynamoDB__
  - ### Features
    - With this SDK update, APIs UpdateGlobalTableSettings and DescribeGlobalTableSettings now allow consistently configuring AutoScaling settings for a DynamoDB global table. Previously, they would only allow consistently setting IOPS. Now new APIs are being released, existing APIs are being extended.

# __1.11.372__ __2018-07-20__
## __AWS Config__
  - ### Features
    - Setting internal length limits on resourceId for APIs.  

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Update documentation for Amazon Data Lifecycle Manager.

# __1.11.371__ __2018-07-19__
## __AWS Elemental MediaPackage__
  - ### Features
    - Adds support for DASH OriginEnpoints with multiple media presentation description periods triggered by presence of SCTE-35 ad markers in Channel input streams.

# __1.11.370__ __2018-07-18__
## __AWS IoT Analytics__
  - ### Features
    - This change allows publishing of channel/datastore size as part of the describe-channel/describe-datastore APIs. We introduce an optional boolean parameter 'includeStatistics' in the Describe request. If the user sets this parameter to true, the describe response will return the resource size and timestamp at which the size was recorded. If the parameter is set to false, the size won't be computed or returned.

# __1.11.369__ __2018-07-17__
## __Amazon Comprehend__
  - ### Features
    - This release gives customers the ability to tokenize (find word boundaries) text and for each word provide a label for the part of speech, using the DetectSyntax operation. This API is useful to analyze text for specific conditions like for example finding nouns and the correlating adjectives to understand customer feedback. 

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snowball Edge announces the availability of Amazon EC2 compute instances that run on the device. AWS Snowball Edge is a 100-TB ruggedized device built to transfer data into and out of AWS with optional support for local Lambda-based compute functions. With this feature, developers and administrators can run their EC2-based applications on the device providing them with an end to end vertically integrated AWS experience. Designed for data pre-processing, compression, machine learning, and data collection applications, these new instances, called SBE1 instances, feature 1.8 GHz Intel Xeon D processors up to 16 vCPUs, and 32 GB of memory. The SBE1 instance type is available in four sizes and multiple instances can be run on the device at the same time. Customers can now run compute instances using the same Amazon Machine Images (AMIs) that are used in Amazon EC2.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new API for asynchronous synthesis to S3

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker has added the capability for customers to run fully-managed, high-throughput batch transform machine learning models with a simple API call. Batch Transform is ideal for high-throughput workloads and predictions in non-real-time scenarios where data is accumulated over a period of time for offline processing.

# __1.11.368__ __2018-07-13__
## __Amazon AppStream__
  - ### Features
    - This API update adds support for sharing AppStream images across AWS accounts within the same region.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Adds support for HLS video playback of Kinesis Video streams using the KinesisVideo client by including "GET_HLS_STREAMING_SESSION_URL" as an additional APIName parameter in the GetDataEndpoint input.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Adds support for HLS video playback of Kinesis Video streams by providing the GetHLSStreamingSessionURL function in the KinesisVideoArchivedMedia client.

# __1.11.367__ __2018-07-12__
## __AWS AppSync__
  - ### Features
    - This release adds support for configuring HTTP  endpoints as data sources for your AWS AppSync GraphQL API.

## __AWS CodeBuild__
  - ### Features
    - Update CodeBuild CreateProject API - serviceRole is a required input 

## __AWS Identity and Access Management__
  - ### Features
    - SDK release to support IAM delegated administrator feature. The feature lets customers attach permissions boundary to IAM principals. The IAM principals cannot operate exceeding the permission specified in permissions boundary.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Amazon Data Lifecycle Manager (DLM) for EBS Snapshots provides a simple, automated way to back up data stored on Amazon EBS volumes. You can define backup and retention schedules for EBS snapshots by creating lifecycle policies based on tags. With this feature, you no longer have to rely on custom scripts to create and manage your backups. This feature is now available in the US East (N. Virginia), US West (Oregon), and Europe (Ireland) AWS regions at no additional cost.

## __Amazon Elastic File System__
  - ### Features
    - Amazon EFS now allows you to instantly provision the throughput required for your applications independent of the amount of data stored in your file system, allowing you to optimize throughput for your applications performance needs. Starting today, you can provision the throughput your applications require quickly with a few simple steps using AWS Console, AWS CLI or AWS API to achieve consistent performance.

## __Amazon Elastic MapReduce__
  - ### Features
    - Documentation updates for EMR.

## __Amazon SNS__
  - ### Bugfixes
    - Fix `SnsMessageManager` to use proper certificate name for ZHY region

# __1.11.366__ __2018-07-11__
## __AWS Cost Explorer Service__
  - ### Features
    - Starting today, you can access custom Reserved Instance (RI) purchase recommendations for your Amazon Redshift, Amazon ElastiCache, and Amazon Elasticsearch reservations via AWS Cost Explorer API, in addition to accessing RI purchase recommendations for your Amazon EC2 and Amazon RDS reservations.

## __Amazon API Gateway__
  - ### Features
    - Support for fine grain throttling for API gateway. 

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Select support for BZIP2 compressed input files

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Support Conditional Branching OnFailure for SSM Automation

# __1.11.365__ __2018-07-10__
## __AWS CodeBuild__
  - ### Features
    - API changes to CodeBuild service, support report build status for Github sources

## __AWS Glue__
  - ### Features
    - AWS Glue adds the ability to crawl DynamoDB tables.

## __AWS OpsWorks__
  - ### Features
    - Documentation updates for AWS OpsWorks Stacks.

## __Amazon AppStream__
  - ### Features
    - This API update adds pagination to the DescribeImages API to support future features and enhancements.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support CpuOptions field in Launch Template data and allow Launch Template name to contain hyphen.

# __1.11.364__ __2018-07-09__
## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

# __1.11.363__ __2018-07-09__
## __AWS Cost Explorer Service__
  - ### Features
    - AWS Cost Explorer provides you with Reserved Instance (RI) purchase recommendations based on your total cross-account Amazon EC2 and Amazon RDS usage. Starting today, linked accounts can also access custom RI purchase recommendations for specific linked accounts directly via AWS Cost Explorer API.

## __AWS Database Migration Service__
  - ### Features
    - Added support for DmsTransfer endpoint type and support for re-validate option in table reload API.

## __AWS Lambda__
  - ### Features
    - Add support for .NET Core 2.1 to Lambda.

## __Amazon Transcribe Service__
  - ### Features
    - You can now specify an Amazon S3 output bucket to store the transcription of your audio file when you call the StartTranscriptionJob operation. 

## __Application Auto Scaling__
  - ### Features
    - The release adds support for custom resource auto scaling.

# __1.11.362__ __2018-07-06__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds support for the following 1) users can specify tags to be attached to queues, presets, and templates during creation of those resources on MediaConvert. 2) users can now view the count of jobs in submitted state and in progressing state on a per queue basis.

## __AWSServerlessApplicationRepository__
  - ### Features
    - Added required fields and documentation updates for AWS Serverless Application Repository.

# __1.11.361__ __2018-07-05__
## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint SDK adds the ability to create complex segments and validate phone numbers for SMS messages. It also adds the ability to get or delete endpoints based on user IDs, remove attributes from endpoints, and list the defined channels for an app.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker NotebookInstances supports 'Updating' as a NotebookInstanceStatus.  In addition, DescribeEndpointOutput now includes Docker repository digest of deployed Model images.

# __1.11.360__ __2018-07-03__
## __AWS Certificate Manager__
  - ### Features
    - Adds a "CertificateValidated" waiter to AWS Certificate Manager clients, which polls on a new certificate's validation state.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for customers to tag EC2 Dedicated Hosts

## __Amazon Redshift__
  - ### Features
    - Feature 1 - On-demand cluster release version - When Amazon Redshift releases a new cluster version, you can choose to upgrade to that version immediately instead of waiting until your next maintenance window. You can also choose to roll back to a previous version. The two new APIs added for managing cluster release version are - ModifyClusterDbRevision, DescribeClusterDbRevisions. Feature 2 - Upgradeable reserved instance - You can now exchange one Reserved Instance for a new Reserved Instance with no changes to the terms of your existing Reserved Instance (term, payment type, or number of nodes). The two new APIs added for managing these upgrades are - AcceptReservedNodeExchange, GetReservedNodeExchangeOfferings. 

# __1.11.359__ __2018-07-02__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Execution History and StartAssociationOnce release for State Manager. Users now have the ability to view association execution history with DescribeAssociationExecutions and DescribeAssociationExecutionTargets. Users can also execute an association by calling StartAssociationOnce.

# __1.11.358__ __2018-06-29__
## __AWS Secrets Manager__
  - ### Features
    - New SDK code snippet examples for the new APIs released for the Resource-based Policy support in Secrets Manager

# __1.11.357__ __2018-06-28__
## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk adds "Suspended" health status to the EnvironmentHealthStatus enum type and updates document.

## __AWS Lambda__
  - ### Features
    - Support for SQS as an event source.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now enables you to use Server Message Block (SMB) protocol  to store and access objects in Amazon Simple Storage Service (S3). 

# __1.11.356__ __2018-06-27__
## __AWS CodePipeline__
  - ### Features
    - UpdatePipeline may now throw a LimitExceededException when adding or updating Source Actions that use periodic checks for change detection

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon CloudFront__
  - ### Features
    - Unpublish delete-service-linked-role API.

## __Amazon Comprehend__
  - ### Features
    - This release gives customers the option to batch process a set of documents stored within an S3 bucket in addition to the existing synchronous nature of the current Comprehend API.

# __1.11.355__ __2018-06-26__
## __AWS Secrets Manager__
  - ### Features
    - This release adds support for resource-based policies that attach directly to your secrets. These policies provide an additional way to control who can access your secrets and what they can do with them. For more information, see https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html in the Secrets Manager User Guide.

## __Amazon Inspector__
  - ### Features
    - Introduce four new APIs to view and preview Exclusions.  Exclusions show which intended security checks are excluded from an assessment, along with reasons and recommendations to fix.  The APIs are CreateExclusionsPreview, GetExclusionsPreview, ListExclusions, and DescribeExclusions.

## __Amazon Simple Storage Service__
  - ### Features
    - Add AllowQuotedRecordDelimiter to Amazon S3 Select API. Please refer to https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectSELECTContent.html for usage details.

# __1.11.354__ __2018-06-22__
## __Alexa For Business__
  - ### Features
    -  Introduce DeviceNotRegisteredException for AWSMoneypenny

## __Amazon AppStream__
  - ### Features
    - This API update enables customers to find their VPC private IP address and ENI ID associated with AppStream streaming sessions.

# __1.11.353__ __2018-06-21__
## __Amazon CloudDirectory__
  - ### Features
    - SDK release to support Flexible Schema initiative being carried out by Amazon Cloud Directory. This feature lets customers using new capabilities like: variant typed attributes, dynamic facets and AWS managed Cloud Directory schemas.

## __Amazon Macie__
  - ### Features
    - Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect sensitive data in AWS. With this release, we are launching the following Macie HTTPS API operations: AssociateMemberAccount, AssociateS3Resources, DisassociateMemberAccount, DisassociateS3Resources, ListMemberAccounts, ListS3Resources, and UpdateS3Resources. With these API operations you can issue HTTPS requests directly to the service.

## __Amazon Neptune__
  - ### Features
    - Deprecates the PubliclyAccessible parameter that is not supported by Amazon Neptune.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds Amazon Linux 2 support to Patch Manager

# __1.11.352__ __2018-06-21__
## __Amazon Macie__
  - ### Features
    - Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect sensitive data in AWS. With this release, we are launching the following Macie HTTPS API operations: AssociateMemberAccount, AssociateS3Resources, DisassociateMemberAccount, DisassociateS3Resources, ListMemberAccounts, ListS3Resources, and UpdateS3Resources. With these API operations you can issue HTTPS requests directly to the service.

## __Amazon Neptune__
  - ### Features
    - Deprecates the PubliclyAccessible parameter that is not supported by Amazon Neptune.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds Amazon Linux 2 support to Patch Manager

# __1.11.351__ __2018-06-20__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - CA Restore is a new feature within AWS Certificate Manager Private Certificate Authority (ACM PCA) that allows you to restore a private certificate authority that has been deleted. When you issue the DeleteCertificateAuthority call, you can now specify the number of days (7-30, with 30 being the default) in which the private certificate authority will remain in the DELETED state. During this time, the private certificate authority can be restored with the RestoreCertificateAuthority API call and then be returned to the PENDING_CERTIFICATE or DISABLED state, depending upon the state prior to deletion.  Summary of API Changes: 1). Added RestoreCertificateAuthority API call; 2). Added optional PermanentDeletionTimeInDays parameter to DeleteCertificateAuthority API call. If this parameter is not specified, the DeleteCertificateAuthority API call will use a 30 day restore period as default.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now makes Reserved Outputs and Inputs available through the AWS Management Console and API. You can reserve outputs and inputs with a 12 month commitment in exchange for discounted hourly rates. Pricing is available at https://aws.amazon.com/medialive/pricing/

## __Amazon Relational Database Service__
  - ### Features
    - This release adds a new parameter to specify the retention period for Performance Insights data for RDS instances. You can either choose 7 days (default) or 731 days. For more information, see Amazon RDS Documentation.

# __1.11.350__ __2018-06-19__
## __Amazon Rekognition__
  - ### Features
    - Documentation updates for rekognition

# __1.11.349__ __2018-06-15__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds language code support according to the ISO-639-3 standard. Custom 3-character language codes are now supported on input and output for both audio and captions.

# __1.11.348__ __2018-06-14__
## __AWS IoT Analytics__
  - ### Features
    - With this release, AWS IoT Analytics allows you to tag resources. Tags are metadata that you can create and use to manage your IoT Analytics resources. For more information about tagging, see AWS Tagging Strategies. For technical documentation, look for the tagging operations in the AWS IoT Analytics API reference or User Guide.

## __Amazon API Gateway__
  - ### Features
    - Support for PRIVATE endpoint configuration type

## __Amazon DynamoDB__
  - ### Features
    - Added two new fields SSEType and KMSMasterKeyArn to SSEDescription block in describe-table output.

# __1.11.347__ __2018-06-13__
## __AWS Service Catalog__
  - ### Features
    - Introduced new length limitations for few of the product fields.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added support for new parameter, CloudWatchOutputConfig, for SendCommand API. Users can now have RunCommand output sent to CloudWatchLogs.

# __1.11.346__ __2018-06-12__
## __AWS Device Farm__
  - ### Features
    - Adding VPCEndpoint support for Remote access. Allows customers to be able to access their private endpoints/services running in their VPC during remote access.

## __AWS Security Token Service__
  - ### Bugfixes
    - Removed client side validation for session duration in STSAssumeRoleSessionCredentialsProvider. Please note that the limits still apply and you will get a runtime exception if the specified value in out of valid range.

## __Amazon EC2 Container Service__
  - ### Features
    - Introduces daemon scheduling capability to deploy one task per instance on selected instances in a cluster.  Adds a "force" flag to the DeleteService API to delete a service without requiring to scale down the number of tasks to zero.

## __Amazon SNS__
  - ### Bugfixes
    - Fix SnsMessageManager class to use proper certificate names for AWS China and AWS GovCloud regions.

# __1.11.345__ __2018-06-11__
## __AWS Storage Gateway__
  - ### Features
    -  AWS Storage Gateway now enables you to create cached volumes and tapes with AWS KMS support.

## __Amazon CloudDirectory__
  - ### Features
    - Amazon Cloud Directory now supports optional attributes on Typed Links, giving users the ability to associate and manage data on Typed Links. 

## __Amazon Relational Database Service__
  - ### Features
    - Changed lists of valid EngineVersion values to links to the RDS User Guide.

# __1.11.344__ __2018-06-08__
## __AWS MediaTailor__
  - ### Features
    - Fixes a bug in the request URIs for MediaTailor PlaybackConfiguration operations.

# __1.11.343__ __2018-06-07__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now makes channel log information available through Amazon CloudWatch Logs. You can set up each MediaLive channel with a logging level; when the channel is run, logs will automatically be published to your account on Amazon CloudWatch Logs

# __1.11.342__ __2018-06-05__
## __AWS Cost Explorer Service__
  - ### Features
    - Cost Explorer API is providing programmatic access to RI saving metrics to enable customers to optimize their reservations.

## __AWS SDK for Java__
  - ### Features
    - Caching `XPathFactory` to improve performance of exception handling for services using XML protocol

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __AWS Shield__
  - ### Features
    - DDoS Response Team access management for AWS Shield

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new French voice - "Lea"

## __Amazon Relational Database Service__
  - ### Features
    - This release adds customizable processor features for RDS instances.

# __1.11.341__ __2018-06-04__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds the support for Common Media Application Format (CMAF) fragmented outputs, RF64 WAV audio output format, and HEV1 or HEVC1 MP4 packaging types when using HEVC in DASH or CMAF outputs.

## __AWS Migration Hub__
  - ### Features
    - Documentation updates for AWS Migration Hub

## __Amazon AppStream__
  - ### Features
    - Amazon AppStream 2.0 adds support for Google Drive for G Suite. With this feature, customers will be able to connect their G Suite accounts with AppStream 2.0 and enable Google Drive access for an AppStream 2.0 stack. Users of the stack can then link their Google Drive using their G Suite login credentials and use their existing files stored in Drive with their AppStream 2.0 applications. File changes will be synced automatically to Google cloud. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You are now able to use instance storage (up to 3600 GB of NVMe based SSD) on M5 instances, the next generation of EC2's General Purpose instances in us-east-1, us-west-2, us-east-2, eu-west-1 and ca-central-1. M5 instances offer up to 96 vCPUs, 384 GiB of DDR4 instance memory, 25 Gbps in Network bandwidth and improved EBS and Networking bandwidth on smaller instance sizes and provide a balance of compute, memory and network resources for many applications.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Amazon Elastic Container Service for Kubernetes (Amazon EKS) is a fully managed service that makes it easy to deploy, manage, and scale containerized applications using Kubernetes on AWS. Amazon EKS runs the Kubernetes control plane for you across multiple AWS availability zones to eliminate a single point of failure. Amazon EKS is certified Kubernetes conformant so you can use existing tooling and plugins from partners and the Kubernetes community. Applications running on any standard Kubernetes environment are fully compatible and can be easily migrated to Amazon EKS. 

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker has added the ability to run hyperparameter tuning jobs. A hyperparameter tuning job will create and evaluate multiple training jobs while tuning algorithm hyperparameters, to optimize a customer specified objective metric.

# __1.11.340__ __2018-06-01__
## __AWS Directory Service__
  - ### Features
    - Added ResetUserPassword API. Customers can now reset their users' passwords without providing the old passwords in Simple AD and Microsoft AD.

## __AWS IoT__
  - ### Features
    - We are releasing force CancelJob and CancelJobExecution functionalities to customers.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor is a personalization and monetization service that allows scalable server-side ad insertion. The service enables you to serve targeted ads to viewers while maintaining broadcast quality in over-the-top (OTT) video applications. This SDK allows user access to the AWS Elemental MediaTailor configuration interface.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

## __Amazon Simple Notification Service__
  - ### Features
    - The SNS Subscribe API has been updated with two new optional parameters: Attributes and ReturnSubscriptionArn. Attributes is a map of subscription attributes which can be one or more of: FilterPolicy, DeliveryPolicy, and RawMessageDelivery. ReturnSubscriptionArn is a boolean parameter that overrides the default behavior of returning "pending confirmation" for subscriptions that require confirmation instead of returning the subscription ARN.

# __1.11.339__ __2018-05-30__
## __Amazon Neptune__
  - ### Features
    - Amazon Neptune is a fast, reliable graph database service that makes it easy to build and run applications that work with highly connected datasets. Neptune supports popular graph models Property Graph and W3C's Resource Description Frame (RDF), and their respective query languages Apache TinkerPop Gremlin 3.3.2 and SPARQL 1.1. 

## __Amazon Route53__
  - ### Bugfixes
    - Reverting a breaking change in ListHostedZonesByNameResult behavior introduced in version 1.11.321. See https://github.com/aws/aws-sdk-java/pull/1555 for more details.

## __Elastic Load Balancing__
  - ### Features
    - This release of Elastic Load Balancing introduces user authentication on Application Load Balancer.

# __1.11.338__ __2018-05-29__
## __AWS Performance Insights__
  - ### Features
    - Performance Insights is a feature of Amazon Relational Database Service (RDS) that helps you quickly assess the load on your database, and determine when and where to take action. You can use the SDK to retrieve Performance Insights data and integrate your monitoring solutions.

# __1.11.337__ __2018-05-25__
## __AWS Config__
  - ### Features
    - AWS Config adds support for retention period, allowing you to specify a retention period for your AWS Config configuration items.

## __AWS Glue__
  - ### Features
    - AWS Glue now sends a delay notification to Amazon CloudWatch Events when an ETL job runs longer than the specified delay notification threshold.

## __AWS IoT__
  - ### Features
    - We are exposing DELETION_IN_PROGRESS as a new job status in regards to the release of DeleteJob API.

## __Amazon AppStream__
  - ### Features
    - This API update enables customers to control whether users can transfer data between their local devices and their streaming applications through file uploads and downloads, clipboard operations, or printing to local devices

# __1.11.336__ __2018-05-24__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild Adds Support for Windows Builds.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon Relational Database Service__
  - ### Features
    - This release adds CloudWatch Logs integration capabilities to RDS Aurora MySQL clusters

## __Elastic Load Balancing__
  - ### Features
    - Updated elasticloadbalancingV2 documentation with slow start mode details.  The slow start mode can be used to gradually increase the number of requests forwarded by a load balancer to a newly added target in a target group. It provides a new target an opportunity to warm up before it can handle its fair share of requests received from the load balancer. Slow start mode is disabled by default and can be enabled on a per target group basis.

# __1.11.335__ __2018-05-22__
## __AWS SDK for Java__
  - ### Features
    - The default [`Socket`](https://docs.oracle.com/javase/6/docs/api/java/net/Socket.html) implementation tries to resolve an appropriate proxy via the configured [`ProxySelector`](https://docs.oracle.com/javase/6/docs/api/java/net/ProxySelector.html) when connecting to a remote host if it was not constructed with an explicit [`Proxy`](https://docs.oracle.com/javase/6/docs/api/java/net/Proxy.html). For example, if the system properties `socksProxyHost` and `socksProxyPort` are defined, then the default `ProxySelector` will return that as the proxy to use for the socket. This feature introduces a new setting, `ClientConfiguration#disableSocketProxy(boolean)`, to prevent the socket from resolving a proxy. This is useful for example, when the SOCKS proxy properties must be defined for other components, but the the client should not connect to it.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (ECS) adds service discovery for services that use host or bridged network mode. ECS can now also register instance IPs for active tasks using bridged and host networking with Route 53, making them available via DNS.

## __Amazon Inspector__
  - ### Features
    - We are launching the ability to target all EC2 instances. With this launch, resourceGroupArn is now optional for CreateAssessmentTarget and UpdateAssessmentTarget. If resourceGroupArn is not specified, all EC2 instances in the account in the AWS region are included in the assessment target.

# __1.11.334__ __2018-05-21__
## __AWS CloudFormation__
  - ### Features
    - 1) Filtered Update for StackSet based on Accounts and Regions: This feature will allow flexibility for the customers to roll out updates on a StackSet based on specific Accounts and Regions.   2) Support for customized ExecutionRoleName: This feature will allow customers to attach ExecutionRoleName to the StackSet thus ensuring more security and controlling the behavior of any AWS resources in the target accounts.

# __1.11.333__ __2018-05-18__
## __AWS IoT__
  - ### Features
    - We are releasing DeleteJob and DeleteJobExecution APIs to allow customer to delete resources created using AWS IoT Jobs.

## __Amazon Simple Email Service__
  - ### Features
    - Fixed a broken link in the documentation for S3Action.

# __1.11.332__ __2018-05-17__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito User Pools now supports federation for users to sign up and sign in with any identity provider following the OpenID Connect standard. Amazon Cognito User Pools now returns the User Pool's Amazon Resource Name (ARN) from the CreateUserPool, UpdateUserPool, and DescribeUserPool APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You are now able to use instance storage (up to 1800 GB of NVMe based SSD) on C5 instances, the next generation of EC2's compute optimized instances in us-east-1, us-west-2, us-east-2, eu-west-1 and ca-central-1. C5 instances offer up to 72 vCPUs, 144 GiB of DDR4 instance memory, 25 Gbps in Network bandwidth and improved EBS and Networking bandwidth on smaller instance sizes to deliver improved performance for compute-intensive workloads.You can now run bare metal workloads on EC2 with i3.metal instances. As a new instance size belonging to the I3 instance family, i3.metal instances have the same characteristics as other instances in the family, including NVMe SSD-backed instance storage optimized for low latency, very high random I/O performance, and high sequential read throughput. I3.metal instances are powered by 2.3 GHz Intel Xeon processors, offering 36 hyper-threaded cores (72 logical processors), 512 GiB of memory, and 15.2 TB of NVMe SSD-backed instance storage. These instances deliver high networking throughput and lower latency with up to 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking.

# __1.11.331__ __2018-05-16__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __AWS Service Catalog__
  - ### Features
    - Users can now pass a new option to ListAcceptedPortfolioShares called portfolio-share-type with a value of AWS_SERVICECATALOG in order to access Getting Started Portfolios that contain selected products representing common customer use cases.

# __1.11.330__ __2018-05-15__
## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for XRay resource

# __1.11.329__ __2018-05-14__
## __AWS CodeBuild__
  - ### Features
    - Adding support for more override fields for StartBuild API, add support for idempotency token field  for StartBuild API in AWS CodeBuild.

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - AWS IoT 1-Click makes it easy for customers to incorporate simple ready-to-use IoT devices into their workflows. These devices can trigger AWS Lambda functions that implement business logic. In order to build applications using AWS IoT 1-Click devices, programmers can use the AWS IoT 1-Click Devices API and the AWS IoT 1-Click Projects API. Learn more at https://aws.amazon.com/documentation/iot-1-click/

## __AWS IoT 1-Click Projects Service__
  - ### Features
    - AWS IoT 1-Click makes it easy for customers to incorporate simple ready-to-use IoT devices into their workflows. These devices can trigger AWS Lambda functions that implement business logic. In order to build applications using AWS IoT 1-Click devices, programmers can use the AWS IoT 1-Click Devices API and the AWS IoT 1-Click Projects API. Learn more at https://aws.amazon.com/documentation/iot-1-click/.

## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

# __1.11.328__ __2018-05-10__
## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, Amazon Kinesis Data Firehose can convert the format of your input data from JSON to Apache Parquet or Apache ORC before storing the data in Amazon S3. Parquet and ORC are columnar data formats that save space and enable faster queries compared to row-oriented formats like JSON.

# __1.11.327__ __2018-05-10__
## __Amazon GameLift__
  - ### Features
    - AutoScaling Target Tracking scaling simplification along with StartFleetActions and StopFleetActions APIs to suspend and resume automatic scaling at will.

# __1.11.326__ __2018-05-09__
## __AWS Budgets__
  - ### Features
    - Updating the regex for the NumericValue fields.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Enable support for latest flag with Get Console Output

## __Amazon Relational Database Service__
  - ### Features
    - Changes to support the Aurora MySQL Backtrack feature.

# __1.11.325__ __2018-05-08__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Enable support for specifying CPU options during instance launch.

## __Amazon Relational Database Service__
  - ### Features
    - Correction to the documentation about copying unencrypted snapshots.

# __1.11.324__ __2018-05-07__
## __AWS Budgets__
  - ### Features
    - "With this release, customers can use AWS Budgets to monitor how much of their Amazon EC2, Amazon RDS, Amazon Redshift, and Amazon ElastiCache instance usage is covered by reservations, and receive alerts when their coverage falls below the threshold they define."

## __Alexa For Business__
  - ### Features
    - This release adds the new Device status "DEREGISTERED". This release also adds DEVICE_STATUS as the new DeviceEventType.

## __Amazon Elasticsearch Service__
  - ### Features
    - This change brings support for Reserved Instances to AWS Elasticsearch.

# __1.11.323__ __2018-05-04__
## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty is adding five new API operations for creating and managing filters. For each filter, you can specify a criteria and an action. The action you specify is applied to findings that match the specified criteria.

# __1.11.322__ __2018-05-04__
## __AWS AppSync__
  - ### Features
    - This release adds support for authorizing your AWS AppSync endpoint with an OpenID Connect compliant service and also to configure your AWS AppSync endpoint to log requests to Amazon CloudWatch Logs.

## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for Lambda, ElasticBeanstalk, WAF and ElasticLoadBalancing resources

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

# __1.11.321__ __2018-05-02__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __AWS CodePipeline__
  - ### Features
    - Added support for webhooks with accompanying definitions as needed in the AWS CodePipeline API Guide.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 Fleet is a new feature that simplifies the provisioning of Amazon EC2 capacity across different EC2 instance types, Availability Zones, and the On-Demand, Reserved Instance, and Spot Instance purchase models. With a single API call, you can now provision capacity to achieve desired scale, performance, and cost.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added support for new parameter, DocumentVersion, for SendCommand API. Users can now specify version of SSM document to be executed on the target(s).

# __1.11.320__ __2018-04-30__
## __Alexa For Business__
  - ### Features
    - Adds ListDeviceEvents API to get a paginated list of device events (such as ConnectionStatus). This release also adds ConnectionStatus field to GetDevice and SearchDevices API.

## __Amazon DynamoDB__
  - ### Features
    - Adds two new APIs UpdateGlobalTableSettings and DescribeGlobalTableSettings. This update introduces new constraints in the CreateGlobalTable and UpdateGlobalTable APIs . Tables must have the same write capacity units. If Global Secondary Indexes exist then they must have the same write capacity units and key schema.

## __Amazon GuardDuty__
  - ### Features
    - You can disable the email notification when inviting GuardDuty members using the disableEmailNotification parameter in the InviteMembers operation.

## __Amazon Route 53 Domains__
  - ### Features
    - This release adds a SubmittedSince attribute to the ListOperations API, so you can list operations that were submitted after a specified date and time.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker has added support for VPC configuration for both Endpoints and Training Jobs. This allows you to connect from the instances running the Endpoint or Training Job to your VPC and any resources reachable in the VPC rather than being restricted to resources that were internet accessible.

## __Amazon WorkSpaces__
  - ### Features
    - Added new IP Access Control APIs, an API to change the state of a Workspace, and the ADMIN_MAINTENANCE WorkSpace state. With the new IP Access Control APIs, you can now create/delete IP Access Control Groups, add/delete/update rules for IP Access Control Groups, Associate/Disassociate IP Access Control Groups to/from a WorkSpaces Directory, and Describe IP Based Access Control Groups.

# __1.11.319__ __2018-04-26__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon Glacier__
  - ### Features
    - Documentation updates for Glacier to fix a broken link

# __1.11.318__ __2018-04-25__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy has a new exception that indicates when a GitHub token is not valid.

## __AWS X-Ray__
  - ### Features
    - Added PutEncryptionConfig and GetEncryptionConfig APIs for managing data encryption settings. Use PutEncryptionConfig to configure X-Ray to use an AWS Key Management Service customer master key to encrypt trace data at rest.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition.

# __1.11.317__ __2018-04-24__
## __AWS Elastic Beanstalk__
  - ### Features
    - Support tracking Elastic Beanstalk resources in AWS Config.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

# __1.11.316__ __2018-04-23__
## __AWS Auto Scaling Plans__
  - ### Features
    - The release adds the operation UpdateScalingPlan for updating a scaling plan and the support for tag filters as an application source.

## __AWS IoT__
  - ### Features
    - Add IotAnalyticsAction which sends message data to an AWS IoT Analytics channel

## __AWS IoT Analytics__
  - ### Features
    - Introducing AWS IoT Analytics SDK. AWS IoT Analytics provides advanced data analysis for AWS IoT. It allows you to collect large amounts of device data, process messages, store them, and then query the data and run sophisticated analytics to make accurate decisions in your IoT applications and machine learning use cases. AWS IoT Analytics enables advanced data exploration through integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.

# __1.11.315__ __2018-04-20__
## __AWS Elemental MediaLive__
  - ### Features
    - With AWS Elemental MediaLive you can now output live channels as RTMP (Real-Time Messaging Protocol) and RTMPS as the encrypted version of the protocol (Secure, over SSL/TLS). RTMP is the preferred protocol for sending live streams to popular social platforms which  means you can send live channel content to social and sharing platforms in a secure and reliable way while continuing to stream to your own website, app or network.

## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, Amazon Kinesis Data Firehose allows you to tag your delivery streams. Tags are metadata that you can create and use to manage your delivery streams. For more information about tagging, see AWS Tagging Strategies. For technical documentation, look for the tagging operations in the Amazon Kinesis Firehose API reference.

# __1.11.314__ __2018-04-19__
## __AWS CodePipeline__
  - ### Features
    - Added new SourceRevision structure to Execution Summary with accompanying definitions as needed in the AWS CodePipeline API Guide.

## __AWS Cost Explorer Service__
  - ### Features
    - Starting today, you can identify opportunities for Amazon RDS cost savings using AWS Cost Explorer's API to access your Amazon RDS Reserved Instance Purchase Recommendations

## __AWS Device Farm__
  - ### Features
    - Adding support for VPCEndpoint feature. Allows customers to be able to access their private endpoints/services running in their VPC during test automation.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for customers to see the time at which a Dedicated Host was allocated or released.

## __Amazon Relational Database Service__
  - ### Features
    - The ModifyDBCluster operation now includes an EngineVersion parameter. You can use this to upgrade the engine for a clustered database.

## __Amazon S3__
  - ### Bugfixes
    - Updated SelectRecordsInputStream for the new S3 select feature to not read to the end of the stream when it is closed.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added new APIs DeleteInventory and DescribeInventoryDeletions, for customers to delete their custom inventory data.

# __1.11.313__ __2018-04-10__
## __AWS Database Migration Service__
  - ### Features
    - Native Change Data Capture start point and task recovery support in Database Migration Service.  

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds a new OriginEndpoint package type CmafPackage in MediaPackage. Origin endpoints can now be configured to use the Common Media Application Format (CMAF) media streaming format. This version of CmafPackage only supports HTTP Live Streaming (HLS) manifests with fragmented MP4.

## __AWS Glue__
  - ### Features
    - "AWS Glue now supports timeout values for ETL jobs. With this release, all new ETL jobs have a default timeout value of 48 hours. AWS Glue also now supports the ability to start a schedule or job events trigger when it is created."

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added TooManyUpdates exception for AddTagsToResource and RemoveTagsFromResource API

## __Amazon WorkMail__
  - ### Features
    - Amazon WorkMail adds the ability to grant users and groups with "Full Access", "Send As" and "Send on Behalf" permissions on a given mailbox.

# __1.11.312__ __2018-04-09__
## __Amazon CloudDirectory__
  - ### Features
    - Cloud Directory customers can fetch attributes within a facet on an object with the new GetObjectAttributes API and can fetch attributes from multiple facets or objects with the BatchGetObjectAttributes operation.

# __1.11.311__ __2018-04-06__
## __AWS Batch__
  - ### Features
    - Support for Timeout in SubmitJob and RegisterJobDefinition

# __1.11.310__ __2018-04-05__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for ec2

# __1.11.309__ __2018-04-04__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager has added support for AWS Certificate Manager Private Certificate Authority (CA). Customers can now request private certificates with the RequestCertificate API, and also export private certificates with the ExportCertificate API.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Certificate Manager (ACM) Private Certificate Authority (CA) is a managed private CA service that helps you easily and securely manage the lifecycle of your private certificates. ACM Private CA provides you a highly-available private CA service without the upfront investment and ongoing maintenance costs of operating your own private CA. ACM Private CA extends ACM's certificate management capabilities to private certificates, enabling you to manage public and private certificates centrally.

## __AWS Config__
  - ### Features
    - AWS Config introduces multi-account multi-region data aggregation features. Customers can create an aggregator (a new resource type) in AWS Config that collects AWS Config data from multiple source accounts and regions into an aggregator account. Customers can aggregate data from individual account(s) or an organization and multiple regions. In this release, AWS Config adds several API's for multi-account multi-region data aggregation.

## __AWS Secrets Manager__
  - ### Features
    - AWS Secrets Manager enables you to easily create and manage the secrets that you use in your customer-facing apps.  Instead of embedding credentials into your source code, you can dynamically query Secrets Manager from your app whenever you need credentials.  You can automatically and frequently rotate your secrets without having to deploy updates to your apps.  All secret values are encrypted when they're at rest with AWS KMS, and while they're in transit with HTTPS and TLS.

## __Amazon CloudWatch__
  - ### Features
    - The new GetMetricData API enables you to collect batch amounts of metric data and optionally perform math expressions on the data. With one GetMetricData call you can retrieve as many as 100 different metrics and a total of 100,800 data points.

## __Amazon S3__
  - ### Features
    - Amazon S3 Select is an Amazon S3 feature that makes it easy to retrieve specific data from the contents of an object using simple SQL expressions without having to retrieve the entire object. With this release of the Amazon S3 SDK, S3 Select API (SelectObjectContent) is now generally available in all public regions. This release supports retrieval of a subset of data using SQL clauses, like SELECT and WHERE, from delimited text files and JSON objects in Amazon S3 through the SelectObjectContent API available in AWS S3 SDK.
    - ONEZONE_IA storage class stores object data in only one Availability Zone at a lower price than STANDARD_IA. This SDK release provides API support for this new storage class.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker is now supporting many additional instance types in previously supported families for Notebooks, Training Jobs, and Endpoints. Training Jobs and Endpoints now support instances in the m5 family in addition to the previously supported instance families. For specific instance types supported please see the documentation for the SageMaker API.

## __Amazon Simple Storage Service__
  - ### Features
    - ONEZONE_IA storage class stores object data in only one Availability Zone at a lower price than STANDARD_IA. This SDK release provides API support for this new storage class.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe is an automatic speech recognition (ASR) service that makes it easy for developers to add speech to text capability to their applications. 

## __Firewall Management Service__
  - ### Features
    - This release is the initial release version for AWS Firewall Manager, a new AWS service that makes it easy for customers to centrally configure WAF rules across all their resources (ALBs and CloudFront distributions) and across accounts.

# __1.11.308__ __2018-04-03__
## __AWS Device Farm__
  - ### Features
    - Added Private Device Management feature. Customers can now manage their private devices efficiently - view their status, set labels and apply profiles on them. Customers can also schedule automated tests and remote access sessions on individual instances in their private device fleet.

## __AWS Lambda__
  - ### Features
    - added nodejs8.10 as a valid runtime

## __Amazon Translate__
  - ### Features
    - This release increases the maximum size of input text to 5,000 bytes. Amazon Translate now supports automatic language detection of the input text. The translation models have been improved to increase accuracy. See the documentation for more information.

# __1.11.307__ __2018-04-02__
## __Amazon API Gateway__
  - ### Features
    - Amazon API Gateway now supports resource policies for APIs making it easier to set access controls for invoking APIs.

## __Amazon CloudFront__
  - ### Features
    - You can now use a new Amazon CloudFront capability called Field-Level Encryption to further enhance the security of sensitive data, such as credit card numbers or personally identifiable information (PII) like social security numbers. CloudFront's field-level encryption further encrypts sensitive data in an HTTPS form using field-specific encryption keys (which you supply) before a POST request is forwarded to your origin. This ensures that sensitive data can only be decrypted and viewed by certain components or services in your application stack. Field-level encryption is easy to setup. Simply configure the fields that have to be further encrypted by CloudFront using the public keys you specify and you can reduce attack surface for your sensitive data.

## __Amazon Elasticsearch Service__
  - ### Features
    - This adds Amazon Cognito authentication support to Kibana.

# __1.11.306__ __2018-03-30__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect is a contact center as a service (CCaS) solution that offers easy, self-service configuration and enables dynamic, personal, and natural customer engagement at any scale. With this release of the Amazon Connect SDK, Outbound APIs (StartOutboundVoiceContact, StopContact) are now generally available. This release supports CTR generation for calls generated through the new APIs. Additionally IAM permissions are supported for the new APIs. 

# __1.11.305__ __2018-03-29__
## __AWS CloudFormation__
  - ### Features
    - Enabling resource level permission control for StackSets APIs. Adding support for customers to use customized AdministrationRole to create security boundaries between different users.

## __AWS Greengrass__
  - ### Features
    - Greengrass APIs now support creating Machine Learning resource types and configuring binary data as the input payload for Greengrass Lambda functions.

## __Alexa For Business__
  - ### Features
    - Adds operations for creating and managing address books of phone contacts for use in A4B managed shared devices.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating patch baselines for CentOS.

# __1.11.304__ __2018-03-28__
## __AWS Identity and Access Management__
  - ### Features
    - Add support for Longer Role Sessions. Four APIs manage max session duration: GetRole, ListRoles, CreateRole, and the new API UpdateRole. The max session duration integer attribute is measured in seconds.

## __AWS Security Token Service__
  - ### Features
    - Change utilizes the Max Session Duration attribute introduced for IAM Roles and allows STS customers to request session duration up to the Max Session Duration of 12 hours from AssumeRole based APIs.

## __Amazon Mechanical Turk__
  - ### Features
    - Added a new attribute "ActionsGuarded" to QualificationRequirement: This update allows MTurk Requester customers using the AWS SDK to control which Workers can see and preview their HITs. We now support hiding HITs from unqualified Workers' search results.

# __1.11.303__ __2018-03-27__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager has added support for customers to disable Certificate Transparency logging on a per-certificate basis.

# __1.11.302__ __2018-03-26__
## __Amazon DynamoDB__
  - ### Features
    - Point-in-time recovery (PITR) provides continuous backups of your DynamoDB table data. With PITR, you do not have to worry about creating, maintaining, or scheduling backups. You enable PITR on your table and your backup is available for restore at any point in time from the moment you enable it, up to a maximum of the 35 preceding days. PITR provides continuous backups until you explicitly disable it. For more information, see the Amazon DynamoDB Developer Guide.

# __1.11.301__ __2018-03-23__
## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS

# __1.11.300__ __2018-03-22__
## __AWS CodeBuild__
  - ### Features
    - Adding support for branch filtering when using webhooks with AWS CodeBuild. 

## __Amazon AppStream__
  - ### Features
    - Feedback URL allows admins to provide a feedback link or a survey link for collecting user feedback while streaming sessions. When a feedback link is provided, streaming users will see a "Send Feedback" choice in their streaming session toolbar. On selecting this choice, user will be redirected to the link provided in a new browser tab. If a feedback link is not provided, users will not see the "Send Feedback" option. 

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (ECS) now includes integrated Service Discovery using Route 53 Auto Naming. Customers can now specify a Route 53 Auto Naming service as part of an ECS service. ECS will register task IPs with Route 53, making them available via DNS in your VPC.

# __1.11.299__ __2018-03-21__
## __AWSServerlessApplicationRepository__
  - ### Features
    - Documentation updates for Serverless Application Respository

# __1.11.298__ __2018-03-20__
## __AWS Config__
  - ### Features
    - AWS Config adds support for BatchGetResourceConfig API, allowing you to batch-retrieve the current state of one or more of your resources.

## __AWS Cost Explorer Service__
  - ### Features
    - This launch will allow customers to access their Amazon EC2 Reserved Instance (RI) purchase recommendations programmatically via the AWS Cost Explorer API. 

## __AWS Elastic Beanstalk__
  - ### Features
    - Documentation updates for the new Elastic Beanstalk API DescribeAccountAttributes.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive has added support for updating Inputs and Input Security Groups. You can update Input Security Groups at any time and it will update all channels using that Input Security Group. Inputs can be updated as long as they are not attached to a currently running channel.

## __AWS Glue__
  - ### Features
    - API Updates for DevEndpoint: PublicKey is now optional for CreateDevEndpoint. The new DevEndpoint field PrivateAddress will be populated for DevEndpoints associated with a VPC.

## __AWS SDK for Java__
  - ### Features
    - Add support for defining and serializing NotResource elements in IAM policies.
    - Update latency logging level in metric collection to debug level. [#1514](https://github.com/aws/aws-sdk-java/issues/1514)

## __Amazon CloudWatch Events__
  - ### Features
    - Added SQS FIFO queue target support

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now mount a temporary volume in memory in containers and specify the shared memory that a container can use through the use of docker's 'tmpfs' and 'shm-size' features respectively. These fields can be specified under linuxParameters in ContainerDefinition in the Task Definition Template.

# __1.11.297__ __2018-03-16__
## __AWS Elastic Beanstalk__
  - ### Features
    - AWS Elastic Beanstalk is launching a new public API named DescribeAccountAttributes which allows customers to access account level attributes. In this release, the API will support quotas for resources such as applications, application versions, and environments.

# __1.11.296__ __2018-03-15__
## __AWS Organizations__
  - ### Features
    - This release adds additional reason codes to improve clarity to exceptions that can occur.

## __Amazon Pinpoint__
  - ### Features
    - With this release, you can delete endpoints from your Amazon Pinpoint projects. Customers can now specify one of their leased dedicated long or short codes to send text messages.

## __Amazon SageMaker Service__
  - ### Features
    - This release provides support for ml.p3.xlarge instance types for notebook instances.  Lifecycle configuration is now available to customize your notebook instances on start; the configuration can be reused between multiple notebooks.  If a notebook instance is attached to a VPC you can now opt out of internet access that by default is provided by SageMaker.

# __1.11.295__ __2018-03-14__
## __Amazon Lightsail__
  - ### Features
    - Updates to existing Lightsail documentation

# __1.11.294__ __2018-03-13__
## __Amazon Route 53 Auto Naming__
  - ### Features
    - This release adds support for custom health checks, which let you check the health of resources that aren't accessible over the internet. For example, you can use a custom health check when the instance is in an Amazon VPC.

# __1.11.293__ __2018-03-12__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for discovery

## __AWS CloudHSM V2__
  - ### Features
    - CreateCluster can now take both 8 and 17 character Subnet IDs. DeleteHsm can now take both 8 and 17 character ENI IDs.

## __AWS IoT__
  - ### Features
    - We added new fields to the response of the following APIs. (1) describe-certificate: added new generationId, customerVersion fields (2) describe-ca-certificate: added new generationId, customerVersion and lastModifiedDate fields (3) get-policy: added generationId, creationDate and lastModifiedDate fields

## __Amazon Redshift__
  - ### Features
    - DescribeClusterSnapshotsMessage with ClusterExists flag returns snapshots of existing clusters. Else both existing and deleted cluster snapshots are returned

# __1.11.292__ __2018-03-08__
## __AWS Migration Hub__
  - ### Features
    - Unused key LABEL removed from ResourceAttrbute

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (ECS) now supports container health checks. Customers can now specify a docker container health check command and parameters in their task definition. ECS will monitor, report and take scheduling action based on the health status.

## __Amazon Pinpoint__
  - ### Features
    - With this release, you can export endpoints from your Amazon Pinpoint projects. You can export a) all of the endpoints assigned to a project or b) the subset of endpoints assigned to a segment.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS

# __1.11.291__ __2018-03-07__
## __AWS Elemental MediaLive__
  - ### Features
    - Updates API to model required traits and minimum/maximum constraints.

# __1.11.290__ __2018-03-06__
## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS

# __1.11.289__ __2018-03-01__
## __AWS Service Catalog__
  - ### Features
    - This release of ServiceCatalog adds the DeleteTagOption API.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway (File) support for two new file share attributes are added.           1. Users can specify the S3 Canned ACL to use for new objects created in the file share.         2. Users can create file shares for requester-pays buckets.

## __Amazon CloudWatch Events__
  - ### Features
    - Added BatchParameters to the PutTargets API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for modifying Placement Group association of instances via ModifyInstancePlacement API.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Inventory release supports the status message details reported by the last sync for the resource data sync API.

# __1.11.288__ __2018-02-28__
## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports automatic scaling of SageMaker Production Variants on an Endpoint.

# __1.11.287__ __2018-02-27__
## __Amazon EC2 Container Registry__
  - ### Features
    - Documentation updates for Amazon ECR.

# __1.11.286__ __2018-02-26__
## __AWS Security Token Service__
  - ### Features
    - Increased SAMLAssertion parameter size from 50000 to 100000 for AWS Security Token Service AssumeRoleWithSAML API to allow customers to pass bigger SAML assertions

## __Amazon Route 53__
  - ### Features
    - Added support for creating LBR rules using ap-northeast-3 region.

# __1.11.285__ __2018-02-23__
## __AWS SDK for Java__
  - ### Features
    - Add support for AWS_EC2_METADATA_DISABLED environment variable to disable EC2 Metadata Service usage to retrieve credentials and region.

## __Amazon AppStream__
  - ### Features
    - This API update is to enable customers to copy their Amazon AppStream 2.0 images within and between AWS Regions

# __1.11.284__ __2018-02-22__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS CodeCommit__
  - ### Features
    - This release adds an API for adding a file directly to an AWS CodeCommit repository without requiring a Git client.

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Cost Explorer Service__
  - ### Features
    - Added GetReservationCoverage API for retrieving reservation coverage information.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __AWS WAF__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWS WAF Regional__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWSServerlessApplicationRepository__
  - ### Features
    - Added support for delete-application API and the ability for developers to set a homepage for their application. The homepage is a URL with more information about the application, for example the location of your GitHub repository for the application. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for tagging an EBS snapshot as part of the API call that creates the EBS snapshot

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling support for service-linked roles

## __Elastic Load Balancing__
  - ### Features
    - Added a new load balancer attribute related to Network Load Balancers that enables cross zone capabilities. This feature allows Network Load Balancers to distribute requests regardless of Availability Zone.

# __1.11.283__ __2018-02-21__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS CodeCommit__
  - ### Features
    - This release adds an API for adding a file directly to an AWS CodeCommit repository without requiring a Git client.

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __AWS WAF__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWS WAF Regional__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWSServerlessApplicationRepository__
  - ### Features
    - Added support for delete-application API and the ability for developers to set a homepage for their application. The homepage is a URL with more information about the application, for example the location of your GitHub repository for the application. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for tagging an EBS snapshot as part of the API call that creates the EBS snapshot

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling support for service-linked roles

# __1.11.282__ __2018-02-20__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __AWS WAF__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWS WAF Regional__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling support for service-linked roles

# __1.11.281__ __2018-02-19__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

# __1.11.277__ __2018-02-13__
## __Amazon Glacier__
  - ### Features
    - Documentation updates for glacier

## __Amazon Route 53__
  - ### Features
    - Added support for creating Private Hosted Zones and metric-based healthchecks in the ap-northeast-3 region for whitelisted customers.

# __1.11.276__ __2018-02-12__
## __AWS Key Management Service__
  - ### Features
    - This release of AWS Key Management Service includes support for InvalidArnException in the RetireGrant API.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Support for user migration using AWS Lambda trigger. Support to obtain signing certificate for user pools.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Network interfaces now supply the following additional status of "associated" to better distinguish the current status.

## __Amazon GuardDuty__
  - ### Features
    - Added PortProbeAction information to the Action section of the port probe-type finding.

## __Amazon Relational Database Service__
  - ### Features
    - Aurora MySQL now supports MySQL 5.7.

# __1.11.275__ __2018-02-09__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Users can now better understand the longer ID opt-in status of their account using the two new APIs DescribeAggregateIdFormat and DescribePrincipalIdFormat

## __Amazon Lex Model Building Service__
  - ### Features
    - You can now define a response for your Amazon Lex chatbot directly from the AWS console. A response consists of messages dynamically selected from a group of pre-defined messages, populated by the developer.

## __Amazon Lex Runtime Service__
  - ### Features
    - You can now define a response for your Amazon Lex chatbot directly from the AWS console. A response consists of messages dynamically selected from a group of pre-defined messages, populated by the developer.

# __1.11.274__ __2018-02-08__
## __AWS Budgets__
  - ### Features
    - Making budgetLimit and timePeriod optional, and updating budgets docs. 

## __AWS Database Migration Service__
  - ### Features
    - This release includes the addition of two new APIs: describe replication instance task logs and reboot instance. The first allows user to see how much storage each log for a task on a given instance is occupying. The second gives users the option to reboot the application software on the instance and force a fail over for MAZ instances to test robustness of their integration with our service. 

## __AWS Directory Service__
  - ### Features
    - Updated the regex of some input parameters to support longer EC2 identifiers.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive has added support for updating channel settings for idle channels. You can now update channel name, channel outputs and output destinations, encoder settings, user role ARN, and input specifications. Channel settings can be updated in the console or with API calls. Please note that running channels need to be stopped before they can be updated. We've also deprecated the 'Reserved' field.

## __AWS Elemental MediaStore__
  - ### Features
    - AWS Elemental MediaStore now supports per-container CORS configuration.

## __Amazon AppStream__
  - ### Features
    - Adds support for allowing customers to provide a redirect URL for a stack. Users will be redirected to the link provided by the admin at the end of their streaming session. 

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now supports server-side encryption using a default service key (alias/aws/dynamodb) from the AWS Key Management Service (KMS). AWS KMS is a service that combines secure, highly available hardware and software to provide a key management system scaled for the cloud. AWS KMS is used via the AWS Management Console or APIs to centrally create encryption keys, define the policies that control how keys can be used, and audit key usage to prove they are being used correctly. For more information, see the Amazon DynamoDB Developer Guide.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift FlexMatch added the StartMatchBackfill API.  This API allows developers to add new players to an existing game session using the same matchmaking rules and player data that were used to initially create the session.

## __Amazon SNS__
  - ### Features
    - Adding a new utility ([SnsMessageManager](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/sns/message/SnsMessageManager.html)) to parse and validate SNS messages published to an HTTP/HTTPs endpoint. See this [blog post](https://aws.amazon.com/blogs/developer/publishing-to-https-endpoints-using-sns-and-the-aws-sdk-for-java/) for more information.

# __1.11.273__ __2018-02-06__
## __AWS Glue__
  - ### Features
    - This new feature will now allow customers to add a customized json classifier. They can specify a json path to indicate the object, array or field of the json documents they'd like crawlers to inspect when they crawl json files. 

## __AWS Service Catalog__
  - ### Features
    - This release of Service Catalog adds SearchProvisionedProducts API and ProvisionedProductPlan APIs.

## __Amazon Route 53 Auto Naming__
  - ### Features
    - This release adds support for registering CNAME record types and creating Route 53 alias records that route traffic to Amazon Elastic Load Balancers using Amazon Route 53 Auto Naming APIs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports configuring Linux repos as part of patch baselines, controlling updates of non-OS security packages and also creating patch baselines for SUSE12

# __1.11.272__ __2018-02-05__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __AWS Cloud9__
  - ### Features
    - API usage examples for AWS Cloud9.

## __AWS OpsWorks__
  - ### Features
    - AWS OpsWorks Stacks supports EBS encryption and HDD volume types. Also, a new DescribeOperatingSystems API is available, which lists all operating systems supported by OpsWorks Stacks.

## __Amazon Kinesis__
  - ### Features
    - Using ListShards a Kinesis Data Streams customer or client can get information about shards in a data stream (including meta-data for each shard) without obtaining data stream level information.

## __Amazon S3__
  - ### Bugfixes
    - Multi-part downloads through TransferManager now use a shorter temporary file name to prevent file system limitations with long file names.

# __1.11.271__ __2018-01-26__
## __AWS Device Farm__
  - ### Features
    - Add InteractionMode in CreateRemoteAccessSession for DirectDeviceAccess feature.

## __AWS Elemental MediaLive__
  - ### Features
    - Add InputSpecification to CreateChannel (specification of input attributes is used for channel sizing and affects pricing);  add NotFoundException to DeleteInputSecurityGroups.

## __Amazon Mechanical Turk__
  - ### Features
    - Documentation updates for mturk-requester

# __1.11.270__ __2018-01-25__
## __AWS CodeBuild__
  - ### Features
    - Adding support for Shallow Clone and GitHub Enterprise in AWS CodeBuild.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Revision ID on your function versions and aliases, to track and apply conditional updates when you are updating your function version or alias resources.

## __Alexa For Business__
  - ### Features
    - Supports new field for DeviceStatusInfo which provides details about the DeviceStatus following a DeviceSync operation.

## __Amazon GuardDuty__
  - ### Features
    - Added the missing AccessKeyDetails object to the resource shape.

# __1.11.269__ __2018-01-22__
## __AWS Budgets__
  - ### Features
    - Add additional costTypes: IncludeDiscount, UseAmortized,  to support finer control for different charges included in a cost budget.

# __1.11.268__ __2018-01-19__
## __AWS Glue__
  - ### Features
    - New AWS Glue DataCatalog APIs to manage table versions and a new feature to skip archiving of the old table version when updating table. 

# __1.11.267__ __2018-01-18__
## __Amazon SageMaker Service__
  - ### Features
    - CreateTrainingJob and CreateEndpointConfig now supports KMS Key for volume encryption. 

# __1.11.266__ __2018-01-17__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling-plans

# __1.11.265__ __2018-01-16__
## __Amazon Relational Database Service__
  - ### Features
    - With this release you can now integrate RDS DB instances with CloudWatch Logs. We have added parameters to the operations for creating and modifying DB instances (for example CreateDBInstance) to allow you to take advantage of this capability through the CLI and API. Once you enable this feature, a stream of log events will publish to CloudWatch Logs for each log type you enable.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling is adding support for Target Tracking Scaling for ECS services.

# __1.11.264__ __2018-01-15__
## __AWS Lambda__
  - ### Features
    - Support for creating Lambda Functions using 'dotnetcore2.0' and 'go1.x'. 

# __1.11.263__ __2018-01-12__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for AWS Application Discovery Service.

## __AWS CodeDeploy__
  - ### Features
    - The AWS CodeDeploy API was updated to support DeleteGitHubAccountToken, a new method that deletes a GitHub account connection.

## __AWS Directory Service__
  - ### Features
    - On October 24 we introduced AWS Directory Service for Microsoft Active Directory (Standard Edition), also known as AWS Microsoft AD (Standard Edition), which is a managed Microsoft Active Directory (AD) that is optimized for small and midsize businesses (SMBs). With this SDK release, you can now create an AWS Microsoft AD directory using API. This enables you to run typical SMB workloads using a cost-effective, highly available, and managed Microsoft AD in the AWS Cloud.

## __AWS Glue__
  - ### Features
    - Support is added to generate ETL scripts in Scala which can now be run by  AWS Glue ETL jobs. In addition, the trigger API now supports firing when any conditions are met (in addition to all conditions). Also, jobs can be triggered based on a "failed" or "stopped" job run (in addition to a "succeeded" job run). 

## __AWS Key Management Service__
  - ### Features
    - Documentation updates for AWS KMS

## __Amazon Import/Export Snowball__
  - ### Features
    - Documentation updates for snowball

## __Amazon Inspector__
  - ### Features
    - Added 2 new attributes to the DescribeAssessmentTemplate response, indicating the total number of assessment runs and last assessment run ARN (if present.)

## __Amazon Route 53__
  - ### Features
    - This release adds an exception to the CreateTrafficPolicyVersion API operation.

# __1.11.262__ __2018-01-11__
## __Amazon Relational Database Service__
  - ### Features
    - Read Replicas for Amazon RDS for MySQL, MariaDB, and PostgreSQL now support Multi-AZ deployments.Amazon RDS Read Replicas enable you to create one or more read-only copies of your database instance within the same AWS Region or in a different AWS Region. Updates made to the source database are asynchronously copied to the Read Replicas. In addition to providing scalability for read-heavy workloads, you can choose to promote a Read Replica to become standalone a DB instance when needed.Amazon RDS Multi-AZ Deployments provide enhanced availability for database instances within a single AWS Region. With Multi-AZ, your data is synchronously replicated to a standby in a different Availability Zone (AZ). In case of an infrastructure failure, Amazon RDS performs an automatic failover to the standby, minimizing disruption to your applications.You can now combine Read Replicas with Multi-AZ as part of a disaster recovery strategy for your production databases. A well-designed and tested plan is critical for maintaining business continuity after a disaster. Since Read Replicas can also be created in different regions than the source database, your Read Replica can be promoted to become the new production database in case of a regional disruption.You can also combine Read Replicas with Multi-AZ for your database engine upgrade process. You can create a Read Replica of your production database instance and upgrade it to a new database engine version. When the upgrade is complete, you can stop applications, promote the Read Replica to a standalone database instance and switch over your applications. Since the database instance is already a Multi-AZ deployment, no additional steps are needed.For more information, see the Amazon RDS User Guide.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updates documentation for the HierarchyLevelLimitExceededException error.

## __Elastic Load Balancing__
  - ### Features
    - Added OperationNotPermittedException to indicate that you cannot create a load balancer while deleting the Elastic Load Balancing service-linked role.

# __1.11.261__ __2018-01-09__
## __AWS Key Management Service__
  - ### Features
    - Documentation updates for AWS KMS

# __1.11.260__ __2018-01-09__
## __AWS Directory Service__
  - ### Features
    - On October 24 we introduced AWS Directory Service for Microsoft Active Directory (Standard Edition), also known as AWS Microsoft AD (Standard Edition), which is a managed Microsoft Active Directory (AD) that is optimized for small and midsize businesses (SMBs). With this SDK release, you can now create an AWS Microsoft AD directory using API. This enables you to run typical SMB workloads using a cost-effective, highly available, and managed Microsoft AD in the AWS Cloud.

# __1.11.259__ __2018-01-08__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for AWS Application Discovery Service.

## __AWS CodeDeploy__
  - ### Features
    - The AWS CodeDeploy API was updated to support DeleteGitHubAccountToken, a new method that deletes a GitHub account connection.

## __Amazon Route 53__
  - ### Features
    - This release adds an exception to the CreateTrafficPolicyVersion API operation.

# __1.11.258__ __2018-01-05__
## __Amazon Import/Export Snowball__
  - ### Features
    - Documentation updates for snowball

## __Amazon Inspector__
  - ### Features
    - Added 2 new attributes to the DescribeAssessmentTemplate response, indicating the total number of assessment runs and last assessment run ARN (if present.)

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for ssm

# __1.11.257__ __2018-01-02__
## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

# __1.11.256__ __2017-12-29__
## __Amazon WorkSpaces__
  - ### Features
    - Modify WorkSpaces have been updated with flexible storage and switching of hardware bundles feature. The following configurations have been added to ModifyWorkSpacesProperties: storage and compute. This update provides the capability to configure the storage of a WorkSpace. It also adds the capability of switching hardware bundle of a WorkSpace by specifying an eligible compute (Value, Standard, Performance, Power).

# __1.11.255__ __2017-12-22__
## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now set a health check initialization wait period of their ECS services, the services that are associated with an Elastic Load Balancer (ELB) will wait for a period of time before the ELB become healthy. You can now configure this in Create and Update Service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release fixes an issue with tags not showing in DescribeAddresses responses.

## __Amazon Inspector__
  - ### Features
    - PreviewAgents API now returns additional fields within the AgentPreview data type. The API now shows the agent health and availability status for all instances included in the assessment target. This allows users to check the health status of Inspector Agents before running an assessment. In addition, it shows the instance ID, hostname, and IP address of the targeted instances.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Models no longer support SupplementalContainers.  API's that have been affected are CreateModel and DescribeModel.

# __1.11.254__ __2017-12-21__
## __AWS CodeBuild__
  - ### Features
    - Adding support allowing AWS CodeBuild customers to select specific curated image versions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Elastic IP tagging enables you to add key and value metadata to your Elastic IPs so that you can search, filter, and organize them according to your organization's needs.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Analytics now supports AWS Lambda functions as output.

# __1.11.253__ __2017-12-20__
## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for WAF, WAFRegional, and CloudFront resources

## __AWS IoT__
  - ### Features
    - This release adds support for code signed Over-the-air update functionality for Amazon FreeRTOS. Users can now create and schedule Over-the-air updates to their Amazon FreeRTOS devices using these new APIs. 

# __1.11.252__ __2017-12-19__
## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - Documentation updates for mediastore

## __Amazon API Gateway__
  - ### Features
    - API Gateway now adds support for calling API with compressed payloads using one of the supported content codings, tagging an API stage for cost allocation, and returning API keys from a custom authorizer for use with a usage plan.

## __Amazon Route 53__
  - ### Features
    - Route 53 added support for a new China (Ningxia) region, cn-northwest-1. You can now specify cn-northwest-1 as the region for latency-based or geoproximity routing. Route 53 also added support for a new EU (Paris) region, eu-west-3. You can now associate VPCs in eu-west-3 with private hosted zones and create alias records that route traffic to resources in eu-west-3.

# __1.11.251__ __2017-12-19__
## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

# __1.11.250__ __2017-12-15__
## __Amazon AppStream__
  - ### Features
    - This API update is to enable customers to add tags to their Amazon AppStream 2.0 resources

# __1.11.249__ __2017-12-14__
## __Amazon API Gateway__
  - ### Features
    - Adds support for Cognito Authorizer scopes at the API method level.

## __Amazon Simple Email Service__
  - ### Features
    - Added information about the maximum number of transactions per second for the SendCustomVerificationEmail operation.

# __1.11.248__ __2017-12-12__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for CodeDeploy.

## __Amazon WorkMail__
  - ### Features
    - Today, Amazon WorkMail released an administrative SDK and enabled AWS CloudTrail integration. With the administrative SDK, you can natively integrate WorkMail with your existing services. The SDK enables programmatic user, resource, and group management through API calls. This means your existing IT tools and workflows can now automate WorkMail management, and third party applications can streamline WorkMail migrations and account actions. 

# __1.11.247__ __2017-12-11__
## __Amazon Cognito Identity Provider__
  - ### Features
    - Exposing the hosted UI domain name for a user pool that has a domain configured.

## __Amazon Lex Model Building Service__
  - ### Features
    - The GetBotChannelAssociation API now returns the status and failure reason, if any, for a bot channel.

## __Amazon SageMaker Service__
  - ### Features
    - CreateModel API Update:  The request parameter 'ExecutionRoleArn' has changed from optional to required.

# __1.11.246__ __2017-12-08__
## __Amazon AppStream__
  - ### Features
    - This API update is to support the feature that allows customers to automatically consume the latest Amazon AppStream 2.0 agent as and when published by AWS.

## __Amazon CloudWatch__
  - ### Features
    - With this launch, you can now create a CloudWatch alarm that alerts you when M out of N datapoints of a metric are breaching your predefined threshold, such as three out of five times in any given five minutes interval or two out of six times in a thirty minutes interval. When M out of N datapoints are not breaching your threshold in an interval, the alarm will be in OK state. Please note that the M datapoints out of N datapoints in an interval can be of any order and does not need to be consecutive. Consequently, you can now get alerted even when the spikes in your metrics are intermittent over an interval.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Windows containers.

# __1.11.245__ __2017-12-07__
## __Amazon Elasticsearch Service__
  - ### Features
    - Added support for encryption of data at rest on Amazon Elasticsearch Service using AWS KMS

## __Amazon Simple Email Service__
  - ### Features
    - Customers can customize the emails that Amazon SES sends when verifying new identities. This feature is helpful for developers whose applications send email through Amazon SES on behalf of their customers.

# __1.11.244__ __2017-12-06__
## __AWS Elastic Beanstalk__
  - ### Features
    - Documentation updates for AWS Elastic Beanstalk.

## __Amazon CloudDirectory__
  - ### Features
    - Amazon Cloud Directory makes it easier for you to apply schema changes across your directories with in-place schema upgrades. Your directories now remain available while backward-compatible schema changes are being applied, such as the addition of new fields. You also can view the history of your schema changes in Cloud Directory by using both major and minor version identifiers, which can help you track and audit schema versions across directories.

## __Amazon SageMaker Service__
  - ### Features
    - Initial waiters for common SageMaker workflows.

# __1.11.243__ __2017-12-05__
## __AWS IoT__
  - ### Features
    - Add error action API for RulesEngine. 

## __AWS Service Catalog__
  - ### Features
    - ServiceCatalog has two distinct personas for its use, an "admin" persona (who creates sets of products with different versions and prescribes who has access to them) and an "end-user" persona (who can launch cloud resources based on the configuration data their admins have given them access to).  This API update will allow admin users to deactivate/activate product versions, end-user will only be able to access and launch active product versions. 

## __Amazon Route 53 Auto Naming__
  - ### Features
    - Amazon Route 53 Auto Naming lets you configure public or private namespaces that your microservice applications run in. When instances of the service become available, you can call the Auto Naming API to register the instance, and Amazon Route 53 automatically creates up to five DNS records and an optional health check. Clients that submit DNS queries for the service receive an answer that contains up to eight healthy records.

# __1.11.242__ __2017-12-04__
## __AWS Budgets__
  - ### Features
    - Add additional costTypes to support finer control for different charges included in a cost budget.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for ecs

# __1.11.241__ __2017-12-01__
## __Amazon SageMaker Service__
  - ### Features
    - Preparing to release updated waiters week of December 4, 2017 for all supported SDKs.

# __1.11.240__ __2017-11-30__
## __AWS Cloud9__
  - ### Features
    - Adds support for creating and managing AWS Cloud9 development environments. AWS Cloud9 is a cloud-based integrated development environment (IDE) that you use to write, run, and debug code.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports the ability to set the concurrency limits for individual functions, and increasing memory to 3008MB.

## __AWS Serverless Application Repository__
  - ### Features
    - First release of the AWS Serverless Application Repository SDK

## __Alexa For Business__
  - ### Features
    - Alexa for Business is now generally available for production use. Alexa for Business makes it easy for you to use Alexa in your organization. The Alexa for Business SDK gives you APIs to manage Alexa devices, enroll users, and assign skills at scale. For more information about Alexa for Business, go to https://aws.amazon.com/alexaforbusiness 

## __Amazon API Gateway__
  - ### Features
    - Added support Private Integration and VPC Link features in API Gateway. This allows to create an API with the API Gateway private integration, thus providing clients access to HTTP/HTTPS resources in an Amazon VPC from outside of the VPC through a VpcLink resource.

## __Amazon EC2__
  - ### Features
    - Adds the following updates: 1. Spread Placement ensures that instances are placed on distinct hardware in order to reduce correlated failures. 2. Inter-region VPC Peering allows customers to peer VPCs across different AWS regions without requiring additional gateways, VPN connections or physical hardware 

# __1.11.239__ __2017-11-29__
## __AWS Resource Groups__
  - ### Features
    - AWS Resource Groups lets you search and group AWS resources from multiple services based on their tags.

## __AWS WAF__
  - ### Features
    - This release adds support for rule group and managed rule group. Rule group is a container of rules that customers can create, put rules in it and associate the rule group to a WebACL. All rules in a rule group will function identically as they would if each rule was individually associated to the WebACL. Managed rule group is a pre-configured rule group composed by our security partners and made available via the AWS Marketplace. Customers can subscribe to these managed rule groups, associate the managed rule group to their WebACL and start using them immediately to protect their resources.

## __AWS WAF Regional__
  - ### Features
    - This release adds support for rule group and managed rule group. Rule group is a container of rules that customers can create, put rules in it and associate the rule group to a WebACL. All rules in a rule group will function identically as they would if each rule was individually associated to the WebACL. Managed rule group is a pre-configured rule group composed by our security partners and made available via the AWS Marketplace. Customers can subscribe to these managed rule groups, associate the managed rule group to their WebACL and start using them immediately to protect their resources.

## __Amazon EC2__
  - ### Features
    - Adds the following updates: 1. T2 Unlimited enables high CPU performance for any period of time whenever required 2. You are now able to create and launch EC2 m5 and h1 instances

## __Amazon Lightsail__
  - ### Features
    - This release adds support for load balancer and TLS/SSL certificate management. This set of APIs allows customers to create, manage, and scale secure load balanced applications on Lightsail infrastructure. To provide support for customers who manage their DNS on Lightsail, we've added the ability create an Alias A type record which can point to a load balancer DNS name via the CreateDomainEntry API http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateDomainEntry.html.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to enable executing automations at controlled rate, target resources in a resource groups and execute entire automation at once or single step at a time. It is now also possible to use YAML, in addition to JSON, when creating Systems Manager documents.

## __Auto Scaling__
  - ### Features
    - You can now use Auto Scaling with EC2 Launch Templates via the CreateAutoScalingGroup and UpdateAutoScalingGroup APIs.

# __1.11.238__ __2017-11-29__
## __AWS Greengrass__
  - ### Features
    - Greengrass OTA feature allows updating Greengrass Core and Greengrass OTA Agent. Local Resource Access feature allows Greengrass Lambdas to access local resources such as peripheral devices and volumes.

## __AWS IoT__
  - ### Features
    - This release adds support for a number of new IoT features, including AWS IoT Device Management (Jobs, Fleet Index and Thing Registration), Thing Groups, Policies on Thing Groups, Registry & Job Events, JSON Logs, Fine-Grained Logging Controls, Custom Authorization and AWS Service Authentication Using X.509 Certificates.

## __AWS IoT Jobs Data Plane__
  - ### Features
    - This release adds support for new the service called Iot Jobs. This client is built for the device SDK to use Iot Jobs Device specific APIs.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend is an AWS service for gaining insight into the content of text and documents . It develops insights by recognizing the entities, key phrases, language, sentiments, and other common elements in a document. For more information, go to the Amazon Comprehend product page. To get started, see the Amazon Comprehend Developer Guide.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now supports the following features: Global Table and On-Demand Backup. Global Table is a fully-managed, multi-region, multi-master database. DynamoDB customers can now write anywhere and read anywhere with single-digit millisecond latency by performing database operations closest to where end users reside. Global Table also enables customers to disaster-proof their applications, keeping them running and data accessible even in the face of natural disasters or region disruptions. Customers can set up Global Table with just a few clicks in the AWS Management Console-no application rewrites required. On-Demand Backup capability is to protect data from loss due to application errors, and meet customers' archival needs for compliance and regulatory reasons. Customers can backup and restore their DynamoDB table data anytime, with a single-click in the AWS management console or a single API call. Backup and restore actions execute with zero impact on table performance or availability. For more information, see the Amazon DynamoDB Developer Guide.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (Amazon ECS) released a new launch type for running containers on a serverless infrastructure. The Fargate launch type allows you to run your containerized applications without the need to provision and manage the backend infrastructure. Just register your task definition and Fargate launches the container for you. 

## __Amazon Glacier__
  - ### Features
    - This release includes support for Glacier Select, a new feature that allows you to filter and analyze your Glacier archives and store the results in a user-specified S3 location.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Announcing Amazon Kinesis Video Streams, a fully managed video ingestion and storage service. Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for machine learning, analytics, and processing. You can also stream other time-encoded data like RADAR and LIDAR signals using Kinesis Video Streams.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Announcing Amazon Kinesis Video Streams, a fully managed video ingestion and storage service. Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for machine learning, analytics, and processing. You can also stream other time-encoded data like RADAR and LIDAR signals using Kinesis Video Streams.

## __Amazon Kinesis Video Streams Media__
  - ### Features
    - Announcing Amazon Kinesis Video Streams, a fully managed video ingestion and storage service. Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for machine learning, analytics, and processing. You can also stream other time-encoded data like RADAR and LIDAR signals using Kinesis Video Streams.

## __Amazon Rekognition__
  - ### Features
    - This release introduces Amazon Rekognition support for video analysis.

## __Amazon S3__
  - ### Features
    - This release includes support for Glacier Select, a new feature that allows you to filter and analyze your Glacier archives and store the results in a user-specified S3 location.

  - ### Deprecations
    - Deprecating AmazonS3#restoreObject in favor of the newly introduced AmazonS3#restoreObjectV2. The new method returns `RestoreObjectResult` as response.

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker is a fully-managed service that enables data scientists and developers to quickly and easily build, train, and deploy machine learning models, at scale.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker is a fully-managed service that enables data scientists and developers to quickly and easily build, train, and deploy machine learning models, at scale.

## __Amazon Translate__
  - ### Features
    - Public preview release of Amazon Translate and the Amazon Translate Developer Guide. For more information, see the Amazon Translate Developer Guide.

# __1.11.237__ __2017-11-29__
## __AWS AppSync__
  - ### Features
    - AWS AppSync is an enterprise-level, fully managed GraphQL service with real-time data synchronization and offline programming features.

## __AWS Batch__
  - ### Features
    - Add support for Array Jobs which allow users to easily submit many copies of a job with a single API call.  This change also enhances the job dependency model to support N_TO_N and sequential dependency chains. The ListJobs and DescribeJobs APIs now have the ability to list or describe the status of entire Array Jobs or individual elements within the array.

## __AWS CodeDeploy__
  - ### Features
    - Support for AWS Lambda function deployment - AWS CodeDeploy now supports the deployment of AWS Lambda functions. A Lambda deployment uses a Lambda function alias to shift traffic to a new version. You select a deployment configuration that specifies exactly how traffic shifts to your new version. Success of a deployment can be validated using Lambda functions that are referenced by the deployment. This provides the opportunity to rollback if necessary.

## __AWS Lambda__
  - ### Features
    - Lambda aliases can now shift traffic between two function versions, based on preassigned weights.

## __Amazon API Gateway__
  - ### Features
    - Changes related to CanaryReleaseDeployment feature. Enables API developer to create a deployment as canary deployment and test API changes with percentage of customers before promoting changes to all customers.

## __Amazon Cognito Identity Provider__
  - ### Features
    - AWS Cognito SDK has been updated to support new Cognito user-pool objects and operations for advanced security

## __Amazon EC2__
  - ### Features
    - Adds the following updates: 1. You are now able to host a service powered by AWS PrivateLink to provide private connectivity to other VPCs. You are now also able to create endpoints to other services powered by PrivateLink including AWS services, Marketplace Seller services or custom services created by yourself or other AWS VPC customers. 2. You are now able to save launch parameters in a single template that can be used with Auto Scaling, Spot Fleet, Spot, and On Demand instances. 3. You are now able to launch Spot instances via the RunInstances API, using a single additional parameter. RunInstances will response synchronously with an instance ID should capacity be available for your Spot request. 4. A simplified Spot pricing model which delivers low, predictable prices that adjust gradually, based on long-term trends in supply and demand. 5. Amazon EC2 Spot can now hibernate Amazon EBS-backed instances in the event of an interruption, so your workloads pick up from where they left off. Spot can fulfill your request by resuming instances from a hibernated state when capacity is available.

## __Amazon GuardDuty__
  - ### Features
    - Enable Amazon GuardDuty to continuously monitor and process AWS data sources to identify threats to your AWS accounts and workloads.  You can add customization by uploading additional threat intelligence lists and IP safe lists. You can list security findings, suspend, and disable the service. 

## __AmazonMQ__
  - ### Features
    - This is the initial SDK release for Amazon MQ. Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message brokers in the cloud. 

# __1.11.236__ __2017-11-27__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert is a file-based video conversion service that transforms media into formats required for traditional broadcast and for internet streaming to multi-screen devices.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive is a video service that lets you easily create live outputs for broadcast and streaming delivery.

## __AWS Elemental MediaPackage__
  - ### Features
    - AWS Elemental MediaPackage is a just-in-time video packaging and origination service that lets you format highly secure and reliable live outputs for a variety of devices.

## __AWS Elemental MediaStore__
  - ### Features
    - AWS Elemental MediaStore is an AWS storage service optimized for media. It gives you the performance, consistency, and low latency required to deliver live and on-demand video content. AWS Elemental MediaStore acts as the origin store in your video workflow.

## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - AWS Elemental MediaStore is an AWS storage service optimized for media. It gives you the performance, consistency, and low latency required to deliver live and on-demand video content. AWS Elemental MediaStore acts as the origin store in your video workflow.

# __1.11.235__ __2017-11-22__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager now supports the ability to import domainless certs and additional Key Types as well as an additional validation method for DNS.

# __1.11.234__ __2017-11-21__
## __AWS Cloud Formation__
  - ### Features
    - 1) Instance-level parameter overrides (CloudFormation-StackSet feature): This feature will allow the customers to override the template parameters on specific stackInstances. Customers will also have ability to update their existing instances with/without parameter-overrides using a new API "UpdateStackInstances"                                                                                                                                                                                                                                                         2) Add support for SSM parameters in CloudFormation - This feature will allow the customers to use Systems Manager parameters in CloudFormation templates. They will be able to see values for these parameters in Describe APIs.

## __AWS CodeBuild__
  - ### Features
    - Adding support for accessing Amazon VPC resources from AWS CodeBuild, dependency caching and build badges.

## __AWS Shield__
  - ### Features
    - The AWS Shield SDK has been updated in order to support Elastic IP address protections, the addition of AttackProperties objects in DescribeAttack responses, and a new GetSubscriptionState operation.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now enables you to get notification when all your files written to your NFS file share have been uploaded to Amazon S3. Storage Gateway also enables guessing of the MIME type for uploaded objects based on file extensions.

## __AWS X-Ray__
  - ### Features
    - Added automatic pagination support for AWS X-Ray APIs in the SDKs that support this feature.

## __Amazon API Gateway__
  - ### Features
    - Add support for Access logs and customizable integration timeouts

## __Amazon Elastic MapReduce__
  - ### Features
    - Enable Kerberos on Amazon EMR. 

## __Amazon Rekognition__
  - ### Features
    - This release includes updates to Amazon Rekognition for the following APIs. The new DetectText API allows you to recognize and extract textual content from images. Face Model Versioning has been added to operations that deal with face detection.

# __1.11.233__ __2017-11-20__
## __AWS CodeCommit__
  - ### Features
    - AWS CodeCommit now supports pull requests. You can use pull requests to collaboratively review code changes for minor changes or fixes, major feature additions, or new versions of your released software.

## __AWS Cost Explorer Service__
  - ### Features
    - The AWS Cost Explorer API gives customers programmatic access to AWS cost and usage information, allowing them to perform adhoc queries and build interactive cost management applications that leverage this dataset.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Apigateway

## __Amazon Kinesis__
  - ### Features
    - Customers can now obtain the important characteristics of their stream with DescribeStreamSummary. The response will not include the shard list for the stream but will have the number of open shards, and all the other fields included in the DescribeStream response.

## __Amazon Kinesis Firehose__
  - ### Features
    - This release includes a new Kinesis Firehose feature that supports Splunk as Kinesis Firehose delivery destination. You can now use Kinesis Firehose to ingest real-time data to Splunk in a serverless, reliable, and salable manner. This release also includes a new feature that allows you to configure Lambda buffer size in Kinesis Firehose data transformation feature. You can now customize the data buffer size before invoking Lambda function in Kinesis Firehose for data transformation. This feature allows you to flexibly trade-off processing and delivery latency with cost and efficiency based on your specific use cases and requirements. 

## __Amazon WorkDocs__
  - ### Features
    - DescribeGroups API and miscellaneous enhancements

# __1.11.232__ __2017-11-17__
## __AWS Database Migration Service__
  - ### Features
    - Support for migration task assessment. Support for data validation after the migration.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Amazon RDS now supports importing MySQL databases by using backup files from Amazon S3.

## __Application Auto Scaling__
  - ### Features
    - This SDK update contains support for Target Tracking scaling for EC2 Spot Fleet. It allows you to scale an EC2 Spot Fleet using a Target Tracking scaling policy.

## __Elastic Load Balancing__
  - ### Features
    - This release adds Proxy Protocol v2 support for Network Load Balancer. Proxy protocol provides a convenient way to transport connection information (such as a client's source IP address/port and destination IP address/port) for a TCP connection across multiple layers of NAT or TCP proxies.

# __1.11.231__ __2017-11-16__
## __AWS Glue__
  - ### Features
    - API update for AWS Glue. New crawler configuration attribute enables customers to specify crawler behavior. New XML classifier enables classification of XML data.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for OpsWorks-cm: a new feature, OpsWorks for Puppet Enterprise, that allows users to create and manage OpsWorks-hosted Puppet Enterprise servers.

## __AWS Organizations__
  - ### Features
    - This release adds APIs that you can use to enable and disable integration with AWS services designed to work with AWS Organizations. This integration allows the AWS service to perform operations on your behalf on all of the accounts in your organization. Although you can use these APIs yourself, we recommend that you instead use the commands provided in the other AWS service to enable integration with AWS Organizations.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 x1e smaller instance sizes

## __Amazon Route 53__
  - ### Features
    - You can use Route 53's GetAccountLimit/GetHostedZoneLimit/GetReusableDelegationSetLimit APIs to view your current limits (including custom set limits) on Route 53 resources such as hosted zones and health checks. These APIs also return the number of each resource you're currently using to enable comparison against your current limits.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports automatic scaling of Amazon Aurora replicas

# __1.11.230__ __2017-11-15__
## __AWS Step Functions__
  - ### Features
    - You can now use the UpdateStateMachine API to update your state machine definition and role ARN. Existing executions will continue to use the previous definition and role ARN. You can use the DescribeStateMachineForExecution API to determine which state machine definition and role ARN is associated with an execution

## __Amazon API Gateway__
  - ### Features
    - 1. Extended GetDocumentationParts operation to support retrieving documentation parts resources without contents.  2. Added hosted zone ID in the custom domain response.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds Korean language support with new female voice - "Seoyeon" and new Indian English female voice - "Aditi"

## __Amazon Simple Email Service__
  - ### Features
    - SES launches Configuration Set Reputation Metrics and Email Pausing Today, two features that build upon the capabilities of the reputation dashboard. The first is the ability to export reputation metrics for individual configuration sets. The second is the ability to temporarily pause email sending, either at the configuration set level, or across your entire Amazon SES account.

# __1.11.229__ __2017-11-14__
## __Amazon EC2 Container Service__
  - ### Features
    - Added new mode for Task Networking in ECS, called awsvpc mode. Mode configuration parameters to be passed in via awsvpcConfiguration. Updated APIs now use/show this new mode - RegisterTaskDefinition, CreateService, UpdateService, RunTask, StartTask.

## __Amazon Lightsail__
  - ### Features
    - Lightsail now supports attached block storage, which allows you to scale your applications and protect application data with additional SSD-backed storage disks. This feature allows Lightsail customers to attach secure storage disks to their Lightsail instances and manage their attached disks, including creating and deleting disks, attaching and detaching disks from instances, and backing up disks via snapshot.

## __Amazon Route 53__
  - ### Features
    - When a Route 53 health check or hosted zone is created by a linked AWS service, the object now includes information about the service that created it. Hosted zones or health checks that are created by a linked service can't be updated or deleted using Route 53.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - EC2 Systems Manager GetInventory API adds support for aggregation.

# __1.11.228__ __2017-11-09__
## __Amazon DynamoDB__
  - ### Bugfixes
    - When using the Dynamo DB documents API, a query spec can now be reused for multiple queries.

## __Amazon EC2__
  - ### Features
    - Introduces the following features: 1. Create a default subnet in an Availability Zone if no default subnet exists. 2. Spot Fleet integrates with Elastic Load Balancing to enable you to attach one or more load balancers to a Spot Fleet request. When you attach the load balancer, it automatically registers the instance in the Spot Fleet to the load balancers which distributes incoming traffic across the instances. 

# __1.11.227__ __2017-11-08__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __Amazon EC2__
  - ### Features
    - AWS PrivateLink for Amazon Services - Customers can now privately access Amazon services from their Amazon Virtual Private Cloud (VPC), without using public IPs, and without requiring the traffic to traverse across the Internet.

## __Amazon ElastiCache__
  - ### Features
    - This release adds online resharding for ElastiCache for Redis offering, providing the ability to add and remove shards from a running cluster. Developers can now dynamically scale-out or scale-in their Redis cluster workloads to adapt to changes in demand. ElastiCache will resize the cluster by adding or removing shards and redistribute hash slots uniformly across the new shard configuration, all while the cluster continues to stay online and serves requests.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling customers are now able to schedule adjustments to their MinCapacity and MaxCapacity, which makes it possible to pre-provision adequate capacity for anticipated demand and then reduce the provisioned capacity as demand lulls.

# __1.11.226__ __2017-11-07__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - DescribeOrderableDBInstanceOptions now returns the minimum and maximum allowed values for storage size, total provisioned IOPS, and provisioned IOPS per GiB for a DB instance.

## __Amazon S3__
  - ### Features
    - This releases adds support for 4 features: 1. Default encryption for S3 Bucket, 2. Encryption status in inventory and Encryption support for inventory. 3. Cross region replication of KMS-encrypted objects, and 4. ownership overwrite for CRR.

## __Elastic Load Balancing__
  - ### Features
    - Added a new limit related to Network Load Balancers on the number of targets per load balancer per AZ.

# __1.11.225__ __2017-11-06__
## __AWS Key Management Service (KMS)__
  - ### Features
    - Documentation updates for AWS KMS. 

## __AWS Organizations__
  - ### Features
    - This release updates permission statements for several API operations, and corrects some other minor errors.

## __AWS Pricing__
  - ### Features
    - This is the initial release of AWS Price List Service.

## __AWS Step Functions__
  - ### Features
    - Documentation update.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 C5 instances, the next generation of EC2's compute-optimized instances, in us-east-1, us-west-2 and eu-west-1. C5 instances offer up to 72 vCPUs, 144 GiB of DDR4 instance memory, 25 Gbps in Network bandwidth and improved EBS and Networking bandwidth on smaller instance sizes to deliver improved performance for compute-intensive workloads.

# __1.11.224__ __2017-11-03__
## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now add devices to their containers and enable init process in containers through the use of docker's 'devices' and 'init' features. These fields can be specified under linuxParameters in ContainerDefinition in the Task Definition Template. 

# __1.11.223__ __2017-11-02__
## __Amazon API Gateway__
  - ### Features
    - This release supports creating and managing Regional and Edge-Optimized API endpoints.

# __1.11.222__ __2017-11-01__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for ACM

## __AWS CloudHSM V2__
  - ### Features
    - Minor documentation update for AWS CloudHSM (cloudhsmv2).

## __AWS Direct Connect__
  - ### Features
    - AWS DirectConnect now provides support for Global Access for Virtual Private Cloud (VPC) via a new feature called Direct Connect Gateway. A Direct Connect Gateway will allow you to group multiple Direct Connect Private Virtual Interfaces (DX-VIF) and Private Virtual Gateways (VGW) from different AWS regions (but belonging to the same AWS Account) and pass traffic from any DX-VIF to any VPC in the grouping.

# __1.11.221__ __2017-10-26__
## __Amazon CloudFront__
  - ### Features
    - You can now specify additional options for MinimumProtocolVersion, which controls the SSL/TLS protocol that CloudFront uses to communicate with viewers. The minimum protocol version that you choose also determines the ciphers that CloudFront uses to encrypt the content that it returns to viewers.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 P3 instance, next generation GPU instances, optimized for machine learning and high performance computing applications. With up to eight NVIDIA Tesla V100 GPUs, P3 instances provide up to one petaflop of mixed-precision, 125 teraflops of single-precision, and 62 teraflops of double-precision floating point performance, as well as a 300 GB/s second-generation NVLink interconnect that enables high-speed, low-latency GPU-to-GPU communication. P3 instances also feature up to 64 vCPUs based on custom Intel Xeon E5 (Broadwell) processors, 488 GB of DRAM, and 25 Gbps of dedicated aggregate network bandwidth using the Elastic Network Adapter (ENA).

# __1.11.220__ __2017-10-24__
## __AWS Config__
  - ### Features
    - AWS Config support for CodeBuild Project resource type

## __AWS Glue__
  - ### Features
    - AWS Glue: Adding a new API, BatchStopJobRun, to stop one or more job runs for a specified Job. 

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache for Redis today announced support for data encryption both for data in-transit and data at-rest. The new encryption in-transit functionality enables ElastiCache for Redis customers to encrypt data for all communication between clients and Redis engine, and all intra-cluster Redis communication. The encryption at-rest functionality allows customers to encrypt their S3 based backups. Customers can begin using the new functionality by simply enabling this functionality via AWS console, and a small configuration change in their Redis clients. The ElastiCache for Redis service automatically manages life cycle of the certificates required for encryption, including the issuance, renewal and expiration of certificates. Additionally, as part of this launch, customers will gain the ability to start using the Redis AUTH command that provides an added level of authentication.

## __Amazon Pinpoint__
  - ### Features
    - Added support for APNs VoIP messages. Added support for collapsible IDs, message priority, and TTL for APNs and FCM/GCM.

# __1.11.219__ __2017-10-23__
## __AWS Organizations__
  - ### Features
    - This release supports integrating other AWS services with AWS Organizations through the use of an IAM service-linked role called AWSServiceRoleForOrganizations. Certain operations automatically create that role if it does not already exist.

# __1.11.218__ __2017-10-20__
## __Amazon EC2__
  - ### Features
    - Adding pagination support for DescribeSecurityGroups for EC2 Classic and VPC Security Groups

# __1.11.217__ __2017-10-19__
## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Added support for tracking cost allocation by adding, updating, removing, and listing the metadata tags of Amazon SQS queues.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - EC2 Systems Manager versioning support for Parameter Store. Also support for referencing parameter versions in SSM Documents.

# __1.11.216__ __2017-10-18__
## __Amazon Lightsail__
  - ### Features
    - This release adds support for Windows Server-based Lightsail instances. The GetInstanceAccessDetails API now returns the password of your Windows Server-based instance when using the default key pair. GetInstanceAccessDetails also returns a PasswordData object for Windows Server instances containing the ciphertext and keyPairName. The Blueprint data type now includes a list of platform values (LINUX_UNIX or WINDOWS). The Bundle data type now includes a list of SupportedPlatforms values (LINUX_UNIX or WINDOWS).

# __1.11.215__ __2017-10-17__
## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds support for VPC access to Amazon Elasticsearch Service.

# __1.11.214__ __2017-10-16__
## __AWS CloudHSM__
  - ### Features
    - Documentation updates for AWS CloudHSM Classic.

## __AWS WAF__
  - ### Features
    - This release adds support for regular expressions as match conditions in rules, and support for geographical location by country of request IP address as a match condition in rules.

## __AWS WAF Regional__
  - ### Features
    - This release adds support for regular expressions as match conditions in rules, and support for geographical location by country of request IP address as a match condition in rules.

## __Amazon EC2__
  - ### Features
    - You can now change the tenancy of your VPC from dedicated to default with a single API operation. For more details refer to the documentation for changing VPC tenancy.

## __Amazon Elasticsearch Service__
  - ### Features
    - AWS Elasticsearch adds support for enabling slow log publishing. Using slow log publishing options customers can configure and enable index/query slow log publishing of their domain to preferred AWS Cloudwatch log group.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Adds waiters for DBSnapshotAvailable and DBSnapshotDeleted.

# __1.11.213__ __2017-10-12__
## __AWS CodeCommit__
  - ### Features
    - This release includes the DeleteBranch API and a change to the contents of a Commit object.

## __AWS Database Migration Service__
  - ### Features
    - This change includes addition of new optional parameter to an existing API

## __AWS Elastic Beanstalk__
  - ### Features
    - Added the ability to add, delete or update Tags

## __Amazon Polly__
  - ### Features
    - Amazon Polly exposes two new voices: "Matthew" (US English) and "Takumi" (Japanese)

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - You can now call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance.

# __1.11.212__ __2017-10-11__
## __Amazon EC2 Container Registry__
  - ### Features
    - Adds support for new API set used to manage Amazon ECR repository lifecycle policies. Amazon ECR lifecycle policies enable you to specify the lifecycle management of images in a repository. The configuration is a set of one or more rules, where each rule defines an action for Amazon ECR to apply to an image. This allows the automation of cleaning up unused images, for example expiring images based on age or status. A lifecycle policy preview API is provided as well, which allows you to see the impact of a lifecycle policy on an image repository before you execute it

## __Amazon Simple Email Service__
  - ### Features
    - Added content related to email template management and templated email sending operations.

# __1.11.211__ __2017-10-10__
## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Provide engine specific information for node associations.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed potential XXE injection security issue with XML parsers. See [OWASP XXE Cheat Sheet](https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Prevention_Cheat_Sheet).

## __Amazon EC2__
  - ### Features
    - This release includes updates to AWS Virtual Private Gateway.

## __Elastic Load Balancing__
  - ### Features
    - Server Name Indication (SNI) is an extension to the TLS protocol by which a client indicates the hostname to connect to at the start of the TLS handshake. The load balancer can present multiple certificates through the same secure listener, which enables it to support multiple secure websites using a single secure listener. Application Load Balancers also support a smart certificate selection algorithm with SNI. If the hostname indicated by a client matches multiple certificates, the load balancer determines the best certificate to use based on multiple factors including the capabilities of the client.

# __1.11.210__ __2017-10-06__
## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Documentation updates regarding availability of FIFO queues and miscellaneous corrections.

# __1.11.209__ __2017-10-05__
## __Amazon Redshift__
  - ### Features
    - DescribeEventSubscriptions API supports tag keys and tag values as request parameters. 

# __1.11.208__ __2017-10-04__
## __AWS SDK for Java__
  - ### Bugfixes
    - Reverts a potential breaking change introduced in version 1.11.167 as a fix for https://github.com/aws/aws-sdk-java/issues/1226. This change removes the jackson annotations on enum getters and setters. Customers who rely on the annotations will see 'conflicting setter definitions for property' error during serialization and deserialization. They should either upgrade to Jackson 2.7+ or add custom MixIns for all classes (that contain enums) you want to serialize/deserialize.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Analytics now supports schema discovery on objects in S3.  Additionally, Kinesis Analytics now supports input data preprocessing through Lambda.

## __Amazon Route 53 Domains__
  - ### Features
    - Added a new API that checks whether a domain name can be transferred to Amazon Route 53.

# __1.11.207__ __2017-10-03__
## __Amazon EC2__
  - ### Features
    - This release includes service updates to AWS VPN.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - EC2 Systems Manager support for tagging SSM Documents. Also support for tag-based permissions to restrict access to SSM Documents based on these tags.

# __1.11.206__ __2017-10-02__
## __AWS CloudHSM__
  - ### Features
    - Documentation updates for CloudHSM

# __1.11.205__ __2017-09-29__
## __AWS CodeBuild__
  - ### Features
    - Adding support for Building GitHub Pull Requests in AWS CodeBuild

## __AWS Organizations__
  - ### Features
    - This release flags the HandshakeParty structure's Type and Id fields as 'required'. They effectively were required in the past, as you received an error if you did not include them. This is now reflected at the API definition level. 

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixing https://github.com/aws/aws-sdk-java/issues/1110. Calls to EC2MetadataUtils#getItems correctly handle potential nulls when the path does not exist.

## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing and accessing image builders, and deleting images.

## __Amazon Mechanical Turk Requester Service__
  - ### Features
    - Today, Amazon Mechanical Turk (MTurk) supports SQS Notifications being delivered to Customers' SQS queues when different stages of the MTurk workflow are complete.  We are going to create new functionality so that Customers can leverage SNS topics as a destination for notification messages when various stages of the MTurk workflow are complete. 

## __Amazon Route 53__
  - ### Features
    - This change allows customers to reset elements of health check.

## __Amazon S3__
  - ### Bugfixes
    - Allow the use of MD5 implementations that cannot be cloned when performing checksum validation on uploaded objects. The use of such implementations will now potentially fail on request retries instead of on the initial request attempt.

# __1.11.204__ __2017-09-27__
## __Amazon Pinpoint__
  - ### Features
    - Added two new push notification channels: Amazon Device Messaging (ADM) and, for push notification support in China, Baidu Cloud Push. Added support for APNs auth via .p8 key file. Added operation for direct message deliveries to user IDs, enabling you to message an individual user on multiple endpoints.

# __1.11.203__ __2017-09-26__
## __AWS Cloud Formation__
  - ### Features
    - You can now prevent a stack from being accidentally deleted by enabling termination protection on the stack. If you attempt to delete a stack with termination protection enabled, the deletion fails and the stack, including its status, remains unchanged. You can enable termination protection on a stack when you create it. Termination protection on stacks is disabled by default. After creation, you can set termination protection on a stack whose status is CREATE_COMPLETE, UPDATE_COMPLETE, or UPDATE_ROLLBACK_COMPLETE.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixing https://github.com/aws/aws-sdk-java/issues/1243 by adding full list of reserved keywords to code generator.
    - Fixing issue https://github.com/aws/aws-sdk-java/issues/1262. When the SDK was being loaded by the bootstrap classloader, looking up global request handlers would throw an NPE.

# __1.11.202__ __2017-09-22__
## __AWS Config__
  - ### Features
    - AWS Config support for DynamoDB tables and Auto Scaling resource types

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now add and drop Linux capabilities to their containers through the use of docker's cap-add and cap-drop features. Customers can specify the capabilities they wish to add or drop for each container in their task definition. 

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Documentation updates for rds

# __1.11.201__ __2017-09-21__
## __AWS Budgets__
  - ### Features
    - Including "DuplicateRecordException" in UpdateNotification and UpdateSubscriber. 

## __Amazon CloudWatch Logs__
  - ### Features
    - Adds support for associating LogGroups with KMS Keys.

## __Amazon EC2__
  - ### Features
    - Add EC2 APIs to copy Amazon FPGA Images (AFIs) within the same region and across multiple regions, delete AFIs, and modify AFI attributes. AFI attributes include name, description and granting/denying other AWS accounts to load the AFI.

## __Amazon S3__
  - ### Deprecations
    - Deprecating AmazonS3#doesBucketExist in favor of the newly introduced AmazonS3#doesBucketExistV2. The new method is more reliable when called with incorrect credentials. See https://github.com/aws/aws-sdk-java/issues/1256 for a full discussion.

# __1.11.200__ __2017-09-20__
## __AWS CodePipeline__
  - ### Features
    - This change includes a PipelineMetadata object that is part of the output from the GetPipeline API that includes the Pipeline ARN, created, and updated timestamp.

## __AWS Greengrass__
  - ### Features
    - Reset Deployments feature allows you to clean-up the cloud resource so you can delete the group. It also cleans up the core so that it goes back to the pre-deployment state.

## __Amazon AppStream__
  - ### Features
    - API updates for supporting On-Demand fleets.

## __Amazon Lex__
  - ### Features
    - Request attributes can be used to pass client specific information from the client to Amazon Lex as part of each request.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Introduces the --option-group-name parameter to the ModifyDBSnapshot CLI command. You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply when upgrading a DB snapshot as when upgrading a DB instance.  For more information, see http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG

# __1.11.199__ __2017-09-20__
## __Amazon EC2__
  - ### Features
    - Fixed bug in EC2 clients preventing ElasticGpuSet from being set.

# __1.11.198__ __2017-09-18__
## __AWS Identity and Access Management (IAM)__
  - ### Features
    - A new API, DeleteServiceLinkedRole, submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion.

## __Amazon EC2__
  - ### Features
    - Amazon EC2 now lets you opt for Spot instances to be stopped in the event of an interruption instead of being terminated.  Your Spot request can be fulfilled again by restarting instances from a previously stopped state, subject to availability of capacity at or below your preferred price.  When you submit a persistent Spot request, you can choose from "terminate" or "stop" as the instance interruption behavior.  Choosing "stop" will shutdown your Spot instances so you can continue from this stopped state later on.  This feature is only available for instances with Amazon EBS volume as their root device.

## __Amazon Simple Email Service__
  - ### Features
    - Amazon Simple Email Service (Amazon SES) now lets you customize the domains used for tracking open and click events. Previously, open and click tracking links referred to destinations hosted on domains operated by Amazon SES. With this feature, you can use your own branded domains for capturing open and click events.

# __1.11.197__ __2017-09-15__
## __Amazon API Gateway__
  - ### Features
    - Add a new enum "REQUEST" to '--type <value>' field in the current create-authorizer API, and make "identitySource" optional.

# __1.11.196__ __2017-09-14__
## __AWS CodeBuild__
  - ### Features
    - Supporting Parameter Store in environment variables for AWS CodeBuild

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Service Catalog__
  - ### Features
    - This release of Service Catalog adds API support to copy products.

# __1.11.195__ __2017-09-13__
## __AWS Batch__
  - ### Features
    - Documentation updates for batch

## __Amazon CloudWatch Events__
  - ### Features
    - Exposes ConcurrentModificationException as one of the valid exceptions for PutPermission and RemovePermission operation.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 x1e.32xlarge instance, a new EC2 instance in the X1 family, in us-east-1, us-west-2, eu-west-1, and ap-northeast-1. x1e.32xlarge offers 128 vCPUs, 3,904 GiB of DDR4 instance memory, high memory bandwidth, large L3 caches, and leading reliability capabilities to boost the performance and reliability of in-memory applications.

## __Auto Scaling__
  - ### Features
    - Customers can create Life Cycle Hooks at the time of creating Auto Scaling Groups through the CreateAutoScalingGroup API

# __1.11.194__ __2017-09-12__
## __Amazon EC2__
  - ### Features
    - Fixed bug in EC2 clients preventing HostOfferingSet from being set

# __1.11.193__ __2017-09-11__
## __AWS Device Farm__
  - ### Features
    - DeviceFarm has added support for two features - RemoteDebugging and Customer Artifacts. Customers  can now do remote Debugging on their Private Devices and can now retrieve custom files generated by their tests on the device and the device host (execution environment) on both public and private devices. 

# __1.11.192__ __2017-09-08__
## __Amazon CloudWatch Logs__
  - ### Features
    - Adds support for the PutResourcePolicy, DescribeResourcePolicy and DeleteResourcePolicy APIs.

# __1.11.191__ __2017-09-07__
## __Amazon EC2__
  - ### Features
    - With Tagging support, you can add Key and Value metadata to search, filter and organize your NAT Gateways according to your organization's needs.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex provides the ability to export your Amazon Lex chatbot definition as a JSON file that can be added to the target platform. The JSON configuration file contains the structure of your Amazon Lex chatbot, including the intent schema with utterances, slots, prompts and slot-types.

## __Amazon Route 53__
  - ### Features
    - You can configure Amazon Route 53 to log information about the DNS queries that Amazon Route 53 receives for your domains and subdomains. When you configure query logging, Amazon Route 53 starts to send logs to CloudWatch Logs. You can use various tools, including the AWS console, to access the query logs.

## __Amazon S3__
  - ### Features
    - The metadata directive can now be explicitly specified for CopyObjectRequest. See https://github.com/aws/aws-sdk-java/issues/1283

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

## __Elastic Load Balancing__
  - ### Features
    - The feature enables the new Network Load Balancer that is optimized to handle volatile traffic patterns while using a single static IP address per Availability Zone. Network Load Balancer operates at the connection level (Layer 4), routing connections to Amazon EC2 instances and containers, within Amazon Virtual Private Cloud (Amazon VPC) based on IP protocol data.

# __1.11.190__ __2017-09-06__
## __AWS Budgets__
  - ### Features
    - Add an optional "thresholdType" to notifications to support percentage or absolute value thresholds.

## __Amazon S3__
  - ### Bugfixes
    - Fixing https://github.com/aws/aws-sdk-java/issues/1256. doesBucketExist now throws an exception when credentials are invalid rather than always returning true.

# __1.11.189__ __2017-09-05__
## __AWS CodeStar__
  - ### Features
    - Added support to tag CodeStar projects. Tags can be used to organize and find CodeStar projects on key-value pairs that you can choose. For example, you could add a tag with a key of "Release" and a value of "Beta" to projects your organization is working on for an upcoming beta release.

# __1.11.188__ __2017-09-01__
## __AWS Mobile__
  - ### Features
    - AWS Mobile Hub is an integrated experience designed to help developers build, test, configure and release cloud-based applications for mobile devices using Amazon Web Services. AWS Mobile Hub provides a console and API for developers, allowing them to quickly select desired features and integrate them into mobile applications. Features include NoSQL Database, Cloud Logic, Messaging and Analytics. With AWS Mobile Hub, you pay only for the underlying services that Mobile Hub provisions based on the features you choose in the Mobile Hub console.

## __Amazon GameLift__
  - ### Features
    - GameLift VPC resources can be peered with any other AWS VPC. R4 memory-optimized instances now available to deploy.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding KMS encryption support to SSM Inventory Resource Data Sync. Exposes the ClientToken parameter on SSM StartAutomationExecution to provide idempotent execution requests.

# __1.11.187__ __2017-08-31__
## __AWS CodeBuild__
  - ### Features
    - The AWS CodeBuild HTTP API now provides the BatchDeleteBuilds operation, which enables you to delete existing builds.

## __Amazon EC2__
  - ### Features
    - Descriptions for Security Group Rules enables customers to be able to define a description for ingress and egress security group rules . The Descriptions for Security Group Rules feature supports one description field per Security Group rule for both ingress and egress rules . Descriptions for Security Group Rules provides a simple way to describe the purpose or function of a Security Group Rule allowing for easier customer identification of configuration elements .      Prior to the release of Descriptions for Security Group Rules , customers had to maintain a separate system outside of AWS if they wanted to track Security Group Rule mapping and their purpose for being implemented. If a security group rule has already been created and you would like to update or change your description for that security group rule you can use the UpdateSecurityGroupRuleDescription API.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports synonyms for slot type values. If the user inputs a synonym, it will be resolved to the corresponding slot value.

## __Elastic Load Balancing__
  - ### Features
    - This change now allows Application Load Balancers to distribute traffic to AWS resources using their IP addresses as targets in addition to the instance IDs. You can also load balance to resources outside the VPC hosting the load balancer using their IP addresses as targets. This includes resources in peered VPCs, EC2-Classic, and on-premises locations reachable over AWS Direct Connect or a VPN connection.

# __1.11.186__ __2017-08-30__
## __AWS Organizations__
  - ### Features
    - The exception ConstraintViolationException now contains a new reason subcode MASTERACCOUNT_MISSING_CONTACT_INFO to make it easier to understand why attempting to remove an account from an Organization can fail. We also improved several other of the text descriptions and examples.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports the DisableScaleIn option for Target Tracking Scaling Policies. This allows customers to create scaling policies that will only add capacity to the target.

# __1.11.185__ __2017-08-29__
## __AWS Config__
  - ### Features
    - Increased the internal size limit of resourceId

## __Amazon EC2__
  - ### Features
    - Provides capability to add secondary CIDR blocks to a VPC.

# __1.11.184__ __2017-08-25__
## __AWS Cloud Formation__
  - ### Features
    - Rollback triggers enable you to have AWS CloudFormation monitor the state of your application during stack creation and updating, and to roll back that operation if the application breaches the threshold of any of the alarms you've specified.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed bug in SigV4 signing for services that have different signing name and endpoint prefix when sending requests to non-standard endpoints like China region.

## __Amazon GameLift__
  - ### Features
    - Update spelling of MatchmakingTicket status values for internal consistency.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Option group options now contain additional properties that identify requirements for certain options. Check these properties to determine if your DB instance must be in a VPC or have auto minor upgrade turned on before you can use an option. Check to see if you can downgrade the version of an option after you have installed it.

# __1.11.183__ __2017-08-24__
## __Amazon Rekognition__
  - ### Features
    - Update the enum value of LandmarkType and GenderType to be consistent with service response

# __1.11.182__ __2017-08-23__
## __Amazon AppStream__
  - ### Features
    - Documentation updates for appstream

# __1.11.181__ __2017-08-22__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Changes to associations in Systems Manager State Manager can now be recorded. Previously, when you edited associations, you could not go back and review older association settings. Now, associations are versioned, and can be named using human-readable strings, allowing you to see a trail of association changes. You can also perform rate-based scheduling, which allows you to schedule associations more granularly.

# __1.11.180__ __2017-08-21__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixes a bug where the client time offset is not updated for clock skew errors when retries are disabled.

## __Amazon Kinesis Firehose__
  - ### Features
    - This change will allow customers to attach a Firehose delivery stream to an existing Kinesis stream directly. You no longer need a forwarder to move data from a Kinesis stream to a Firehose delivery stream. You can now run your streaming applications on your Kinesis stream and easily attach a Firehose delivery stream to it for data delivery to S3, Redshift, or Elasticsearch concurrently.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports CAA resource record type. A CAA record controls which certificate authorities are allowed to issue certificates for the domain or subdomain.

# __1.11.179__ __2017-08-16__
## __Amazon GameLift__
  - ### Features
    - The Matchmaking Grouping Service is a new feature that groups player match requests for a given game together into game sessions based on developer configured rules.

# __1.11.178__ __2017-08-15__
## __Amazon EC2__
  - ### Features
    - Fixed bug in EC2 clients preventing HostReservation from being set

# __1.11.177__ __2017-08-14__
## __AWS Batch__
  - ### Features
    - This release enhances the DescribeJobs API to include the CloudWatch logStreamName attribute in ContainerDetail and ContainerDetailAttempt

## __AWS CloudHSM V2__
  - ### Features
    - CloudHSM provides hardware security modules for protecting sensitive data and cryptographic keys within an EC2 VPC, and enable the customer to maintain control over key access and use. This is a second-generation of the service that will improve security, lower cost and provide better customer usability.

## __AWS Glue__
  - ### Features
    - AWS Glue is a fully managed extract, transform, and load (ETL) service that makes it easy for customers to prepare and load their data for analytics. You can create and run an ETL job with a few clicks in the AWS Management Console. You simply point AWS Glue to your data stored on AWS, and AWS Glue discovers your data and stores the associated metadata (e.g. table definition and schema) in the AWS Glue Data Catalog. Once cataloged, your data is immediately searchable, queryable, and available for ETL. AWS Glue generates the code to execute your data transformations and data loading processes. AWS Glue generates Python code that is entirely customizable, reusable, and portable. Once your ETL job is ready, you can schedule it to run on AWS Glue's fully managed, scale-out Spark environment. AWS Glue provides a flexible scheduler with dependency resolution, job monitoring, and alerting. AWS Glue is serverless, so there is no infrastructure to buy, set up, or manage. It automatically provisions the environment needed to complete the job, and customers pay only for the compute resources consumed while running ETL jobs. With AWS Glue, data can be available for analytics in minutes.

## __AWS Migration Hub__
  - ### Features
    - AWS Migration Hub provides a single location to track migrations across multiple AWS and partner solutions. Using Migration Hub allows you to choose the AWS and partner migration tools that best fit your needs, while providing visibility into the status of your entire migration portfolio. Migration Hub also provides key metrics and progress for individual applications, regardless of which tools are being used to migrate them. For example, you might use AWS Database Migration Service, AWS Server Migration Service, and partner migration tools to migrate an application comprised of a database, virtualized web servers, and a bare metal server. Using Migration Hub will provide you with a single screen that shows the migration progress of all the resources in the application. This allows you to quickly get progress updates across all of your migrations, easily identify and troubleshoot any issues, and reduce the overall time and effort spent on your migration projects. Migration Hub is available to all AWS customers at no additional charge. You only pay for the cost of the migration tools you use, and any resources being consumed on AWS. 

## __AWS Storage Gateway__
  - ### Features
    - Add optional field ForceDelete to DeleteFileShare api.

## __Amazon Elastic File System__
  - ### Features
    - Customers can create encrypted EFS file systems and specify a KMS master key to encrypt it with.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager Maintenance Windows include the following changes or enhancements: New task options using Systems Manager Automation, AWS Lambda, and AWS Step Functions; enhanced ability to edit the targets of a Maintenance Window, including specifying a target name and description, and ability to edit the owner field; enhanced ability to edits tasks; enhanced support for Run Command parameters; and you can now use a --safe flag when attempting to deregister a target. If this flag is enabled when you attempt to deregister a target, the system returns an error if the target is referenced by any task. Also, Systems Manager now includes Configuration Compliance to scan your fleet of managed instances for patch compliance and configuration inconsistencies. You can collect and aggregate data from multiple AWS accounts and Regions, and then drill down into specific resources that aren't compliant.

# __1.11.176__ __2017-08-11__
## __AWS CodeDeploy__
  - ### Features
    - Adds support for specifying Application Load Balancers in deployment groups, for both in-place and blue/green deployments.

## __Amazon Cognito Identity Provider__
  - ### Features
    - We have added support for features for Amazon Cognito User Pools that enable application developers to easily add and customize a sign-up and sign-in user experience, use OAuth 2.0, and integrate with Facebook, Google, Login with Amazon, and SAML-based identity providers.

## __Amazon EC2__
  - ### Features
    - Provides customers an opportunity to recover an EIP that was released

# __1.11.175__ __2017-08-10__
## __AWS CodeBuild__
  - ### Features
    - Supporting Bitbucket as source type in AWS CodeBuild.

## __Amazon CloudDirectory__
  - ### Features
    - Enable BatchDetachPolicy

# __1.11.174__ __2017-08-09__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Documentation updates for RDS.

# __1.11.173__ __2017-08-08__
## __AWS Elastic Beanstalk__
  - ### Features
    - Add support for paginating the result of DescribeEnvironments     Include the ARN of described environments in DescribeEnvironments output

# __1.11.172__ __2017-08-01__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy now supports the use of multiple tag groups in a single deployment group (an intersection of tags) to identify the instances for a deployment. When you create or update a deployment group, use the new ec2TagSet and onPremisesTagSet structures to specify up to three groups of tags. Only instances that are identified by at least one tag in each of the tag groups are included in the deployment group.

## __AWS Config__
  - ### Features
    - Added new API, GetDiscoveredResourceCounts, which returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in the given region for your AWS account.

## __Amazon EC2__
  - ### Features
    - Ec2 SpotInstanceRequestFulfilled waiter update

## __Amazon Pinpoint__
  - ### Features
    - This release of the Pinpoint SDK enables App management - create, delete, update operations, Raw Content delivery for APNs and GCM campaign messages and From Address override.

## __Amazon Simple Email Service__
  - ### Features
    - This update adds information about publishing email open and click events. This update also adds information about publishing email events to Amazon Simple Notification Service (Amazon SNS).

## __Elastic Load Balancing__
  - ### Features
    - Add TargetInService and TargetDeregistered waiters 

# __1.11.171__ __2017-07-31__
## __Amazon Inspector__
  - ### Features
    - Inspector's StopAssessmentRun API has been updated with a new input option - stopAction. This request parameter can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default value, and the previous behavior) stops the AWS agent data collection and begins the results evaluation for findings generation based on the data collected so far. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds a SendAutomationSignal API to SSM Service. This API is used to send a signal to an automation execution to change the current behavior or status of the execution.

# __1.11.170__ __2017-07-27__
## __Amazon EC2__
  - ### Features
    - The CreateDefaultVPC API enables you to create a new default VPC . You no longer need to contact AWS support, if your default VPC has been deleted.

## __Amazon Kinesis Analytics__
  - ### Features
    - Added additional exception types and clarified documentation.

# __1.11.169__ __2017-07-26__
## __Amazon CloudWatch__
  - ### Features
    - This release adds high resolution features to CloudWatch, with support for Custom Metrics down to 1 second and Alarms down to 10 seconds.

## __Amazon EC2__
  - ### Features
    - Amazon EC2 Elastic GPUs allow you to easily attach low-cost graphics acceleration to current generation EC2 instances. With Amazon EC2 Elastic GPUs, you can configure the right amount of graphics acceleration to your particular workload without being constrained by fixed hardware configurations and limited GPU selection.

# __1.11.168__ __2017-07-25__
## __AWS Cloud Formation__
  - ### Features
    - AWS CloudFormation StackSets enables you to manage stacks across multiple accounts and regions.

## __Amazon CloudDirectory__
  - ### Features
    - Cloud Directory adds support for additional batch operations.

# __1.11.167__ __2017-07-24__
## __Amazon AppStream__
  - ### Features
    - Amazon AppStream 2.0 image builders and fleets can now access applications and network resources that rely on Microsoft Active Directory (AD) for authentication and permissions. This new feature allows you to join your streaming instances to your AD, so you can use your existing AD user management tools. 

## __Amazon EC2__
  - ### Features
    - Spot Fleet tagging capability allows customers to automatically tag instances launched by Spot Fleet. You can use this feature to label or distinguish instances created by distinct Spot Fleets. Tagging your EC2 instances also enables you to see instance cost allocation by tag in your AWS bill.

## __Amazon Kinesis__
  - ### Bugfixes
    - **Breaking change** to remove an overload of Record#setEncryptionType that takes an enum due to serialization issues with AWS Lambda. See [Issue #1226](https://github.com/aws/aws-sdk-java/issues/1226) for more details.

# __1.11.166__ __2017-07-20__
## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR now includes the ability to use a custom Amazon Linux AMI and adjustable root volume size when launching a cluster.

# __1.11.165__ __2017-07-19__
## __AWS Budgets__
  - ### Features
    - Update budget Management API's to list/create/update RI_UTILIZATION type budget. Update budget Management API's to support DAILY timeUnit for RI_UTILIZATION type budget.

# __1.11.164__ __2017-07-17__
## __AWS Lambda__
  - ### Features
    - Lambda@Edge lets you run code closer to your end users without provisioning or managing servers. With Lambda@Edge, your code runs in AWS edge locations, allowing you to respond to your end users at the lowest latency. Your code is triggered by Amazon CloudFront events, such as requests to and from origin servers and viewers, and it is ready to execute at every AWS edge location whenever a request for content is received. You just upload your Node.js code to AWS Lambda and Lambda takes care of everything required to run and scale your code with high availability. You only pay for the compute time you consume - there is no charge when your code is not running.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Allows developers to configure user pools for email/phone based signup and sign-in.

# __1.11.163__ __2017-07-14__
## __AWS Application Discovery Service__
  - ### Features
    - Adding feature to the Export API for Discovery Service to allow filters for the export task to allow export based on per agent id.

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Update to Documentation Model For New Report Cadence / Reformat of Docs

## __Amazon EC2__
  - ### Features
    - New EC2 GPU Graphics instance

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug where a warning about unread data in the `S3ObjectInputStream` is still logged when `close()` is called, even after the stream has been aborted.

      Fixes [#1211](https://github.com/aws/aws-sdk-java/issues/1211)

# __1.11.162__ __2017-07-13__
## __Amazon API Gateway__
  - ### Features
    - Adds support for management of gateway responses.

## __Amazon EC2__
  - ### Features
    - X-ENI (or Cross-Account ENI) is a new feature that allows the attachment or association of Elastic Network Interfaces (ENI) between VPCs in different AWS accounts located in the same availability zone. With this new capability, service providers and partners can deliver managed solutions in a variety of new architectural patterns where the provider and consumer of the service are in different AWS accounts.

## __Amazon Lex Model Building Service__
  - ### Features
    - Fixed broken links to reference and conceptual content.

# __1.11.161__ __2017-07-12__
## __AWS Security Token Service__
  - ### Features
    - Added the ability to close `STSAssumeRoleSessionCredentialProvider`s and `STSSessionCredentialProvider`s in order to immediately release the thread used for asynchronous credential refreshes.

  - ### Bugfixes
    - Fixed thread and memory leak triggered by creating a large number of `STSAssumeRoleSessionCredentialProvider`s and `STSSessionCredentialProvider`s.

## __Amazon Simple Workflow Service (SWF)__
  - ### Features
    - Added support for attaching control data to Lambda tasks. Control data lets you attach arbitrary strings to your decisions and history events.

## __Auto Scaling__
  - ### Features
    - Auto Scaling now supports a new type of scaling policy called target tracking scaling policies that you can use to set up dynamic scaling for your application.

# __1.11.160__ __2017-07-06__
## __AWS Directory Service__
  - ### Features
    - You can now improve the resilience and performance of your Microsoft AD directory by deploying additional domain controllers. Added UpdateNumberofDomainControllers API that allows you to update the number of domain controllers you want for your directory, and DescribeDomainControllers API that allows you to describe the detailed information of each domain controller of your directory. Also added the 'DesiredNumberOfDomainControllers' field to the DescribeDirectories API output for Microsoft AD.

## __AWS Key Management Service (KMS)__
  - ### Features
    - This release of AWS Key Management Service introduces the ability to determine whether a key is AWS managed or customer managed.

## __Amazon Kinesis__
  - ### Features
    - You can now encrypt your data at rest within an Amazon Kinesis Stream using server-side encryption. Server-side encryption via AWS KMS makes it easy for customers to meet strict data management requirements by encrypting their data at rest within the Amazon Kinesis Streams, a fully managed real-time data processing service.

## __Amazon S3__
  - ### Features
    - Allow requester-pays access for list-objects requests.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Amazon EC2 Systems Manager now expands Patching support to Amazon Linux, Red Hat and Ubuntu in addition to the already supported Windows Server.

# __1.11.159__ __2017-07-05__
## __Amazon CloudWatch__
  - ### Features
    - We are excited to announce the availability of APIs and CloudFormation support for CloudWatch Dashboards. You can use the new dashboard APIs or CloudFormation templates to dynamically build and maintain dashboards to monitor your infrastructure and applications. There are four new dashboard APIs - PutDashboard, GetDashboard, DeleteDashboards, and ListDashboards APIs. PutDashboard is used to create a new dashboard or modify an existing one whereas GetDashboard is the API to get the details of a specific dashboard. ListDashboards and DeleteDashboards are used to get the names or delete multiple dashboards respectively. Getting started with dashboard APIs is similar to any other AWS APIs. The APIs can be accessed through AWS SDK or through CLI tools.

## __Amazon Route 53__
  - ### Features
    - Bug fix for InvalidChangeBatch exception.

# __1.11.158__ __2017-06-30__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Documentation updates for AWS Marketplace Commerce Analytics.

## __Amazon S3__
  - ### Features
    - Adding Object Tagging Header to MultipartUpload Initialization

# __1.11.157__ __2017-06-29__
## __Amazon CloudWatch Events__
  - ### Features
    - CloudWatch Events now allows different AWS accounts to share events with each other through a new resource called event bus. Event buses accept events from AWS services, other AWS accounts and PutEvents API calls. Currently all AWS accounts have one default event bus. To send events to another account, customers simply write rules to match the events of interest and attach an event bus in the receiving account as the target to the rule. The PutTargets API has been updated to allow adding cross account event buses as targets. In addition, we have released two new APIs - PutPermission and RemovePermission - that enables customers to add/remove permissions to their default event bus.

## __Amazon GameLift__
  - ### Features
    - Allow developers to download GameLift fleet creation logs to assist with debugging.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding Resource Data Sync support to SSM Inventory.<br/>New APIs:<br/>CreateResourceDataSync - creates a new resource data sync configuration<br/>ListResourceDataSync - lists existing resource data sync configurations<br/>DeleteResourceDataSync - deletes an existing resource data sync configuration.

# __1.11.156__ __2017-06-27__
## __AWS Service Catalog__
  - ### Features
    - Proper tagging of resources is critical to post-launch operations such as billing, cost allocation, and resource management. By using Service Catalog's TagOption Library, administrators can define a library of re-usable TagOptions that conform to company standards, and associate these with Service Catalog portfolios and products. Learn how to move your current tags to the new library, create new TagOptions, and view and associate your library items with portfolios and products. Understand how to ensure that the right tags are created on products launched through Service Catalog and how to provide users with defined selectable tags.

# __1.11.155__ __2017-06-23__
## __AWS Lambda__
  - ### Features
    - The Lambda Invoke API will now throw new exception InvalidRuntimeException (status code 502) for invokes with deprecated runtimes.

# __1.11.154__ __2017-06-22__
## __AWS CodePipeline__
  - ### Features
    - A new API, ListPipelineExecutions, enables you to retrieve summary information about the most recent executions in a pipeline, including pipeline execution ID, status, start time, and last updated time. You can request information for a maximum of 100 executions. Pipeline execution data is available for the most recent 12 months of activity.

## __AWS Database Migration Service__
  - ### Features
    - Added tagging for DMS certificates.

## __Amazon Lightsail__
  - ### Features
    - This release adds a new nextPageToken property to the result of the GetOperationsForResource API. Developers can now get the next set of items in a list by making subsequent calls to GetOperationsForResource API with the token from the previous call. This release also deprecates the nextPageCount property, which previously returned null (use the nextPageToken property instead). This release also deprecates the customImageName property on the CreateInstancesRequest class, which was previously ignored by the API.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports multivalue answers in response to DNS queries, which lets you route traffic approximately randomly to multiple resources, such as web servers. Create one multivalue answer record for each resource and, optionally, associate an Amazon Route 53 health check with each record, and Amazon Route 53 responds to DNS queries with up to eight healthy records.

## __Elastic Load Balancing__
  - ### Features
    - Add retry error state to InstanceInService waiter for ElasticLoadBalancer

# __1.11.153__ __2017-06-21__
## __AWS WAF__
  - ### Features
    - You can now create, edit, update, and delete a new type of WAF rule with a rate tracking component.

## __AWS WAF Regional__
  - ### Features
    - You can now create, edit, update, and delete a new type of WAF rule with a rate tracking component.

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Amazon DynamoDB Accelerator (DAX) is a fully managed, highly available, in-memory cache for DynamoDB that delivers up to a 10x performance improvement - from milliseconds to microseconds - even at millions of requests per second. DAX does all the heavy lifting required to add in-memory acceleration to your DynamoDB tables, without requiring developers to manage cache invalidation, data population, or cluster management.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding hierarchy support to the SSM Parameter Store API. Added support tor tagging. New APIs: GetParameter - retrieves one parameter, DeleteParameters - deletes multiple parameters (max number 10), GetParametersByPath - retrieves parameters located in the hierarchy. Updated APIs: PutParameter - added ability to enforce parameter value by applying regex (AllowedPattern), DescribeParameters - modified to support Tag filtering.

# __1.11.152__ __2017-06-20__
## __Amazon WorkDocs__
  - ### Features
    - This release provides a new API to retrieve the activities performed by WorkDocs users.

# __1.11.151__ __2017-06-19__
## __AWS Organizations__
  - ### Features
    - Improvements to Exception Modeling

# __1.11.150__ __2017-06-16__
## __AWS X-Ray__
  - ### Features
    - Add a response time histogram to the services in response of GetServiceGraph API.

# __1.11.149__ __2017-06-15__
## __AWS IoT__
  - ### Features
    - Revert the last release: remove CertificatePem from DescribeCertificate API.

## __AWS Service Catalog__
  - ### Features
    - Added ProvisioningArtifactSummaries to DescribeProductAsAdmin's output to show the provisioning artifacts belong to the product. Allow filtering by SourceProductId in SearchProductsAsAdmin for AWS Marketplace products. Added a verbose option to DescribeProvisioningArtifact to display the CloudFormation template used to create the provisioning artifact.Added DescribeProvisionedProduct API. Changed the type of ProvisionedProduct's Status to be distinct from Record's Status. New ProvisionedProduct's Status are AVAILABLE, UNDER_CHANGE, TAINTED, ERROR. Changed Record's Status set of values to CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED.

## __Amazon EC2__
  - ### Features
    - Adds API to describe Amazon FPGA Images (AFIs) available to customers, which includes public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts for which you have load permissions.

## __Amazon EC2 Container Service__
  - ### Features
    - Added support for cpu, memory, and memory reservation container overrides on the RunTask and StartTask APIs.

# __1.11.148__ __2017-06-14__
## __Amazon CloudDirectory__
  - ### Features
    - Documentation update for Cloud Directory

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports automatic scaling of read and write throughput capacity for DynamoDB tables and global secondary indexes.

# __1.11.147__ __2017-06-13__
## __AWS Config__
  - ### Features
    - With this release AWS Config supports the Amazon CloudWatch alarm resource type.

# __1.11.146__ __2017-06-12__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - API Update for RDS: this update enables copy-on-write, a new Aurora MySQL Compatible Edition feature that allows users to restore their database, and support copy of TDE enabled snapshot cross region.

# __1.11.145__ __2017-06-09__
## __AWS OpsWorks__
  - ### Features
    - Tagging Support for AWS OpsWorks Stacks

# __1.11.144__ __2017-06-08__
## __AWS IoT__
  - ### Features
    - In addition to using certificate ID, AWS IoT customers can now obtain the description of a certificate with the certificate PEM.

## __Amazon Pinpoint__
  - ### Features
    - Starting today Amazon Pinpoint adds SMS Text and Email Messaging support in addition to Mobile Push Notifications, providing developers, product managers and marketers with multi-channel messaging capabilities to drive user engagement in their applications. Pinpoint also enables backend services and applications to message users directly and provides advanced user and app analytics to understand user behavior and messaging performance.

## __Amazon Rekognition__
  - ### Features
    - API Update for AmazonRekognition: Adding RecognizeCelebrities API

# __1.11.143__ __2017-06-07__
## __AWS CodeBuild__
  - ### Features
    - Add support to APIs for privileged containers. This change would allow performing privileged operations like starting the Docker daemon inside builds possible in custom docker images.

## __AWS Greengrass__
  - ### Features
    - AWS Greengrass is software that lets you run local compute, messaging, and device state synchronization for connected devices in a secure way. With AWS Greengrass, connected devices can run AWS Lambda functions, keep device data in sync, and communicate with other devices securely even when not connected to the Internet. Using AWS Lambda, Greengrass ensures your IoT devices can respond quickly to local events, operate with intermittent connections, and minimize the cost of transmitting IoT data to the cloud.

# __1.11.142__ __2017-06-06__
## __AWS Certificate Manager__
  - ### Features
    - Documentation update for AWS Certificate Manager.

## __AWS IoT__
  - ### Features
    - Update client side validation for SalesForce action.

## __Amazon CloudFront__
  - ### Features
    - Doc update to fix incorrect prefix in S3OriginConfig

# __1.11.141__ __2017-06-05__
## __AWS IoT__
  - ### Features
    -  Added Salesforce action to IoT Rules Engine.

## __Amazon AppStream__
  - ### Features
    - AppStream 2.0 Custom Security Groups allows you to easily control what network resources your streaming instances and images have access to. You can assign up to 5 security groups per Fleet to control the inbound and outbound network access to your streaming instances to specific IP ranges, network protocols, or ports.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug where a bucket's region is not marshalled from a 301 error response if it includes a body. Fixes [#1151](https://github.com/aws/aws-sdk-java/issues/1151).

## __Auto Scaling__
  - ### Features
    - Autoscaling resource model update.

# __1.11.140__ __2017-06-02__
## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Analytics publishes error messages CloudWatch logs in case of application misconfigurations

## __Amazon S3__
  - ### Bugfixes
    - Fixes bug where TransferManager#download fails when requesterPays is enabled on GetObjectRequest. https://github.com/aws/aws-sdk-java/issues/1175

## __Amazon WorkDocs__
  - ### Features
    - This release includes new APIs to manage tags and custom metadata on resources and also new APIs to add and retrieve comments at the document level.

# __1.11.139__ __2017-06-01__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy has improved how it manages connections to GitHub accounts and repositories. You can now create and store up to 25 connections to GitHub accounts in order to associate AWS CodeDeploy applications with GitHub repositories. Each connection can support multiple repositories. You can create connections to up to 25 different GitHub accounts, or create more than one connection to a single account. The ListGitHubAccountTokenNames command has been introduced to retrieve the names of stored connections to GitHub accounts that you have created. The name of the connection to GitHub used for an AWS CodeDeploy application is also included in the ApplicationInfo structure.  Two new fields, lastAttemptedDeployment and lastSuccessfulDeployment, have been added to DeploymentGroupInfo to improve the handling of deployment group information in the AWS CodeDeploy console. Information about these latest deployments can also be retrieved using the GetDeploymentGroup and BatchGetDeployment group requests. Also includes a region update  (us-gov-west-1).

## __Amazon Cognito Identity Provider__
  - ### Features
    - Added support within Amazon Cognito User Pools for 1) a customizable hosted UI for user sign up and sign in and 2) integration of external identity providers.

## __Amazon Lex Model Building Service__
  - ### Features
    - Updated documentation and added examples for Amazon Lex Model Building Service.

## __Elastic Load Balancing__
  - ### Features
    - Update the existing DescribeRules API to support pagination.

# __1.11.138__ __2017-05-31__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Amazon RDS customers can now easily and quickly stop and start their DB instances.

# __1.11.137__ __2017-05-30__
## __Amazon CloudDirectory__
  - ### Features
    - Cloud Directory has launched support for Typed Links, enabling customers to create object-to-object relationships that are not hierarchical in nature. Typed Links enable customers to quickly query for data along these relationships. Customers can also enforce referential integrity using Typed Links, ensuring data in use is not inadvertently deleted.

# __1.11.136__ __2017-05-25__
## __Amazon AppStream__
  - ### Features
    - Support added for persistent user storage, backed by S3.

## __Amazon Rekognition__
  - ### Features
    - Updated the CompareFaces API response to include orientation information, unmatched faces, landmarks, pose, and quality of the compared faces.

# __1.11.135__ __2017-05-24__
## __AWS Identity and Access Management (IAM)__
  - ### Features
    - The unique ID and access key lengths were extended from 32 to 128

## __AWS Security Token Service (STS)__
  - ### Features
    - The unique ID and access key lengths were extended from 32 to 128.

## __AWS Storage Gateway__
  - ### Features
    - Two Storage Gateway data types, Tape and TapeArchive, each have a new response element, TapeUsedInBytes. This element helps you manage your virtual tapes. By using TapeUsedInBytes, you can see the amount of data written to each virtual tape.

# __1.11.134__ __2017-05-23__
## __AWS Database Migration Service__
  - ### Features
    - This release adds support for using Amazon S3 and Amazon DynamoDB as targets for database migration, and using MongoDB as a source for database migration. For more information, see the AWS Database Migration Service documentation.

# __1.11.133__ __2017-05-22__
## __AWS Resource Groups Tagging API__
  - ### Features
    - You can now specify the number of resources returned per page in GetResources operation, as an optional parameter, to easily manage the list of resources returned by your queries.

# __1.11.132__ __2017-05-18__
## __Amazon Athena__
  - ### Features
    - This release adds support for Amazon Athena. Amazon Athena is an interactive query service that makes it easy to analyze data in Amazon S3 using standard SQL. Athena is serverless, so there is no infrastructure to manage, and you pay only for the queries that you run.

## __Amazon Lightsail__
  - ### Features
    - This release adds new APIs that make it easier to set network port configurations on Lightsail instances. Developers can now make a single request to both open and close public ports on an instance using the PutInstancePublicPorts operation.

# __1.11.131__ __2017-05-17__
## __Amazon CloudWatch Events__
  - ### Features
    - Various CloudWatch Events documentation updates.

## __Amazon CloudWatch Logs__
  - ### Features
    - Various CloudWatch Logs documentation updates.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new German voice "Vicki"

## __Auto Scaling__
  - ### Features
    - Various Auto Scaling documentation updates

# __1.11.130__ __2017-05-16__
## __AWS CodeDeploy__
  - ### Features
    - This release introduces the previousRevision field in the responses to the GetDeployment and BatchGetDeployments actions. previousRevision provides information about the application revision that was deployed to the deployment group before the most recent successful deployment.  Also, the fileExistsBehavior parameter has been added for CreateDeployment action requests. In the past, if the AWS CodeDeploy agent detected files in a target location that weren't part of the application revision from the most recent successful deployment, it would fail the current deployment by default. This new parameter provides options for how the agent handles these files: fail the deployment, retain the content, or overwrite the content.

## __AWS Key Management Service (KMS)__
  - ### Features
    - Update documentation for KMS.

## __AWS Step Functions__
  - ### Bugfixes
    - Fixes [Issue 1150]( https://github.com/aws/aws-sdk-java/issues/1150) by preserving explicit null values for InputPath, OutputPath, and ResultPath.

## __Amazon GameLift__
  - ### Features
    - Allow developers to specify how metrics are grouped in CloudWatch for their GameLift fleets. Developers can also specify how many concurrent game sessions activate on a per-instance basis.

## __Amazon Inspector__
  - ### Features
    - Adds ability to produce an assessment report that includes detailed and comprehensive results of a specified assessment run.

## __Amazon S3__
  - ### Bugfixes
    - All API methods in AmazonS3Client now call beforeClientExecution in the RequestHandler2 interface.

# __1.11.129__ __2017-05-15__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - UpdateAssociation API now supports updating document name and targets of an association. GetAutomationExecution API can return FailureDetails as an optional field to the StepExecution Object, which contains failure type, failure stage as well as other failure related information for a failed step.

# __1.11.128__ __2017-05-11__
## __AWS Organizations__
  - ### Features
    - AWS Organizations APIs that return an Account object now include the email address associated with the account's root user.

## __Amazon Lex Model Building Service__
  - ### Features
    - Releasing new DeleteBotVersion, DeleteIntentVersion and DeleteSlotTypeVersion APIs.

## __Elastic Load Balancing__
  - ### Features
    - Add a new API to allow customers to describe their account limits, such as load balancer limit, target group limit etc.

# __1.11.127__ __2017-05-09__
## __AWS SDK for Java__
  - ### Features
    - This change includes documentation updates for Amazon Workspaces and AWS CodeStar

# __1.11.126__ __2017-05-04__
## __AWS Lambda__
  - ### Features
    - Support for UpdateFunctionCode DryRun option

## __AWS Marketplace Entitlement Service__
  - ### Features
    - AWS Marketplace Entitlement Service enables AWS Marketplace sellers to determine the capacity purchased by their customers.

## __AWS Organizations__
  - ### Bugfixes
    - Updated model classes to match AWS Organizations API [specification](http://docs.aws.amazon.com/organizations/latest/APIReference/Welcome.html). This includes the following updates to the model objects:

      #### Renamed Operation
      * `AWSOrganizations.enableFullControl` renamed to `AWSOrganizations.enableAllFeatures`
        * Previously this operation would never have completed successfully.

      #### Operation Exceptions Changed
      * `AWSOrganizations.acceptHandshake`
         * Exceptions Removed:
            * `AlreadyInOrganizationException` 
            * `ConstraintViolationException`
            * `OrganizationFromDifferentSellerOfRecordException`
         * Exceptions Added:
            * `HandshakeConstraintViolationException` (new to model)
            * `HandshakeAlreadyInStateException` (new to model)
            * `ConcurrentModificationException`
      * `AWSOrganizations.cancelHandshake`
         * Exception Added:
            * `HandshakeAlreadyInStateException` (new to model)
      * `AWSOrganizations.declineHandshake`
         * Exception Added:
            * `HandshakeAlreadyInStateException` (new to model)
      * `AWSOrganizations.createOrganization`
         * Exception Removed:
            * `PaymentInstrumentRequiredException` 
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.createPolicy`
         * Exception Added:
            * `MalformedPolicyDocumentException`
      * `AWSOrganizations.moveAccount`
         * Exception Added:
            * `DuplicateAccountException`
      * `AWSOrganizations.inviteAccountToOrganization`
         * Exceptions Removed:
            * `ConstraintViolationException`
            * `InvitationsDisabledDuringOrganizationModeChangeException`
         * Exception Added:
            * `HandshakeConstraintViolationException`
      * `AWSOrganizations.leaveOrganization`
         * Exception Removed:
            * `AccountCannotLeaveOrganizationException`
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.removeAccountFromOrganization`
         * Exception Removed:
            * `AccountCannotLeaveOrganizationException`
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.updatePolicy`
         * Exception Added:
            * `ConstraintViolationException`

      #### Deprecated Exceptions
      The following exceptions are no longer in use and have been deprecated:
      * `AccountCannotLeaveOrganizationException`
      * `FullControlAlreadyEnabledException`
      * `PaymentInstrumentRequiredException`
      * `OrganizationFromDifferentSellerOfRecordException`
      * `InvitationsDisabledDuringOrganizationModeChangeException`

      #### Model Changes
      * `mode` property on `Organization` object renamed to `featureSet`
      * `mode` property on `CreateOrganizationRequest` object renamed to `featureSet`
      * Enum `ActionType` values renamed:
        * `ENABLE_FULL_CONTROL` renamed to `ENABLE_ALL_FEATURES`
        * `APPROVE_FULL_CONTROL` renamed to `APPROVE_ALL_FEATURES`
      * Enum `OrganizationMode` removed

## __Amazon EC2 Container Service__
  - ### Features
    - Exposes container instance registration time in ECS:DescribeContainerInstances.

## __Amazon Relational Database Service (RDS)__
  - ### Bugfixes
    - Fixed the DBInstanceAvailable waiter. Previously it would always throw a NullPointerException.

## __Amazon S3__
  - ### Features
    - Added the ability to specify a filter to `TransferManager`'s `downloadDirectory` operation.

  - ### Bugfixes
    - Fixed possible security issue in `TransferManager`s `downloadDirectory` operation where files could be downloaded to a directory outside the destination directory if the key contained relative paths.

# __1.11.125__ __2017-04-28__
## __AWS Cloud Formation__
  - ### Features
    - API update for CloudFormation: New optional parameter ClientRequestToken which can be used as an idempotency token to safely retry certain operations as well as tagging StackEvents.

## __Amazon Import/Export Snowball__
  - ### Features
    - The Snowball API has a new exception that can be thrown for list operation requests.

## __Amazon Rekognition__
  - ### Features
    - Fix for missing file type check

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - The DescribeDBClusterSnapshots API now returns a SourceDBClusterSnapshotArn field which identifies the source DB cluster snapshot of a copied snapshot.

## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Adding server-side encryption (SSE) support to SQS by integrating with AWS KMS; adding new queue attributes to SQS CreateQueue, SetQueueAttributes and GetQueueAttributes APIs to support SSE.

# __1.11.124__ __2017-04-26__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - With Amazon Relational Database Service (Amazon RDS) running MySQL or Amazon Aurora, you can now authenticate to your DB instance using IAM database authentication.

# __1.11.123__ __2017-04-21__
## __AWS SDK for Java__
  - ### Features
    - Added the ability to override the proxy authentication methods used for requests.

## __Amazon AppStream__
  - ### Features
    - The new feature named "Default Internet Access" will enable Internet access from AppStream 2.0 instances - image builders and fleet instances. Admins will check a flag either through AWS management console for AppStream 2.0 or through API while creating an image builder or while creating/updating a fleet.

## __Amazon Kinesis__
  - ### Features
    - Adds a new waiter, StreamNotExists, to Kinesis.

## __Amazon S3__
  - ### Bugfixes
    - Fix bug to make standard AmazonS3ClientBuilder use S3CredentialsProviderChain instead of DefaultAWSCredentialsProviderChain.

# __1.11.122__ __2017-04-20__
## __AWS Device Farm__
  - ### Features
    - API Update for AWS Device Farm: Support for Deals and Promotions 

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect.

## __AWS Key Management Service (KMS)__
  - ### Features
    - Doc-only update for Key Management Service (KMS): Update docs for GrantConstraints and GenerateRandom

## __Amazon Route 53__
  - ### Features
    - SDK documentation now includes examples for ChangeResourceRecordSets for all types of resource record set, such as weighted, alias, and failover.

## __Amazon Route 53 Domains__
  - ### Features
    - Adding examples and other documentation updates.

## __Elastic Load Balancing__
  - ### Features
    - Adding LoadBalancersDeleted waiter for Elasticloadbalancingv2

# __1.11.121__ __2017-04-19__
## __AWS CodeStar__
  - ### Features
    - AWS CodeStar is a cloud-based service for creating, managing, and working with software development projects on AWS. An AWS CodeStar project creates and integrates AWS services for your project development toolchain. AWS CodeStar also manages the permissions required for project users.

## __AWS Identity and Access Management (IAM)__
  - ### Features
    - This changes introduces a new IAM role type, Service Linked Role, which works like a normal role but must be managed via services' control. 

## __AWS Lambda__
  - ### Features
    - Lambda integration with AWS X-Ray service to enable customers to enable tracing for the Lambda functions and send trace information to the AWS X-Ray service.

## __Amazon API Gateway__
  - ### Features
    - Add support for "embed" property.

## __Amazon EC2__
  - ### Features
    - Adds support for creating an Amazon FPGA Image (AFI) from a specified design checkpoint (DCP).

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex is a service for building conversational interfaces into any application using voice and text.

## __Amazon Polly__
  - ### Features
    - API Update for Amazon Polly: Add support for speech marks

## __Amazon Rekognition__
  - ### Features
    - Given an image, the API detects explicit or suggestive adult content in the image and returns a list of corresponding labels with confidence scores, as well as a taxonomy (parent-child relation) for each label.

# __1.11.120__ __2017-04-18__
## __AWS Lambda__
  - ### Features
    - You can use tags to group and filter your Lambda functions, making it easier to analyze them for billing allocation purposes. For more information, see Tagging Lambda Functions.  You can now write or upgrade your Lambda functions using Python version 3.6. For more information, see Programming Model for Authoring Lambda Functions in Python. Note: Features will be rolled out in the US regions on 4/19.

# __1.11.119__ __2017-04-11__
## __AWS Batch__
  - ### Features
    - API Update for AWS Batch: Customer provided AMI for MANAGED Compute Environment 

## __AWS OpsWorks__
  - ### Features
    - Cloudwatch Logs agent configuration can now be attached to OpsWorks Layers using CreateLayer and UpdateLayer. OpsWorks will then automatically install and manage the CloudWatch Logs agent on the instances part of the OpsWorks Layer.

## __Amazon API Gateway__
  - ### Features
    - API Gateway request validators

## __Amazon GameLift__
  - ### Features
    - Allows developers to utilize an improved workflow when calling our Queues API and introduces a new feature that allows developers to specify a maximum allowable latency per Queue.

## __Amazon S3__
  - ### Bugfixes
    - Fix a race condition that can occur with multiple calls to `CopyMonitor#setFuture` and `UploadMonitor#setFuture` that can cause an infinite loop in `AbstractTransfer#waitForCompletion`.

      This fixes [#1102](https://github.com/aws/aws-sdk-java/issues/1102)

# __1.11.118__ __2017-04-07__
## __Amazon Redshift__
  - ### Features
    - This update adds the GetClusterCredentials API which is used to get temporary login credentials to the cluster. AccountWithRestoreAccess now has a new member AccountAlias, this is the identifier of the AWS support account authorized to restore the specified snapshot. This is added to support the feature where the customer can share their snapshot with the Amazon Redshift Support Account without having to manually specify the AWS Redshift Service account ID on the AWS Console/API.

# __1.11.117__ __2017-04-06__
## __Elastic Load Balancing__
  - ### Features
    - Adds support for a new host-header condition in CreateRule and ModifyRule

# __1.11.116__ __2017-04-05__
## __Amazon ElastiCache__
  - ### Features
    - ElastiCache added support for testing the Elasticache Multi-AZ feature with Automatic Failover.

# __1.11.115__ __2017-04-04__
## __Amazon CloudWatch__
  - ### Features
    - Amazon Web Services announced the immediate availability of two additional alarm configuration rules for Amazon CloudWatch Alarms. The first rule is for configuring missing data treatment. Customers have the options to treat missing data as alarm threshold breached, alarm threshold not breached, maintain alarm state and the current default treatment. The second rule is for alarms based on percentiles metrics that can trigger unnecassarily if the percentile is calculated from a small number of samples. The new rule can treat percentiles with low sample counts as same as missing data. If the first rule is enabled, the same treatment will be applied when an alarm encounters a percentile with low sample counts.

# __1.11.114__ __2017-04-03__
## __Amazon Lex__
  - ### Features
    - Adds support to PostContent for speech input

# __1.11.113__ __2017-03-31__
## __Amazon CloudDirectory__
  - ### Features
    - ListObjectAttributes now supports filtering by facet.

# __1.11.112__ __2017-03-30__
## __AWS Cloud Formation__
  - ### Features
    - Adding paginators for ListExports and ListImports

## __AWS Resource Groups Tagging API__
  - ### Features
    - Resource Groups Tagging APIs can help you organize your resources and enable you to simplify resource management, access management, and cost allocation.

## __AWS Storage Gateway__
  - ### Features
    - File gateway mode in AWS Storage gateway provides access to objects in S3 as files on a Network File System (NFS) mount point. Once a file share is created, any changes made externally to the S3 bucket will not be reflected by the gateway. Using the cache refresh feature in this update, the customer can trigger an on-demand scan of the keys in their S3 bucket and refresh the file namespace cached on the gateway. It takes as an input the fileShare ARN and refreshes the cache for only that file share. Additionally there is new functionality on file gateway that allows you configure what squash options they would like on their file share, this allows a customer to configure their gateway to not squash root permissions. This can be done by setting options in NfsOptions for CreateNfsFileShare and UpdateNfsFileShare APIs.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront now supports user configurable HTTP Read and Keep-Alive Idle Timeouts for your Custom Origin Servers

# __1.11.111__ __2017-03-28__
## __AWS Batch__
  - ### Features
    - Customers can now provide a retryStrategy as part of the RegisterJobDefinition and SubmitJob API calls. The retryStrategy object has a number value for attempts. This is the number of non successful executions before a job is considered FAILED. In addition, the JobDetail object now has an attempts field and shows all execution attempts.

## __Amazon EC2__
  - ### Features
    - Customers can now tag their Amazon EC2 Instances and Amazon EBS Volumes at the time of their creation. You can do this from the EC2 Instance launch wizard or through the RunInstances or CreateVolume APIs. By tagging resources at the time of creation, you can eliminate the need to run custom tagging scripts after resource creation. In addition, you can now set resource-level permissions on the CreateVolume, CreateTags, DeleteTags, and the RunInstances APIs. This allows you to implement stronger security policies by giving you more granular control over which users and groups have access to these APIs. You can also enforce the use of tagging and control what tag keys and values are set on your resources. When you combine tag usage and resource-level IAM policies together, you can ensure your instances and volumes are properly secured upon creation and achieve more accurate cost allocation reporting. These new features are provided at no additional cost. 

# __1.11.110__ __2017-03-27__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updated validation rules for SendCommand and RegisterTaskWithMaintenanceWindow APIs.

# __1.11.109__ __2017-03-23__
## __AWS CloudTrail__
  - ### Features
    - Doc-only Update for CloudTrail: Add required parameters for GetEventSelectors and PutEventSelectors

## __Application Auto Scaling__
  - ### Features
    - Application AutoScaling is launching support for a new target resource (AppStream 2.0 Fleets) as a scalable target.

# __1.11.108__ __2017-03-22__
## __AWS Application Discovery Service__
  - ### Features
    - Adds export configuration options to the AWS Discovery Service API.

## __AWS Lambda__
  - ### Features
    - Adds support for new runtime Node.js v6.10 for AWS Lambda service

## __Elastic Load Balancing__
  - ### Features
    - Adding waiters for Elastic Load Balancing V2

# __1.11.107__ __2017-03-21__
## __AWS Direct Connect__
  - ### Deprecations
    - Deprecated DescribeConnectionLoa, DescribeInterconnectLoa, AllocateConnectionOnInterconnect and DescribeConnectionsOnInterconnect operations in favor of DescribeLoa, DescribeLoa, AllocateHostedConnection and DescribeHostedConnections respectively.

# __1.11.106__ __2017-03-20__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - This update adds a new data set, us_sales_and_use_tax_records, which enables AWS Marketplace sellers to programmatically access to their U.S. Sales and Use Tax report data.

## __AWS SDK for Java__
  - ### Bugfixes
    - `XMLStreamException`s encountered during XML response parsing that are caused by `IOException` are now wrapped in `IOException` before being thrown so that they are passed to the configured retry policies.

      This fixes [#1068](https://github.com/aws/aws-sdk-java/issues/1068).

## __Amazon API Gateway__
  - ### Bugfixes
    - Fix a bug that forced all requests to have an `Accept` header value of `application/json`.

## __Amazon EC2__
  - ### Deprecations
    - Deprecated no-args `revokeSecurityGroupIngress` method on `AmazonEC2` which will always fail. Fixes [#1059](https://github.com/aws/aws-sdk-java/issues/1059).

## __Amazon Pinpoint__
  - ### Features
    - Amazon Pinpoint User Segmentation * Added ability to segment endpoints by user attributes in addition to endpoint attributes.

      Amazon Pinpoint Event Stream Preview * Added functionality to publish raw app analytics and campaign events data as events streams to Kinesis and Kinesis Firehose * The feature provides developers with increased flexibility of exporting raw events to S3, Redshift, Elasticsearch using a Kinesis Firehose stream or enable real time event processing use cases using a Kinesis stream.

## __Amazon S3__
  - ### Bugfixes
    - Add the `sequencer` property to `S3ObjectEntity`.
    - Correctly unwraps nested levels of ExecutionException. Fixes [#1046](https://github.com/aws/aws-sdk-java/issues/1046).
    - Remove unnecessary call to `File#deleteOnExit()` in `MultiFileOutputStream`. This avoids leaking memory during long running applications that use `AmazonS3EncryptionClient#uploadObject`.

  - ### Deprecations
    - Deprecate the `S3ObjectEntity(String key, Long size, String eTag, String versionId)` constructor in favor of `S3ObjectEntity(String key, Long size, String eTag, String versionId, String sequencer)`.

## __Core__
  - ### Bugfixes
    - Adding `shutdown` to service waiters so that running `ExecutorService` can be shutdown from the client. Fixes [#1056](https://github.com/aws/aws-sdk-java/issues/1056). For example :

      ```java
      final AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();
      try {
          ec2.waiters().instanceExists().runAsync(
              new WaiterParameters<>(new DescribeInstancesRequest()), 
              new WaiterHandler() {...}
          );
      } finally {
          ec2.shutdown(); //this will now shutdown the waiters as well as the client    
      }
      ```

# __1.11.105__ __2017-03-13__
## __AWS Device Farm__
  - ### Features
    - Network shaping allows users to simulate network connections and conditions while testing their Android, iOS, and web apps with AWS Device Farm.

## __Amazon CloudWatch Events__
  - ### Features
    - This update extends Target Data Type for configuring Target behavior during invocation.

# __1.11.104__ __2017-03-10__
## __Amazon EMR__
  - ### Features
    - This release includes support for instance fleets in Amazon EMR.

# __1.11.103__ __2017-03-09__
## __Amazon API Gateway__
  - ### Features
    - API Gateway has added support for ACM certificates on custom domain names. Both Amazon-issued certificates and uploaded third-part certificates are supported.

## __Amazon CloudDirectory__
  - ### Features
    - Introduces a new Cloud Directory API that enables you to retrieve all available parent paths for any type of object (a node, leaf node, policy node, and index node) in a hierarchy.

# __1.11.102__ __2017-03-08__
## __Core__
  - ### Bugfixes
    - Removing @JsonIgnore annotation introduced in 1.11.101 from Enum helper setters on models (eg https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-ecs/src/main/java/com/amazonaws/services/ecs/model/PortMapping.java#L351) as this caused a regression that affected some waiters.

# __1.11.101__ __2017-03-08__
## __AWS SDK for Java__
  - ### Features
    - The service models are no longer included with individual SDK client modules. This reduces the overall size of the SDK JARs as they can be quite large. For users wishing to inspect them, the model files may still be found in the [aws-java-sdk-models](./aws-java-sdk-models) module.

## __AWS Step Functions__
  - ### Bugfixes
    - Fixed an issue where a ChoiceState with no Default transition was throwing a NPE during validation.

## __Amazon WorkDocs__
  - ### Features
    - **(New Service)** The Administrative SDKs for Amazon WorkDocs provides full administrator level access to WorkDocs site resources, allowing developers to integrate their applications to manage WorkDocs users, content and permissions programmatically

# __1.11.100__ __2017-03-07__
## __Amazon RDS__
  - ### Features
    - Add support to using encrypted clusters as cross-region replication masters.
    - Update CopyDBClusterSnapshot API to support encrypted cross region copy of Aurora cluster snapshots.

# __1.11.99__ __2017-03-06__
## __AWS Budgets__
  - ### Features
    - When creating or editing a budget via the AWS Budgets API you can define notifications that are sent to subscribers when the actual or forecasted value for cost or usage exceeds the notificationThreshold associated with the budget notification object. Starting today, the maximum allowed value for the notificationThreshold was raised from 100 to 300. This change was made to give you more flexibility when setting budget notifications.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - OpsWorks for Chef Automate has added a new field "AssociatePublicIpAddress" to the CreateServer request, "CloudFormationStackArn" to the Server model and "TERMINATED" server state.

## __Amazon S3__
  - ### Features
    - Add improved detection of end-of-stream for object input streams and improved logging when the stream is aborted.

  - ### Bugfixes
    - Fix a bug in `TransferManager` where the Requester Pays flag set on a `CopyObjectRequest` or `PutObjectRequest` was not being preserved in the multipart copy or upload requests if the original request was promoted to multipart.

# __1.11.98__ __2017-02-27__
## __AWS Organizations__
  - ### Features
    - **(New Service)** AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an organization and centrally manage your accounts and their resources.

## __Amazon DynamoDB__
  - ### Features
    - Time to Live (TTL) is a feature that allows you to define when items in a table expire and can be purged from the database, so that you don't have to track expired data and delete it manually. With TTL enabled on a DynamoDB table, you can set a timestamp for deletion on a per-item basis, allowing you to limit storage usage to only those records that are relevant.

## __Amazon Identity and Access Management__
  - ### Features
    - This release adds support for AWS Organizations service control policies (SCPs) to SimulatePrincipalPolicy operation. If there are SCPs associated with the simulated user's account, their effect on the result is captured in the OrganizationDecisionDetail element in the EvaluationResult.

## __Amazon Mechanical Turk__
  - ### Features
    - **(New Service)** Amazon Mechanical Turk is a web service that provides an on-demand, scalable, human workforce to complete jobs that humans can do better than computers, for example, recognizing objects in photos.

# __1.11.97__ __2017-02-24__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixes a **serious regression** introduced in 1.11.94 where an overridden Content-Type was not being respected. This can cause issues with Amazon CloudSearch Domains, see [Issue [#1034](https://github.com/aws/aws-sdk-java/issues/1034)](https://github.com/aws/aws-sdk-java/issues/1034) for more details.

## __Amazon Elasticsearch Service__
  - ### Features
    - Added three new API calls to existing Amazon Elasticsearch service to expose Amazon Elasticsearch imposed limits to customers

# __1.11.96__ __2017-02-23__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed bug reported in [Issue #1018](https://github.com/aws/aws-sdk-java/issues/1018) where CRC32 was not always calculated correctly.

## __Amazon EC2__
  - ### Features
    - New EC2 I3 instance type

# __1.11.95__ __2017-02-22__
## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk adds support for creating and managing custom platform.

## __Amazon Cloud Directory__
  - ### Features
    - ListObjectAttributes documentation updated based on forum feedback

## __Amazon GameLift__
  - ### Features
    - Allow developers to configure global queues for creating GameSessions. Allow PlayerData on PlayerSessions to store player-specific data.

## __Amazon Route 53__
  - ### Features
    - Added support for operations CreateVPCAssociationAuthorization and DeleteVPCAssociationAuthorization to throw a ConcurrentModification error when a conflicting modification occurs in parallel to the authorizations in place for a given hosted zone.

# __1.11.94__ __2017-02-22__
## __AWS SDK for Java__
  - ### Features
    - Major refactoring of marshallers for all JSON based services. This may have different performance characteristics than previous releases.

## __Amazon EC2__
  - ### Features
    - Added the billingProduct parameter to the RegisterImage API.

# __1.11.93__ __2017-02-17__
## __AWS Direct Connect__
  - ### Features
    - This update will introduce the ability for Direct Connect customers to take advantage of Link Aggregation (LAG). This allows you to bundle many individual physical interfaces into a single logical interface, referred to as a LAG. This makes administration much simpler as the majority of configuration is done on the LAG while you are free to add or remove physical interfaces from the bundle as bandwidth demand increases or decreases. A concrete example of the simplification added by LAG is that customers need only a single BGP session as opposed to one session per physical connection.

# __1.11.92__ __2017-02-16__
## __AWS Config__
  - ### Features
    - AWS Config now supports a new test mode for the PutEvaluations API. Set the TestMode parameter to true in your custom rule to verify whether your AWS Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and evaluation results are not sent to AWS Config.

## __Amazon Cognito Identity__
  - ### Features
    - Allow createIdentityPool and updateIdentityPool API to set server side token check value on identity pool.

# __1.11.91__ __2017-02-15__
## __AWS Key Management Service__
  - ### Features
    - This release of AWS Key Management Service introduces the ability to tag keys. Tagging keys can help you organize your keys and track your KMS costs in the cost allocation report. This release also increases the maximum length of a key ID to accommodate ARNs that include a long key alias.

## __AWS SDK for Java for OSGi__
  - ### Bugfixes
    - Fixing [Issue #979](https://github.com/aws/aws-sdk-java/issues/979) by including the jmespath-java module in the OSGi bundle.

## __Amazon Glacier__
  - ### Features
    - Introduce `ArchiveTransferManaggerBuilder`. This builder allows using references to `AmazonGlacier`, `AmazonSNS` and AmazonSQS` rather than the concrete implementations.

  - ### Deprecations
    - Deprecate all constructors for `ArchiveTransferManager`.

# __1.11.90__ __2017-02-14__
## __Amazon EC2__
  - ### Features
    - Adds support for the new Modify Volumes apis.

# __1.11.89__ __2017-02-10__
## __AWS Storage Gateway__
  - ### Features
    - File gateway mode in AWS Storage gateway provides access to objects in S3 as files on a Network File System (NFS) mount point. This is done by creating Nfs file shares using existing APIs CreateNfsFileShare. Using the feature in this update, the customer can restrict the clients that have read/write access to the gateway by specifying the list of clients as a list of IP addresses or CIDR blocks. This list can be specified using the API CreateNfsFileShare while creating new file shares, or UpdateNfsFileShare while update existing file shares. To find out the list of clients that have access, the existing API DescribeNfsFileShare will now output the list of clients that have access.

# __1.11.88__ __2017-02-09__
## __Amazon EC2__
  - ### Features
    - This feature allows customers to associate an IAM profile to running instances that do not have any.

## __Amazon Rekognition__
  - ### Features
    - DetectFaces and IndexFaces operations now return an estimate of the age of the face as an age range.

# __1.11.87__ __2017-02-08__
## __Amazon Lex__
  - ### Features
    - **(NewService)** Amazon Lex is a service for building conversational interactions into any application using voice or text.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug in `TransferManager` where the [`TransferManager#copy`](http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/s3/transfer/TransferManager.html#copy-com.amazonaws.services.s3.model.CopyObjectRequest-) method was retrieving the metadata for the latest version of the source object even when supplying a specific version via `CopyObjectRequest#withSourceVersionId`.

      This fixes Issue [#1009](https://github.com/aws/aws-sdk-java/issues/1009).
    - Fix an integer overflow bug in [`LegacyS3ProgressListener`](http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/s3/model/LegacyS3ProgressListener.html). Note that this class is deprecated and users are discouraged from using it.

      This fixes Issue [#1008](https://github.com/aws/aws-sdk-java/issues/1008).

# __1.11.86__ __2017-01-26__
## __AWS CodeDeploy__
  - ### Features
    - This release of AWS CodeDeploy introduces support for blue/green deployments. In a blue/green deployment, the current set of instances in a deployment group is replaced by new instances that have the latest application revision installed on them. After traffic is rerouted behind a load balancer to the replacement instances, the original instances can be terminated automatically or kept running for other uses.

## __AWS Step Functions__
  - ### Features
    - Initial release of a fluent builder API to create state machine JSON documents.

## __Amazon CloudDirectory__
  - ### Features
    - **(New Service)** Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of cloud-scale web, mobile and IoT applications. This guide describes the Cloud Directory operations that you can call programatically and includes detailed information on data types and errors. For information about AWS Directory Services features, see [AWS Directory Service](https://aws.amazon.com/directoryservice/) and the [AWS Directory Service Administration Guide](http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds instance health check functionality to replace unhealthy EC2 Spot fleet instances with fresh ones.

## __Amazon Relational Database Service__
  - ### Features
    - Snapshot Engine Version Upgrade

## __Amazon S3__
  - ### Features
    - Adding [builder](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/AmazonS3EncryptionClientBuilder.java) for AmazonS3EncryptionClient.
    - Adding `disableParallelDownloads` option to [TransferManagerBuilder](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManagerBuilder.java#L400).

  - ### Deprecations
    - Constructors on the AmazonS3EncryptionClient have been deprecated in favor of using the AmazonS3EncryptionClientBuilder.

# __1.11.85__ __2017-01-25__
## __Amazon Relational Database Service__
  - ### Features
    - Cross Region Read Replica Copying

## __Elastic Load Balancing__
  - ### Features
    - Application Load Balancers now support native Internet Protocol version 6 (IPv6) in an Amazon Virtual Private Cloud (VPC). With this ability, clients can now connect to the Application Load Balancer in a dual-stack mode via either IPv4 or IPv6.

# __1.11.84__ __2017-01-24__
## __AWS CodeCommit__
  - ### Features
    - Now includes the option to view the differences between a commit and its parent commit.

## __AWS SDK for Java__
  - ### Features
    - Adding ability to set custom endpoint and signing region on client builders. For example

      ```java
      AmazonSNS client = AmazonSNSClientBuilder.standard().withEndpointConfiguration(new EndpointConfiguration("http://sns-custom-endpoint.amazon.com", "us-east-1")).build();
      ```
      _NB: This should only be used if a custom endpoint is required, the recommended approach for configuring a client is via set/withRegion on the builder_
    - Bundled dependency of AWS SDK jar available as a new maven module 'aws-java-sdk-bundle'. This module includes all service and dependent JARs with third-party libraries relocated to different namespaces.

  - ### Deprecations
    - Deprecating `com.amazonaws.regions.Region.createClient`, clients should be created via their builder implementation for example:

      ```java
      AmazonSNSClientBuilder.standard().withRegion(region).build();
      ```
    - Deprecating client constructors & mutation methods on clients (eg `setRegion`) in favor of creating a client via the client builders. The following mechanism for creating clients is deprecated:

      ```java
      AmazonSNSClient client = new AmazonSNSClient(clientConfiguration); //client constructor is deprecated
      client.setRegion(RegionUtils.getRegion("us-east-1"));              //mutating the client via setRegion is deprecated
      ```

      Clients should now be constructed using the builder:

      ```java
      AmazonSNS client = AmazonSNSClientBuilder.standard().withClientConfiguration(clientConfiguration).withRegion("us-east-1").build();
      ```

## __Amazon EC2 Container Service__
  - ### Features
    - Now supports a state for container instances that can be used to drain a container instance in preparation for maintenance or cluster scale down.

## __Amazon S3__
  - ### Deprecations
    - Deprecating constructors and mutable methods (eg `setConfiguration()`) on [TransferManager](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManager.java) in favor of creating via the builder for example:

      ```java
      TransferManager tm = TransferManagerBuilder.standard().withS3Client(s3Client).build();
      ```

# __1.11.83__ __2017-01-20__
## __AWS Certificate Manager__
  - ### Features
    - Updated response elements for DescribeCertificate API in support of managed renewal.

# __1.11.82__ __2017-01-20__
## __Amazon DynamoDB__
  - ### Deprecations
    - Deprecating [waitForActiveOrDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForActiveOrDelete--) and [waitForAllActiveOrDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForAllActiveOrDelete--) methods in Table class which can give incorrect results if they are called immediatedly after creating or deleting a table. This is due to dynamoDb operations being eventually consistent and might take a few seconds to propagate the new status. Use [waitForActive](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForActive--) and [waitForDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForDelete--) instead.

