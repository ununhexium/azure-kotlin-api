package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class TaskGroupQueryOrder {
  /**
   * Order by createdon ascending.
   */
  @Json(name = "createdOnAscending")
  CREATED_ON_ASCENDING,

  /**
   * Order by createdon descending.
   */
  @Json(name = "createdOnDescending")
  CREATED_ON_DESCENDING
}
