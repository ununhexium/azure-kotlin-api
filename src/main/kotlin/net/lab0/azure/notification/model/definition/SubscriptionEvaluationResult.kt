package net.lab0.azure.notification.model.definition

import kotlin.String
import net.lab0.azure.notification.model.definition.enumeration.EvaluationOperationStatus

/**
 * Ecapsulates the subscription evaluation results. It defines the Date Interval that was used,
 * number of events evaluated and events and notifications results
 */
interface SubscriptionEvaluationResult {
  /**
   * Subscription evaluation job status
   */
  val evaluationJobStatus: EvaluationOperationStatus

  val events: EventsEvaluationResult

  /**
   * The requestId which is the subscription evaluation jobId
   */
  val id: String

  val notifications: NotificationsEvaluationResult
}
