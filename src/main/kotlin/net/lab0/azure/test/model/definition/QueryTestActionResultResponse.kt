package net.lab0.azure.test.model.definition

import kotlin.collections.List

interface QueryTestActionResultResponse {
  val testActionResults: List<TestActionResult>

  val testAttachments: List<TestResultAttachment>

  val testResultParameters: List<TestResultParameter>
}
