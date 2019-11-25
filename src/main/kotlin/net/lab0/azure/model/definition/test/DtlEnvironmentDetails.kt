package net.lab0.azure.model.definition.test

import kotlin.String

/**
 * This is a temporary class to provide the details for the test run environment.
 */
interface DtlEnvironmentDetails {
  val csmContent: String

  val csmParameters: String

  val subscriptionName: String
}
