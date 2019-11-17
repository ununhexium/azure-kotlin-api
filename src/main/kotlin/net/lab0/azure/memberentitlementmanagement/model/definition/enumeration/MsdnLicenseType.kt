package net.lab0.azure.memberentitlementmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of MSDN License (e.g. Visual Studio Professional, Visual Studio Enterprise etc.)
 */
enum class MsdnLicenseType {
  @Json(name = "none")
  NONE,

  @Json(name = "eligible")
  ELIGIBLE,

  @Json(name = "professional")
  PROFESSIONAL,

  @Json(name = "platforms")
  PLATFORMS,

  @Json(name = "testProfessional")
  TEST_PROFESSIONAL,

  @Json(name = "premium")
  PREMIUM,

  @Json(name = "ultimate")
  ULTIMATE,

  @Json(name = "enterprise")
  ENTERPRISE
}
