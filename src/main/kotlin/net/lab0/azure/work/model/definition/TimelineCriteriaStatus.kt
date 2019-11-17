package net.lab0.azure.work.model.definition

import kotlin.String
import net.lab0.azure.work.model.definition.enumeration.TimelineCriteriaStatusCode

interface TimelineCriteriaStatus {
  val message: String

  val type: TimelineCriteriaStatusCode
}
