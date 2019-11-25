package net.lab0.azure.model.definition.taskagent

interface TaskAgentMinAgentVersionRequiredUpdate : TaskAgentUpdateReason {
  val jobDefinition: TaskOrchestrationOwner

  val jobOwner: TaskOrchestrationOwner

  val minAgentVersion: Demand
}
