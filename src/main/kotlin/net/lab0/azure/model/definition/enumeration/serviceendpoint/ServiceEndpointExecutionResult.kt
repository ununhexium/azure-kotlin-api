package net.lab0.azure.model.definition.enumeration.serviceendpoint

import com.squareup.moshi.Json

/**
 * Gets the result of service endpoint execution.
 */
enum class ServiceEndpointExecutionResult {
  @Json(name = "succeeded")
  SUCCEEDED,

  @Json(name = "succeededWithIssues")
  SUCCEEDED_WITH_ISSUES,

  @Json(name = "failed")
  FAILED,

  @Json(name = "canceled")
  CANCELED,

  @Json(name = "skipped")
  SKIPPED,

  @Json(name = "abandoned")
  ABANDONED
}
