package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String

/**
 * Class that describes a request to add a field in a work item type.
 */
interface AddProcessWorkItemTypeFieldRequest {
  /**
   * Allow setting field value to a group identity. Only applies to identity fields.
   */
  val allowGroups: Boolean

  /**
   * The default value of the field.
   */
  val defaultValue: JsonObject

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
}
