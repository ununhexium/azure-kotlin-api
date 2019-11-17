package net.lab0.azure.workitemtrackingprocesstemplate.model.definition

import kotlin.String

/**
 * Describes an admin behavior field.
 */
interface AdminBehaviorField {
  /**
   * The behavior field identifier.
   */
  val behaviorFieldId: String

  /**
   * The behavior ID.
   */
  val id: String

  /**
   * The behavior name.
   */
  val name: String
}
