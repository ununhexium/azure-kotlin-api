package net.lab0.azure.test.model.definition

import net.lab0.azure.test.model.definition.enumeration.TestResultsContextType

interface TestResultsContext {
  val build: BuildReference

  val contextType: TestResultsContextType

  val release: ReleaseReference
}
