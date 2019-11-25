package net.lab0.azure.model.definition.release

import net.lab0.azure.model.definition.enumeration.release.ReleaseTriggerType

interface ReleaseTriggerBase {
  val triggerType: ReleaseTriggerType
}
