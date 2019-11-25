package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String
import net.lab0.azure.model.definition.enumeration.cloudloadtest.LoadTestTypes

interface TestDefinitionBasic {
  val accessData: DropAccessData

  val createdBy: String

  val createdDate: String

  val id: String

  val lastModifiedBy: String

  val lastModifiedDate: String

  val loadTestType: LoadTestTypes

  val name: String
}
