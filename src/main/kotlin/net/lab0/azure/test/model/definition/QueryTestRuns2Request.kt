package net.lab0.azure.test.model.definition

import kotlin.Boolean

interface QueryTestRuns2Request {
  val includeStatistics: Boolean

  val query: ResultsStoreQuery
}
