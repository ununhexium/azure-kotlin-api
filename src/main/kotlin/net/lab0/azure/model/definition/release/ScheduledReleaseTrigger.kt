package net.lab0.azure.model.definition.release

interface ScheduledReleaseTrigger : ReleaseTriggerBase {
  val schedule: ReleaseSchedule
}
