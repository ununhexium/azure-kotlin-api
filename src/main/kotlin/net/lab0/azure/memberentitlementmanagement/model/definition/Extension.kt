package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.String
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.AssignmentSource
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.LicensingSource

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
