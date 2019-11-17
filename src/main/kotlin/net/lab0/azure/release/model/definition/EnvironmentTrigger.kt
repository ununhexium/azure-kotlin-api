package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.EnvironmentTriggerType

interface EnvironmentTrigger {
  val definitionEnvironmentId: Int

  val releaseDefinitionId: Int

  val triggerContent: String

  val triggerType: EnvironmentTriggerType
}
