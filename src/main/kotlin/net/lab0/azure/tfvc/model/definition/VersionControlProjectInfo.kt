package net.lab0.azure.tfvc.model.definition

import kotlin.Boolean
import net.lab0.azure.tfvc.model.definition.enumeration.SourceControlTypes

interface VersionControlProjectInfo {
  val defaultSourceControlType: SourceControlTypes

  val project: TeamProjectReference

  val supportsGit: Boolean

  val supportsTFVC: Boolean
}
