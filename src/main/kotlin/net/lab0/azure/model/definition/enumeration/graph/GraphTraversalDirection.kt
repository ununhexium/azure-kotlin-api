package net.lab0.azure.model.definition.enumeration.graph

import com.squareup.moshi.Json

enum class GraphTraversalDirection {
  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "down")
  DOWN,

  @Json(name = "up")
  UP
}
