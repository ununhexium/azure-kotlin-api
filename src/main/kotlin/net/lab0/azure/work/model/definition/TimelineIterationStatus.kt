package net.lab0.azure.work.model.definition

import kotlin.String
import net.lab0.azure.work.model.definition.enumeration.TimelineIterationStatusCode

interface TimelineIterationStatus {
  val message: String

  val type: TimelineIterationStatusCode
}
