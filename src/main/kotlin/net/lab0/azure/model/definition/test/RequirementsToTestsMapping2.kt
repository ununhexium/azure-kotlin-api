package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface RequirementsToTestsMapping2 {
  val createdBy: String

  val creationDate: String

  val deletedBy: String

  val deletionDate: String

  val isMigratedToWIT: Boolean

  val projectId: String

  val testMetadataId: Int

  val workItemId: Int
}
