package net.lab0.azure.model.definition.wiki

/**
 * Wiki creation parameters.
 */
interface WikiCreateParametersV2 : WikiCreateBaseParameters {
  val version: GitVersionDescriptor
}
