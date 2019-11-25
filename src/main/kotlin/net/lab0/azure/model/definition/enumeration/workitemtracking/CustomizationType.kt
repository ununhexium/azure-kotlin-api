package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * Indicates the type of customization on this work item. System behaviors are inherited from parent
 * process but not modified. Inherited behaviors are modified modified behaviors that were inherited
 * from parent process. Custom behaviors are behaviors created by user in current process.
 */
enum class CustomizationType {
  /**
   * Customization-type is System if is system generated workitemtype.
   */
  @Json(name = "system")
  SYSTEM,

  /**
   * Customization-type is Inherited if the existing workitemtype of inherited process is
   * customized.
   */
  @Json(name = "inherited")
  INHERITED,

  /**
   * Customization-type is Custom if the newly created workitemtype is customized.
   */
  @Json(name = "custom")
  CUSTOM
}
