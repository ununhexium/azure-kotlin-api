package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface ResultUpdateRequest {
  val actionResultDeletes: List<TestActionResult>

  val actionResults: List<TestActionResult>

  val attachmentDeletes: List<TestResultAttachmentIdentity>

  val attachments: List<TestResultAttachment>

  val parameterDeletes: List<TestResultParameter>

  val parameters: List<TestResultParameter>

  val testCaseResult: LegacyTestCaseResult

  val testResultId: Int

  val testRunId: Int
}
