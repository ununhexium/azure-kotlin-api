package net.lab0.azure.model.definition.enumeration.memberentitlementmanagement

import com.squareup.moshi.Json

/**
 * User status in the account
 */
enum class AccountUserStatus {
  @Json(name = "none")
  NONE,

  /**
   * User has signed in at least once to the VSTS account
   */
  @Json(name = "active")
  ACTIVE,

  /**
   * User cannot sign in; primarily used by admin to temporarily remove a user due to absence or
   * license reallocation
   */
  @Json(name = "disabled")
  DISABLED,

  /**
   * User is removed from the VSTS account by the VSTS account admin
   */
  @Json(name = "deleted")
  DELETED,

  /**
   * User is invited to join the VSTS account by the VSTS account admin, but has not signed
   * up/signed in yet
   */
  @Json(name = "pending")
  PENDING,

  /**
   * User can sign in; primarily used when license is in expired state and we give a grace period
   */
  @Json(name = "expired")
  EXPIRED,

  /**
   * User is disabled; if reenabled, they will still be in the Pending state
   */
  @Json(name = "pendingDisabled")
  PENDING_DISABLED
}
