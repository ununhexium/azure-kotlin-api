package net.lab0.azure.memberentitlementmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Assignment Source of the License (e.g. Group, Unknown etc.
 */
enum class AssignmentSource {
  @Json(name = "none")
  NONE,

  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "groupRule")
  GROUP_RULE
}
