package net.lab0.azure.model.definition.release

import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.ManualInterventionStatus

interface ManualInterventionUpdateMetadata {
  /**
   * Sets the comment for manual intervention update.
   */
  val comment: String

  /**
   * Sets the status of the manual intervention.
   */
  val status: ManualInterventionStatus
}
