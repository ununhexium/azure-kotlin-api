package net.lab0.azure.work.model.definition

import kotlin.String

/**
 * Reference to a field in a work item
 */
interface WorkItemFieldReference {
  /**
   * The name of the field.
   */
  val name: String

  /**
   * The reference name of the field.
   */
  val referenceName: String

  /**
   * The REST URL of the resource.
   */
  val url: String
}
