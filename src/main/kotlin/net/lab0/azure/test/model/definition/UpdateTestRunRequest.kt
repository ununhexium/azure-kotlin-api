package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface UpdateTestRunRequest {
  val attachmentsToAdd: List<TestResultAttachment>

  val attachmentsToDelete: List<TestResultAttachmentIdentity>

  val projectName: String

  val shouldHyderate: Boolean

  val testRun: LegacyTestRun
}
