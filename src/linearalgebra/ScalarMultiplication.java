/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearalgebra;

/**
 *
 * @author samuel
 */
public class ScalarMultiplication {
    
    /**
     * Multiplies each matrix value by the scalar value
     * @param numMatrix 2D matrix of doubles
     * @param scalar Double scalar value
     */
    public static void multiplyMatrixByScalar(Double[][] numMatrix,
        Double scalar) {
        for(int i=0; i < numMatrix.length; i++) {
            for(int j=0; j < numMatrix[i].length; j++) {
                numMatrix[i][j] = numMatrix[i][j] * scalar;
            }
        }
    }
    
}
