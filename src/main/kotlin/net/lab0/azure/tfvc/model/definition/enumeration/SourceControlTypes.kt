package net.lab0.azure.tfvc.model.definition.enumeration

import com.squareup.moshi.Json

enum class SourceControlTypes {
  @Json(name = "tfvc")
  TFVC,

  @Json(name = "git")
  GIT
}
