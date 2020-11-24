package logic;

import logicRAD.Matriz;

public class Recurrencia {

    public static double[] obtenerResultados(double[] raices, double[] n, double[] fN) {

        //plantea el sistema de ecuaciones y lo resuelve
        double[][] sistema = new double[raices.length][1+ raices.length];

        for(int i=0; i<raices.length; i++){
            for(int j=0; j<raices.length+1; j++){
                if(j<raices.length){
                    sistema[i][j] = Math.pow(raices[j], n[i]);
                }else{
                    sistema[i][j] = fN[i];
                }
            }
        }

        double[] resultado = Matriz.gaussJordan(sistema);

        return resultado;
    }

}
