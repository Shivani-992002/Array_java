import java.util.*;

 class BitOperation{
    public static void main(String args[])
    {
        //Binary and & operator-if both bits are one then only result will be one 
        System.out.println(5&6);//5 binary = 101 and 6= 110 output =100= 4 of decimal

        //Binary OR | operator-if any of the bits are one then result will be one
        System.out.println(5|6);//5 binary = 101 and 6= 110 output will be 111= 7 of decimal

        //Binary XOR ^ operator-if both bits are different then result will be one
        System.out.println(5^6);//5 binary = 101 and 6= 110 output will be 011= 3 of decimal

        //Binary one's complement-it act as a not operator 
        System.out.println(~5);//5 binary = 101 and ~5 will be 010=2 in decimal but because of MSb it will be -6

        //Binary left shift operator-it shift towards left and fill 0 from right side
        System.out.println(5<<2);//000101 after 2 shift it will be 010100 then decimal value will be 20
        //to calculate value of left shift formula is (a<<b)=a*(2^b)

        //Binary Right Shift operator-it shift toward right and fill 0 from left side 
        System.out.println(6>>1);//000110 after 1 shift toward right it will be 000011 and decimal value of it will be 3 
    }
}