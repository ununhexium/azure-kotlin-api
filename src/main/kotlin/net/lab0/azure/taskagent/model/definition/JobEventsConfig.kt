package net.lab0.azure.taskagent.model.definition

interface JobEventsConfig : EventsConfig {
  val jobAssigned: JobEventConfig

  val jobCompleted: JobEventConfig

  val jobStarted: JobEventConfig
}
