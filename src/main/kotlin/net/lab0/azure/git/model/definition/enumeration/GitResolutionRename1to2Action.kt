package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

enum class GitResolutionRename1to2Action {
  @Json(name = "undecided")
  UNDECIDED,

  @Json(name = "keepSourcePath")
  KEEP_SOURCE_PATH,

  @Json(name = "keepTargetPath")
  KEEP_TARGET_PATH,

  @Json(name = "keepBothFiles")
  KEEP_BOTH_FILES
}
