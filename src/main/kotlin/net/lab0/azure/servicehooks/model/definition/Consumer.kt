package net.lab0.azure.servicehooks.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.servicehooks.model.definition.enumeration.AuthenticationType

/**
 * Defines the data contract of a consumer.
 */
interface Consumer {
  val _links: ReferenceLinks

  /**
   * Gets this consumer's actions.
   */
  val actions: List<ConsumerAction>

  /**
   * Gets or sets this consumer's authentication type.
   */
  val authenticationType: AuthenticationType

  /**
   * Gets or sets this consumer's localized description.
   */
  val description: String

  val externalConfiguration: ExternalConfigurationDescriptor

  /**
   * Gets or sets this consumer's identifier.
   */
  val id: String

  /**
   * Gets or sets this consumer's image URL, if any.
   */
  val imageUrl: String

  /**
   * Gets or sets this consumer's information URL, if any.
   */
  val informationUrl: String

  /**
   * Gets or sets this consumer's input descriptors.
   */
  val inputDescriptors: List<InputDescriptor>

  /**
   * Gets or sets this consumer's localized name.
   */
  val name: String

  /**
   * The url for this resource
   */
  val url: String
}
