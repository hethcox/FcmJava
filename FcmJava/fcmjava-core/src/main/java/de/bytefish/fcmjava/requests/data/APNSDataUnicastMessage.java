package de.bytefish.fcmjava.requests.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.bytefish.fcmjava.model.options.FcmMessageOptions;
import de.bytefish.fcmjava.requests.notification.NotificationPayload;

import java.util.Map;

public class APNSDataUnicastMessage extends DataUnicastMessage {

    private Map<String,String> apnsPayload;

    public APNSDataUnicastMessage(FcmMessageOptions options, String to, Object data, NotificationPayload notification, Map<String,String> apnsPayload) {
        super(options, to,data, notification);
        this.apnsPayload = apnsPayload;

    }

    @Override
    @JsonProperty("apns")
    public Object getPayload() {
        return apnsPayload;
    }

}
