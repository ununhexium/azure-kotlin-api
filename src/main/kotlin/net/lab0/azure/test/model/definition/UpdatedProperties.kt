package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface UpdatedProperties {
  val id: Int

  val lastUpdated: String

  val lastUpdatedBy: String

  val lastUpdatedByName: String

  val revision: Int
}
