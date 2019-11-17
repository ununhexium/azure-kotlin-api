package net.lab0.azure.test.model.definition

import kotlin.String

/**
 * This is a temporary class to provide the details for the test run environment.
 */
interface DtlEnvironmentDetails {
  val csmContent: String

  val csmParameters: String

  val subscriptionName: String
}
