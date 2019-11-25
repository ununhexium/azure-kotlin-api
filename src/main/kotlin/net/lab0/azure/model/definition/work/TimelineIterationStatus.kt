package net.lab0.azure.model.definition.work

import kotlin.String
import net.lab0.azure.model.definition.enumeration.work.TimelineIterationStatusCode

interface TimelineIterationStatus {
  val message: String

  val type: TimelineIterationStatusCode
}
