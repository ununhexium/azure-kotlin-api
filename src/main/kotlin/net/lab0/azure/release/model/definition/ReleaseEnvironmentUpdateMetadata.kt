package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.EnvironmentStatus

interface ReleaseEnvironmentUpdateMetadata {
  /**
   * Gets or sets comment.
   */
  val comment: String

  /**
   * Gets or sets scheduled deployment time.
   */
  val scheduledDeploymentTime: String

  /**
   * Gets or sets status of environment.
   */
  val status: EnvironmentStatus

  /**
   * Sets list of environment variables to be overridden at deployment time.
   */
  val variables: JsonObject
}
