package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class GitResolutionPathConflictAction {
  @Json(name = "undecided")
  UNDECIDED,

  @Json(name = "keepSourceRenameTarget")
  KEEP_SOURCE_RENAME_TARGET,

  @Json(name = "keepSourceDeleteTarget")
  KEEP_SOURCE_DELETE_TARGET,

  @Json(name = "keepTargetRenameSource")
  KEEP_TARGET_RENAME_SOURCE,

  @Json(name = "keepTargetDeleteSource")
  KEEP_TARGET_DELETE_SOURCE
}
