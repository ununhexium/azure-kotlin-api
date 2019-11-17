package net.lab0.azure.test.model.definition

import kotlin.Int

interface TestResultAttachmentIdentity {
  val attachmentId: Int

  val sessionId: Int

  val testResultId: Int

  val testRunId: Int
}
