package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of the template described in the request body.
 */
enum class TemplateType {
  @Json(name = "workItemType")
  WORK_ITEM_TYPE,

  @Json(name = "globalWorkflow")
  GLOBAL_WORKFLOW
}
