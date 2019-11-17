package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.extensionmanagement.model.definition.enumeration.AcquisitionOperationState
import net.lab0.azure.extensionmanagement.model.definition.enumeration.AcquisitionOperationType

interface AcquisitionOperation {
  /**
   * State of the the AcquisitionOperation for the current user
   */
  val operationState: AcquisitionOperationState

  /**
   * AcquisitionOperationType: install, request, buy, etc...
   */
  val operationType: AcquisitionOperationType

  /**
   * Optional reason to justify current state. Typically used with Disallow state.
   */
  val reason: String

  /**
   * List of reasons indicating why the operation is not allowed.
   */
  val reasons: List<AcquisitionOperationDisallowReason>
}
