package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String

interface RealtimeReleaseDefinitionEvent {
  val definitionId: Int

  val projectId: String
}
