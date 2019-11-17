package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class Service {
  @Json(name = "any")
  ANY,

  @Json(name = "tcm")
  TCM,

  @Json(name = "tfs")
  TFS
}
