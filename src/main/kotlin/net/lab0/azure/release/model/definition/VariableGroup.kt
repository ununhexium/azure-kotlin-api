package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface VariableGroup {
  val createdBy: IdentityRef

  /**
   * Gets date on which it got created.
   */
  val createdOn: String

  /**
   * Gets or sets description.
   */
  val description: String

  /**
   * Gets the unique identifier of this field.
   */
  val id: Int

  /**
   * Denotes if a variable group is shared with other project or not.
   */
  val isShared: Boolean

  val modifiedBy: IdentityRef

  /**
   * Gets date on which it got modified.
   */
  val modifiedOn: String

  /**
   * Gets or sets name.
   */
  val name: String

  val providerData: VariableGroupProviderData

  /**
   * Gets or sets type.
   */
  val type: String

  val variables: JsonObject
}
