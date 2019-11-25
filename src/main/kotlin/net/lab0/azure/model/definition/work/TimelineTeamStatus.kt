package net.lab0.azure.model.definition.work

import kotlin.String
import net.lab0.azure.model.definition.enumeration.work.TimelineTeamStatusCode

interface TimelineTeamStatus {
  val message: String

  val type: TimelineTeamStatusCode
}
