package net.lab0.azure.release.model.definition

import kotlin.String

interface ArtifactInstanceData {
  val accountName: String

  val authenticationToken: String

  val tfsUrl: String

  val version: String
}
