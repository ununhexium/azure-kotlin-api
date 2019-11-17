package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface Coverage2 {
  val coverageId: Int

  val dateCreated: String

  val dateModified: String

  val lastError: String

  val state: String
}
