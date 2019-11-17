package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

enum class GitResolutionWhichAction {
  @Json(name = "undecided")
  UNDECIDED,

  @Json(name = "pickSourceAction")
  PICK_SOURCE_ACTION,

  @Json(name = "pickTargetAction")
  PICK_TARGET_ACTION
}
