package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitStatusState

/**
 * This class contains the metadata of a service/extension posting a status.
 */
interface GitStatus {
  val _links: ReferenceLinks

  val context: GitStatusContext

  val createdBy: IdentityRef

  /**
   * Creation date and time of the status.
   */
  val creationDate: String

  /**
   * Status description. Typically describes current state of the status.
   */
  val description: String

  /**
   * Status identifier.
   */
  val id: Int

  /**
   * State of the status.
   */
  val state: GitStatusState

  /**
   * URL with status details.
   */
  val targetUrl: String

  /**
   * Last update date and time of the status.
   */
  val updatedDate: String
}
