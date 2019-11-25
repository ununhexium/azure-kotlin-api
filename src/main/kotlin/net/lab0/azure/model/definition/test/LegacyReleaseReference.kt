package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface LegacyReleaseReference {
  val attempt: Int

  val environmentCreationDate: String

  val primaryArtifactBuildId: Int

  val primaryArtifactProjectId: String

  val primaryArtifactType: String

  val releaseCreationDate: String

  val releaseDefId: Int

  val releaseEnvDefId: Int

  val releaseEnvId: Int

  val releaseEnvName: String

  val releaseEnvUri: String

  val releaseId: Int

  val releaseName: String

  val releaseRefId: Int

  val releaseUri: String
}
