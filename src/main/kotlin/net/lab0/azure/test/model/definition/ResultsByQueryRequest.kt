package net.lab0.azure.test.model.definition

import kotlin.Int

interface ResultsByQueryRequest {
  val pageSize: Int

  val query: ResultsStoreQuery
}
