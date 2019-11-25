package net.lab0.azure.api.tfvc.labelitems

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LabelItemsApi {
  /**
   * Get items under a label.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param labelId Unique identifier of label
   * @param top Max number of items to return
   * @param skip Number of items to skip
   */
  @GET("/{organization}/_apis/tfvc/labels/{labelId}/items")
  fun getLabelItems(
    @Path("organization") organization: String,
    @Path("labelId") labelId: String,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
