package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * The flag to control error policy in a query batch request. Possible options are { Fail, Omit }.
 */
enum class QueryErrorPolicy {
  @Json(name = "fail")
  FAIL,

  @Json(name = "omit")
  OMIT
}
