package net.lab0.azure.test.model.definition

import kotlin.String

/**
 * Test attachment request model
 */
interface TestAttachmentRequestModel {
  /**
   * Attachment type By Default it will be GeneralAttachment. It can be one of the following type. {
   * GeneralAttachment, AfnStrip, BugFilingData, CodeCoverage, IntermediateCollectorData, RunConfig,
   * TestImpactDetails, TmiTestRunDeploymentFiles, TmiTestRunReverseDeploymentFiles,
   * TmiTestResultDetail, TmiTestRunSummary }
   */
  val attachmentType: String

  /**
   * Comment associated with attachment
   */
  val comment: String

  /**
   * Attachment filename
   */
  val fileName: String

  /**
   * Base64 encoded file stream
   */
  val stream: String
}
