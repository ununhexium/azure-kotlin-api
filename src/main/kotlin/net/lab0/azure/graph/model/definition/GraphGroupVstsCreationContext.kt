package net.lab0.azure.graph.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Use this type to create a new Vsts group that is not backed by an external provider.
 */
interface GraphGroupVstsCreationContext : GraphGroupCreationContext {
  /**
   * For internal use only in back compat scenarios.
   */
  val crossProject: Boolean

  /**
   * Used by VSTS groups; if set this will be the group description, otherwise ignored
   */
  val description: String

  val descriptor: String

  /**
   * Used by VSTS groups; if set this will be the group DisplayName, otherwise ignored
   */
  val displayName: String

  /**
   * For internal use only in back compat scenarios.
   */
  val restrictedVisibility: Boolean

  /**
   * For internal use only in back compat scenarios.
   */
  val specialGroupType: String
}
