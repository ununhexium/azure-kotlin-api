package net.lab0.azure.release.model.definition

import net.lab0.azure.release.model.definition.enumeration.ReleaseTriggerType

interface ReleaseTriggerBase {
  val triggerType: ReleaseTriggerType
}
