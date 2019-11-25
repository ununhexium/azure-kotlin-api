package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface ServerExecutionDefinition {
  val events: EventsConfig

  val handlerName: String
}
