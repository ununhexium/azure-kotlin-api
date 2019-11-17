package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.test.model.definition.enumeration.ResultGroupType

interface LegacyTestCaseResult {
  val afnStripId: Int

  val areaId: Int

  val areaUri: String

  val automatedTestId: String

  val automatedTestName: String

  val automatedTestStorage: String

  val automatedTestType: String

  val automatedTestTypeId: String

  val buildNumber: String

  val buildReference: LegacyBuildConfiguration

  val comment: String

  val computerName: String

  val configurationId: Int

  val configurationName: String

  val creationDate: String

  val customFields: List<TestExtensionField>

  val dateCompleted: String

  val dateStarted: String

  val duration: Int

  val errorMessage: String

  val failingSince: FailingSince

  val failureType: String

  val id: LegacyTestCaseResultIdentifier

  val isRerun: Boolean

  val lastUpdated: String

  val lastUpdatedBy: String

  val lastUpdatedByName: String

  val outcome: String

  val owner: String

  val ownerName: String

  val priority: String

  val releaseReference: LegacyReleaseReference

  val resetCount: Int

  val resolutionStateId: Int

  val resultGroupType: ResultGroupType

  val revision: Int

  val runBy: String

  val runByName: String

  val sequenceId: Int

  val stackTrace: TestExtensionField

  val state: String

  val subResultCount: Int

  val suiteName: String

  val testCaseArea: String

  val testCaseAreaUri: String

  val testCaseId: Int

  val testCaseReferenceId: Int

  val testCaseRevision: Int

  val testCaseTitle: String

  val testPlanId: Int

  val testPointId: Int

  val testResultId: Int

  val testRunId: Int

  val testRunTitle: String

  val testSuiteId: Int
}
