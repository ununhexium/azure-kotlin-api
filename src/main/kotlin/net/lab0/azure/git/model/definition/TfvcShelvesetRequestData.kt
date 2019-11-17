package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TfvcShelvesetRequestData {
  /**
   * Whether to include policyOverride and notes Only applies when requesting a single deep
   * shelveset
   */
  val includeDetails: Boolean

  /**
   * Whether to include the _links field on the shallow references. Does not apply when requesting a
   * single deep shelveset object. Links will always be included in the deep shelveset.
   */
  val includeLinks: Boolean

  /**
   * Whether to include workItems
   */
  val includeWorkItems: Boolean

  /**
   * Max number of changes to include
   */
  val maxChangeCount: Int

  /**
   * Max length of comment
   */
  val maxCommentLength: Int

  /**
   * Shelveset name
   */
  val name: String

  /**
   * Owner's ID. Could be a name or a guid.
   */
  val owner: String
}
