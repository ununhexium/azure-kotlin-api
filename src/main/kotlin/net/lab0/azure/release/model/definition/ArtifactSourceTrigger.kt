package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface ArtifactSourceTrigger : ReleaseTriggerBase {
  /**
   * Artifact source alias for Artifact Source trigger type
   */
  val artifactAlias: String

  val triggerConditions: List<ArtifactFilter>
}
