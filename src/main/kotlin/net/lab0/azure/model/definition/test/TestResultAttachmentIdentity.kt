package net.lab0.azure.model.definition.test

import kotlin.Int

interface TestResultAttachmentIdentity {
  val attachmentId: Int

  val sessionId: Int

  val testResultId: Int

  val testRunId: Int
}
