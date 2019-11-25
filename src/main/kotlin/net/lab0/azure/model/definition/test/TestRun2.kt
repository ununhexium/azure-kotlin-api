package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TestRun2 {
  val buildConfigurationId: Int

  val buildNumber: String

  val comment: String

  val completeDate: String

  val controller: String

  val coverageId: Int

  val creationDate: String

  val deletedOn: String

  val dropLocation: String

  val dueDate: String

  val errorMessage: String

  val incompleteTests: Int

  val isAutomated: Boolean

  val isBvt: Boolean

  val isMigrated: Boolean

  val iterationId: Int

  val lastUpdated: String

  val lastUpdatedBy: String

  val legacySharePath: String

  val maxReservedResultId: Int

  val notApplicableTests: Int

  val owner: String

  val passedTests: Int

  val postProcessState: String

  val projectId: String

  val publicTestSettingsId: Int

  val releaseEnvironmentUri: String

  val releaseUri: String

  val revision: Int

  val startDate: String

  val state: String

  val testEnvironmentId: String

  val testMessageLogId: Int

  val testPlanId: Int

  val testRunContextId: Int

  val testRunId: Int

  val testSettingsId: Int

  val title: String

  val totalTests: Int

  val type: String

  val unanalyzedTests: Int

  val version: Int
}
