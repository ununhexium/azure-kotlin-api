package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class SenderType {
  @Json(name = "serviceAccount")
  SERVICE_ACCOUNT,

  @Json(name = "requestingUser")
  REQUESTING_USER
}
