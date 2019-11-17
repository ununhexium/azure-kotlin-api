package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.TaskStatus

interface ReleaseTask {
  val agentName: String

  val finishTime: String

  val id: Int

  val issues: List<Issue>

  val lineCount: Int

  val logUrl: String

  val name: String

  val percentComplete: Int

  val rank: Int

  val resultCode: String

  val startTime: String

  val status: TaskStatus

  val task: WorkflowTaskReference

  val timelineRecordId: String
}
