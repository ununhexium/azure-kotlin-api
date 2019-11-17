package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AuthorizationHeader {
  /**
   * Gets or sets the name of authorization header.
   */
  val name: String

  /**
   * Gets or sets the value of authorization header.
   */
  val value: String
}
