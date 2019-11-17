package net.lab0.azure.tfvc.model.definition

import kotlin.String

/**
 * This is the shallow branchref class.
 */
interface TfvcShallowBranchRef {
  /**
   * Path for the branch.
   */
  val path: String
}
