package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.test.model.definition.enumeration.TestConfigurationState

/**
 * Test configuration
 */
interface TestConfiguration {
  val area: ShallowReference

  /**
   * Description of the configuration
   */
  val description: String

  /**
   * Id of the configuration
   */
  val id: Int

  /**
   * Is the configuration a default for the test plans
   */
  val isDefault: Boolean

  val lastUpdatedBy: IdentityRef

  /**
   * Last Updated Data
   */
  val lastUpdatedDate: String

  /**
   * Name of the configuration
   */
  val name: String

  val project: ShallowReference

  /**
   * Revision of the the configuration
   */
  val revision: Int

  /**
   * State of the configuration
   */
  val state: TestConfigurationState

  /**
   * Url of Configuration Resource
   */
  val url: String

  /**
   * Dictionary of Test Variable, Selected Value
   */
  val values: List<NameValuePair>
}
