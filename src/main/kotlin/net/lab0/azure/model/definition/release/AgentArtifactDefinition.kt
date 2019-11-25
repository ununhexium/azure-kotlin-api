package net.lab0.azure.model.definition.release

import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.AgentArtifactType

interface AgentArtifactDefinition {
  val alias: String

  val artifactType: AgentArtifactType

  val details: String

  val name: String

  val version: String
}
