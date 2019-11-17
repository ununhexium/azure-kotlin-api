package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface ReleaseReference2 {
  val attempt: Int

  val environmentCreationDate: String

  val projectId: String

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
