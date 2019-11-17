package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitConflictUpdateStatus

interface GitConflictUpdateResult {
  /**
   * Conflict ID that was provided by input
   */
  val conflictId: Int

  /**
   * Reason for failing
   */
  val customMessage: String

  val updatedConflict: GitConflict

  /**
   * Status of the update on the server
   */
  val updateStatus: GitConflictUpdateStatus
}
