package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.String

interface DataSourceBinding {
  val callbackContextTemplate: String

  val callBackRequiredTemplate: String

  val dataSourceName: String

  val endpointId: String

  val endpointUrl: String

  val initialContextTemplate: String

  val parameters: JsonObject

  val requestContent: String

  val requestVerb: String

  val resultSelector: String

  val resultTemplate: String

  val target: String
}
