package net.lab0.azure.model.definition.testplan

import net.lab0.azure.model.definition.enumeration.testplan.Outcome

/**
 * Results class for Test Point
 */
interface Results {
  /**
   * Outcome of the Test Point
   */
  val outcome: Outcome
}
