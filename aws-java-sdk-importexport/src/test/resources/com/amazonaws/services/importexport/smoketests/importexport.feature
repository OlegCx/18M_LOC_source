# language: en
@smoke @importexport
Feature: AWS Import Export

  Scenario: Making a request
    When I call the "ListJobs" API
    Then the value at "Jobs" should be a list

  Scenario: Handling errors
    When I attempt to call the "CreateJob" API with:
      | JobType       | Import |
      | ValidateOnly  | Import |
      | Manifest      | invalid-manifest |
    Then I expect the response error code to be "MalformedManifestException"
