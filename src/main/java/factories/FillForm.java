package factories;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import tasks.form.FillDocumentId;
import tasks.form.FillLastName;
import tasks.form.FillName;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FillForm {

    public static Performable withDocumentId(String documentId){
        return Tasks.instrumented(FillDocumentId.class, documentId);
    }

    public static Performable withName(String name){
        return Tasks.instrumented(FillName.class, name);
    }

    public static Performable withLastName(String lastname){
        return Tasks.instrumented(FillLastName.class, lastname);
    }

}
