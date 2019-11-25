package net.lab0.azure.model.definition.test

import kotlin.collections.List

interface QueryTestActionResultResponse {
  val testActionResults: List<TestActionResult>

  val testAttachments: List<TestResultAttachment>

  val testResultParameters: List<TestResultParameter>
}
