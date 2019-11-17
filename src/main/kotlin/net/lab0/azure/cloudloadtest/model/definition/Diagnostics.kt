package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String

interface Diagnostics {
  val diagnosticStoreConnectionString: String

  val lastModifiedTime: String

  val relativePathToDiagnosticFiles: String
}
