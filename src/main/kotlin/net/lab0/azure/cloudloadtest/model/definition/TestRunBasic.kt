package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.cloudloadtest.model.definition.enumeration.TestRunState
import net.lab0.azure.cloudloadtest.model.definition.enumeration.TestRunType

interface TestRunBasic {
  val createdBy: String

  val createdDate: String

  val deletedBy: String

  val deletedDate: String

  val finishedDate: String

  val id: String

  val loadGenerationGeoLocations: List<LoadGenerationGeoLocation>

  val loadTestFileName: String

  val name: String

  val runNumber: Int

  val runSource: String

  val runSpecificDetails: LoadTestRunDetails

  val runType: TestRunType

  val state: TestRunState

  val url: String
}
