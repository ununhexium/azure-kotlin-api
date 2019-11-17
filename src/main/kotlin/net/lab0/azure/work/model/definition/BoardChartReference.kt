package net.lab0.azure.work.model.definition

import kotlin.String

interface BoardChartReference {
  /**
   * Name of the resource
   */
  val name: String

  /**
   * Full http link to the resource
   */
  val url: String
}
