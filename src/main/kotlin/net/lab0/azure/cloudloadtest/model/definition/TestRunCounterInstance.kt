package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface TestRunCounterInstance {
  val categoryName: String

  val counterInstanceId: String

  val counterName: String

  val counterUnits: String

  val instanceName: String

  val isPreselectedCounter: Boolean

  val machineName: String

  val partOfCounterGroups: List<String>

  val summaryData: WebInstanceSummaryData

  val uniqueName: String
}
