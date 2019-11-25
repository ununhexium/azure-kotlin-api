package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.String
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.AssignmentSource
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.LicensingSource

interface Extension {
  /**
   * Assignment source for this extension. I.e. explicitly assigned or from a group rule.
   */
  val assignmentSource: AssignmentSource

  /**
   * Gallery Id of the Extension.
   */
  val id: String

  /**
   * Friendly name of this extension.
   */
  val name: String

  /**
   * Source of this extension assignment. Ex: msdn, account, none, etc.
   */
  val source: LicensingSource
}
