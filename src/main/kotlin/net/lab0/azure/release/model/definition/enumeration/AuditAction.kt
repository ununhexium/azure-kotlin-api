package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets type of change.
 */
enum class AuditAction {
  @Json(name = "add")
  ADD,

  @Json(name = "update")
  UPDATE,

  @Json(name = "delete")
  DELETE,

  @Json(name = "undelete")
  UNDELETE
}
