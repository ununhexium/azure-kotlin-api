package net.lab0.azure.servicehooks.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.servicehooks.model.definition.enumeration.NotificationResult
import net.lab0.azure.servicehooks.model.definition.enumeration.NotificationStatus

/**
 * Defines a query for service hook notifications.
 */
interface NotificationsQuery {
  /**
   * The subscriptions associated with the notifications returned from the query
   */
  val associatedSubscriptions: List<Subscription>

  /**
   * If true, we will return all notification history for the query provided; otherwise, the summary
   * is returned.
   */
  val includeDetails: Boolean

  /**
   * Optional maximum date at which the notification was created
   */
  val maxCreatedDate: String

  /**
   * Optional maximum number of overall results to include
   */
  val maxResults: Int

  /**
   * Optional maximum number of results for each subscription. Only takes effect when a list of
   * subscription ids is supplied in the query.
   */
  val maxResultsPerSubscription: Int

  /**
   * Optional minimum date at which the notification was created
   */
  val minCreatedDate: String

  /**
   * Optional publisher id to restrict the results to
   */
  val publisherId: String

  /**
   * Results from the query
   */
  val results: List<Notification>

  /**
   * Optional notification result type to filter results to
   */
  val resultType: NotificationResult

  /**
   * Optional notification status to filter results to
   */
  val status: NotificationStatus

  /**
   * Optional list of subscription ids to restrict the results to
   */
  val subscriptionIds: List<String>

  /**
   * Summary of notifications - the count of each result type (success, fail, ..).
   */
  val summary: List<NotificationSummary>
}
