package net.lab0.azure.wiki.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.wiki.model.definition.WikiPageMoveParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PageMovesApi {
  /**
   * Creates a page move operation that updates the path and order of the page as provided in the
   * parameters.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param wikiIdentifier Wiki Id or name.
   * @param comment Comment that is to be associated with this page move.
   */
  @POST("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}/pagemoves")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Query("comment") comment: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: WikiPageMoveParameters
  ): Call<JsonValue>
}
