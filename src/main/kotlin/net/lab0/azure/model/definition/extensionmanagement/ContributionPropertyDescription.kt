package net.lab0.azure.model.definition.extensionmanagement

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ContributionPropertyType

/**
 * Description about a property of a contribution type
 */
interface ContributionPropertyDescription {
  /**
   * Description of the property
   */
  val description: String

  /**
   * Name of the property
   */
  val name: String

  /**
   * True if this property is required
   */
  val required: Boolean

  /**
   * The type of value used for this property
   */
  val type: ContributionPropertyType
}
