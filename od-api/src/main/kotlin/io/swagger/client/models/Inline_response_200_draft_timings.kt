/**
* OpenDota API
* # Introduction The OpenDota API provides Dota 2 related data including advanced match data extracted from match replays.  **Beginning 2018-04-22, the OpenDota API is limited to 50,000 free calls per month and 60 requests/minute** We offer a Premium Tier with unlimited API calls and higher rate limits. Check out the [API page](https://www.opendota.com/api-keys) to learn more. 
*
* OpenAPI spec version: 17.6.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models


/**
 * draft_stage
 * @param order order
 * @param pick pick
 * @param active_team active_team
 * @param hero_id The ID value of the hero played
 * @param player_slot Which slot the player is in. 0-127 are Radiant, 128-255 are Dire
 * @param extra_time extra_time
 * @param total_time_taken total_time_taken
 */
data class Inline_response_200_draft_timings (
    /* order */
    val order: kotlin.Int? = null,
    /* pick */
    val pick: kotlin.Boolean? = null,
    /* active_team */
    val active_team: kotlin.Int? = null,
    /* The ID value of the hero played */
    val hero_id: kotlin.Int? = null,
    /* Which slot the player is in. 0-127 are Radiant, 128-255 are Dire */
    val player_slot: kotlin.Int? = null,
    /* extra_time */
    val extra_time: kotlin.Int? = null,
    /* total_time_taken */
    val total_time_taken: kotlin.Int? = null
) {

}
