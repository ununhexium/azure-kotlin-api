package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class MailSectionType {
  @Json(name = "details")
  DETAILS,

  @Json(name = "environments")
  ENVIRONMENTS,

  @Json(name = "issues")
  ISSUES,

  @Json(name = "testResults")
  TEST_RESULTS,

  @Json(name = "workItems")
  WORK_ITEMS,

  @Json(name = "releaseInfo")
  RELEASE_INFO
}
