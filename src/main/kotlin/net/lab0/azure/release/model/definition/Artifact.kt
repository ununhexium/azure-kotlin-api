package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String

interface Artifact {
  /**
   * Gets or sets alias.
   */
  val alias: String

  /**
   * Gets or sets definition reference. e.g.
   * {"project":{"id":"fed755ea-49c5-4399-acea-fd5b5aa90a6c","name":"myProject"},"definition":{"id":"1","name":"mybuildDefinition"},"connection":{"id":"1","name":"myConnection"}}
   */
  val definitionReference: JsonObject

  /**
   * Gets or sets as artifact is primary or not.
   */
  val isPrimary: Boolean

  val isRetained: Boolean

  /**
   * Gets or sets type. It can have value as 'Build', 'Jenkins', 'GitHub', 'Nuget', 'Team Build
   * (external)', 'ExternalTFSBuild', 'Git', 'TFVC', 'ExternalTfsXamlBuild'.
   */
  val type: String
}
