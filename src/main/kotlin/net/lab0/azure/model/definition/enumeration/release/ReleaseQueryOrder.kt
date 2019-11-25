package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class ReleaseQueryOrder {
  @Json(name = "descending")
  DESCENDING,

  @Json(name = "ascending")
  ASCENDING
}
