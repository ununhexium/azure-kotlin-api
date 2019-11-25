package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface ArtifactProvider {
  val id: Int

  val name: String

  val sourceUri: String

  val version: String
}
