package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestCaseReference2 {
  val areaId: Int

  val automatedTestId: String

  val automatedTestName: String

  val automatedTestNameHash: List<String>

  val automatedTestStorage: String

  val automatedTestStorageHash: List<String>

  val automatedTestType: String

  val configurationId: Int

  val createdBy: String

  val creationDate: String

  val lastRefTestRunDate: String

  val owner: String

  val priority: String

  val projectId: String

  val testCaseId: Int

  val testCaseRefId: Int

  val testCaseRevision: Int

  val testCaseTitle: String

  val testPointId: Int
}
