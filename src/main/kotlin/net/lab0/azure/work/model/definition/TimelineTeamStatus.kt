package net.lab0.azure.work.model.definition

import kotlin.String
import net.lab0.azure.work.model.definition.enumeration.TimelineTeamStatusCode

interface TimelineTeamStatus {
  val message: String

  val type: TimelineTeamStatusCode
}
