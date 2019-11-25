package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import kotlin.collections.List

/**
 * Result of an update work item type XML update operation.
 */
interface ProvisioningResult {
  /**
   * Details about of the provisioning import events.
   */
  val provisioningImportEvents: List<String>
}
