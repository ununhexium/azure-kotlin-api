package net.lab0.azure.model.definition.core

import kotlin.String

interface WebApiTeamRef {
  /**
   * Team (Identity) Guid. A Team Foundation ID.
   */
  val id: String

  /**
   * Team name
   */
  val name: String

  /**
   * Team REST API Url
   */
  val url: String
}
