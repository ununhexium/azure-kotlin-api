package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface ArtifactContributionDefinition {
  val artifactTriggerConfiguration: ArtifactTriggerConfiguration

  val artifactType: String

  val artifactTypeStreamMapping: JsonObject

  val browsableArtifactTypeMapping: JsonObject

  val dataSourceBindings: List<DataSourceBinding>

  val displayName: String

  val downloadTaskId: String

  val endpointTypeId: String

  val inputDescriptors: List<InputDescriptor>

  val name: String

  val taskInputMapping: JsonObject

  val uniqueSourceIdentifier: String
}
