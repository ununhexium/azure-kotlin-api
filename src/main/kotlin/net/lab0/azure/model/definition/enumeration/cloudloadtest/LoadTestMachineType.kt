package net.lab0.azure.model.definition.enumeration.cloudloadtest

import com.squareup.moshi.Json

enum class LoadTestMachineType {
  @Json(name = "default")
  DEFAULT,

  @Json(name = "cLTLoadAgent")
  C_L_T_LOAD_AGENT,

  @Json(name = "userLoadAgent")
  USER_LOAD_AGENT
}
