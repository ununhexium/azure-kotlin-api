package net.lab0.azure.model.definition.workitemtracking

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.CustomizationType
import net.lab0.azure.model.definition.enumeration.workitemtracking.FieldType

/**
 * Class that describes a field in a work item type and its properties.
 */
interface ProcessWorkItemTypeField {
  /**
   * Allow setting field value to a group identity. Only applies to identity fields.
   */
  val allowGroups: Boolean

  val customization: CustomizationType

  /**
   * The default value of the field.
   */
  val defaultValue: JsonObject

  /**
   * Description of the field.
   */
  val description: String

  /**
   * Name of the field.
   */
  val name: String

  /**
   * If true the field cannot be edited.
   */
  val readOnly: Boolean

  /**
   * Reference name of the field.
   */
  val referenceName: String

  /**
   * If true the field cannot be empty.
   */
  val required: Boolean

  /**
   * Type of the field.
   */
  val type: FieldType

  /**
   * Resource URL of the field.
   */
  val url: String
}
