package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject

interface SendJobResponse {
  val events: JobEventsConfig

  val variables: JsonObject
}
