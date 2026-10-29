package ma.emsi.chibel.tp1chibel.llm;

/**
 * Contient la réponse extraite et les textes JSON de la requête et de la réponse (pour le mode debug).
 */
public record LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {
}