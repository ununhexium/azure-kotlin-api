package net.lab0.azure.workitemtracking.model.definition

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
