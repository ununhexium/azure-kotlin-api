package net.lab0.azure.model.definition.core

import kotlin.String
import net.lab0.azure.model.definition.enumeration.core.ProcessCustomizationType

/**
 * Data contract for a TeamProjectCollection.
 */
interface TeamProjectCollection : TeamProjectCollectionReference {
  val _links: ReferenceLinks

  /**
   * Project collection description.
   */
  val description: String

  /**
   * Process customzation type on this collection. It can be Xml or Inherited.
   */
  val processCustomizationType: ProcessCustomizationType

  /**
   * Project collection state.
   */
  val state: String
}
