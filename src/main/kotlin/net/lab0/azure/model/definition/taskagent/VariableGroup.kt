package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A variable group is a collection of related variables.
 */
interface VariableGroup {
  val createdBy: IdentityRef

  /**
   * Gets or sets the time when variable group was created.
   */
  val createdOn: String

  /**
   * Gets or sets description of the variable group.
   */
  val description: String

  /**
   * Gets or sets id of the variable group.
   */
  val id: Int

  /**
   * Indicates whether variable group is shared with other projects or not.
   */
  val isShared: Boolean

  val modifiedBy: IdentityRef

  /**
   * Gets or sets the time when variable group was modified
   */
  val modifiedOn: String

  /**
   * Gets or sets name of the variable group.
   */
  val name: String

  val providerData: VariableGroupProviderData

  /**
   * Gets or sets type of the variable group.
   */
  val type: String

  /**
   * Gets or sets variables contained in the variable group.
   */
  val variables: JsonObject
}
