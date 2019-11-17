package net.lab0.azure.release.model.definition

import kotlin.String

interface ArtifactMetadata {
  /**
   * Sets alias of artifact.
   */
  val alias: String

  val instanceReference: BuildVersion
}
