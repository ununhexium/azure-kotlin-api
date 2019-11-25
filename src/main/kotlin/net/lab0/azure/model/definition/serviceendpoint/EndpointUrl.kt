package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

/**
 * Represents url of the service endpoint.
 */
interface EndpointUrl {
  val dependsOn: DependsOn

  /**
   * Gets or sets the display name of service endpoint url.
   */
  val displayName: String

  /**
   * Gets or sets the help text of service endpoint url.
   */
  val helpText: String

  /**
   * Gets or sets the visibility of service endpoint url.
   */
  val isVisible: String

  /**
   * Gets or sets the value of service endpoint url.
   */
  val value: String
}
