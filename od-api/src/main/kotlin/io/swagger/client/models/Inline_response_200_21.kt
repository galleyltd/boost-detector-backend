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
 * 
 * @param id Numeric identifier for the hero object
 * @param name Dota hero command name, e.g. 'npc_dota_hero_antimage'
 * @param localized_name Hero name, e.g. 'Anti-Mage'
 * @param primary_attr Hero primary shorthand attribute name, e.g. 'agi'
 * @param attack_type Hero attack type, either 'Melee' or 'Ranged'
 * @param roles 
 */
data class Inline_response_200_21 (
    /* Numeric identifier for the hero object */
    val id: kotlin.Int? = null,
    /* Dota hero command name, e.g. 'npc_dota_hero_antimage' */
    val name: kotlin.String? = null,
    /* Hero name, e.g. 'Anti-Mage' */
    val localized_name: kotlin.String? = null,
    /* Hero primary shorthand attribute name, e.g. 'agi' */
    val primary_attr: kotlin.String? = null,
    /* Hero attack type, either 'Melee' or 'Ranged' */
    val attack_type: kotlin.String? = null,
    val roles: kotlin.Array<kotlin.String>? = null
) {

}
