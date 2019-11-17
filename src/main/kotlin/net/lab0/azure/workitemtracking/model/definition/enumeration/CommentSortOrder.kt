package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

enum class CommentSortOrder {
  @Json(name = "asc")
  ASC,

  @Json(name = "desc")
  DESC
}
