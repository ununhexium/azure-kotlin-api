package net.lab0.azure.core.model.definition

import kotlin.String

interface WebApiProjectCollection : WebApiProjectCollectionRef {
  /**
   * Project collection description
   */
  val description: String

  /**
   * Project collection state
   */
  val state: String
}
