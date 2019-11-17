package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.String
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.GroupType

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
