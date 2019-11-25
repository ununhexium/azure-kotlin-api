package net.lab0.azure.model.definition.release

import net.lab0.azure.model.definition.enumeration.release.PipelineProcessTypes

interface PipelineProcess {
  val type: PipelineProcessTypes
}
