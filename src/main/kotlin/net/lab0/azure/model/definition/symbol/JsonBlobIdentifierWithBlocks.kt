package net.lab0.azure.model.definition.symbol

import kotlin.String
import kotlin.collections.List

interface JsonBlobIdentifierWithBlocks {
  val blockHashes: List<JsonBlobBlockHash>

  val identifierValue: List<String>
}
