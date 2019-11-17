package net.lab0.azure.symbol.model.definition

import kotlin.String
import kotlin.collections.List

interface JsonBlobIdentifierWithBlocks {
  val blockHashes: List<JsonBlobBlockHash>

  val identifierValue: List<String>
}
