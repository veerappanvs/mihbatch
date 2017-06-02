package com.ehs.mihonline.pdfform;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.*;
import java.util.*;

public class PdfFormReader {

    public static Map<String, String> listFields(PDDocument doc) throws Exception {
        PDDocumentCatalog catalog = doc.getDocumentCatalog();
        PDAcroForm form = catalog.getAcroForm();
        Map<String, String> formKeyValue = new HashMap<String, String>();
     
        
        /* List<PDFieldTreeNode> fields = form.getFields();

        for(PDFieldTreeNode field: fields) {
            Object value = field.getValue();
            String name = field.getFullyQualifiedName();
            System.out.print(name);
            System.out.print(" = ");
            System.out.print(value);
            System.out.println();
        }*/
        
         Iterator<PDField>  it = form.getFieldIterator() ;
         while (it.hasNext()) {
        	PDField pf = it.next();
        	System.out.println(pf.getFieldType() + "->" + pf.getFullyQualifiedName()  + " = "+pf.getValueAsString());
        	formKeyValue.put(pf.getFullyQualifiedName(), pf.getValueAsString());
        	
        }
        return formKeyValue;
    }

}