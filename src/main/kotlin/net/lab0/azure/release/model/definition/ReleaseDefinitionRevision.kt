package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.AuditAction

interface ReleaseDefinitionRevision {
  /**
   * Gets api-version for revision object.
   */
  val apiVersion: String

  val changedBy: IdentityRef

  /**
   * Gets date on which it got changed.
   */
  val changedDate: String

  /**
   * Gets type of change.
   */
  val changeType: AuditAction

  /**
   * Gets comments for revision.
   */
  val comment: String

  /**
   * Get id of the definition.
   */
  val definitionId: Int

  /**
   * Gets definition url.
   */
  val definitionUrl: String

  /**
   * Get revision number of the definition.
   */
  val revision: Int
}
