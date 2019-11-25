package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class ReleaseDefinitionQueryOrder {
  @Json(name = "idAscending")
  ID_ASCENDING,

  @Json(name = "idDescending")
  ID_DESCENDING,

  @Json(name = "nameAscending")
  NAME_ASCENDING,

  @Json(name = "nameDescending")
  NAME_DESCENDING
}
