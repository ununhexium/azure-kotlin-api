package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class YamlFileSourceTypes {
  @Json(name = "none")
  NONE,

  @Json(name = "tFSGit")
  T_F_S_GIT
}
