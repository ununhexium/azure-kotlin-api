package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.String

interface DeploymentCompletedEvent {
  val comment: String

  val data: JsonObject

  val deployment: Deployment

  val environment: ReleaseEnvironment

  val project: ProjectReference
}
