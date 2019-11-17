package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class AgentArtifactType {
  @Json(name = "xamlBuild")
  XAML_BUILD,

  @Json(name = "build")
  BUILD,

  @Json(name = "jenkins")
  JENKINS,

  @Json(name = "fileShare")
  FILE_SHARE,

  @Json(name = "nuget")
  NUGET,

  @Json(name = "tfsOnPrem")
  TFS_ON_PREM,

  @Json(name = "gitHub")
  GIT_HUB,

  @Json(name = "tFGit")
  T_F_GIT,

  @Json(name = "externalTfsBuild")
  EXTERNAL_TFS_BUILD,

  @Json(name = "custom")
  CUSTOM,

  @Json(name = "tfvc")
  TFVC
}
