package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitRefUpdateStatus

interface GitRefUpdateResult {
  /**
   * Custom message for the result object For instance, Reason for failing.
   */
  val customMessage: String

  /**
   * Whether the ref is locked or not
   */
  val isLocked: Boolean

  /**
   * Ref name
   */
  val name: String

  /**
   * New object ID
   */
  val newObjectId: String

  /**
   * Old object ID
   */
  val oldObjectId: String

  /**
   * Name of the plugin that rejected the updated.
   */
  val rejectedBy: String

  /**
   * Repository ID
   */
  val repositoryId: String

  /**
   * True if the ref update succeeded, false otherwise
   */
  val success: Boolean

  /**
   * Status of the update from the TFS server.
   */
  val updateStatus: GitRefUpdateStatus
}
