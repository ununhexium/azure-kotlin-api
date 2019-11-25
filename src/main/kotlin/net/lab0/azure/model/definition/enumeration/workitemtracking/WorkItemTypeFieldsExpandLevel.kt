package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

enum class WorkItemTypeFieldsExpandLevel {
  /**
   * Includes only basic properties of the field.
   */
  @Json(name = "none")
  NONE,

  /**
   * Includes allowed values for the field.
   */
  @Json(name = "allowedValues")
  ALLOWED_VALUES,

  /**
   * Includes dependent fields of the field.
   */
  @Json(name = "dependentFields")
  DEPENDENT_FIELDS,

  /**
   * Includes allowed values and dependent fields of the field.
   */
  @Json(name = "all")
  ALL
}
