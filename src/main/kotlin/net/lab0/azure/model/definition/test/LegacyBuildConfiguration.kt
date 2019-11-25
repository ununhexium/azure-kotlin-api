package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface LegacyBuildConfiguration {
  val branchName: String

  val buildConfigurationId: Int

  val buildDefinitionId: Int

  val buildDefinitionName: String

  val buildFlavor: String

  val buildId: Int

  val buildNumber: String

  val buildPlatform: String

  val buildQuality: String

  val buildSystem: String

  val buildUri: String

  val completedDate: String

  val createdDate: String

  val oldBuildConfigurationId: Int

  val repositoryId: String

  val repositoryType: String

  val sourceVersion: String

  val teamProjectName: String
}
