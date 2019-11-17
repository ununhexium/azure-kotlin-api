package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String

interface Metric {
  val name: String

  val value: Int
}
