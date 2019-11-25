package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface Metric {
  val name: String

  val value: Int
}
