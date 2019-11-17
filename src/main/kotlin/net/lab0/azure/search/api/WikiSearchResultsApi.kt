package net.lab0.azure.search.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.search.model.definition.WikiSearchRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WikiSearchResultsApi {
  /**
   * Provides a set of results for the search request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/search/wikisearchresults")
  fun fetchWikiSearchResults(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: WikiSearchRequest
  ): Call<JsonValue>
}
