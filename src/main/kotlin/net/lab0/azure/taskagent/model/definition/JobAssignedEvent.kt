package net.lab0.azure.taskagent.model.definition

interface JobAssignedEvent : JobEvent {
  val request: TaskAgentJobRequest
}
