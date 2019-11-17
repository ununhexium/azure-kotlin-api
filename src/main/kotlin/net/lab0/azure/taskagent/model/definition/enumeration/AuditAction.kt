package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

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
