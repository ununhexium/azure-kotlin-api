package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface ArtifactTypeDefinition {
  val artifactTriggerConfiguration: ArtifactTriggerConfiguration

  val artifactType: String

  val displayName: String

  val endpointTypeId: String

  val inputDescriptors: List<InputDescriptor>

  val name: String

  val uniqueSourceIdentifier: String
}
