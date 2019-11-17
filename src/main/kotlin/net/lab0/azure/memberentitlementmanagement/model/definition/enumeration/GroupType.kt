package net.lab0.azure.memberentitlementmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Group Type
 */
enum class GroupType {
  @Json(name = "projectStakeholder")
  PROJECT_STAKEHOLDER,

  @Json(name = "projectReader")
  PROJECT_READER,

  @Json(name = "projectContributor")
  PROJECT_CONTRIBUTOR,

  @Json(name = "projectAdministrator")
  PROJECT_ADMINISTRATOR,

  @Json(name = "custom")
  CUSTOM
}
