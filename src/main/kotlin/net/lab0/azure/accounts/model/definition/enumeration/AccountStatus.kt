package net.lab0.azure.accounts.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Current account status
 */
enum class AccountStatus {
  @Json(name = "none")
  NONE,

  /**
   * This hosting account is active and assigned to a customer.
   */
  @Json(name = "enabled")
  ENABLED,

  /**
   * This hosting account is disabled.
   */
  @Json(name = "disabled")
  DISABLED,

  /**
   * This account is part of deletion batch and scheduled for deletion.
   */
  @Json(name = "deleted")
  DELETED,

  /**
   * This account is not mastered locally and has physically moved.
   */
  @Json(name = "moved")
  MOVED
}
