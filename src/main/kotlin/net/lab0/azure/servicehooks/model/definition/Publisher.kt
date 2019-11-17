package net.lab0.azure.servicehooks.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Defines the data contract of an event publisher.
 */
interface Publisher {
  val _links: ReferenceLinks

  /**
   * Gets this publisher's localized description.
   */
  val description: String

  /**
   * Gets this publisher's identifier.
   */
  val id: String

  /**
   * Publisher-specific inputs
   */
  val inputDescriptors: List<InputDescriptor>

  /**
   * Gets this publisher's localized name.
   */
  val name: String

  /**
   * The service instance type of the first party publisher.
   */
  val serviceInstanceType: String

  /**
   * Gets this publisher's supported event types.
   */
  val supportedEvents: List<EventTypeDescriptor>

  /**
   * The url for this resource
   */
  val url: String
}
