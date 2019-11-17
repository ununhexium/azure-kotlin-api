package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface TaskAgentCloudRequest {
  val agent: TaskAgentReference

  val agentCloudId: Int

  val agentConnectedTime: String

  val agentData: JObject

  val agentSpecification: JObject

  val pool: TaskAgentPoolReference

  val provisionedTime: String

  val provisionRequestTime: String

  val releaseRequestTime: String

  val requestId: String
}
