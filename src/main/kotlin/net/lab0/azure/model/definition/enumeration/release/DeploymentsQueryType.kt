package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class DeploymentsQueryType {
  @Json(name = "regular")
  REGULAR,

  @Json(name = "failingSince")
  FAILING_SINCE
}
