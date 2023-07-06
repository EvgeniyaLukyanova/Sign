package ru.gazprom.gptrans.signatury.screen.eventlog;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.EventLog;

@UiController("sign_EventLog.browse")
@UiDescriptor("event-log-browse.xml")
@LookupComponent("eventLogsTable")
public class EventLogBrowse extends StandardLookup<EventLog> {
}