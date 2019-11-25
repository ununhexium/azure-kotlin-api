package net.lab0.azure.model.definition.test

import kotlin.Boolean

interface QueryTestRuns2Request {
  val includeStatistics: Boolean

  val query: ResultsStoreQuery
}
