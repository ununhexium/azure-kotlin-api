package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface LegacyTestRun {
  val bugsCount: Int

  val buildConfigurationId: Int

  val buildFlavor: String

  val buildNumber: String

  val buildPlatform: String

  val buildReference: LegacyBuildConfiguration

  val buildUri: String

  val comment: String

  val completeDate: String

  val configurationIds: List<Int>

  val controller: String

  val creationDate: String

  val csmContent: String

  val csmParameters: String

  val customFields: List<TestExtensionField>

  val dropLocation: String

  val dtlAutEnvironment: ShallowReference

  val dtlTestEnvironment: ShallowReference

  val dueDate: String

  val errorMessage: String

  val filter: RunFilter

  val incompleteTests: Int

  val isAutomated: Boolean

  val isBvt: Boolean

  val iteration: String

  val iterationId: Int

  val lastUpdated: String

  val lastUpdatedBy: String

  val lastUpdatedByName: String

  val legacySharePath: String

  val notApplicableTests: Int

  val owner: String

  val ownerName: String

  val passedTests: Int

  val postProcessState: String

  val publicTestSettingsId: Int

  val releaseEnvironmentUri: String

  val releaseReference: LegacyReleaseReference

  val releaseUri: String

  val revision: Int

  val rowVersion: List<String>

  val runHasDtlEnvironment: Boolean

  val runTimeout: String

  val serviceVersion: String

  val sourceWorkflow: String

  val startDate: String

  val state: String

  val subscriptionName: String

  val substate: String

  val teamProject: String

  val teamProjectUri: String

  val testConfigurationsMapping: String

  val testEnvironmentId: String

  val testMessageLogEntries: List<TestMessageLogDetails>

  val testMessageLogId: Int

  val testPlanId: Int

  val testRunId: Int

  val testRunStatistics: List<LegacyTestRunStatistic>

  val testSettingsId: Int

  val title: String

  val totalTests: Int

  val type: String

  val unanalyzedTests: Int

  val version: Int
}
