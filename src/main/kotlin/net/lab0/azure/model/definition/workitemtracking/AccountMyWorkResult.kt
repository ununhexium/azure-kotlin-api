package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.collections.List

interface AccountMyWorkResult {
  /**
   * True, when length of WorkItemDetails is same as the limit
   */
  val querySizeLimitExceeded: Boolean

  /**
   * WorkItem Details
   */
  val workItemDetails: List<AccountWorkWorkItemModel>
}
