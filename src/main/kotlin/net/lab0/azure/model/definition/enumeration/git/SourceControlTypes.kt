package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class SourceControlTypes {
  @Json(name = "tfvc")
  TFVC,

  @Json(name = "git")
  GIT
}
