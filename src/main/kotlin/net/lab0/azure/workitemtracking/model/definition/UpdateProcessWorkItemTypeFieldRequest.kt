package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject
import kotlin.Boolean

/**
 * Class to describe a request that updates a field's properties in a work item type.
 */
interface UpdateProcessWorkItemTypeFieldRequest {
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
   * The default value of the field.
   */
  val required: Boolean
}
