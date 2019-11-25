package net.lab0.azure.model.definition.work

import kotlin.Int
import kotlin.String

/**
 * Base class for plan view data contracts. Anything common goes here.
 */
interface PlanViewData {
  val id: String

  val revision: Int
}
