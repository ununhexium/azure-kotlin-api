package net.lab0.azure.wiki.model.definition

/**
 * Request contract for Wiki Page Move.
 */
interface WikiPageMove : WikiPageMoveParameters {
  val page: WikiPage
}
