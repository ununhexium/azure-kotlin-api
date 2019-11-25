package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface TaskDefinition {
  val agentExecution: TaskExecution

  val author: String

  val category: String

  val contentsUploaded: Boolean

  val contributionIdentifier: String

  val contributionVersion: String

  val dataSourceBindings: List<DataSourceBinding>

  val definitionType: String

  val demands: List<Demand>

  val deprecated: Boolean

  val description: String

  val disabled: Boolean

  val execution: JsonObject

  val friendlyName: String

  val groups: List<TaskGroupDefinition>

  val helpMarkDown: String

  val hostType: String

  val iconUrl: String

  val id: String

  val inputs: List<TaskInputDefinition>

  val instanceNameFormat: String

  val minimumAgentVersion: String

  val name: String

  val outputVariables: List<TaskOutputVariable>

  val packageLocation: String

  val packageType: String

  val postJobExecution: JsonObject

  val preJobExecution: JsonObject

  val preview: Boolean

  val releaseNotes: String

  val runsOn: List<String>

  val satisfies: List<String>

  val serverOwned: Boolean

  val showEnvironmentVariables: Boolean

  val sourceDefinitions: List<TaskSourceDefinition>

  val sourceLocation: String

  val version: TaskVersion

  val visibility: List<String>
}
