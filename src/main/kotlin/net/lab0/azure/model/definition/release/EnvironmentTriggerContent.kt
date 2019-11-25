package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface EnvironmentTriggerContent {
  val action: String

  val eventTypes: List<String>
}
