package net.lab0.azure.model.definition.enumeration.core

import com.squareup.moshi.Json

/**
 * Process customzation type on this collection. It can be Xml or Inherited.
 */
enum class ProcessCustomizationType {
  /**
   * Customization based on project-scoped xml customization
   */
  @Json(name = "xml")
  XML,

  /**
   * Customization based on process inheritance
   */
  @Json(name = "inherited")
  INHERITED
}
