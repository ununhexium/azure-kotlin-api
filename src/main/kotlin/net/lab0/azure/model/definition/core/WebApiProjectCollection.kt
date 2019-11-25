package net.lab0.azure.model.definition.core

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
