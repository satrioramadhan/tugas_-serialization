/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

/**
 *
 * @author Ramadhaan
 */
import java.io.Serializable;

public class Test implements Serializable {
    private String regularField;
    private transient String transientField;
    private static String staticField;
    private final String finalField;

    public Test(String regularField, String transientField, String staticField, String finalField) {
        this.regularField = regularField;
        this.transientField = transientField;
        Test.staticField = staticField;
        this.finalField = finalField;
    }

    public String getRegularField() {
        return regularField;
    }

    public void setRegularField(String regularField) {
        this.regularField = regularField;
    }

    public String getTransientField() {
        return transientField;
    }

    public void setTransientField(String transientField) {
        this.transientField = transientField;
    }

    public static String getStaticField() {
        return staticField;
    }

    public static void setStaticField(String staticField) {
        Test.staticField = staticField;
    }

    public String getFinalField() {
        return finalField;
    }

    @Override
    public String toString() {
        return "Test{" +
                "regularField='" + regularField + '\'' +
                ", transientField='" + transientField + '\'' +
                ", staticField='" + staticField + '\'' +
                ", finalField='" + finalField + '\'' +
                '}';
    }
}
