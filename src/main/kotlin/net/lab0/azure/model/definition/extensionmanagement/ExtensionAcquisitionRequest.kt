package net.lab0.azure.model.definition.extensionmanagement

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.extensionmanagement.AcquisitionAssignmentType
import net.lab0.azure.model.definition.enumeration.extensionmanagement.AcquisitionOperationType

/**
 * Contract for handling the extension acquisition process
 */
interface ExtensionAcquisitionRequest {
  /**
   * How the item is being assigned
   */
  val assignmentType: AcquisitionAssignmentType

  /**
   * The id of the subscription used for purchase
   */
  val billingId: String

  /**
   * The marketplace id (publisherName.extensionName) for the item
   */
  val itemId: String

  /**
   * The type of operation, such as install, request, purchase
   */
  val operationType: AcquisitionOperationType

  val properties: JObject

  /**
   * How many licenses should be purchased
   */
  val quantity: Int
}
