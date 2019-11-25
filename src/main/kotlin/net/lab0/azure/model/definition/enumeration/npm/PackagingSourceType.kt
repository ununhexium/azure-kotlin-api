package net.lab0.azure.model.definition.enumeration.npm

import com.squareup.moshi.Json

/**
 * Source type, such as Public or Internal.
 */
enum class PackagingSourceType {
  /**
   * Publicly available source.
   */
  @Json(name = "public")
  PUBLIC,

  /**
   * Azure DevOps upstream source.
   */
  @Json(name = "internal")
  INTERNAL
}
