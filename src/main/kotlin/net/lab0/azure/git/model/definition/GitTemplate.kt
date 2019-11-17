package net.lab0.azure.git.model.definition

import kotlin.String

interface GitTemplate {
  /**
   * Name of the Template
   */
  val name: String

  /**
   * Type of the Template
   */
  val type: String
}
