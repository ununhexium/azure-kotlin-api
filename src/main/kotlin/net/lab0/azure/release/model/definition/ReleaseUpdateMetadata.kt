package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.ReleaseStatus

interface ReleaseUpdateMetadata {
  /**
   * Sets comment for release.
   */
  val comment: String

  /**
   * Set 'true' to exclude the release from retention policies.
   */
  val keepForever: Boolean

  /**
   * Sets list of manual environments.
   */
  val manualEnvironments: List<String>

  /**
   * Sets status of the release.
   */
  val status: ReleaseStatus
}
