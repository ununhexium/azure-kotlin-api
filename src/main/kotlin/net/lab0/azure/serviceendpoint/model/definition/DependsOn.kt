package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String
import kotlin.collections.List

interface DependsOn {
  val input: String

  val map: List<DependencyBinding>
}
