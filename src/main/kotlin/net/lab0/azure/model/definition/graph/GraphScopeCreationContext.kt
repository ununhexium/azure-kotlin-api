package net.lab0.azure.model.definition.graph

import kotlin.String
import net.lab0.azure.model.definition.enumeration.graph.GroupScopeType

/**
 * This type is the subset of fields that can be provided by the user to create a Vsts scope. Scope
 * creation is currently limited to internal back-compat scenarios. End users that attempt to create a
 * scope with this API will fail.
 */
interface GraphScopeCreationContext {
  /**
   * Set this field to override the default description of this scope's admin group.
   */
  val adminGroupDescription: String

  /**
   * All scopes have an Administrator Group that controls access to the contents of the scope. Set
   * this field to use a non-default group name for that administrators group.
   */
  val adminGroupName: String

  /**
   * Set this optional field if this scope is created on behalf of a user other than the user making
   * the request. This should be the Id of the user that is not the requester.
   */
  val creatorId: String

  /**
   * The scope must be provided with a unique name within the parent scope. This means the created
   * scope can have a parent or child with the same name, but no siblings with the same name.
   */
  val name: String

  /**
   * The type of scope being created.
   */
  val scopeType: GroupScopeType

  /**
   * An optional ID that uniquely represents the scope within it's parent scope. If this parameter
   * is not provided, Vsts will generate on automatically.
   */
  val storageKey: String
}
