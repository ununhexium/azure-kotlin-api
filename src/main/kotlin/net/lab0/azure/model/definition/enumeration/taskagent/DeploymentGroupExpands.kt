package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class DeploymentGroupExpands {
  /**
   * No additional properties.
   */
  @Json(name = "none")
  NONE,

  /**
   * Deprecated: Include all the deployment targets.
   */
  @Json(name = "machines")
  MACHINES,

  /**
   * Include unique list of tags across all deployment targets.
   */
  @Json(name = "tags")
  TAGS
}
