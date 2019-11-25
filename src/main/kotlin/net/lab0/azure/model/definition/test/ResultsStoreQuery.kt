package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.String

interface ResultsStoreQuery {
  val dayPrecision: Boolean

  val queryText: String

  val teamProjectName: String

  val timeZone: String
}
