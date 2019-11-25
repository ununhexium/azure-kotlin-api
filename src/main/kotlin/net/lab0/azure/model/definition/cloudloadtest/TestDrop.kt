package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String

interface TestDrop {
  val accessData: DropAccessData

  val createdDate: String

  val dropType: String

  val id: String

  val loadTestDefinition: LoadTestDefinition

  val testRunId: String
}
