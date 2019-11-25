package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.String
import kotlin.collections.List

interface UserEntitlement {
  val accessLevel: AccessLevel

  /**
   * User's extensions.
   */
  val extensions: List<Extension>

  /**
   * [Readonly] GroupEntitlements that this user belongs to.
   */
  val groupAssignments: List<GroupEntitlement>

  /**
   * The unique identifier which matches the Id of the Identity associated with the GraphMember.
   */
  val id: String

  /**
   * [Readonly] Date the user last accessed the collection.
   */
  val lastAccessedDate: String

  /**
   * Relation between a project and the user's effective permissions in that project.
   */
  val projectEntitlements: List<ProjectEntitlement>

  val user: GraphUser
}
