// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.fcmjava.requests.notification;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.bytefish.fcmjava.model.options.FcmMessageOptions;
import de.bytefish.fcmjava.model.topics.Topic;
import de.bytefish.fcmjava.requests.FcmUnicastMessage;
import de.bytefish.fcmjava.requests.notification.NotificationPayload;

public class ExtendedNotificationUnicastMessage extends FcmUnicastMessage<Object> {

    private final Object data;
    private final NotificationPayload notification;

    public ExtendedNotificationUnicastMessage(FcmMessageOptions options, String to, Object data) {
        this(options, to, data, null);
    }

    public ExtendedNotificationUnicastMessage(FcmMessageOptions options, String to, NotificationPayload notification) {
        this(options, to, null, notification);
    }

    public ExtendedNotificationUnicastMessage(FcmMessageOptions options, String to, Object data, NotificationPayload notification) {
        super(options, to);

        this.data = data;
        this.notification = notification;
    }

    @Override
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPayload() {
        return data;
    }

    @JsonProperty("notification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotificationPayload getNotificationPayload() {
        return this.notification;
    }
}
