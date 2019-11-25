package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface RealtimeReleaseDefinitionEvent {
  val definitionId: Int

  val projectId: String
}
