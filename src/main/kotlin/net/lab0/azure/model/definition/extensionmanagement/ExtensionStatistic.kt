package net.lab0.azure.model.definition.extensionmanagement

import javax.json.JsonNumber
import kotlin.String

interface ExtensionStatistic {
  val statisticName: String

  val value: JsonNumber
}
