package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * The usage of the field.
 */
enum class FieldUsage {
  /**
   * Empty usage.
   */
  @Json(name = "none")
  NONE,

  /**
   * Work item field usage.
   */
  @Json(name = "workItem")
  WORK_ITEM,

  /**
   * Work item link field usage.
   */
  @Json(name = "workItemLink")
  WORK_ITEM_LINK,

  /**
   * Treenode field usage.
   */
  @Json(name = "tree")
  TREE,

  /**
   * Work Item Type Extension usage.
   */
  @Json(name = "workItemTypeExtension")
  WORK_ITEM_TYPE_EXTENSION
}
