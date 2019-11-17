package net.lab0.azure.workitemtracking.model.definition

import kotlin.Int
import kotlin.String

interface WorkItemHistory : WorkItemTrackingResource {
  val rev: Int

  val revisedBy: IdentityReference

  val revisedDate: String

  val value: String
}
