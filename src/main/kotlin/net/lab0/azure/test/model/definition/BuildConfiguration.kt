package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface BuildConfiguration {
  val branchName: String

  val buildDefinitionId: Int

  val buildSystem: String

  val creationDate: String

  val flavor: String

  val id: Int

  val number: String

  val platform: String

  val project: ShallowReference

  val repositoryGuid: String

  val repositoryType: String

  val sourceVersion: String

  val uri: String
}
