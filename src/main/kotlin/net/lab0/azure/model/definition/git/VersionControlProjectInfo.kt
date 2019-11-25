package net.lab0.azure.model.definition.git

import kotlin.Boolean
import net.lab0.azure.model.definition.enumeration.git.SourceControlTypes

interface VersionControlProjectInfo {
  val defaultSourceControlType: SourceControlTypes

  val project: TeamProjectReference

  val supportsGit: Boolean

  val supportsTFVC: Boolean
}
