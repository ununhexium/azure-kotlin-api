package net.lab0.azure.servicehooks.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets or sets this consumer's authentication type.
 */
enum class AuthenticationType {
  /**
   * No authentication is required.
   */
  @Json(name = "none")
  NONE,

  /**
   * OAuth authentication.
   */
  @Json(name = "oAuth")
  O_AUTH,

  /**
   * Externally-configured authentication.
   */
  @Json(name = "external")
  EXTERNAL
}
