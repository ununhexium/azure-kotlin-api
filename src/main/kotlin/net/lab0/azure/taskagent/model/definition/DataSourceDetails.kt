package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface DataSourceDetails {
  val dataSourceName: String

  val dataSourceUrl: String

  val headers: List<AuthorizationHeader>

  val parameters: JsonObject

  val resourceUrl: String

  val resultSelector: String
}
