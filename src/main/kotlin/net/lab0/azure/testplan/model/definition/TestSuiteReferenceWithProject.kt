package net.lab0.azure.testplan.model.definition

/**
 * Test Suite Reference
 */
interface TestSuiteReferenceWithProject : TestSuiteReference {
  val project: TeamProjectReference
}
