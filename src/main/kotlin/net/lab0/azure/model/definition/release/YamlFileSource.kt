package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import net.lab0.azure.model.definition.enumeration.release.YamlFileSourceTypes

interface YamlFileSource {
  /**
   * Gets or sets definition reference. e.g.
   * {"project":{"id":"fed755ea-49c5-4399-acea-fd5b5aa90a6c","name":"myProject"},"definition":{"id":"1","name":"mybuildDefinition"},"connection":{"id":"1","name":"myConnection"}}
   */
  val sourceReference: JsonObject

  val type: YamlFileSourceTypes
}
