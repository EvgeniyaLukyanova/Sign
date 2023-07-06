package ru.gazprom.gptrans.signatury.screen.docsettings;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.DocSettings;

@UiController("sign_DocSettings.browse")
@UiDescriptor("doc-settings-browse.xml")
@LookupComponent("docSettingsesTable")
public class DocSettingsBrowse extends StandardLookup<DocSettings> {
}