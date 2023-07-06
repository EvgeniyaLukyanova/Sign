package ru.gazprom.gptrans.signatury.screen.doctype;

import io.jmix.ui.screen.*;
import ru.gazprom.gptrans.signatury.entity.DocType;

@UiController("sign_DocTYpe.browse")
@UiDescriptor("doc-t-ype-browse.xml")
@LookupComponent("docTYpesTable")
public class DocTYpeBrowse extends StandardLookup<DocType> {
}