package net.lab0.azure.model.definition.work

import kotlin.String
import net.lab0.azure.model.definition.enumeration.work.TimelineCriteriaStatusCode

interface TimelineCriteriaStatus {
  val message: String

  val type: TimelineCriteriaStatusCode
}
