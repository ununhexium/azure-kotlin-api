package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Attachment type.
 */
enum class AttachmentType {
  @Json(name = "generalAttachment")
  GENERAL_ATTACHMENT,

  @Json(name = "afnStrip")
  AFN_STRIP,

  @Json(name = "bugFilingData")
  BUG_FILING_DATA,

  @Json(name = "codeCoverage")
  CODE_COVERAGE,

  @Json(name = "intermediateCollectorData")
  INTERMEDIATE_COLLECTOR_DATA,

  @Json(name = "runConfig")
  RUN_CONFIG,

  @Json(name = "testImpactDetails")
  TEST_IMPACT_DETAILS,

  @Json(name = "tmiTestRunDeploymentFiles")
  TMI_TEST_RUN_DEPLOYMENT_FILES,

  @Json(name = "tmiTestRunReverseDeploymentFiles")
  TMI_TEST_RUN_REVERSE_DEPLOYMENT_FILES,

  @Json(name = "tmiTestResultDetail")
  TMI_TEST_RESULT_DETAIL,

  @Json(name = "tmiTestRunSummary")
  TMI_TEST_RUN_SUMMARY,

  @Json(name = "consoleLog")
  CONSOLE_LOG
}
