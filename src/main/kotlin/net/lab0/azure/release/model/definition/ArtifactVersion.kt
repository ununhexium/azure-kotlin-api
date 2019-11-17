package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface ArtifactVersion {
  val alias: String

  val defaultVersion: BuildVersion

  val errorMessage: String

  val versions: List<BuildVersion>
}
