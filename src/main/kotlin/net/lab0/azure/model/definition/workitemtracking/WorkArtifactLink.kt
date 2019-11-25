package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * A work artifact link describes an outbound artifact link type.
 */
interface WorkArtifactLink {
  /**
   * Target artifact type.
   */
  val artifactType: String

  /**
   * Outbound link type.
   */
  val linkType: String

  /**
   * Target tool type.
   */
  val toolType: String
}
