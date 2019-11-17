package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

/**
 * Represents the header of the REST request.
 */
interface AuthorizationHeader {
  /**
   * Gets or sets the name of authorization header.
   */
  val name: String

  /**
   * Gets or sets the value of authorization header.
   */
  val value: String
}
