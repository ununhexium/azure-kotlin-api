package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.String

/**
 * Metadata for a branchref.
 */
interface TfvcBranchRef : TfvcShallowBranchRef {
  val _links: ReferenceLinks

  /**
   * Creation date of the branch.
   */
  val createdDate: String

  /**
   * Branch description.
   */
  val description: String

  /**
   * Is the branch deleted?
   */
  val isDeleted: Boolean

  val owner: IdentityRef

  /**
   * URL to retrieve the item.
   */
  val url: String
}
