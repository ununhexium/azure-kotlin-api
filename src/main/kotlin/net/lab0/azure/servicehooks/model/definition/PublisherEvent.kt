package net.lab0.azure.servicehooks.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.collections.List

/**
 * Wrapper around an event which is being published
 */
interface PublisherEvent {
  /**
   * Add key/value pairs which will be stored with a published notification in the SH service DB. 
   * This key/value pairs are for diagnostic purposes only and will have not effect on the delivery of
   * a notificaton.
   */
  val diagnostics: JsonObject

  val event: Event

  /**
   * Gets or sets flag for filtered events
   */
  val isFilteredEvent: Boolean

  /**
   * Additional data that needs to be sent as part of notification to complement the Resource data
   * in the Event
   */
  val notificationData: JsonObject

  /**
   * Gets or sets the array of older supported resource versions.
   */
  val otherResourceVersions: List<VersionedResource>

  /**
   * Optional publisher-input filters which restricts the set of subscriptions which are triggered
   * by the event
   */
  val publisherInputFilters: List<InputFilter>

  val subscription: Subscription
}
