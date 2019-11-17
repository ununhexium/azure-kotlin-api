package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The flag to control error policy in a bulk get work items request. Possible options are {Fail,
 * Omit}.
 */
enum class WorkItemErrorPolicy {
  @Json(name = "fail")
  FAIL,

  @Json(name = "omit")
  OMIT
}
