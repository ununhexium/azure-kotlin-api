package net.lab0.azure.tfvc.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.tfvc.model.definition.TfvcChangeset
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ChangesetsApi {
  /**
   * Create a new changeset.
   *
   * Accepts TfvcChangeset as JSON body
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/tfvc/changesets")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TfvcChangeset
  ): Call<JsonValue>
}
