package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestRunExtended2 {
  val autEnvironmentUrl: String

  val csmContent: String

  val csmParameters: String

  val projectId: String

  val sourceFilter: String

  val subscriptionName: String

  val substate: String

  val testCaseFilter: String

  val testEnvironmentUrl: String

  val testRunId: Int
}
