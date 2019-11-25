package net.lab0.azure.model.definition.testplan

/**
 * Test Suite Reference
 */
interface TestSuiteReferenceWithProject : TestSuiteReference {
  val project: TeamProjectReference
}
