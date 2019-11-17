package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Logical operator separating the condition clause
 */
enum class LogicalOperation {
  @Json(name = "nONE")
  N_O_N_E,

  @Json(name = "aND")
  A_N_D,

  @Json(name = "oR")
  O_R
}
