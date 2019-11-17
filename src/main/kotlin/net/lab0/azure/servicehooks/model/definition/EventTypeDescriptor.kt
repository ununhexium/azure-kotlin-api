package net.lab0.azure.servicehooks.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Describes a type of event
 */
interface EventTypeDescriptor {
  /**
   * A localized description of the event type
   */
  val description: String

  /**
   * A unique id for the event type
   */
  val id: String

  /**
   * Event-specific inputs
   */
  val inputDescriptors: List<InputDescriptor>

  /**
   * A localized friendly name for the event type
   */
  val name: String

  /**
   * A unique id for the publisher of this event type
   */
  val publisherId: String

  /**
   * Supported versions for the event's resource payloads.
   */
  val supportedResourceVersions: List<String>

  /**
   * The url for this resource
   */
  val url: String
}
