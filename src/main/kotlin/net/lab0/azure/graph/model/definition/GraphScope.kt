package net.lab0.azure.graph.model.definition

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.graph.model.definition.enumeration.GroupScopeType

/**
 * Container where a graph entity is defined (organization, project, team)
 */
interface GraphScope : GraphSubject {
  /**
   * The subject descriptor that references the administrators group for this scope. Only members of
   * this group can change the contents of this scope or assign other users permissions to access this
   * scope.
   */
  val administratorDescriptor: String

  /**
   * When true, this scope is also a securing host for one or more scopes.
   */
  val isGlobal: Boolean

  /**
   * The subject descriptor for the closest account or organization in the ancestor tree of this
   * scope.
   */
  val parentDescriptor: String

  /**
   * The type of this scope. Typically ServiceHost or TeamProject.
   */
  val scopeType: GroupScopeType

  /**
   * The subject descriptor for the containing organization in the ancestor tree of this scope.
   */
  val securingHostDescriptor: String
}
