package net.lab0.azure.model.definition.enumeration.work

import com.squareup.moshi.Json

/**
 * Bit flag indicating set of permissions a user has to the plan.
 */
enum class PlanUserPermissions {
  /**
   * None
   */
  @Json(name = "none")
  NONE,

  /**
   * Permission to view this plan.
   */
  @Json(name = "view")
  VIEW,

  /**
   * Permission to update this plan.
   */
  @Json(name = "edit")
  EDIT,

  /**
   * Permission to delete this plan.
   */
  @Json(name = "delete")
  DELETE,

  /**
   * Permission to manage this plan.
   */
  @Json(name = "manage")
  MANAGE,

  /**
   * Full control permission for this plan.
   */
  @Json(name = "allPermissions")
  ALL_PERMISSIONS
}
