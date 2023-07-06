package ru.gazprom.gptrans.signatury.screen.etrconnectoption;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.EtrConnectOption;

@UiController("sign_EtrConnectOption.browse")
@UiDescriptor("etr-connect-option-browse.xml")
@LookupComponent("etrConnectOptionsTable")
public class EtrConnectOptionBrowse extends StandardLookup<EtrConnectOption> {
}