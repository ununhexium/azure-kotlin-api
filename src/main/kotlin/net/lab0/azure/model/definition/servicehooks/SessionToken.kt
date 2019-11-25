package net.lab0.azure.model.definition.servicehooks

import kotlin.String

/**
 * Represents a session token to be attached in Events for Consumer actions that need it.
 */
interface SessionToken {
  /**
   * The error message in case of error
   */
  val error: String

  /**
   * The access token
   */
  val token: String

  /**
   * The expiration date in UTC
   */
  val validTo: String
}
