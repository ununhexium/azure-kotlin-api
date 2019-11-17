package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestResultCreateModel {
  val area: ShallowReference

  val associatedWorkItems: List<Int>

  val automatedTestId: String

  val automatedTestName: String

  val automatedTestStorage: String

  val automatedTestType: String

  val automatedTestTypeId: String

  val comment: String

  val completedDate: String

  val computerName: String

  val configuration: ShallowReference

  val customFields: List<CustomTestField>

  val durationInMs: String

  val errorMessage: String

  val failureType: String

  val outcome: String

  val owner: IdentityRef

  val resolutionState: String

  val runBy: IdentityRef

  val stackTrace: String

  val startedDate: String

  val state: String

  val testCase: ShallowReference

  val testCasePriority: String

  val testCaseTitle: String

  val testPoint: ShallowReference
}
