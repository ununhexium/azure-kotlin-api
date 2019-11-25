package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface UpdatedProperties {
  val id: Int

  val lastUpdated: String

  val lastUpdatedBy: String

  val lastUpdatedByName: String

  val revision: Int
}
