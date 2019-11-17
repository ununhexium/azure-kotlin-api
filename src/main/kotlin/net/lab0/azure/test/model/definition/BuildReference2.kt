package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface BuildReference2 {
  val branchName: String

  val buildConfigurationId: Int

  val buildDefinitionId: Int

  val buildDeleted: Boolean

  val buildFlavor: String

  val buildId: Int

  val buildNumber: String

  val buildPlatform: String

  val buildSystem: String

  val buildUri: String

  val coverageId: Int

  val createdDate: String

  val projectId: String

  val repoId: String

  val repoType: String

  val sourceVersion: String
}
