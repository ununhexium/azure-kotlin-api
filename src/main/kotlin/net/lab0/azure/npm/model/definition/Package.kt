package net.lab0.azure.npm.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Package version metadata for an npm package
 */
interface Package {
  val _links: ReferenceLinks

  /**
   * Deprecated message, if any, for the package.
   */
  val deprecateMessage: String

  /**
   * Package Id.
   */
  val id: String

  /**
   * The display name of the package.
   */
  val name: String

  /**
   * If and when the package was permanently deleted.
   */
  val permanentlyDeletedDate: String

  /**
   * The history of upstream sources for this package. The first source in the list is the immediate
   * source from which this package was saved.
   */
  val sourceChain: List<UpstreamSourceInfo>

  /**
   * If and when the package was deleted.
   */
  val unpublishedDate: String

  /**
   * The version of the package.
   */
  val version: String
}
