package net.lab0.azure.notification.model.definition

import kotlin.String

interface SubscriptionTraceDiagnosticLog : NotificationDiagnosticLog {
  /**
   * Indicates the job Id that processed or delivered this subscription
   */
  val jobId: String

  /**
   * Indicates unique instance identifier for the job that processed or delivered this subscription
   */
  val jobInstanceId: String

  val subscriptionId: String
}
