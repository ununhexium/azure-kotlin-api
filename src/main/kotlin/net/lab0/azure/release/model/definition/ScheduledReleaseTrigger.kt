package net.lab0.azure.release.model.definition

interface ScheduledReleaseTrigger : ReleaseTriggerBase {
  val schedule: ReleaseSchedule
}
