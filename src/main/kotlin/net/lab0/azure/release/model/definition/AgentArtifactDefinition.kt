package net.lab0.azure.release.model.definition

import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.AgentArtifactType

interface AgentArtifactDefinition {
  val alias: String

  val artifactType: AgentArtifactType

  val details: String

  val name: String

  val version: String
}
