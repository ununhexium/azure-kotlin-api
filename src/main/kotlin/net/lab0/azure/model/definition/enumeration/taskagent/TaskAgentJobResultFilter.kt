package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class TaskAgentJobResultFilter {
  /**
   * Only those deployment targets on which last job failed (**Abandoned**, **Canceled**,
   * **Failed**, **Skipped**).
   */
  @Json(name = "failed")
  FAILED,

  /**
   * Only those deployment targets on which last job Passed (**Succeeded**, **Succeeded with
   * issues**).
   */
  @Json(name = "passed")
  PASSED,

  /**
   * Only those deployment targets that never executed a job.
   */
  @Json(name = "neverDeployed")
  NEVER_DEPLOYED,

  /**
   * All deployment targets.
   */
  @Json(name = "all")
  ALL
}
