package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class GitPathActions {
  @Json(name = "none")
  NONE,

  @Json(name = "edit")
  EDIT,

  @Json(name = "delete")
  DELETE,

  @Json(name = "add")
  ADD,

  @Json(name = "rename")
  RENAME
}
