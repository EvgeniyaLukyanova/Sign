package ru.gazprom.gptrans.signatury.screen.ecpdoctype;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.ECPDocType;

@UiController("sign_ECPDocType.edit")
@UiDescriptor("ecp-doc-type-edit.xml")
@EditedEntityContainer("eCPDocTypeDc")
public class ECPDocTypeEdit extends StandardEditor<ECPDocType> {
}