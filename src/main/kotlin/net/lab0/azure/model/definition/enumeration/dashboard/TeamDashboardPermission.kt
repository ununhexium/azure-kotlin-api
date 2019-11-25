package net.lab0.azure.model.definition.enumeration.dashboard

import com.squareup.moshi.Json

/**
 * A permissions bit mask describing the security permissions of the current team for dashboards.
 * When this permission is the value None, use GroupMemberPermission. Permissions are evaluated based
 * on the presence of a value other than None, else the GroupMemberPermission will be saved.
 */
enum class TeamDashboardPermission {
  @Json(name = "none")
  NONE,

  @Json(name = "read")
  READ,

  @Json(name = "create")
  CREATE,

  @Json(name = "edit")
  EDIT,

  @Json(name = "delete")
  DELETE,

  @Json(name = "managePermissions")
  MANAGE_PERMISSIONS
}
