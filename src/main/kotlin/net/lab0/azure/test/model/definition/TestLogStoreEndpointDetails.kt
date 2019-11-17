package net.lab0.azure.test.model.definition

import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.TestLogStoreEndpointType

/**
 * Represents Test Log store endpoint details.
 */
interface TestLogStoreEndpointDetails {
  /**
   * Test log store connection Uri.
   */
  val endpointSASUri: String

  /**
   * Test log store endpoint type.
   */
  val endpointType: TestLogStoreEndpointType
}
