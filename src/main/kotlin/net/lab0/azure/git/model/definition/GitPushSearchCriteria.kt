package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.String

interface GitPushSearchCriteria {
  val fromDate: String

  /**
   * Whether to include the _links field on the shallow references
   */
  val includeLinks: Boolean

  val includeRefUpdates: Boolean

  val pusherId: String

  val refName: String

  val toDate: String
}
