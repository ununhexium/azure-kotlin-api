package net.lab0.azure.model.definition.work

import kotlin.String

interface BoardReference {
  /**
   * Id of the resource
   */
  val id: String

  /**
   * Name of the resource
   */
  val name: String

  /**
   * Full http link to the resource
   */
  val url: String
}
