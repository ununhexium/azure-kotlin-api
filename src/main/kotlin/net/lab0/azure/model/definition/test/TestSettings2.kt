package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents the test settings of the run. Used to create test settings and fetch test settings
 */
interface TestSettings2 {
  /**
   * Area path required to create test settings
   */
  val areaPath: String

  val createdBy: IdentityRef

  val createdDate: String

  /**
   * Description of the test settings. Used in create test settings.
   */
  val description: String

  /**
   * Indicates if the tests settings is public or private.Used in create test settings.
   */
  val isPublic: Boolean

  val lastUpdatedBy: IdentityRef

  val lastUpdatedDate: String

  /**
   * Xml string of machine roles. Used in create test settings.
   */
  val machineRoles: String

  /**
   * Test settings content.
   */
  val testSettingsContent: String

  /**
   * Test settings id.
   */
  val testSettingsId: Int

  /**
   * Test settings name.
   */
  val testSettingsName: String
}
