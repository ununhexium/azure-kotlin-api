package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.String

interface DeploymentCompletedEvent {
  val comment: String

  val data: JsonObject

  val deployment: Deployment

  val environment: ReleaseEnvironment

  val project: ProjectReference
}
