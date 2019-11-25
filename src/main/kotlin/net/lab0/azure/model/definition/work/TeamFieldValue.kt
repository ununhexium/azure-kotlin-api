package net.lab0.azure.model.definition.work

import kotlin.Boolean
import kotlin.String

/**
 * Represents a single TeamFieldValue
 */
interface TeamFieldValue {
  val includeChildren: Boolean

  val value: String
}
