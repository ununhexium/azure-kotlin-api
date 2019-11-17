package net.lab0.azure.test.model.definition

/**
 * Adding test cases to a suite creates one of more test points based on the default configurations
 * and testers assigned to the test suite. PointAssignment is the list of test points that were created
 * for each of the test cases that were added to the test suite.
 */
interface PointAssignment {
  val configuration: ShallowReference

  val tester: IdentityRef
}
