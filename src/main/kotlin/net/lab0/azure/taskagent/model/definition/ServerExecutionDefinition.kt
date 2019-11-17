package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface ServerExecutionDefinition {
  val events: EventsConfig

  val handlerName: String
}
