package net.lab0.azure.model.definition.work

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.work.FieldType

/**
 * Object bag storing the set of permissions relevant to this plan
 */
interface FieldInfo {
  /**
   * The additional field display name
   */
  val displayName: String

  /**
   * The additional field type
   */
  val fieldType: FieldType

  /**
   * Indicates if the field definition is for an identity field.
   */
  val isIdentity: Boolean

  /**
   * The additional field reference name
   */
  val referenceName: String
}
