package ru.gazprom.gptrans.signatury.screen.doctype;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.DocType;

@UiController("sign_DocTYpe.edit")
@UiDescriptor("doc-t-ype-edit.xml")
@EditedEntityContainer("docTYpeDc")
public class DocTYpeEdit extends StandardEditor<DocType> {
}