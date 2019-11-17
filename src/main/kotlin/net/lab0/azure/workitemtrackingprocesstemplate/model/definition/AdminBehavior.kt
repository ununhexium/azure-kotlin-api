package net.lab0.azure.workitemtrackingprocesstemplate.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Describes an admin behavior for a process.
 */
interface AdminBehavior {
  /**
   * Is the behavior abstract (i.e. can not be associated with any work item type).
   */
  val abstract: Boolean

  /**
   * The color associated with the behavior.
   */
  val color: String

  /**
   * Indicates if the behavior is custom.
   */
  val custom: Boolean

  /**
   * The description of the behavior.
   */
  val description: String

  /**
   * List of behavior fields.
   */
  val fields: List<AdminBehaviorField>

  /**
   * Behavior ID.
   */
  val id: String

  /**
   * Parent behavior reference.
   */
  val inherits: String

  /**
   * The behavior name.
   */
  val name: String

  /**
   * Is the behavior overrides a behavior from system process.
   */
  val overriden: Boolean

  /**
   * The rank.
   */
  val rank: Int
}
