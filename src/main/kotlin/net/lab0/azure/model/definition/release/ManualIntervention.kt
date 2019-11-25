package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.ManualInterventionStatus

interface ManualIntervention {
  val approver: IdentityRef

  /**
   * Gets or sets comments for approval.
   */
  val comments: String

  /**
   * Gets date on which it got created.
   */
  val createdOn: String

  /**
   * Gets the unique identifier for manual intervention.
   */
  val id: Int

  /**
   * Gets or sets instructions for approval.
   */
  val instructions: String

  /**
   * Gets date on which it got modified.
   */
  val modifiedOn: String

  /**
   * Gets or sets the name.
   */
  val name: String

  val release: ReleaseShallowReference

  val releaseDefinition: ReleaseDefinitionShallowReference

  val releaseEnvironment: ReleaseEnvironmentShallowReference

  /**
   * Gets or sets the status of the manual intervention.
   */
  val status: ManualInterventionStatus

  /**
   * Get task instance identifier.
   */
  val taskInstanceId: String

  /**
   * Gets url to access the manual intervention.
   */
  val url: String
}
