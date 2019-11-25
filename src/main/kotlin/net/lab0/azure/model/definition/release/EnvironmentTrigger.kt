package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.EnvironmentTriggerType

interface EnvironmentTrigger {
  val definitionEnvironmentId: Int

  val releaseDefinitionId: Int

  val triggerContent: String

  val triggerType: EnvironmentTriggerType
}
