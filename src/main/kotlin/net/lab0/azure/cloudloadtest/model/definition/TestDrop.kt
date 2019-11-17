package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String

interface TestDrop {
  val accessData: DropAccessData

  val createdDate: String

  val dropType: String

  val id: String

  val loadTestDefinition: LoadTestDefinition

  val testRunId: String
}
