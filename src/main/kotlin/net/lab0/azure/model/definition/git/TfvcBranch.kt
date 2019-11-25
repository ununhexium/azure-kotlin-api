package net.lab0.azure.model.definition.git

import kotlin.collections.List

/**
 * Class representing a branch object.
 */
interface TfvcBranch : TfvcBranchRef {
  /**
   * List of children for the branch.
   */
  val children: List<TfvcBranch>

  /**
   * List of branch mappings.
   */
  val mappings: List<TfvcBranchMapping>

  val parent: TfvcShallowBranchRef

  /**
   * List of paths of the related branches.
   */
  val relatedBranches: List<TfvcShallowBranchRef>
}
