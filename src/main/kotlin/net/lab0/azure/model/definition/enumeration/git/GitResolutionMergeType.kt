package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class GitResolutionMergeType {
  @Json(name = "undecided")
  UNDECIDED,

  @Json(name = "takeSourceContent")
  TAKE_SOURCE_CONTENT,

  @Json(name = "takeTargetContent")
  TAKE_TARGET_CONTENT,

  @Json(name = "autoMerged")
  AUTO_MERGED,

  @Json(name = "userMerged")
  USER_MERGED
}
