package net.lab0.azure.testplan.model.definition

import net.lab0.azure.testplan.model.definition.enumeration.Outcome

/**
 * Results class for Test Point
 */
interface Results {
  /**
   * Outcome of the Test Point
   */
  val outcome: Outcome
}
