package net.lab0.azure.release.model.definition

import kotlin.String

interface ReleaseManagementInputValue {
  /**
   * The text to show for the display of this value
   */
  val displayValue: String

  /**
   * The value to store for this input
   */
  val value: String
}
