package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of the IDE.
 */
enum class SupportedIdeType {
  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "androidStudio")
  ANDROID_STUDIO,

  @Json(name = "appCode")
  APP_CODE,

  @Json(name = "cLion")
  C_LION,

  @Json(name = "dataGrip")
  DATA_GRIP,

  @Json(name = "eclipse")
  ECLIPSE,

  @Json(name = "intelliJ")
  INTELLI_J,

  @Json(name = "mPS")
  M_P_S,

  @Json(name = "phpStorm")
  PHP_STORM,

  @Json(name = "pyCharm")
  PY_CHARM,

  @Json(name = "rubyMine")
  RUBY_MINE,

  @Json(name = "tower")
  TOWER,

  @Json(name = "visualStudio")
  VISUAL_STUDIO,

  @Json(name = "vSCode")
  V_S_CODE,

  @Json(name = "webStorm")
  WEB_STORM
}
