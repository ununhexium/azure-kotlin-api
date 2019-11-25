package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.taskagent.TaskResult

interface TaskAgentJobRequest {
  val agentDelays: List<TaskAgentDelaySource>

  val agentSpecification: JObject

  val assignTime: String

  val data: JsonObject

  val definition: TaskOrchestrationOwner

  val demands: List<Demand>

  val expectedDuration: String

  val finishTime: String

  val hostId: String

  val jobId: String

  val jobName: String

  val lockedUntil: String

  val matchedAgents: List<TaskAgentReference>

  val orchestrationId: String

  val owner: TaskOrchestrationOwner

  val planGroup: String

  val planId: String

  val planType: String

  val poolId: Int

  val queueId: Int

  val queueTime: String

  val receiveTime: String

  val requestId: Int

  val reservedAgent: TaskAgentReference

  val result: TaskResult

  val scopeId: String

  val serviceOwner: String
}
