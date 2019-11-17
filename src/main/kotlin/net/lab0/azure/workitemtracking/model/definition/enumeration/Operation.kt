package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The patch operation
 */
enum class Operation {
  @Json(name = "add")
  ADD,

  @Json(name = "remove")
  REMOVE,

  @Json(name = "replace")
  REPLACE,

  @Json(name = "move")
  MOVE,

  @Json(name = "copy")
  COPY,

  @Json(name = "test")
  TEST
}
