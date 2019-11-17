package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.taskagent.model.definition.enumeration.TaskResult
import net.lab0.azure.taskagent.model.definition.enumeration.TimelineRecordState

interface TimelineRecord {
  val attempt: Int

  val changeId: Int

  val currentOperation: String

  val details: TimelineReference

  val errorCount: Int

  val finishTime: String

  val id: String

  val identifier: String

  val issues: List<Issue>

  val lastModified: String

  val location: String

  val log: TaskLogReference

  val name: String

  val order: Int

  val parentId: String

  val percentComplete: Int

  val previousAttempts: List<TimelineAttempt>

  val refName: String

  val result: TaskResult

  val resultCode: String

  val startTime: String

  val state: TimelineRecordState

  val task: TaskReference

  val type: String

  val variables: JsonObject

  val warningCount: Int

  val workerName: String
}
