package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import net.lab0.azure.release.model.definition.enumeration.PullRequestSystemType

interface CodeRepositoryReference {
  val repositoryReference: JsonObject

  /**
   * It can have value as ‘GitHub’, ‘Vsts’.
   */
  val systemType: PullRequestSystemType
}
