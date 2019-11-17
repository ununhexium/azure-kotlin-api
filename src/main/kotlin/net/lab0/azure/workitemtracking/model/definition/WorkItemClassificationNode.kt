package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.workitemtracking.model.definition.enumeration.TreeNodeStructureType

/**
 * Defines a classification node for work item tracking.
 */
interface WorkItemClassificationNode : WorkItemTrackingResource {
  /**
   * Dictionary that has node attributes like start/finish date for iteration nodes.
   */
  val attributes: JsonObject

  /**
   * List of child nodes fetched.
   */
  val children: List<WorkItemClassificationNode>

  /**
   * Flag that indicates if the classification node has any child nodes.
   */
  val hasChildren: Boolean

  /**
   * Integer ID of the classification node.
   */
  val id: Int

  /**
   * GUID ID of the classification node.
   */
  val identifier: String

  /**
   * Name of the classification node.
   */
  val name: String

  /**
   * Node structure type.
   */
  val structureType: TreeNodeStructureType
}
