package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.enumeration.LoadTestTypes

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
