package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.String

interface ConfigurationVariableValue {
  /**
   * Gets or sets if a variable can be overridden at deployment time or not.
   */
  val allowOverride: Boolean

  /**
   * Gets or sets as variable is secret or not.
   */
  val isSecret: Boolean

  /**
   * Gets or sets value of the configuration variable.
   */
  val value: String
}
