package net.lab0.azure.model.definition.servicehooks

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Defines the data contract of a consumer action.
 */
interface ConsumerAction {
  val _links: ReferenceLinks

  /**
   * Gets or sets the flag indicating if resource version can be overridden when creating or editing
   * a subscription.
   */
  val allowResourceVersionOverride: Boolean

  /**
   * Gets or sets the identifier of the consumer to which this action belongs.
   */
  val consumerId: String

  /**
   * Gets or sets this action's localized description.
   */
  val description: String

  /**
   * Gets or sets this action's identifier.
   */
  val id: String

  /**
   * Gets or sets this action's input descriptors.
   */
  val inputDescriptors: List<InputDescriptor>

  /**
   * Gets or sets this action's localized name.
   */
  val name: String

  /**
   * Gets or sets this action's supported event identifiers.
   */
  val supportedEventTypes: List<String>

  /**
   * Gets or sets this action's supported resource versions.
   */
  val supportedResourceVersions: JsonObject

  /**
   * The url for this resource
   */
  val url: String
}
