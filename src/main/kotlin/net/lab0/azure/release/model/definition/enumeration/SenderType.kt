package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class SenderType {
  @Json(name = "serviceAccount")
  SERVICE_ACCOUNT,

  @Json(name = "requestingUser")
  REQUESTING_USER
}
