package net.lab0.azure.git.model.definition

import kotlin.String

/**
 * A branch mapping.
 */
interface TfvcBranchMapping {
  /**
   * Depth of the branch.
   */
  val depth: String

  /**
   * Server item for the branch.
   */
  val serverItem: String

  /**
   * Type of the branch.
   */
  val type: String
}
