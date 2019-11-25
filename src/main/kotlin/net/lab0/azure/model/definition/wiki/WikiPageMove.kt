package net.lab0.azure.model.definition.wiki

/**
 * Request contract for Wiki Page Move.
 */
interface WikiPageMove : WikiPageMoveParameters {
  val page: WikiPage
}
