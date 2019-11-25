package net.lab0.azure.model.definition.work

import kotlin.String
import net.lab0.azure.model.definition.enumeration.work.TimeFrame

interface TeamIterationAttributes {
  val finishDate: String

  val startDate: String

  val timeFrame: TimeFrame
}
