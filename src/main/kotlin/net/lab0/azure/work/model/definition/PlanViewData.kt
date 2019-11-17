package net.lab0.azure.work.model.definition

import kotlin.Int
import kotlin.String

/**
 * Base class for plan view data contracts. Anything common goes here.
 */
interface PlanViewData {
  val id: String

  val revision: Int
}
