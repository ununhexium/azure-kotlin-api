package net.lab0.azure.model.definition.core

import javax.json.JsonObject

interface WebApiProject : TeamProjectReference {
  /**
   * Set of capabilities this project has
   */
  val capabilities: JsonObject

  val collection: WebApiProjectCollectionRef

  val defaultTeam: WebApiTeamRef
}
