package net.lab0.azure.model.definition.test

interface TestSummaryForWorkItem {
  val summary: AggregatedDataForResultTrend

  val workItem: WorkItemReference
}
