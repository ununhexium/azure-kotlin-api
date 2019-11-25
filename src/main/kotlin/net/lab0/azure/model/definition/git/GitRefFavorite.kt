package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.RefFavoriteType

interface GitRefFavorite {
  val _links: ReferenceLinks

  val id: Int

  val identityId: String

  val name: String

  val repositoryId: String

  val type: RefFavoriteType

  val url: String
}
