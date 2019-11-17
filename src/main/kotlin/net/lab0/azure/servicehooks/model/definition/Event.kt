package net.lab0.azure.servicehooks.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * Encapsulates the properties of an event.
 */
interface Event {
  /**
   * Gets or sets the UTC-based date and time that this event was created.
   */
  val createdDate: String

  val detailedMessage: FormattedEventMessage

  /**
   * Gets or sets the type of this event.
   */
  val eventType: String

  /**
   * Gets or sets the unique identifier of this event.
   */
  val id: String

  val message: FormattedEventMessage

  /**
   * Gets or sets the identifier of the publisher that raised this event.
   */
  val publisherId: String

  /**
   * Gets or sets the data associated with this event.
   */
  val resource: JsonObject

  /**
   * Gets or sets the resource containers.
   */
  val resourceContainers: JsonObject

  /**
   * Gets or sets the version of the data associated with this event.
   */
  val resourceVersion: String

  val sessionToken: SessionToken
}
