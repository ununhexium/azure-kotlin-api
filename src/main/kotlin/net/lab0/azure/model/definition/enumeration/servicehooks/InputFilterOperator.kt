package net.lab0.azure.model.definition.enumeration.servicehooks

import com.squareup.moshi.Json

/**
 * The operator applied between the expected and actual input value
 */
enum class InputFilterOperator {
  @Json(name = "equals")
  EQUALS,

  @Json(name = "notEquals")
  NOT_EQUALS
}
