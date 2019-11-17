package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface EnvironmentTriggerContent {
  val action: String

  val eventTypes: List<String>
}
