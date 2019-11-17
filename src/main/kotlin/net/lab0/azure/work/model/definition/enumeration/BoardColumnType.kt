package net.lab0.azure.work.model.definition.enumeration

import com.squareup.moshi.Json

enum class BoardColumnType {
  @Json(name = "incoming")
  INCOMING,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "outgoing")
  OUTGOING
}
