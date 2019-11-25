package net.lab0.azure.model.definition.enumeration.dashboard

import com.squareup.moshi.Json

/**
 * Deprecated: The old permission model describing the level of permissions for the current team.
 * Pre-M125.
 */
enum class GroupMemberPermission {
  @Json(name = "none")
  NONE,

  @Json(name = "edit")
  EDIT,

  @Json(name = "manage")
  MANAGE,

  @Json(name = "managePermissions")
  MANAGE_PERMISSIONS
}
