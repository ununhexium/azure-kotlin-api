package net.lab0.azure.notification.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Encapsulates the properties of an operator constraint. An operator constraint defines if some
 * operator is available only for specific scope like a project scope.
 */
interface OperatorConstraint {
  val operator: String

  /**
   * Gets or sets the list of scopes that this type supports.
   */
  val supportedScopes: List<String>
}
