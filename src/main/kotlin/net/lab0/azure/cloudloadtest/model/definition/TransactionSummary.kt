package net.lab0.azure.cloudloadtest.model.definition

import javax.json.JsonNumber
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TransactionSummary {
  val averageResponseTime: JsonNumber

  val averageTransactionTime: JsonNumber

  val percentileData: List<SummaryPercentileData>

  val scenarioName: String

  val testName: String

  val totalTransactions: Int

  val transactionName: String
}
