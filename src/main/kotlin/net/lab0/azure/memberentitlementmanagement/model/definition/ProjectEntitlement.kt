package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.Boolean
import kotlin.collections.List
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.AssignmentSource

interface ProjectEntitlement {
  /**
   * Assignment Source (e.g. Group or Unknown).
   */
  val assignmentSource: AssignmentSource

  val group: Group

  /**
   * Whether the user is inheriting permissions to a project through a VSTS or AAD group membership.
   */
  val isProjectPermissionInherited: Boolean

  val projectRef: ProjectRef

  /**
   * Team Ref.
   */
  val teamRefs: List<TeamRef>
}
