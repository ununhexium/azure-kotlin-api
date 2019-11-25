package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

/**
 * It can have value as ‘GitHub’, ‘Vsts’.
 */
enum class PullRequestSystemType {
  @Json(name = "none")
  NONE,

  @Json(name = "tfsGit")
  TFS_GIT,

  @Json(name = "gitHub")
  GIT_HUB
}
