package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class ReleaseQueryOrder {
  @Json(name = "descending")
  DESCENDING,

  @Json(name = "ascending")
  ASCENDING
}
