package de.bytefish.fcmjava.requests.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.bytefish.fcmjava.requests.builders.CNTNotificationPayloadBuilder;
import de.bytefish.fcmjava.requests.builders.NotificationPayloadBuilder;

import java.util.List;

public class CNTNotificationPayload extends NotificationPayload {
    private final String cntId;

    public CNTNotificationPayload(String title, String body, String icon, String sound, String badge, String tag, String color,
                                  String clickAction, String bodyLocKey, List<String> bodyLocKeyArgs, String titleLocKey, List<String> titleLocKeyArgs,
                                  String androidChannelId, String cntId) {
        super(title,body,icon,sound,badge,tag,color, clickAction, bodyLocKey, bodyLocKeyArgs, titleLocKey, titleLocKeyArgs, androidChannelId);
        this.cntId = cntId;
    }

    @JsonProperty("cntId")
    public String getCNTId() {
        return cntId;
    }

    public static CNTNotificationPayloadBuilder builder() {
        return new CNTNotificationPayloadBuilder();
    }
}
