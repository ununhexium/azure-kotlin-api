package net.lab0.azure.model.definition.enumeration.profile

import com.squareup.moshi.Json

enum class ProfileState {
  @Json(name = "custom")
  CUSTOM,

  @Json(name = "customReadOnly")
  CUSTOM_READ_ONLY,

  @Json(name = "readOnly")
  READ_ONLY
}
