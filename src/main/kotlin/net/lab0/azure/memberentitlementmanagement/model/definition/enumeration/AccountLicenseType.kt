package net.lab0.azure.memberentitlementmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of Account License (e.g. Express, Stakeholder etc.)
 */
enum class AccountLicenseType {
  @Json(name = "none")
  NONE,

  @Json(name = "earlyAdopter")
  EARLY_ADOPTER,

  @Json(name = "express")
  EXPRESS,

  @Json(name = "professional")
  PROFESSIONAL,

  @Json(name = "advanced")
  ADVANCED,

  @Json(name = "stakeholder")
  STAKEHOLDER
}
