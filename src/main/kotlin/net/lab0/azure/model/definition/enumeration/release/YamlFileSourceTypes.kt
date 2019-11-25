package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class YamlFileSourceTypes {
  @Json(name = "none")
  NONE,

  @Json(name = "tFSGit")
  T_F_S_GIT
}
