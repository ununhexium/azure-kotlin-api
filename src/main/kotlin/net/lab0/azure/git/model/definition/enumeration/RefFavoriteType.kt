package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

enum class RefFavoriteType {
  @Json(name = "invalid")
  INVALID,

  @Json(name = "folder")
  FOLDER,

  @Json(name = "ref")
  REF
}
