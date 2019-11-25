package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

interface AcquisitionOperationDisallowReason {
  /**
   * User-friendly message clarifying the reason for disallowance
   */
  val message: String

  /**
   * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
   */
  val type: String
}
