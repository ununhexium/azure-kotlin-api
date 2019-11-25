package net.lab0.azure.model.definition.taskagent

interface ServerTaskRequestMessage : JobRequestMessage {
  val taskDefinition: TaskDefinition

  val taskInstance: TaskInstance
}
