package com.betek.backend7.sesion13;

public class EditorTexto {

    private Pila<String> undo;
    private String texto;

    public EditorTexto() {
        undo = new Pila<>();
        texto = "";
    }

    public void escribir(String texto) {
        this.texto += texto;
        undo.add(texto);
    }

    public String deshacer() {
        String oldText = undo.remove();
        texto = texto.substring(0, texto.length() - oldText.length());
        return oldText;
    }

    public String getTexto() {
        return texto;
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.escribir("Hola Mundo, ");
        editor.escribir("Carlos");
        System.out.println(editor.getTexto());
        String deshacer = editor.deshacer();
        System.out.println("Deshizo el texto: " + deshacer);
        System.out.println(editor.getTexto());
    }

}
