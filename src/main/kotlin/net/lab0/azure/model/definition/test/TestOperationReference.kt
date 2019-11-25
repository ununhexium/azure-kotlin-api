package net.lab0.azure.model.definition.test

import kotlin.String

/**
 * Class representing a reference to an operation.
 */
interface TestOperationReference {
  val id: String

  val status: String

  val url: String
}
