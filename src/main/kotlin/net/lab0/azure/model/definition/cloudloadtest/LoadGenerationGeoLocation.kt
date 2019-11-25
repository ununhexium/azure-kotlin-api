package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String

interface LoadGenerationGeoLocation {
  val location: String

  val percentage: Int
}
