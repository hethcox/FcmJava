package de.bytefish.fcmjava.requests.builders;

import de.bytefish.fcmjava.requests.notification.CNTNotificationPayload;

public class CNTNotificationPayloadBuilder extends NotificationPayloadBuilder {
    protected String cntId;

    public CNTNotificationPayloadBuilder setCntId(String cntId) {
        this.cntId = cntId;
        return this;
    }

    public CNTNotificationPayload build() {
        return new CNTNotificationPayload(
                title,
                body,
                icon,
                sound,
                badge,
                tag,
                color,
                clickAction,
                bodyLocKey,
                bodyLocKeyArgs,
                titleLocKey,
                titleLocKeyArgs,
                androidChannelId,
                cntId);
    }

}
