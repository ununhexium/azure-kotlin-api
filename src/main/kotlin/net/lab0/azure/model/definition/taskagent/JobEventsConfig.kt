package net.lab0.azure.model.definition.taskagent

interface JobEventsConfig : EventsConfig {
  val jobAssigned: JobEventConfig

  val jobCompleted: JobEventConfig

  val jobStarted: JobEventConfig
}
