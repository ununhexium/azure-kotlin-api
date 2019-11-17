package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class DeploymentGroupActionFilter {
  /**
   * All deployment groups.
   */
  @Json(name = "none")
  NONE,

  /**
   * Only deployment groups for which caller has **manage** permission.
   */
  @Json(name = "manage")
  MANAGE,

  /**
   * Only deployment groups for which caller has **use** permission.
   */
  @Json(name = "use")
  USE
}
