package net.lab0.azure.work.model.definition

import kotlin.String
import net.lab0.azure.work.model.definition.enumeration.TimeFrame

interface TeamIterationAttributes {
  val finishDate: String

  val startDate: String

  val timeFrame: TimeFrame
}
