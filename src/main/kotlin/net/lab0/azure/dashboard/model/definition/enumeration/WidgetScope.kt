package net.lab0.azure.dashboard.model.definition.enumeration

import com.squareup.moshi.Json

enum class WidgetScope {
  @Json(name = "collection_User")
  COLLECTION__USER,

  @Json(name = "project_Team")
  PROJECT__TEAM
}
