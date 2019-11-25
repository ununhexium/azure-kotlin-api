package net.lab0.azure.api.tfvc.shelvesetchanges

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ShelvesetChangesApi {
  /**
   * Get changes included in a shelveset.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param shelvesetId Shelveset's unique ID
   * @param top Max number of changes to return
   * @param skip Number of changes to skip
   */
  @GET("/{organization}/_apis/tfvc/shelvesets/changes")
  fun getShelvesetChanges(
    @Path("organization") organization: String,
    @Query("shelvesetId") shelvesetId: String,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
