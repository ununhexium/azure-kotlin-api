package net.lab0.azure.memberentitlementmanagement.model.definition.enumeration

import com.squareup.moshi.Json

enum class RuleOption {
  @Json(name = "applyGroupRule")
  APPLY_GROUP_RULE,

  @Json(name = "testApplyGroupRule")
  TEST_APPLY_GROUP_RULE
}
