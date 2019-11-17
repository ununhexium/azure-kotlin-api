package net.lab0.azure.taskagent.model.definition

import kotlin.Int

interface PackageVersion {
  val major: Int

  val minor: Int

  val patch: Int
}
