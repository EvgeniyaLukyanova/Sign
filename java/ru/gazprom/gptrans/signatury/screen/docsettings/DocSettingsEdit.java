package ru.gazprom.gptrans.signatury.screen.docsettings;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.DocSettings;

@UiController("sign_DocSettings.edit")
@UiDescriptor("doc-settings-edit.xml")
@EditedEntityContainer("docSettingsDc")
public class DocSettingsEdit extends StandardEditor<DocSettings> {
}