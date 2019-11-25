package net.lab0.azure.api.wiki.pagemoves

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.wiki.WikiPageMoveParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
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
  fun createPageMove(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Query("comment") comment: String? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WikiPageMoveParameters
  ): Call<JsonValue>
}
