package net.lab0.azure.model.definition.enumeration.dashboard

import com.squareup.moshi.Json

enum class WidgetScope {
  @Json(name = "collection_User")
  COLLECTION__USER,

  @Json(name = "project_Team")
  PROJECT__TEAM
}
