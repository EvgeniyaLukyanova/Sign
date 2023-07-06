package ru.gazprom.gptrans.signatury.screen.etrconnectoption;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.EtrConnectOption;

@UiController("sign_EtrConnectOption.edit")
@UiDescriptor("etr-connect-option-edit.xml")
@EditedEntityContainer("etrConnectOptionDc")
public class EtrConnectOptionEdit extends StandardEditor<EtrConnectOption> {
}