package net.lab0.azure.model.definition.notification

import kotlin.collections.List

interface EventProcessingLog : NotificationJobDiagnosticLog {
  val batches: List<EventBatch>

  val matcherResults: List<MatcherResult>
}
