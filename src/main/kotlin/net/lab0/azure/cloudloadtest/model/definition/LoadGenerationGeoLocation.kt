package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String

interface LoadGenerationGeoLocation {
  val location: String

  val percentage: Int
}
