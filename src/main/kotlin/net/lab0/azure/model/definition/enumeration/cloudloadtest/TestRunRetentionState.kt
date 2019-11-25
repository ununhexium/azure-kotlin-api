package net.lab0.azure.model.definition.enumeration.cloudloadtest

import com.squareup.moshi.Json

enum class TestRunRetentionState {
  @Json(name = "none")
  NONE,

  @Json(name = "markedForDeletion")
  MARKED_FOR_DELETION,

  @Json(name = "deleted")
  DELETED,

  @Json(name = "retain")
  RETAIN
}
