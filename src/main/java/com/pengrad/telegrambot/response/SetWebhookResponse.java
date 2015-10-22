package com.pengrad.telegrambot.response;

/**
 * stas
 * 8/11/15.
 */
public class SetWebhookResponse {

    private final boolean ok;
    private final boolean result;
    private final String description;

    public SetWebhookResponse(boolean ok, boolean result, String description) {
        this.ok = ok;
        this.result = result;
        this.description = description;
    }

    public boolean isOk() {
        return ok;
    }

    public boolean result() {
        return result;
    }

    public String description() {
        return description;
    }

    @Override
    public String toString() {
        return "SetWebhookResponse{" +
                "ok=" + ok +
                ", result=" + result +
                ", description='" + description + '\'' +
                '}';
    }
}