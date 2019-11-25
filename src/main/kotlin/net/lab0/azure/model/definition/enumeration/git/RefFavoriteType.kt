package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class RefFavoriteType {
  @Json(name = "invalid")
  INVALID,

  @Json(name = "folder")
  FOLDER,

  @Json(name = "ref")
  REF
}
