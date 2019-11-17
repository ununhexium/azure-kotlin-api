package net.lab0.azure.notification.model.definition

import kotlin.collections.List

interface EventProcessingLog : NotificationJobDiagnosticLog {
  val batches: List<EventBatch>

  val matcherResults: List<MatcherResult>
}
