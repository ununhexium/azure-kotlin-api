package net.lab0.azure.model.definition.release

import kotlin.String

interface ArtifactMetadata {
  /**
   * Sets alias of artifact.
   */
  val alias: String

  val instanceReference: BuildVersion
}
