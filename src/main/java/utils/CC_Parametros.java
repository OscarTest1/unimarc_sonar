package main.java.utils;

public interface CC_Parametros {
    String url = "https://www.saucedemo.com/";
    
    String nombreAutomatizador = "[Flujo-Automatizado]";
    String nombreProyecto = "[*Proyecto*]";
    
    String gloDir = "c://Estructura_Base//CC_Logs_2p//";
    
    //Archivo CSV con los datos de entrada
    int gloFilas = 3; //Total de Casos de Pruebas - NO incluye la fila 1 de Titulos
    int gloColumnas = 6;
    String gloNombreCSV = "CSVParametersCarritoCompras.csv";
    //Fin
}
