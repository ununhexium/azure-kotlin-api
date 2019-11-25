package net.lab0.azure.model.definition.extensionmanagement

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Specifies a constraint that can be used to dynamically include/exclude a given contribution
 */
interface ContributionConstraint {
  /**
   * An optional property that can be specified to group constraints together. All constraints
   * within a group are AND'd together (all must be evaluate to True in order for the contribution to
   * be included). Different groups of constraints are OR'd (only one group needs to evaluate to True
   * for the contribution to be included).
   */
  val group: Int

  /**
   * Fully qualified identifier of a shared constraint
   */
  val id: String

  /**
   * If true, negate the result of the filter (include the contribution if the applied filter
   * returns false instead of true)
   */
  val inverse: Boolean

  /**
   * Name of the IContributionFilter plugin
   */
  val name: String

  val properties: JObject

  /**
   * Constraints can be optionally be applied to one or more of the relationships defined in the
   * contribution. If no relationships are defined then all relationships are associated with the
   * constraint. This means the default behaviour will elimiate the contribution from the tree
   * completely if the constraint is applied.
   */
  val relationships: List<String>
}
