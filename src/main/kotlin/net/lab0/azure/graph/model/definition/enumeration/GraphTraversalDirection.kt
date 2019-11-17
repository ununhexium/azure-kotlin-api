package net.lab0.azure.graph.model.definition.enumeration

import com.squareup.moshi.Json

enum class GraphTraversalDirection {
  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "down")
  DOWN,

  @Json(name = "up")
  UP
}
