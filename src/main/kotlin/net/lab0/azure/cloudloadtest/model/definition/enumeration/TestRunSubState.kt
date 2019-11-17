package net.lab0.azure.cloudloadtest.model.definition.enumeration

import com.squareup.moshi.Json

enum class TestRunSubState {
  @Json(name = "none")
  NONE,

  @Json(name = "validatingTestRun")
  VALIDATING_TEST_RUN,

  @Json(name = "acquiringResources")
  ACQUIRING_RESOURCES,

  @Json(name = "configuringAgents")
  CONFIGURING_AGENTS,

  @Json(name = "executingSetupScript")
  EXECUTING_SETUP_SCRIPT,

  @Json(name = "warmingUp")
  WARMING_UP,

  @Json(name = "runningTest")
  RUNNING_TEST,

  @Json(name = "executingCleanupScript")
  EXECUTING_CLEANUP_SCRIPT,

  @Json(name = "collectingResults")
  COLLECTING_RESULTS,

  @Json(name = "success")
  SUCCESS,

  @Json(name = "partialSuccess")
  PARTIAL_SUCCESS
}
