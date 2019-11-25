package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.String

/**
 * Graph group entity
 */
interface GraphGroup : GraphMember {
  /**
   * A short phrase to help human readers disambiguate groups with similar names
   */
  val description: String
}
