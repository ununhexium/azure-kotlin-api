package net.lab0.azure.release.model.definition

import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.ManualInterventionStatus

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
