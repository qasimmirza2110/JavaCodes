package week1;

public class area_of_2_Rectangles {
    public static void main(String[] args) {
                int length1 = 10;
                int width1 = 5;
                int area1 = length1 * width1;
                int length2 = 8;
                int width2 = 8;
                int area2 = length2 * width2;
                System.out.println("Rectangle 1: Length = " + length1 + ", Width = " + width1 + ", Area = " + area1);
                System.out.println("Rectangle 2: Length = " + length2 + ", Width = " + width2 + ", Area = " + area2);
               String result;
                if (area1 > area2) {
                    result = "Rectangle 1 is larger.";
                } else if (area1 < area2) {
                    result = "Rectangle 2 is larger.";
                } else {
                    result = "Both rectangles are equal.";
                }
                System.out.println("Result: " + result);
            }
        }

