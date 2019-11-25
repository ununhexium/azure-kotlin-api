package net.lab0.azure.model.definition.dashboard

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Model of a Dashboard.
 */
interface Dashboard {
  val _links: ReferenceLinks

  /**
   * Description of the dashboard.
   */
  val description: String

  /**
   * Server defined version tracking value, used for edit collision detection.
   */
  val eTag: String

  /**
   * ID of the Dashboard. Provided by service at creation time.
   */
  val id: String

  /**
   * Name of the Dashboard.
   */
  val name: String

  /**
   * ID of the Owner for a dashboard. For any legacy dashboards, this would be the unique identifier
   * for the team associated with the dashboard.
   */
  val ownerId: String

  /**
   * Position of the dashboard, within a dashboard group. If unset at creation time, position is
   * decided by the service.
   */
  val position: Int

  /**
   * Interval for client to automatically refresh the dashboard. Expressed in minutes.
   */
  val refreshInterval: Int

  val url: String

  /**
   * The set of Widgets on the dashboard.
   */
  val widgets: List<Widget>
}
