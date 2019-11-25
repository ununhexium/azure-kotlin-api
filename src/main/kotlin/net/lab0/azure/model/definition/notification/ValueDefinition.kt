package net.lab0.azure.model.definition.notification

import kotlin.String
import kotlin.collections.List

/**
 * Encapsulates the properties of a field value definition. It has the information needed to
 * retrieve the list of possible values for a certain field and how to handle that field values in the
 * UI. This information includes what type of object this value represents, which property to use for
 * UI display and which property to use for saving the subscription
 */
interface ValueDefinition {
  /**
   * Gets or sets the data source.
   */
  val dataSource: List<InputValue>

  /**
   * Gets or sets the rest end point.
   */
  val endPoint: String

  /**
   * Gets or sets the result template.
   */
  val resultTemplate: String
}
