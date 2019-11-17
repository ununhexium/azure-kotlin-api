package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.ReleaseReason

interface ReleaseStartMetadata {
  /**
   * Sets list of artifact to create a release.
   */
  val artifacts: List<ArtifactMetadata>

  /**
   * Sets definition Id to create a release.
   */
  val definitionId: Int

  /**
   * Sets description to create a release.
   */
  val description: String

  /**
   * Sets list of environments meta data.
   */
  val environmentsMetadata: List<ReleaseStartEnvironmentMetadata>

  /**
   * Sets 'true' to create release in draft mode, 'false' otherwise.
   */
  val isDraft: Boolean

  /**
   * Sets list of environments to manual as condition.
   */
  val manualEnvironments: List<String>

  val properties: PropertiesCollection

  /**
   * Sets reason to create a release.
   */
  val reason: ReleaseReason

  /**
   * Sets list of release variables to be overridden at deployment time.
   */
  val variables: JsonObject
}
