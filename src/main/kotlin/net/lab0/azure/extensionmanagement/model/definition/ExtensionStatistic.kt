package net.lab0.azure.extensionmanagement.model.definition

import javax.json.JsonNumber
import kotlin.String

interface ExtensionStatistic {
  val statisticName: String

  val value: JsonNumber
}
