package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestCaseMetadata2 {
  val container: String

  val name: String

  val projectId: String

  val testMetadataId: Int
}
