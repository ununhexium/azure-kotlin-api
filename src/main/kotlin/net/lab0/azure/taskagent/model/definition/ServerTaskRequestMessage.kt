package net.lab0.azure.taskagent.model.definition

interface ServerTaskRequestMessage : JobRequestMessage {
  val taskDefinition: TaskDefinition

  val taskInstance: TaskInstance
}
