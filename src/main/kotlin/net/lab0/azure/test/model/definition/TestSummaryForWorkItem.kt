package net.lab0.azure.test.model.definition

interface TestSummaryForWorkItem {
  val summary: AggregatedDataForResultTrend

  val workItem: WorkItemReference
}
