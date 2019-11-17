package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import net.lab0.azure.extensionmanagement.model.definition.enumeration.ExtensionRequestState

/**
 * A request for an extension (to be installed or have a license assigned)
 */
interface ExtensionRequest {
  /**
   * Required message supplied if the request is rejected
   */
  val rejectMessage: String

  /**
   * Date at which the request was made
   */
  val requestDate: String

  val requestedBy: IdentityRef

  /**
   * Optional message supplied by the requester justifying the request
   */
  val requestMessage: String

  /**
   * Represents the state of the request
   */
  val requestState: ExtensionRequestState

  /**
   * Date at which the request was resolved
   */
  val resolveDate: String

  val resolvedBy: IdentityRef
}
