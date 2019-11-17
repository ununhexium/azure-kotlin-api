package net.lab0.azure.servicehooks.model.definition.enumeration

import com.squareup.moshi.Json

enum class SubscriptionStatus {
  /**
   * The subscription is enabled.
   */
  @Json(name = "enabled")
  ENABLED,

  /**
   * The subscription is temporarily on probation by the system.
   */
  @Json(name = "onProbation")
  ON_PROBATION,

  /**
   * The subscription is disabled by a user.
   */
  @Json(name = "disabledByUser")
  DISABLED_BY_USER,

  /**
   * The subscription is disabled by the system.
   */
  @Json(name = "disabledBySystem")
  DISABLED_BY_SYSTEM,

  /**
   * The subscription is disabled because the owner is inactive or is missing permissions.
   */
  @Json(name = "disabledByInactiveIdentity")
  DISABLED_BY_INACTIVE_IDENTITY
}
