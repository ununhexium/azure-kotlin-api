package net.lab0.azure.core.model.definition

import javax.json.JsonObject

/**
 * Represents a Team Project object.
 */
interface TeamProject : TeamProjectReference {
  val _links: ReferenceLinks

  /**
   * Set of capabilities this project has (such as process template & version control).
   */
  val capabilities: JsonObject

  val defaultTeam: WebApiTeamRef
}
