package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

enum class CommentSortOrder {
  @Json(name = "asc")
  ASC,

  @Json(name = "desc")
  DESC
}
