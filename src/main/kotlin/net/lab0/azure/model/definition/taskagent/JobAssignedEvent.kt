package net.lab0.azure.model.definition.taskagent

interface JobAssignedEvent : JobEvent {
  val request: TaskAgentJobRequest
}
