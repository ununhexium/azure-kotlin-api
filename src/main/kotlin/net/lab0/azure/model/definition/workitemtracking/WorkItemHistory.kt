package net.lab0.azure.model.definition.workitemtracking

import kotlin.Int
import kotlin.String

interface WorkItemHistory : WorkItemTrackingResource {
  val rev: Int

  val revisedBy: IdentityReference

  val revisedDate: String

  val value: String
}
