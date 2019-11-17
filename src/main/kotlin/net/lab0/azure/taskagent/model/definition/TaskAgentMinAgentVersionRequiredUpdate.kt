package net.lab0.azure.taskagent.model.definition

interface TaskAgentMinAgentVersionRequiredUpdate : TaskAgentUpdateReason {
  val jobDefinition: TaskOrchestrationOwner

  val jobOwner: TaskOrchestrationOwner

  val minAgentVersion: Demand
}
