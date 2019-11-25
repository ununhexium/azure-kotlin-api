package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.FieldType
import net.lab0.azure.model.definition.enumeration.workitemtracking.FieldUsage

/**
 * Describes a field on a work item and it's properties specific to that work item type.
 */
interface WorkItemField : WorkItemTrackingResource {
  /**
   * Indicates whether the field is sortable in server queries.
   */
  val canSortBy: Boolean

  /**
   * The description of the field.
   */
  val description: String

  /**
   * Indicates whether this field is an identity field.
   */
  val isIdentity: Boolean

  /**
   * Indicates whether this instance is picklist.
   */
  val isPicklist: Boolean

  /**
   * Indicates whether this instance is a suggested picklist .
   */
  val isPicklistSuggested: Boolean

  /**
   * Indicates whether the field can be queried in the server.
   */
  val isQueryable: Boolean

  /**
   * The name of the field.
   */
  val name: String

  /**
   * If this field is picklist, the identifier of the picklist associated, otherwise null
   */
  val picklistId: String

  /**
   * Indicates whether the field is [read only].
   */
  val readOnly: Boolean

  /**
   * The reference name of the field.
   */
  val referenceName: String

  /**
   * The supported operations on this field.
   */
  val supportedOperations: List<WorkItemFieldOperation>

  /**
   * The type of the field.
   */
  val type: FieldType

  /**
   * The usage of the field.
   */
  val usage: FieldUsage
}
