package net.lab0.azure.search.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.search.model.definition.WorkItemSearchRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemSearchResultsApi {
  /**
   * Provides a set of results for the search text.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/search/workitemsearchresults")
  fun fetchWorkItemSearchResults(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: WorkItemSearchRequest
  ): Call<JsonValue>
}
