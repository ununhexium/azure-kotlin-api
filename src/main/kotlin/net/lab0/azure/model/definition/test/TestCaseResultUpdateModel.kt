package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestCaseResultUpdateModel {
  val associatedWorkItems: List<Int>

  val automatedTestTypeId: String

  val comment: String

  val completedDate: String

  val computerName: String

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

  val testCasePriority: String

  val testResult: ShallowReference
}
