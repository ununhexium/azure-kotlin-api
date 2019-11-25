package net.lab0.azure.model.definition.test

import net.lab0.azure.model.definition.enumeration.test.TestResultsContextType

interface TestResultsContext {
  val build: BuildReference

  val contextType: TestResultsContextType

  val release: ReleaseReference
}
