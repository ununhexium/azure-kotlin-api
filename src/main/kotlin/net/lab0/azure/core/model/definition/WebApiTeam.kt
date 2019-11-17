package net.lab0.azure.core.model.definition

import kotlin.String

interface WebApiTeam : WebApiTeamRef {
  /**
   * Team description
   */
  val description: String

  /**
   * Identity REST API Url to this team
   */
  val identityUrl: String

  val projectId: String

  val projectName: String
}
