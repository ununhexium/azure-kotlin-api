package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import net.lab0.azure.model.definition.enumeration.release.PullRequestSystemType

interface CodeRepositoryReference {
  val repositoryReference: JsonObject

  /**
   * It can have value as ‘GitHub’, ‘Vsts’.
   */
  val systemType: PullRequestSystemType
}
