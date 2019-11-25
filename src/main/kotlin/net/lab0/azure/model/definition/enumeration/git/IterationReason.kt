package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

/**
 * The reason for which the pull request iteration was created.
 */
enum class IterationReason {
  @Json(name = "push")
  PUSH,

  @Json(name = "forcePush")
  FORCE_PUSH,

  @Json(name = "create")
  CREATE,

  @Json(name = "rebase")
  REBASE,

  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "retarget")
  RETARGET
}
