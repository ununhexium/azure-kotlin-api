package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject

interface SendJobResponse {
  val events: JobEventsConfig

  val variables: JsonObject
}
