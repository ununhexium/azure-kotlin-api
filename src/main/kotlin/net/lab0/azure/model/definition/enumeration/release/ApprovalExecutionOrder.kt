package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class ApprovalExecutionOrder {
  @Json(name = "beforeGates")
  BEFORE_GATES,

  @Json(name = "afterSuccessfulGates")
  AFTER_SUCCESSFUL_GATES,

  @Json(name = "afterGatesAlways")
  AFTER_GATES_ALWAYS
}
