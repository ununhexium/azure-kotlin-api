package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TfvcLabelRequestData {
  /**
   * Whether to include the _links field on the shallow references
   */
  val includeLinks: Boolean

  val itemLabelFilter: String

  val labelScope: String

  val maxItemCount: Int

  val name: String

  val owner: String
}
