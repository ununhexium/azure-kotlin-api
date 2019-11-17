package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class TestRunSubstate {
  @Json(name = "none")
  NONE,

  @Json(name = "creatingEnvironment")
  CREATING_ENVIRONMENT,

  @Json(name = "runningTests")
  RUNNING_TESTS,

  @Json(name = "canceledByUser")
  CANCELED_BY_USER,

  @Json(name = "abortedBySystem")
  ABORTED_BY_SYSTEM,

  @Json(name = "timedOut")
  TIMED_OUT,

  @Json(name = "pendingAnalysis")
  PENDING_ANALYSIS,

  @Json(name = "analyzed")
  ANALYZED,

  @Json(name = "cancellationInProgress")
  CANCELLATION_IN_PROGRESS
}
