package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

enum class Service {
  @Json(name = "any")
  ANY,

  @Json(name = "tcm")
  TCM,

  @Json(name = "tfs")
  TFS
}
