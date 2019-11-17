package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String

interface ReleaseArtifact {
  val artifactProvider: ArtifactProvider

  val artifactType: String

  val definitionData: String

  val definitionId: Int

  val description: String

  val id: Int

  val name: String

  val releaseId: Int
}
