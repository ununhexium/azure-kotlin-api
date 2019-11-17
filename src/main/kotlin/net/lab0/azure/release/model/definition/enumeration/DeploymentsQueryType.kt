package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class DeploymentsQueryType {
  @Json(name = "regular")
  REGULAR,

  @Json(name = "failingSince")
  FAILING_SINCE
}
