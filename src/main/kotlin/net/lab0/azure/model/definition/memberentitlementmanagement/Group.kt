package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.String
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.GroupType

interface Group {
  /**
   * Display Name of the Group
   */
  val displayName: String

  /**
   * Group Type
   */
  val groupType: GroupType
}
