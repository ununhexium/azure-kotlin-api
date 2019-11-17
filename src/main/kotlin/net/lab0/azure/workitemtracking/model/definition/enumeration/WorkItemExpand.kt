package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The expand parameters for work item attributes. Possible options are { None, Relations, Fields,
 * Links, All }
 */
enum class WorkItemExpand {
  @Json(name = "none")
  NONE,

  @Json(name = "relations")
  RELATIONS,

  @Json(name = "fields")
  FIELDS,

  @Json(name = "links")
  LINKS,

  @Json(name = "all")
  ALL
}
