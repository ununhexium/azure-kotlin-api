package net.lab0.azure.model.definition.enumeration.memberentitlementmanagement

import com.squareup.moshi.Json

/**
 * Licensing Source (e.g. Account. MSDN etc.)
 */
enum class LicensingSource {
  @Json(name = "none")
  NONE,

  @Json(name = "account")
  ACCOUNT,

  @Json(name = "msdn")
  MSDN,

  @Json(name = "profile")
  PROFILE,

  @Json(name = "auto")
  AUTO,

  @Json(name = "trial")
  TRIAL
}
