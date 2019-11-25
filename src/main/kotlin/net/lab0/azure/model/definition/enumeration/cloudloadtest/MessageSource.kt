package net.lab0.azure.model.definition.enumeration.cloudloadtest

import com.squareup.moshi.Json

enum class MessageSource {
  @Json(name = "setupScript")
  SETUP_SCRIPT,

  @Json(name = "cleanupScript")
  CLEANUP_SCRIPT,

  @Json(name = "validation")
  VALIDATION,

  @Json(name = "other")
  OTHER,

  @Json(name = "autCounterCollection")
  AUT_COUNTER_COLLECTION
}
