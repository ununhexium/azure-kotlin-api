package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The icon for the page.
 */
enum class PageType {
  @Json(name = "custom")
  CUSTOM,

  @Json(name = "history")
  HISTORY,

  @Json(name = "links")
  LINKS,

  @Json(name = "attachments")
  ATTACHMENTS
}
