package ru.gazprom.gptrans.signatury.screen.ecpdoctype;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.ECPDocType;

@UiController("sign_ECPDocType.browse")
@UiDescriptor("ecp-doc-type-browse.xml")
@LookupComponent("eCPDocTypesTable")
public class ECPDocTypeBrowse extends StandardLookup<ECPDocType> {
}