/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearalgebra;

import java.util.Objects;

/**
 *
 * @author samuel
 */
public class LinearAlgebra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] iA = {-1, 5};
        Integer[] iB = {2, 6};
        //Integer[] r = subtractVectors(iA, iB);
        //for(Integer i : r) {System.out.println(i);}
        //System.out.println(calculateVectorsInnerProduct(iA, iB));
        System.out.println(areVectorsOrthogonal(iA, iB));
        System.out.println(calculateAngleBetweenVectors(iA, iB));
    }
    
    /**
     * Multiplies each matrix value by the scalar
     * @param matrix 2D matrix of doubles
     * @param scalar Double scalar value
     */
    public static void multiplyMatrixByScalar(Integer[][] matrix,
        Integer scalar) {
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * scalar;
            }
        }
    }
    
    /**
     * Adds two vectors
     * @param v1 Array of Integers
     * @param v2 Array of Integers
     * @return Array of Integers representing the result of the vector addition,
     * or null if vectors are of different sizes or empty
     */
    public static Integer[] addVectors(Integer[] v1, Integer[] v2) {
        if(v1.length == v2.length && v1.length > 0 && v2.length > 0) {
            Integer[] rA = new Integer[v1.length];
            for(int i=0; i < v1.length; i++) {
                rA[i] = v1[i] + v2[i];
            }
            return rA;
        } else {
            return null;
        }
    }
    
    /**
     * Subtracts v2 from v1
     * @param v1 Array of Integers
     * @param v2 Array of Integers
     * @return Array of Integers representing the result of the
     * vector subtraction or null if vectors are of different sizes or empty
     */
    public static Integer[] subtractVectors(Integer[] v1, Integer[] v2) {
        if(v1.length == v2.length && v1.length > 0 && v2.length > 0) {
            Integer[] rA = new Integer[v1.length];
            for(int i=0; i < v1.length; i++) {
                rA[i] = v1[i] + (-1 * v2[i]);
            }
            return rA;
        } else {
            return null;
        }
    }
    
    /**
     * Calculates magnitude of a vector
     * @param v Array of Integers
     * @return Magnitude of a vector or null if the vector is empty
     */
    public static Double calculateMagnitude(Integer[] v) {
        if(v.length > 0) {
           int squareSum = 0;
           for(Integer i: v) {
               squareSum += i * i;
           }
           Double magnitude = Math.sqrt(new Double(squareSum));
           return magnitude;
        } else {
            return null;
        }
    }
    
    /**
     * 
     * @param v1 Array of Integers
     * @param v2 Array of Integers
     * @return Array of Integers representing the result of the
     * vector inner product or null if vectors are of different sizes or empty
     */
    public static Integer calculateVectorsInnerProduct(
        Integer[] v1, Integer[] v2) {
        if(v1.length == v2.length && v1.length > 0 && v2.length > 0) {
            Integer innerProduct = 0;
            for(int i=0; i < v1.length; i++) {
                innerProduct += v1[i] * v2[i];
            }
            return innerProduct;
        } else {
            return null;
        }
    }
    
    /**
     * 
     * @param v1 Array of Integers
     * @param v2 Array of Integers
     * @return false if vectors are not orthogonal. Also, false is returned
     * if the vectors aren't the same size.
     */
    public static boolean areVectorsOrthogonal(Integer[] v1, Integer[] v2) {
        Integer i = 0;
        return Objects.equals(calculateVectorsInnerProduct(v1, v2), i);
    }
    
    /**
     * 
     * @param v1 Array of Integers
     * @param v2 Array of Integers
     * @return Angle in radians found between the vectors v1 and v2 or null
     * if vectors aren't the same size or if either of the vector magnitudes is
     * zero.
     */
    public static Double calculateAngleBetweenVectors(
        Integer[] v1, Integer[] v2) {
        Integer ip = calculateVectorsInnerProduct(v1, v2);
        if(ip != null) {
            Double mv1 = calculateMagnitude(v1);
            Double mv2 = calculateMagnitude(v2);
            if(mv1 > 0 && mv2 > 0) {
                Double quotient = ip.doubleValue() / (mv1 * mv2);
                System.out.println(quotient);
                return Math.acos(quotient);
            }
        }
        return null;
    }
    
    
}
